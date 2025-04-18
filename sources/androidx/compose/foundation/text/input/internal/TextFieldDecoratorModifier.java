package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.foundation.text.handwriting.StylusHandwritingNode;
import androidx.compose.foundation.text.input.InputTransformation;
import androidx.compose.foundation.text.input.KeyboardActionHandler;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.ModifierNodeElement;

@StabilityInferred
/* loaded from: classes4.dex */
public final class TextFieldDecoratorModifier extends ModifierNodeElement<TextFieldDecoratorModifierNode> {

    /* renamed from: a, reason: collision with root package name */
    public final TransformedTextFieldState f6535a;

    /* renamed from: b, reason: collision with root package name */
    public final TextLayoutState f6536b;

    /* renamed from: c, reason: collision with root package name */
    public final TextFieldSelectionState f6537c;
    public final InputTransformation d;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f6538f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f6539g;

    /* renamed from: h, reason: collision with root package name */
    public final KeyboardOptions f6540h;

    /* renamed from: i, reason: collision with root package name */
    public final KeyboardActionHandler f6541i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f6542j;

    /* renamed from: k, reason: collision with root package name */
    public final MutableInteractionSource f6543k;

    public TextFieldDecoratorModifier(TransformedTextFieldState transformedTextFieldState, TextLayoutState textLayoutState, TextFieldSelectionState textFieldSelectionState, InputTransformation inputTransformation, boolean z2, boolean z3, KeyboardOptions keyboardOptions, KeyboardActionHandler keyboardActionHandler, boolean z4, MutableInteractionSource mutableInteractionSource) {
        this.f6535a = transformedTextFieldState;
        this.f6536b = textLayoutState;
        this.f6537c = textFieldSelectionState;
        this.d = inputTransformation;
        this.f6538f = z2;
        this.f6539g = z3;
        this.f6540h = keyboardOptions;
        this.f6541i = keyboardActionHandler;
        this.f6542j = z4;
        this.f6543k = mutableInteractionSource;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        return new TextFieldDecoratorModifierNode(this.f6535a, this.f6536b, this.f6537c, this.d, this.f6538f, this.f6539g, this.f6540h, this.f6541i, this.f6542j, this.f6543k);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        TextFieldDecoratorModifierNode textFieldDecoratorModifierNode = (TextFieldDecoratorModifierNode) node;
        boolean z2 = textFieldDecoratorModifierNode.f6550u;
        boolean z3 = z2 && !textFieldDecoratorModifierNode.f6551v;
        boolean z4 = this.f6538f;
        boolean z5 = this.f6539g;
        boolean z6 = z4 && !z5;
        TransformedTextFieldState transformedTextFieldState = textFieldDecoratorModifierNode.f6546q;
        KeyboardOptions keyboardOptions = textFieldDecoratorModifierNode.D;
        TextFieldSelectionState textFieldSelectionState = textFieldDecoratorModifierNode.f6548s;
        MutableInteractionSource mutableInteractionSource = textFieldDecoratorModifierNode.f6552y;
        TransformedTextFieldState transformedTextFieldState2 = this.f6535a;
        textFieldDecoratorModifierNode.f6546q = transformedTextFieldState2;
        textFieldDecoratorModifierNode.f6547r = this.f6536b;
        TextFieldSelectionState textFieldSelectionState2 = this.f6537c;
        textFieldDecoratorModifierNode.f6548s = textFieldSelectionState2;
        InputTransformation inputTransformation = this.d;
        textFieldDecoratorModifierNode.f6549t = inputTransformation;
        textFieldDecoratorModifierNode.f6550u = z4;
        textFieldDecoratorModifierNode.f6551v = z5;
        textFieldDecoratorModifierNode.D = this.f6540h.a(inputTransformation != null ? inputTransformation.D() : null);
        textFieldDecoratorModifierNode.w = this.f6541i;
        textFieldDecoratorModifierNode.x = this.f6542j;
        MutableInteractionSource mutableInteractionSource2 = this.f6543k;
        textFieldDecoratorModifierNode.f6552y = mutableInteractionSource2;
        if (z6 != z3 || !p0.a.g(transformedTextFieldState2, transformedTextFieldState) || !p0.a.g(textFieldDecoratorModifierNode.D, keyboardOptions)) {
            if (z6 && textFieldDecoratorModifierNode.m2()) {
                textFieldDecoratorModifierNode.p2(false);
            } else if (!z6) {
                textFieldDecoratorModifierNode.j2();
            }
        }
        if (z2 != z4) {
            DelegatableNodeKt.f(textFieldDecoratorModifierNode).K();
        }
        boolean g2 = p0.a.g(textFieldSelectionState2, textFieldSelectionState);
        StylusHandwritingNode stylusHandwritingNode = textFieldDecoratorModifierNode.B;
        SuspendingPointerInputModifierNodeImpl suspendingPointerInputModifierNodeImpl = textFieldDecoratorModifierNode.A;
        if (!g2) {
            suspendingPointerInputModifierNodeImpl.M0();
            stylusHandwritingNode.f6279s.M0();
            if (textFieldDecoratorModifierNode.f14699n) {
                textFieldSelectionState2.f6723l = textFieldDecoratorModifierNode.K;
            }
        }
        if (p0.a.g(mutableInteractionSource2, mutableInteractionSource)) {
            return;
        }
        suspendingPointerInputModifierNodeImpl.M0();
        stylusHandwritingNode.f6279s.M0();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextFieldDecoratorModifier)) {
            return false;
        }
        TextFieldDecoratorModifier textFieldDecoratorModifier = (TextFieldDecoratorModifier) obj;
        return p0.a.g(this.f6535a, textFieldDecoratorModifier.f6535a) && p0.a.g(this.f6536b, textFieldDecoratorModifier.f6536b) && p0.a.g(this.f6537c, textFieldDecoratorModifier.f6537c) && p0.a.g(this.d, textFieldDecoratorModifier.d) && this.f6538f == textFieldDecoratorModifier.f6538f && this.f6539g == textFieldDecoratorModifier.f6539g && p0.a.g(this.f6540h, textFieldDecoratorModifier.f6540h) && p0.a.g(this.f6541i, textFieldDecoratorModifier.f6541i) && this.f6542j == textFieldDecoratorModifier.f6542j && p0.a.g(this.f6543k, textFieldDecoratorModifier.f6543k);
    }

    public final int hashCode() {
        int hashCode = (this.f6537c.hashCode() + ((this.f6536b.hashCode() + (this.f6535a.hashCode() * 31)) * 31)) * 31;
        InputTransformation inputTransformation = this.d;
        int hashCode2 = (this.f6540h.hashCode() + android.support.v4.media.d.g(this.f6539g, android.support.v4.media.d.g(this.f6538f, (hashCode + (inputTransformation == null ? 0 : inputTransformation.hashCode())) * 31, 31), 31)) * 31;
        KeyboardActionHandler keyboardActionHandler = this.f6541i;
        return this.f6543k.hashCode() + android.support.v4.media.d.g(this.f6542j, (hashCode2 + (keyboardActionHandler != null ? keyboardActionHandler.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        return "TextFieldDecoratorModifier(textFieldState=" + this.f6535a + ", textLayoutState=" + this.f6536b + ", textFieldSelectionState=" + this.f6537c + ", filter=" + this.d + ", enabled=" + this.f6538f + ", readOnly=" + this.f6539g + ", keyboardOptions=" + this.f6540h + ", keyboardActionHandler=" + this.f6541i + ", singleLine=" + this.f6542j + ", interactionSource=" + this.f6543k + ')';
    }
}
