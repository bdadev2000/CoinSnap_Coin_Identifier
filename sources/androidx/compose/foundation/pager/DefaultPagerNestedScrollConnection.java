package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.ui.unit.Velocity;
import h0.g;
import java.util.concurrent.CancellationException;
import p0.a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class DefaultPagerNestedScrollConnection implements NestedScrollConnection {

    /* renamed from: a, reason: collision with root package name */
    public final PagerState f5083a;

    /* renamed from: b, reason: collision with root package name */
    public final Orientation f5084b;

    public DefaultPagerNestedScrollConnection(PagerState pagerState, Orientation orientation) {
        this.f5083a = pagerState;
        this.f5084b = orientation;
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    public final long E0(int i2, long j2, long j3) {
        if (!NestedScrollSource.a(i2, 2)) {
            return 0L;
        }
        if ((this.f5084b == Orientation.f3395b ? Offset.g(j3) : Offset.h(j3)) == 0.0f) {
            return 0L;
        }
        throw new CancellationException("Scroll cancelled");
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    public final long g0(int i2, long j2) {
        if (NestedScrollSource.a(i2, 1)) {
            PagerState pagerState = this.f5083a;
            if (Math.abs(pagerState.k()) > 1.0E-6d) {
                float k2 = pagerState.k() * pagerState.n();
                float i3 = ((pagerState.l().i() + pagerState.l().getPageSize()) * (-Math.signum(pagerState.k()))) + k2;
                if (pagerState.k() > 0.0f) {
                    i3 = k2;
                    k2 = i3;
                }
                Orientation orientation = Orientation.f3395b;
                Orientation orientation2 = this.f5084b;
                float f2 = -pagerState.f5270j.e(-a.z(orientation2 == orientation ? Offset.g(j2) : Offset.h(j2), k2, i3));
                float g2 = orientation2 == orientation ? f2 : Offset.g(j2);
                if (orientation2 != Orientation.f3394a) {
                    f2 = Offset.h(j2);
                }
                return Offset.a(g2, f2);
            }
        }
        return 0L;
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    public final Object h1(long j2, long j3, g gVar) {
        return new Velocity(this.f5084b == Orientation.f3394a ? Velocity.a(j3, 0.0f, 0.0f, 2) : Velocity.a(j3, 0.0f, 0.0f, 1));
    }
}
