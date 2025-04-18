package androidx.compose.ui.draw;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import p0.a;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class DrawWithContentElement extends ModifierNodeElement<DrawWithContentModifier> {

    /* renamed from: a, reason: collision with root package name */
    public final l f14804a;

    public DrawWithContentElement(l lVar) {
        this.f14804a = lVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.ui.Modifier$Node, androidx.compose.ui.draw.DrawWithContentModifier] */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        ?? node = new Modifier.Node();
        node.f14805o = this.f14804a;
        return node;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        ((DrawWithContentModifier) node).f14805o = this.f14804a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DrawWithContentElement) && a.g(this.f14804a, ((DrawWithContentElement) obj).f14804a);
    }

    public final int hashCode() {
        return this.f14804a.hashCode();
    }

    public final String toString() {
        return "DrawWithContentElement(onDraw=" + this.f14804a + ')';
    }
}
