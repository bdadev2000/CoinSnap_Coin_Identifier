package androidx.compose.foundation.text.selection;

import androidx.collection.LongIntMapKt;
import androidx.collection.LongObjectMap;
import androidx.collection.LongObjectMapKt;
import androidx.collection.MutableLongIntMap;
import androidx.collection.MutableLongObjectMap;
import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.foundation.text.input.internal.TextLayoutStateKt;
import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusChangedModifierKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.hapticfeedback.HapticFeedbackType;
import androidx.compose.ui.input.key.KeyEvent;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.platform.ClipboardManager;
import androidx.compose.ui.platform.TextToolbar;
import androidx.compose.ui.platform.TextToolbarStatus;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.unit.IntSize;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SelectionManager.kt */
@Metadata(d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010r\u001a\u00020O2\u0006\u0010s\u001a\u00020\u0018ø\u0001\u0000¢\u0006\u0004\bt\u0010$J\"\u0010u\u001a\u00020\u00182\u0006\u0010v\u001a\u00020\u00112\u0006\u0010w\u001a\u00020\u0018H\u0002ø\u0001\u0000¢\u0006\u0004\bx\u0010yJ\r\u0010z\u001a\u00020OH\u0000¢\u0006\u0002\b{J\u0018\u0010|\u001a\u0004\u0018\u00010}2\u0006\u0010~\u001a\u00020\u007fH\u0000¢\u0006\u0003\b\u0080\u0001J\f\u0010\u0081\u0001\u001a\u0005\u0018\u00010\u0082\u0001H\u0002J\u0012\u0010\u0083\u0001\u001a\u0005\u0018\u00010\u0084\u0001H\u0000¢\u0006\u0003\b\u0085\u0001J/\u0010\u0086\u0001\u001a\u00020W2\u0006\u0010s\u001a\u00020\u00182\u0007\u0010\u0087\u0001\u001a\u00020\u00182\u0007\u0010\u0088\u0001\u001a\u00020\u0007H\u0002ø\u0001\u0000¢\u0006\u0006\b\u0089\u0001\u0010\u008a\u0001J\u0011\u0010\u008b\u0001\u001a\u00030\u008c\u00012\u0007\u0010\u0088\u0001\u001a\u00020\u0007J\u000f\u0010\u008d\u0001\u001a\u00020\u0007H\u0000¢\u0006\u0003\b\u008e\u0001J\u000f\u0010\u008f\u0001\u001a\u00020\u0007H\u0000¢\u0006\u0003\b\u0090\u0001J\u000f\u0010\u0091\u0001\u001a\u00020\u0007H\u0000¢\u0006\u0003\b\u0092\u0001J\u0007\u0010\u0093\u0001\u001a\u00020OJ\u000f\u0010\u0094\u0001\u001a\u00020\u0011H\u0000¢\u0006\u0003\b\u0095\u0001J\u000f\u0010\u0096\u0001\u001a\u00020OH\u0000¢\u0006\u0003\b\u0097\u0001J:\u0010\u0098\u0001\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020\t0\u009a\u00010\u0099\u00012\b\u0010\u009b\u0001\u001a\u00030\u009c\u00012\t\u0010\u009d\u0001\u001a\u0004\u0018\u00010\tH\u0000¢\u0006\u0003\b\u009e\u0001J\u001b\u0010\u009f\u0001\u001a\u00020O2\u0007\u0010 \u0001\u001a\u00020W2\u0007\u0010¡\u0001\u001a\u00020\tH\u0002J\u000f\u0010¢\u0001\u001a\u00020\u0007H\u0001¢\u0006\u0003\b£\u0001J0\u0010¤\u0001\u001a\u00020O2\u0006\u0010s\u001a\u00020\u00182\u0007\u0010\u0088\u0001\u001a\u00020\u00072\b\u0010¥\u0001\u001a\u00030¦\u0001H\u0002ø\u0001\u0000¢\u0006\u0006\b§\u0001\u0010¨\u0001J\t\u0010©\u0001\u001a\u00020OH\u0002J\t\u0010ª\u0001\u001a\u00020OH\u0002J9\u0010«\u0001\u001a\u00020\u00072\u0006\u0010s\u001a\u00020\u00182\u0007\u0010\u0087\u0001\u001a\u00020\u00182\u0007\u0010\u0088\u0001\u001a\u00020\u00072\b\u0010¥\u0001\u001a\u00030¦\u0001H\u0000ø\u0001\u0000¢\u0006\u0006\b¬\u0001\u0010\u00ad\u0001J;\u0010«\u0001\u001a\u00020\u00072\t\u0010®\u0001\u001a\u0004\u0018\u00010\u00182\u0006\u0010U\u001a\u00020\u00182\u0007\u0010\u0088\u0001\u001a\u00020\u00072\b\u0010¥\u0001\u001a\u00030¦\u0001H\u0000ø\u0001\u0000¢\u0006\u0006\b¯\u0001\u0010°\u0001J\t\u0010±\u0001\u001a\u00020OH\u0002J*\u0010²\u0001\u001a\u00020O*\u00030³\u00012\u0013\u0010´\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020O0NH\u0082@¢\u0006\u0003\u0010µ\u0001J\u001d\u0010¶\u0001\u001a\u00020J*\u00020J2\u000e\u0010·\u0001\u001a\t\u0012\u0004\u0012\u00020O0¸\u0001H\u0002R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR(\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R5\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u00188F@BX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR1\u0010 \u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u00188@@BX\u0080\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b%\u0010\u001f\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R1\u0010&\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u00188@@BX\u0080\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b)\u0010\u001f\u001a\u0004\b'\u0010\"\"\u0004\b(\u0010$R/\u0010+\u001a\u0004\u0018\u00010*2\b\u0010\u0017\u001a\u0004\u0018\u00010*8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b0\u0010\u001f\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R5\u00101\u001a\u0004\u0018\u00010\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u00188F@BX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b4\u0010\u001f\u001a\u0004\b2\u0010\u001b\"\u0004\b3\u0010\u001dR\u001a\u00105\u001a\u000206X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u001c\u0010;\u001a\u0004\u0018\u00010<X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R+\u0010A\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00078F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bF\u0010\u001f\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER$\u0010G\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00078F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bG\u0010C\"\u0004\bH\u0010ER\u0011\u0010I\u001a\u00020J8F¢\u0006\u0006\u001a\u0004\bK\u0010LR@\u0010P\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020O0N2\u0014\u0010M\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020O0N@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\u0016\u0010U\u001a\u0004\u0018\u00010\u0018X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0002\n\u0000R&\u0010V\u001a\u0004\u0018\u00010W8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R(\u0010^\u001a\u0004\u0018\u00010\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\t8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010c\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bd\u0010CR$\u0010e\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0007@@X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bf\u0010C\"\u0004\bg\u0010ER5\u0010h\u001a\u0004\u0018\u00010\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u00188F@BX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bk\u0010\u001f\u001a\u0004\bi\u0010\u001b\"\u0004\bj\u0010\u001dR\u001c\u0010l\u001a\u0004\u0018\u00010mX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bn\u0010o\"\u0004\bp\u0010q\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006¹\u0001"}, d2 = {"Landroidx/compose/foundation/text/selection/SelectionManager;", "", "selectionRegistrar", "Landroidx/compose/foundation/text/selection/SelectionRegistrarImpl;", "(Landroidx/compose/foundation/text/selection/SelectionRegistrarImpl;)V", "_isInTouchMode", "Landroidx/compose/runtime/MutableState;", "", "_selection", "Landroidx/compose/foundation/text/selection/Selection;", "clipboardManager", "Landroidx/compose/ui/platform/ClipboardManager;", "getClipboardManager", "()Landroidx/compose/ui/platform/ClipboardManager;", "setClipboardManager", "(Landroidx/compose/ui/platform/ClipboardManager;)V", "value", "Landroidx/compose/ui/layout/LayoutCoordinates;", "containerLayoutCoordinates", "getContainerLayoutCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "setContainerLayoutCoordinates", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "<set-?>", "Landroidx/compose/ui/geometry/Offset;", "currentDragPosition", "getCurrentDragPosition-_m7T9-E", "()Landroidx/compose/ui/geometry/Offset;", "setCurrentDragPosition-_kEHs6E", "(Landroidx/compose/ui/geometry/Offset;)V", "currentDragPosition$delegate", "Landroidx/compose/runtime/MutableState;", "dragBeginPosition", "getDragBeginPosition-F1C5BW0$foundation_release", "()J", "setDragBeginPosition-k-4lQ0M", "(J)V", "dragBeginPosition$delegate", "dragTotalDistance", "getDragTotalDistance-F1C5BW0$foundation_release", "setDragTotalDistance-k-4lQ0M", "dragTotalDistance$delegate", "Landroidx/compose/foundation/text/Handle;", "draggingHandle", "getDraggingHandle", "()Landroidx/compose/foundation/text/Handle;", "setDraggingHandle", "(Landroidx/compose/foundation/text/Handle;)V", "draggingHandle$delegate", "endHandlePosition", "getEndHandlePosition-_m7T9-E", "setEndHandlePosition-_kEHs6E", "endHandlePosition$delegate", "focusRequester", "Landroidx/compose/ui/focus/FocusRequester;", "getFocusRequester", "()Landroidx/compose/ui/focus/FocusRequester;", "setFocusRequester", "(Landroidx/compose/ui/focus/FocusRequester;)V", "hapticFeedBack", "Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "getHapticFeedBack", "()Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "setHapticFeedBack", "(Landroidx/compose/ui/hapticfeedback/HapticFeedback;)V", "hasFocus", "getHasFocus", "()Z", "setHasFocus", "(Z)V", "hasFocus$delegate", "isInTouchMode", "setInTouchMode", "modifier", "Landroidx/compose/ui/Modifier;", "getModifier", "()Landroidx/compose/ui/Modifier;", "newOnSelectionChange", "Lkotlin/Function1;", "", "onSelectionChange", "getOnSelectionChange", "()Lkotlin/jvm/functions/Function1;", "setOnSelectionChange", "(Lkotlin/jvm/functions/Function1;)V", "previousPosition", "previousSelectionLayout", "Landroidx/compose/foundation/text/selection/SelectionLayout;", "getPreviousSelectionLayout$foundation_release$annotations", "()V", "getPreviousSelectionLayout$foundation_release", "()Landroidx/compose/foundation/text/selection/SelectionLayout;", "setPreviousSelectionLayout$foundation_release", "(Landroidx/compose/foundation/text/selection/SelectionLayout;)V", "selection", "getSelection", "()Landroidx/compose/foundation/text/selection/Selection;", "setSelection", "(Landroidx/compose/foundation/text/selection/Selection;)V", "shouldShowMagnifier", "getShouldShowMagnifier", "showToolbar", "getShowToolbar$foundation_release", "setShowToolbar$foundation_release", "startHandlePosition", "getStartHandlePosition-_m7T9-E", "setStartHandlePosition-_kEHs6E", "startHandlePosition$delegate", "textToolbar", "Landroidx/compose/ui/platform/TextToolbar;", "getTextToolbar", "()Landroidx/compose/ui/platform/TextToolbar;", "setTextToolbar", "(Landroidx/compose/ui/platform/TextToolbar;)V", "contextMenuOpenAdjustment", "position", "contextMenuOpenAdjustment-k-4lQ0M", "convertToContainerCoordinates", "layoutCoordinates", TypedValues.CycleType.S_WAVE_OFFSET, "convertToContainerCoordinates-R5De75A", "(Landroidx/compose/ui/layout/LayoutCoordinates;J)J", "copy", "copy$foundation_release", "getAnchorSelectable", "Landroidx/compose/foundation/text/selection/Selectable;", "anchor", "Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;", "getAnchorSelectable$foundation_release", "getContentRect", "Landroidx/compose/ui/geometry/Rect;", "getSelectedText", "Landroidx/compose/ui/text/AnnotatedString;", "getSelectedText$foundation_release", "getSelectionLayout", "previousHandlePosition", "isStartHandle", "getSelectionLayout-Wko1d7g", "(JJZ)Landroidx/compose/foundation/text/selection/SelectionLayout;", "handleDragObserver", "Landroidx/compose/foundation/text/TextDragObserver;", "isEntireContainerSelected", "isEntireContainerSelected$foundation_release", "isNonEmptySelection", "isNonEmptySelection$foundation_release", "isTriviallyCollapsedSelection", "isTriviallyCollapsedSelection$foundation_release", "onRelease", "requireContainerCoordinates", "requireContainerCoordinates$foundation_release", "selectAll", "selectAll$foundation_release", "selectAllInSelectable", "Lkotlin/Pair;", "Landroidx/collection/LongObjectMap;", "selectableId", "", "previousSelection", "selectAllInSelectable$foundation_release", "selectionChanged", "selectionLayout", "newSelection", "shouldPerformHaptics", "shouldPerformHaptics$foundation_release", "startSelection", "adjustment", "Landroidx/compose/foundation/text/selection/SelectionAdjustment;", "startSelection-9KIMszo", "(JZLandroidx/compose/foundation/text/selection/SelectionAdjustment;)V", "toolbarCopy", "updateHandleOffsets", "updateSelection", "updateSelection-jyLRC_s$foundation_release", "(JJZLandroidx/compose/foundation/text/selection/SelectionAdjustment;)Z", "newPosition", "updateSelection-qNKwrvQ$foundation_release", "(Landroidx/compose/ui/geometry/Offset;JZLandroidx/compose/foundation/text/selection/SelectionAdjustment;)Z", "updateSelectionToolbar", "detectNonConsumingTap", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "onTap", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onClearSelectionRequested", "block", "Lkotlin/Function0;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class SelectionManager {
    public static final int $stable = 8;
    private final MutableState<Boolean> _isInTouchMode;
    private final MutableState<Selection> _selection;
    private ClipboardManager clipboardManager;
    private LayoutCoordinates containerLayoutCoordinates;

    /* renamed from: currentDragPosition$delegate, reason: from kotlin metadata */
    private final MutableState currentDragPosition;

    /* renamed from: dragBeginPosition$delegate, reason: from kotlin metadata */
    private final MutableState dragBeginPosition;

    /* renamed from: dragTotalDistance$delegate, reason: from kotlin metadata */
    private final MutableState dragTotalDistance;

    /* renamed from: draggingHandle$delegate, reason: from kotlin metadata */
    private final MutableState draggingHandle;

    /* renamed from: endHandlePosition$delegate, reason: from kotlin metadata */
    private final MutableState endHandlePosition;
    private FocusRequester focusRequester;
    private HapticFeedback hapticFeedBack;

    /* renamed from: hasFocus$delegate, reason: from kotlin metadata */
    private final MutableState hasFocus;
    private Function1<? super Selection, Unit> onSelectionChange;
    private Offset previousPosition;
    private SelectionLayout previousSelectionLayout;
    private final SelectionRegistrarImpl selectionRegistrar;
    private boolean showToolbar;

    /* renamed from: startHandlePosition$delegate, reason: from kotlin metadata */
    private final MutableState startHandlePosition;
    private TextToolbar textToolbar;

    public static /* synthetic */ void getPreviousSelectionLayout$foundation_release$annotations() {
    }

    public SelectionManager(SelectionRegistrarImpl selectionRegistrarImpl) {
        MutableState<Selection> mutableStateOf$default;
        MutableState<Boolean> mutableStateOf$default2;
        MutableState mutableStateOf$default3;
        MutableState mutableStateOf$default4;
        MutableState mutableStateOf$default5;
        MutableState mutableStateOf$default6;
        MutableState mutableStateOf$default7;
        MutableState mutableStateOf$default8;
        MutableState mutableStateOf$default9;
        this.selectionRegistrar = selectionRegistrarImpl;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this._selection = mutableStateOf$default;
        mutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(true, null, 2, null);
        this._isInTouchMode = mutableStateOf$default2;
        this.onSelectionChange = new Function1<Selection, Unit>() { // from class: androidx.compose.foundation.text.selection.SelectionManager$onSelectionChange$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Selection selection) {
                invoke2(selection);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Selection selection) {
                SelectionManager.this.setSelection(selection);
            }
        };
        this.focusRequester = new FocusRequester();
        mutableStateOf$default3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
        this.hasFocus = mutableStateOf$default3;
        mutableStateOf$default4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Offset.m4263boximpl(Offset.INSTANCE.m4290getZeroF1C5BW0()), null, 2, null);
        this.dragBeginPosition = mutableStateOf$default4;
        mutableStateOf$default5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Offset.m4263boximpl(Offset.INSTANCE.m4290getZeroF1C5BW0()), null, 2, null);
        this.dragTotalDistance = mutableStateOf$default5;
        mutableStateOf$default6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.startHandlePosition = mutableStateOf$default6;
        mutableStateOf$default7 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.endHandlePosition = mutableStateOf$default7;
        mutableStateOf$default8 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.draggingHandle = mutableStateOf$default8;
        mutableStateOf$default9 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.currentDragPosition = mutableStateOf$default9;
        selectionRegistrarImpl.setOnPositionChangeCallback$foundation_release(new Function1<Long, Unit>() { // from class: androidx.compose.foundation.text.selection.SelectionManager.1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Long l) {
                invoke(l.longValue());
                return Unit.INSTANCE;
            }

            public final void invoke(long j) {
                if (SelectionManager.this.selectionRegistrar.getSubselections().contains(j)) {
                    SelectionManager.this.updateHandleOffsets();
                    SelectionManager.this.updateSelectionToolbar();
                }
            }
        });
        selectionRegistrarImpl.setOnSelectionUpdateStartCallback$foundation_release(new Function4<Boolean, LayoutCoordinates, Offset, SelectionAdjustment, Unit>() { // from class: androidx.compose.foundation.text.selection.SelectionManager.2
            {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool, LayoutCoordinates layoutCoordinates, Offset offset, SelectionAdjustment selectionAdjustment) {
                m1679invokeRg1IO4c(bool.booleanValue(), layoutCoordinates, offset.getPackedValue(), selectionAdjustment);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke-Rg1IO4c, reason: not valid java name */
            public final void m1679invokeRg1IO4c(boolean z, LayoutCoordinates layoutCoordinates, long j, SelectionAdjustment selectionAdjustment) {
                long mo5859getSizeYbymL2g = layoutCoordinates.mo5859getSizeYbymL2g();
                Rect rect = new Rect(0.0f, 0.0f, IntSize.m7167getWidthimpl(mo5859getSizeYbymL2g), IntSize.m7166getHeightimpl(mo5859getSizeYbymL2g));
                if (!SelectionManagerKt.m1684containsInclusiveUv8p0NA(rect, j)) {
                    j = TextLayoutStateKt.m1524coerceIn3MmeM6k(j, rect);
                }
                long m1663convertToContainerCoordinatesR5De75A = SelectionManager.this.m1663convertToContainerCoordinatesR5De75A(layoutCoordinates, j);
                if (OffsetKt.m4293isSpecifiedk4lQ0M(m1663convertToContainerCoordinatesR5De75A)) {
                    SelectionManager.this.setInTouchMode(z);
                    SelectionManager.this.m1670startSelection9KIMszo(m1663convertToContainerCoordinatesR5De75A, false, selectionAdjustment);
                    SelectionManager.this.getFocusRequester().requestFocus();
                    SelectionManager.this.setShowToolbar$foundation_release(false);
                }
            }
        });
        selectionRegistrarImpl.setOnSelectionUpdateSelectAll$foundation_release(new Function2<Boolean, Long, Unit>() { // from class: androidx.compose.foundation.text.selection.SelectionManager.3
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool, Long l) {
                invoke(bool.booleanValue(), l.longValue());
                return Unit.INSTANCE;
            }

            public final void invoke(boolean z, long j) {
                SelectionManager selectionManager = SelectionManager.this;
                Pair<Selection, LongObjectMap<Selection>> selectAllInSelectable$foundation_release = selectionManager.selectAllInSelectable$foundation_release(j, selectionManager.getSelection());
                Selection component1 = selectAllInSelectable$foundation_release.component1();
                LongObjectMap<Selection> component2 = selectAllInSelectable$foundation_release.component2();
                if (!Intrinsics.areEqual(component1, SelectionManager.this.getSelection())) {
                    SelectionManager.this.selectionRegistrar.setSubselections(component2);
                    SelectionManager.this.getOnSelectionChange().invoke(component1);
                }
                SelectionManager.this.setInTouchMode(z);
                SelectionManager.this.getFocusRequester().requestFocus();
                SelectionManager.this.setShowToolbar$foundation_release(false);
            }
        });
        selectionRegistrarImpl.setOnSelectionUpdateCallback$foundation_release(new Function6<Boolean, LayoutCoordinates, Offset, Offset, Boolean, SelectionAdjustment, Boolean>() { // from class: androidx.compose.foundation.text.selection.SelectionManager.4
            {
                super(6);
            }

            @Override // kotlin.jvm.functions.Function6
            public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool, LayoutCoordinates layoutCoordinates, Offset offset, Offset offset2, Boolean bool2, SelectionAdjustment selectionAdjustment) {
                return m1680invokepGV3PM0(bool.booleanValue(), layoutCoordinates, offset.getPackedValue(), offset2.getPackedValue(), bool2.booleanValue(), selectionAdjustment);
            }

            /* renamed from: invoke-pGV3PM0, reason: not valid java name */
            public final Boolean m1680invokepGV3PM0(boolean z, LayoutCoordinates layoutCoordinates, long j, long j2, boolean z2, SelectionAdjustment selectionAdjustment) {
                long m1663convertToContainerCoordinatesR5De75A = SelectionManager.this.m1663convertToContainerCoordinatesR5De75A(layoutCoordinates, j);
                long m1663convertToContainerCoordinatesR5De75A2 = SelectionManager.this.m1663convertToContainerCoordinatesR5De75A(layoutCoordinates, j2);
                SelectionManager.this.setInTouchMode(z);
                return Boolean.valueOf(SelectionManager.this.m1678updateSelectionqNKwrvQ$foundation_release(Offset.m4263boximpl(m1663convertToContainerCoordinatesR5De75A), m1663convertToContainerCoordinatesR5De75A2, z2, selectionAdjustment));
            }
        });
        selectionRegistrarImpl.setOnSelectionUpdateEndCallback$foundation_release(new Function0<Unit>() { // from class: androidx.compose.foundation.text.selection.SelectionManager.5
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                SelectionManager.this.setShowToolbar$foundation_release(true);
                SelectionManager.this.setDraggingHandle(null);
                SelectionManager.this.m1665setCurrentDragPosition_kEHs6E(null);
            }
        });
        selectionRegistrarImpl.setOnSelectableChangeCallback$foundation_release(new Function1<Long, Unit>() { // from class: androidx.compose.foundation.text.selection.SelectionManager.6
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Long l) {
                invoke(l.longValue());
                return Unit.INSTANCE;
            }

            public final void invoke(long j) {
                if (SelectionManager.this.selectionRegistrar.getSubselections().contains(j)) {
                    SelectionManager.this.onRelease();
                    SelectionManager.this.setSelection(null);
                }
            }
        });
        selectionRegistrarImpl.setAfterSelectableUnsubscribe$foundation_release(new Function1<Long, Unit>() { // from class: androidx.compose.foundation.text.selection.SelectionManager.7
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Long l) {
                invoke(l.longValue());
                return Unit.INSTANCE;
            }

            public final void invoke(long j) {
                Selection.AnchorInfo end;
                Selection.AnchorInfo start;
                Selection selection = SelectionManager.this.getSelection();
                if (selection != null && (start = selection.getStart()) != null && j == start.getSelectableId()) {
                    SelectionManager.this.m1669setStartHandlePosition_kEHs6E(null);
                }
                Selection selection2 = SelectionManager.this.getSelection();
                if (selection2 != null && (end = selection2.getEnd()) != null && j == end.getSelectableId()) {
                    SelectionManager.this.m1668setEndHandlePosition_kEHs6E(null);
                }
                if (SelectionManager.this.selectionRegistrar.getSubselections().contains(j)) {
                    SelectionManager.this.updateSelectionToolbar();
                }
            }
        });
    }

    public final Selection getSelection() {
        return this._selection.getValue();
    }

    public final void setSelection(Selection selection) {
        this._selection.setValue(selection);
        if (selection != null) {
            updateHandleOffsets();
        }
    }

    public final boolean isInTouchMode() {
        return this._isInTouchMode.getValue().booleanValue();
    }

    public final void setInTouchMode(boolean z) {
        if (this._isInTouchMode.getValue().booleanValue() != z) {
            this._isInTouchMode.setValue(Boolean.valueOf(z));
            updateSelectionToolbar();
        }
    }

    public final Function1<Selection, Unit> getOnSelectionChange() {
        return this.onSelectionChange;
    }

    public final void setOnSelectionChange(final Function1<? super Selection, Unit> function1) {
        this.onSelectionChange = new Function1<Selection, Unit>() { // from class: androidx.compose.foundation.text.selection.SelectionManager$onSelectionChange$2
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Selection selection) {
                invoke2(selection);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Selection selection) {
                SelectionManager.this.setSelection(selection);
                function1.invoke(selection);
            }
        };
    }

    public final HapticFeedback getHapticFeedBack() {
        return this.hapticFeedBack;
    }

    public final void setHapticFeedBack(HapticFeedback hapticFeedback) {
        this.hapticFeedBack = hapticFeedback;
    }

    public final ClipboardManager getClipboardManager() {
        return this.clipboardManager;
    }

    public final void setClipboardManager(ClipboardManager clipboardManager) {
        this.clipboardManager = clipboardManager;
    }

    public final TextToolbar getTextToolbar() {
        return this.textToolbar;
    }

    public final void setTextToolbar(TextToolbar textToolbar) {
        this.textToolbar = textToolbar;
    }

    public final FocusRequester getFocusRequester() {
        return this.focusRequester;
    }

    public final void setFocusRequester(FocusRequester focusRequester) {
        this.focusRequester = focusRequester;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getHasFocus() {
        return ((Boolean) this.hasFocus.getValue()).booleanValue();
    }

    public final void setHasFocus(boolean z) {
        this.hasFocus.setValue(Boolean.valueOf(z));
    }

    public final Modifier getModifier() {
        return KeyInputModifierKt.onKeyEvent(SelectionGesturesKt.updateSelectionTouchMode(FocusableKt.focusable$default(FocusChangedModifierKt.onFocusChanged(FocusRequesterModifierKt.focusRequester(OnGloballyPositionedModifierKt.onGloballyPositioned(onClearSelectionRequested(Modifier.INSTANCE, new Function0<Unit>() { // from class: androidx.compose.foundation.text.selection.SelectionManager$modifier$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                SelectionManager.this.onRelease();
            }
        }), new Function1<LayoutCoordinates, Unit>() { // from class: androidx.compose.foundation.text.selection.SelectionManager$modifier$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(LayoutCoordinates layoutCoordinates) {
                invoke2(layoutCoordinates);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(LayoutCoordinates layoutCoordinates) {
                SelectionManager.this.setContainerLayoutCoordinates(layoutCoordinates);
            }
        }), this.focusRequester), new Function1<FocusState, Unit>() { // from class: androidx.compose.foundation.text.selection.SelectionManager$modifier$3
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(FocusState focusState) {
                invoke2(focusState);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(FocusState focusState) {
                if (!focusState.isFocused() && SelectionManager.this.getHasFocus()) {
                    SelectionManager.this.onRelease();
                }
                SelectionManager.this.setHasFocus(focusState.isFocused());
            }
        }), false, null, 3, null), new Function1<Boolean, Unit>() { // from class: androidx.compose.foundation.text.selection.SelectionManager$modifier$4
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return Unit.INSTANCE;
            }

            public final void invoke(boolean z) {
                SelectionManager.this.setInTouchMode(z);
            }
        }), new Function1<KeyEvent, Boolean>() { // from class: androidx.compose.foundation.text.selection.SelectionManager$modifier$5
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Boolean invoke(KeyEvent keyEvent) {
                return m1681invokeZmokQxo(keyEvent.m5569unboximpl());
            }

            /* renamed from: invoke-ZmokQxo, reason: not valid java name */
            public final Boolean m1681invokeZmokQxo(android.view.KeyEvent keyEvent) {
                boolean z;
                if (SelectionManager_androidKt.m1686isCopyKeyEventZmokQxo(keyEvent)) {
                    SelectionManager.this.copy$foundation_release();
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        }).then(getShouldShowMagnifier() ? SelectionManager_androidKt.selectionMagnifier(Modifier.INSTANCE, this) : Modifier.INSTANCE);
    }

    public final LayoutCoordinates getContainerLayoutCoordinates() {
        return this.containerLayoutCoordinates;
    }

    public final void setContainerLayoutCoordinates(LayoutCoordinates layoutCoordinates) {
        this.containerLayoutCoordinates = layoutCoordinates;
        if (!getHasFocus() || getSelection() == null) {
            return;
        }
        Offset m4263boximpl = layoutCoordinates != null ? Offset.m4263boximpl(LayoutCoordinatesKt.positionInWindow(layoutCoordinates)) : null;
        if (Intrinsics.areEqual(this.previousPosition, m4263boximpl)) {
            return;
        }
        this.previousPosition = m4263boximpl;
        updateHandleOffsets();
        updateSelectionToolbar();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setDragBeginPosition-k-4lQ0M, reason: not valid java name */
    public final void m1666setDragBeginPositionk4lQ0M(long j) {
        this.dragBeginPosition.setValue(Offset.m4263boximpl(j));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getDragBeginPosition-F1C5BW0$foundation_release, reason: not valid java name */
    public final long m1673getDragBeginPositionF1C5BW0$foundation_release() {
        return ((Offset) this.dragBeginPosition.getValue()).getPackedValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setDragTotalDistance-k-4lQ0M, reason: not valid java name */
    public final void m1667setDragTotalDistancek4lQ0M(long j) {
        this.dragTotalDistance.setValue(Offset.m4263boximpl(j));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getDragTotalDistance-F1C5BW0$foundation_release, reason: not valid java name */
    public final long m1674getDragTotalDistanceF1C5BW0$foundation_release() {
        return ((Offset) this.dragTotalDistance.getValue()).getPackedValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setStartHandlePosition-_kEHs6E, reason: not valid java name */
    public final void m1669setStartHandlePosition_kEHs6E(Offset offset) {
        this.startHandlePosition.setValue(offset);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getStartHandlePosition-_m7T9-E, reason: not valid java name */
    public final Offset m1676getStartHandlePosition_m7T9E() {
        return (Offset) this.startHandlePosition.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setEndHandlePosition-_kEHs6E, reason: not valid java name */
    public final void m1668setEndHandlePosition_kEHs6E(Offset offset) {
        this.endHandlePosition.setValue(offset);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getEndHandlePosition-_m7T9-E, reason: not valid java name */
    public final Offset m1675getEndHandlePosition_m7T9E() {
        return (Offset) this.endHandlePosition.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setDraggingHandle(Handle handle) {
        this.draggingHandle.setValue(handle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Handle getDraggingHandle() {
        return (Handle) this.draggingHandle.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setCurrentDragPosition-_kEHs6E, reason: not valid java name */
    public final void m1665setCurrentDragPosition_kEHs6E(Offset offset) {
        this.currentDragPosition.setValue(offset);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getCurrentDragPosition-_m7T9-E, reason: not valid java name */
    public final Offset m1672getCurrentDragPosition_m7T9E() {
        return (Offset) this.currentDragPosition.getValue();
    }

    private final boolean getShouldShowMagnifier() {
        return (getDraggingHandle() == null || !isInTouchMode() || isTriviallyCollapsedSelection$foundation_release()) ? false : true;
    }

    /* renamed from: getPreviousSelectionLayout$foundation_release, reason: from getter */
    public final SelectionLayout getPreviousSelectionLayout() {
        return this.previousSelectionLayout;
    }

    public final void setPreviousSelectionLayout$foundation_release(SelectionLayout selectionLayout) {
        this.previousSelectionLayout = selectionLayout;
    }

    public final Selectable getAnchorSelectable$foundation_release(Selection.AnchorInfo anchor) {
        return this.selectionRegistrar.getSelectableMap$foundation_release().get(anchor.getSelectableId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006c, code lost:
    
        if (androidx.compose.foundation.text.selection.SelectionManagerKt.m1684containsInclusiveUv8p0NA(r7, r8) == false) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void updateHandleOffsets() {
        /*
            r11 = this;
            androidx.compose.foundation.text.selection.Selection r0 = r11.getSelection()
            androidx.compose.ui.layout.LayoutCoordinates r1 = r11.containerLayoutCoordinates
            r2 = 0
            if (r0 == 0) goto L14
            androidx.compose.foundation.text.selection.Selection$AnchorInfo r3 = r0.getStart()
            if (r3 == 0) goto L14
            androidx.compose.foundation.text.selection.Selectable r3 = r11.getAnchorSelectable$foundation_release(r3)
            goto L15
        L14:
            r3 = r2
        L15:
            if (r0 == 0) goto L22
            androidx.compose.foundation.text.selection.Selection$AnchorInfo r4 = r0.getEnd()
            if (r4 == 0) goto L22
            androidx.compose.foundation.text.selection.Selectable r4 = r11.getAnchorSelectable$foundation_release(r4)
            goto L23
        L22:
            r4 = r2
        L23:
            if (r3 == 0) goto L2a
            androidx.compose.ui.layout.LayoutCoordinates r5 = r3.getLayoutCoordinates()
            goto L2b
        L2a:
            r5 = r2
        L2b:
            if (r4 == 0) goto L32
            androidx.compose.ui.layout.LayoutCoordinates r6 = r4.getLayoutCoordinates()
            goto L33
        L32:
            r6 = r2
        L33:
            if (r0 == 0) goto La0
            if (r1 == 0) goto La0
            boolean r7 = r1.isAttached()
            if (r7 == 0) goto La0
            if (r5 != 0) goto L42
            if (r6 != 0) goto L42
            goto La0
        L42:
            androidx.compose.ui.geometry.Rect r7 = androidx.compose.foundation.text.selection.SelectionManagerKt.visibleBounds(r1)
            if (r5 == 0) goto L6f
            r8 = 1
            long r8 = r3.mo1632getHandlePositiondBAh8RU(r0, r8)
            boolean r3 = androidx.compose.ui.geometry.OffsetKt.m4295isUnspecifiedk4lQ0M(r8)
            if (r3 == 0) goto L54
            goto L6f
        L54:
            long r8 = r1.mo5860localPositionOfR5De75A(r5, r8)
            androidx.compose.ui.geometry.Offset r3 = androidx.compose.ui.geometry.Offset.m4263boximpl(r8)
            long r8 = r3.getPackedValue()
            androidx.compose.foundation.text.Handle r5 = r11.getDraggingHandle()
            androidx.compose.foundation.text.Handle r10 = androidx.compose.foundation.text.Handle.SelectionStart
            if (r5 == r10) goto L70
            boolean r5 = androidx.compose.foundation.text.selection.SelectionManagerKt.m1684containsInclusiveUv8p0NA(r7, r8)
            if (r5 == 0) goto L6f
            goto L70
        L6f:
            r3 = r2
        L70:
            r11.m1669setStartHandlePosition_kEHs6E(r3)
            if (r6 == 0) goto L9c
            r3 = 0
            long r3 = r4.mo1632getHandlePositiondBAh8RU(r0, r3)
            boolean r0 = androidx.compose.ui.geometry.OffsetKt.m4295isUnspecifiedk4lQ0M(r3)
            if (r0 == 0) goto L81
            goto L9c
        L81:
            long r0 = r1.mo5860localPositionOfR5De75A(r6, r3)
            androidx.compose.ui.geometry.Offset r0 = androidx.compose.ui.geometry.Offset.m4263boximpl(r0)
            long r3 = r0.getPackedValue()
            androidx.compose.foundation.text.Handle r1 = r11.getDraggingHandle()
            androidx.compose.foundation.text.Handle r5 = androidx.compose.foundation.text.Handle.SelectionEnd
            if (r1 == r5) goto L9b
            boolean r1 = androidx.compose.foundation.text.selection.SelectionManagerKt.m1684containsInclusiveUv8p0NA(r7, r3)
            if (r1 == 0) goto L9c
        L9b:
            r2 = r0
        L9c:
            r11.m1668setEndHandlePosition_kEHs6E(r2)
            return
        La0:
            r11.m1669setStartHandlePosition_kEHs6E(r2)
            r11.m1668setEndHandlePosition_kEHs6E(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionManager.updateHandleOffsets():void");
    }

    public final LayoutCoordinates requireContainerCoordinates$foundation_release() {
        LayoutCoordinates layoutCoordinates = this.containerLayoutCoordinates;
        if (layoutCoordinates == null) {
            throw new IllegalArgumentException("null coordinates".toString());
        }
        if (layoutCoordinates.isAttached()) {
            return layoutCoordinates;
        }
        throw new IllegalArgumentException("unattached coordinates".toString());
    }

    public final Pair<Selection, LongObjectMap<Selection>> selectAllInSelectable$foundation_release(long selectableId, Selection previousSelection) {
        HapticFeedback hapticFeedback;
        MutableLongObjectMap mutableLongObjectMapOf = LongObjectMapKt.mutableLongObjectMapOf();
        List<Selectable> sort = this.selectionRegistrar.sort(requireContainerCoordinates$foundation_release());
        int size = sort.size();
        Selection selection = null;
        for (int i = 0; i < size; i++) {
            Selectable selectable = sort.get(i);
            Selection selectAllSelection = selectable.getSelectableId() == selectableId ? selectable.getSelectAllSelection() : null;
            if (selectAllSelection != null) {
                mutableLongObjectMapOf.set(selectable.getSelectableId(), selectAllSelection);
            }
            selection = SelectionManagerKt.merge(selection, selectAllSelection);
        }
        if (isInTouchMode() && !Intrinsics.areEqual(selection, previousSelection) && (hapticFeedback = this.hapticFeedBack) != null) {
            hapticFeedback.mo5243performHapticFeedbackCdsT49E(HapticFeedbackType.INSTANCE.m5252getTextHandleMove5zf0vsI());
        }
        return new Pair<>(selection, mutableLongObjectMapOf);
    }

    public final boolean isEntireContainerSelected$foundation_release() {
        Selection selection;
        List<Selectable> sort = this.selectionRegistrar.sort(requireContainerCoordinates$foundation_release());
        if (sort.isEmpty()) {
            return true;
        }
        int size = sort.size();
        for (int i = 0; i < size; i++) {
            Selectable selectable = sort.get(i);
            AnnotatedString text = selectable.getText();
            if (text.length() != 0 && ((selection = this.selectionRegistrar.getSubselections().get(selectable.getSelectableId())) == null || Math.abs(selection.getStart().getOffset() - selection.getEnd().getOffset()) != text.length())) {
                return false;
            }
        }
        return true;
    }

    public final void selectAll$foundation_release() {
        List<Selectable> sort = this.selectionRegistrar.sort(requireContainerCoordinates$foundation_release());
        if (sort.isEmpty()) {
            return;
        }
        MutableLongObjectMap mutableLongObjectMapOf = LongObjectMapKt.mutableLongObjectMapOf();
        int size = sort.size();
        Selection selection = null;
        Selection selection2 = null;
        for (int i = 0; i < size; i++) {
            Selectable selectable = sort.get(i);
            Selection selectAllSelection = selectable.getSelectAllSelection();
            if (selectAllSelection != null) {
                if (selection == null) {
                    selection = selectAllSelection;
                }
                mutableLongObjectMapOf.put(selectable.getSelectableId(), selectAllSelection);
                selection2 = selectAllSelection;
            }
        }
        if (mutableLongObjectMapOf.isEmpty()) {
            return;
        }
        if (selection != selection2) {
            Intrinsics.checkNotNull(selection);
            Selection.AnchorInfo start = selection.getStart();
            Intrinsics.checkNotNull(selection2);
            selection = new Selection(start, selection2.getEnd(), false);
        }
        this.selectionRegistrar.setSubselections(mutableLongObjectMapOf);
        this.onSelectionChange.invoke(selection);
        this.previousSelectionLayout = null;
    }

    public final boolean isTriviallyCollapsedSelection$foundation_release() {
        Selection selection = getSelection();
        if (selection == null) {
            return true;
        }
        return Intrinsics.areEqual(selection.getStart(), selection.getEnd());
    }

    public final boolean isNonEmptySelection$foundation_release() {
        Selection selection = getSelection();
        if (selection == null || Intrinsics.areEqual(selection.getStart(), selection.getEnd())) {
            return false;
        }
        if (selection.getStart().getSelectableId() == selection.getEnd().getSelectableId()) {
            return true;
        }
        List<Selectable> sort = this.selectionRegistrar.sort(requireContainerCoordinates$foundation_release());
        int size = sort.size();
        for (int i = 0; i < size; i++) {
            Selection selection2 = this.selectionRegistrar.getSubselections().get(sort.get(i).getSelectableId());
            if (selection2 != null && selection2.getStart().getOffset() != selection2.getEnd().getOffset()) {
                return true;
            }
        }
        return false;
    }

    public final AnnotatedString getSelectedText$foundation_release() {
        AnnotatedString subSequence;
        if (getSelection() == null || this.selectionRegistrar.getSubselections().isEmpty()) {
            return null;
        }
        AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
        List<Selectable> sort = this.selectionRegistrar.sort(requireContainerCoordinates$foundation_release());
        int size = sort.size();
        for (int i = 0; i < size; i++) {
            Selectable selectable = sort.get(i);
            Selection selection = this.selectionRegistrar.getSubselections().get(selectable.getSelectableId());
            if (selection != null) {
                AnnotatedString text = selectable.getText();
                if (selection.getHandlesCrossed()) {
                    subSequence = text.subSequence(selection.getEnd().getOffset(), selection.getStart().getOffset());
                } else {
                    subSequence = text.subSequence(selection.getStart().getOffset(), selection.getEnd().getOffset());
                }
                builder.append(subSequence);
            }
        }
        return builder.toAnnotatedString();
    }

    public final void copy$foundation_release() {
        ClipboardManager clipboardManager;
        AnnotatedString selectedText$foundation_release = getSelectedText$foundation_release();
        if (selectedText$foundation_release != null) {
            if (selectedText$foundation_release.length() <= 0) {
                selectedText$foundation_release = null;
            }
            if (selectedText$foundation_release == null || (clipboardManager = this.clipboardManager) == null) {
                return;
            }
            clipboardManager.setText(selectedText$foundation_release);
        }
    }

    /* renamed from: getShowToolbar$foundation_release, reason: from getter */
    public final boolean getShowToolbar() {
        return this.showToolbar;
    }

    public final void setShowToolbar$foundation_release(boolean z) {
        this.showToolbar = z;
        updateSelectionToolbar();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void toolbarCopy() {
        copy$foundation_release();
        onRelease();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateSelectionToolbar() {
        TextToolbar textToolbar;
        if (getHasFocus() && (textToolbar = this.textToolbar) != null) {
            if (this.showToolbar && isInTouchMode()) {
                Rect contentRect = getContentRect();
                if (contentRect == null) {
                    return;
                }
                TextToolbar.showMenu$default(textToolbar, contentRect, isNonEmptySelection$foundation_release() ? new SelectionManager$updateSelectionToolbar$1(this) : null, null, null, isEntireContainerSelected$foundation_release() ? null : new SelectionManager$updateSelectionToolbar$2(this), 12, null);
                return;
            }
            if (textToolbar.getStatus() == TextToolbarStatus.Shown) {
                textToolbar.hide();
            }
        }
    }

    private final Rect getContentRect() {
        LayoutCoordinates layoutCoordinates;
        List firstAndLast;
        Rect rect;
        if (getSelection() == null || (layoutCoordinates = this.containerLayoutCoordinates) == null || !layoutCoordinates.isAttached()) {
            return null;
        }
        List<Selectable> sort = this.selectionRegistrar.sort(requireContainerCoordinates$foundation_release());
        ArrayList arrayList = new ArrayList(sort.size());
        int size = sort.size();
        for (int i = 0; i < size; i++) {
            Selectable selectable = sort.get(i);
            Selection selection = this.selectionRegistrar.getSubselections().get(selectable.getSelectableId());
            Pair pair = selection != null ? TuplesKt.to(selectable, selection) : null;
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        firstAndLast = SelectionManagerKt.firstAndLast(arrayList);
        if (firstAndLast.isEmpty()) {
            return null;
        }
        Rect selectedRegionRect = SelectionManagerKt.getSelectedRegionRect(firstAndLast, layoutCoordinates);
        rect = SelectionManagerKt.invertedInfiniteRect;
        if (Intrinsics.areEqual(selectedRegionRect, rect)) {
            return null;
        }
        Rect intersect = SelectionManagerKt.visibleBounds(layoutCoordinates).intersect(selectedRegionRect);
        if (intersect.getWidth() < 0.0f || intersect.getHeight() < 0.0f) {
            return null;
        }
        Rect m4311translatek4lQ0M = intersect.m4311translatek4lQ0M(LayoutCoordinatesKt.positionInRoot(layoutCoordinates));
        return Rect.copy$default(m4311translatek4lQ0M, 0.0f, 0.0f, 0.0f, m4311translatek4lQ0M.getBottom() + (SelectionHandlesKt.getHandleHeight() * 4), 7, null);
    }

    public final void onRelease() {
        HapticFeedback hapticFeedback;
        this.selectionRegistrar.setSubselections(LongObjectMapKt.emptyLongObjectMap());
        setShowToolbar$foundation_release(false);
        if (getSelection() != null) {
            this.onSelectionChange.invoke(null);
            if (!isInTouchMode() || (hapticFeedback = this.hapticFeedBack) == null) {
                return;
            }
            hapticFeedback.mo5243performHapticFeedbackCdsT49E(HapticFeedbackType.INSTANCE.m5252getTextHandleMove5zf0vsI());
        }
    }

    public final TextDragObserver handleDragObserver(final boolean isStartHandle) {
        return new TextDragObserver() { // from class: androidx.compose.foundation.text.selection.SelectionManager$handleDragObserver$1
            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onDown-k-4lQ0M */
            public void mo1362onDownk4lQ0M(long point) {
                LayoutCoordinates layoutCoordinates;
                Offset m1676getStartHandlePosition_m7T9E = isStartHandle ? this.m1676getStartHandlePosition_m7T9E() : this.m1675getEndHandlePosition_m7T9E();
                if (m1676getStartHandlePosition_m7T9E != null) {
                    m1676getStartHandlePosition_m7T9E.getPackedValue();
                    Selection selection = this.getSelection();
                    if (selection == null) {
                        return;
                    }
                    Selectable anchorSelectable$foundation_release = this.getAnchorSelectable$foundation_release(isStartHandle ? selection.getStart() : selection.getEnd());
                    if (anchorSelectable$foundation_release == null || (layoutCoordinates = anchorSelectable$foundation_release.getLayoutCoordinates()) == null) {
                        return;
                    }
                    long mo1632getHandlePositiondBAh8RU = anchorSelectable$foundation_release.mo1632getHandlePositiondBAh8RU(selection, isStartHandle);
                    if (OffsetKt.m4295isUnspecifiedk4lQ0M(mo1632getHandlePositiondBAh8RU)) {
                        return;
                    }
                    long m1647getAdjustedCoordinatesk4lQ0M = SelectionHandlesKt.m1647getAdjustedCoordinatesk4lQ0M(mo1632getHandlePositiondBAh8RU);
                    SelectionManager selectionManager = this;
                    selectionManager.m1665setCurrentDragPosition_kEHs6E(Offset.m4263boximpl(selectionManager.requireContainerCoordinates$foundation_release().mo5860localPositionOfR5De75A(layoutCoordinates, m1647getAdjustedCoordinatesk4lQ0M)));
                    this.setDraggingHandle(isStartHandle ? Handle.SelectionStart : Handle.SelectionEnd);
                    this.setShowToolbar$foundation_release(false);
                }
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onStart-k-4lQ0M */
            public void mo1364onStartk4lQ0M(long startPoint) {
                if (this.getDraggingHandle() == null) {
                    return;
                }
                Selection selection = this.getSelection();
                Intrinsics.checkNotNull(selection);
                Selectable selectable = this.selectionRegistrar.getSelectableMap$foundation_release().get((isStartHandle ? selection.getStart() : selection.getEnd()).getSelectableId());
                if (selectable == null) {
                    throw new IllegalStateException("SelectionRegistrar should contain the current selection's selectableIds".toString());
                }
                Selectable selectable2 = selectable;
                LayoutCoordinates layoutCoordinates = selectable2.getLayoutCoordinates();
                if (layoutCoordinates == null) {
                    throw new IllegalStateException("Current selectable should have layout coordinates.".toString());
                }
                long mo1632getHandlePositiondBAh8RU = selectable2.mo1632getHandlePositiondBAh8RU(selection, isStartHandle);
                if (OffsetKt.m4295isUnspecifiedk4lQ0M(mo1632getHandlePositiondBAh8RU)) {
                    return;
                }
                long m1647getAdjustedCoordinatesk4lQ0M = SelectionHandlesKt.m1647getAdjustedCoordinatesk4lQ0M(mo1632getHandlePositiondBAh8RU);
                SelectionManager selectionManager = this;
                selectionManager.m1666setDragBeginPositionk4lQ0M(selectionManager.requireContainerCoordinates$foundation_release().mo5860localPositionOfR5De75A(layoutCoordinates, m1647getAdjustedCoordinatesk4lQ0M));
                this.m1667setDragTotalDistancek4lQ0M(Offset.INSTANCE.m4290getZeroF1C5BW0());
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onDrag-k-4lQ0M */
            public void mo1363onDragk4lQ0M(long delta) {
                if (this.getDraggingHandle() == null) {
                    return;
                }
                SelectionManager selectionManager = this;
                selectionManager.m1667setDragTotalDistancek4lQ0M(Offset.m4279plusMKHz9U(selectionManager.m1674getDragTotalDistanceF1C5BW0$foundation_release(), delta));
                long m4279plusMKHz9U = Offset.m4279plusMKHz9U(this.m1673getDragBeginPositionF1C5BW0$foundation_release(), this.m1674getDragTotalDistanceF1C5BW0$foundation_release());
                if (this.m1678updateSelectionqNKwrvQ$foundation_release(Offset.m4263boximpl(m4279plusMKHz9U), this.m1673getDragBeginPositionF1C5BW0$foundation_release(), isStartHandle, SelectionAdjustment.INSTANCE.getCharacterWithWordAccelerate())) {
                    this.m1666setDragBeginPositionk4lQ0M(m4279plusMKHz9U);
                    this.m1667setDragTotalDistancek4lQ0M(Offset.INSTANCE.m4290getZeroF1C5BW0());
                }
            }

            private final void done() {
                this.setShowToolbar$foundation_release(true);
                this.setDraggingHandle(null);
                this.m1665setCurrentDragPosition_kEHs6E(null);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onUp() {
                done();
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onStop() {
                done();
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onCancel() {
                done();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object detectNonConsumingTap(PointerInputScope pointerInputScope, Function1<? super Offset, Unit> function1, Continuation<? super Unit> continuation) {
        Object awaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new SelectionManager$detectNonConsumingTap$2(function1, null), continuation);
        return awaitEachGesture == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? awaitEachGesture : Unit.INSTANCE;
    }

    private final Modifier onClearSelectionRequested(Modifier modifier, Function0<Unit> function0) {
        return getHasFocus() ? SuspendingPointerInputFilterKt.pointerInput(modifier, Unit.INSTANCE, new SelectionManager$onClearSelectionRequested$1(this, function0, null)) : modifier;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: convertToContainerCoordinates-R5De75A, reason: not valid java name */
    public final long m1663convertToContainerCoordinatesR5De75A(LayoutCoordinates layoutCoordinates, long offset) {
        LayoutCoordinates layoutCoordinates2 = this.containerLayoutCoordinates;
        if (layoutCoordinates2 == null || !layoutCoordinates2.isAttached()) {
            return Offset.INSTANCE.m4289getUnspecifiedF1C5BW0();
        }
        return requireContainerCoordinates$foundation_release().mo5860localPositionOfR5De75A(layoutCoordinates, offset);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: startSelection-9KIMszo, reason: not valid java name */
    public final void m1670startSelection9KIMszo(long position, boolean isStartHandle, SelectionAdjustment adjustment) {
        this.previousSelectionLayout = null;
        m1677updateSelectionjyLRC_s$foundation_release(position, Offset.INSTANCE.m4289getUnspecifiedF1C5BW0(), isStartHandle, adjustment);
    }

    /* renamed from: updateSelection-qNKwrvQ$foundation_release, reason: not valid java name */
    public final boolean m1678updateSelectionqNKwrvQ$foundation_release(Offset newPosition, long previousPosition, boolean isStartHandle, SelectionAdjustment adjustment) {
        if (newPosition == null) {
            return false;
        }
        return m1677updateSelectionjyLRC_s$foundation_release(newPosition.getPackedValue(), previousPosition, isStartHandle, adjustment);
    }

    /* renamed from: updateSelection-jyLRC_s$foundation_release, reason: not valid java name */
    public final boolean m1677updateSelectionjyLRC_s$foundation_release(long position, long previousHandlePosition, boolean isStartHandle, SelectionAdjustment adjustment) {
        setDraggingHandle(isStartHandle ? Handle.SelectionStart : Handle.SelectionEnd);
        m1665setCurrentDragPosition_kEHs6E(Offset.m4263boximpl(position));
        SelectionLayout m1664getSelectionLayoutWko1d7g = m1664getSelectionLayoutWko1d7g(position, previousHandlePosition, isStartHandle);
        if (!m1664getSelectionLayoutWko1d7g.shouldRecomputeSelection(this.previousSelectionLayout)) {
            return false;
        }
        Selection adjust = adjustment.adjust(m1664getSelectionLayoutWko1d7g);
        if (!Intrinsics.areEqual(adjust, getSelection())) {
            selectionChanged(m1664getSelectionLayoutWko1d7g, adjust);
        }
        this.previousSelectionLayout = m1664getSelectionLayoutWko1d7g;
        return true;
    }

    /* renamed from: getSelectionLayout-Wko1d7g, reason: not valid java name */
    private final SelectionLayout m1664getSelectionLayoutWko1d7g(long position, long previousHandlePosition, boolean isStartHandle) {
        LayoutCoordinates requireContainerCoordinates$foundation_release = requireContainerCoordinates$foundation_release();
        List<Selectable> sort = this.selectionRegistrar.sort(requireContainerCoordinates$foundation_release);
        final MutableLongIntMap mutableLongIntMapOf = LongIntMapKt.mutableLongIntMapOf();
        int size = sort.size();
        for (int i = 0; i < size; i++) {
            mutableLongIntMapOf.set(sort.get(i).getSelectableId(), i);
        }
        SelectionLayoutBuilder selectionLayoutBuilder = new SelectionLayoutBuilder(position, previousHandlePosition, requireContainerCoordinates$foundation_release, isStartHandle, OffsetKt.m4295isUnspecifiedk4lQ0M(previousHandlePosition) ? null : getSelection(), new Comparator() { // from class: androidx.compose.foundation.text.selection.SelectionManager$getSelectionLayout-Wko1d7g$$inlined$compareBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues(Integer.valueOf(MutableLongIntMap.this.get(((Number) t).longValue())), Integer.valueOf(MutableLongIntMap.this.get(((Number) t2).longValue())));
            }
        }, null);
        int size2 = sort.size();
        for (int i2 = 0; i2 < size2; i2++) {
            sort.get(i2).appendSelectableInfoToBuilder(selectionLayoutBuilder);
        }
        return selectionLayoutBuilder.build();
    }

    private final void selectionChanged(SelectionLayout selectionLayout, Selection newSelection) {
        HapticFeedback hapticFeedback;
        if (shouldPerformHaptics$foundation_release() && (hapticFeedback = this.hapticFeedBack) != null) {
            hapticFeedback.mo5243performHapticFeedbackCdsT49E(HapticFeedbackType.INSTANCE.m5252getTextHandleMove5zf0vsI());
        }
        this.selectionRegistrar.setSubselections(selectionLayout.createSubSelections(newSelection));
        this.onSelectionChange.invoke(newSelection);
    }

    public final boolean shouldPerformHaptics$foundation_release() {
        if (!isInTouchMode()) {
            return false;
        }
        List<Selectable> selectables$foundation_release = this.selectionRegistrar.getSelectables$foundation_release();
        int size = selectables$foundation_release.size();
        for (int i = 0; i < size; i++) {
            if (selectables$foundation_release.get(i).getText().length() > 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: contextMenuOpenAdjustment-k-4lQ0M, reason: not valid java name */
    public final void m1671contextMenuOpenAdjustmentk4lQ0M(long position) {
        Selection selection = getSelection();
        if (selection == null || TextRange.m6454getCollapsedimpl(selection.m1638toTextRanged9O1mEE())) {
            m1670startSelection9KIMszo(position, true, SelectionAdjustment.INSTANCE.getWord());
        }
    }
}
