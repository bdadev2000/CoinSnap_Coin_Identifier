package androidx.compose.foundation.text.input.internal;

import android.view.DragEvent;
import android.view.KeyEvent;
import androidx.compose.foundation.content.internal.ReceiveContentConfigurationKt;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.foundation.text.handwriting.StylusHandwritingNode;
import androidx.compose.foundation.text.handwriting.StylusHandwriting_androidKt;
import androidx.compose.foundation.text.input.InputTransformation;
import androidx.compose.foundation.text.input.KeyboardActionHandler;
import androidx.compose.foundation.text.input.TextFieldCharSequence;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.draganddrop.DragAndDropEvent;
import androidx.compose.ui.draganddrop.DragAndDropNodeKt;
import androidx.compose.ui.draganddrop.DragAndDropTarget;
import androidx.compose.ui.focus.FocusEventModifierNode;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.focus.FocusRequesterModifierNode;
import androidx.compose.ui.focus.FocusStateImpl;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.input.key.KeyInputModifierNode;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl;
import androidx.compose.ui.modifier.ModifierLocalModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.GlobalPositionAwareModifierNode;
import androidx.compose.ui.node.LayoutAwareModifierNode;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.ObserverModifierNode;
import androidx.compose.ui.node.ObserverModifierNodeKt;
import androidx.compose.ui.node.PointerInputModifierNode;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.platform.ClipEntry;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.PlatformTextInputModifierNode;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.platform.WindowInfo;
import androidx.compose.ui.semantics.AccessibilityAction;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.ImeAction;
import b1.a2;
import e1.l0;
import e1.s0;
import e1.t0;
import q0.l;
import x0.n;

@StabilityInferred
/* loaded from: classes3.dex */
public final class TextFieldDecoratorModifierNode extends DelegatingNode implements PlatformTextInputModifierNode, SemanticsModifierNode, FocusRequesterModifierNode, FocusEventModifierNode, GlobalPositionAwareModifierNode, PointerInputModifierNode, KeyInputModifierNode, CompositionLocalConsumerModifierNode, ModifierLocalModifierNode, ObserverModifierNode, LayoutAwareModifierNode {
    public final SuspendingPointerInputModifierNodeImpl A;
    public final StylusHandwritingNode B;
    public HoverInteraction.Enter C;
    public KeyboardOptions D;
    public boolean E;
    public WindowInfo F;
    public a2 G;
    public final AndroidTextFieldKeyEventHandler H;
    public final TextFieldDecoratorModifierNode$keyboardActionScope$1 I;
    public a2 J;
    public final q0.a K;

    /* renamed from: q, reason: collision with root package name */
    public TransformedTextFieldState f6546q;

    /* renamed from: r, reason: collision with root package name */
    public TextLayoutState f6547r;

    /* renamed from: s, reason: collision with root package name */
    public TextFieldSelectionState f6548s;

    /* renamed from: t, reason: collision with root package name */
    public InputTransformation f6549t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f6550u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f6551v;
    public KeyboardActionHandler w;
    public boolean x;

    /* renamed from: y, reason: collision with root package name */
    public MutableInteractionSource f6552y;

    /* renamed from: z, reason: collision with root package name */
    public s0 f6553z;

