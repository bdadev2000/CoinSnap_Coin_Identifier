package androidx.compose.foundation.text.input.internal;

import android.view.KeyEvent;
import androidx.compose.foundation.content.MediaType;
import androidx.compose.foundation.content.ReceiveContentListener;
import androidx.compose.foundation.content.TransferableContent;
import androidx.compose.foundation.content.TransferableContent_androidKt;
import androidx.compose.foundation.content.internal.DragAndDropRequestPermission_androidKt;
import androidx.compose.foundation.content.internal.ReceiveContentConfiguration;
import androidx.compose.foundation.content.internal.ReceiveContentConfigurationKt;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.foundation.text.handwriting.StylusHandwritingNode;
import androidx.compose.foundation.text.handwriting.StylusHandwriting_androidKt;
import androidx.compose.foundation.text.input.InputTransformation;
import androidx.compose.foundation.text.input.KeyboardActionHandler;
import androidx.compose.foundation.text.input.TextFieldCharSequence;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.foundation.text.input.internal.selection.TextToolbarState;
import androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior;
import androidx.compose.ui.draganddrop.DragAndDropEvent;
import androidx.compose.ui.draganddrop.DragAndDropModifierNode;
import androidx.compose.ui.focus.FocusEventModifierNode;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.focus.FocusRequesterModifierNode;
import androidx.compose.ui.focus.FocusRequesterModifierNodeKt;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.key.KeyInputModifierNode;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.modifier.ModifierLocalModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.GlobalPositionAwareModifierNode;
import androidx.compose.ui.node.LayoutAwareModifierNode;
import androidx.compose.ui.node.ObserverModifierNode;
import androidx.compose.ui.node.ObserverModifierNodeKt;
import androidx.compose.ui.node.PointerInputModifierNode;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.node.SemanticsModifierNodeKt;
import androidx.compose.ui.platform.ClipEntry;
import androidx.compose.ui.platform.ClipMetadata;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.PlatformTextInputModifierNode;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.platform.WindowInfo;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.input.ImeAction;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;

