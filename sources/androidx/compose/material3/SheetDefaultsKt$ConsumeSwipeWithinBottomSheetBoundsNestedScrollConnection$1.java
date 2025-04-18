package androidx.compose.material3;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.material3.internal.AnchoredDraggableState;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.ui.unit.Velocity;
import h0.g;
import q0.l;

/* loaded from: classes4.dex */
public final class SheetDefaultsKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1 implements NestedScrollConnection {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SheetState f11189a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f11190b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Orientation f11191c;

    public SheetDefaultsKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1(SheetState sheetState, l lVar) {
        Orientation orientation = Orientation.f3394a;
        this.f11189a = sheetState;
        this.f11190b = lVar;
        this.f11191c = orientation;
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    public final long E0(int i2, long j2, long j3) {
        if (!NestedScrollSource.a(i2, 1)) {
            return 0L;
        }
        AnchoredDraggableState anchoredDraggableState = this.f11189a.f11199c;
        Orientation orientation = Orientation.f3395b;
        Orientation orientation2 = this.f11191c;
        float d = anchoredDraggableState.d(orientation2 == orientation ? Offset.g(j3) : Offset.h(j3));
        float f2 = orientation2 == orientation ? d : 0.0f;
        if (orientation2 != Orientation.f3394a) {
            d = 0.0f;
        }
        return OffsetKt.a(f2, d);
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    public final Object W0(long j2, g gVar) {
        float b2 = this.f11191c == Orientation.f3395b ? Velocity.b(j2) : Velocity.c(j2);
        SheetState sheetState = this.f11189a;
        float g2 = sheetState.f11199c.g();
        float d = sheetState.f11199c.e().d();
        if (b2 >= 0.0f || g2 <= d) {
            j2 = 0;
        } else {
            this.f11190b.invoke(new Float(b2));
        }
        return new Velocity(j2);
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    public final long g0(int i2, long j2) {
        Orientation orientation = Orientation.f3395b;
        Orientation orientation2 = this.f11191c;
        float g2 = orientation2 == orientation ? Offset.g(j2) : Offset.h(j2);
        if (g2 >= 0.0f || !NestedScrollSource.a(i2, 1)) {
            return 0L;
        }
        float d = this.f11189a.f11199c.d(g2);
        return OffsetKt.a(orientation2 == orientation ? d : 0.0f, orientation2 == Orientation.f3394a ? d : 0.0f);
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    public final Object h1(long j2, long j3, g gVar) {
        this.f11190b.invoke(new Float(this.f11191c == Orientation.f3395b ? Velocity.b(j3) : Velocity.c(j3)));
        return new Velocity(j3);
    }
}
