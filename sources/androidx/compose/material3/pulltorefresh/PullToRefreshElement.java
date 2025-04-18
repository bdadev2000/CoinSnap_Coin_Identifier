package androidx.compose.material3.pulltorefresh;

import android.support.v4.media.d;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.e;
import q0.a;

@StabilityInferred
/* loaded from: classes3.dex */
public final class PullToRefreshElement extends ModifierNodeElement<PullToRefreshModifierNode> {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f13135a;

    /* renamed from: b, reason: collision with root package name */
    public final a f13136b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f13137c;
    public final PullToRefreshState d;

    /* renamed from: f, reason: collision with root package name */
    public final float f13138f;

    public PullToRefreshElement(boolean z2, a aVar, boolean z3, PullToRefreshState pullToRefreshState, float f2) {
        this.f13135a = z2;
        this.f13136b = aVar;
        this.f13137c = z3;
        this.d = pullToRefreshState;
        this.f13138f = f2;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        return new PullToRefreshModifierNode(this.f13135a, this.f13136b, this.f13137c, this.d, this.f13138f);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        PullToRefreshModifierNode pullToRefreshModifierNode = (PullToRefreshModifierNode) node;
        pullToRefreshModifierNode.f13169r = this.f13136b;
        pullToRefreshModifierNode.f13170s = this.f13137c;
        pullToRefreshModifierNode.f13171t = this.d;
        pullToRefreshModifierNode.f13172u = this.f13138f;
        boolean z2 = pullToRefreshModifierNode.f13168q;
        boolean z3 = this.f13135a;
        if (z2 != z3) {
            pullToRefreshModifierNode.f13168q = z3;
            e.v(pullToRefreshModifierNode.S1(), null, 0, new PullToRefreshModifierNode$update$1(pullToRefreshModifierNode, null), 3);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PullToRefreshElement)) {
            return false;
        }
        PullToRefreshElement pullToRefreshElement = (PullToRefreshElement) obj;
        return this.f13135a == pullToRefreshElement.f13135a && p0.a.g(this.f13136b, pullToRefreshElement.f13136b) && this.f13137c == pullToRefreshElement.f13137c && p0.a.g(this.d, pullToRefreshElement.d) && Dp.a(this.f13138f, pullToRefreshElement.f13138f);
    }

    public final int hashCode() {
        return Float.hashCode(this.f13138f) + ((this.d.hashCode() + d.g(this.f13137c, (this.f13136b.hashCode() + (Boolean.hashCode(this.f13135a) * 31)) * 31, 31)) * 31);
    }

    public final String toString() {
        return "PullToRefreshElement(isRefreshing=" + this.f13135a + ", onRefresh=" + this.f13136b + ", enabled=" + this.f13137c + ", state=" + this.d + ", threshold=" + ((Object) Dp.b(this.f13138f)) + ')';
    }
}
