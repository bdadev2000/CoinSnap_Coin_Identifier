package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.ModifierNodeElement;
import b1.a2;
import b1.h1;

@StabilityInferred
/* loaded from: classes4.dex */
public final class TextFieldCoreModifier extends ModifierNodeElement<TextFieldCoreModifierNode> {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f6502a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f6503b;

    /* renamed from: c, reason: collision with root package name */
    public final TextLayoutState f6504c;
    public final TransformedTextFieldState d;

    /* renamed from: f, reason: collision with root package name */
    public final TextFieldSelectionState f6505f;

    /* renamed from: g, reason: collision with root package name */
    public final Brush f6506g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f6507h;

    /* renamed from: i, reason: collision with root package name */
    public final ScrollState f6508i;

    /* renamed from: j, reason: collision with root package name */
    public final Orientation f6509j;

    public TextFieldCoreModifier(boolean z2, boolean z3, TextLayoutState textLayoutState, TransformedTextFieldState transformedTextFieldState, TextFieldSelectionState textFieldSelectionState, Brush brush, boolean z4, ScrollState scrollState, Orientation orientation) {
        this.f6502a = z2;
        this.f6503b = z3;
        this.f6504c = textLayoutState;
        this.d = transformedTextFieldState;
        this.f6505f = textFieldSelectionState;
        this.f6506g = brush;
        this.f6507h = z4;
        this.f6508i = scrollState;
        this.f6509j = orientation;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        return new TextFieldCoreModifierNode(this.f6502a, this.f6503b, this.f6504c, this.d, this.f6505f, this.f6506g, this.f6507h, this.f6508i, this.f6509j);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        TextFieldCoreModifierNode textFieldCoreModifierNode = (TextFieldCoreModifierNode) node;
        boolean i2 = textFieldCoreModifierNode.i2();
        boolean z2 = textFieldCoreModifierNode.f6511q;
        TransformedTextFieldState transformedTextFieldState = textFieldCoreModifierNode.f6514t;
        TextLayoutState textLayoutState = textFieldCoreModifierNode.f6513s;
        TextFieldSelectionState textFieldSelectionState = textFieldCoreModifierNode.f6515u;
        ScrollState scrollState = textFieldCoreModifierNode.x;
        boolean z3 = this.f6502a;
        textFieldCoreModifierNode.f6511q = z3;
        boolean z4 = this.f6503b;
        textFieldCoreModifierNode.f6512r = z4;
        TextLayoutState textLayoutState2 = this.f6504c;
        textFieldCoreModifierNode.f6513s = textLayoutState2;
        TransformedTextFieldState transformedTextFieldState2 = this.d;
        textFieldCoreModifierNode.f6514t = transformedTextFieldState2;
        TextFieldSelectionState textFieldSelectionState2 = this.f6505f;
        textFieldCoreModifierNode.f6515u = textFieldSelectionState2;
        textFieldCoreModifierNode.f6516v = this.f6506g;
        textFieldCoreModifierNode.w = this.f6507h;
        ScrollState scrollState2 = this.f6508i;
        textFieldCoreModifierNode.x = scrollState2;
        textFieldCoreModifierNode.f6517y = this.f6509j;
        textFieldCoreModifierNode.E.h2(transformedTextFieldState2, textFieldSelectionState2, textLayoutState2, z3 || z4);
        if (!textFieldCoreModifierNode.i2()) {
            a2 a2Var = textFieldCoreModifierNode.A;
            if (a2Var != null) {
                a2Var.a(null);
            }
            textFieldCoreModifierNode.A = null;
            h1 h1Var = (h1) textFieldCoreModifierNode.f6518z.f6392a.getAndSet(null);
            if (h1Var != null) {
                h1Var.a(null);
            }
        } else if (!z2 || !p0.a.g(transformedTextFieldState, transformedTextFieldState2) || !i2) {
            textFieldCoreModifierNode.A = kotlin.jvm.internal.e.v(textFieldCoreModifierNode.S1(), null, 0, new TextFieldCoreModifierNode$startCursorJob$1(textFieldCoreModifierNode, null), 3);
        }
        if (p0.a.g(transformedTextFieldState, transformedTextFieldState2) && p0.a.g(textLayoutState, textLayoutState2) && p0.a.g(textFieldSelectionState, textFieldSelectionState2) && p0.a.g(scrollState, scrollState2)) {
            return;
        }
        DelegatableNodeKt.f(textFieldCoreModifierNode).J();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextFieldCoreModifier)) {
            return false;
        }
        TextFieldCoreModifier textFieldCoreModifier = (TextFieldCoreModifier) obj;
        return this.f6502a == textFieldCoreModifier.f6502a && this.f6503b == textFieldCoreModifier.f6503b && p0.a.g(this.f6504c, textFieldCoreModifier.f6504c) && p0.a.g(this.d, textFieldCoreModifier.d) && p0.a.g(this.f6505f, textFieldCoreModifier.f6505f) && p0.a.g(this.f6506g, textFieldCoreModifier.f6506g) && this.f6507h == textFieldCoreModifier.f6507h && p0.a.g(this.f6508i, textFieldCoreModifier.f6508i) && this.f6509j == textFieldCoreModifier.f6509j;
    }

    public final int hashCode() {
        return this.f6509j.hashCode() + ((this.f6508i.hashCode() + android.support.v4.media.d.g(this.f6507h, (this.f6506g.hashCode() + ((this.f6505f.hashCode() + ((this.d.hashCode() + ((this.f6504c.hashCode() + android.support.v4.media.d.g(this.f6503b, Boolean.hashCode(this.f6502a) * 31, 31)) * 31)) * 31)) * 31)) * 31, 31)) * 31);
    }

    public final String toString() {
        return "TextFieldCoreModifier(isFocused=" + this.f6502a + ", isDragHovered=" + this.f6503b + ", textLayoutState=" + this.f6504c + ", textFieldState=" + this.d + ", textFieldSelectionState=" + this.f6505f + ", cursorBrush=" + this.f6506g + ", writeable=" + this.f6507h + ", scrollState=" + this.f6508i + ", orientation=" + this.f6509j + ')';
    }
}
