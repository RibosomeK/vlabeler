@file:Suppress("REDUNDANT_ELSE_IN_WHEN")

package com.sdercolin.vlabeler.ui.string

import com.sdercolin.vlabeler.ui.string.Strings.*

fun Strings.zhHans(): String? = when (this) {
    AppName -> "vLabeler"
    LanguageDisplayName -> Language.ChineseSimplified.displayName
    MenuFile -> "文件"
    MenuFileNewProject -> "新建工程..."
    MenuFileOpen -> "打开..."
    MenuFileOpenRecent -> "打开最近使用"
    MenuFileOpenRecentClear -> "清除最近使用记录"
    MenuFileSave -> "保存"
    MenuFileSaveAs -> "另存为..."
    MenuFileExport -> "导出..."
    MenuFileInvalidateCaches -> "清除缓存"
    MenuFileClose -> "关闭"
    MenuEdit -> "编辑"
    MenuEditUndo -> "撤销"
    MenuEditRedo -> "重做"
    MenuEditTools -> "工具"
    MenuEditToolsCursor -> "光标"
    MenuEditToolsScissors -> "剪刀"
    MenuEditToolsPan -> "平移"
    MenuEditRenameEntry -> "编辑当前条目名..."
    MenuEditDuplicateEntry -> "创建当前条目的副本..."
    MenuEditRemoveEntry -> "删除当前条目"
    MenuEditToggleDone -> "对当前条目切换完成状态"
    MenuEditToggleStar -> "对当前条目切换星标状态"
    MenuEditEditTag -> "编辑当前条目的标签..."
    MenuEditMultipleEditMode -> "编辑所有互相连接的条目"
    MenuView -> "视图"
    MenuViewToggleMarker -> "显示参数控制线"
    MenuViewPinEntryList -> "固定条目列表"
    MenuViewPinEntryListLocked -> "禁止拖拽固定条目列表的边界"
    MenuViewToggleProperties -> "显示属性"
    MenuViewToggleToolbox -> "显示工具箱"
    MenuViewOpenSampleList -> "打开采样列表"
    MenuNavigate -> "导航"
    MenuNavigateNextEntry -> "下一个条目"
    MenuNavigatePreviousEntry -> "上一个条目"
    MenuNavigateNextSample -> "下一个采样"
    MenuNavigatePreviousSample -> "上一个采样"
    MenuNavigateJumpToEntry -> "跳转到条目..."
    MenuNavigateScrollFit -> "滚动至显示当前条目"
    MenuTools -> "工具"
    MenuToolsBatchEdit -> "批量编辑"
    MenuToolsBatchEditManagePlugins -> "管理插件..."
    MenuToolsPrerender -> "预渲染所有图表..."
    MenuSettings -> "设置"
    MenuSettingsPreferences -> "偏好设置..."
    MenuSettingsLabelers -> "标记器..."
    MenuSettingsTemplatePlugins -> "模板生成器..."
    MenuHelp -> "帮助"
    MenuHelpCheckForUpdates -> "检查更新..."
    MenuHelpOpenLogDirectory -> "打开日志目录"
    MenuHelpOpenLatestRelease -> "打开最新版本的发布页面"
    MenuHelpOpenGitHub -> "打开 GitHub 仓库页面"
    MenuHelpJoinDiscord -> "加入 Discord"
    MenuHelpAbout -> "关于"
    CommonOkay -> "确定"
    CommonApply -> "应用"
    CommonCancel -> "取消"
    CommonYes -> "是"
    CommonNo -> "否"
    CommonWarning -> "警告"
    CommonError -> "错误"
    CommonInputErrorPromptNumber -> "请输入一个数字。"
    CommonInputErrorPromptInteger -> "请输入一个整数。"
    CommonInputErrorPromptNumberRange -> "请输入一个介于 %s 与 %s 之间的数字。"
    CommonInputErrorPromptNumberMin -> "请输入一个不小于 %s 的数字。"
    CommonInputErrorPromptNumberMax -> "请输入一个不大于 %s 的数字。"
    StarterStart -> "开始"
    StarterNewProject -> "新建工程..."
    StarterOpen -> "打开..."
    StarterRecent -> "最近使用"
    StarterRecentEmpty -> "最近使用的工程将会显示在这里。"
    StarterRecentDeleted -> "该工程已被删除。"
    StarterNewSampleDirectory -> "采样目录"
    StarterNewWorkingDirectory -> "工程文件存放位置"
    StarterNewProjectTitle -> "新建工程"
    StarterNewProjectName -> "工程名"
    StarterNewProjectNameWarning -> "该工程文件已存在，继续创建工程将会覆盖它。"
    StarterNewCacheDirectory -> "缓存目录"
    StarterNewLabeler -> "标记器"
    StarterNewTemplatePlugin -> "模板生成器"
    StarterNewTemplatePluginNone -> "无"
    StarterNewInputFile -> "输入文件 (.%s)"
    StarterNewInputFilePlaceholder -> "（如留空，将根据标记器来创建默认模版）"
    StarterNewInputFileDisabled -> "当前选择的模版生成器不需要输入文件"
    StarterNewEncoding -> "编码"
    StarterNewAutoExport -> "自动导出"
    StarterNewAutoExportHelp -> "保存时，自动将工程覆盖导出到输入文件（如未指定输入文件，将自动导出到由标记器指定的位置）"
    SampleListIncludedHeader -> "工程中使用到的采样"
    SampleListIncludedItemEntryCountSingle -> "%d 条目"
    SampleListIncludedItemEntryCountPlural -> "%d 条目"
    SampleListExcludedHeader -> "工程中未使用到的采样"
    SampleListExcludedPlaceholder -> "采样目录中的所有采样文件都已被工程使用。"
    SampleListEntryHeader -> "条目"
    SampleListEntriesPlaceholderUnselected -> "在左边选择一个采样以查看其关联到的条目。"
    SampleListEntriesPlaceholderNoEntry -> "该采样没有关联到任何条目。"
    SampleListEntriesPlaceholderNoEntryButton -> "创建默认条目"
    SampleListJumpToSelectedEntryButton -> "跳转到选中的条目"
    SampleListOpenSampleDirectoryButton -> "打开采样目录"
    SampleListSampleDirectoryLabel -> "采样目录："
    SampleListSampleDirectoryRedirectButton -> "切换采样目录"
    PrerendererSampleText -> "渲染采样文件 %d/%d..."
    PrerendererSampleTextFinished -> "渲染采样文件 %d/%d... 完成"
    PrerendererChartText -> "渲染图表 %d/%d..."
    PrerendererChartTextFinished -> "渲染图表 %d/%d... 完成"
    EditorRenderStatusLabel -> "%d/%d 渲染中..."
    ChooseSampleDirectoryDialogTitle -> "选择采样目录"
    ChooseWorkingDirectoryDialogTitle -> "选择工程文件存放位置"
    ChooseCacheDirectoryDialogTitle -> "选择缓存目录"
    ChooseInputFileDialogTitle -> "选择输入文件"
    OpenProjectDialogTitle -> "打开工程"
    SaveAsProjectDialogTitle -> "另存为工程"
    ExportDialogTitle -> "导出工程"
    SetResolutionDialogDescription -> "请指定编辑器的画布分辨率（数据点数/像素）(%d ~ %d)"
    AskIfSaveBeforeOpenDialogDescription -> "有未保存的变更。是否要在打开新工程前保存变更？"
    AskIfSaveBeforeExportDialogDescription -> "有未保存的变更。是否要在导出前保存变更？"
    AskIfSaveBeforeCloseDialogDescription -> "有未保存的变更。是否要在关闭当前工程前保存变更？"
    AskIfSaveBeforeExitDialogDescription -> "有未保存的变更。是否要在退出前保存变更？"
    InputEntryNameDialogDescription -> "请输入条目名"
    InputEntryNameDuplicateDialogDescription -> "请输入新条目名"
    InputEntryNameCutFormerDialogDescription -> "请输入切割后的前一个条目名"
    InputEntryNameCutLatterDialogDescription -> "请输入切割后的后一个条目名"
    EditEntryNameDialogExistingError -> "该条目名已存在。"
    AskIfRemoveEntryDialogDescription -> "将要删除当前条目..."
    AskIfRemoveEntryLastDialogDescription ->
        "将要删除当前条目...\n" +
            "该条目是当前采样文件关联到的唯一条目。如果你想重新关联这个采样文件，请前往菜单 `视图` -> `采样列表`"
    AskIfLoadAutoSavedProjectDialogDescription -> "发现自动保存的工程文件。是否读取？该文件将会在您打开或创建别的工程时被删除。"
    AskIfRedirectSampleDirectoryDialogDescription -> "未找到该工程的采样目录(%s)。 是否要重定向到其他目录？"
    PluginDialogTitle -> "vLabeler - 插件"
    PluginDialogInfoAuthor -> "作者：%s"
    PluginDialogInfoVersion -> "版本：%d"
    PluginDialogInfoContact -> "联系作者"
    PluginDialogDescriptionMin -> "最小：%s"
    PluginDialogDescriptionMax -> "最大：%s"
    PluginDialogDescriptionMinMax -> "最小：%s，最大：%s"
    PluginDialogExecute -> "执行"
    PluginEntrySelectorTextMatchTypeEquals -> "等于"
    PluginEntrySelectorTextMatchTypeContains -> "包含"
    PluginEntrySelectorTextMatchTypeStartsWith -> "以...开始"
    PluginEntrySelectorTextMatchTypeEndsWith -> "以...结束"
    PluginEntrySelectorTextMatchTypeRegex -> "正则表达式"
    PluginEntrySelectorNumberMatchTypeEquals -> "="
    PluginEntrySelectorNumberMatchTypeGreaterThan -> ">"
    PluginEntrySelectorNumberMatchTypeGreaterThanOrEquals -> ">="
    PluginEntrySelectorNumberMatchTypeLessThan -> "<"
    PluginEntrySelectorNumberMatchTypeLessThanOrEquals -> "<="
    PluginEntrySelectorPreservedSubjectSample -> "采样名"
    PluginEntrySelectorPreservedSubjectName -> "条目名"
    PluginEntrySelectorPreservedSubjectTag -> "标签"
    PluginEntrySelectorPreservedSubjectDone -> "完成状态"
    PluginEntrySelectorPreservedSubjectStar -> "星标状态"
    PluginEntrySelectorComparerValue -> "输入值"
    PluginEntrySelectorPreviewSummaryError -> "输入值无效"
    PluginEntrySelectorPreviewSummaryInitializing -> "正在初始化..."
    PluginEntrySelectorPreviewSummary -> "选中 %d/%d"
    EditorSubTitleMultiple -> "编辑采样 %2\$s 中的%1\$d个条目"
    FailedToLoadSampleFileError -> "无法读取该采样文件。它可能不存在，或是不支持的格式。"
    EmptySampleDirectoryException -> "无法创建工程。采样目录中不存在任何采样文件。"
    PluginRuntimeUnexpectedException -> "插件执行过程中发生了意外的错误。请联系插件作者以获取更多信息。"
    InvalidCreatedProjectException -> "新建的工程为无效工程。请联系标记器或插件的作者以获取更多信息。"
    InvalidOpenedProjectException -> "无法打开该工程，因为其中包含无效的数据。详情请查看错误日志。"
    ProjectParseException -> "无法打开该工程。它可能已损坏，或者是由一个与当前版本不兼容的 vLabeler 版本创建的。"
    ProjectUpdateOnSampleException -> "无法将工程中的数据与当前读取到的采样进行匹配。详情请查看错误日志。"
    InvalidEditedProjectException -> "此次编辑将导致工程数据无效。详情请查看错误日志。"
    CustomizableItemLoadingException -> "无法读取该自定义组件。"
    PluginRuntimeExceptionTemplate -> "插件运行时错误：%s"
    LabelerManagerTitle -> "标记器"
    LabelerManagerImportDialogTitle -> "导入标记器"
    TemplatePluginManagerTitle -> "模板生成器"
    TemplatePluginManagerImportDialogTitle -> "导入模板生成器"
    MacroPluginManagerTitle -> "批量编辑插件"
    MacroPluginManagerImportDialogTitle -> "导入批量编辑插件"
    CustomizableItemManagerRemoveItemConfirm -> "确定要删除 \"%s\" 吗？该操作将从磁盘上删除相应的文件。"
    CustomizableItemManagerOpenDirectory -> "打开目录"
    CustomizableItemManagerReload -> "重新加载"
    CustomizableItemManagerLockedDescription -> "该组件是内建组件，无法删除。"
    PreferencesEditorImport -> "导入"
    PreferencesEditorImportDialogTitle -> "导入偏好设置"
    PreferencesEditorImportSuccess -> "导入成功。"
    PreferencesEditorImportFailure -> "无法导入该偏好设置文件。"
    PreferencesEditorExport -> "导出"
    PreferencesEditorExportSuccess -> "导出成功。"
    PreferencesEditorExportFailure -> "无法导出偏好设置到该文件。"
    PreferencesEditorExportDialogTitle -> "导出偏好设置"
    PreferencesEditorResetPage -> "重置该页的项目"
    PreferencesEditorResetAll -> "重置所有项目"
    PreferencesCharts -> "图表"
    PreferencesChartsDescription -> "编辑图表的渲染/显示。"
    PreferencesChartsCanvas -> "画布"
    PreferencesChartsCanvasDescription -> "编辑画布的基本设置。"
    PreferencesChartsCanvasResolution -> "画布分辨率"
    PreferencesChartsCanvasResolutionDescription ->
        "每个像素中包含的数据点的个数。" +
            "该数值与图表在屏幕上显示的范围所对应的时间长度成正比。"
    PreferencesChartsCanvasResolutionDefault -> "默认分辨率"
    PreferencesChartsCanvasResolutionStep -> "步长"
    PreferencesChartsMaxDataChunkSize -> "最大数据块大小"
    PreferencesChartsMaxDataChunkSizeDescription ->
        "一个图表数据块所能包含的最大数据点数。" +
            "该数值越大，图表在渲染过程中将被切分成越少的块。"
    PreferencesChartsWaveform -> "波形图"
    PreferencesChartsWaveformDescription -> "编辑波形图的渲染设置。"
    PreferencesChartsWaveformResampleDownTo -> "最大采样率（Hz）"
    PreferencesChartsWaveformResampleDownToDescription ->
        "超过该采样率的音频文件将被降采样至该数值(原文件不会被更改)。" +
            "您可以将其设为0来禁止降采样。"
    PreferencesChartsWaveformNormalize -> "音频标准化"
    PreferencesChartsWaveformUnitSize -> "点数/像素"
    PreferencesChartsWaveformUnitSizeDescription -> "该数值与图像质量成反比。"
    PreferencesChartsWaveformIntensityAccuracy -> "图像高度（像素）"
    PreferencesChartsWaveformYAxisBlankRate -> "纵向空白填充（%%）"
    PreferencesChartsWaveformColor -> "前景色"
    PreferencesChartsWaveformBackgroundColor -> "背景色"
    PreferencesChartsSpectrogram -> "频谱图"
    PreferencesChartsSpectrogramDescription -> "编辑频谱图的渲染设置。"
    PreferencesChartsSpectrogramEnabled -> "启用频谱图"
    PreferencesChartsSpectrogramHeight -> "相对于波形图的高度（%%）"
    PreferencesChartsSpectrogramPointDensity -> "点数/像素"
    PreferencesChartsSpectrogramPointDensityDescription -> "该数值与图像质量成反比。"
    PreferencesChartsSpectrogramHopSize -> "FFT 间隔"
    PreferencesChartsSpectrogramHopSizeDescription -> "该数值会根据音频文件的采样率自动调整。"
    PreferencesChartsSpectrogramWindowSize -> "窗长"
    PreferencesChartsSpectrogramWindowSizeDescription -> "该数值会根据音频文件的采样率自动调整。"
    PreferencesChartsSpectrogramMelScaleStep -> "频率分辨率（mel）"
    PreferencesChartsSpectrogramMaxFrequency -> "最大显示频率（Hz）"
    PreferencesChartsSpectrogramMinIntensity -> "最小显示强度（dB）"
    PreferencesChartsSpectrogramMaxIntensity -> "最大显示强度（dB）"
    PreferencesChartsSpectrogramWindowType -> "窗函数"
    PreferencesChartsSpectrogramColorPalette -> "颜色"
    PreferencesKeymap -> "键位映射"
    PreferencesKeymapDescription -> "编辑键盘/鼠标操作的键位映射。"
    PreferencesKeymapKeyAction -> "键盘操作"
    PreferencesKeymapKeyActionDescription -> "编辑键盘操作的键位映射。"
    PreferencesKeymapMouseClickAction -> "鼠标点击操作"
    PreferencesKeymapMouseClickActionDescription ->
        "编辑鼠标点击操作的键位映射。\n" +
            "这些操作只有对应的键位组合全部被按下时才会被触发。"
    PreferencesKeymapMouseScrollAction -> "鼠标滚轮操作"
    PreferencesKeymapMouseScrollActionDescription ->
        "编辑鼠标滚轮操作的键位映射。\n" +
            "这些操作只有对应的键位组合全部被按下时才会被触发。"
    PreferencesKeymapEditDialogTitle -> "编辑键位映射："
    PreferencesKeymapEditDialogDescriptionMouseClick -> "通过在该输入框上左键/右键单击来输入对应键位。"
    PreferencesKeymapEditDialogDescriptionMouseScroll -> "通过在该输入框上滚动鼠标滚轮来输入对应键位。"
    PreferencesKeymapEditDialogConflictingLabel -> "该键位已被以下操作占用："
    PreferencesKeymapEditDialogConflictingWarning -> "该键位组合已被分配到其他动作。是否要移除其他分配？"
    PreferencesKeymapEditDialogConflictingWarningKeep -> "保持"
    PreferencesKeymapEditDialogConflictingWarningRemove -> "移除"
    PreferencesView -> "视图"
    PreferencesViewDescription -> "编辑视图的外观。"
    PreferencesViewLanguage -> "语言"
    PreferencesViewAppAccentColor -> "应用程序主题色（亮色）"
    PreferencesViewAppAccentColorVariant -> "应用程序主题色（暗色）"
    PreferencesViewPinnedEntryListPosition -> "固定条目列表的位置"
    PreferencesViewPositionLeft -> "左侧"
    PreferencesViewPositionRight -> "右侧"
    PreferencesViewPositionTop -> "顶部"
    PreferencesViewPositionBottom -> "底部"
    PreferencesEditor -> "编辑器"
    PreferencesEditorDescription -> "编辑编辑器的外观与行为。"
    PreferencesEditorPlayerCursorColor -> "音频播放光标颜色"
    PreferencesEditorPlayerLockedDrag -> "锁定拖动"
    PreferencesEditorPlayerLockedDragDescription ->
        "选择启用锁定拖动的条件。" +
            "当锁定拖动有效，其他参数线将会跟随您拖动的参数线移动，以保持它们之间的相对位置。"
    PreferencesEditorPlayerLockedDragUseLabeler -> "使用标记器的定义"
    PreferencesEditorPlayerLockedDragUseStart -> "当拖动条目的起始线时"
    PreferencesEditorPlayerLockedDragNever -> "从不启用"
    PreferencesEditorNotes -> "备注"
    PreferencesEditorNotesDescription -> "编辑与条目备注（星标，完成，标签）相关的外观与行为。 "
    PreferencesEditorShowDone -> "显示\"完成\"状态"
    PreferencesEditorAutoDone -> "自动将已编辑的条目设置为\"已完成\""
    PreferencesEditorShowStarred -> "显示\"星标\"状态"
    PreferencesEditorShowTag -> "显示标签"
    PreferencesEditorScissors -> "剪刀"
    PreferencesEditorScissorsDescription -> "编辑剪刀工具的外观与行为。"
    PreferencesEditorScissorsColor -> "颜色"
    PreferencesEditorScissorsActionTargetNone -> "无"
    PreferencesEditorScissorsActionTargetFormer -> "前一个条目"
    PreferencesEditorScissorsActionTargetLatter -> "后一个条目"
    PreferencesEditorScissorsActionGoTo -> "切割后跳转至"
    PreferencesEditorScissorsActionAskForName -> "切割后重命名"
    PreferencesEditorScissorsActionPlay -> "切割时播放"
    PreferencesEditorAutoScroll -> "自动滚动"
    PreferencesEditorAutoScrollDescription -> "设置执行自动滚动的条件。"
    PreferencesEditorAutoScrollOnLoadedNewSample -> "切换采样时"
    PreferencesEditorAutoScrollOnJumpedToEntry -> "按绝对索义跳转至条目时"
    PreferencesEditorAutoScrollOnSwitchedInMultipleEditMode -> "在多重编辑模式下切换条目时"
    PreferencesEditorAutoScrollOnSwitched -> "切换条目时"
    PreferencesPlayback -> "播放"
    PreferencesPlaybackDescription -> "编辑音频播放的行为。"
    PreferencesPlaybackPlayOnDragging -> "预览播放"
    PreferencesPlaybackPlayOnDraggingDescription -> "当拖动参数线时，播放光标附近处的音频短片段。"
    PreferencesPlaybackPlayOnDraggingEnabled -> "启用"
    PreferencesPlaybackPlayOnDraggingRangeRadiusMillis -> "半径（毫秒）"
    PreferencesPlaybackPlayOnDraggingEventQueueSize -> "保留拖动事件的个数"
    PreferencesAutoSave -> "自动保存"
    PreferencesAutoSaveDescription -> "编辑自动保存工程的行为。"
    PreferencesAutoSaveTarget -> "自动保存到"
    PreferencesAutoSaveTargetNone -> "不自动保存"
    PreferencesAutoSaveTargetProject -> "覆盖工程文件"
    PreferencesAutoSaveTargetRecord -> "临时文件"
    PreferencesAutoSaveIntervalSec -> "间隔（秒）"
    PreferencesHistory -> "编辑历史"
    PreferencesHistoryDescription -> "编辑有关编辑历史（撤销/重做）的行为。"
    PreferencesHistoryMaxSize -> "最大保存的编辑次数"
    PreferencesHistorySquashIndex -> "压缩索引变更"
    PreferencesHistorySquashIndexDescription ->
        "当启用该项时，仅包含索引变更的操作（如切换条目），直到下一次包含内容变更的操作前，" +
            "将不会被保存在历史中。"
    ActionToggleSamplePlayback -> "播放/暂停当前采样"
    ActionToggleEntryPlayback -> "播放/暂停当前条目"
    ActionIncreaseResolution -> "缩小"
    ActionDecreaseResolution -> "放大"
    ActionInputResolution -> "输入画布分辨率"
    ActionCancelDialog -> "关闭对话框"
    ActionSetValue1 -> "将参数1设置到光标位置"
    ActionSetValue2 -> "将参数2设置到光标位置"
    ActionSetValue3 -> "将参数3设置到光标位置"
    ActionSetValue4 -> "将参数4设置到光标位置"
    ActionSetValue5 -> "将参数5设置到光标位置"
    ActionSetValue6 -> "将参数6设置到光标位置"
    ActionSetValue7 -> "将参数7设置到光标位置"
    ActionSetValue8 -> "将参数8设置到光标位置"
    ActionSetValue9 -> "将参数9设置到光标位置"
    ActionSetValue10 -> "将参数10设置到光标位置"
    ActionMoveParameter -> "拖动参数线"
    ActionMoveParameterWithPlaybackPreview -> "拖动参数线并执行预览播放"
    ActionMoveParameterIgnoringConstraints -> "拖动参数线（忽略约束）"
    ActionMoveParameterInvertingLocked -> "拖动参数线（反转锁定拖动）"
    ActionPlayAudioSection -> "播放点击位置的音频片段"
    ActionScrollCanvasLeft -> "向左滚动画布"
    ActionScrollCanvasRight -> "向右滚动画布"
    ActionZoomInCanvas -> "放大"
    ActionZoomOutCanvas -> "缩小"
    ActionGoToNextEntry -> "下一个条目"
    ActionGoToPreviousEntry -> "上一个条目"
    ActionGoToNextSample -> "下一个采样"
    ActionGoToPreviousSample -> "上一个采样"
    CheckForUpdatesAlreadyUpdated -> "已更新到最新版本。"
    CheckForUpdatesFailure -> "检查更新失败。"
    UpdaterDialogSummaryDetailsLink -> "查看详细信息"
    UpdaterDialogTitle -> "vLabeler - 检查更新"
    UpdaterDialogCurrentVersionLabel -> "当前版本：%s"
    UpdaterDialogLatestVersionLabel -> "最新版本：%s (%s)"
    UpdaterDialogStartDownloadButton -> "下载"
    UpdaterDialogIgnoreButton -> "忽略该版本"
    AboutDialogTitle -> "vLabeler - 关于"
    AboutDialogCopyInfo -> "复制信息"
    AboutDialogShowLicenses -> "显示许可"
    LicenseDialogTitle -> "vLabeler - 许可"
    LicenseDialogLicenses -> "vLabeler 使用到的开源许可"
    LoadProjectWarningLabelerCreated -> "从工程文件中安装了新的标记器 `%s`。"
    LoadProjectWarningLabelerUpdated -> "从工程文件中安装了标记器 `%1\$s` 的版本更新 `%2\$s`。"
    LoadProjectWarningCacheDirReset -> "无法找到/创建工程文件所定义的缓存目录。将使用默认的缓存目录。"
    FilterStarred -> "仅显示星标"
    FilterUnstarred -> "仅显示未星标"
    FilterStarIgnored -> "不筛选星标状态"
    FilterDone -> "仅显示已完成"
    FilterUndone -> "仅显示未完成"
    FilterDoneIgnored -> "不筛选完成状态"
    FilterLink -> "将筛选器应用到工程导航"
    FilterLinked -> "筛选器已应用到工程导航"
    ColorPickerDialogTitle -> "vLabeler - 选色器"
    else -> null
}
