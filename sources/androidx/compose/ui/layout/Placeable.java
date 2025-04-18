package androidx.compose.ui.layout;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.node.MotionReferencePlacementDelegate;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import p0.a;
import q0.l;

@StabilityInferred
/* loaded from: classes2.dex */
public abstract class Placeable implements Measured {

    /* renamed from: a, reason: collision with root package name */
    public int f15825a;

    /* renamed from: b, reason: collision with root package name */
    public int f15826b;

    /* renamed from: c, reason: collision with root package name */
    public long f15827c = IntSizeKt.a(0, 0);
    public long d = PlaceableKt.f15830a;

    /* renamed from: f, reason: collision with root package name */
    public long f15828f = 0;

    @StabilityInferred
    @PlacementScopeMarker
    /* loaded from: classes2.dex */
    public static abstract class PlacementScope {

        /* renamed from: a, reason: collision with root package name */
        public boolean f15829a;

        /* JADX WARN: Multi-variable type inference failed */
        public static final void a(PlacementScope placementScope, Placeable placeable) {
            placementScope.getClass();
            if (placeable instanceof MotionReferencePlacementDelegate) {
                ((MotionReferencePlacementDelegate) placeable).d0(placementScope.f15829a);
            }
        }

        public static void g(PlacementScope placementScope, Placeable placeable, long j2) {
            placementScope.getClass();
            a(placementScope, placeable);
            placeable.n0(IntOffset.d(j2, placeable.f15828f), 0.0f, null);
        }

        public static void h(PlacementScope placementScope, Placeable placeable, int i2, int i3) {
            long a2 = IntOffsetKt.a(i2, i3);
            if (placementScope.c() == LayoutDirection.f17494a || placementScope.d() == 0) {
                a(placementScope, placeable);
                placeable.n0(IntOffset.d(a2, placeable.f15828f), 0.0f, null);
            } else {
                long a3 = IntOffsetKt.a((placementScope.d() - placeable.f15825a) - ((int) (a2 >> 32)), (int) (a2 & 4294967295L));
                a(placementScope, placeable);
                placeable.n0(IntOffset.d(a3, placeable.f15828f), 0.0f, null);
            }
        }

        public static void i(PlacementScope placementScope, Placeable placeable, long j2) {
            if (placementScope.c() == LayoutDirection.f17494a || placementScope.d() == 0) {
                a(placementScope, placeable);
                placeable.n0(IntOffset.d(j2, placeable.f15828f), 0.0f, null);
            } else {
                long a2 = IntOffsetKt.a((placementScope.d() - placeable.f15825a) - ((int) (j2 >> 32)), (int) (j2 & 4294967295L));
                a(placementScope, placeable);
                placeable.n0(IntOffset.d(a2, placeable.f15828f), 0.0f, null);
            }
        }

        public static void j(PlacementScope placementScope, Placeable placeable, int i2, int i3) {
            int i4 = PlaceableKt.f15831b;
            PlaceableKt$DefaultLayerBlock$1 placeableKt$DefaultLayerBlock$1 = PlaceableKt$DefaultLayerBlock$1.f15832a;
            long a2 = IntOffsetKt.a(i2, i3);
            if (placementScope.c() == LayoutDirection.f17494a || placementScope.d() == 0) {
                a(placementScope, placeable);
                placeable.n0(IntOffset.d(a2, placeable.f15828f), 0.0f, placeableKt$DefaultLayerBlock$1);
            } else {
                long a3 = IntOffsetKt.a((placementScope.d() - placeable.f15825a) - ((int) (a2 >> 32)), (int) (a2 & 4294967295L));
                a(placementScope, placeable);
                placeable.n0(IntOffset.d(a3, placeable.f15828f), 0.0f, placeableKt$DefaultLayerBlock$1);
            }
        }

