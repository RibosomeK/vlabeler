// see https://github.com/JetBrains/compose-jb/pull/1738 for direct control of awt/swing
@file:Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")

package com.sdercolin.vlabeler.video
import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.awt.LocalLayerContainer
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.round
import java.awt.BorderLayout
import java.awt.Container
import javax.swing.JPanel

private lateinit var container: Container

/**
 * A lightweight version of androidx.compose.ui.awt.SwingPanel
 * used to display the video player. Slightly faster and fewer bugs
 */
@Composable
fun VideoCore(videoState: VideoState, modifier: Modifier) {
    val density = LocalDensity.current.density
    Box(
        modifier = modifier
            .onGloballyPositioned { childCoordinates ->
                videoState.log("applying resize...")

                val coordinates = childCoordinates.parentCoordinates!!
                val location = coordinates.localToWindow(Offset.Zero).round()
                val size = coordinates.size
                container.setBounds(
                    (location.x / density).toInt(),
                    (location.y / density).toInt(),
                    (size.width / density).toInt(),
                    (size.height / density).toInt(),
                )
                container.validate()
            },
    )

    val root = LocalLayerContainer.current
    DisposableEffect(Unit) {
        container = JPanel().apply {
            layout = BorderLayout()
            add(
                videoState.videoPlayer.mediaPlayerComponent?.component,
            )
            isVisible = true
        }
        root.add(container)

        onDispose {
            runCatching { root.remove(container) }
        }
    }
}
