package com.sdercolin.vlabeler.ui.string

import androidx.compose.runtime.Composable
import com.sdercolin.vlabeler.ui.string.Language.*

enum class Strings {
    AppName,
    MenuFile,
    MenuFileNewProject,
    MenuFileOpen,
    MenuFileOpenRecent,
    MenuFileOpenRecentClear,
    MenuFileSave,
    MenuFileSaveAs,
    MenuFileProjectSetting,
    MenuFileImportProject,
    MenuFileReloadLabelFile,
    MenuFileReloadLabelFilePickFile,
    MenuFileReloadLabelFileDefault,
    MenuFileReloadLabelFileDefaultWithoutConfirmation,
    MenuFileExport,
    MenuFileExportOverwrite,
    MenuFileExportOverwriteAll,
    MenuFileInvalidateCaches,
    MenuFileClose,
    MenuEdit,
    MenuEditUndo,
    MenuEditRedo,
    MenuEditTools,
    MenuEditToolsCursor,
    MenuEditToolsScissors,
    MenuEditToolsPan,
    MenuEditToolsPlayback,
    MenuEditRenameEntry,
    MenuEditDuplicateEntry,
    MenuEditRemoveEntry,
    MenuEditMoveEntry,
    MenuEditToggleDone,
    MenuEditToggleStar,
    MenuEditEditTag,
    MenuEditEditEntryExtra,
    MenuEditMultipleEditMode,
    MenuEditEditModuleExtra,
    MenuView,
    MenuViewToggleMarker,
    MenuViewPinEntryList,
    MenuViewPinEntryListLocked,
    MenuViewToggleProperties,
    MenuViewToggleToolbox,
    MenuViewToggleTimescaleBar,
    MenuViewOpenSampleList,
    MenuViewVideo,
    MenuViewVideoOff,
    MenuViewVideoEmbedded,
    MenuViewVideoNewWindow,
    MenuNavigate,
    MenuNavigateOpenLocation,
    MenuNavigateOpenLocationRootDirectory,
    MenuNavigateOpenLocationModuleDirectory,
    MenuNavigateOpenLocationProjectLocation,
    MenuNavigateNextEntry,
    MenuNavigatePreviousEntry,
    MenuNavigateNextSample,
    MenuNavigatePreviousSample,
    MenuNavigateNextModule,
    MenuNavigatePreviousModule,
    MenuNavigateJumpToEntry,
    MenuNavigateJumpToModule,
    MenuNavigateScrollFit,
    MenuTools,
    MenuToolsBatchEdit,
    MenuToolsBatchEditQuickLaunchManager,
    MenuToolsBatchEditQuickLaunch,
    MenuToolsBatchEditShowDisabledItems,
    MenuToolsBatchEditManagePlugins,
    MenuToolsPrerender,
    MenuToolsSyncSample,
    MenuToolsRecycleMemory,
    MenuToolsFileNameNormalizer,
    MenuSettings,
    MenuSettingsPreferences,
    MenuSettingsLabelers,
    MenuSettingsTemplatePlugins,
    MenuSettingsTracking,
    MenuHelp,
    MenuHelpCheckForUpdates,
    MenuHelpOpenLogDirectory,
    MenuHelpIncludeInfoLog,
    MenuHelpOpenHomePage,
    MenuHelpOpenLatestRelease,
    MenuHelpOpenGitHub,
    MenuHelpJoinDiscord,
    MenuHelpAbout,
    CommonOkay,
    CommonApply,
    CommonCancel,
    CommonYes,
    CommonNo,
    CommonWarning,
    CommonError,
    CommonDetails,
    CommonOthers,
    CommonPrevious,
    CommonNext,
    CommonFinish,
    CommonSelect,
    CommonOpen,
    CommonSave,
    CommonInputErrorPromptNumber,
    CommonInputErrorPromptInteger,
    CommonInputErrorPromptNumberRange,
    CommonInputErrorPromptNumberMin,
    CommonInputErrorPromptNumberMax,
    CommonRootModuleName,
    StarterStart,
    StarterNewProject,
    StarterOpen,
    StarterRecent,
    StarterRecentEmpty,
    StarterRecentDeleted,
    StarterNewSampleDirectory,
    StarterNewWorkingDirectory,
    StarterNewProjectTitle,
    StarterNewProjectName,
    StarterNewProjectNameWarning,
    StarterNewCacheDirectory,
    StarterNewLabelerCategory,
    StarterNewLabeler,
    StarterNewTemplatePlugin,
    StarterNewTemplatePluginNone,
    StarterNewInputFile,
    StarterNewEncoding,
    StarterNewAutoExport,
    StarterNewAutoExportHelp,
    StarterNewWarningSelfConstructedLabelerWithTemplatePlugin,
    StarterNewDirectoryPage,
    StarterNewLabelerPage,
    StarterNewDataSourcePage,
    StarterNewContentType,
    StarterNewContentTypeDefault,
    StarterNewContentTypeFile,
    StarterNewContentTypePlugin,
    StarterNewAdvancedSettings,
    SampleListIncludedHeader,
    SampleListIncludedItemEntryCountSingle,
    SampleListIncludedItemEntryCountPlural,
    SampleListExcludedHeader,
    SampleListExcludedPlaceholder,
    SampleListEntryHeader,
    SampleListEntriesPlaceholderUnselected,
    SampleListEntriesPlaceholderNoEntry,
    SampleListEntriesPlaceholderNoEntryButton,
    SampleListCreateDefaultForAllButton,
    SampleListJumpToSelectedEntryButton,
    SampleListOpenSampleDirectoryButton,
    SampleListCurrentModuleLabel,
    SampleListSampleDirectoryLabel,
    SampleListSampleDirectoryRedirectButton,
    PrerendererModuleText,
    PrerendererModuleTextFinished,
    PrerendererSampleText,
    PrerendererSampleTextFinished,
    PrerendererChartText,
    PrerendererChartTextFinished,
    EditorRenderStatusLabel,
    ChooseSampleDirectoryDialogTitle,
    ChooseWorkingDirectoryDialogTitle,
    ChooseCacheDirectoryDialogTitle,
    ChooseInputFileDialogTitle,
    OpenProjectDialogTitle,
    SaveAsProjectDialogTitle,
    ImportDialogTitle,
    ExportDialogTitle,
    SetResolutionDialogDescription,
    SetEntryPropertyDialogDescription,
    AskIfSaveBeforeOpenDialogDescription,
    AskIfSaveBeforeExportDialogDescription,
    AskIfSaveBeforeCloseDialogDescription,
    AskIfSaveBeforeExitDialogDescription,
    InputEntryNameDialogDescription,
    InputEntryNameDuplicateDialogDescription,
    InputEntryNameCutFormerDialogDescription,
    InputEntryNameCutLatterDialogDescription,
    EditEntryNameDialogExistingError,
    EditEntryExtraDialogDescription,
    EditModuleExtraDialogDescription,
    MoveEntryDialogDescription,
    AskIfRemoveEntryDialogDescription,
    AskIfRemoveEntryLastDialogDescription,
    AskIfLoadAutoSavedProjectDialogDescription,
    AskIfRedirectSampleDirectoryDialogDescription,
    PluginDialogTitle,
    PluginDialogInfoAuthor,
    PluginDialogInfoVersion,
    PluginDialogInfoContact,
    PluginDialogDescriptionMin,
    PluginDialogDescriptionMax,
    PluginDialogDescriptionMinMax,
    PluginDialogExecute,
    PluginDialogImportFromSavedParams,
    PluginDialogImportFromSlot,
    PluginDialogEmptySlotName,
    PluginDialogImportFromFile,
    PluginDialogImportSuccess,
    PluginDialogImportFailure,
    PluginDialogExportToSavedParams,
    PluginDialogExportToSlot,
    PluginDialogExportToFile,
    PluginDialogExportSuccess,
    PluginDialogExportFailure,
    PluginEntrySelectorTextMatchTypeEquals,
    PluginEntrySelectorTextMatchTypeContains,
    PluginEntrySelectorTextMatchTypeStartsWith,
    PluginEntrySelectorTextMatchTypeEndsWith,
    PluginEntrySelectorTextMatchTypeRegex,
    PluginEntrySelectorNumberMatchTypeEquals,
    PluginEntrySelectorNumberMatchTypeGreaterThan,
    PluginEntrySelectorNumberMatchTypeGreaterThanOrEquals,
    PluginEntrySelectorNumberMatchTypeLessThan,
    PluginEntrySelectorNumberMatchTypeLessThanOrEquals,
    PluginEntrySelectorPreservedSubjectSample,
    PluginEntrySelectorPreservedSubjectName,
    PluginEntrySelectorPreservedSubjectTag,
    PluginEntrySelectorPreservedSubjectDone,
    PluginEntrySelectorPreservedSubjectStar,
    PluginEntrySelectorPreservedSubjectScript,
    PluginEntrySelectorComparerValue,
    PluginEntrySelectorPreviewSummaryError,
    PluginEntrySelectorPreviewSummaryInitializing,
    PluginEntrySelectorPreviewSummary,
    PluginEntrySelectorPlaceholder,
    PluginEntrySelectorExpressionTitle,
    PluginEntrySelectorExpressionDescription,
    EditorSubTitleMultiple,
    FailedToLoadSampleFileError,
    PluginRuntimeUnexpectedException,
    InvalidCreatedProjectException,
    InvalidOpenedProjectException,
    ProjectParseException,
    ProjectImportException,
    ProjectUpdateOnSampleException,
    InvalidEditedProjectException,
    CustomizableItemLoadingException,
    CustomizableItemRemovingException,
    VideoComponentInitializationException,
    VideoFileNotFoundExceptionTemplate,
    PluginRuntimeExceptionTemplate,
    ProjectConstructorRuntimeExceptionTemplate,
    PropertySetterRuntimeExceptionTemplate,
    PropertySetterUnexpectedRuntimeException,
    LabelerManagerTitle,
    LabelerManagerImportDialogTitle,
    TemplatePluginManagerTitle,
    TemplatePluginManagerImportDialogTitle,
    MacroPluginManagerTitle,
    MacroPluginManagerImportDialogTitle,
    MacroPluginReportDialogTitle,
    MacroPluginReportDialogCopy,
    CustomizableItemManagerRemoveItemConfirm,
    CustomizableItemManagerOpenDirectory,
    CustomizableItemManagerReload,
    CustomizableItemManagerLockedDescription,
    PreferencesEditorImport,
    PreferencesEditorImportDialogTitle,
    PreferencesEditorImportSuccess,
    PreferencesEditorImportFailure,
    PreferencesEditorExport,
    PreferencesEditorExportSuccess,
    PreferencesEditorExportFailure,
    PreferencesEditorExportDialogTitle,
    PreferencesEditorResetPage,
    PreferencesEditorResetAll,
    PreferencesCharts,
    PreferencesChartsDescription,
    PreferencesChartsCanvas,
    PreferencesChartsCanvasDescription,
    PreferencesChartsCanvasResolution,
    PreferencesChartsCanvasResolutionDescription,
    PreferencesChartsCanvasResolutionDefault,
    PreferencesChartsCanvasResolutionStep,
    PreferencesChartsMaxDataChunkSize,
    PreferencesChartsMaxDataChunkSizeDescription,
    PreferencesChartsWaveform,
    PreferencesChartsWaveformDescription,
    PreferencesChartsWaveformResampleDownTo,
    PreferencesChartsWaveformResampleDownToDescription,
    PreferencesChartsWaveformNormalize,
    PreferencesChartsWaveformNormalizeDescription,
    PreferencesChartsWaveformUnitSize,
    PreferencesChartsWaveformUnitSizeDescription,
    PreferencesChartsWaveformIntensityAccuracy,
    PreferencesChartsWaveformYAxisBlankRate,
    PreferencesChartsWaveformColor,
    PreferencesChartsWaveformBackgroundColor,
    PreferencesChartsSpectrogram,
    PreferencesChartsSpectrogramDescription,
    PreferencesChartsSpectrogramEnabled,
    PreferencesChartsSpectrogramHeight,
    PreferencesChartsSpectrogramPointDensity,
    PreferencesChartsSpectrogramPointDensityDescription,
    PreferencesChartsSpectrogramHopSize,
    PreferencesChartsSpectrogramHopSizeDescription,
    PreferencesChartsSpectrogramWindowSize,
    PreferencesChartsSpectrogramWindowSizeDescription,
    PreferencesChartsSpectrogramMelScaleStep,
    PreferencesChartsSpectrogramMaxFrequency,
    PreferencesChartsSpectrogramMinIntensity,
    PreferencesChartsSpectrogramMinIntensityInvalid,
    PreferencesChartsSpectrogramMaxIntensity,
    PreferencesChartsSpectrogramMaxIntensityInvalid,
    PreferencesChartsSpectrogramWindowType,
    PreferencesChartsSpectrogramColorPalette,
    PreferencesChartsSpectrogramColorPaletteDescription,
    PreferencesChartsSpectrogramUseHighAlphaContrast,
    PreferencesChartsSpectrogramUseHighAlphaContrastDescription,
    PreferencesChartsPower,
    PreferencesChartsPowerDescription,
    PreferencesChartsPowerEnabled,
    PreferencesChartsPowerMergeChannels,
    PreferencesChartsPowerHeight,
    PreferencesChartsPowerUnitSize,
    PreferencesChartsPowerUnitSizeDescription,
    PreferencesChartsPowerUnitSizeInvalid,
    PreferencesChartsPowerWindowSize,
    PreferencesChartsPowerWindowSizeInvalid,
    PreferencesChartsPowerMinPower,
    PreferencesChartsPowerMinPowerInvalid,
    PreferencesChartsPowerMaxPower,
    PreferencesChartsPowerMaxPowerInvalid,
    PreferencesChartsPowerIntensityAccuracy,
    PreferencesChartsPowerColor,
    PreferencesChartsPowerBackgroundColor,
    PreferencesChartsFundamental,
    PreferencesChartsFundamentalDescription,
    PreferencesChartsFundamentalEnabled,
    PreferencesChartsFundamentalHeight,
    PreferencesChartsFundamentalSemitoneResolution,
    PreferencesChartsFundamentalMinFundamental,
    PreferencesChartsFundamentalMinFundamentalInvalid,
    PreferencesChartsFundamentalMaxFundamental,
    PreferencesChartsFundamentalMaxFundamentalInvalid,
    PreferencesChartsFundamentalSemitoneSampleNum,
    PreferencesChartsFundamentalMaxHarmonicFrequency,
    PreferencesChartsFundamentalMaxHarmonicFrequencyInvalid,
    PreferencesChartsFundamentalDrawReferenceLine,
    PreferencesChartsFundamentalColor,
    PreferencesChartsFundamentalReferenceLineColor,
    PreferencesChartsFundamentalBackgroundColor,
    PreferencesChartsConversion,
    PreferencesChartsConversionDescription,
    PreferencesChartsConversionFFmpegPath,
    PreferencesChartsConversionFFmpegPathDescription,
    PreferencesChartsConversionFFmpegArgs,
    PreferencesChartsConversionFFmpegUseForWav,
    PreferencesKeymap,
    PreferencesKeymapDescription,
    PreferencesKeymapKeyAction,
    PreferencesKeymapKeyActionDescription,
    PreferencesKeymapMouseClickAction,
    PreferencesKeymapMouseClickActionDescription,
    PreferencesKeymapMouseScrollAction,
    PreferencesKeymapMouseScrollActionDescription,
    PreferencesKeymapEditDialogTitle,
    PreferencesKeymapEditDialogDescriptionMouseClick,
    PreferencesKeymapEditDialogDescriptionMouseScroll,
    PreferencesKeymapEditDialogConflictingLabel,
    PreferencesKeymapEditDialogConflictingWarning,
    PreferencesKeymapEditDialogConflictingWarningKeep,
    PreferencesKeymapEditDialogConflictingWarningRemove,
    PreferencesView,
    PreferencesViewDescription,
    PreferencesViewLanguage,
    PreferencesViewFontFamily,
    PreferencesViewFontFamilyDescription,
    PreferencesViewHideSampleExtension,
    PreferencesViewAppAccentColor,
    PreferencesViewAppAccentColorVariant,
    PreferencesViewPinnedEntryListPosition,
    PreferencesViewPositionLeft,
    PreferencesViewPositionRight,
    PreferencesViewPositionTop,
    PreferencesViewPositionBottom,
    PreferencesViewCornerPositionTopLeft,
    PreferencesViewCornerPositionTopRight,
    PreferencesViewCornerPositionCenterLeft,
    PreferencesViewCornerPositionCenterRight,
    PreferencesViewCornerPositionBottomLeft,
    PreferencesViewCornerPositionBottomRight,
    PreferencesFontSizeSmall,
    PreferencesFontSizeMedium,
    PreferencesFontSizeLarge,
    PreferencesFontSizeExtraLarge,
    PreferencesEditor,
    PreferencesEditorDescription,
    PreferencesEditorPlayerCursorColor,
    PreferencesEditorLockedDrag,
    PreferencesEditorLockedDragDescription,
    PreferencesEditorLockedDragUseLabeler,
    PreferencesEditorLockedDragUseStart,
    PreferencesEditorLockedDragNever,
    PreferencesEditorLockedSettingParameterWithCursor,
    PreferencesEditorLockedSettingParameterWithCursorDescription,
    PreferencesEditorNotes,
    PreferencesEditorNotesDescription,
    PreferencesEditorShowDone,
    PreferencesEditorShowStarred,
    PreferencesEditorShowTag,
    PreferencesEditorShowExtra,
    PreferencesEditorShowExtraDescription,
    PreferencesEditorPostEditAction,
    PreferencesEditorPostEditActionDescription,
    PreferencesEditorPostEditActionDone,
    PreferencesEditorPostEditActionNext,
    PreferencesEditorPostEditActionEnabled,
    PreferencesEditorPostEditActionTrigger,
    PreferencesEditorPostEditActionTriggerUseLabeler,
    PreferencesEditorPostEditActionTriggerUseStart,
    PreferencesEditorPostEditActionTriggerUseEnd,
    PreferencesEditorPostEditActionTriggerUseAny,
    PreferencesEditorPostEditActionUseDragging,
    PreferencesEditorPostEditActionUseDraggingDescription,
    PreferencesEditorPostEditActionUseCursorSet,
    PreferencesEditorPostEditActionUseCursorSetDescription,
    PreferencesEditorScissors,
    PreferencesEditorScissorsDescription,
    PreferencesEditorScissorsUseOnScreenScissors,
    PreferencesEditorScissorsUseOnScreenScissorsDescription,
    PreferencesEditorScissorsScissorsSubmitThreshold,
    PreferencesEditorScissorsScissorsSubmitThresholdDescription,
    PreferencesEditorScissorsColor,
    PreferencesEditorScissorsActionTargetNone,
    PreferencesEditorScissorsActionTargetFormer,
    PreferencesEditorScissorsActionTargetLatter,
    PreferencesEditorScissorsActionGoTo,
    PreferencesEditorScissorsActionAskForName,
    PreferencesEditorScissorsActionPlay,
    PreferencesEditorAutoScroll,
    PreferencesEditorAutoScrollDescription,
    PreferencesEditorAutoScrollOnLoadedNewSample,
    PreferencesEditorAutoScrollOnJumpedToEntry,
    PreferencesEditorAutoScrollOnSwitchedInMultipleEditMode,
    PreferencesEditorAutoScrollOnSwitched,
    PreferencesEditorContinuousLabelNames,
    PreferencesEditorContinuousLabelNamesDescription,
    PreferencesEditorContinuousLabelNamesColor,
    PreferencesEditorContinuousLabelNamesBackgroundColor,
    PreferencesEditorContinuousLabelNamesEditableBackgroundColor,
    PreferencesEditorContinuousLabelNamesSize,
    PreferencesEditorContinuousLabelNamesPosition,
    PreferencesPlayback,
    PreferencesPlaybackDescription,
    PreferencesPlaybackPlayOnDragging,
    PreferencesPlaybackPlayOnDraggingDescription,
    PreferencesPlaybackPlayOnDraggingEnabled,
    PreferencesPlaybackPlayOnDraggingRangeRadiusMillis,
    PreferencesPlaybackPlayOnDraggingEventQueueSize,
    PreferencesAutoSave,
    PreferencesAutoSaveDescription,
    PreferencesAutoSaveTarget,
    PreferencesAutoSaveTargetNone,
    PreferencesAutoSaveTargetProject,
    PreferencesAutoSaveTargetRecord,
    PreferencesAutoSaveIntervalSec,
    PreferencesHistory,
    PreferencesHistoryDescription,
    PreferencesHistoryMaxSize,
    PreferencesHistorySquashIndex,
    PreferencesHistorySquashIndexDescription,
    PreferencesMisc,
    PreferencesMiscDescription,
    PreferencesMiscUpdateChannel,
    PreferencesMiscUpdateChannelDescription,
    UpdateChannelStable,
    UpdateChannelPreview,
    PreferencesMiscUseCustomFileDialog,
    PreferencesMiscUseCustomFileDialogDescription,
    PreferencesMiscDangerZone,
    PreferencesMiscClearRecord,
    PreferencesMiscClearRecordDescription,
    PreferencesMiscClearRecordButton,
    PreferencesMiscClearRecordConfirmation,
    PreferencesMiscClearAppData,
    PreferencesMiscClearAppDataDescription,
    PreferencesMiscClearAppDataButton,
    PreferencesMiscClearAppDataConfirmation,
    ActionToggleSamplePlayback,
    ActionToggleEntryPlayback,
    ActionToggleScreenRangePlayback,
    ActionToggleVideoPopupEmbedded,
    ActionToggleVideoPopupNewWindow,
    ActionIncreaseResolution,
    ActionDecreaseResolution,
    ActionInputResolution,
    ActionCancelDialog,
    ActionScissorsCut,
    ActionSetValue1,
    ActionSetValue2,
    ActionSetValue3,
    ActionSetValue4,
    ActionSetValue5,
    ActionSetValue6,
    ActionSetValue7,
    ActionSetValue8,
    ActionSetValue9,
    ActionSetValue10,
    ActionSetProperty1,
    ActionSetProperty2,
    ActionSetProperty3,
    ActionSetProperty4,
    ActionSetProperty5,
    ActionSetProperty6,
    ActionSetProperty7,
    ActionSetProperty8,
    ActionSetProperty9,
    ActionSetProperty10,
    ActionQuickLaunch1,
    ActionQuickLaunch2,
    ActionQuickLaunch3,
    ActionQuickLaunch4,
    ActionQuickLaunch5,
    ActionQuickLaunch6,
    ActionQuickLaunch7,
    ActionQuickLaunch8,
    ActionMoveParameter,
    ActionMoveParameterWithPlaybackPreview,
    ActionMoveParameterIgnoringConstraints,
    ActionMoveParameterInvertingLocked,
    ActionPlayAudioSection,
    ActionPlayAudioUntilEnd,
    ActionPlayAudioUntilScreenEnd,
    ActionPlayAudioFromStart,
    ActionPlayAudioFromScreenStart,
    ActionPlayAudioRange,
    ActionPlayAudioRangeRepeat,
    ActionScrollCanvasLeft,
    ActionScrollCanvasRight,
    ActionZoomInCanvas,
    ActionZoomOutCanvas,
    ActionGoToNextEntry,
    ActionGoToPreviousEntry,
    ActionGoToNextSample,
    ActionGoToPreviousSample,
    CheckForUpdatesAlreadyUpdated,
    CheckForUpdatesFailure,
    UpdaterDialogSummaryDetailsLink,
    UpdaterDialogTitle,
    UpdaterDialogCurrentVersionLabel,
    UpdaterDialogLatestVersionLabel,
    UpdaterDialogStartDownloadButton,
    UpdaterDialogIgnoreButton,
    UpdaterDialogDownloadPositionLabel,
    UpdaterDialogChangeDownloadPositionButton,
    UpdaterDialogChooseDownloadPositionDialogTitle,
    AboutDialogTitle,
    AboutDialogCopyInfo,
    AboutDialogShowLicenses,
    LicenseDialogTitle,
    LicenseDialogLicenses,
    LoadProjectErrorLabelerNotFound,
    LoadProjectWarningLabelerCreated,
    LoadProjectWarningLabelerUpdated,
    LoadProjectWarningCacheDirReset,
    FilterStarred,
    FilterUnstarred,
    FilterStarIgnored,
    FilterDone,
    FilterUndone,
    FilterDoneIgnored,
    FilterLink,
    FilterLinked,
    ColorPickerDialogTitle,
    QuickLaunchManagerDialogTitle,
    QuickLaunchManagerDialogDescription,
    QuickLaunchManagerDialogHeaderTitle,
    QuickLaunchManagerDialogHeaderPlugin,
    QuickLaunchManagerDialogHeaderForceAskParams,
    QuickLaunchManagerDialogItemTitle,
    QuickLaunchManagerDialogOpenKeymap,
    TrackingSettingsDialogTitle,
    TrackingSettingsDialogDescription,
    TrackingSettingsDialogFirstTimeAlert,
    TrackingSettingsDialogEnabled,
    TrackingSettingsDialogTrackingIdLabel,
    ProjectSettingDialogTitle,
    ProjectSettingOutputFileLabel,
    ProjectSettingOutputFileHelperText,
    ProjectSettingOutputFileDisabledPlaceholder,
    ProjectSettingOutputFileSelectorDialogTitle,
    ProjectSettingAutoExportHelperText,
    ImportEntriesDialogTitle,
    ImportEntriesDialogItemSummaryTitle,
    ImportEntriesDialogItemTargetLabel,
    ImportEntriesDialogItemIncompatible,
    ImportEntriesDialogReplaceContent,
    ImportEntriesDialogReplaceContentDisabledDescription,
    EntrySampleSyncerModuleText,
    EntrySampleSyncerModuleTextFinished,
    EntrySampleSyncerSampleText,
    EntrySampleSyncerSampleTextFinished,
    FFmpegConverterException,
    AppRunningOnCompatibilityModeWarning,
    EntryFilterSetterDialogTitle,
    EntryFilterSetterDialogHeaderAny,
    EntryFilterSetterDialogHeaderName,
    EntryFilterSetterDialogHeaderSample,
    EntryFilterSetterDialogHeaderTag,
    EntryFilterSetterDialogHeaderStar,
    EntryFilterSetterDialogHeaderDone,
    FileNameNormalizerDialogTitle,
    FileNameNormalizerTitle,
    FileNameNormalizerDescription,
    FileNameNormalizerHandleFolderButton,
    FileNameNormalizerHandleFileContentButton,
    FileNameNormalizerHandleFolderSuccess,
    FileNameNormalizerHandleFileSuccess,
    FileNameNormalizerHandleFileNoChange,
    ReloadLabelDialogTitle,
    ReloadLabelDialogModuleNameTemplate,
    ReloadLabelDialogShowUnchanged,
    ReloadLabelDialogNotice,
    ReloadLabelDialogNoDiff,
    ReloadLabelDialogInheritNotes,
    ReloadLabelDialogInheritNotesDescription,
    ;

    fun get(language: Language): String = when (language) {
        English -> en()
        ChineseSimplified -> zhHans()
        Japanese -> ja()
        Korean -> ko()
    } ?: en()
}

@Composable
fun string(key: Strings, vararg params: Any?): String = stringCertain(key, LocalLanguage.current, *params)

fun stringStatic(key: Strings, vararg params: Any?): String = stringCertain(key, currentLanguage, *params)

fun stringCertain(key: Strings, language: Language, vararg params: Any?): String {
    val template = key.get(language)
    return template.format(*params)
}
