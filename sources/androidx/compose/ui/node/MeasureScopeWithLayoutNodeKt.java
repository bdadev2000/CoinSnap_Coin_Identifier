package androidx.compose.ui.node;

import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.node.LayoutNode;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class MeasureScopeWithLayoutNodeKt {

    /* loaded from: classes2.dex */
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[LayoutNode.LayoutState.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[3] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[0] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[2] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static final ArrayList a(IntrinsicMeasureScope intrinsicMeasureScope) {
        p0.a.q(intrinsicMeasureScope, "null cannot be cast to non-null type androidx.compose.ui.node.MeasureScopeWithLayoutNode");
        LayoutNode H1 = ((MeasureScopeWithLayoutNode) intrinsicMeasureScope).H1();
        boolean b2 = b(H1);
        List x = H1.x();
        ArrayList arrayList = new ArrayList(x.size());
        int size = x.size();
        for (int i2 = 0; i2 < size; i2++) {
            LayoutNode layoutNode = (LayoutNode) x.get(i2);
            arrayList.add(b2 ? layoutNode.t() : layoutNode.u());
        }
        return arrayList;
    }

    public static final boolean b(LayoutNode layoutNode) {
        int ordinal = layoutNode.C.f15982c.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return true;
            }
            if (ordinal != 2) {
                if (ordinal == 3) {
                    return true;
                }
                if (ordinal != 4) {
                    throw new RuntimeException();
                }
                LayoutNode B = layoutNode.B();
                if (B != null) {
                    return b(B);
                }
                throw new IllegalArgumentException("no parent for idle node".toString());
            }
        }
        return false;
    }
}
