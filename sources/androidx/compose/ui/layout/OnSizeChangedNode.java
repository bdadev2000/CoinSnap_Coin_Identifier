package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.LayoutAwareModifierNode;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import q0.l;

/* loaded from: classes2.dex */
final class OnSizeChangedNode extends Modifier.Node implements LayoutAwareModifierNode {

    /* renamed from: o, reason: collision with root package name */
    public l f15820o;

    /* renamed from: p, reason: collision with root package name */
    public long f15821p = IntSizeKt.a(Integer.MIN_VALUE, Integer.MIN_VALUE);

    public OnSizeChangedNode(l lVar) {
        this.f15820o = lVar;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final boolean T1() {
        return true;
    }

    @Override // androidx.compose.ui.node.LayoutAwareModifierNode
    public final void n(long j2) {
        if (IntSize.b(this.f15821p, j2)) {
            return;
        }
        this.f15820o.invoke(new IntSize(j2));
        this.f15821p = j2;
    }
}
