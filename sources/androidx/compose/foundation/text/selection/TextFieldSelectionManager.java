package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.HandleState;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.TextDelegate;
import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.foundation.text.TextFieldCursorKt;
import androidx.compose.foundation.text.TextLayoutResultProxy;
import androidx.compose.foundation.text.UndoManager;
import androidx.compose.foundation.text.ValidatingOffsetMappingKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.hapticfeedback.HapticFeedbackType;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.platform.ClipboardManager;
import androidx.compose.ui.platform.TextToolbar;
import androidx.compose.ui.platform.TextToolbarStatus;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.PasswordVisualTransformation;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TextFieldValueKt;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: TextFieldSelectionManager.kt */
@Metadata(d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\r\u0010p\u001a\u00020FH\u0000¢\u0006\u0002\bqJ\u0018\u0010r\u001a\u00020F2\u0006\u0010s\u001a\u00020\fø\u0001\u0000¢\u0006\u0004\bt\u0010uJ\u0017\u0010v\u001a\u00020F2\b\b\u0002\u0010w\u001a\u00020!H\u0000¢\u0006\u0002\bxJ\"\u0010y\u001a\u00020C2\u0006\u0010z\u001a\u00020_2\u0006\u0010{\u001a\u00020|H\u0002ø\u0001\u0000¢\u0006\u0004\b}\u0010~J\u000e\u0010\u007f\u001a\u00020[H\u0000¢\u0006\u0003\b\u0080\u0001J\u000f\u0010\u0081\u0001\u001a\u00020FH\u0000¢\u0006\u0003\b\u0082\u0001J\u001e\u0010\u0083\u0001\u001a\u00020F2\n\b\u0002\u0010s\u001a\u0004\u0018\u00010\fH\u0000ø\u0001\u0000¢\u0006\u0003\b\u0084\u0001J\u001a\u0010\u0085\u0001\u001a\u00020F2\t\b\u0002\u0010\u0086\u0001\u001a\u00020!H\u0000¢\u0006\u0003\b\u0087\u0001J\u000f\u0010\u0088\u0001\u001a\u00020FH\u0000¢\u0006\u0003\b\u0089\u0001J\n\u0010\u008a\u0001\u001a\u00030\u008b\u0001H\u0002J\"\u0010\u008c\u0001\u001a\u00020\f2\b\u0010\u008d\u0001\u001a\u00030\u008e\u0001H\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\b\u008f\u0001\u0010\u0090\u0001J!\u0010\u0091\u0001\u001a\u00020\f2\u0007\u0010\u0092\u0001\u001a\u00020!H\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\b\u0093\u0001\u0010\u0094\u0001J\u0018\u0010\u0095\u0001\u001a\u00020[2\u0007\u0010\u0092\u0001\u001a\u00020!H\u0000¢\u0006\u0003\b\u0096\u0001J\u000f\u0010\u0097\u0001\u001a\u00020FH\u0000¢\u0006\u0003\b\u0098\u0001J\u000f\u0010\u0099\u0001\u001a\u00020!H\u0000¢\u0006\u0003\b\u009a\u0001J\u000f\u0010\u009b\u0001\u001a\u00020FH\u0000¢\u0006\u0003\b\u009c\u0001J\u000f\u0010\u009d\u0001\u001a\u00020FH\u0000¢\u0006\u0003\b\u009e\u0001J\u001d\u0010\u009f\u0001\u001a\u00020F2\u0007\u0010 \u0001\u001a\u00020|H\u0000ø\u0001\u0000¢\u0006\u0005\b¡\u0001\u0010uJ\u0013\u0010¢\u0001\u001a\u00020F2\b\u0010£\u0001\u001a\u00030¤\u0001H\u0002J\u001d\u0010¥\u0001\u001a\u00020F2\u0007\u0010 \u0001\u001a\u00020|H\u0000ø\u0001\u0000¢\u0006\u0005\b¦\u0001\u0010uJ\u000f\u0010§\u0001\u001a\u00020FH\u0000¢\u0006\u0003\b¨\u0001J\u0012\u0010©\u0001\u001a\u00020F2\u0007\u0010ª\u0001\u001a\u00020!H\u0002JK\u0010«\u0001\u001a\u00020|2\u0006\u0010d\u001a\u00020C2\u0007\u0010¬\u0001\u001a\u00020\f2\u0007\u0010\u00ad\u0001\u001a\u00020!2\u0007\u0010\u0092\u0001\u001a\u00020!2\b\u0010®\u0001\u001a\u00030¯\u00012\u0007\u0010°\u0001\u001a\u00020!H\u0002ø\u0001\u0000¢\u0006\u0006\b±\u0001\u0010²\u0001R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR5\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\f8F@BX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0016R\u0016\u0010\u0017\u001a\u00020\fX\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0018R\u0016\u0010\u0019\u001a\u00020\fX\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0018R/\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010\u000b\u001a\u0004\u0018\u00010\u001a8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b \u0010\u0013\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR+\u0010\"\u001a\u00020!2\u0006\u0010\u000b\u001a\u00020!8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b'\u0010\u0013\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R+\u0010(\u001a\u00020!2\u0006\u0010\u000b\u001a\u00020!8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b+\u0010\u0013\u001a\u0004\b)\u0010$\"\u0004\b*\u0010&R\u001c\u0010,\u001a\u0004\u0018\u00010-X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001c\u00102\u001a\u0004\u0018\u000103X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u0014\u00108\u001a\u000209X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u001a\u0010<\u001a\u00020=X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u000e\u0010B\u001a\u00020CX\u0082\u000e¢\u0006\u0002\n\u0000R&\u0010D\u001a\u000e\u0012\u0004\u0012\u00020C\u0012\u0004\u0012\u00020F0EX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\u000e\u0010K\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010L\u001a\u0004\u0018\u00010MX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010N\u001a\u0004\u0018\u00010OX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR\u001c\u0010T\u001a\u0004\u0018\u00010UX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR\u0014\u0010Z\u001a\u00020[X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\\\u0010]R\u0016\u0010^\u001a\u0004\u0018\u00010_8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b`\u0010aR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bb\u0010cR+\u0010d\u001a\u00020C2\u0006\u0010\u000b\u001a\u00020C8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bi\u0010\u0013\u001a\u0004\be\u0010f\"\u0004\bg\u0010hR\u001a\u0010j\u001a\u00020kX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bl\u0010m\"\u0004\bn\u0010o\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006³\u0001"}, d2 = {"Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "", "undoManager", "Landroidx/compose/foundation/text/UndoManager;", "(Landroidx/compose/foundation/text/UndoManager;)V", "clipboardManager", "Landroidx/compose/ui/platform/ClipboardManager;", "getClipboardManager$foundation_release", "()Landroidx/compose/ui/platform/ClipboardManager;", "setClipboardManager$foundation_release", "(Landroidx/compose/ui/platform/ClipboardManager;)V", "<set-?>", "Landroidx/compose/ui/geometry/Offset;", "currentDragPosition", "getCurrentDragPosition-_m7T9-E", "()Landroidx/compose/ui/geometry/Offset;", "setCurrentDragPosition-_kEHs6E", "(Landroidx/compose/ui/geometry/Offset;)V", "currentDragPosition$delegate", "Landroidx/compose/runtime/MutableState;", "dragBeginOffsetInText", "", "Ljava/lang/Integer;", "dragBeginPosition", "J", "dragTotalDistance", "Landroidx/compose/foundation/text/Handle;", "draggingHandle", "getDraggingHandle", "()Landroidx/compose/foundation/text/Handle;", "setDraggingHandle", "(Landroidx/compose/foundation/text/Handle;)V", "draggingHandle$delegate", "", "editable", "getEditable", "()Z", "setEditable", "(Z)V", "editable$delegate", "enabled", "getEnabled", "setEnabled", "enabled$delegate", "focusRequester", "Landroidx/compose/ui/focus/FocusRequester;", "getFocusRequester", "()Landroidx/compose/ui/focus/FocusRequester;", "setFocusRequester", "(Landroidx/compose/ui/focus/FocusRequester;)V", "hapticFeedBack", "Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "getHapticFeedBack", "()Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "setHapticFeedBack", "(Landroidx/compose/ui/hapticfeedback/HapticFeedback;)V", "mouseSelectionObserver", "Landroidx/compose/foundation/text/selection/MouseSelectionObserver;", "getMouseSelectionObserver$foundation_release", "()Landroidx/compose/foundation/text/selection/MouseSelectionObserver;", "offsetMapping", "Landroidx/compose/ui/text/input/OffsetMapping;", "getOffsetMapping$foundation_release", "()Landroidx/compose/ui/text/input/OffsetMapping;", "setOffsetMapping$foundation_release", "(Landroidx/compose/ui/text/input/OffsetMapping;)V", "oldValue", "Landroidx/compose/ui/text/input/TextFieldValue;", "onValueChange", "Lkotlin/Function1;", "", "getOnValueChange$foundation_release", "()Lkotlin/jvm/functions/Function1;", "setOnValueChange$foundation_release", "(Lkotlin/jvm/functions/Function1;)V", "previousRawDragOffset", "previousSelectionLayout", "Landroidx/compose/foundation/text/selection/SelectionLayout;", "state", "Landroidx/compose/foundation/text/LegacyTextFieldState;", "getState$foundation_release", "()Landroidx/compose/foundation/text/LegacyTextFieldState;", "setState$foundation_release", "(Landroidx/compose/foundation/text/LegacyTextFieldState;)V", "textToolbar", "Landroidx/compose/ui/platform/TextToolbar;", "getTextToolbar", "()Landroidx/compose/ui/platform/TextToolbar;", "setTextToolbar", "(Landroidx/compose/ui/platform/TextToolbar;)V", "touchSelectionObserver", "Landroidx/compose/foundation/text/TextDragObserver;", "getTouchSelectionObserver$foundation_release", "()Landroidx/compose/foundation/text/TextDragObserver;", "transformedText", "Landroidx/compose/ui/text/AnnotatedString;", "getTransformedText$foundation_release", "()Landroidx/compose/ui/text/AnnotatedString;", "getUndoManager", "()Landroidx/compose/foundation/text/UndoManager;", "value", "getValue$foundation_release", "()Landroidx/compose/ui/text/input/TextFieldValue;", "setValue$foundation_release", "(Landroidx/compose/ui/text/input/TextFieldValue;)V", "value$delegate", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "getVisualTransformation$foundation_release", "()Landroidx/compose/ui/text/input/VisualTransformation;", "setVisualTransformation$foundation_release", "(Landroidx/compose/ui/text/input/VisualTransformation;)V", "clearPreviewHighlight", "clearPreviewHighlight$foundation_release", "contextMenuOpenAdjustment", "position", "contextMenuOpenAdjustment-k-4lQ0M", "(J)V", "copy", "cancelSelection", "copy$foundation_release", "createTextFieldValue", "annotatedString", "selection", "Landroidx/compose/ui/text/TextRange;", "createTextFieldValue-FDrldGo", "(Landroidx/compose/ui/text/AnnotatedString;J)Landroidx/compose/ui/text/input/TextFieldValue;", "cursorDragObserver", "cursorDragObserver$foundation_release", "cut", "cut$foundation_release", "deselect", "deselect-_kEHs6E$foundation_release", "enterSelectionMode", "showFloatingToolbar", "enterSelectionMode$foundation_release", "exitSelectionMode", "exitSelectionMode$foundation_release", "getContentRect", "Landroidx/compose/ui/geometry/Rect;", "getCursorPosition", "density", "Landroidx/compose/ui/unit/Density;", "getCursorPosition-tuRUvjQ$foundation_release", "(Landroidx/compose/ui/unit/Density;)J", "getHandlePosition", "isStartHandle", "getHandlePosition-tuRUvjQ$foundation_release", "(Z)J", "handleDragObserver", "handleDragObserver$foundation_release", "hideSelectionToolbar", "hideSelectionToolbar$foundation_release", "isTextChanged", "isTextChanged$foundation_release", "paste", "paste$foundation_release", "selectAll", "selectAll$foundation_release", "setDeletionPreviewHighlight", "range", "setDeletionPreviewHighlight-5zc-tL8$foundation_release", "setHandleState", "handleState", "Landroidx/compose/foundation/text/HandleState;", "setSelectionPreviewHighlight", "setSelectionPreviewHighlight-5zc-tL8$foundation_release", "showSelectionToolbar", "showSelectionToolbar$foundation_release", "updateFloatingToolbar", "show", "updateSelection", "currentPosition", "isStartOfSelection", "adjustment", "Landroidx/compose/foundation/text/selection/SelectionAdjustment;", "isTouchBasedSelection", "updateSelection-8UEBfa8", "(Landroidx/compose/ui/text/input/TextFieldValue;JZZLandroidx/compose/foundation/text/selection/SelectionAdjustment;Z)J", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class TextFieldSelectionManager {
    public static final int $stable = 8;
    private ClipboardManager clipboardManager;

    /* renamed from: currentDragPosition$delegate, reason: from kotlin metadata */
    private final MutableState currentDragPosition;
    private Integer dragBeginOffsetInText;
    private long dragBeginPosition;
    private long dragTotalDistance;

    /* renamed from: draggingHandle$delegate, reason: from kotlin metadata */
    private final MutableState draggingHandle;

    /* renamed from: editable$delegate, reason: from kotlin metadata */
    private final MutableState editable;

    /* renamed from: enabled$delegate, reason: from kotlin metadata */
    private final MutableState enabled;
    private FocusRequester focusRequester;
    private HapticFeedback hapticFeedBack;
    private final MouseSelectionObserver mouseSelectionObserver;
    private OffsetMapping offsetMapping;
    private TextFieldValue oldValue;
    private Function1<? super TextFieldValue, Unit> onValueChange;
    private int previousRawDragOffset;
    private SelectionLayout previousSelectionLayout;
    private LegacyTextFieldState state;
    private TextToolbar textToolbar;
    private final TextDragObserver touchSelectionObserver;
    private final UndoManager undoManager;

    /* renamed from: value$delegate, reason: from kotlin metadata */
    private final MutableState value;
    private VisualTransformation visualTransformation;

    public TextFieldSelectionManager() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public TextFieldSelectionManager(UndoManager undoManager) {
        MutableState mutableStateOf$default;
        MutableState mutableStateOf$default2;
        MutableState mutableStateOf$default3;
        MutableState mutableStateOf$default4;
        MutableState mutableStateOf$default5;
        this.undoManager = undoManager;
        this.offsetMapping = ValidatingOffsetMappingKt.getValidatingEmptyOffsetMappingIdentity();
        this.onValueChange = new Function1<TextFieldValue, Unit>() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$onValueChange$1
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(TextFieldValue textFieldValue) {
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue) {
                invoke2(textFieldValue);
                return Unit.INSTANCE;
            }
        };
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new TextFieldValue((String) null, 0L, (TextRange) null, 7, (DefaultConstructorMarker) null), null, 2, null);
        this.value = mutableStateOf$default;
        this.visualTransformation = VisualTransformation.INSTANCE.getNone();
        mutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(true, null, 2, null);
        this.editable = mutableStateOf$default2;
        mutableStateOf$default3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(true, null, 2, null);
        this.enabled = mutableStateOf$default3;
        this.dragBeginPosition = Offset.INSTANCE.m4290getZeroF1C5BW0();
        this.dragTotalDistance = Offset.INSTANCE.m4290getZeroF1C5BW0();
        mutableStateOf$default4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.draggingHandle = mutableStateOf$default4;
        mutableStateOf$default5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.currentDragPosition = mutableStateOf$default5;
        this.previousRawDragOffset = -1;
        this.oldValue = new TextFieldValue((String) null, 0L, (TextRange) null, 7, (DefaultConstructorMarker) null);
        this.touchSelectionObserver = new TextDragObserver() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$touchSelectionObserver$1
            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onDown-k-4lQ0M */
            public void mo1362onDownk4lQ0M(long point) {
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onUp() {
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onStart-k-4lQ0M */
            public void mo1364onStartk4lQ0M(long startPoint) {
                TextLayoutResultProxy layoutResult;
                TextFieldValue m1698createTextFieldValueFDrldGo;
                long j;
                TextLayoutResultProxy layoutResult2;
                long m1701updateSelection8UEBfa8;
                if (TextFieldSelectionManager.this.getEnabled() && TextFieldSelectionManager.this.getDraggingHandle() == null) {
                    TextFieldSelectionManager.this.setDraggingHandle(Handle.SelectionEnd);
                    TextFieldSelectionManager.this.previousRawDragOffset = -1;
                    TextFieldSelectionManager.this.hideSelectionToolbar$foundation_release();
                    LegacyTextFieldState state = TextFieldSelectionManager.this.getState();
                    if (state == null || (layoutResult2 = state.getLayoutResult()) == null || !layoutResult2.m1396isPositionOnTextk4lQ0M(startPoint)) {
                        LegacyTextFieldState state2 = TextFieldSelectionManager.this.getState();
                        if (state2 != null && (layoutResult = state2.getLayoutResult()) != null) {
                            TextFieldSelectionManager textFieldSelectionManager = TextFieldSelectionManager.this;
                            int transformedToOriginal = textFieldSelectionManager.getOffsetMapping().transformedToOriginal(TextLayoutResultProxy.m1394getOffsetForPosition3MmeM6k$default(layoutResult, startPoint, false, 2, null));
                            m1698createTextFieldValueFDrldGo = textFieldSelectionManager.m1698createTextFieldValueFDrldGo(textFieldSelectionManager.getValue$foundation_release().getAnnotatedString(), TextRangeKt.TextRange(transformedToOriginal, transformedToOriginal));
                            textFieldSelectionManager.enterSelectionMode$foundation_release(false);
                            HapticFeedback hapticFeedBack = textFieldSelectionManager.getHapticFeedBack();
                            if (hapticFeedBack != null) {
                                hapticFeedBack.mo5243performHapticFeedbackCdsT49E(HapticFeedbackType.INSTANCE.m5252getTextHandleMove5zf0vsI());
                            }
                            textFieldSelectionManager.getOnValueChange$foundation_release().invoke(m1698createTextFieldValueFDrldGo);
                        }
                    } else {
                        if (TextFieldSelectionManager.this.getValue$foundation_release().getText().length() == 0) {
                            return;
                        }
                        TextFieldSelectionManager.this.enterSelectionMode$foundation_release(false);
                        TextFieldSelectionManager textFieldSelectionManager2 = TextFieldSelectionManager.this;
                        m1701updateSelection8UEBfa8 = textFieldSelectionManager2.m1701updateSelection8UEBfa8(TextFieldValue.m6702copy3r_uNRQ$default(textFieldSelectionManager2.getValue$foundation_release(), (AnnotatedString) null, TextRange.INSTANCE.m6465getZerod9O1mEE(), (TextRange) null, 5, (Object) null), startPoint, true, false, SelectionAdjustment.INSTANCE.getWord(), true);
                        TextFieldSelectionManager.this.dragBeginOffsetInText = Integer.valueOf(TextRange.m6460getStartimpl(m1701updateSelection8UEBfa8));
                    }
                    TextFieldSelectionManager.this.setHandleState(HandleState.None);
                    TextFieldSelectionManager.this.dragBeginPosition = startPoint;
                    TextFieldSelectionManager textFieldSelectionManager3 = TextFieldSelectionManager.this;
                    j = textFieldSelectionManager3.dragBeginPosition;
                    textFieldSelectionManager3.m1700setCurrentDragPosition_kEHs6E(Offset.m4263boximpl(j));
                    TextFieldSelectionManager.this.dragTotalDistance = Offset.INSTANCE.m4290getZeroF1C5BW0();
                }
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onDrag-k-4lQ0M */
            public void mo1363onDragk4lQ0M(long delta) {
                long j;
                TextLayoutResultProxy layoutResult;
                long j2;
                long j3;
                Integer num;
                Integer num2;
                long j4;
                int m1395getOffsetForPosition3MmeM6k;
                Integer num3;
                long m1701updateSelection8UEBfa8;
                long j5;
                SelectionAdjustment word;
                if (!TextFieldSelectionManager.this.getEnabled() || TextFieldSelectionManager.this.getValue$foundation_release().getText().length() == 0) {
                    return;
                }
                TextFieldSelectionManager textFieldSelectionManager = TextFieldSelectionManager.this;
                j = textFieldSelectionManager.dragTotalDistance;
                textFieldSelectionManager.dragTotalDistance = Offset.m4279plusMKHz9U(j, delta);
                LegacyTextFieldState state = TextFieldSelectionManager.this.getState();
                if (state != null && (layoutResult = state.getLayoutResult()) != null) {
                    TextFieldSelectionManager textFieldSelectionManager2 = TextFieldSelectionManager.this;
                    j2 = textFieldSelectionManager2.dragBeginPosition;
                    j3 = textFieldSelectionManager2.dragTotalDistance;
                    textFieldSelectionManager2.m1700setCurrentDragPosition_kEHs6E(Offset.m4263boximpl(Offset.m4279plusMKHz9U(j2, j3)));
                    num = textFieldSelectionManager2.dragBeginOffsetInText;
                    if (num == null) {
                        Offset m1704getCurrentDragPosition_m7T9E = textFieldSelectionManager2.m1704getCurrentDragPosition_m7T9E();
                        Intrinsics.checkNotNull(m1704getCurrentDragPosition_m7T9E);
                        if (!layoutResult.m1396isPositionOnTextk4lQ0M(m1704getCurrentDragPosition_m7T9E.getPackedValue())) {
                            OffsetMapping offsetMapping = textFieldSelectionManager2.getOffsetMapping();
                            j5 = textFieldSelectionManager2.dragBeginPosition;
                            int transformedToOriginal = offsetMapping.transformedToOriginal(TextLayoutResultProxy.m1394getOffsetForPosition3MmeM6k$default(layoutResult, j5, false, 2, null));
                            OffsetMapping offsetMapping2 = textFieldSelectionManager2.getOffsetMapping();
                            Offset m1704getCurrentDragPosition_m7T9E2 = textFieldSelectionManager2.m1704getCurrentDragPosition_m7T9E();
                            Intrinsics.checkNotNull(m1704getCurrentDragPosition_m7T9E2);
                            if (transformedToOriginal == offsetMapping2.transformedToOriginal(TextLayoutResultProxy.m1394getOffsetForPosition3MmeM6k$default(layoutResult, m1704getCurrentDragPosition_m7T9E2.getPackedValue(), false, 2, null))) {
                                word = SelectionAdjustment.INSTANCE.getNone();
                            } else {
                                word = SelectionAdjustment.INSTANCE.getWord();
                            }
                            TextFieldValue value$foundation_release = textFieldSelectionManager2.getValue$foundation_release();
                            Offset m1704getCurrentDragPosition_m7T9E3 = textFieldSelectionManager2.m1704getCurrentDragPosition_m7T9E();
                            Intrinsics.checkNotNull(m1704getCurrentDragPosition_m7T9E3);
                            m1701updateSelection8UEBfa8 = textFieldSelectionManager2.m1701updateSelection8UEBfa8(value$foundation_release, m1704getCurrentDragPosition_m7T9E3.getPackedValue(), false, false, word, true);
                            TextRange.m6448boximpl(m1701updateSelection8UEBfa8);
                        }
                    }
                    num2 = textFieldSelectionManager2.dragBeginOffsetInText;
                    if (num2 != null) {
                        m1395getOffsetForPosition3MmeM6k = num2.intValue();
                    } else {
                        j4 = textFieldSelectionManager2.dragBeginPosition;
                        m1395getOffsetForPosition3MmeM6k = layoutResult.m1395getOffsetForPosition3MmeM6k(j4, false);
                    }
                    Offset m1704getCurrentDragPosition_m7T9E4 = textFieldSelectionManager2.m1704getCurrentDragPosition_m7T9E();
                    Intrinsics.checkNotNull(m1704getCurrentDragPosition_m7T9E4);
                    int m1395getOffsetForPosition3MmeM6k2 = layoutResult.m1395getOffsetForPosition3MmeM6k(m1704getCurrentDragPosition_m7T9E4.getPackedValue(), false);
                    num3 = textFieldSelectionManager2.dragBeginOffsetInText;
                    if (num3 == null && m1395getOffsetForPosition3MmeM6k == m1395getOffsetForPosition3MmeM6k2) {
                        return;
                    }
                    TextFieldValue value$foundation_release2 = textFieldSelectionManager2.getValue$foundation_release();
                    Offset m1704getCurrentDragPosition_m7T9E5 = textFieldSelectionManager2.m1704getCurrentDragPosition_m7T9E();
                    Intrinsics.checkNotNull(m1704getCurrentDragPosition_m7T9E5);
                    m1701updateSelection8UEBfa8 = textFieldSelectionManager2.m1701updateSelection8UEBfa8(value$foundation_release2, m1704getCurrentDragPosition_m7T9E5.getPackedValue(), false, false, SelectionAdjustment.INSTANCE.getWord(), true);
                    TextRange.m6448boximpl(m1701updateSelection8UEBfa8);
                }
                TextFieldSelectionManager.this.updateFloatingToolbar(false);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onStop() {
                onEnd();
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onCancel() {
                onEnd();
            }

            private final void onEnd() {
                TextFieldSelectionManager.this.setDraggingHandle(null);
                TextFieldSelectionManager.this.m1700setCurrentDragPosition_kEHs6E(null);
                TextFieldSelectionManager.this.updateFloatingToolbar(true);
                TextFieldSelectionManager.this.dragBeginOffsetInText = null;
                boolean m6454getCollapsedimpl = TextRange.m6454getCollapsedimpl(TextFieldSelectionManager.this.getValue$foundation_release().getSelection());
                TextFieldSelectionManager.this.setHandleState(m6454getCollapsedimpl ? HandleState.Cursor : HandleState.Selection);
                LegacyTextFieldState state = TextFieldSelectionManager.this.getState();
                if (state != null) {
                    state.setShowSelectionHandleStart(!m6454getCollapsedimpl && TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(TextFieldSelectionManager.this, true));
                }
                LegacyTextFieldState state2 = TextFieldSelectionManager.this.getState();
                if (state2 != null) {
                    state2.setShowSelectionHandleEnd(!m6454getCollapsedimpl && TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(TextFieldSelectionManager.this, false));
                }
                LegacyTextFieldState state3 = TextFieldSelectionManager.this.getState();
                if (state3 == null) {
                    return;
                }
                state3.setShowCursorHandle(m6454getCollapsedimpl && TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(TextFieldSelectionManager.this, true));
            }
        };
        this.mouseSelectionObserver = new MouseSelectionObserver() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$mouseSelectionObserver$1
            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            public void onDragDone() {
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            /* renamed from: onExtend-k-4lQ0M */
            public boolean mo1577onExtendk4lQ0M(long downPosition) {
                LegacyTextFieldState state = TextFieldSelectionManager.this.getState();
                if (state == null || state.getLayoutResult() == null || !TextFieldSelectionManager.this.getEnabled()) {
                    return false;
                }
                TextFieldSelectionManager.this.previousRawDragOffset = -1;
                updateMouseSelection(TextFieldSelectionManager.this.getValue$foundation_release(), downPosition, false, SelectionAdjustment.INSTANCE.getNone());
                return true;
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            /* renamed from: onExtendDrag-k-4lQ0M */
            public boolean mo1578onExtendDragk4lQ0M(long dragPosition) {
                LegacyTextFieldState state;
                if (!TextFieldSelectionManager.this.getEnabled() || TextFieldSelectionManager.this.getValue$foundation_release().getText().length() == 0 || (state = TextFieldSelectionManager.this.getState()) == null || state.getLayoutResult() == null) {
                    return false;
                }
                updateMouseSelection(TextFieldSelectionManager.this.getValue$foundation_release(), dragPosition, false, SelectionAdjustment.INSTANCE.getNone());
                return true;
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            /* renamed from: onStart-3MmeM6k */
            public boolean mo1579onStart3MmeM6k(long downPosition, SelectionAdjustment adjustment) {
                LegacyTextFieldState state;
                long j;
                if (!TextFieldSelectionManager.this.getEnabled() || TextFieldSelectionManager.this.getValue$foundation_release().getText().length() == 0 || (state = TextFieldSelectionManager.this.getState()) == null || state.getLayoutResult() == null) {
                    return false;
                }
                FocusRequester focusRequester = TextFieldSelectionManager.this.getFocusRequester();
                if (focusRequester != null) {
                    focusRequester.requestFocus();
                }
                TextFieldSelectionManager.this.dragBeginPosition = downPosition;
                TextFieldSelectionManager.this.previousRawDragOffset = -1;
                TextFieldSelectionManager.enterSelectionMode$foundation_release$default(TextFieldSelectionManager.this, false, 1, null);
                TextFieldValue value$foundation_release = TextFieldSelectionManager.this.getValue$foundation_release();
                j = TextFieldSelectionManager.this.dragBeginPosition;
                updateMouseSelection(value$foundation_release, j, true, adjustment);
                return true;
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            /* renamed from: onDrag-3MmeM6k */
            public boolean mo1576onDrag3MmeM6k(long dragPosition, SelectionAdjustment adjustment) {
                LegacyTextFieldState state;
                if (!TextFieldSelectionManager.this.getEnabled() || TextFieldSelectionManager.this.getValue$foundation_release().getText().length() == 0 || (state = TextFieldSelectionManager.this.getState()) == null || state.getLayoutResult() == null) {
                    return false;
                }
                updateMouseSelection(TextFieldSelectionManager.this.getValue$foundation_release(), dragPosition, false, adjustment);
                return true;
            }

            public final void updateMouseSelection(TextFieldValue value, long currentPosition, boolean isStartOfSelection, SelectionAdjustment adjustment) {
                long m1701updateSelection8UEBfa8;
                m1701updateSelection8UEBfa8 = TextFieldSelectionManager.this.m1701updateSelection8UEBfa8(value, currentPosition, isStartOfSelection, false, adjustment, false);
                TextFieldSelectionManager.this.setHandleState(TextRange.m6454getCollapsedimpl(m1701updateSelection8UEBfa8) ? HandleState.Cursor : HandleState.Selection);
            }
        };
    }

    public /* synthetic */ TextFieldSelectionManager(UndoManager undoManager, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : undoManager);
    }

    public final UndoManager getUndoManager() {
        return this.undoManager;
    }

    /* renamed from: getOffsetMapping$foundation_release, reason: from getter */
    public final OffsetMapping getOffsetMapping() {
        return this.offsetMapping;
    }

    public final void setOffsetMapping$foundation_release(OffsetMapping offsetMapping) {
        this.offsetMapping = offsetMapping;
    }

    public final Function1<TextFieldValue, Unit> getOnValueChange$foundation_release() {
        return this.onValueChange;
    }

    public final void setOnValueChange$foundation_release(Function1<? super TextFieldValue, Unit> function1) {
        this.onValueChange = function1;
    }

    /* renamed from: getState$foundation_release, reason: from getter */
    public final LegacyTextFieldState getState() {
        return this.state;
    }

    public final void setState$foundation_release(LegacyTextFieldState legacyTextFieldState) {
        this.state = legacyTextFieldState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final TextFieldValue getValue$foundation_release() {
        return (TextFieldValue) this.value.getValue();
    }

    public final void setValue$foundation_release(TextFieldValue textFieldValue) {
        this.value.setValue(textFieldValue);
    }

    public final AnnotatedString getTransformedText$foundation_release() {
        TextDelegate textDelegate;
        LegacyTextFieldState legacyTextFieldState = this.state;
        if (legacyTextFieldState == null || (textDelegate = legacyTextFieldState.getTextDelegate()) == null) {
            return null;
        }
        return textDelegate.getText();
    }

    /* renamed from: getVisualTransformation$foundation_release, reason: from getter */
    public final VisualTransformation getVisualTransformation() {
        return this.visualTransformation;
    }

    public final void setVisualTransformation$foundation_release(VisualTransformation visualTransformation) {
        this.visualTransformation = visualTransformation;
    }

    /* renamed from: getClipboardManager$foundation_release, reason: from getter */
    public final ClipboardManager getClipboardManager() {
        return this.clipboardManager;
    }

    public final void setClipboardManager$foundation_release(ClipboardManager clipboardManager) {
        this.clipboardManager = clipboardManager;
    }

    public final TextToolbar getTextToolbar() {
        return this.textToolbar;
    }

    public final void setTextToolbar(TextToolbar textToolbar) {
        this.textToolbar = textToolbar;
    }

    public final HapticFeedback getHapticFeedBack() {
        return this.hapticFeedBack;
    }

    public final void setHapticFeedBack(HapticFeedback hapticFeedback) {
        this.hapticFeedBack = hapticFeedback;
    }

    public final FocusRequester getFocusRequester() {
        return this.focusRequester;
    }

    public final void setFocusRequester(FocusRequester focusRequester) {
        this.focusRequester = focusRequester;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getEditable() {
        return ((Boolean) this.editable.getValue()).booleanValue();
    }

    public final void setEditable(boolean z) {
        this.editable.setValue(Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getEnabled() {
        return ((Boolean) this.enabled.getValue()).booleanValue();
    }

    public final void setEnabled(boolean z) {
        this.enabled.setValue(Boolean.valueOf(z));
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
    public final void m1700setCurrentDragPosition_kEHs6E(Offset offset) {
        this.currentDragPosition.setValue(offset);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getCurrentDragPosition-_m7T9-E, reason: not valid java name */
    public final Offset m1704getCurrentDragPosition_m7T9E() {
        return (Offset) this.currentDragPosition.getValue();
    }

    /* renamed from: getTouchSelectionObserver$foundation_release, reason: from getter */
    public final TextDragObserver getTouchSelectionObserver() {
        return this.touchSelectionObserver;
    }

    /* renamed from: getMouseSelectionObserver$foundation_release, reason: from getter */
    public final MouseSelectionObserver getMouseSelectionObserver() {
        return this.mouseSelectionObserver;
    }

    public final TextDragObserver handleDragObserver$foundation_release(final boolean isStartHandle) {
        return new TextDragObserver() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$handleDragObserver$1
            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onCancel() {
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onStart-k-4lQ0M */
            public void mo1364onStartk4lQ0M(long startPoint) {
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onDown-k-4lQ0M */
            public void mo1362onDownk4lQ0M(long point) {
                TextLayoutResultProxy layoutResult;
                TextFieldSelectionManager.this.setDraggingHandle(isStartHandle ? Handle.SelectionStart : Handle.SelectionEnd);
                long m1647getAdjustedCoordinatesk4lQ0M = SelectionHandlesKt.m1647getAdjustedCoordinatesk4lQ0M(TextFieldSelectionManager.this.m1706getHandlePositiontuRUvjQ$foundation_release(isStartHandle));
                LegacyTextFieldState state = TextFieldSelectionManager.this.getState();
                if (state == null || (layoutResult = state.getLayoutResult()) == null) {
                    return;
                }
                long m1398translateInnerToDecorationCoordinatesMKHz9U$foundation_release = layoutResult.m1398translateInnerToDecorationCoordinatesMKHz9U$foundation_release(m1647getAdjustedCoordinatesk4lQ0M);
                TextFieldSelectionManager.this.dragBeginPosition = m1398translateInnerToDecorationCoordinatesMKHz9U$foundation_release;
                TextFieldSelectionManager.this.m1700setCurrentDragPosition_kEHs6E(Offset.m4263boximpl(m1398translateInnerToDecorationCoordinatesMKHz9U$foundation_release));
                TextFieldSelectionManager.this.dragTotalDistance = Offset.INSTANCE.m4290getZeroF1C5BW0();
                TextFieldSelectionManager.this.previousRawDragOffset = -1;
                LegacyTextFieldState state2 = TextFieldSelectionManager.this.getState();
                if (state2 != null) {
                    state2.setInTouchMode(true);
                }
                TextFieldSelectionManager.this.updateFloatingToolbar(false);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onUp() {
                TextFieldSelectionManager.this.setDraggingHandle(null);
                TextFieldSelectionManager.this.m1700setCurrentDragPosition_kEHs6E(null);
                TextFieldSelectionManager.this.updateFloatingToolbar(true);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onDrag-k-4lQ0M */
            public void mo1363onDragk4lQ0M(long delta) {
                long j;
                long j2;
                long j3;
                TextFieldSelectionManager textFieldSelectionManager = TextFieldSelectionManager.this;
                j = textFieldSelectionManager.dragTotalDistance;
                textFieldSelectionManager.dragTotalDistance = Offset.m4279plusMKHz9U(j, delta);
                TextFieldSelectionManager textFieldSelectionManager2 = TextFieldSelectionManager.this;
                j2 = textFieldSelectionManager2.dragBeginPosition;
                j3 = TextFieldSelectionManager.this.dragTotalDistance;
                textFieldSelectionManager2.m1700setCurrentDragPosition_kEHs6E(Offset.m4263boximpl(Offset.m4279plusMKHz9U(j2, j3)));
                TextFieldSelectionManager textFieldSelectionManager3 = TextFieldSelectionManager.this;
                TextFieldValue value$foundation_release = textFieldSelectionManager3.getValue$foundation_release();
                Offset m1704getCurrentDragPosition_m7T9E = TextFieldSelectionManager.this.m1704getCurrentDragPosition_m7T9E();
                Intrinsics.checkNotNull(m1704getCurrentDragPosition_m7T9E);
                textFieldSelectionManager3.m1701updateSelection8UEBfa8(value$foundation_release, m1704getCurrentDragPosition_m7T9E.getPackedValue(), false, isStartHandle, SelectionAdjustment.INSTANCE.getCharacterWithWordAccelerate(), true);
                TextFieldSelectionManager.this.updateFloatingToolbar(false);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onStop() {
                TextFieldSelectionManager.this.setDraggingHandle(null);
                TextFieldSelectionManager.this.m1700setCurrentDragPosition_kEHs6E(null);
                TextFieldSelectionManager.this.updateFloatingToolbar(true);
            }
        };
    }

    public final TextDragObserver cursorDragObserver$foundation_release() {
        return new TextDragObserver() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$cursorDragObserver$1
            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onCancel() {
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onDown-k-4lQ0M */
            public void mo1362onDownk4lQ0M(long point) {
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onUp() {
                TextFieldSelectionManager.this.setDraggingHandle(null);
                TextFieldSelectionManager.this.m1700setCurrentDragPosition_kEHs6E(null);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onStart-k-4lQ0M */
            public void mo1364onStartk4lQ0M(long startPoint) {
                TextLayoutResultProxy layoutResult;
                long m1647getAdjustedCoordinatesk4lQ0M = SelectionHandlesKt.m1647getAdjustedCoordinatesk4lQ0M(TextFieldSelectionManager.this.m1706getHandlePositiontuRUvjQ$foundation_release(true));
                LegacyTextFieldState state = TextFieldSelectionManager.this.getState();
                if (state == null || (layoutResult = state.getLayoutResult()) == null) {
                    return;
                }
                long m1398translateInnerToDecorationCoordinatesMKHz9U$foundation_release = layoutResult.m1398translateInnerToDecorationCoordinatesMKHz9U$foundation_release(m1647getAdjustedCoordinatesk4lQ0M);
                TextFieldSelectionManager.this.dragBeginPosition = m1398translateInnerToDecorationCoordinatesMKHz9U$foundation_release;
                TextFieldSelectionManager.this.m1700setCurrentDragPosition_kEHs6E(Offset.m4263boximpl(m1398translateInnerToDecorationCoordinatesMKHz9U$foundation_release));
                TextFieldSelectionManager.this.dragTotalDistance = Offset.INSTANCE.m4290getZeroF1C5BW0();
                TextFieldSelectionManager.this.setDraggingHandle(Handle.Cursor);
                TextFieldSelectionManager.this.updateFloatingToolbar(false);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onDrag-k-4lQ0M */
            public void mo1363onDragk4lQ0M(long delta) {
                long j;
                TextLayoutResultProxy layoutResult;
                long j2;
                long j3;
                HapticFeedback hapticFeedBack;
                TextFieldValue m1698createTextFieldValueFDrldGo;
                TextFieldSelectionManager textFieldSelectionManager = TextFieldSelectionManager.this;
                j = textFieldSelectionManager.dragTotalDistance;
                textFieldSelectionManager.dragTotalDistance = Offset.m4279plusMKHz9U(j, delta);
                LegacyTextFieldState state = TextFieldSelectionManager.this.getState();
                if (state == null || (layoutResult = state.getLayoutResult()) == null) {
                    return;
                }
                TextFieldSelectionManager textFieldSelectionManager2 = TextFieldSelectionManager.this;
                j2 = textFieldSelectionManager2.dragBeginPosition;
                j3 = textFieldSelectionManager2.dragTotalDistance;
                textFieldSelectionManager2.m1700setCurrentDragPosition_kEHs6E(Offset.m4263boximpl(Offset.m4279plusMKHz9U(j2, j3)));
                OffsetMapping offsetMapping = textFieldSelectionManager2.getOffsetMapping();
                Offset m1704getCurrentDragPosition_m7T9E = textFieldSelectionManager2.m1704getCurrentDragPosition_m7T9E();
                Intrinsics.checkNotNull(m1704getCurrentDragPosition_m7T9E);
                int transformedToOriginal = offsetMapping.transformedToOriginal(TextLayoutResultProxy.m1394getOffsetForPosition3MmeM6k$default(layoutResult, m1704getCurrentDragPosition_m7T9E.getPackedValue(), false, 2, null));
                long TextRange = TextRangeKt.TextRange(transformedToOriginal, transformedToOriginal);
                if (TextRange.m6453equalsimpl0(TextRange, textFieldSelectionManager2.getValue$foundation_release().getSelection())) {
                    return;
                }
                LegacyTextFieldState state2 = textFieldSelectionManager2.getState();
                if ((state2 == null || state2.isInTouchMode()) && (hapticFeedBack = textFieldSelectionManager2.getHapticFeedBack()) != null) {
                    hapticFeedBack.mo5243performHapticFeedbackCdsT49E(HapticFeedbackType.INSTANCE.m5252getTextHandleMove5zf0vsI());
                }
                Function1<TextFieldValue, Unit> onValueChange$foundation_release = textFieldSelectionManager2.getOnValueChange$foundation_release();
                m1698createTextFieldValueFDrldGo = textFieldSelectionManager2.m1698createTextFieldValueFDrldGo(textFieldSelectionManager2.getValue$foundation_release().getAnnotatedString(), TextRange);
                onValueChange$foundation_release.invoke(m1698createTextFieldValueFDrldGo);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onStop() {
                TextFieldSelectionManager.this.setDraggingHandle(null);
                TextFieldSelectionManager.this.m1700setCurrentDragPosition_kEHs6E(null);
            }
        };
    }

    public static /* synthetic */ void enterSelectionMode$foundation_release$default(TextFieldSelectionManager textFieldSelectionManager, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        textFieldSelectionManager.enterSelectionMode$foundation_release(z);
    }

    public final void enterSelectionMode$foundation_release(boolean showFloatingToolbar) {
        FocusRequester focusRequester;
        LegacyTextFieldState legacyTextFieldState = this.state;
        if (legacyTextFieldState != null && !legacyTextFieldState.getHasFocus() && (focusRequester = this.focusRequester) != null) {
            focusRequester.requestFocus();
        }
        this.oldValue = getValue$foundation_release();
        updateFloatingToolbar(showFloatingToolbar);
        setHandleState(HandleState.Selection);
    }

    public final void exitSelectionMode$foundation_release() {
        updateFloatingToolbar(false);
        setHandleState(HandleState.None);
    }

    /* renamed from: deselect-_kEHs6E$foundation_release$default, reason: not valid java name */
    public static /* synthetic */ void m1699deselect_kEHs6E$foundation_release$default(TextFieldSelectionManager textFieldSelectionManager, Offset offset, int i, Object obj) {
        if ((i & 1) != 0) {
            offset = null;
        }
        textFieldSelectionManager.m1703deselect_kEHs6E$foundation_release(offset);
    }

    /* renamed from: deselect-_kEHs6E$foundation_release, reason: not valid java name */
    public final void m1703deselect_kEHs6E$foundation_release(Offset position) {
        int m6457getMaximpl;
        if (!TextRange.m6454getCollapsedimpl(getValue$foundation_release().getSelection())) {
            LegacyTextFieldState legacyTextFieldState = this.state;
            TextLayoutResultProxy layoutResult = legacyTextFieldState != null ? legacyTextFieldState.getLayoutResult() : null;
            if (position != null && layoutResult != null) {
                m6457getMaximpl = this.offsetMapping.transformedToOriginal(TextLayoutResultProxy.m1394getOffsetForPosition3MmeM6k$default(layoutResult, position.getPackedValue(), false, 2, null));
            } else {
                m6457getMaximpl = TextRange.m6457getMaximpl(getValue$foundation_release().getSelection());
            }
            this.onValueChange.invoke(TextFieldValue.m6702copy3r_uNRQ$default(getValue$foundation_release(), (AnnotatedString) null, TextRangeKt.TextRange(m6457getMaximpl), (TextRange) null, 5, (Object) null));
        }
        setHandleState((position == null || getValue$foundation_release().getText().length() <= 0) ? HandleState.None : HandleState.Cursor);
        updateFloatingToolbar(false);
    }

    /* renamed from: setSelectionPreviewHighlight-5zc-tL8$foundation_release, reason: not valid java name */
    public final void m1708setSelectionPreviewHighlight5zctL8$foundation_release(long range) {
        LegacyTextFieldState legacyTextFieldState = this.state;
        if (legacyTextFieldState != null) {
            legacyTextFieldState.m1325setSelectionPreviewHighlightRange5zctL8(range);
        }
        LegacyTextFieldState legacyTextFieldState2 = this.state;
        if (legacyTextFieldState2 != null) {
            legacyTextFieldState2.m1322setDeletionPreviewHighlightRange5zctL8(TextRange.INSTANCE.m6465getZerod9O1mEE());
        }
        if (TextRange.m6454getCollapsedimpl(range)) {
            return;
        }
        exitSelectionMode$foundation_release();
    }

    /* renamed from: setDeletionPreviewHighlight-5zc-tL8$foundation_release, reason: not valid java name */
    public final void m1707setDeletionPreviewHighlight5zctL8$foundation_release(long range) {
        LegacyTextFieldState legacyTextFieldState = this.state;
        if (legacyTextFieldState != null) {
            legacyTextFieldState.m1322setDeletionPreviewHighlightRange5zctL8(range);
        }
        LegacyTextFieldState legacyTextFieldState2 = this.state;
        if (legacyTextFieldState2 != null) {
            legacyTextFieldState2.m1325setSelectionPreviewHighlightRange5zctL8(TextRange.INSTANCE.m6465getZerod9O1mEE());
        }
        if (TextRange.m6454getCollapsedimpl(range)) {
            return;
        }
        exitSelectionMode$foundation_release();
    }

    public final void clearPreviewHighlight$foundation_release() {
        LegacyTextFieldState legacyTextFieldState = this.state;
        if (legacyTextFieldState != null) {
            legacyTextFieldState.m1322setDeletionPreviewHighlightRange5zctL8(TextRange.INSTANCE.m6465getZerod9O1mEE());
        }
        LegacyTextFieldState legacyTextFieldState2 = this.state;
        if (legacyTextFieldState2 == null) {
            return;
        }
        legacyTextFieldState2.m1325setSelectionPreviewHighlightRange5zctL8(TextRange.INSTANCE.m6465getZerod9O1mEE());
    }

    public static /* synthetic */ void copy$foundation_release$default(TextFieldSelectionManager textFieldSelectionManager, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        textFieldSelectionManager.copy$foundation_release(z);
    }

    public final void copy$foundation_release(boolean cancelSelection) {
        if (TextRange.m6454getCollapsedimpl(getValue$foundation_release().getSelection())) {
            return;
        }
        ClipboardManager clipboardManager = this.clipboardManager;
        if (clipboardManager != null) {
            clipboardManager.setText(TextFieldValueKt.getSelectedText(getValue$foundation_release()));
        }
        if (cancelSelection) {
            int m6457getMaximpl = TextRange.m6457getMaximpl(getValue$foundation_release().getSelection());
            this.onValueChange.invoke(m1698createTextFieldValueFDrldGo(getValue$foundation_release().getAnnotatedString(), TextRangeKt.TextRange(m6457getMaximpl, m6457getMaximpl)));
            setHandleState(HandleState.None);
        }
    }

    public final void paste$foundation_release() {
        AnnotatedString text;
        ClipboardManager clipboardManager = this.clipboardManager;
        if (clipboardManager == null || (text = clipboardManager.getText()) == null) {
            return;
        }
        AnnotatedString plus = TextFieldValueKt.getTextBeforeSelection(getValue$foundation_release(), getValue$foundation_release().getText().length()).plus(text).plus(TextFieldValueKt.getTextAfterSelection(getValue$foundation_release(), getValue$foundation_release().getText().length()));
        int m6458getMinimpl = TextRange.m6458getMinimpl(getValue$foundation_release().getSelection()) + text.length();
        this.onValueChange.invoke(m1698createTextFieldValueFDrldGo(plus, TextRangeKt.TextRange(m6458getMinimpl, m6458getMinimpl)));
        setHandleState(HandleState.None);
        UndoManager undoManager = this.undoManager;
        if (undoManager != null) {
            undoManager.forceNextSnapshot();
        }
    }

    public final void cut$foundation_release() {
        if (TextRange.m6454getCollapsedimpl(getValue$foundation_release().getSelection())) {
            return;
        }
        ClipboardManager clipboardManager = this.clipboardManager;
        if (clipboardManager != null) {
            clipboardManager.setText(TextFieldValueKt.getSelectedText(getValue$foundation_release()));
        }
        AnnotatedString plus = TextFieldValueKt.getTextBeforeSelection(getValue$foundation_release(), getValue$foundation_release().getText().length()).plus(TextFieldValueKt.getTextAfterSelection(getValue$foundation_release(), getValue$foundation_release().getText().length()));
        int m6458getMinimpl = TextRange.m6458getMinimpl(getValue$foundation_release().getSelection());
        this.onValueChange.invoke(m1698createTextFieldValueFDrldGo(plus, TextRangeKt.TextRange(m6458getMinimpl, m6458getMinimpl)));
        setHandleState(HandleState.None);
        UndoManager undoManager = this.undoManager;
        if (undoManager != null) {
            undoManager.forceNextSnapshot();
        }
    }

    public final void selectAll$foundation_release() {
        TextFieldValue m1698createTextFieldValueFDrldGo = m1698createTextFieldValueFDrldGo(getValue$foundation_release().getAnnotatedString(), TextRangeKt.TextRange(0, getValue$foundation_release().getText().length()));
        this.onValueChange.invoke(m1698createTextFieldValueFDrldGo);
        this.oldValue = TextFieldValue.m6702copy3r_uNRQ$default(this.oldValue, (AnnotatedString) null, m1698createTextFieldValueFDrldGo.getSelection(), (TextRange) null, 5, (Object) null);
        enterSelectionMode$foundation_release(true);
    }

    /* renamed from: getHandlePosition-tuRUvjQ$foundation_release, reason: not valid java name */
    public final long m1706getHandlePositiontuRUvjQ$foundation_release(boolean isStartHandle) {
        TextLayoutResultProxy layoutResult;
        TextLayoutResult value;
        LegacyTextFieldState legacyTextFieldState = this.state;
        if (legacyTextFieldState == null || (layoutResult = legacyTextFieldState.getLayoutResult()) == null || (value = layoutResult.getValue()) == null) {
            return Offset.INSTANCE.m4289getUnspecifiedF1C5BW0();
        }
        AnnotatedString transformedText$foundation_release = getTransformedText$foundation_release();
        if (transformedText$foundation_release == null) {
            return Offset.INSTANCE.m4289getUnspecifiedF1C5BW0();
        }
        if (!Intrinsics.areEqual(transformedText$foundation_release.getText(), value.getLayoutInput().getText().getText())) {
            return Offset.INSTANCE.m4289getUnspecifiedF1C5BW0();
        }
        long selection = getValue$foundation_release().getSelection();
        return TextSelectionDelegateKt.getSelectionHandleCoordinates(value, this.offsetMapping.originalToTransformed(isStartHandle ? TextRange.m6460getStartimpl(selection) : TextRange.m6455getEndimpl(selection)), isStartHandle, TextRange.m6459getReversedimpl(getValue$foundation_release().getSelection()));
    }

    /* renamed from: getCursorPosition-tuRUvjQ$foundation_release, reason: not valid java name */
    public final long m1705getCursorPositiontuRUvjQ$foundation_release(Density density) {
        int originalToTransformed = this.offsetMapping.originalToTransformed(TextRange.m6460getStartimpl(getValue$foundation_release().getSelection()));
        LegacyTextFieldState legacyTextFieldState = this.state;
        TextLayoutResultProxy layoutResult = legacyTextFieldState != null ? legacyTextFieldState.getLayoutResult() : null;
        Intrinsics.checkNotNull(layoutResult);
        TextLayoutResult value = layoutResult.getValue();
        Rect cursorRect = value.getCursorRect(RangesKt.coerceIn(originalToTransformed, 0, value.getLayoutInput().getText().length()));
        return OffsetKt.Offset(cursorRect.getLeft() + (density.mo677toPx0680j_4(TextFieldCursorKt.getDefaultCursorThickness()) / 2), cursorRect.getBottom());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateFloatingToolbar(boolean show) {
        LegacyTextFieldState legacyTextFieldState = this.state;
        if (legacyTextFieldState != null) {
            legacyTextFieldState.setShowFloatingToolbar(show);
        }
        if (show) {
            showSelectionToolbar$foundation_release();
        } else {
            hideSelectionToolbar$foundation_release();
        }
    }

    public final void showSelectionToolbar$foundation_release() {
        ClipboardManager clipboardManager;
        if (getEnabled()) {
            LegacyTextFieldState legacyTextFieldState = this.state;
            if (legacyTextFieldState == null || legacyTextFieldState.isInTouchMode()) {
                boolean z = this.visualTransformation instanceof PasswordVisualTransformation;
                Function0<Unit> function0 = (TextRange.m6454getCollapsedimpl(getValue$foundation_release().getSelection()) || z) ? null : new Function0<Unit>() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbar$copy$1
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
                        TextFieldSelectionManager.copy$foundation_release$default(TextFieldSelectionManager.this, false, 1, null);
                        TextFieldSelectionManager.this.hideSelectionToolbar$foundation_release();
                    }
                };
                Function0<Unit> function02 = (TextRange.m6454getCollapsedimpl(getValue$foundation_release().getSelection()) || !getEditable() || z) ? null : new Function0<Unit>() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbar$cut$1
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
                        TextFieldSelectionManager.this.cut$foundation_release();
                        TextFieldSelectionManager.this.hideSelectionToolbar$foundation_release();
                    }
                };
                Function0<Unit> function03 = (getEditable() && (clipboardManager = this.clipboardManager) != null && clipboardManager.hasText()) ? new Function0<Unit>() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbar$paste$1
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
                        TextFieldSelectionManager.this.paste$foundation_release();
                        TextFieldSelectionManager.this.hideSelectionToolbar$foundation_release();
                    }
                } : null;
                Function0<Unit> function04 = TextRange.m6456getLengthimpl(getValue$foundation_release().getSelection()) != getValue$foundation_release().getText().length() ? new Function0<Unit>() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbar$selectAll$1
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
                        TextFieldSelectionManager.this.selectAll$foundation_release();
                    }
                } : null;
                TextToolbar textToolbar = this.textToolbar;
                if (textToolbar != null) {
                    textToolbar.showMenu(getContentRect(), function0, function03, function02, function04);
                }
            }
        }
    }

    public final void hideSelectionToolbar$foundation_release() {
        TextToolbar textToolbar;
        TextToolbar textToolbar2 = this.textToolbar;
        if ((textToolbar2 != null ? textToolbar2.getStatus() : null) != TextToolbarStatus.Shown || (textToolbar = this.textToolbar) == null) {
            return;
        }
        textToolbar.hide();
    }

    /* renamed from: contextMenuOpenAdjustment-k-4lQ0M, reason: not valid java name */
    public final void m1702contextMenuOpenAdjustmentk4lQ0M(long position) {
        TextLayoutResultProxy layoutResult;
        LegacyTextFieldState legacyTextFieldState = this.state;
        if (legacyTextFieldState == null || (layoutResult = legacyTextFieldState.getLayoutResult()) == null) {
            return;
        }
        if (TextRange.m6451containsimpl(getValue$foundation_release().getSelection(), TextLayoutResultProxy.m1394getOffsetForPosition3MmeM6k$default(layoutResult, position, false, 2, null))) {
            return;
        }
        this.previousRawDragOffset = -1;
        m1701updateSelection8UEBfa8(getValue$foundation_release(), position, true, false, SelectionAdjustment.INSTANCE.getWord(), false);
    }

    public final boolean isTextChanged$foundation_release() {
        return !Intrinsics.areEqual(this.oldValue.getText(), getValue$foundation_release().getText());
    }

    private final Rect getContentRect() {
        float f;
        LayoutCoordinates layoutCoordinates;
        TextLayoutResult value;
        Rect cursorRect;
        LayoutCoordinates layoutCoordinates2;
        TextLayoutResult value2;
        Rect cursorRect2;
        LayoutCoordinates layoutCoordinates3;
        LayoutCoordinates layoutCoordinates4;
        LegacyTextFieldState legacyTextFieldState = this.state;
        if (legacyTextFieldState != null) {
            if (!(!legacyTextFieldState.getIsLayoutResultStale())) {
                legacyTextFieldState = null;
            }
            if (legacyTextFieldState != null) {
                int originalToTransformed = this.offsetMapping.originalToTransformed(TextRange.m6460getStartimpl(getValue$foundation_release().getSelection()));
                int originalToTransformed2 = this.offsetMapping.originalToTransformed(TextRange.m6455getEndimpl(getValue$foundation_release().getSelection()));
                LegacyTextFieldState legacyTextFieldState2 = this.state;
                long m4290getZeroF1C5BW0 = (legacyTextFieldState2 == null || (layoutCoordinates4 = legacyTextFieldState2.getLayoutCoordinates()) == null) ? Offset.INSTANCE.m4290getZeroF1C5BW0() : layoutCoordinates4.mo5862localToRootMKHz9U(m1706getHandlePositiontuRUvjQ$foundation_release(true));
                LegacyTextFieldState legacyTextFieldState3 = this.state;
                long m4290getZeroF1C5BW02 = (legacyTextFieldState3 == null || (layoutCoordinates3 = legacyTextFieldState3.getLayoutCoordinates()) == null) ? Offset.INSTANCE.m4290getZeroF1C5BW0() : layoutCoordinates3.mo5862localToRootMKHz9U(m1706getHandlePositiontuRUvjQ$foundation_release(false));
                LegacyTextFieldState legacyTextFieldState4 = this.state;
                float f2 = 0.0f;
                if (legacyTextFieldState4 == null || (layoutCoordinates2 = legacyTextFieldState4.getLayoutCoordinates()) == null) {
                    f = 0.0f;
                } else {
                    TextLayoutResultProxy layoutResult = legacyTextFieldState.getLayoutResult();
                    f = Offset.m4275getYimpl(layoutCoordinates2.mo5862localToRootMKHz9U(OffsetKt.Offset(0.0f, (layoutResult == null || (value2 = layoutResult.getValue()) == null || (cursorRect2 = value2.getCursorRect(originalToTransformed)) == null) ? 0.0f : cursorRect2.getTop())));
                }
                LegacyTextFieldState legacyTextFieldState5 = this.state;
                if (legacyTextFieldState5 != null && (layoutCoordinates = legacyTextFieldState5.getLayoutCoordinates()) != null) {
                    TextLayoutResultProxy layoutResult2 = legacyTextFieldState.getLayoutResult();
                    f2 = Offset.m4275getYimpl(layoutCoordinates.mo5862localToRootMKHz9U(OffsetKt.Offset(0.0f, (layoutResult2 == null || (value = layoutResult2.getValue()) == null || (cursorRect = value.getCursorRect(originalToTransformed2)) == null) ? 0.0f : cursorRect.getTop())));
                }
                return new Rect(Math.min(Offset.m4274getXimpl(m4290getZeroF1C5BW0), Offset.m4274getXimpl(m4290getZeroF1C5BW02)), Math.min(f, f2), Math.max(Offset.m4274getXimpl(m4290getZeroF1C5BW0), Offset.m4274getXimpl(m4290getZeroF1C5BW02)), Math.max(Offset.m4275getYimpl(m4290getZeroF1C5BW0), Offset.m4275getYimpl(m4290getZeroF1C5BW02)) + (Dp.m6997constructorimpl(25) * legacyTextFieldState.getTextDelegate().getDensity().getDensity()));
            }
        }
        return Rect.INSTANCE.getZero();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: updateSelection-8UEBfa8, reason: not valid java name */
    public final long m1701updateSelection8UEBfa8(TextFieldValue value, long currentPosition, boolean isStartOfSelection, boolean isStartHandle, SelectionAdjustment adjustment, boolean isTouchBasedSelection) {
        TextLayoutResultProxy layoutResult;
        HapticFeedback hapticFeedback;
        int i;
        LegacyTextFieldState legacyTextFieldState = this.state;
        if (legacyTextFieldState == null || (layoutResult = legacyTextFieldState.getLayoutResult()) == null) {
            return TextRange.INSTANCE.m6465getZerod9O1mEE();
        }
        long TextRange = TextRangeKt.TextRange(this.offsetMapping.originalToTransformed(TextRange.m6460getStartimpl(value.getSelection())), this.offsetMapping.originalToTransformed(TextRange.m6455getEndimpl(value.getSelection())));
        boolean z = false;
        int m1395getOffsetForPosition3MmeM6k = layoutResult.m1395getOffsetForPosition3MmeM6k(currentPosition, false);
        int m6460getStartimpl = (isStartHandle || isStartOfSelection) ? m1395getOffsetForPosition3MmeM6k : TextRange.m6460getStartimpl(TextRange);
        int m6455getEndimpl = (!isStartHandle || isStartOfSelection) ? m1395getOffsetForPosition3MmeM6k : TextRange.m6455getEndimpl(TextRange);
        SelectionLayout selectionLayout = this.previousSelectionLayout;
        int i2 = -1;
        if (!isStartOfSelection && selectionLayout != null && (i = this.previousRawDragOffset) != -1) {
            i2 = i;
        }
        SelectionLayout m1650getTextFieldSelectionLayoutRcvTLA = SelectionLayoutKt.m1650getTextFieldSelectionLayoutRcvTLA(layoutResult.getValue(), m6460getStartimpl, m6455getEndimpl, i2, TextRange, isStartOfSelection, isStartHandle);
        if (!m1650getTextFieldSelectionLayoutRcvTLA.shouldRecomputeSelection(selectionLayout)) {
            return value.getSelection();
        }
        this.previousSelectionLayout = m1650getTextFieldSelectionLayoutRcvTLA;
        this.previousRawDragOffset = m1395getOffsetForPosition3MmeM6k;
        Selection adjust = adjustment.adjust(m1650getTextFieldSelectionLayoutRcvTLA);
        long TextRange2 = TextRangeKt.TextRange(this.offsetMapping.transformedToOriginal(adjust.getStart().getOffset()), this.offsetMapping.transformedToOriginal(adjust.getEnd().getOffset()));
        if (TextRange.m6453equalsimpl0(TextRange2, value.getSelection())) {
            return value.getSelection();
        }
        boolean z2 = TextRange.m6459getReversedimpl(TextRange2) != TextRange.m6459getReversedimpl(value.getSelection()) && TextRange.m6453equalsimpl0(TextRangeKt.TextRange(TextRange.m6455getEndimpl(TextRange2), TextRange.m6460getStartimpl(TextRange2)), value.getSelection());
        boolean z3 = TextRange.m6454getCollapsedimpl(TextRange2) && TextRange.m6454getCollapsedimpl(value.getSelection());
        if (isTouchBasedSelection && value.getText().length() > 0 && !z2 && !z3 && (hapticFeedback = this.hapticFeedBack) != null) {
            hapticFeedback.mo5243performHapticFeedbackCdsT49E(HapticFeedbackType.INSTANCE.m5252getTextHandleMove5zf0vsI());
        }
        this.onValueChange.invoke(m1698createTextFieldValueFDrldGo(value.getAnnotatedString(), TextRange2));
        if (!isTouchBasedSelection) {
            updateFloatingToolbar(!TextRange.m6454getCollapsedimpl(TextRange2));
        }
        LegacyTextFieldState legacyTextFieldState2 = this.state;
        if (legacyTextFieldState2 != null) {
            legacyTextFieldState2.setInTouchMode(isTouchBasedSelection);
        }
        LegacyTextFieldState legacyTextFieldState3 = this.state;
        if (legacyTextFieldState3 != null) {
            legacyTextFieldState3.setShowSelectionHandleStart(!TextRange.m6454getCollapsedimpl(TextRange2) && TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(this, true));
        }
        LegacyTextFieldState legacyTextFieldState4 = this.state;
        if (legacyTextFieldState4 != null) {
            legacyTextFieldState4.setShowSelectionHandleEnd(!TextRange.m6454getCollapsedimpl(TextRange2) && TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(this, false));
        }
        LegacyTextFieldState legacyTextFieldState5 = this.state;
        if (legacyTextFieldState5 != null) {
            if (TextRange.m6454getCollapsedimpl(TextRange2) && TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(this, true)) {
                z = true;
            }
            legacyTextFieldState5.setShowCursorHandle(z);
        }
        return TextRange2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setHandleState(HandleState handleState) {
        LegacyTextFieldState legacyTextFieldState = this.state;
        if (legacyTextFieldState != null) {
            if (legacyTextFieldState.getHandleState() == handleState) {
                legacyTextFieldState = null;
            }
            if (legacyTextFieldState != null) {
                legacyTextFieldState.setHandleState(handleState);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: createTextFieldValue-FDrldGo, reason: not valid java name */
    public final TextFieldValue m1698createTextFieldValueFDrldGo(AnnotatedString annotatedString, long selection) {
        return new TextFieldValue(annotatedString, selection, (TextRange) null, 4, (DefaultConstructorMarker) null);
    }
}
