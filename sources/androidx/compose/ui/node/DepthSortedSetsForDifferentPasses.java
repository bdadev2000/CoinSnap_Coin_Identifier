package androidx.compose.ui.node;

import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred
/* loaded from: classes2.dex */
public final class DepthSortedSetsForDifferentPasses {

    /* renamed from: a, reason: collision with root package name */
    public final DepthSortedSet f15914a = new DepthSortedSet();

    /* renamed from: b, reason: collision with root package name */
    public final DepthSortedSet f15915b = new DepthSortedSet();

    public final void a(LayoutNode layoutNode, boolean z2) {
        DepthSortedSet depthSortedSet = this.f15915b;
        DepthSortedSet depthSortedSet2 = this.f15914a;
        if (z2) {
            depthSortedSet2.a(layoutNode);
            depthSortedSet.a(layoutNode);
        } else {
            if (depthSortedSet2.b(layoutNode)) {
                return;
            }
            depthSortedSet.a(layoutNode);
        }
    }

    public final boolean b(LayoutNode layoutNode, boolean z2) {
        boolean b2 = this.f15914a.b(layoutNode);
        return z2 ? b2 : b2 || this.f15915b.b(layoutNode);
    }

    public final boolean c() {
        return !(this.f15915b.f15912c.isEmpty() && this.f15914a.f15912c.isEmpty());
    }
}
