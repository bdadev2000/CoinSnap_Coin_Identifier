package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class OnGloballyPositionedElement extends ModifierNodeElement<OnGloballyPositionedNode> {

    /* renamed from: a, reason: collision with root package name */
    public final l f15816a;

    public OnGloballyPositionedElement(l lVar) {
        this.f15816a = lVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.ui.Modifier$Node, androidx.compose.ui.layout.OnGloballyPositionedNode] */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        ?? node = new Modifier.Node();
        node.f15817o = this.f15816a;
        return node;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        ((OnGloballyPositionedNode) node).f15817o = this.f15816a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnGloballyPositionedElement) {
            return this.f15816a == ((OnGloballyPositionedElement) obj).f15816a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f15816a.hashCode();
    }
}