    /* JADX WARN: Type inference failed for: r1v2, types: [androidx.compose.foundation.text.input.internal.AndroidTextFieldKeyEventHandler, androidx.compose.foundation.text.input.internal.TextFieldKeyEventHandler] */
    public TextFieldDecoratorModifierNode(TransformedTextFieldState transformedTextFieldState, TextLayoutState textLayoutState, TextFieldSelectionState textFieldSelectionState, InputTransformation inputTransformation, boolean z2, boolean z3, KeyboardOptions keyboardOptions, KeyboardActionHandler keyboardActionHandler, boolean z4, MutableInteractionSource mutableInteractionSource) {
        this.f6546q = transformedTextFieldState;
        this.f6547r = textLayoutState;
        this.f6548s = textFieldSelectionState;
        this.f6549t = inputTransformation;
        this.f6550u = z2;
        this.f6551v = z3;
        this.w = keyboardActionHandler;
        this.x = z4;
        this.f6552y = mutableInteractionSource;
        SuspendingPointerInputModifierNodeImpl a2 = SuspendingPointerInputFilterKt.a(new TextFieldDecoratorModifierNode$pointerInputNode$1(this, null));
        e2(a2);
        this.A = a2;
        StylusHandwritingNode stylusHandwritingNode = new StylusHandwritingNode(new TextFieldDecoratorModifierNode$stylusHandwritingNode$1(this, keyboardOptions));
        e2(stylusHandwritingNode);
        this.B = stylusHandwritingNode;
        TextFieldDecoratorModifierNode$dragAndDropNode$1 textFieldDecoratorModifierNode$dragAndDropNode$1 = new TextFieldDecoratorModifierNode$dragAndDropNode$1(this);
        final TextFieldDecoratorModifierNode$dragAndDropNode$2 textFieldDecoratorModifierNode$dragAndDropNode$2 = new TextFieldDecoratorModifierNode$dragAndDropNode$2(this);
        final TextFieldDecoratorModifierNode$dragAndDropNode$3 textFieldDecoratorModifierNode$dragAndDropNode$3 = new TextFieldDecoratorModifierNode$dragAndDropNode$3(this);
        final TextFieldDecoratorModifierNode$dragAndDropNode$4 textFieldDecoratorModifierNode$dragAndDropNode$4 = new TextFieldDecoratorModifierNode$dragAndDropNode$4(this);
        final TextFieldDecoratorModifierNode$dragAndDropNode$5 textFieldDecoratorModifierNode$dragAndDropNode$5 = new TextFieldDecoratorModifierNode$dragAndDropNode$5(this);
        final TextFieldDecoratorModifierNode$dragAndDropNode$6 textFieldDecoratorModifierNode$dragAndDropNode$6 = new TextFieldDecoratorModifierNode$dragAndDropNode$6(this);
        final TextFieldDecoratorModifierNode$dragAndDropNode$7 textFieldDecoratorModifierNode$dragAndDropNode$7 = new TextFieldDecoratorModifierNode$dragAndDropNode$7(this);
        final l lVar = null;
        e2(DragAndDropNodeKt.b(new TextFieldDragAndDropNode_androidKt$textFieldDragAndDropNode$1(textFieldDecoratorModifierNode$dragAndDropNode$1), new DragAndDropTarget() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDragAndDropNode_androidKt$textFieldDragAndDropNode$2
            @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
            public final void D0(DragAndDropEvent dragAndDropEvent) {
                l lVar2 = textFieldDecoratorModifierNode$dragAndDropNode$4;
                if (lVar2 != null) {
                    lVar2.invoke(dragAndDropEvent);
                }
            }

            @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
            public final void O(DragAndDropEvent dragAndDropEvent) {
                l lVar2 = lVar;
                if (lVar2 != null) {
                    lVar2.invoke(dragAndDropEvent);
                }
            }

            @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
            public final boolean O0(DragAndDropEvent dragAndDropEvent) {
                l.this.invoke(dragAndDropEvent);
                DragEvent dragEvent = dragAndDropEvent.f14771a;
                ClipEntry clipEntry = new ClipEntry(dragEvent.getClipData());
                dragEvent.getClipDescription();
                return ((Boolean) textFieldDecoratorModifierNode$dragAndDropNode$2.invoke(clipEntry, new Object())).booleanValue();
            }

            @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
            public final void P(DragAndDropEvent dragAndDropEvent) {
                l lVar2 = textFieldDecoratorModifierNode$dragAndDropNode$5;
                if (lVar2 != null) {
                    DragEvent dragEvent = dragAndDropEvent.f14771a;
                    lVar2.invoke(new Offset(OffsetKt.a(dragEvent.getX(), dragEvent.getY())));
                }
            }

            @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
            public final void R1(DragAndDropEvent dragAndDropEvent) {
                l lVar2 = textFieldDecoratorModifierNode$dragAndDropNode$7;
                if (lVar2 != null) {
                    lVar2.invoke(dragAndDropEvent);
                }
            }

            @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
            public final void a0(DragAndDropEvent dragAndDropEvent) {
                l lVar2 = textFieldDecoratorModifierNode$dragAndDropNode$6;
                if (lVar2 != null) {
                    lVar2.invoke(dragAndDropEvent);
                }
            }
        }));
        InputTransformation inputTransformation2 = this.f6549t;
        this.D = keyboardOptions.a(inputTransformation2 != null ? inputTransformation2.D() : null);
        this.H = new TextFieldKeyEventHandler();
        this.I = new TextFieldDecoratorModifierNode$keyboardActionScope$1(this);
        this.K = new TextFieldDecoratorModifierNode$receiveContentConfigurationProvider$1(this);
    }

    public static final void h2(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode) {
        HoverInteraction.Enter enter = textFieldDecoratorModifierNode.C;
        if (enter != null) {
            textFieldDecoratorModifierNode.f6552y.b(new HoverInteraction.Exit(enter));
            textFieldDecoratorModifierNode.C = null;
        }
    }

    public static final void i2(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode, int i2) {
        KeyboardActionHandler keyboardActionHandler;
        textFieldDecoratorModifierNode.getClass();
        if (ImeAction.a(i2, 0) || ImeAction.a(i2, 1) || (keyboardActionHandler = textFieldDecoratorModifierNode.w) == null) {
            textFieldDecoratorModifierNode.I.a(i2);
        } else {
            keyboardActionHandler.a();
        }
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public final void B(SemanticsConfiguration semanticsConfiguration) {
        TextFieldCharSequence c2 = this.f6546q.c();
        long j2 = c2.f6298b;
        AnnotatedString annotatedString = new AnnotatedString(c2.f6297a.toString(), null, 6);
        n[] nVarArr = SemanticsPropertiesKt.f16865a;
        SemanticsPropertyKey semanticsPropertyKey = SemanticsProperties.f16852y;
        n[] nVarArr2 = SemanticsPropertiesKt.f16865a;
        n nVar = nVarArr2[16];
        semanticsPropertyKey.getClass();
        semanticsConfiguration.b(semanticsPropertyKey, annotatedString);
        SemanticsPropertyKey semanticsPropertyKey2 = SemanticsProperties.f16853z;
        n nVar2 = nVarArr2[17];
        TextRange textRange = new TextRange(j2);
        semanticsPropertyKey2.getClass();
        semanticsConfiguration.b(semanticsPropertyKey2, textRange);
        if (!this.f6550u) {
            SemanticsPropertiesKt.e(semanticsConfiguration);
        }
        boolean k2 = k2();
        SemanticsPropertyKey semanticsPropertyKey3 = SemanticsProperties.G;
        n nVar3 = nVarArr2[23];
        Boolean valueOf = Boolean.valueOf(k2);
        semanticsPropertyKey3.getClass();
        semanticsConfiguration.b(semanticsPropertyKey3, valueOf);
        SemanticsPropertiesKt.g(semanticsConfiguration, new TextFieldDecoratorModifierNode$applySemantics$1(this));
        if (k2()) {
            semanticsConfiguration.b(SemanticsActions.f16799i, new AccessibilityAction(null, new TextFieldDecoratorModifierNode$applySemantics$2(this)));
            semanticsConfiguration.b(SemanticsActions.f16803m, new AccessibilityAction(null, new TextFieldDecoratorModifierNode$applySemantics$3(this)));
        }
        semanticsConfiguration.b(SemanticsActions.f16798h, new AccessibilityAction(null, new TextFieldDecoratorModifierNode$applySemantics$4(this)));
        int b2 = this.D.b();
        SemanticsPropertiesKt.i(semanticsConfiguration, b2, new TextFieldDecoratorModifierNode$applySemantics$5(this, b2));
        SemanticsPropertiesKt.h(semanticsConfiguration, new TextFieldDecoratorModifierNode$applySemantics$6(this));
        SemanticsPropertiesKt.j(semanticsConfiguration, null, new TextFieldDecoratorModifierNode$applySemantics$7(this));
        if (!TextRange.c(j2)) {
            SemanticsPropertiesKt.c(semanticsConfiguration, new TextFieldDecoratorModifierNode$applySemantics$8(this));
            if (this.f6550u && !this.f6551v) {
                SemanticsPropertiesKt.d(semanticsConfiguration, new TextFieldDecoratorModifierNode$applySemantics$9(this));
            }
        }
        if (k2()) {
            semanticsConfiguration.b(SemanticsActions.f16807q, new AccessibilityAction(null, new TextFieldDecoratorModifierNode$applySemantics$10(this)));
        }
        InputTransformation inputTransformation = this.f6549t;
        if (inputTransformation != null) {
            inputTransformation.B(semanticsConfiguration);
        }
    }

    @Override // androidx.compose.ui.node.ObserverModifierNode
    public final void C0() {
        ObserverModifierNodeKt.a(this, new TextFieldDecoratorModifierNode$onObservedReadsChanged$1(this));
    }

    @Override // androidx.compose.ui.node.GlobalPositionAwareModifierNode
    public final void M(NodeCoordinator nodeCoordinator) {
        this.f6547r.f6647f.setValue(nodeCoordinator);
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public final boolean N1() {
        return true;
    }

    @Override // androidx.compose.ui.input.key.KeyInputModifierNode
    public final boolean P0(KeyEvent keyEvent) {
        return this.H.b(keyEvent, this.f6546q, this.f6548s, (FocusManager) CompositionLocalConsumerModifierNodeKt.a(this, CompositionLocalsKt.f16435g), o2());
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void W1() {
        C0();
        this.f6548s.f6723l = this.K;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void X1() {
        j2();
        this.f6548s.f6723l = null;
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public final void e0(PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j2) {
        this.B.e0(pointerEvent, pointerEventPass, j2);
        this.A.e0(pointerEvent, pointerEventPass, j2);
    }

    @Override // androidx.compose.ui.input.key.KeyInputModifierNode
    public final boolean i1(KeyEvent keyEvent) {
        return this.H.a(keyEvent, this.f6546q, this.f6547r, this.f6548s, this.f6550u && !this.f6551v, this.x, new TextFieldDecoratorModifierNode$onKeyEvent$1(this));
    }

    public final void j2() {
        a2 a2Var = this.J;
        if (a2Var != null) {
            a2Var.a(null);
        }
        this.J = null;
        l0 l2 = l2();
        if (l2 != null) {
            ((s0) l2).n();
        }
    }

    public final boolean k2() {
        return this.f6550u && !this.f6551v;
    }

    public final l0 l2() {
        s0 s0Var = this.f6553z;
        if (s0Var != null) {
            return s0Var;
        }
        if (!StylusHandwriting_androidKt.f6290a) {
            return null;
        }
        s0 b2 = t0.b(1, 0, 3, 2);
        this.f6553z = b2;
        return b2;
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public final void m1() {
        this.B.m1();
        this.A.m1();
    }

    public final boolean m2() {
        WindowInfo windowInfo = this.F;
        return this.E && (windowInfo != null && windowInfo.a());
    }

    public final void n2() {
        this.f6548s.f6717f = m2();
        if (m2() && this.G == null) {
            this.G = kotlin.jvm.internal.e.v(S1(), null, 0, new TextFieldDecoratorModifierNode$onFocusChange$1(this, null), 3);
        } else {
            if (m2()) {
                return;
            }
            a2 a2Var = this.G;
            if (a2Var != null) {
                a2Var.a(null);
            }
            this.G = null;
        }
    }

    public final SoftwareKeyboardController o2() {
        SoftwareKeyboardController softwareKeyboardController = (SoftwareKeyboardController) CompositionLocalConsumerModifierNodeKt.a(this, CompositionLocalsKt.f16442n);
        if (softwareKeyboardController != null) {
            return softwareKeyboardController;
        }
        throw new IllegalStateException("No software keyboard controller".toString());
    }

    public final void p2(boolean z2) {
        Boolean bool;
        if (z2 || (bool = this.D.f6019f) == null || bool.booleanValue()) {
            this.J = kotlin.jvm.internal.e.v(S1(), null, 0, new TextFieldDecoratorModifierNode$startInputSession$1(this, ReceiveContentConfigurationKt.a(this), null), 3);
        }
    }

    @Override // androidx.compose.ui.focus.FocusEventModifierNode
    public final void v(FocusStateImpl focusStateImpl) {
        if (this.E == focusStateImpl.a()) {
            return;
        }
        this.E = focusStateImpl.a();
        n2();
        if (!focusStateImpl.a()) {
            j2();
            TransformedTextFieldState transformedTextFieldState = this.f6546q;
            TextFieldState textFieldState = transformedTextFieldState.f6651a;
            InputTransformation inputTransformation = transformedTextFieldState.f6652b;
            TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.f6873a;
            textFieldState.f6307b.f6400b.b();
            textFieldState.f6307b.b();
            TextFieldState.a(textFieldState, inputTransformation, true, textFieldEditUndoBehavior);
            this.f6546q.a();
        } else if (k2()) {
            p2(false);
        }
        StylusHandwritingNode stylusHandwritingNode = this.B;
        stylusHandwritingNode.getClass();
        stylusHandwritingNode.f6278r = focusStateImpl.a();
    }
}
