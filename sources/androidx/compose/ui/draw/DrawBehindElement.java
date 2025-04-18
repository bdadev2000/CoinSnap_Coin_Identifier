package androidx.compose.ui.draw;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import p0.a;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class DrawBehindElement extends ModifierNodeElement<DrawBackgroundModifier> {

    /* renamed from: a, reason: collision with root package name */
    public final l f14801a;

    public DrawBehindElement(l lVar) {
        this.f14801a = lVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.ui.draw.DrawBackgroundModifier, androidx.compose.ui.Modifier$Node] */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        ?? node = new Modifier.Node();
        node.f14800o = this.f14801a;
        return node;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        ((DrawBackgroundModifier) node).f14800o = this.f14801a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DrawBehindElement) && a.g(this.f14801a, ((DrawBehindElement) obj).f14801a);
    }

    public final int hashCode() {
        return this.f14801a.hashCode();
    }

    public final String toString() {
        return "DrawBehindElement(onDraw=" + this.f14801a + ')';
    }
}
