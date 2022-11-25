package com.sdercolin.vlabeler.video

import com.sdercolin.vlabeler.util.or

/**
 * Represents the logic to sync video playback with audio playback
 * and with itself
 */
enum class SyncOperation {
    Initialize,

    OpenWhenIdle,
    OpenDuringPlay,
    RecoverFromLastExit,

    PlayerStartPlay,
    PlayerPause,

    ChangeEmbeddingMode,
    ResizeWindow,

    Close,
    ;

    fun invoke(videoState: VideoState) {
        videoState.apply {
            log("performed ${ SyncOperation::class.simpleName } ${ this@SyncOperation }")
            when (this@SyncOperation) {
                Initialize -> {
                    videoPath.let {
                        require(it != null) {
                            "Video path not located, use one of options in " +
                                "${ FindVideoStrategy::class.qualifiedName } to locate video path"
                        }
                        videoPlayer.load(it).mute()
                    }
                }
                OpenWhenIdle -> coveredBy(RecoverFromLastExit)
                OpenDuringPlay -> {
                    val fallbackTime = lastSavedTime ?: 0
                    videoPlayer.startAt(audioPlayerCurrentTime() ?: fallbackTime).play()
                }
                RecoverFromLastExit -> {
                    // use play() because pause() causes bug; doesn't affect much
                    videoPlayer.startAt(lastSavedTime ?: 0).play()
                }

                PlayerStartPlay -> {
                    val fallbackTime = lastStartedTime()
                    require(fallbackTime != null) { "no time to play at" }
                    videoPlayer.startAt(audioPlayerCurrentTime().or(fallbackTime)).play()
                }
                PlayerPause -> {
                    videoPlayer.pause()
                }
                ChangeEmbeddingMode -> coveredBy(Initialize, OpenDuringPlay, RecoverFromLastExit)
                ResizeWindow -> { }

                Close -> {
                    saveTime()
                }
            }
        }
    }
}

private fun coveredBy(vararg others: SyncOperation): Nothing =
    throw IllegalArgumentException("This case is covered by $others, do not use it directly")
