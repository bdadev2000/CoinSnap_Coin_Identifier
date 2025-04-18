package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.unit.IntSizeKt;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class OnSizeChangedModifier extends ModifierNodeElement<OnSizeChangedNode> {

    /* renamed from: a, reason: collision with root package name */
    public final l f15819a;

    public OnSizeChangedModifier(l lVar) {
        this.f15819a = lVar;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        return new OnSizeChangedNode(this.f15819a);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        OnSizeChangedNode onSizeChangedNode = (OnSizeChangedNode) node;
        onSizeChangedNode.f15820o = this.f15819a;
        onSizeChangedNode.f15821p = IntSizeKt.a(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnSizeChangedModifier) {
            return this.f15819a == ((OnSizeChangedModifier) obj).f15819a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f15819a.hashCode();
    }
}