/* compiled from: TextFieldDecoratorModifier.kt */
@Metadata(d1 = {"\u0000\u0081\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000*\u0001>\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\n2\u00020\u000b2\u00020\fBY\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\u0006\u0010\u001c\u001a\u00020\u0016\u0012\u0006\u0010\u001d\u001a\u00020\u001e¢\u0006\u0002\u0010\u001fJ\b\u0010d\u001a\u00020\"H\u0002J\b\u0010e\u001a\u00020\"H\u0002J\b\u0010f\u001a\u00020\"H\u0016J\b\u0010g\u001a\u00020\"H\u0016J\b\u0010h\u001a\u00020\"H\u0016J\b\u0010i\u001a\u00020\"H\u0002J\u0010\u0010j\u001a\u00020\"2\u0006\u0010k\u001a\u00020lH\u0016J\u0010\u0010m\u001a\u00020\"2\u0006\u0010n\u001a\u00020oH\u0016J\u001a\u0010p\u001a\u00020\"2\u0006\u0010q\u001a\u00020rH\u0002ø\u0001\u0000¢\u0006\u0004\bs\u0010tJ\u001a\u0010u\u001a\u00020\u00162\u0006\u0010v\u001a\u00020wH\u0016ø\u0001\u0000¢\u0006\u0004\bx\u0010yJ\b\u0010z\u001a\u00020\"H\u0016J.\u0010{\u001a\u00020\"2\u0006\u0010|\u001a\u00020}2\u0006\u0010~\u001a\u00020\u007f2\b\u0010\u0080\u0001\u001a\u00030\u0081\u0001H\u0016ø\u0001\u0000¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J\u001c\u0010\u0084\u0001\u001a\u00020\u00162\u0006\u0010v\u001a\u00020wH\u0016ø\u0001\u0000¢\u0006\u0005\b\u0085\u0001\u0010yJ\n\u0010\u0086\u0001\u001a\u00030\u0087\u0001H\u0002J\u0012\u0010\u0088\u0001\u001a\u00020\"2\u0007\u0010\u0089\u0001\u001a\u00020\u0016H\u0002J[\u0010\u008a\u0001\u001a\u00020\"2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u001eJ\u000e\u0010\u008b\u0001\u001a\u00020\"*\u00030\u008c\u0001H\u0016R\u0016\u0010 \u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010!X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010%\u001a\u0004\u0018\u00010&X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010'\u001a\u00020\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010)\"\u0004\b+\u0010,R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u0010\u00101\u001a\u0004\u0018\u000102X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u001d\u001a\u00020\u001eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u000e\u00107\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u00108\u001a\u00020\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b8\u0010)R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u0010\u0010=\u001a\u00020>X\u0082\u0004¢\u0006\u0004\n\u0002\u0010?R\u001e\u0010\u0018\u001a\u00020\u00192\u0006\u0010@\u001a\u00020\u0019@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\bA\u0010BR\u0010\u0010C\u001a\u0004\u0018\u000102X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010D\u001a\u00020EX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0017\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010)\"\u0004\bG\u0010,R\u0016\u0010H\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010J0IX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010K\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bL\u0010)R\u001a\u0010\u001c\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bM\u0010)\"\u0004\bN\u0010,R\u000e\u0010O\u001a\u00020PX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010Q\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010!8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bR\u0010SR\u000e\u0010T\u001a\u00020UX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR\u0010\u0010b\u001a\u0004\u0018\u00010cX\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u008d\u0001"}, d2 = {"Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;", "Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/platform/PlatformTextInputModifierNode;", "Landroidx/compose/ui/node/SemanticsModifierNode;", "Landroidx/compose/ui/focus/FocusRequesterModifierNode;", "Landroidx/compose/ui/focus/FocusEventModifierNode;", "Landroidx/compose/ui/node/GlobalPositionAwareModifierNode;", "Landroidx/compose/ui/node/PointerInputModifierNode;", "Landroidx/compose/ui/input/key/KeyInputModifierNode;", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "Landroidx/compose/ui/modifier/ModifierLocalModifierNode;", "Landroidx/compose/ui/node/ObserverModifierNode;", "Landroidx/compose/ui/node/LayoutAwareModifierNode;", "textFieldState", "Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;", "textLayoutState", "Landroidx/compose/foundation/text/input/internal/TextLayoutState;", "textFieldSelectionState", "Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;", "filter", "Landroidx/compose/foundation/text/input/InputTransformation;", "enabled", "", "readOnly", "keyboardOptions", "Landroidx/compose/foundation/text/KeyboardOptions;", "keyboardActionHandler", "Landroidx/compose/foundation/text/input/KeyboardActionHandler;", "singleLine", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroidx/compose/foundation/text/input/internal/TextLayoutState;Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;Landroidx/compose/foundation/text/input/InputTransformation;ZZLandroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/input/KeyboardActionHandler;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;)V", "backingStylusHandwritingTrigger", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "", "dragAndDropNode", "Landroidx/compose/ui/draganddrop/DragAndDropModifierNode;", "dragEnterEvent", "Landroidx/compose/foundation/interaction/HoverInteraction$Enter;", "editable", "getEditable", "()Z", "getEnabled", "setEnabled", "(Z)V", "getFilter", "()Landroidx/compose/foundation/text/input/InputTransformation;", "setFilter", "(Landroidx/compose/foundation/text/input/InputTransformation;)V", "inputSessionJob", "Lkotlinx/coroutines/Job;", "getInteractionSource", "()Landroidx/compose/foundation/interaction/MutableInteractionSource;", "setInteractionSource", "(Landroidx/compose/foundation/interaction/MutableInteractionSource;)V", "isElementFocused", "isFocused", "getKeyboardActionHandler", "()Landroidx/compose/foundation/text/input/KeyboardActionHandler;", "setKeyboardActionHandler", "(Landroidx/compose/foundation/text/input/KeyboardActionHandler;)V", "keyboardActionScope", "androidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode$keyboardActionScope$1", "Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode$keyboardActionScope$1;", "<set-?>", "getKeyboardOptions", "()Landroidx/compose/foundation/text/KeyboardOptions;", "observeChangesJob", "pointerInputNode", "Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNode;", "getReadOnly", "setReadOnly", "receiveContentConfigurationProvider", "Lkotlin/Function0;", "Landroidx/compose/foundation/content/internal/ReceiveContentConfiguration;", "shouldMergeDescendantSemantics", "getShouldMergeDescendantSemantics", "getSingleLine", "setSingleLine", "stylusHandwritingNode", "Landroidx/compose/foundation/text/handwriting/StylusHandwritingNode;", "stylusHandwritingTrigger", "getStylusHandwritingTrigger", "()Lkotlinx/coroutines/flow/MutableSharedFlow;", "textFieldKeyEventHandler", "Landroidx/compose/foundation/text/input/internal/TextFieldKeyEventHandler;", "getTextFieldSelectionState", "()Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;", "setTextFieldSelectionState", "(Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;)V", "getTextFieldState", "()Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;", "setTextFieldState", "(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;)V", "getTextLayoutState", "()Landroidx/compose/foundation/text/input/internal/TextLayoutState;", "setTextLayoutState", "(Landroidx/compose/foundation/text/input/internal/TextLayoutState;)V", "windowInfo", "Landroidx/compose/ui/platform/WindowInfo;", "disposeInputSession", "emitDragExitEvent", "onAttach", "onCancelPointerInput", "onDetach", "onFocusChange", "onFocusEvent", "focusState", "Landroidx/compose/ui/focus/FocusState;", "onGloballyPositioned", "coordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "onImeActionPerformed", "imeAction", "Landroidx/compose/ui/text/input/ImeAction;", "onImeActionPerformed-KlQnJC8", "(I)V", "onKeyEvent", NotificationCompat.CATEGORY_EVENT, "Landroidx/compose/ui/input/key/KeyEvent;", "onKeyEvent-ZmokQxo", "(Landroid/view/KeyEvent;)Z", "onObservedReadsChanged", "onPointerEvent", "pointerEvent", "Landroidx/compose/ui/input/pointer/PointerEvent;", "pass", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "bounds", "Landroidx/compose/ui/unit/IntSize;", "onPointerEvent-H0pRuoY", "(Landroidx/compose/ui/input/pointer/PointerEvent;Landroidx/compose/ui/input/pointer/PointerEventPass;J)V", "onPreKeyEvent", "onPreKeyEvent-ZmokQxo", "requireKeyboardController", "Landroidx/compose/ui/platform/SoftwareKeyboardController;", "startInputSession", "fromTap", "updateNode", "applySemantics", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class TextFieldDecoratorModifierNode extends DelegatingNode implements PlatformTextInputModifierNode, SemanticsModifierNode, FocusRequesterModifierNode, FocusEventModifierNode, GlobalPositionAwareModifierNode, PointerInputModifierNode, KeyInputModifierNode, CompositionLocalConsumerModifierNode, ModifierLocalModifierNode, ObserverModifierNode, LayoutAwareModifierNode {
    public static final int $stable = 8;
    private MutableSharedFlow<Unit> backingStylusHandwritingTrigger;
    private final DragAndDropModifierNode dragAndDropNode;
    private HoverInteraction.Enter dragEnterEvent;
    private boolean enabled;
    private InputTransformation filter;
    private Job inputSessionJob;
    private MutableInteractionSource interactionSource;
    private boolean isElementFocused;
    private KeyboardActionHandler keyboardActionHandler;
    private final TextFieldDecoratorModifierNode$keyboardActionScope$1 keyboardActionScope;
    private KeyboardOptions keyboardOptions;
    private Job observeChangesJob;
    private final SuspendingPointerInputModifierNode pointerInputNode = (SuspendingPointerInputModifierNode) delegate(SuspendingPointerInputFilterKt.SuspendingPointerInputModifierNode(new TextFieldDecoratorModifierNode$pointerInputNode$1(this, null)));
    private boolean readOnly;
    private final Function0<ReceiveContentConfiguration> receiveContentConfigurationProvider;
    private boolean singleLine;
    private final StylusHandwritingNode stylusHandwritingNode;
    private final TextFieldKeyEventHandler textFieldKeyEventHandler;
    private TextFieldSelectionState textFieldSelectionState;
    private TransformedTextFieldState textFieldState;
    private TextLayoutState textLayoutState;
    private WindowInfo windowInfo;

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public boolean getShouldMergeDescendantSemantics() {
        return true;
    }

    public final TransformedTextFieldState getTextFieldState() {
        return this.textFieldState;
    }

    public final void setTextFieldState(TransformedTextFieldState transformedTextFieldState) {
        this.textFieldState = transformedTextFieldState;
    }

    public final TextLayoutState getTextLayoutState() {
        return this.textLayoutState;
    }

    public final void setTextLayoutState(TextLayoutState textLayoutState) {
        this.textLayoutState = textLayoutState;
    }

    public final TextFieldSelectionState getTextFieldSelectionState() {
        return this.textFieldSelectionState;
    }

    public final void setTextFieldSelectionState(TextFieldSelectionState textFieldSelectionState) {
        this.textFieldSelectionState = textFieldSelectionState;
    }

    public final InputTransformation getFilter() {
        return this.filter;
    }

    public final void setFilter(InputTransformation inputTransformation) {
        this.filter = inputTransformation;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final void setEnabled(boolean z) {
        this.enabled = z;
    }

    public final boolean getReadOnly() {
        return this.readOnly;
    }

    public final void setReadOnly(boolean z) {
        this.readOnly = z;
    }

    public final KeyboardActionHandler getKeyboardActionHandler() {
        return this.keyboardActionHandler;
    }

    public final void setKeyboardActionHandler(KeyboardActionHandler keyboardActionHandler) {
        this.keyboardActionHandler = keyboardActionHandler;
    }

    public final boolean getSingleLine() {
        return this.singleLine;
    }

    public final void setSingleLine(boolean z) {
        this.singleLine = z;
    }

    public final MutableInteractionSource getInteractionSource() {
        return this.interactionSource;
    }

    public final void setInteractionSource(MutableInteractionSource mutableInteractionSource) {
        this.interactionSource = mutableInteractionSource;
    }

    public TextFieldDecoratorModifierNode(TransformedTextFieldState transformedTextFieldState, TextLayoutState textLayoutState, TextFieldSelectionState textFieldSelectionState, InputTransformation inputTransformation, boolean z, boolean z2, final KeyboardOptions keyboardOptions, KeyboardActionHandler keyboardActionHandler, boolean z3, MutableInteractionSource mutableInteractionSource) {
        DragAndDropModifierNode textFieldDragAndDropNode;
        this.textFieldState = transformedTextFieldState;
        this.textLayoutState = textLayoutState;
        this.textFieldSelectionState = textFieldSelectionState;
        this.filter = inputTransformation;
        this.enabled = z;
        this.readOnly = z2;
        this.keyboardActionHandler = keyboardActionHandler;
        this.singleLine = z3;
        this.interactionSource = mutableInteractionSource;
        this.stylusHandwritingNode = (StylusHandwritingNode) delegate(new StylusHandwritingNode(new Function0<Boolean>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$stylusHandwritingNode$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Code restructure failed: missing block: B:8:0x0033, code lost:
            
                r0 = r2.this$0.getStylusHandwritingTrigger();
             */
            @Override // kotlin.jvm.functions.Function0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Boolean invoke() {
                /*
                    r2 = this;
                    androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode r0 = androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode.this
                    boolean r0 = androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode.access$isFocused(r0)
                    if (r0 != 0) goto Lf
                    androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode r0 = androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode.this
                    androidx.compose.ui.focus.FocusRequesterModifierNode r0 = (androidx.compose.ui.focus.FocusRequesterModifierNode) r0
                    androidx.compose.ui.focus.FocusRequesterModifierNodeKt.requestFocus(r0)
                Lf:
                    androidx.compose.foundation.text.KeyboardOptions r0 = r2
                    int r0 = r0.getKeyboardType()
                    androidx.compose.ui.text.input.KeyboardType$Companion r1 = androidx.compose.ui.text.input.KeyboardType.INSTANCE
                    int r1 = r1.m6697getPasswordPjHm6EE()
                    boolean r0 = androidx.compose.ui.text.input.KeyboardType.m6678equalsimpl0(r0, r1)
                    if (r0 != 0) goto L40
                    androidx.compose.foundation.text.KeyboardOptions r0 = r2
                    int r0 = r0.getKeyboardType()
                    androidx.compose.ui.text.input.KeyboardType$Companion r1 = androidx.compose.ui.text.input.KeyboardType.INSTANCE
                    int r1 = r1.m6696getNumberPasswordPjHm6EE()
                    boolean r0 = androidx.compose.ui.text.input.KeyboardType.m6678equalsimpl0(r0, r1)
                    if (r0 != 0) goto L40
                    androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode r0 = androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode.this
                    kotlinx.coroutines.flow.MutableSharedFlow r0 = androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode.access$getStylusHandwritingTrigger(r0)
                    if (r0 == 0) goto L40
                    kotlin.Unit r1 = kotlin.Unit.INSTANCE
                    r0.tryEmit(r1)
                L40:
                    r0 = 1
                    java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$stylusHandwritingNode$1.invoke():java.lang.Boolean");
            }
        }));
        textFieldDragAndDropNode = TextFieldDragAndDropNode_androidKt.textFieldDragAndDropNode(new Function0<Set<? extends MediaType>>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$dragAndDropNode$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Set<? extends MediaType> invoke() {
                Set<? extends MediaType> set;
                Set<? extends MediaType> set2;
                if (ReceiveContentConfigurationKt.getReceiveContentConfiguration(TextFieldDecoratorModifierNode.this) != null) {
                    set2 = TextFieldDecoratorModifierKt.MediaTypesAll;
                    return set2;
                }
                set = TextFieldDecoratorModifierKt.MediaTypesText;
                return set;
            }
        }, new Function2<ClipEntry, ClipMetadata, Boolean>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$dragAndDropNode$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Boolean invoke(ClipEntry clipEntry, ClipMetadata clipMetadata) {
                ClipEntry clipEntry2;
                TextFieldDecoratorModifierNode.this.emitDragExitEvent();
                TextFieldDecoratorModifierNode.this.getTextFieldSelectionState().clearHandleDragging();
                String readPlainText = TransferableContent_androidKt.readPlainText(clipEntry);
                ReceiveContentConfiguration receiveContentConfiguration = ReceiveContentConfigurationKt.getReceiveContentConfiguration(TextFieldDecoratorModifierNode.this);
                if (receiveContentConfiguration != null) {
                    TransferableContent onReceive = receiveContentConfiguration.getReceiveContentListener().onReceive(new TransferableContent(clipEntry, clipMetadata, TransferableContent.Source.INSTANCE.m641getDragAndDropkB6V9T0(), null, 8, null));
                    readPlainText = (onReceive == null || (clipEntry2 = onReceive.getClipEntry()) == null) ? null : TransferableContent_androidKt.readPlainText(clipEntry2);
                }
                if (readPlainText != null) {
                    TransformedTextFieldState.replaceSelectedText$default(TextFieldDecoratorModifierNode.this.getTextFieldState(), readPlainText, false, null, 6, null);
                }
                return true;
            }
        }, new Function1<DragAndDropEvent, Unit>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$dragAndDropNode$3
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(DragAndDropEvent dragAndDropEvent) {
                invoke2(dragAndDropEvent);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(DragAndDropEvent dragAndDropEvent) {
                if (ReceiveContentConfigurationKt.getReceiveContentConfiguration(TextFieldDecoratorModifierNode.this) != null) {
                    DragAndDropRequestPermission_androidKt.dragAndDropRequestPermission(TextFieldDecoratorModifierNode.this, dragAndDropEvent);
                }
            }
        }, (r21 & 8) != 0 ? null : null, (r21 & 16) != 0 ? null : new Function1<DragAndDropEvent, Unit>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$dragAndDropNode$4
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(DragAndDropEvent dragAndDropEvent) {
                invoke2(dragAndDropEvent);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(DragAndDropEvent dragAndDropEvent) {
                ReceiveContentListener receiveContentListener;
                TextFieldDecoratorModifierNode textFieldDecoratorModifierNode = TextFieldDecoratorModifierNode.this;
                HoverInteraction.Enter enter = new HoverInteraction.Enter();
                TextFieldDecoratorModifierNode.this.getInteractionSource().tryEmit(enter);
                textFieldDecoratorModifierNode.dragEnterEvent = enter;
                ReceiveContentConfiguration receiveContentConfiguration = ReceiveContentConfigurationKt.getReceiveContentConfiguration(TextFieldDecoratorModifierNode.this);
                if (receiveContentConfiguration == null || (receiveContentListener = receiveContentConfiguration.getReceiveContentListener()) == null) {
                    return;
                }
                receiveContentListener.onDragEnter();
            }
        }, (r21 & 32) != 0 ? null : new Function1<Offset, Unit>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$dragAndDropNode$5
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Offset offset) {
                m1506invokek4lQ0M(offset.getPackedValue());
                return Unit.INSTANCE;
            }

            /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
            public final void m1506invokek4lQ0M(long j) {
                long m1527fromWindowToDecorationUv8p0NA = TextLayoutStateKt.m1527fromWindowToDecorationUv8p0NA(TextFieldDecoratorModifierNode.this.getTextLayoutState(), j);
                TextFieldDecoratorModifierNode.this.getTextFieldState().m1537selectCharsIn5zctL8(TextRangeKt.TextRange(TextLayoutState.m1517getOffsetForPosition3MmeM6k$default(TextFieldDecoratorModifierNode.this.getTextLayoutState(), m1527fromWindowToDecorationUv8p0NA, false, 2, null)));
                TextFieldDecoratorModifierNode.this.getTextFieldSelectionState().m1574updateHandleDraggingUv8p0NA(Handle.Cursor, m1527fromWindowToDecorationUv8p0NA);
            }
        }, (r21 & 64) != 0 ? null : null, (r21 & 128) != 0 ? null : new Function1<DragAndDropEvent, Unit>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$dragAndDropNode$6
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(DragAndDropEvent dragAndDropEvent) {
                invoke2(dragAndDropEvent);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(DragAndDropEvent dragAndDropEvent) {
                ReceiveContentListener receiveContentListener;
                TextFieldDecoratorModifierNode.this.emitDragExitEvent();
                TextFieldDecoratorModifierNode.this.getTextFieldSelectionState().clearHandleDragging();
                ReceiveContentConfiguration receiveContentConfiguration = ReceiveContentConfigurationKt.getReceiveContentConfiguration(TextFieldDecoratorModifierNode.this);
                if (receiveContentConfiguration == null || (receiveContentListener = receiveContentConfiguration.getReceiveContentListener()) == null) {
                    return;
                }
                receiveContentListener.onDragExit();
            }
        }, (r21 & 256) != 0 ? null : new Function1<DragAndDropEvent, Unit>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$dragAndDropNode$7
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(DragAndDropEvent dragAndDropEvent) {
                invoke2(dragAndDropEvent);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(DragAndDropEvent dragAndDropEvent) {
                TextFieldDecoratorModifierNode.this.emitDragExitEvent();
            }
        });
        this.dragAndDropNode = (DragAndDropModifierNode) delegate(textFieldDragAndDropNode);
        InputTransformation inputTransformation2 = this.filter;
        this.keyboardOptions = keyboardOptions.fillUnspecifiedValuesWith$foundation_release(inputTransformation2 != null ? inputTransformation2.getKeyboardOptions() : null);
        this.textFieldKeyEventHandler = TextFieldKeyEventHandler_androidKt.createTextFieldKeyEventHandler();
        this.keyboardActionScope = new TextFieldDecoratorModifierNode$keyboardActionScope$1(this);
        this.receiveContentConfigurationProvider = new Function0<ReceiveContentConfiguration>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$receiveContentConfigurationProvider$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ReceiveContentConfiguration invoke() {
                return ReceiveContentConfigurationKt.getReceiveContentConfiguration(TextFieldDecoratorModifierNode.this);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getEditable() {
        return this.enabled && !this.readOnly;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MutableSharedFlow<Unit> getStylusHandwritingTrigger() {
        MutableSharedFlow<Unit> mutableSharedFlow = this.backingStylusHandwritingTrigger;
        if (mutableSharedFlow != null) {
            return mutableSharedFlow;
        }
        if (!StylusHandwriting_androidKt.isStylusHandwritingSupported()) {
            return null;
        }
        MutableSharedFlow<Unit> MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(1, 0, BufferOverflow.DROP_LATEST, 2, null);
        this.backingStylusHandwritingTrigger = MutableSharedFlow$default;
        return MutableSharedFlow$default;
    }

    public final KeyboardOptions getKeyboardOptions() {
        return this.keyboardOptions;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isFocused() {
        WindowInfo windowInfo = this.windowInfo;
        return this.isElementFocused && (windowInfo != null && windowInfo.isWindowFocused());
    }

    public final void updateNode(TransformedTextFieldState textFieldState, TextLayoutState textLayoutState, TextFieldSelectionState textFieldSelectionState, InputTransformation filter, boolean enabled, boolean readOnly, KeyboardOptions keyboardOptions, KeyboardActionHandler keyboardActionHandler, boolean singleLine, MutableInteractionSource interactionSource) {
        boolean z = this.enabled;
        boolean z2 = z && !this.readOnly;
        boolean z3 = enabled && !readOnly;
        TransformedTextFieldState transformedTextFieldState = this.textFieldState;
        KeyboardOptions keyboardOptions2 = this.keyboardOptions;
        TextFieldSelectionState textFieldSelectionState2 = this.textFieldSelectionState;
        MutableInteractionSource mutableInteractionSource = this.interactionSource;
        this.textFieldState = textFieldState;
        this.textLayoutState = textLayoutState;
        this.textFieldSelectionState = textFieldSelectionState;
        this.filter = filter;
        this.enabled = enabled;
        this.readOnly = readOnly;
        this.keyboardOptions = keyboardOptions.fillUnspecifiedValuesWith$foundation_release(filter != null ? filter.getKeyboardOptions() : null);
        this.keyboardActionHandler = keyboardActionHandler;
        this.singleLine = singleLine;
        this.interactionSource = interactionSource;
        if (z3 != z2 || !Intrinsics.areEqual(textFieldState, transformedTextFieldState) || !Intrinsics.areEqual(this.keyboardOptions, keyboardOptions2)) {
            if (z3 && isFocused()) {
                startInputSession(false);
            } else if (!z3) {
                disposeInputSession();
            }
        }
        if (z != enabled) {
            SemanticsModifierNodeKt.invalidateSemantics(this);
        }
        if (!Intrinsics.areEqual(textFieldSelectionState, textFieldSelectionState2)) {
            this.pointerInputNode.resetPointerInputHandler();
            this.stylusHandwritingNode.resetPointerInputHandler();
            if (getIsAttached()) {
                textFieldSelectionState.setReceiveContentConfiguration(this.receiveContentConfigurationProvider);
            }
        }
        if (Intrinsics.areEqual(interactionSource, mutableInteractionSource)) {
            return;
        }
        this.pointerInputNode.resetPointerInputHandler();
        this.stylusHandwritingNode.resetPointerInputHandler();
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public void applySemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        TextFieldCharSequence outputText = this.textFieldState.getOutputText();
        long selection = outputText.getSelection();
        SemanticsPropertiesKt.setEditableText(semanticsPropertyReceiver, new AnnotatedString(outputText.toString(), null, null, 6, null));
        SemanticsPropertiesKt.m6290setTextSelectionRangeFDrldGo(semanticsPropertyReceiver, selection);
        if (!this.enabled) {
            SemanticsPropertiesKt.disabled(semanticsPropertyReceiver);
        }
        SemanticsPropertiesKt.setEditable(semanticsPropertyReceiver, getEditable());
        SemanticsPropertiesKt.getTextLayoutResult$default(semanticsPropertyReceiver, null, new Function1<List<TextLayoutResult>, Boolean>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$applySemantics$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(List<TextLayoutResult> list) {
                TextLayoutResult layoutResult = TextFieldDecoratorModifierNode.this.getTextLayoutState().getLayoutResult();
                return Boolean.valueOf(layoutResult != null ? list.add(layoutResult) : false);
            }
        }, 1, null);
        if (getEditable()) {
            SemanticsPropertiesKt.setText$default(semanticsPropertyReceiver, null, new Function1<AnnotatedString, Boolean>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$applySemantics$2
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Boolean invoke(AnnotatedString annotatedString) {
                    boolean editable;
                    editable = TextFieldDecoratorModifierNode.this.getEditable();
                    if (!editable) {
                        return false;
                    }
                    TextFieldDecoratorModifierNode.this.getTextFieldState().replaceAll(annotatedString);
                    return true;
                }
            }, 1, null);
            SemanticsPropertiesKt.insertTextAtCursor$default(semanticsPropertyReceiver, null, new Function1<AnnotatedString, Boolean>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$applySemantics$3
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Boolean invoke(AnnotatedString annotatedString) {
                    boolean editable;
                    editable = TextFieldDecoratorModifierNode.this.getEditable();
                    if (!editable) {
                        return false;
                    }
                    TransformedTextFieldState.replaceSelectedText$default(TextFieldDecoratorModifierNode.this.getTextFieldState(), annotatedString, true, null, 4, null);
                    return true;
                }
            }, 1, null);
        }
        SemanticsPropertiesKt.setSelection$default(semanticsPropertyReceiver, null, new Function3<Integer, Integer, Boolean, Boolean>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$applySemantics$4
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Boolean invoke(Integer num, Integer num2, Boolean bool) {
                return invoke(num.intValue(), num2.intValue(), bool.booleanValue());
            }

            public final Boolean invoke(int i, int i2, boolean z) {
                TextFieldCharSequence visualText;
                if (z) {
                    visualText = TextFieldDecoratorModifierNode.this.getTextFieldState().getUntransformedText();
                } else {
                    visualText = TextFieldDecoratorModifierNode.this.getTextFieldState().getVisualText();
                }
                long selection2 = visualText.getSelection();
                if (!TextFieldDecoratorModifierNode.this.getEnabled() || Math.min(i, i2) < 0 || Math.max(i, i2) > visualText.length()) {
                    return false;
                }
                if (i == TextRange.m6460getStartimpl(selection2) && i2 == TextRange.m6455getEndimpl(selection2)) {
                    return true;
                }
                long TextRange = TextRangeKt.TextRange(i, i2);
                if (z || i == i2) {
                    TextFieldDecoratorModifierNode.this.getTextFieldSelectionState().updateTextToolbarState(TextToolbarState.None);
                } else {
                    TextFieldDecoratorModifierNode.this.getTextFieldSelectionState().updateTextToolbarState(TextToolbarState.Selection);
                }
                if (z) {
                    TextFieldDecoratorModifierNode.this.getTextFieldState().m1538selectUntransformedCharsIn5zctL8(TextRange);
                } else {
                    TextFieldDecoratorModifierNode.this.getTextFieldState().m1537selectCharsIn5zctL8(TextRange);
                }
                return true;
            }
        }, 1, null);
        final int m1316getImeActionOrDefaulteUduSuo$foundation_release = this.keyboardOptions.m1316getImeActionOrDefaulteUduSuo$foundation_release();
        SemanticsPropertiesKt.m6285onImeAction9UiTYpY$default(semanticsPropertyReceiver, m1316getImeActionOrDefaulteUduSuo$foundation_release, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$applySemantics$5
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                TextFieldDecoratorModifierNode.this.m1505onImeActionPerformedKlQnJC8(m1316getImeActionOrDefaulteUduSuo$foundation_release);
                return true;
            }
        }, 2, null);
        SemanticsPropertiesKt.onClick$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$applySemantics$6
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                boolean isFocused;
                SoftwareKeyboardController requireKeyboardController;
                isFocused = TextFieldDecoratorModifierNode.this.isFocused();
                if (!isFocused) {
                    FocusRequesterModifierNodeKt.requestFocus(TextFieldDecoratorModifierNode.this);
                } else if (!TextFieldDecoratorModifierNode.this.getReadOnly()) {
                    requireKeyboardController = TextFieldDecoratorModifierNode.this.requireKeyboardController();
                    requireKeyboardController.show();
                }
                return true;
            }
        }, 1, null);
        SemanticsPropertiesKt.onLongClick$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$applySemantics$7
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                boolean isFocused;
                isFocused = TextFieldDecoratorModifierNode.this.isFocused();
                if (!isFocused) {
                    FocusRequesterModifierNodeKt.requestFocus(TextFieldDecoratorModifierNode.this);
                }
                TextFieldDecoratorModifierNode.this.getTextFieldSelectionState().updateTextToolbarState(TextToolbarState.Selection);
                return true;
            }
        }, 1, null);
        if (!TextRange.m6454getCollapsedimpl(selection)) {
            SemanticsPropertiesKt.copyText$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$applySemantics$8
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final Boolean invoke() {
                    TextFieldSelectionState.copy$default(TextFieldDecoratorModifierNode.this.getTextFieldSelectionState(), false, 1, null);
                    return true;
                }
            }, 1, null);
            if (this.enabled && !this.readOnly) {
                SemanticsPropertiesKt.cutText$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$applySemantics$9
                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final Boolean invoke() {
                        TextFieldDecoratorModifierNode.this.getTextFieldSelectionState().cut();
                        return true;
                    }
                }, 1, null);
            }
        }
        if (getEditable()) {
            SemanticsPropertiesKt.pasteText$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$applySemantics$10
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final Boolean invoke() {
                    TextFieldDecoratorModifierNode.this.getTextFieldSelectionState().paste();
                    return true;
                }
            }, 1, null);
        }
        InputTransformation inputTransformation = this.filter;
        if (inputTransformation != null) {
            inputTransformation.applySemantics(semanticsPropertyReceiver);
        }
    }

    @Override // androidx.compose.ui.focus.FocusEventModifierNode
    public void onFocusEvent(FocusState focusState) {
        if (this.isElementFocused == focusState.isFocused()) {
            return;
        }
        this.isElementFocused = focusState.isFocused();
        onFocusChange();
        if (focusState.isFocused()) {
            if (getEditable()) {
                startInputSession(false);
            }
        } else {
            disposeInputSession();
            TransformedTextFieldState transformedTextFieldState = this.textFieldState;
            TextFieldState textFieldState = transformedTextFieldState.textFieldState;
            InputTransformation inputTransformation = transformedTextFieldState.inputTransformation;
            TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
            textFieldState.getMainBuffer().getChangeTracker().clearChanges();
            EditCommandKt.finishComposingText(textFieldState.getMainBuffer());
            textFieldState.commitEditAsUser(inputTransformation, true, textFieldEditUndoBehavior);
            this.textFieldState.collapseSelectionToMax();
        }
        this.stylusHandwritingNode.onFocusEvent(focusState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onFocusChange() {
        Job launch$default;
        this.textFieldSelectionState.setFocused(isFocused());
        if (isFocused() && this.observeChangesJob == null) {
            launch$default = BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), null, null, new TextFieldDecoratorModifierNode$onFocusChange$1(this, null), 3, null);
            this.observeChangesJob = launch$default;
        } else {
            if (isFocused()) {
                return;
            }
            Job job = this.observeChangesJob;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
            this.observeChangesJob = null;
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        onObservedReadsChanged();
        this.textFieldSelectionState.setReceiveContentConfiguration(this.receiveContentConfigurationProvider);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        disposeInputSession();
        this.textFieldSelectionState.setReceiveContentConfiguration(null);
    }

    @Override // androidx.compose.ui.node.GlobalPositionAwareModifierNode
    public void onGloballyPositioned(LayoutCoordinates coordinates) {
        this.textLayoutState.setDecoratorNodeCoordinates(coordinates);
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    /* renamed from: onPointerEvent-H0pRuoY */
    public void mo513onPointerEventH0pRuoY(PointerEvent pointerEvent, PointerEventPass pass, long bounds) {
        this.stylusHandwritingNode.mo513onPointerEventH0pRuoY(pointerEvent, pass, bounds);
        this.pointerInputNode.mo513onPointerEventH0pRuoY(pointerEvent, pass, bounds);
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public void onCancelPointerInput() {
        this.stylusHandwritingNode.onCancelPointerInput();
        this.pointerInputNode.onCancelPointerInput();
    }

    @Override // androidx.compose.ui.input.key.KeyInputModifierNode
    /* renamed from: onPreKeyEvent-ZmokQxo */
    public boolean mo514onPreKeyEventZmokQxo(KeyEvent event) {
        return this.textFieldKeyEventHandler.mo1438onPreKeyEventMyFupTE(event, this.textFieldState, this.textFieldSelectionState, (FocusManager) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, CompositionLocalsKt.getLocalFocusManager()), requireKeyboardController());
    }

    @Override // androidx.compose.ui.input.key.KeyInputModifierNode
    /* renamed from: onKeyEvent-ZmokQxo */
    public boolean mo512onKeyEventZmokQxo(KeyEvent event) {
        return this.textFieldKeyEventHandler.mo1437onKeyEvent6ptp14s(event, this.textFieldState, this.textLayoutState, this.textFieldSelectionState, this.enabled && !this.readOnly, this.singleLine, new Function0<Unit>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$onKeyEvent$1
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
                TextFieldDecoratorModifierNode textFieldDecoratorModifierNode = TextFieldDecoratorModifierNode.this;
                textFieldDecoratorModifierNode.m1505onImeActionPerformedKlQnJC8(textFieldDecoratorModifierNode.getKeyboardOptions().m1316getImeActionOrDefaulteUduSuo$foundation_release());
            }
        });
    }

    @Override // androidx.compose.ui.node.ObserverModifierNode
    public void onObservedReadsChanged() {
        ObserverModifierNodeKt.observeReads(this, new Function0<Unit>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$onObservedReadsChanged$1
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
                TextFieldDecoratorModifierNode textFieldDecoratorModifierNode = TextFieldDecoratorModifierNode.this;
                textFieldDecoratorModifierNode.windowInfo = (WindowInfo) CompositionLocalConsumerModifierNodeKt.currentValueOf(textFieldDecoratorModifierNode, CompositionLocalsKt.getLocalWindowInfo());
                TextFieldDecoratorModifierNode.this.onFocusChange();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startInputSession(boolean fromTap) {
        Job launch$default;
        if (fromTap || this.keyboardOptions.getShowKeyboardOnFocusOrDefault$foundation_release()) {
            launch$default = BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), null, null, new TextFieldDecoratorModifierNode$startInputSession$1(this, ReceiveContentConfigurationKt.getReceiveContentConfiguration(this), null), 3, null);
            this.inputSessionJob = launch$default;
        }
    }

    private final void disposeInputSession() {
        Job job = this.inputSessionJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.inputSessionJob = null;
        MutableSharedFlow<Unit> stylusHandwritingTrigger = getStylusHandwritingTrigger();
        if (stylusHandwritingTrigger != null) {
            stylusHandwritingTrigger.resetReplayCache();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SoftwareKeyboardController requireKeyboardController() {
        SoftwareKeyboardController softwareKeyboardController = (SoftwareKeyboardController) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, CompositionLocalsKt.getLocalSoftwareKeyboardController());
        if (softwareKeyboardController != null) {
            return softwareKeyboardController;
        }
        throw new IllegalStateException("No software keyboard controller".toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void emitDragExitEvent() {
        HoverInteraction.Enter enter = this.dragEnterEvent;
        if (enter != null) {
            this.interactionSource.tryEmit(new HoverInteraction.Exit(enter));
            this.dragEnterEvent = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onImeActionPerformed-KlQnJC8, reason: not valid java name */
    public final void m1505onImeActionPerformedKlQnJC8(final int imeAction) {
        KeyboardActionHandler keyboardActionHandler;
        if (ImeAction.m6625equalsimpl0(imeAction, ImeAction.INSTANCE.m6642getNoneeUduSuo()) || ImeAction.m6625equalsimpl0(imeAction, ImeAction.INSTANCE.m6638getDefaulteUduSuo()) || (keyboardActionHandler = this.keyboardActionHandler) == null) {
            this.keyboardActionScope.mo1302defaultKeyboardActionKlQnJC8(imeAction);
        } else if (keyboardActionHandler != null) {
            keyboardActionHandler.onKeyboardAction(new Function0<Unit>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$onImeActionPerformed$1
                /* JADX INFO: Access modifiers changed from: package-private */
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
                    TextFieldDecoratorModifierNode$keyboardActionScope$1 textFieldDecoratorModifierNode$keyboardActionScope$1;
                    textFieldDecoratorModifierNode$keyboardActionScope$1 = TextFieldDecoratorModifierNode.this.keyboardActionScope;
                    textFieldDecoratorModifierNode$keyboardActionScope$1.mo1302defaultKeyboardActionKlQnJC8(imeAction);
                }
            });
        }
    }
}
