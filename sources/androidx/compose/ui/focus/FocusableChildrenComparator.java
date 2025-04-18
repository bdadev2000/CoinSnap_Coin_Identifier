package androidx.compose.ui.focus;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.LayoutNode;
import java.util.Comparator;
import p0.a;

/* loaded from: classes3.dex */
final class FocusableChildrenComparator implements Comparator<FocusTargetNode> {

    /* renamed from: a, reason: collision with root package name */
    public static final FocusableChildrenComparator f14901a = new Object();

    @Override // java.util.Comparator
    public final int compare(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2) {
        FocusTargetNode focusTargetNode3 = focusTargetNode;
        FocusTargetNode focusTargetNode4 = focusTargetNode2;
        int i2 = 0;
        if (FocusTraversalKt.d(focusTargetNode3) && FocusTraversalKt.d(focusTargetNode4)) {
            LayoutNode f2 = DelegatableNodeKt.f(focusTargetNode3);
            LayoutNode f3 = DelegatableNodeKt.f(focusTargetNode4);
            if (!a.g(f2, f3)) {
                MutableVector mutableVector = new MutableVector(new LayoutNode[16]);
                while (f2 != null) {
                    mutableVector.a(0, f2);
                    f2 = f2.B();
                }
                MutableVector mutableVector2 = new MutableVector(new LayoutNode[16]);
                while (f3 != null) {
                    mutableVector2.a(0, f3);
                    f3 = f3.B();
                }
                int min = Math.min(mutableVector.f14144c - 1, mutableVector2.f14144c - 1);
                if (min >= 0) {
                    while (a.g(mutableVector.f14142a[i2], mutableVector2.f14142a[i2])) {
                        if (i2 != min) {
                            i2++;
                        }
                    }
                    return a.E(((LayoutNode) mutableVector.f14142a[i2]).C(), ((LayoutNode) mutableVector2.f14142a[i2]).C());
                }
                throw new IllegalStateException("Could not find a common ancestor between the two FocusModifiers.".toString());
            }
        } else {
            if (FocusTraversalKt.d(focusTargetNode3)) {
                return -1;
            }
            if (FocusTraversalKt.d(focusTargetNode4)) {
                return 1;
            }
        }
        return 0;
    }
}
