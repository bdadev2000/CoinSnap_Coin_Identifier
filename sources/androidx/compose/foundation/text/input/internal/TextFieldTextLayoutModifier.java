package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.input.internal.TextFieldLayoutStateCache;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.text.TextStyle;
import q0.p;

@StabilityInferred
/* loaded from: classes3.dex */
public final class TextFieldTextLayoutModifier extends ModifierNodeElement<TextFieldTextLayoutModifierNode> {

    /* renamed from: a, reason: collision with root package name */
    public final TextLayoutState f6636a;

    /* renamed from: b, reason: collision with root package name */
    public final TransformedTextFieldState f6637b;

    /* renamed from: c, reason: collision with root package name */
    public final TextStyle f6638c;
    public final boolean d;

    /* renamed from: f, reason: collision with root package name */
    public final p f6639f;

    public TextFieldTextLayoutModifier(TextLayoutState textLayoutState, TransformedTextFieldState transformedTextFieldState, TextStyle textStyle, boolean z2, p pVar) {
        this.f6636a = textLayoutState;
        this.f6637b = transformedTextFieldState;
        this.f6638c = textStyle;
        this.d = z2;
        this.f6639f = pVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.foundation.text.input.internal.TextFieldTextLayoutModifierNode, androidx.compose.ui.Modifier$Node] */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        ?? node = new Modifier.Node();
        TextLayoutState textLayoutState = this.f6636a;
        node.f6640o = textLayoutState;
        boolean z2 = this.d;
        node.f6641p = z2;
        textLayoutState.f6645b = this.f6639f;
        TextFieldLayoutStateCache textFieldLayoutStateCache = textLayoutState.f6644a;
        textFieldLayoutStateCache.getClass();
        textFieldLayoutStateCache.f6616a.setValue(new TextFieldLayoutStateCache.NonMeasureInputs(this.f6637b, this.f6638c, z2, !z2));
        return node;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        TextFieldTextLayoutModifierNode textFieldTextLayoutModifierNode = (TextFieldTextLayoutModifierNode) node;
        TextLayoutState textLayoutState = this.f6636a;
        textFieldTextLayoutModifierNode.f6640o = textLayoutState;
        textLayoutState.f6645b = this.f6639f;
        boolean z2 = this.d;
        textFieldTextLayoutModifierNode.f6641p = z2;
        TextFieldLayoutStateCache textFieldLayoutStateCache = textLayoutState.f6644a;
        textFieldLayoutStateCache.getClass();
        textFieldLayoutStateCache.f6616a.setValue(new TextFieldLayoutStateCache.NonMeasureInputs(this.f6637b, this.f6638c, z2, !z2));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextFieldTextLayoutModifier)) {
            return false;
        }
        TextFieldTextLayoutModifier textFieldTextLayoutModifier = (TextFieldTextLayoutModifier) obj;
        return p0.a.g(this.f6636a, textFieldTextLayoutModifier.f6636a) && p0.a.g(this.f6637b, textFieldTextLayoutModifier.f6637b) && p0.a.g(this.f6638c, textFieldTextLayoutModifier.f6638c) && this.d == textFieldTextLayoutModifier.d && p0.a.g(this.f6639f, textFieldTextLayoutModifier.f6639f);
    }

    public final int hashCode() {
        int g2 = android.support.v4.media.d.g(this.d, (this.f6638c.hashCode() + ((this.f6637b.hashCode() + (this.f6636a.hashCode() * 31)) * 31)) * 31, 31);
        p pVar = this.f6639f;
        return g2 + (pVar == null ? 0 : pVar.hashCode());
    }

    public final String toString() {
        return "TextFieldTextLayoutModifier(textLayoutState=" + this.f6636a + ", textFieldState=" + this.f6637b + ", textStyle=" + this.f6638c + ", singleLine=" + this.d + ", onTextLayout=" + this.f6639f + ')';
    }
}
