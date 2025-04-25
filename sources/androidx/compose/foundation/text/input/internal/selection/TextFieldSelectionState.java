package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.foundation.content.TransferableContent;
import androidx.compose.foundation.content.TransferableContent_androidKt;
import androidx.compose.foundation.content.internal.ReceiveContentConfiguration;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.foundation.text.TextFieldCursorKt;
import androidx.compose.foundation.text.input.TextFieldCharSequence;
import androidx.compose.foundation.text.input.TextFieldCharSequenceKt;
import androidx.compose.foundation.text.input.internal.IndexTransformationType;
import androidx.compose.foundation.text.input.internal.MathUtilsKt;
import androidx.compose.foundation.text.input.internal.SelectionWedgeAffinity;
import androidx.compose.foundation.text.input.internal.TextLayoutState;
import androidx.compose.foundation.text.input.internal.TextLayoutStateKt;
import androidx.compose.foundation.text.input.internal.TransformedTextFieldState;
import androidx.compose.foundation.text.input.internal.WedgeAffinity;
import androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior;
import androidx.compose.foundation.text.selection.MouseSelectionObserver;
import androidx.compose.foundation.text.selection.SelectionAdjustment;
import androidx.compose.foundation.text.selection.SelectionGesturesKt;
import androidx.compose.foundation.text.selection.SelectionLayout;
import androidx.compose.foundation.text.selection.SelectionLayoutKt;
import androidx.compose.foundation.text.selection.SelectionManagerKt;
import androidx.compose.foundation.text.selection.TextSelectionDelegateKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.hapticfeedback.HapticFeedbackType;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.platform.ClipEntry;
import androidx.compose.ui.platform.ClipboardManager;
import androidx.compose.ui.platform.TextToolbar;
import androidx.compose.ui.platform.TextToolbarStatus;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: TextFieldSelectionState.kt */
@Metadata(d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001:\u0006«\u0001¬\u0001\u00ad\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0002\u0010\rJ\u0006\u0010W\u001a\u00020\tJ\u0006\u0010X\u001a\u00020\tJ\u0006\u0010Y\u001a\u00020\tJ\u0006\u0010Z\u001a\u00020\tJ\u0006\u0010[\u001a\u00020\\J\u0010\u0010]\u001a\u00020\\2\b\b\u0002\u0010^\u001a\u00020\tJ\u0006\u0010_\u001a\u00020\\J\u0006\u0010`\u001a\u00020\\J\u0006\u0010a\u001a\u00020\\J\b\u0010b\u001a\u00020cH\u0002J\u0015\u0010d\u001a\u00020e2\u0006\u0010f\u001a\u00020\tH\u0000¢\u0006\u0002\bgJ\u0006\u0010h\u001a\u00020cJ\u001d\u0010i\u001a\u00020\u00112\u0006\u0010j\u001a\u00020\tH\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bk\u0010lJ\u001d\u0010m\u001a\u00020e2\u0006\u0010j\u001a\u00020\t2\u0006\u0010f\u001a\u00020\tH\u0000¢\u0006\u0002\bnJ<\u0010o\u001a\u00020p2\u0006\u0010q\u001a\u0002032\u0006\u0010r\u001a\u0002032\b\u0010s\u001a\u0004\u0018\u00010p2\u0006\u0010j\u001a\u00020\t2\u0006\u0010t\u001a\u00020uH\u0002ø\u0001\u0000¢\u0006\u0004\bv\u0010wJ\b\u0010x\u001a\u00020\\H\u0002J\b\u0010y\u001a\u00020\tH\u0002J\b\u0010z\u001a\u00020\\H\u0002J1\u0010{\u001a\n\u0012\u0004\u0012\u00020\\\u0018\u00010<2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010|\u001a\u00020P2\u000e\b\u0004\u0010}\u001a\b\u0012\u0004\u0012\u00020\\0<H\u0082\bJ\u000e\u0010~\u001a\u00020\\H\u0086@¢\u0006\u0002\u0010\u007fJ\u000f\u0010\u0080\u0001\u001a\u00020\\H\u0082@¢\u0006\u0002\u0010\u007fJ\u000f\u0010\u0081\u0001\u001a\u00020\\H\u0082@¢\u0006\u0002\u0010\u007fJ\u0007\u0010\u0082\u0001\u001a\u00020\\J\t\u0010\u0083\u0001\u001a\u00020\\H\u0002J\u001e\u0010\u0084\u0001\u001a\u00020\t2\u0007\u0010\u0085\u0001\u001a\u00020\u0011H\u0002ø\u0001\u0000¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001J\u0007\u0010\u0088\u0001\u001a\u00020\\J\u0012\u0010\u0089\u0001\u001a\u00020\\2\u0007\u0010\u008a\u0001\u001a\u00020cH\u0002J?\u0010\u008b\u0001\u001a\u00020\\2\u0006\u0010)\u001a\u00020*2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010N\u001a\u00020O2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tJ%\u0010\u008c\u0001\u001a\u00020\\2\u0007\u0010\u008d\u0001\u001a\u00020\u001d2\u0007\u0010\u008e\u0001\u001a\u00020\u0011ø\u0001\u0000¢\u0006\u0006\b\u008f\u0001\u0010\u0090\u0001JZ\u0010\u0091\u0001\u001a\u00020p2\b\u0010\u0092\u0001\u001a\u00030\u0093\u00012\u0007\u0010\u0094\u0001\u001a\u0002032\u0007\u0010\u0095\u0001\u001a\u0002032\u0006\u0010j\u001a\u00020\t2\u0006\u0010t\u001a\u00020u2\t\b\u0002\u0010\u0096\u0001\u001a\u00020\t2\t\b\u0002\u0010\u0097\u0001\u001a\u00020\tH\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\b\u0098\u0001\u0010\u0099\u0001J\u000f\u0010\u009a\u0001\u001a\u00020\\2\u0006\u0010Q\u001a\u00020PJ\u0015\u0010\u009b\u0001\u001a\u00020\\*\u00030\u009c\u0001H\u0086@¢\u0006\u0003\u0010\u009d\u0001J\u0015\u0010\u009e\u0001\u001a\u00020\\*\u00030\u009c\u0001H\u0082@¢\u0006\u0003\u0010\u009d\u0001J\u001d\u0010\u009f\u0001\u001a\u00020\\*\u00030\u009c\u00012\u0006\u0010j\u001a\u00020\tH\u0082@¢\u0006\u0003\u0010 \u0001J?\u0010¡\u0001\u001a\u00020\\*\u00030\u009c\u00012\n\u0010¢\u0001\u001a\u0005\u0018\u00010£\u00012\r\u0010¤\u0001\u001a\b\u0012\u0004\u0012\u00020\\0<2\r\u0010¥\u0001\u001a\b\u0012\u0004\u0012\u00020\\0<H\u0086@¢\u0006\u0003\u0010¦\u0001J\u0015\u0010§\u0001\u001a\u00020\\*\u00030\u009c\u0001H\u0086@¢\u0006\u0003\u0010\u009d\u0001J\u001d\u0010¨\u0001\u001a\u00020\\*\u00030\u009c\u00012\u0006\u0010j\u001a\u00020\tH\u0086@¢\u0006\u0003\u0010 \u0001J$\u0010©\u0001\u001a\u00020\\*\u00030\u009c\u00012\r\u0010¤\u0001\u001a\b\u0012\u0004\u0012\u00020\\0<H\u0086@¢\u0006\u0003\u0010ª\u0001R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u00020\u00118BX\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R+\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00158F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR/\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\u0010\u0014\u001a\u0004\u0018\u00010\u001d8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b#\u0010\u001c\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0017\u0010'\u001a\u00020\u00118Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b(\u0010\u0013R\u0010\u0010)\u001a\u0004\u0018\u00010*X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010&\"\u0004\b+\u0010,R+\u0010-\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\t8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b/\u0010\u001c\u001a\u0004\b-\u0010&\"\u0004\b.\u0010,R\u000e\u0010\f\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00100\u001a\u0004\u0018\u000101X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u000203X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00104\u001a\u0004\u0018\u000105X\u0082\u000e¢\u0006\u0002\n\u0000R1\u00106\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00118B@BX\u0082\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b:\u0010\u001c\u001a\u0004\b7\u0010\u0013\"\u0004\b8\u00109R\u000e\u0010\n\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010;\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010=\u0018\u00010<X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR+\u0010B\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\t8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bE\u0010\u001c\u001a\u0004\bC\u0010&\"\u0004\bD\u0010,R1\u0010F\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00118B@BX\u0082\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bI\u0010\u001c\u001a\u0004\bG\u0010\u0013\"\u0004\bH\u00109R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010J\u001a\u0004\u0018\u00010K8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bL\u0010MR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010N\u001a\u0004\u0018\u00010OX\u0082\u000e¢\u0006\u0002\n\u0000R+\u0010Q\u001a\u00020P2\u0006\u0010\u0014\u001a\u00020P8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bV\u0010\u001c\u001a\u0004\bR\u0010S\"\u0004\bT\u0010U\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006®\u0001"}, d2 = {"Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;", "", "textFieldState", "Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;", "textLayoutState", "Landroidx/compose/foundation/text/input/internal/TextLayoutState;", "density", "Landroidx/compose/ui/unit/Density;", "enabled", "", "readOnly", "isFocused", "isPassword", "(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroidx/compose/foundation/text/input/internal/TextLayoutState;Landroidx/compose/ui/unit/Density;ZZZZ)V", "clipboardManager", "Landroidx/compose/ui/platform/ClipboardManager;", "currentTextLayoutPositionInWindow", "Landroidx/compose/ui/geometry/Offset;", "getCurrentTextLayoutPositionInWindow-F1C5BW0", "()J", "<set-?>", "Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState$InputType;", "directDragGestureInitiator", "getDirectDragGestureInitiator", "()Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState$InputType;", "setDirectDragGestureInitiator", "(Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState$InputType;)V", "directDragGestureInitiator$delegate", "Landroidx/compose/runtime/MutableState;", "Landroidx/compose/foundation/text/Handle;", "draggingHandle", "getDraggingHandle", "()Landroidx/compose/foundation/text/Handle;", "setDraggingHandle", "(Landroidx/compose/foundation/text/Handle;)V", "draggingHandle$delegate", "editable", "getEditable", "()Z", "handleDragPosition", "getHandleDragPosition-F1C5BW0", "hapticFeedBack", "Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "setFocused", "(Z)V", "isInTouchMode", "setInTouchMode", "isInTouchMode$delegate", "pressInteraction", "Landroidx/compose/foundation/interaction/PressInteraction$Press;", "previousRawDragOffset", "", "previousSelectionLayout", "Landroidx/compose/foundation/text/selection/SelectionLayout;", "rawHandleDragPosition", "getRawHandleDragPosition-F1C5BW0", "setRawHandleDragPosition-k-4lQ0M", "(J)V", "rawHandleDragPosition$delegate", "receiveContentConfiguration", "Lkotlin/Function0;", "Landroidx/compose/foundation/content/internal/ReceiveContentConfiguration;", "getReceiveContentConfiguration", "()Lkotlin/jvm/functions/Function0;", "setReceiveContentConfiguration", "(Lkotlin/jvm/functions/Function0;)V", "showCursorHandle", "getShowCursorHandle", "setShowCursorHandle", "showCursorHandle$delegate", "startTextLayoutPositionInWindow", "getStartTextLayoutPositionInWindow-F1C5BW0", "setStartTextLayoutPositionInWindow-k-4lQ0M", "startTextLayoutPositionInWindow$delegate", "textLayoutCoordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "getTextLayoutCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "textToolbar", "Landroidx/compose/ui/platform/TextToolbar;", "Landroidx/compose/foundation/text/input/internal/selection/TextToolbarState;", "textToolbarState", "getTextToolbarState", "()Landroidx/compose/foundation/text/input/internal/selection/TextToolbarState;", "setTextToolbarState", "(Landroidx/compose/foundation/text/input/internal/selection/TextToolbarState;)V", "textToolbarState$delegate", "canCopy", "canCut", "canPaste", "canSelectAll", "clearHandleDragging", "", "copy", "cancelSelection", "cut", "deselect", "dispose", "getContentRect", "Landroidx/compose/ui/geometry/Rect;", "getCursorHandleState", "Landroidx/compose/foundation/text/input/internal/selection/TextFieldHandleState;", "includePosition", "getCursorHandleState$foundation_release", "getCursorRect", "getHandlePosition", "isStartHandle", "getHandlePosition-tuRUvjQ", "(Z)J", "getSelectionHandleState", "getSelectionHandleState$foundation_release", "getTextFieldSelection", "Landroidx/compose/ui/text/TextRange;", "rawStartOffset", "rawEndOffset", "previousSelection", "adjustment", "Landroidx/compose/foundation/text/selection/SelectionAdjustment;", "getTextFieldSelection-qeG_v_k", "(IILandroidx/compose/ui/text/TextRange;ZLandroidx/compose/foundation/text/selection/SelectionAdjustment;)J", "hideTextToolbar", "isCursorHandleInVisibleBounds", "markStartContentVisibleOffset", "menuItem", "desiredState", "operation", "observeChanges", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "observeTextChanges", "observeTextToolbarVisibility", "paste", "pasteAsPlainText", "placeCursorAtNearestOffset", TypedValues.CycleType.S_WAVE_OFFSET, "placeCursorAtNearestOffset-k-4lQ0M", "(J)Z", "selectAll", "showTextToolbar", "contentRect", "update", "updateHandleDragging", "handle", "position", "updateHandleDragging-Uv8p0NA", "(Landroidx/compose/foundation/text/Handle;J)V", "updateSelection", "textFieldCharSequence", "Landroidx/compose/foundation/text/input/TextFieldCharSequence;", "startOffset", "endOffset", "allowPreviousSelectionCollapsed", "isStartOfSelection", "updateSelection-SsL-Rf8", "(Landroidx/compose/foundation/text/input/TextFieldCharSequence;IIZLandroidx/compose/foundation/text/selection/SelectionAdjustment;ZZ)J", "updateTextToolbarState", "cursorHandleGestures", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "detectCursorHandleDragGestures", "detectSelectionHandleDragGestures", "(Landroidx/compose/ui/input/pointer/PointerInputScope;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "detectTextFieldTapGestures", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "requestFocus", "showKeyboard", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "detectTouchMode", "selectionHandleGestures", "textFieldSelectionGestures", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "InputType", "TextFieldMouseSelectionObserver", "TextFieldTextDragObserver", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class TextFieldSelectionState {
    public static final int $stable = 8;
    private ClipboardManager clipboardManager;
    private Density density;

    /* renamed from: directDragGestureInitiator$delegate, reason: from kotlin metadata */
    private final MutableState directDragGestureInitiator;

    /* renamed from: draggingHandle$delegate, reason: from kotlin metadata */
    private final MutableState draggingHandle;
    private boolean enabled;
    private HapticFeedback hapticFeedBack;
    private boolean isFocused;

    /* renamed from: isInTouchMode$delegate, reason: from kotlin metadata */
    private final MutableState isInTouchMode;
    private boolean isPassword;
    private PressInteraction.Press pressInteraction;
    private int previousRawDragOffset;
    private SelectionLayout previousSelectionLayout;

    /* renamed from: rawHandleDragPosition$delegate, reason: from kotlin metadata */
    private final MutableState rawHandleDragPosition;
    private boolean readOnly;
    private Function0<? extends ReceiveContentConfiguration> receiveContentConfiguration;

    /* renamed from: showCursorHandle$delegate, reason: from kotlin metadata */
    private final MutableState showCursorHandle;

    /* renamed from: startTextLayoutPositionInWindow$delegate, reason: from kotlin metadata */
    private final MutableState startTextLayoutPositionInWindow;
    private final TransformedTextFieldState textFieldState;
    private final TextLayoutState textLayoutState;
    private TextToolbar textToolbar;

    /* renamed from: textToolbarState$delegate, reason: from kotlin metadata */
    private final MutableState textToolbarState;

    /* compiled from: TextFieldSelectionState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState$InputType;", "", "(Ljava/lang/String;I)V", "None", "Touch", "Mouse", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes.dex */
    public enum InputType {
        None,
        Touch,
        Mouse
    }

    /* compiled from: TextFieldSelectionState.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[IndexTransformationType.values().length];
            try {
                iArr[IndexTransformationType.Untransformed.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IndexTransformationType.Deletion.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IndexTransformationType.Insertion.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[IndexTransformationType.Replacement.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public TextFieldSelectionState(TransformedTextFieldState transformedTextFieldState, TextLayoutState textLayoutState, Density density, boolean z, boolean z2, boolean z3, boolean z4) {
        MutableState mutableStateOf$default;
        MutableState mutableStateOf$default2;
        MutableState mutableStateOf$default3;
        MutableState mutableStateOf$default4;
        MutableState mutableStateOf$default5;
        MutableState mutableStateOf$default6;
        MutableState mutableStateOf$default7;
        this.textFieldState = transformedTextFieldState;
        this.textLayoutState = textLayoutState;
        this.density = density;
        this.enabled = z;
        this.readOnly = z2;
        this.isFocused = z3;
        this.isPassword = z4;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(true, null, 2, null);
        this.isInTouchMode = mutableStateOf$default;
        mutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Offset.m4263boximpl(Offset.INSTANCE.m4289getUnspecifiedF1C5BW0()), null, 2, null);
        this.startTextLayoutPositionInWindow = mutableStateOf$default2;
        mutableStateOf$default3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Offset.m4263boximpl(Offset.INSTANCE.m4289getUnspecifiedF1C5BW0()), null, 2, null);
        this.rawHandleDragPosition = mutableStateOf$default3;
        mutableStateOf$default4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.draggingHandle = mutableStateOf$default4;
        mutableStateOf$default5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(InputType.None, null, 2, null);
        this.directDragGestureInitiator = mutableStateOf$default5;
        mutableStateOf$default6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
        this.showCursorHandle = mutableStateOf$default6;
        mutableStateOf$default7 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(TextToolbarState.None, null, 2, null);
        this.textToolbarState = mutableStateOf$default7;
        this.previousRawDragOffset = -1;
    }

    /* renamed from: isFocused, reason: from getter */
    public final boolean getIsFocused() {
        return this.isFocused;
    }

    public final void setFocused(boolean z) {
        this.isFocused = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isInTouchMode() {
        return ((Boolean) this.isInTouchMode.getValue()).booleanValue();
    }

    public final void setInTouchMode(boolean z) {
        this.isInTouchMode.setValue(Boolean.valueOf(z));
    }

    public final Function0<ReceiveContentConfiguration> getReceiveContentConfiguration() {
        return this.receiveContentConfiguration;
    }

    public final void setReceiveContentConfiguration(Function0<? extends ReceiveContentConfiguration> function0) {
        this.receiveContentConfiguration = function0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getStartTextLayoutPositionInWindow-F1C5BW0, reason: not valid java name */
    private final long m1566getStartTextLayoutPositionInWindowF1C5BW0() {
        return ((Offset) this.startTextLayoutPositionInWindow.getValue()).getPackedValue();
    }

    /* renamed from: setStartTextLayoutPositionInWindow-k-4lQ0M, reason: not valid java name */
    private final void m1570setStartTextLayoutPositionInWindowk4lQ0M(long j) {
        this.startTextLayoutPositionInWindow.setValue(Offset.m4263boximpl(j));
    }

    /* renamed from: getCurrentTextLayoutPositionInWindow-F1C5BW0, reason: not valid java name */
    private final long m1563getCurrentTextLayoutPositionInWindowF1C5BW0() {
        LayoutCoordinates textLayoutCoordinates = getTextLayoutCoordinates();
        return textLayoutCoordinates != null ? LayoutCoordinatesKt.positionInWindow(textLayoutCoordinates) : Offset.INSTANCE.m4289getUnspecifiedF1C5BW0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getRawHandleDragPosition-F1C5BW0, reason: not valid java name */
    private final long m1565getRawHandleDragPositionF1C5BW0() {
        return ((Offset) this.rawHandleDragPosition.getValue()).getPackedValue();
    }

    /* renamed from: setRawHandleDragPosition-k-4lQ0M, reason: not valid java name */
    private final void m1569setRawHandleDragPositionk4lQ0M(long j) {
        this.rawHandleDragPosition.setValue(Offset.m4263boximpl(j));
    }

    /* renamed from: getHandleDragPosition-F1C5BW0, reason: not valid java name */
    public final long m1573getHandleDragPositionF1C5BW0() {
        if (OffsetKt.m4295isUnspecifiedk4lQ0M(m1565getRawHandleDragPositionF1C5BW0())) {
            return Offset.INSTANCE.m4289getUnspecifiedF1C5BW0();
        }
        if (OffsetKt.m4295isUnspecifiedk4lQ0M(m1566getStartTextLayoutPositionInWindowF1C5BW0())) {
            return TextLayoutStateKt.m1525fromDecorationToTextLayoutUv8p0NA(this.textLayoutState, m1565getRawHandleDragPositionF1C5BW0());
        }
        return Offset.m4279plusMKHz9U(m1565getRawHandleDragPositionF1C5BW0(), Offset.m4278minusMKHz9U(m1566getStartTextLayoutPositionInWindowF1C5BW0(), m1563getCurrentTextLayoutPositionInWindowF1C5BW0()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Handle getDraggingHandle() {
        return (Handle) this.draggingHandle.getValue();
    }

    public final void setDraggingHandle(Handle handle) {
        this.draggingHandle.setValue(handle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final InputType getDirectDragGestureInitiator() {
        return (InputType) this.directDragGestureInitiator.getValue();
    }

    public final void setDirectDragGestureInitiator(InputType inputType) {
        this.directDragGestureInitiator.setValue(inputType);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean getShowCursorHandle() {
        return ((Boolean) this.showCursorHandle.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setShowCursorHandle(boolean z) {
        this.showCursorHandle.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final TextToolbarState getTextToolbarState() {
        return (TextToolbarState) this.textToolbarState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setTextToolbarState(TextToolbarState textToolbarState) {
        this.textToolbarState.setValue(textToolbarState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LayoutCoordinates getTextLayoutCoordinates() {
        LayoutCoordinates textLayoutNodeCoordinates = this.textLayoutState.getTextLayoutNodeCoordinates();
        if (textLayoutNodeCoordinates == null || !textLayoutNodeCoordinates.isAttached()) {
            return null;
        }
        return textLayoutNodeCoordinates;
    }

    private final boolean getEditable() {
        return this.enabled && !this.readOnly;
    }

    public final TextFieldHandleState getCursorHandleState$foundation_release(boolean includePosition) {
        TextFieldCharSequence visualText = this.textFieldState.getVisualText();
        boolean showCursorHandle = getShowCursorHandle();
        boolean z = getDirectDragGestureInitiator() == InputType.None;
        Handle draggingHandle = getDraggingHandle();
        if (!showCursorHandle || !z || !TextRange.m6454getCollapsedimpl(visualText.getSelection()) || !visualText.shouldShowSelection() || visualText.length() <= 0 || (draggingHandle != Handle.Cursor && !isCursorHandleInVisibleBounds())) {
            return TextFieldHandleState.INSTANCE.getHidden();
        }
        return new TextFieldHandleState(true, includePosition ? getCursorRect().m4301getBottomCenterF1C5BW0() : Offset.INSTANCE.m4289getUnspecifiedF1C5BW0(), ResolvedTextDirection.Ltr, false, null);
    }

    private final boolean isCursorHandleInVisibleBounds() {
        Rect visibleBounds;
        Snapshot.Companion companion = Snapshot.INSTANCE;
        Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
        Function1<Object, Unit> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
        Snapshot makeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
        try {
            long m4301getBottomCenterF1C5BW0 = getCursorRect().m4301getBottomCenterF1C5BW0();
            companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
            LayoutCoordinates textLayoutCoordinates = getTextLayoutCoordinates();
            if (textLayoutCoordinates == null || (visibleBounds = SelectionManagerKt.visibleBounds(textLayoutCoordinates)) == null) {
                return false;
            }
            return SelectionManagerKt.m1684containsInclusiveUv8p0NA(visibleBounds, m4301getBottomCenterF1C5BW0);
        } catch (Throwable th) {
            companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
            throw th;
        }
    }

    public final Rect getCursorRect() {
        float right;
        TextLayoutResult layoutResult = this.textLayoutState.getLayoutResult();
        if (layoutResult == null) {
            return Rect.INSTANCE.getZero();
        }
        TextFieldCharSequence visualText = this.textFieldState.getVisualText();
        if (!TextRange.m6454getCollapsedimpl(visualText.getSelection())) {
            return Rect.INSTANCE.getZero();
        }
        Rect cursorRect = layoutResult.getCursorRect(TextRange.m6460getStartimpl(visualText.getSelection()));
        float mo677toPx0680j_4 = this.density.mo677toPx0680j_4(TextFieldCursorKt.getDefaultCursorThickness());
        if (layoutResult.getLayoutInput().getLayoutDirection() == LayoutDirection.Ltr) {
            right = cursorRect.getLeft() + (mo677toPx0680j_4 / 2);
        } else {
            right = cursorRect.getRight() - (mo677toPx0680j_4 / 2);
        }
        float f = mo677toPx0680j_4 / 2;
        float coerceAtLeast = RangesKt.coerceAtLeast(RangesKt.coerceAtMost(right, IntSize.m7167getWidthimpl(layoutResult.getSize()) - f), f);
        return new Rect(coerceAtLeast - f, cursorRect.getTop(), coerceAtLeast + f, cursorRect.getBottom());
    }

    public final void update(HapticFeedback hapticFeedBack, ClipboardManager clipboardManager, TextToolbar textToolbar, Density density, boolean enabled, boolean readOnly, boolean isPassword) {
        if (!enabled) {
            hideTextToolbar();
        }
        this.hapticFeedBack = hapticFeedBack;
        this.clipboardManager = clipboardManager;
        this.textToolbar = textToolbar;
        this.density = density;
        this.enabled = enabled;
        this.readOnly = readOnly;
        this.isPassword = isPassword;
    }

    public final Object cursorHandleGestures(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
        Object coroutineScope = CoroutineScopeKt.coroutineScope(new TextFieldSelectionState$cursorHandleGestures$2(this, pointerInputScope, null), continuation);
        return coroutineScope == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? coroutineScope : Unit.INSTANCE;
    }

    public final Object selectionHandleGestures(PointerInputScope pointerInputScope, boolean z, Continuation<? super Unit> continuation) {
        Object coroutineScope = CoroutineScopeKt.coroutineScope(new TextFieldSelectionState$selectionHandleGestures$2(this, pointerInputScope, z, null), continuation);
        return coroutineScope == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? coroutineScope : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object observeChanges(kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$observeChanges$1
            if (r0 == 0) goto L14
            r0 = r6
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$observeChanges$1 r0 = (androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$observeChanges$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r6 = r0.label
            int r6 = r6 - r2
            r0.label = r6
            goto L19
        L14:
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$observeChanges$1 r0 = new androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$observeChanges$1
            r0.<init>(r5, r6)
        L19:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 != r4) goto L31
            java.lang.Object r0 = r0.L$0
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r0 = (androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState) r0
            kotlin.ResultKt.throwOnFailure(r6)     // Catch: java.lang.Throwable -> L2f
            goto L51
        L2f:
            r6 = move-exception
            goto L64
        L31:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L3a:
            kotlin.ResultKt.throwOnFailure(r6)
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$observeChanges$2 r6 = new androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$observeChanges$2     // Catch: java.lang.Throwable -> L62
            r2 = 0
            r6.<init>(r5, r2)     // Catch: java.lang.Throwable -> L62
            kotlin.jvm.functions.Function2 r6 = (kotlin.jvm.functions.Function2) r6     // Catch: java.lang.Throwable -> L62
            r0.L$0 = r5     // Catch: java.lang.Throwable -> L62
            r0.label = r4     // Catch: java.lang.Throwable -> L62
            java.lang.Object r6 = kotlinx.coroutines.CoroutineScopeKt.coroutineScope(r6, r0)     // Catch: java.lang.Throwable -> L62
            if (r6 != r1) goto L50
            return r1
        L50:
            r0 = r5
        L51:
            r0.setShowCursorHandle(r3)
            androidx.compose.foundation.text.input.internal.selection.TextToolbarState r6 = r0.getTextToolbarState()
            androidx.compose.foundation.text.input.internal.selection.TextToolbarState r1 = androidx.compose.foundation.text.input.internal.selection.TextToolbarState.None
            if (r6 == r1) goto L5f
            r0.hideTextToolbar()
        L5f:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        L62:
            r6 = move-exception
            r0 = r5
        L64:
            r0.setShowCursorHandle(r3)
            androidx.compose.foundation.text.input.internal.selection.TextToolbarState r1 = r0.getTextToolbarState()
            androidx.compose.foundation.text.input.internal.selection.TextToolbarState r2 = androidx.compose.foundation.text.input.internal.selection.TextToolbarState.None
            if (r1 == r2) goto L72
            r0.hideTextToolbar()
        L72:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.observeChanges(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void updateTextToolbarState(TextToolbarState textToolbarState) {
        setTextToolbarState(textToolbarState);
    }

    public final void dispose() {
        hideTextToolbar();
        this.textToolbar = null;
        this.clipboardManager = null;
        this.hapticFeedBack = null;
    }

    public final Object detectTouchMode(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
        Object awaitPointerEventScope = pointerInputScope.awaitPointerEventScope(new TextFieldSelectionState$detectTouchMode$2(this, null), continuation);
        return awaitPointerEventScope == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? awaitPointerEventScope : Unit.INSTANCE;
    }

    public final Object detectTextFieldTapGestures(PointerInputScope pointerInputScope, MutableInteractionSource mutableInteractionSource, final Function0<Unit> function0, final Function0<Unit> function02, Continuation<? super Unit> continuation) {
        Object detectTapAndPress = TapGestureDetectorKt.detectTapAndPress(pointerInputScope, new TextFieldSelectionState$detectTextFieldTapGestures$2(mutableInteractionSource, this, null), new Function1<Offset, Unit>() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectTextFieldTapGestures$3
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Offset offset) {
                m1586invokek4lQ0M(offset.getPackedValue());
                return Unit.INSTANCE;
            }

            /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
            public final void m1586invokek4lQ0M(long j) {
                boolean z;
                TextFieldSelectionStateKt.logDebug(new Function0<String>() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectTextFieldTapGestures$3.1
                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "onTapTextField";
                    }
                });
                function0.invoke();
                if (this.enabled && this.getIsFocused()) {
                    z = this.readOnly;
                    if (!z) {
                        function02.invoke();
                        if (this.textFieldState.getVisualText().length() > 0) {
                            this.setShowCursorHandle(true);
                        }
                    }
                    this.updateTextToolbarState(TextToolbarState.None);
                    long m1518coercedInVisibleBoundsOfInputTextMKHz9U$foundation_release = this.textLayoutState.m1518coercedInVisibleBoundsOfInputTextMKHz9U$foundation_release(j);
                    TextFieldSelectionState textFieldSelectionState = this;
                    textFieldSelectionState.m1568placeCursorAtNearestOffsetk4lQ0M(TextLayoutStateKt.m1525fromDecorationToTextLayoutUv8p0NA(textFieldSelectionState.textLayoutState, m1518coercedInVisibleBoundsOfInputTextMKHz9U$foundation_release));
                }
            }
        }, continuation);
        return detectTapAndPress == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? detectTapAndPress : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: placeCursorAtNearestOffset-k-4lQ0M, reason: not valid java name */
    public final boolean m1568placeCursorAtNearestOffsetk4lQ0M(long offset) {
        int m6432getOffsetForPositionk4lQ0M;
        IndexTransformationType indexTransformationType;
        int m6460getStartimpl;
        SelectionWedgeAffinity selectionWedgeAffinity;
        TextLayoutResult layoutResult = this.textLayoutState.getLayoutResult();
        if (layoutResult == null || (m6432getOffsetForPositionk4lQ0M = layoutResult.m6432getOffsetForPositionk4lQ0M(offset)) == -1) {
            return false;
        }
        TransformedTextFieldState transformedTextFieldState = this.textFieldState;
        long m1532mapFromTransformedjx7JFs = transformedTextFieldState.m1532mapFromTransformedjx7JFs(m6432getOffsetForPositionk4lQ0M);
        long m1535mapToTransformedGEjPoXI = transformedTextFieldState.m1535mapToTransformedGEjPoXI(m1532mapFromTransformedjx7JFs);
        if (TextRange.m6454getCollapsedimpl(m1532mapFromTransformedjx7JFs) && TextRange.m6454getCollapsedimpl(m1535mapToTransformedGEjPoXI)) {
            indexTransformationType = IndexTransformationType.Untransformed;
        } else if (!TextRange.m6454getCollapsedimpl(m1532mapFromTransformedjx7JFs) && !TextRange.m6454getCollapsedimpl(m1535mapToTransformedGEjPoXI)) {
            indexTransformationType = IndexTransformationType.Replacement;
        } else if (TextRange.m6454getCollapsedimpl(m1532mapFromTransformedjx7JFs) && !TextRange.m6454getCollapsedimpl(m1535mapToTransformedGEjPoXI)) {
            indexTransformationType = IndexTransformationType.Insertion;
        } else {
            indexTransformationType = IndexTransformationType.Deletion;
        }
        int i = WhenMappings.$EnumSwitchMapping$0[indexTransformationType.ordinal()];
        SelectionWedgeAffinity selectionWedgeAffinity2 = null;
        if (i == 1) {
            m6460getStartimpl = TextRange.m6460getStartimpl(m1532mapFromTransformedjx7JFs);
        } else if (i == 2) {
            m6460getStartimpl = TextRange.m6460getStartimpl(m1532mapFromTransformedjx7JFs);
        } else if (i == 3) {
            if (MathUtilsKt.m1480findClosestRect9KIMszo(offset, layoutResult.getCursorRect(TextRange.m6460getStartimpl(m1535mapToTransformedGEjPoXI)), layoutResult.getCursorRect(TextRange.m6455getEndimpl(m1535mapToTransformedGEjPoXI))) < 0) {
                selectionWedgeAffinity = new SelectionWedgeAffinity(WedgeAffinity.Start);
            } else {
                selectionWedgeAffinity = new SelectionWedgeAffinity(WedgeAffinity.End);
            }
            selectionWedgeAffinity2 = selectionWedgeAffinity;
            m6460getStartimpl = TextRange.m6460getStartimpl(m1532mapFromTransformedjx7JFs);
        } else {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            if (MathUtilsKt.m1480findClosestRect9KIMszo(offset, layoutResult.getCursorRect(TextRange.m6460getStartimpl(m1535mapToTransformedGEjPoXI)), layoutResult.getCursorRect(TextRange.m6455getEndimpl(m1535mapToTransformedGEjPoXI))) < 0) {
                m6460getStartimpl = TextRange.m6460getStartimpl(m1532mapFromTransformedjx7JFs);
            } else {
                m6460getStartimpl = TextRange.m6455getEndimpl(m1532mapFromTransformedjx7JFs);
            }
        }
        long TextRange = TextRangeKt.TextRange(m6460getStartimpl);
        if (TextRange.m6453equalsimpl0(TextRange, this.textFieldState.getUntransformedText().getSelection()) && (selectionWedgeAffinity2 == null || Intrinsics.areEqual(selectionWedgeAffinity2, this.textFieldState.getSelectionWedgeAffinity()))) {
            return false;
        }
        this.textFieldState.m1538selectUntransformedCharsIn5zctL8(TextRange);
        if (selectionWedgeAffinity2 != null) {
            this.textFieldState.setSelectionWedgeAffinity(selectionWedgeAffinity2);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object detectCursorHandleDragGestures(androidx.compose.ui.input.pointer.PointerInputScope r10, kotlin.coroutines.Continuation<? super kotlin.Unit> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectCursorHandleDragGestures$1
            if (r0 == 0) goto L14
            r0 = r11
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectCursorHandleDragGestures$1 r0 = (androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectCursorHandleDragGestures$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r11 = r0.label
            int r11 = r11 - r2
            r0.label = r11
            goto L19
        L14:
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectCursorHandleDragGestures$1 r0 = new androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectCursorHandleDragGestures$1
            r0.<init>(r9, r11)
        L19:
            r6 = r0
            java.lang.Object r11 = r6.result
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.label
            r2 = 1
            if (r1 == 0) goto L43
            if (r1 != r2) goto L3a
            java.lang.Object r10 = r6.L$2
            kotlin.jvm.internal.Ref$LongRef r10 = (kotlin.jvm.internal.Ref.LongRef) r10
            java.lang.Object r0 = r6.L$1
            kotlin.jvm.internal.Ref$LongRef r0 = (kotlin.jvm.internal.Ref.LongRef) r0
            java.lang.Object r1 = r6.L$0
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r1 = (androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState) r1
            kotlin.ResultKt.throwOnFailure(r11)     // Catch: java.lang.Throwable -> L37
            goto L97
        L37:
            r11 = move-exception
            goto La2
        L3a:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L43:
            kotlin.ResultKt.throwOnFailure(r11)
            kotlin.jvm.internal.Ref$LongRef r11 = new kotlin.jvm.internal.Ref$LongRef
            r11.<init>()
            androidx.compose.ui.geometry.Offset$Companion r1 = androidx.compose.ui.geometry.Offset.INSTANCE
            long r3 = r1.m4289getUnspecifiedF1C5BW0()
            r11.element = r3
            kotlin.jvm.internal.Ref$LongRef r7 = new kotlin.jvm.internal.Ref$LongRef
            r7.<init>()
            androidx.compose.ui.geometry.Offset$Companion r1 = androidx.compose.ui.geometry.Offset.INSTANCE
            long r3 = r1.m4289getUnspecifiedF1C5BW0()
            r7.element = r3
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectCursorHandleDragGestures$2 r1 = new androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectCursorHandleDragGestures$2     // Catch: java.lang.Throwable -> L9d
            r1.<init>()     // Catch: java.lang.Throwable -> L9d
            r3 = r1
            kotlin.jvm.functions.Function1 r3 = (kotlin.jvm.functions.Function1) r3     // Catch: java.lang.Throwable -> L9d
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectCursorHandleDragGestures$3 r1 = new androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectCursorHandleDragGestures$3     // Catch: java.lang.Throwable -> L9d
            r1.<init>()     // Catch: java.lang.Throwable -> L9d
            r4 = r1
            kotlin.jvm.functions.Function0 r4 = (kotlin.jvm.functions.Function0) r4     // Catch: java.lang.Throwable -> L9d
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectCursorHandleDragGestures$4 r1 = new androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectCursorHandleDragGestures$4     // Catch: java.lang.Throwable -> L9d
            r1.<init>()     // Catch: java.lang.Throwable -> L9d
            r5 = r1
            kotlin.jvm.functions.Function0 r5 = (kotlin.jvm.functions.Function0) r5     // Catch: java.lang.Throwable -> L9d
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectCursorHandleDragGestures$5 r1 = new androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectCursorHandleDragGestures$5     // Catch: java.lang.Throwable -> L9d
            r1.<init>()     // Catch: java.lang.Throwable -> L9d
            r8 = r1
            kotlin.jvm.functions.Function2 r8 = (kotlin.jvm.functions.Function2) r8     // Catch: java.lang.Throwable -> L9d
            r6.L$0 = r9     // Catch: java.lang.Throwable -> L9d
            r6.L$1 = r11     // Catch: java.lang.Throwable -> L9d
            r6.L$2 = r7     // Catch: java.lang.Throwable -> L9d
            r6.label = r2     // Catch: java.lang.Throwable -> L9d
            r1 = r10
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r8
            java.lang.Object r10 = androidx.compose.foundation.gestures.DragGestureDetectorKt.detectDragGestures(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L9d
            if (r10 != r0) goto L94
            return r0
        L94:
            r1 = r9
            r0 = r11
            r10 = r7
        L97:
            detectCursorHandleDragGestures$onDragStop(r0, r10, r1)
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
            return r10
        L9d:
            r10 = move-exception
            r1 = r9
            r0 = r11
            r11 = r10
            r10 = r7
        La2:
            detectCursorHandleDragGestures$onDragStop(r0, r10, r1)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.detectCursorHandleDragGestures(androidx.compose.ui.input.pointer.PointerInputScope, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void detectCursorHandleDragGestures$onDragStop(Ref.LongRef longRef, Ref.LongRef longRef2, TextFieldSelectionState textFieldSelectionState) {
        if (OffsetKt.m4293isSpecifiedk4lQ0M(longRef.element)) {
            longRef.element = Offset.INSTANCE.m4289getUnspecifiedF1C5BW0();
            longRef2.element = Offset.INSTANCE.m4289getUnspecifiedF1C5BW0();
            textFieldSelectionState.clearHandleDragging();
        }
    }

    public final Object textFieldSelectionGestures(PointerInputScope pointerInputScope, Function0<Unit> function0, Continuation<? super Unit> continuation) {
        Object selectionGesturePointerInputBtf2 = SelectionGesturesKt.selectionGesturePointerInputBtf2(pointerInputScope, new TextFieldMouseSelectionObserver(function0), new TextFieldTextDragObserver(function0), continuation);
        return selectionGesturePointerInputBtf2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? selectionGesturePointerInputBtf2 : Unit.INSTANCE;
    }

    /* compiled from: TextFieldSelectionState.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\"\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0012\u001a\u00020\u0004H\u0016J\u001a\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\tH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0017\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\tH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0016J\"\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0011J*\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\fH\u0002ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\u00020\tX\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\nR\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006 "}, d2 = {"Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState$TextFieldMouseSelectionObserver;", "Landroidx/compose/foundation/text/selection/MouseSelectionObserver;", "requestFocus", "Lkotlin/Function0;", "", "(Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;Lkotlin/jvm/functions/Function0;)V", "dragBeginOffsetInText", "", "dragBeginPosition", "Landroidx/compose/ui/geometry/Offset;", "J", "onDrag", "", "dragPosition", "adjustment", "Landroidx/compose/foundation/text/selection/SelectionAdjustment;", "onDrag-3MmeM6k", "(JLandroidx/compose/foundation/text/selection/SelectionAdjustment;)Z", "onDragDone", "onExtend", "downPosition", "onExtend-k-4lQ0M", "(J)Z", "onExtendDrag", "onExtendDrag-k-4lQ0M", "onStart", "onStart-3MmeM6k", "updateSelection", "Landroidx/compose/ui/text/TextRange;", "isStartOfSelection", "updateSelection-r1Wruf4", "(JLandroidx/compose/foundation/text/selection/SelectionAdjustment;Z)J", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes.dex */
    private final class TextFieldMouseSelectionObserver implements MouseSelectionObserver {
        private int dragBeginOffsetInText = -1;
        private long dragBeginPosition = Offset.INSTANCE.m4289getUnspecifiedF1C5BW0();
        private final Function0<Unit> requestFocus;

        public TextFieldMouseSelectionObserver(Function0<Unit> function0) {
            this.requestFocus = function0;
        }

        @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
        /* renamed from: onStart-3MmeM6k, reason: not valid java name */
        public boolean mo1579onStart3MmeM6k(long downPosition, SelectionAdjustment adjustment) {
            if (!TextFieldSelectionState.this.enabled || TextFieldSelectionState.this.textFieldState.getVisualText().length() == 0) {
                return false;
            }
            TextFieldSelectionStateKt.logDebug(new Function0<String>() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$TextFieldMouseSelectionObserver$onStart$1
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Mouse.onStart";
                }
            });
            TextFieldSelectionState.this.setDirectDragGestureInitiator(InputType.Mouse);
            this.requestFocus.invoke();
            TextFieldSelectionState.this.previousRawDragOffset = -1;
            this.dragBeginOffsetInText = -1;
            this.dragBeginPosition = downPosition;
            this.dragBeginOffsetInText = TextRange.m6460getStartimpl(m1575updateSelectionr1Wruf4(downPosition, adjustment, true));
            return true;
        }

        @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
        /* renamed from: onDrag-3MmeM6k, reason: not valid java name */
        public boolean mo1576onDrag3MmeM6k(final long dragPosition, SelectionAdjustment adjustment) {
            if (!TextFieldSelectionState.this.enabled || TextFieldSelectionState.this.textFieldState.getVisualText().length() == 0) {
                return false;
            }
            TextFieldSelectionStateKt.logDebug(new Function0<String>() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$TextFieldMouseSelectionObserver$onDrag$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Mouse.onDrag " + ((Object) Offset.m4282toStringimpl(dragPosition));
                }
            });
            m1575updateSelectionr1Wruf4(dragPosition, adjustment, false);
            return true;
        }

        /* renamed from: updateSelection-r1Wruf4, reason: not valid java name */
        private final long m1575updateSelectionr1Wruf4(long dragPosition, SelectionAdjustment adjustment, boolean isStartOfSelection) {
            Integer valueOf = Integer.valueOf(this.dragBeginOffsetInText);
            if (valueOf.intValue() < 0) {
                valueOf = null;
            }
            int intValue = valueOf != null ? valueOf.intValue() : TextFieldSelectionState.this.textLayoutState.m1520getOffsetForPosition3MmeM6k(this.dragBeginPosition, false);
            int m1520getOffsetForPosition3MmeM6k = TextFieldSelectionState.this.textLayoutState.m1520getOffsetForPosition3MmeM6k(dragPosition, false);
            TextFieldSelectionState textFieldSelectionState = TextFieldSelectionState.this;
            long m1571updateSelectionSsLRf8 = textFieldSelectionState.m1571updateSelectionSsLRf8(textFieldSelectionState.textFieldState.getVisualText(), intValue, m1520getOffsetForPosition3MmeM6k, false, adjustment, false, isStartOfSelection);
            if (this.dragBeginOffsetInText == -1 && !TextRange.m6454getCollapsedimpl(m1571updateSelectionSsLRf8)) {
                this.dragBeginOffsetInText = TextRange.m6460getStartimpl(m1571updateSelectionSsLRf8);
            }
            if (TextRange.m6459getReversedimpl(m1571updateSelectionSsLRf8)) {
                m1571updateSelectionSsLRf8 = TextFieldSelectionStateKt.m1588reverse5zctL8(m1571updateSelectionSsLRf8);
            }
            TextFieldSelectionState.this.textFieldState.m1537selectCharsIn5zctL8(m1571updateSelectionSsLRf8);
            TextFieldSelectionState.this.updateTextToolbarState(TextToolbarState.Selection);
            return m1571updateSelectionSsLRf8;
        }

        @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
        public void onDragDone() {
            TextFieldSelectionStateKt.logDebug(new Function0<String>() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$TextFieldMouseSelectionObserver$onDragDone$1
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Mouse.onDragDone";
                }
            });
            TextFieldSelectionState.this.setDirectDragGestureInitiator(InputType.None);
        }

        @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
        /* renamed from: onExtend-k-4lQ0M, reason: not valid java name */
        public boolean mo1577onExtendk4lQ0M(long downPosition) {
            TextFieldSelectionStateKt.logDebug(new Function0<String>() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$TextFieldMouseSelectionObserver$onExtend$1
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Mouse.onExtend";
                }
            });
            return true;
        }

        @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
        /* renamed from: onExtendDrag-k-4lQ0M, reason: not valid java name */
        public boolean mo1578onExtendDragk4lQ0M(long dragPosition) {
            TextFieldSelectionStateKt.logDebug(new Function0<String>() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$TextFieldMouseSelectionObserver$onExtendDrag$1
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Mouse.onExtendDrag";
                }
            });
            return true;
        }
    }

    /* compiled from: TextFieldSelectionState.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\b\u0010\u000e\u001a\u00020\u0004H\u0016J\u001a\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000bH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u000bH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0012J\b\u0010\u0016\u001a\u00020\u0004H\u0002J\u001a\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u000bH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u0012J\b\u0010\u001a\u001a\u00020\u0004H\u0016J\b\u0010\u001b\u001a\u00020\u0004H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\u00020\u000bX\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\fR\u0016\u0010\r\u001a\u00020\u000bX\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\fR\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001c"}, d2 = {"Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState$TextFieldTextDragObserver;", "Landroidx/compose/foundation/text/TextDragObserver;", "requestFocus", "Lkotlin/Function0;", "", "(Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;Lkotlin/jvm/functions/Function0;)V", "actingHandle", "Landroidx/compose/foundation/text/Handle;", "dragBeginOffsetInText", "", "dragBeginPosition", "Landroidx/compose/ui/geometry/Offset;", "J", "dragTotalDistance", "onCancel", "onDown", "point", "onDown-k-4lQ0M", "(J)V", "onDrag", "delta", "onDrag-k-4lQ0M", "onDragStop", "onStart", "startPoint", "onStart-k-4lQ0M", "onStop", "onUp", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes.dex */
    private final class TextFieldTextDragObserver implements TextDragObserver {
        private final Function0<Unit> requestFocus;
        private int dragBeginOffsetInText = -1;
        private long dragBeginPosition = Offset.INSTANCE.m4289getUnspecifiedF1C5BW0();
        private long dragTotalDistance = Offset.INSTANCE.m4290getZeroF1C5BW0();
        private Handle actingHandle = Handle.SelectionEnd;

        @Override // androidx.compose.foundation.text.TextDragObserver
        /* renamed from: onDown-k-4lQ0M */
        public void mo1362onDownk4lQ0M(long point) {
        }

        @Override // androidx.compose.foundation.text.TextDragObserver
        public void onUp() {
        }

        public TextFieldTextDragObserver(Function0<Unit> function0) {
            this.requestFocus = function0;
        }

        private final void onDragStop() {
            if (OffsetKt.m4293isSpecifiedk4lQ0M(this.dragBeginPosition)) {
                TextFieldSelectionStateKt.logDebug(new Function0<String>() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$TextFieldTextDragObserver$onDragStop$1
                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "Touch.onDragStop";
                    }
                });
                TextFieldSelectionState.this.clearHandleDragging();
                this.dragBeginOffsetInText = -1;
                this.dragBeginPosition = Offset.INSTANCE.m4289getUnspecifiedF1C5BW0();
                this.dragTotalDistance = Offset.INSTANCE.m4290getZeroF1C5BW0();
                TextFieldSelectionState.this.previousRawDragOffset = -1;
                TextFieldSelectionState.this.setDirectDragGestureInitiator(InputType.None);
                this.requestFocus.invoke();
            }
        }

        @Override // androidx.compose.foundation.text.TextDragObserver
        public void onStop() {
            onDragStop();
        }

        @Override // androidx.compose.foundation.text.TextDragObserver
        public void onCancel() {
            onDragStop();
        }

        @Override // androidx.compose.foundation.text.TextDragObserver
        /* renamed from: onStart-k-4lQ0M */
        public void mo1364onStartk4lQ0M(final long startPoint) {
            if (TextFieldSelectionState.this.enabled) {
                TextFieldSelectionStateKt.logDebug(new Function0<String>() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$TextFieldTextDragObserver$onStart$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "Touch.onDragStart after longPress at " + ((Object) Offset.m4282toStringimpl(startPoint));
                    }
                });
                TextFieldSelectionState.this.m1574updateHandleDraggingUv8p0NA(this.actingHandle, startPoint);
                TextFieldSelectionState.this.setShowCursorHandle(false);
                TextFieldSelectionState.this.setDirectDragGestureInitiator(InputType.Touch);
                this.dragBeginPosition = startPoint;
                this.dragTotalDistance = Offset.INSTANCE.m4290getZeroF1C5BW0();
                TextFieldSelectionState.this.previousRawDragOffset = -1;
                if (!TextFieldSelectionState.this.textLayoutState.m1521isPositionOnTextk4lQ0M(startPoint)) {
                    int m1517getOffsetForPosition3MmeM6k$default = TextLayoutState.m1517getOffsetForPosition3MmeM6k$default(TextFieldSelectionState.this.textLayoutState, startPoint, false, 2, null);
                    HapticFeedback hapticFeedback = TextFieldSelectionState.this.hapticFeedBack;
                    if (hapticFeedback != null) {
                        hapticFeedback.mo5243performHapticFeedbackCdsT49E(HapticFeedbackType.INSTANCE.m5252getTextHandleMove5zf0vsI());
                    }
                    TextFieldSelectionState.this.textFieldState.placeCursorBeforeCharAt(m1517getOffsetForPosition3MmeM6k$default);
                    TextFieldSelectionState.this.setShowCursorHandle(true);
                    TextFieldSelectionState.this.updateTextToolbarState(TextToolbarState.Cursor);
                    return;
                }
                if (TextFieldSelectionState.this.textFieldState.getVisualText().length() == 0) {
                    return;
                }
                int m1517getOffsetForPosition3MmeM6k$default2 = TextLayoutState.m1517getOffsetForPosition3MmeM6k$default(TextFieldSelectionState.this.textLayoutState, startPoint, false, 2, null);
                long m1572updateSelectionSsLRf8$default = TextFieldSelectionState.m1572updateSelectionSsLRf8$default(TextFieldSelectionState.this, new TextFieldCharSequence(TextFieldSelectionState.this.textFieldState.getVisualText(), TextRange.INSTANCE.m6465getZerod9O1mEE(), null, null, 12, null), m1517getOffsetForPosition3MmeM6k$default2, m1517getOffsetForPosition3MmeM6k$default2, false, SelectionAdjustment.INSTANCE.getWord(), false, false, 96, null);
                TextFieldSelectionState.this.textFieldState.m1537selectCharsIn5zctL8(m1572updateSelectionSsLRf8$default);
                TextFieldSelectionState.this.updateTextToolbarState(TextToolbarState.Selection);
                this.dragBeginOffsetInText = TextRange.m6460getStartimpl(m1572updateSelectionSsLRf8$default);
            }
        }

        @Override // androidx.compose.foundation.text.TextDragObserver
        /* renamed from: onDrag-k-4lQ0M */
        public void mo1363onDragk4lQ0M(long delta) {
            int intValue;
            int m1520getOffsetForPosition3MmeM6k;
            SelectionAdjustment word;
            Handle handle;
            if (!TextFieldSelectionState.this.enabled || TextFieldSelectionState.this.textFieldState.getVisualText().length() == 0) {
                return;
            }
            long m4279plusMKHz9U = Offset.m4279plusMKHz9U(this.dragTotalDistance, delta);
            this.dragTotalDistance = m4279plusMKHz9U;
            final long m4279plusMKHz9U2 = Offset.m4279plusMKHz9U(this.dragBeginPosition, m4279plusMKHz9U);
            TextFieldSelectionStateKt.logDebug(new Function0<String>() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$TextFieldTextDragObserver$onDrag$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Touch.onDrag at " + ((Object) Offset.m4282toStringimpl(m4279plusMKHz9U2));
                }
            });
            if (this.dragBeginOffsetInText < 0 && !TextFieldSelectionState.this.textLayoutState.m1521isPositionOnTextk4lQ0M(m4279plusMKHz9U2)) {
                intValue = TextLayoutState.m1517getOffsetForPosition3MmeM6k$default(TextFieldSelectionState.this.textLayoutState, this.dragBeginPosition, false, 2, null);
                m1520getOffsetForPosition3MmeM6k = TextLayoutState.m1517getOffsetForPosition3MmeM6k$default(TextFieldSelectionState.this.textLayoutState, m4279plusMKHz9U2, false, 2, null);
                if (intValue == m1520getOffsetForPosition3MmeM6k) {
                    word = SelectionAdjustment.INSTANCE.getNone();
                } else {
                    word = SelectionAdjustment.INSTANCE.getWord();
                }
            } else {
                Integer valueOf = Integer.valueOf(this.dragBeginOffsetInText);
                if (valueOf.intValue() < 0) {
                    valueOf = null;
                }
                intValue = valueOf != null ? valueOf.intValue() : TextFieldSelectionState.this.textLayoutState.m1520getOffsetForPosition3MmeM6k(this.dragBeginPosition, false);
                m1520getOffsetForPosition3MmeM6k = TextFieldSelectionState.this.textLayoutState.m1520getOffsetForPosition3MmeM6k(m4279plusMKHz9U2, false);
                if (this.dragBeginOffsetInText < 0 && intValue == m1520getOffsetForPosition3MmeM6k) {
                    return;
                }
                word = SelectionAdjustment.INSTANCE.getWord();
                TextFieldSelectionState.this.updateTextToolbarState(TextToolbarState.Selection);
            }
            int i = intValue;
            int i2 = m1520getOffsetForPosition3MmeM6k;
            SelectionAdjustment selectionAdjustment = word;
            long selection = TextFieldSelectionState.this.textFieldState.getVisualText().getSelection();
            TextFieldSelectionState textFieldSelectionState = TextFieldSelectionState.this;
            long m1572updateSelectionSsLRf8$default = TextFieldSelectionState.m1572updateSelectionSsLRf8$default(textFieldSelectionState, textFieldSelectionState.textFieldState.getVisualText(), i, i2, false, selectionAdjustment, false, false, 64, null);
            if (this.dragBeginOffsetInText == -1 && !TextRange.m6454getCollapsedimpl(m1572updateSelectionSsLRf8$default)) {
                this.dragBeginOffsetInText = TextRange.m6460getStartimpl(m1572updateSelectionSsLRf8$default);
            }
            if (TextRange.m6459getReversedimpl(m1572updateSelectionSsLRf8$default)) {
                m1572updateSelectionSsLRf8$default = TextFieldSelectionStateKt.m1588reverse5zctL8(m1572updateSelectionSsLRf8$default);
            }
            if (!TextRange.m6453equalsimpl0(m1572updateSelectionSsLRf8$default, selection)) {
                if (TextRange.m6460getStartimpl(m1572updateSelectionSsLRf8$default) != TextRange.m6460getStartimpl(selection) && TextRange.m6455getEndimpl(m1572updateSelectionSsLRf8$default) == TextRange.m6455getEndimpl(selection)) {
                    handle = Handle.SelectionStart;
                } else if (TextRange.m6460getStartimpl(m1572updateSelectionSsLRf8$default) == TextRange.m6460getStartimpl(selection) && TextRange.m6455getEndimpl(m1572updateSelectionSsLRf8$default) != TextRange.m6455getEndimpl(selection)) {
                    handle = Handle.SelectionEnd;
                } else if ((TextRange.m6460getStartimpl(m1572updateSelectionSsLRf8$default) + TextRange.m6455getEndimpl(m1572updateSelectionSsLRf8$default)) / 2.0f > (TextRange.m6460getStartimpl(selection) + TextRange.m6455getEndimpl(selection)) / 2.0f) {
                    handle = Handle.SelectionEnd;
                } else {
                    handle = Handle.SelectionStart;
                }
                this.actingHandle = handle;
            }
            if (TextRange.m6454getCollapsedimpl(selection) || !TextRange.m6454getCollapsedimpl(m1572updateSelectionSsLRf8$default)) {
                TextFieldSelectionState.this.textFieldState.m1537selectCharsIn5zctL8(m1572updateSelectionSsLRf8$default);
            }
            TextFieldSelectionState.this.m1574updateHandleDraggingUv8p0NA(this.actingHandle, m4279plusMKHz9U2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object detectSelectionHandleDragGestures(androidx.compose.ui.input.pointer.PointerInputScope r18, final boolean r19, kotlin.coroutines.Continuation<? super kotlin.Unit> r20) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.detectSelectionHandleDragGestures(androidx.compose.ui.input.pointer.PointerInputScope, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void detectSelectionHandleDragGestures$onDragStop$5(Ref.LongRef longRef, TextFieldSelectionState textFieldSelectionState, Ref.LongRef longRef2) {
        if (OffsetKt.m4293isSpecifiedk4lQ0M(longRef.element)) {
            textFieldSelectionState.clearHandleDragging();
            longRef.element = Offset.INSTANCE.m4289getUnspecifiedF1C5BW0();
            longRef2.element = Offset.INSTANCE.m4290getZeroF1C5BW0();
            textFieldSelectionState.previousRawDragOffset = -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object observeTextChanges(Continuation<? super Unit> continuation) {
        Object collect = FlowKt.drop(FlowKt.distinctUntilChanged(SnapshotStateKt.snapshotFlow(new Function0<TextFieldCharSequence>() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$observeTextChanges$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final TextFieldCharSequence invoke() {
                return TextFieldSelectionState.this.textFieldState.getVisualText();
            }
        }), TextFieldSelectionState$observeTextChanges$3.INSTANCE), 1).collect(new FlowCollector() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$observeTextChanges$4
            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation2) {
                return emit((TextFieldCharSequence) obj, (Continuation<? super Unit>) continuation2);
            }

            public final Object emit(TextFieldCharSequence textFieldCharSequence, Continuation<? super Unit> continuation2) {
                TextFieldSelectionState.this.setShowCursorHandle(false);
                TextFieldSelectionState.this.updateTextToolbarState(TextToolbarState.None);
                return Unit.INSTANCE;
            }
        }, continuation);
        return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object observeTextToolbarVisibility(Continuation<? super Unit> continuation) {
        Object collect = SnapshotStateKt.snapshotFlow(new Function0<Rect>() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$observeTextToolbarVisibility$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Code restructure failed: missing block: B:10:0x0041, code lost:
            
                if (r0 == null) goto L16;
             */
            /* JADX WARN: Code restructure failed: missing block: B:11:0x0043, code lost:
            
                r0 = androidx.compose.foundation.text.selection.SelectionManagerKt.visibleBounds(r0);
             */
            /* JADX WARN: Code restructure failed: missing block: B:12:0x0049, code lost:
            
                if (r0 == null) goto L30;
             */
            /* JADX WARN: Code restructure failed: missing block: B:13:0x004b, code lost:
            
                r2 = r6.this$0.getTextLayoutCoordinates();
             */
            /* JADX WARN: Code restructure failed: missing block: B:14:0x0051, code lost:
            
                if (r2 == null) goto L21;
             */
            /* JADX WARN: Code restructure failed: missing block: B:15:0x0053, code lost:
            
                r2 = androidx.compose.ui.geometry.Offset.m4263boximpl(r2.mo5862localToRootMKHz9U(r0.m4309getTopLeftF1C5BW0()));
             */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x0061, code lost:
            
                kotlin.jvm.internal.Intrinsics.checkNotNull(r2);
                r0 = androidx.compose.ui.geometry.RectKt.m4314Recttz77jQw(r2.getPackedValue(), r0.m4307getSizeNHjbRc());
                r2 = r6.this$0.getContentRect();
             */
            /* JADX WARN: Code restructure failed: missing block: B:17:0x007a, code lost:
            
                if (r0.overlaps(r2) == false) goto L25;
             */
            /* JADX WARN: Code restructure failed: missing block: B:18:0x007c, code lost:
            
                r1 = r2;
             */
            /* JADX WARN: Code restructure failed: missing block: B:19:0x007d, code lost:
            
                if (r1 == null) goto L29;
             */
            /* JADX WARN: Code restructure failed: missing block: B:20:0x007f, code lost:
            
                r0 = r1.intersect(r0);
             */
            /* JADX WARN: Code restructure failed: missing block: B:21:0x0083, code lost:
            
                if (r0 == null) goto L29;
             */
            /* JADX WARN: Code restructure failed: missing block: B:22:?, code lost:
            
                return r0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:25:?, code lost:
            
                return androidx.compose.ui.geometry.Rect.INSTANCE.getZero();
             */
            /* JADX WARN: Code restructure failed: missing block: B:26:0x0060, code lost:
            
                r2 = null;
             */
            /* JADX WARN: Code restructure failed: missing block: B:28:?, code lost:
            
                return androidx.compose.ui.geometry.Rect.INSTANCE.getZero();
             */
            /* JADX WARN: Code restructure failed: missing block: B:29:0x0048, code lost:
            
                r0 = null;
             */
            /* JADX WARN: Code restructure failed: missing block: B:34:0x0028, code lost:
            
                if (r0 == androidx.compose.foundation.text.input.internal.selection.TextToolbarState.Selection) goto L9;
             */
            /* JADX WARN: Code restructure failed: missing block: B:4:0x001c, code lost:
            
                if (r1 != androidx.compose.foundation.text.input.internal.selection.TextToolbarState.Cursor) goto L6;
             */
            /* JADX WARN: Code restructure failed: missing block: B:6:0x0030, code lost:
            
                if (r6.this$0.getDraggingHandle() != null) goto L31;
             */
            /* JADX WARN: Code restructure failed: missing block: B:8:0x0038, code lost:
            
                if (r6.this$0.isInTouchMode() == false) goto L31;
             */
            /* JADX WARN: Code restructure failed: missing block: B:9:0x003a, code lost:
            
                r0 = r6.this$0.getTextLayoutCoordinates();
                r1 = null;
             */
            @Override // kotlin.jvm.functions.Function0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final androidx.compose.ui.geometry.Rect invoke() {
                /*
                    r6 = this;
                    androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r0 = androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.this
                    androidx.compose.foundation.text.input.internal.TransformedTextFieldState r0 = androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.access$getTextFieldState$p(r0)
                    androidx.compose.foundation.text.input.TextFieldCharSequence r0 = r0.getVisualText()
                    long r0 = r0.getSelection()
                    boolean r0 = androidx.compose.ui.text.TextRange.m6454getCollapsedimpl(r0)
                    if (r0 == 0) goto L1e
                    androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r1 = androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.this
                    androidx.compose.foundation.text.input.internal.selection.TextToolbarState r1 = androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.access$getTextToolbarState(r1)
                    androidx.compose.foundation.text.input.internal.selection.TextToolbarState r2 = androidx.compose.foundation.text.input.internal.selection.TextToolbarState.Cursor
                    if (r1 == r2) goto L2a
                L1e:
                    if (r0 != 0) goto L94
                    androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r0 = androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.this
                    androidx.compose.foundation.text.input.internal.selection.TextToolbarState r0 = androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.access$getTextToolbarState(r0)
                    androidx.compose.foundation.text.input.internal.selection.TextToolbarState r1 = androidx.compose.foundation.text.input.internal.selection.TextToolbarState.Selection
                    if (r0 != r1) goto L94
                L2a:
                    androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r0 = androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.this
                    androidx.compose.foundation.text.Handle r0 = r0.getDraggingHandle()
                    if (r0 != 0) goto L94
                    androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r0 = androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.this
                    boolean r0 = r0.isInTouchMode()
                    if (r0 == 0) goto L94
                    androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r0 = androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.this
                    androidx.compose.ui.layout.LayoutCoordinates r0 = androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.access$getTextLayoutCoordinates(r0)
                    r1 = 0
                    if (r0 == 0) goto L48
                    androidx.compose.ui.geometry.Rect r0 = androidx.compose.foundation.text.selection.SelectionManagerKt.visibleBounds(r0)
                    goto L49
                L48:
                    r0 = r1
                L49:
                    if (r0 == 0) goto L8d
                    androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r2 = androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.this
                    androidx.compose.ui.layout.LayoutCoordinates r2 = androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.access$getTextLayoutCoordinates(r2)
                    if (r2 == 0) goto L60
                    long r3 = r0.m4309getTopLeftF1C5BW0()
                    long r2 = r2.mo5862localToRootMKHz9U(r3)
                    androidx.compose.ui.geometry.Offset r2 = androidx.compose.ui.geometry.Offset.m4263boximpl(r2)
                    goto L61
                L60:
                    r2 = r1
                L61:
                    kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
                    long r2 = r2.getPackedValue()
                    long r4 = r0.m4307getSizeNHjbRc()
                    androidx.compose.ui.geometry.Rect r0 = androidx.compose.ui.geometry.RectKt.m4314Recttz77jQw(r2, r4)
                    androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r2 = androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.this
                    androidx.compose.ui.geometry.Rect r2 = androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.access$getContentRect(r2)
                    boolean r3 = r0.overlaps(r2)
                    if (r3 == 0) goto L7d
                    r1 = r2
                L7d:
                    if (r1 == 0) goto L86
                    androidx.compose.ui.geometry.Rect r0 = r1.intersect(r0)
                    if (r0 == 0) goto L86
                    goto L9a
                L86:
                    androidx.compose.ui.geometry.Rect$Companion r0 = androidx.compose.ui.geometry.Rect.INSTANCE
                    androidx.compose.ui.geometry.Rect r0 = r0.getZero()
                    goto L9a
                L8d:
                    androidx.compose.ui.geometry.Rect$Companion r0 = androidx.compose.ui.geometry.Rect.INSTANCE
                    androidx.compose.ui.geometry.Rect r0 = r0.getZero()
                    goto L9a
                L94:
                    androidx.compose.ui.geometry.Rect$Companion r0 = androidx.compose.ui.geometry.Rect.INSTANCE
                    androidx.compose.ui.geometry.Rect r0 = r0.getZero()
                L9a:
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$observeTextToolbarVisibility$2.invoke():androidx.compose.ui.geometry.Rect");
            }
        }).collect(new FlowCollector() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$observeTextToolbarVisibility$3
            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation2) {
                return emit((Rect) obj, (Continuation<? super Unit>) continuation2);
            }

            public final Object emit(Rect rect, Continuation<? super Unit> continuation2) {
                if (Intrinsics.areEqual(rect, Rect.INSTANCE.getZero())) {
                    TextFieldSelectionState.this.hideTextToolbar();
                } else {
                    TextFieldSelectionState.this.showTextToolbar(rect);
                }
                return Unit.INSTANCE;
            }
        }, continuation);
        return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Rect getContentRect() {
        float f;
        Rect cursorRect;
        Rect cursorRect2;
        TextFieldCharSequence visualText = this.textFieldState.getVisualText();
        if (TextRange.m6454getCollapsedimpl(visualText.getSelection())) {
            Rect cursorRect3 = getCursorRect();
            LayoutCoordinates textLayoutCoordinates = getTextLayoutCoordinates();
            return RectKt.m4314Recttz77jQw(textLayoutCoordinates != null ? textLayoutCoordinates.mo5862localToRootMKHz9U(cursorRect3.m4309getTopLeftF1C5BW0()) : Offset.INSTANCE.m4290getZeroF1C5BW0(), cursorRect3.m4307getSizeNHjbRc());
        }
        LayoutCoordinates textLayoutCoordinates2 = getTextLayoutCoordinates();
        long mo5862localToRootMKHz9U = textLayoutCoordinates2 != null ? textLayoutCoordinates2.mo5862localToRootMKHz9U(m1564getHandlePositiontuRUvjQ(true)) : Offset.INSTANCE.m4290getZeroF1C5BW0();
        LayoutCoordinates textLayoutCoordinates3 = getTextLayoutCoordinates();
        long mo5862localToRootMKHz9U2 = textLayoutCoordinates3 != null ? textLayoutCoordinates3.mo5862localToRootMKHz9U(m1564getHandlePositiontuRUvjQ(false)) : Offset.INSTANCE.m4290getZeroF1C5BW0();
        LayoutCoordinates textLayoutCoordinates4 = getTextLayoutCoordinates();
        float f2 = 0.0f;
        if (textLayoutCoordinates4 != null) {
            TextLayoutResult layoutResult = this.textLayoutState.getLayoutResult();
            f = Offset.m4275getYimpl(textLayoutCoordinates4.mo5862localToRootMKHz9U(OffsetKt.Offset(0.0f, (layoutResult == null || (cursorRect2 = layoutResult.getCursorRect(TextRange.m6460getStartimpl(visualText.getSelection()))) == null) ? 0.0f : cursorRect2.getTop())));
        } else {
            f = 0.0f;
        }
        LayoutCoordinates textLayoutCoordinates5 = getTextLayoutCoordinates();
        if (textLayoutCoordinates5 != null) {
            TextLayoutResult layoutResult2 = this.textLayoutState.getLayoutResult();
            f2 = Offset.m4275getYimpl(textLayoutCoordinates5.mo5862localToRootMKHz9U(OffsetKt.Offset(0.0f, (layoutResult2 == null || (cursorRect = layoutResult2.getCursorRect(TextRange.m6455getEndimpl(visualText.getSelection()))) == null) ? 0.0f : cursorRect.getTop())));
        }
        return new Rect(Math.min(Offset.m4274getXimpl(mo5862localToRootMKHz9U), Offset.m4274getXimpl(mo5862localToRootMKHz9U2)), Math.min(f, f2), Math.max(Offset.m4274getXimpl(mo5862localToRootMKHz9U), Offset.m4274getXimpl(mo5862localToRootMKHz9U2)), Math.max(Offset.m4275getYimpl(mo5862localToRootMKHz9U), Offset.m4275getYimpl(mo5862localToRootMKHz9U2)));
    }

    public final TextFieldHandleState getSelectionHandleState$foundation_release(boolean isStartHandle, boolean includePosition) {
        Rect visibleBounds;
        LayoutCoordinates textLayoutCoordinates;
        Rect visibleBounds2;
        Handle handle = isStartHandle ? Handle.SelectionStart : Handle.SelectionEnd;
        TextLayoutResult layoutResult = this.textLayoutState.getLayoutResult();
        if (layoutResult == null) {
            return TextFieldHandleState.INSTANCE.getHidden();
        }
        long selection = this.textFieldState.getVisualText().getSelection();
        if (TextRange.m6454getCollapsedimpl(selection)) {
            return TextFieldHandleState.INSTANCE.getHidden();
        }
        long m1564getHandlePositiontuRUvjQ = m1564getHandlePositiontuRUvjQ(isStartHandle);
        if (getDirectDragGestureInitiator() != InputType.None || (getDraggingHandle() != handle && ((textLayoutCoordinates = getTextLayoutCoordinates()) == null || (visibleBounds2 = SelectionManagerKt.visibleBounds(textLayoutCoordinates)) == null || !SelectionManagerKt.m1684containsInclusiveUv8p0NA(visibleBounds2, m1564getHandlePositiontuRUvjQ)))) {
            return TextFieldHandleState.INSTANCE.getHidden();
        }
        if (!this.textFieldState.getVisualText().shouldShowSelection()) {
            return TextFieldHandleState.INSTANCE.getHidden();
        }
        ResolvedTextDirection bidiRunDirection = layoutResult.getBidiRunDirection(isStartHandle ? TextRange.m6460getStartimpl(selection) : Math.max(TextRange.m6455getEndimpl(selection) - 1, 0));
        boolean m6459getReversedimpl = TextRange.m6459getReversedimpl(selection);
        if (includePosition) {
            LayoutCoordinates textLayoutCoordinates2 = getTextLayoutCoordinates();
            if (textLayoutCoordinates2 != null && (visibleBounds = SelectionManagerKt.visibleBounds(textLayoutCoordinates2)) != null) {
                m1564getHandlePositiontuRUvjQ = TextLayoutStateKt.m1524coerceIn3MmeM6k(m1564getHandlePositiontuRUvjQ, visibleBounds);
            }
        } else {
            m1564getHandlePositiontuRUvjQ = Offset.INSTANCE.m4289getUnspecifiedF1C5BW0();
        }
        return new TextFieldHandleState(true, m1564getHandlePositiontuRUvjQ, bidiRunDirection, m6459getReversedimpl, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getHandlePosition-tuRUvjQ, reason: not valid java name */
    public final long m1564getHandlePositiontuRUvjQ(boolean isStartHandle) {
        int m6455getEndimpl;
        TextLayoutResult layoutResult = this.textLayoutState.getLayoutResult();
        if (layoutResult == null) {
            return Offset.INSTANCE.m4290getZeroF1C5BW0();
        }
        long selection = this.textFieldState.getVisualText().getSelection();
        if (isStartHandle) {
            m6455getEndimpl = TextRange.m6460getStartimpl(selection);
        } else {
            m6455getEndimpl = TextRange.m6455getEndimpl(selection);
        }
        return TextSelectionDelegateKt.getSelectionHandleCoordinates(layoutResult, m6455getEndimpl, isStartHandle, TextRange.m6459getReversedimpl(selection));
    }

    /* renamed from: updateHandleDragging-Uv8p0NA, reason: not valid java name */
    public final void m1574updateHandleDraggingUv8p0NA(Handle handle, long position) {
        setDraggingHandle(handle);
        m1569setRawHandleDragPositionk4lQ0M(position);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void markStartContentVisibleOffset() {
        m1570setStartTextLayoutPositionInWindowk4lQ0M(m1563getCurrentTextLayoutPositionInWindowF1C5BW0());
    }

    public final void clearHandleDragging() {
        setDraggingHandle(null);
        m1569setRawHandleDragPositionk4lQ0M(Offset.INSTANCE.m4289getUnspecifiedF1C5BW0());
        m1570setStartTextLayoutPositionInWindowk4lQ0M(Offset.INSTANCE.m4289getUnspecifiedF1C5BW0());
    }

    public final boolean canCut() {
        return (TextRange.m6454getCollapsedimpl(this.textFieldState.getVisualText().getSelection()) || !getEditable() || this.isPassword) ? false : true;
    }

    public final void cut() {
        TextFieldCharSequence visualText = this.textFieldState.getVisualText();
        if (TextRange.m6454getCollapsedimpl(visualText.getSelection())) {
            return;
        }
        ClipboardManager clipboardManager = this.clipboardManager;
        if (clipboardManager != null) {
            clipboardManager.setText(new AnnotatedString(TextFieldCharSequenceKt.getSelectedText(visualText).toString(), null, null, 6, null));
        }
        this.textFieldState.deleteSelectedText();
    }

    public final boolean canCopy() {
        return (TextRange.m6454getCollapsedimpl(this.textFieldState.getVisualText().getSelection()) || this.isPassword) ? false : true;
    }

    public static /* synthetic */ void copy$default(TextFieldSelectionState textFieldSelectionState, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        textFieldSelectionState.copy(z);
    }

    public final void copy(boolean cancelSelection) {
        TextFieldCharSequence visualText = this.textFieldState.getVisualText();
        if (TextRange.m6454getCollapsedimpl(visualText.getSelection())) {
            return;
        }
        ClipboardManager clipboardManager = this.clipboardManager;
        if (clipboardManager != null) {
            clipboardManager.setText(new AnnotatedString(TextFieldCharSequenceKt.getSelectedText(visualText).toString(), null, null, 6, null));
        }
        if (cancelSelection) {
            this.textFieldState.collapseSelectionToMax();
        }
    }

    public final boolean canPaste() {
        if (!getEditable()) {
            return false;
        }
        ClipboardManager clipboardManager = this.clipboardManager;
        if (clipboardManager != null && clipboardManager.hasText()) {
            return true;
        }
        Function0<? extends ReceiveContentConfiguration> function0 = this.receiveContentConfiguration;
        if ((function0 != null ? function0.invoke() : null) == null) {
            return false;
        }
        ClipboardManager clipboardManager2 = this.clipboardManager;
        return (clipboardManager2 != null ? clipboardManager2.getClip() : null) != null;
    }

    public final void paste() {
        ReceiveContentConfiguration invoke;
        ClipEntry clip;
        ClipEntry clipEntry;
        String readPlainText;
        Function0<? extends ReceiveContentConfiguration> function0 = this.receiveContentConfiguration;
        if (function0 == null || (invoke = function0.invoke()) == null) {
            pasteAsPlainText();
            return;
        }
        ClipboardManager clipboardManager = this.clipboardManager;
        if (clipboardManager == null || (clip = clipboardManager.getClip()) == null) {
            pasteAsPlainText();
            return;
        }
        TransferableContent onReceive = invoke.getReceiveContentListener().onReceive(new TransferableContent(clip, clip.getClipMetadata(), TransferableContent.Source.INSTANCE.m640getClipboardkB6V9T0(), null, 8, null));
        if (onReceive == null || (clipEntry = onReceive.getClipEntry()) == null || (readPlainText = TransferableContent_androidKt.readPlainText(clipEntry)) == null) {
            return;
        }
        TransformedTextFieldState.replaceSelectedText$default(this.textFieldState, readPlainText, false, TextFieldEditUndoBehavior.NeverMerge, 2, null);
    }

    private final void pasteAsPlainText() {
        AnnotatedString text;
        String text2;
        ClipboardManager clipboardManager = this.clipboardManager;
        if (clipboardManager == null || (text = clipboardManager.getText()) == null || (text2 = text.getText()) == null) {
            return;
        }
        TransformedTextFieldState.replaceSelectedText$default(this.textFieldState, text2, false, TextFieldEditUndoBehavior.NeverMerge, 2, null);
    }

    public final boolean canSelectAll() {
        return TextRange.m6456getLengthimpl(this.textFieldState.getVisualText().getSelection()) != this.textFieldState.getVisualText().length();
    }

    public final void selectAll() {
        this.textFieldState.selectAll();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showTextToolbar(Rect contentRect) {
        TextToolbar textToolbar = this.textToolbar;
        if (textToolbar != null) {
            boolean canCopy = canCopy();
            final TextToolbarState textToolbarState = TextToolbarState.None;
            Function0<Unit> function0 = !canCopy ? null : new Function0<Unit>() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$showTextToolbar$$inlined$menuItem$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                    TextFieldSelectionState.copy$default(this, false, 1, null);
                    TextFieldSelectionState.this.updateTextToolbarState(textToolbarState);
                }
            };
            boolean canPaste = canPaste();
            final TextToolbarState textToolbarState2 = TextToolbarState.None;
            Function0<Unit> function02 = !canPaste ? null : new Function0<Unit>() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$showTextToolbar$$inlined$menuItem$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                    this.paste();
                    TextFieldSelectionState.this.updateTextToolbarState(textToolbarState2);
                }
            };
            boolean canCut = canCut();
            final TextToolbarState textToolbarState3 = TextToolbarState.None;
            Function0<Unit> function03 = !canCut ? null : new Function0<Unit>() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$showTextToolbar$$inlined$menuItem$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                    this.cut();
                    TextFieldSelectionState.this.updateTextToolbarState(textToolbarState3);
                }
            };
            boolean canSelectAll = canSelectAll();
            final TextToolbarState textToolbarState4 = TextToolbarState.Selection;
            textToolbar.showMenu(contentRect, function0, function02, function03, !canSelectAll ? null : new Function0<Unit>() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$showTextToolbar$$inlined$menuItem$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                    this.selectAll();
                    TextFieldSelectionState.this.updateTextToolbarState(textToolbarState4);
                }
            });
        }
    }

    private final Function0<Unit> menuItem(boolean enabled, final TextToolbarState desiredState, final Function0<Unit> operation) {
        if (enabled) {
            return new Function0<Unit>() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$menuItem$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                    operation.invoke();
                    this.updateTextToolbarState(desiredState);
                }
            };
        }
        return null;
    }

    public final void deselect() {
        if (!TextRange.m6454getCollapsedimpl(this.textFieldState.getVisualText().getSelection())) {
            this.textFieldState.collapseSelectionToEnd();
        }
        setShowCursorHandle(false);
        updateTextToolbarState(TextToolbarState.None);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void hideTextToolbar() {
        TextToolbar textToolbar;
        TextToolbar textToolbar2 = this.textToolbar;
        if ((textToolbar2 != null ? textToolbar2.getStatus() : null) != TextToolbarStatus.Shown || (textToolbar = this.textToolbar) == null) {
            return;
        }
        textToolbar.hide();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: updateSelection-SsL-Rf8$default, reason: not valid java name */
    public static /* synthetic */ long m1572updateSelectionSsLRf8$default(TextFieldSelectionState textFieldSelectionState, TextFieldCharSequence textFieldCharSequence, int i, int i2, boolean z, SelectionAdjustment selectionAdjustment, boolean z2, boolean z3, int i3, Object obj) {
        return textFieldSelectionState.m1571updateSelectionSsLRf8(textFieldCharSequence, i, i2, z, selectionAdjustment, (i3 & 32) != 0 ? false : z2, (i3 & 64) != 0 ? false : z3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: updateSelection-SsL-Rf8, reason: not valid java name */
    public final long m1571updateSelectionSsLRf8(TextFieldCharSequence textFieldCharSequence, int startOffset, int endOffset, boolean isStartHandle, SelectionAdjustment adjustment, boolean allowPreviousSelectionCollapsed, boolean isStartOfSelection) {
        HapticFeedback hapticFeedback;
        TextRange m6448boximpl = TextRange.m6448boximpl(textFieldCharSequence.getSelection());
        long packedValue = m6448boximpl.getPackedValue();
        if (isStartOfSelection || (!allowPreviousSelectionCollapsed && TextRange.m6454getCollapsedimpl(packedValue))) {
            m6448boximpl = null;
        }
        long m1567getTextFieldSelectionqeG_v_k = m1567getTextFieldSelectionqeG_v_k(startOffset, endOffset, m6448boximpl, isStartHandle, adjustment);
        if (TextRange.m6453equalsimpl0(m1567getTextFieldSelectionqeG_v_k, textFieldCharSequence.getSelection())) {
            return m1567getTextFieldSelectionqeG_v_k;
        }
        boolean z = TextRange.m6459getReversedimpl(m1567getTextFieldSelectionqeG_v_k) != TextRange.m6459getReversedimpl(textFieldCharSequence.getSelection()) && TextRange.m6453equalsimpl0(TextRangeKt.TextRange(TextRange.m6455getEndimpl(m1567getTextFieldSelectionqeG_v_k), TextRange.m6460getStartimpl(m1567getTextFieldSelectionqeG_v_k)), textFieldCharSequence.getSelection());
        if (isInTouchMode() && !z && (hapticFeedback = this.hapticFeedBack) != null) {
            hapticFeedback.mo5243performHapticFeedbackCdsT49E(HapticFeedbackType.INSTANCE.m5252getTextHandleMove5zf0vsI());
        }
        return m1567getTextFieldSelectionqeG_v_k;
    }

    /* renamed from: getTextFieldSelection-qeG_v_k, reason: not valid java name */
    private final long m1567getTextFieldSelectionqeG_v_k(int rawStartOffset, int rawEndOffset, TextRange previousSelection, boolean isStartHandle, SelectionAdjustment adjustment) {
        TextLayoutResult layoutResult = this.textLayoutState.getLayoutResult();
        if (layoutResult == null) {
            return TextRange.INSTANCE.m6465getZerod9O1mEE();
        }
        if (previousSelection == null && Intrinsics.areEqual(adjustment, SelectionAdjustment.INSTANCE.getCharacter())) {
            return TextRangeKt.TextRange(rawStartOffset, rawEndOffset);
        }
        SelectionLayout m1650getTextFieldSelectionLayoutRcvTLA = SelectionLayoutKt.m1650getTextFieldSelectionLayoutRcvTLA(layoutResult, rawStartOffset, rawEndOffset, this.previousRawDragOffset, previousSelection != null ? previousSelection.getPackedValue() : TextRange.INSTANCE.m6465getZerod9O1mEE(), previousSelection == null, isStartHandle);
        if (previousSelection != null && !m1650getTextFieldSelectionLayoutRcvTLA.shouldRecomputeSelection(this.previousSelectionLayout)) {
            return previousSelection.getPackedValue();
        }
        long m1638toTextRanged9O1mEE = adjustment.adjust(m1650getTextFieldSelectionLayoutRcvTLA).m1638toTextRanged9O1mEE();
        this.previousSelectionLayout = m1650getTextFieldSelectionLayoutRcvTLA;
        if (!isStartHandle) {
            rawStartOffset = rawEndOffset;
        }
        this.previousRawDragOffset = rawStartOffset;
        return m1638toTextRanged9O1mEE;
    }
}
