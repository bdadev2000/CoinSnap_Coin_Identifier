package androidx.compose.foundation;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import p0.a;

/* loaded from: classes4.dex */
final class HoverableElement extends ModifierNodeElement<HoverableNode> {

    /* renamed from: a, reason: collision with root package name */
    public final MutableInteractionSource f2727a;

    public HoverableElement(MutableInteractionSource mutableInteractionSource) {
        this.f2727a = mutableInteractionSource;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.foundation.HoverableNode, androidx.compose.ui.Modifier$Node] */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        ?? node = new Modifier.Node();
        node.f2728o = this.f2727a;
        return node;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        HoverableNode hoverableNode = (HoverableNode) node;
        MutableInteractionSource mutableInteractionSource = hoverableNode.f2728o;
        MutableInteractionSource mutableInteractionSource2 = this.f2727a;
        if (a.g(mutableInteractionSource, mutableInteractionSource2)) {
            return;
        }
        hoverableNode.g2();
        hoverableNode.f2728o = mutableInteractionSource2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof HoverableElement) && a.g(((HoverableElement) obj).f2727a, this.f2727a);
    }

    public final int hashCode() {
        return this.f2727a.hashCode() * 31;
    }
}
