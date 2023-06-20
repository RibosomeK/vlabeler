package com.sdercolin.vlabeler.ui.string

import androidx.compose.runtime.Composable
import com.sdercolin.vlabeler.ui.string.Language.ChineseSimplified
import com.sdercolin.vlabeler.ui.string.Language.English
import com.sdercolin.vlabeler.ui.string.Language.Japanese

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
    MenuFileImport,
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
    MenuEditMultipleEditMode,
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
    MenuSettings,
    MenuSettingsPreferences,
    MenuSettingsLabelers,
    MenuSettingsTemplatePlugins,
    MenuSettingsTracking,
    MenuHelp,
    MenuHelpCheckForUpdates,
    MenuHelpOpenLogDirectory,
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
    PluginEntrySelectorComparerValue,
    PluginEntrySelectorPreviewSummaryError,
    PluginEntrySelectorPreviewSummaryInitializing,
    PluginEntrySelectorPreviewSummary,
    PluginEntrySelectorPlaceholder,
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
    VideoComponentInitializationException,
    VideoFileNotFoundExceptionTemplate,
    PluginRuntimeExceptionTemplate,
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
    PreferencesChartsSpectrogramMaxIntensity,
    PreferencesChartsSpectrogramWindowType,
    PreferencesChartsSpectrogramColorPalette,
    PreferencesChartsSpectrogramColorPaletteDescription,
    PreferencesChartsSpectrogramUseHighAlphaContrast,
    PreferencesChartsSpectrogramUseHighAlphaContrastDescription,
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
    PreferencesViewCornerPositionBottomLeft,
    PreferencesViewCornerPositionBottomRight,
    PreferencesFontSizeSmall,
    PreferencesFontSizeMedium,
    PreferencesFontSizeLarge,
    PreferencesEditor,
    PreferencesEditorDescription,
    PreferencesEditorPlayerCursorColor,
    PreferencesEditorPlayerLockedDrag,
    PreferencesEditorPlayerLockedDragDescription,
    PreferencesEditorPlayerLockedDragUseLabeler,
    PreferencesEditorPlayerLockedDragUseStart,
    PreferencesEditorPlayerLockedDragNever,
    PreferencesEditorPlayerLockedSettingParameterWithCursor,
    PreferencesEditorPlayerLockedSettingParameterWithCursorDescription,
    PreferencesEditorNotes,
    PreferencesEditorNotesDescription,
    PreferencesEditorShowDone,
    PreferencesEditorAutoDone,
    PreferencesEditorShowStarred,
    PreferencesEditorShowTag,
    PreferencesEditorScissors,
    PreferencesEditorScissorsDescription,
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
    ;

    fun get(language: Language): String = when (language) {
        English -> en()
        ChineseSimplified -> zhHans()
        Japanese -> ja()
    } ?: en()
}

@Composable
fun string(key: Strings, vararg params: Any?): String = stringCertain(key, LocalLanguage.current, *params)

fun stringStatic(key: Strings, vararg params: Any?): String = stringCertain(key, currentLanguage, *params)

fun stringCertain(key: Strings, language: Language, vararg params: Any?): String {
    val template = key.get(language)
    return template.format(*params)
}
