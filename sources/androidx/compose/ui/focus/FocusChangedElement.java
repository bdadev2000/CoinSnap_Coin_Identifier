package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import p0.a;
import q0.l;

/* loaded from: classes4.dex */
final class FocusChangedElement extends ModifierNodeElement<FocusChangedNode> {

    /* renamed from: a, reason: collision with root package name */
    public final l f14830a;

    public FocusChangedElement(l lVar) {
        this.f14830a = lVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.ui.Modifier$Node, androidx.compose.ui.focus.FocusChangedNode] */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        ?? node = new Modifier.Node();
        node.f14831o = this.f14830a;
        return node;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        ((FocusChangedNode) node).f14831o = this.f14830a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FocusChangedElement) && a.g(this.f14830a, ((FocusChangedElement) obj).f14830a);
    }

    public final int hashCode() {
        return this.f14830a.hashCode();
    }

    public final String toString() {
        return "FocusChangedElement(onFocusChanged=" + this.f14830a + ')';
    }
}
