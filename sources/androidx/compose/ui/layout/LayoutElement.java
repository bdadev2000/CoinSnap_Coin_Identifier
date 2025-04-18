package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import p0.a;
import q0.q;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class LayoutElement extends ModifierNodeElement<LayoutModifierImpl> {

    /* renamed from: a, reason: collision with root package name */
    public final q f15740a;

    public LayoutElement(q qVar) {
        this.f15740a = qVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.ui.layout.LayoutModifierImpl, androidx.compose.ui.Modifier$Node] */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        ?? node = new Modifier.Node();
        node.f15750o = this.f15740a;
        return node;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        ((LayoutModifierImpl) node).f15750o = this.f15740a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LayoutElement) && a.g(this.f15740a, ((LayoutElement) obj).f15740a);
    }

    public final int hashCode() {
        return this.f15740a.hashCode();
    }

    public final String toString() {
        return "LayoutElement(measure=" + this.f15740a + ')';
    }
}
