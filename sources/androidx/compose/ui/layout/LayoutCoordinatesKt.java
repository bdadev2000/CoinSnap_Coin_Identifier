package androidx.compose.ui.layout;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.node.NodeCoordinator;

/* loaded from: classes4.dex */
public final class LayoutCoordinatesKt {
    public static final Rect a(LayoutCoordinates layoutCoordinates) {
        Rect Q;
        LayoutCoordinates a02 = layoutCoordinates.a0();
        return (a02 == null || (Q = a02.Q(layoutCoordinates, true)) == null) ? new Rect(0.0f, 0.0f, (int) (layoutCoordinates.a() >> 32), (int) (layoutCoordinates.a() & 4294967295L)) : Q;
    }

    public static final Rect b(LayoutCoordinates layoutCoordinates) {
        LayoutCoordinates c2 = c(layoutCoordinates);
        float a2 = (int) (c2.a() >> 32);
        float a3 = (int) (c2.a() & 4294967295L);
        Rect Q = c(layoutCoordinates).Q(layoutCoordinates, true);
        float f2 = Q.f14914a;
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        if (f2 > a2) {
            f2 = a2;
        }
        float f3 = Q.f14915b;
        if (f3 < 0.0f) {
            f3 = 0.0f;
        }
        if (f3 > a3) {
            f3 = a3;
        }
        float f4 = Q.f14916c;
        if (f4 < 0.0f) {
            f4 = 0.0f;
        }
        if (f4 <= a2) {
            a2 = f4;
        }
        float f5 = Q.d;
        float f6 = f5 >= 0.0f ? f5 : 0.0f;
        if (f6 <= a3) {
            a3 = f6;
        }
        if (f2 == a2 || f3 == a3) {
            return Rect.e;
        }
        long M = c2.M(OffsetKt.a(f2, f3));
        long M2 = c2.M(OffsetKt.a(a2, f3));
        long M3 = c2.M(OffsetKt.a(a2, a3));
        long M4 = c2.M(OffsetKt.a(f2, a3));
        float g2 = Offset.g(M);
        float g3 = Offset.g(M2);
        float g4 = Offset.g(M4);
        float g5 = Offset.g(M3);
        float min = Math.min(g2, Math.min(g3, Math.min(g4, g5)));
        float max = Math.max(g2, Math.max(g3, Math.max(g4, g5)));
        float h2 = Offset.h(M);
        float h3 = Offset.h(M2);
        float h4 = Offset.h(M4);
        float h5 = Offset.h(M3);
        return new Rect(min, Math.min(h2, Math.min(h3, Math.min(h4, h5))), max, Math.max(h2, Math.max(h3, Math.max(h4, h5))));
    }

    public static final LayoutCoordinates c(LayoutCoordinates layoutCoordinates) {
        LayoutCoordinates layoutCoordinates2;
        LayoutCoordinates a02 = layoutCoordinates.a0();
        while (true) {
            LayoutCoordinates layoutCoordinates3 = a02;
            layoutCoordinates2 = layoutCoordinates;
            layoutCoordinates = layoutCoordinates3;
            if (layoutCoordinates == null) {
                break;
            }
            a02 = layoutCoordinates.a0();
        }
        NodeCoordinator nodeCoordinator = layoutCoordinates2 instanceof NodeCoordinator ? (NodeCoordinator) layoutCoordinates2 : null;
        if (nodeCoordinator == null) {
            return layoutCoordinates2;
        }
        NodeCoordinator nodeCoordinator2 = nodeCoordinator.f16104q;
        while (true) {
            NodeCoordinator nodeCoordinator3 = nodeCoordinator2;
            NodeCoordinator nodeCoordinator4 = nodeCoordinator;
            nodeCoordinator = nodeCoordinator3;
            if (nodeCoordinator == null) {
                return nodeCoordinator4;
            }
            nodeCoordinator2 = nodeCoordinator.f16104q;
        }
    }
}
