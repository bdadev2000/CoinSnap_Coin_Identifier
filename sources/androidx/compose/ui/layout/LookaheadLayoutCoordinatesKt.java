package androidx.compose.ui.layout;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LookaheadDelegate;
import p0.a;

/* loaded from: classes3.dex */
public final class LookaheadLayoutCoordinatesKt {
    public static final LookaheadDelegate a(LookaheadDelegate lookaheadDelegate) {
        LayoutNode layoutNode = lookaheadDelegate.f16067m.f16100m;
        while (true) {
            LayoutNode B = layoutNode.B();
            if ((B != null ? B.f15944f : null) == null) {
                LookaheadDelegate h12 = layoutNode.B.f16090c.h1();
                a.p(h12);
                return h12;
            }
            LayoutNode B2 = layoutNode.B();
            LayoutNode layoutNode2 = B2 != null ? B2.f15944f : null;
            a.p(layoutNode2);
            if (layoutNode2.d) {
                layoutNode = layoutNode.B();
                a.p(layoutNode);
            } else {
                LayoutNode B3 = layoutNode.B();
                a.p(B3);
                layoutNode = B3.f15944f;
                a.p(layoutNode);
            }
        }
    }
}
