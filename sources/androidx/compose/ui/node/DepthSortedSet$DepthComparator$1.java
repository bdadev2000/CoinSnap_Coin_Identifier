package androidx.compose.ui.node;

import java.util.Comparator;

/* loaded from: classes4.dex */
public final class DepthSortedSet$DepthComparator$1 implements Comparator<LayoutNode> {
    @Override // java.util.Comparator
    public final int compare(LayoutNode layoutNode, LayoutNode layoutNode2) {
        LayoutNode layoutNode3 = layoutNode;
        LayoutNode layoutNode4 = layoutNode2;
        int E = p0.a.E(layoutNode3.f15952n, layoutNode4.f15952n);
        return E != 0 ? E : p0.a.E(layoutNode3.hashCode(), layoutNode4.hashCode());
    }
}