        public static void k(PlacementScope placementScope, Placeable placeable, long j2) {
            int i2 = PlaceableKt.f15831b;
            PlaceableKt$DefaultLayerBlock$1 placeableKt$DefaultLayerBlock$1 = PlaceableKt$DefaultLayerBlock$1.f15832a;
            if (placementScope.c() == LayoutDirection.f17494a || placementScope.d() == 0) {
                a(placementScope, placeable);
                placeable.n0(IntOffset.d(j2, placeable.f15828f), 0.0f, placeableKt$DefaultLayerBlock$1);
            } else {
                long a2 = IntOffsetKt.a((placementScope.d() - placeable.f15825a) - ((int) (j2 >> 32)), (int) (j2 & 4294967295L));
                a(placementScope, placeable);
                placeable.n0(IntOffset.d(a2, placeable.f15828f), 0.0f, placeableKt$DefaultLayerBlock$1);
            }
        }

        public static void l(PlacementScope placementScope, Placeable placeable, long j2, GraphicsLayer graphicsLayer) {
            if (placementScope.c() == LayoutDirection.f17494a || placementScope.d() == 0) {
                a(placementScope, placeable);
                placeable.j0(IntOffset.d(j2, placeable.f15828f), 0.0f, graphicsLayer);
            } else {
                long a2 = IntOffsetKt.a((placementScope.d() - placeable.f15825a) - ((int) (j2 >> 32)), (int) (j2 & 4294967295L));
                a(placementScope, placeable);
                placeable.j0(IntOffset.d(a2, placeable.f15828f), 0.0f, graphicsLayer);
            }
        }

        public static void m(PlacementScope placementScope, Placeable placeable, int i2, int i3, l lVar, int i4) {
            if ((i4 & 8) != 0) {
                int i5 = PlaceableKt.f15831b;
                lVar = PlaceableKt$DefaultLayerBlock$1.f15832a;
            }
            placementScope.getClass();
            long a2 = IntOffsetKt.a(i2, i3);
            a(placementScope, placeable);
            placeable.n0(IntOffset.d(a2, placeable.f15828f), 0.0f, lVar);
        }

        public static void n(PlacementScope placementScope, Placeable placeable, long j2) {
            int i2 = PlaceableKt.f15831b;
            PlaceableKt$DefaultLayerBlock$1 placeableKt$DefaultLayerBlock$1 = PlaceableKt$DefaultLayerBlock$1.f15832a;
            placementScope.getClass();
            a(placementScope, placeable);
            placeable.n0(IntOffset.d(j2, placeable.f15828f), 0.0f, placeableKt$DefaultLayerBlock$1);
        }

        public LayoutCoordinates b() {
            return null;
        }

        public abstract LayoutDirection c();

        public abstract int d();

        public final void e(Placeable placeable, int i2, int i3, float f2) {
            long a2 = IntOffsetKt.a(i2, i3);
            a(this, placeable);
            placeable.n0(IntOffset.d(a2, placeable.f15828f), f2, null);
        }
    }

    public int g0() {
        return (int) (this.f15827c & 4294967295L);
    }

    public int h0() {
        return (int) (this.f15827c >> 32);
    }

    public final void i0() {
        this.f15825a = a.A((int) (this.f15827c >> 32), Constraints.k(this.d), Constraints.i(this.d));
        int A = a.A((int) (this.f15827c & 4294967295L), Constraints.j(this.d), Constraints.h(this.d));
        this.f15826b = A;
        int i2 = this.f15825a;
        long j2 = this.f15827c;
        this.f15828f = IntOffsetKt.a((i2 - ((int) (j2 >> 32))) / 2, (A - ((int) (j2 & 4294967295L))) / 2);
    }

    public void j0(long j2, float f2, GraphicsLayer graphicsLayer) {
        n0(j2, f2, null);
    }

    public abstract void n0(long j2, float f2, l lVar);

    public final void o0(long j2) {
        if (IntSize.b(this.f15827c, j2)) {
            return;
        }
        this.f15827c = j2;
        i0();
    }

    public final void p0(long j2) {
        if (Constraints.c(this.d, j2)) {
            return;
        }
        this.d = j2;
        i0();
    }
}
