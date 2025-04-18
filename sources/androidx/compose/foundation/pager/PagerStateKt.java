package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.snapping.SnapPosition;
import h0.m;
import p0.a;

/* loaded from: classes2.dex */
public final class PagerStateKt {

    /* renamed from: a, reason: collision with root package name */
    public static final float f5306a = 56;

    /* renamed from: b, reason: collision with root package name */
    public static final PagerMeasureResult f5307b = new PagerMeasureResult(0, 0, 0, Orientation.f3395b, 0, 0, 0, SnapPosition.Start.f3718a, new Object(), a.c(m.f30726a));

    /* renamed from: c, reason: collision with root package name */
    public static final PagerStateKt$UnitDensity$1 f5308c = new Object();

    public static final PagerState a(int i2, float f2, q0.a aVar) {
        return new DefaultPagerState(i2, f2, aVar);
    }

    public static final long b(PagerLayoutInfo pagerLayoutInfo, int i2) {
        long pageSize = (i2 * (pagerLayoutInfo.getPageSize() + pagerLayoutInfo.i())) + pagerLayoutInfo.d() + pagerLayoutInfo.b();
        int a2 = (int) (pagerLayoutInfo.c() == Orientation.f3395b ? pagerLayoutInfo.a() >> 32 : pagerLayoutInfo.a() & 4294967295L);
        return a.w(pageSize - (a2 - a.A(pagerLayoutInfo.k().a(a2, pagerLayoutInfo.getPageSize(), pagerLayoutInfo.d(), pagerLayoutInfo.b(), i2 - 1, i2), 0, a2)), 0L);
    }
}
