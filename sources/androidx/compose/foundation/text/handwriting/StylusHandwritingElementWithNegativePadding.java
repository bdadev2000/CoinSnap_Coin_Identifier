package androidx.compose.foundation.text.handwriting;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import q0.a;

/* loaded from: classes.dex */
final class StylusHandwritingElementWithNegativePadding extends ModifierNodeElement<StylusHandwritingNodeWithNegativePadding> {

    /* renamed from: a, reason: collision with root package name */
    public final a f6274a;

    public StylusHandwritingElementWithNegativePadding(a aVar) {
        this.f6274a = aVar;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        return new StylusHandwritingNode(this.f6274a);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        ((StylusHandwritingNodeWithNegativePadding) node).f6277q = this.f6274a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StylusHandwritingElementWithNegativePadding) && p0.a.g(this.f6274a, ((StylusHandwritingElementWithNegativePadding) obj).f6274a);
    }

    public final int hashCode() {
        return this.f6274a.hashCode();
    }

    public final String toString() {
        return "StylusHandwritingElementWithNegativePadding(onHandwritingSlopExceeded=" + this.f6274a + ')';
    }
}
