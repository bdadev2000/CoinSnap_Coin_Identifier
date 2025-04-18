package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.snapping.LazyGridSnapLayoutInfoProviderKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation;
import androidx.compose.foundation.lazy.layout.ObservableScopeInvalidator;
import androidx.compose.ui.layout.Remeasurement;
import androidx.compose.ui.unit.IntOffsetKt;
import e0.u;
import java.util.List;
import kotlin.jvm.internal.r;
import p0.a;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class LazyGridState$scrollableState$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LazyGridState f4637a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyGridState$scrollableState$1(LazyGridState lazyGridState) {
        super(1);
        this.f4637a = lazyGridState;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        float f2;
        float f3;
        LazyGridMeasuredLine lazyGridMeasuredLine;
        int i2;
        float f4;
        LazyGridMeasureResult lazyGridMeasureResult;
        int i3;
        float f5;
        List list;
        LazyGridPrefetchStrategy lazyGridPrefetchStrategy;
        List list2;
        LazyGridPrefetchStrategy lazyGridPrefetchStrategy2;
        int intValue;
        float f6 = -((Number) obj).floatValue();
        LazyGridState lazyGridState = this.f4637a;
        if ((f6 < 0.0f && !lazyGridState.d()) || (f6 > 0.0f && !lazyGridState.c())) {
            f3 = 0.0f;
        } else {
            if (Math.abs(lazyGridState.e) > 0.5f) {
                throw new IllegalStateException(("entered drag with non-zero pending scroll: " + lazyGridState.e).toString());
            }
            float f7 = lazyGridState.e + f6;
            lazyGridState.e = f7;
            if (Math.abs(f7) > 0.5f) {
                LazyGridMeasureResult lazyGridMeasureResult2 = (LazyGridMeasureResult) lazyGridState.f4606c.getValue();
                float f8 = lazyGridState.e;
                int t02 = a.t0(f8);
                boolean z2 = lazyGridMeasureResult2.e;
                LazyGridPrefetchStrategy lazyGridPrefetchStrategy3 = lazyGridState.f4604a;
                LazyGridState$prefetchScope$1 lazyGridState$prefetchScope$1 = lazyGridState.f4615n;
                if (!z2) {
                    List list3 = lazyGridMeasureResult2.f4542i;
                    if (!list3.isEmpty() && (lazyGridMeasuredLine = lazyGridMeasureResult2.f4536a) != null && (i2 = lazyGridMeasureResult2.f4537b - t02) >= 0 && i2 < lazyGridMeasuredLine.f4579h) {
                        LazyGridMeasuredItem lazyGridMeasuredItem = (LazyGridMeasuredItem) u.E0(list3);
                        LazyGridMeasuredItem lazyGridMeasuredItem2 = (LazyGridMeasuredItem) u.L0(list3);
                        if (!lazyGridMeasuredItem.f4570y && !lazyGridMeasuredItem2.f4570y) {
                            int i4 = lazyGridMeasureResult2.f4544k;
                            int i5 = lazyGridMeasureResult2.f4543j;
                            Orientation orientation = lazyGridMeasureResult2.f4546m;
                            if (t02 >= 0 ? Math.min(i5 - LazyGridSnapLayoutInfoProviderKt.a(lazyGridMeasuredItem, orientation), i4 - LazyGridSnapLayoutInfoProviderKt.a(lazyGridMeasuredItem2, orientation)) > t02 : Math.min((LazyGridSnapLayoutInfoProviderKt.a(lazyGridMeasuredItem, orientation) + lazyGridMeasuredItem.f4564q) - i5, (LazyGridSnapLayoutInfoProviderKt.a(lazyGridMeasuredItem2, orientation) + lazyGridMeasuredItem2.f4564q) - i4) > (-t02)) {
                                lazyGridMeasureResult2.f4537b -= t02;
                                int size = list3.size();
                                int i6 = 0;
                                while (i6 < size) {
                                    LazyGridMeasuredItem lazyGridMeasuredItem3 = (LazyGridMeasuredItem) list3.get(i6);
                                    if (lazyGridMeasuredItem3.f4570y) {
                                        lazyGridMeasureResult = lazyGridMeasureResult2;
                                        f4 = f8;
                                        list = list3;
                                        lazyGridPrefetchStrategy = lazyGridPrefetchStrategy3;
                                        f5 = f6;
                                    } else {
                                        f4 = f8;
                                        long j2 = lazyGridMeasuredItem3.f4569v;
                                        boolean z3 = lazyGridMeasuredItem3.f4552c;
                                        if (z3) {
                                            lazyGridMeasureResult = lazyGridMeasureResult2;
                                            i3 = (int) (j2 >> 32);
                                        } else {
                                            lazyGridMeasureResult = lazyGridMeasureResult2;
                                            i3 = ((int) (j2 >> 32)) + t02;
                                        }
                                        lazyGridMeasuredItem3.f4569v = IntOffsetKt.a(i3, z3 ? ((int) (j2 & 4294967295L)) + t02 : (int) (j2 & 4294967295L));
                                        int size2 = lazyGridMeasuredItem3.f4556i.size();
                                        int i7 = 0;
                                        while (i7 < size2) {
                                            LazyLayoutItemAnimation a2 = lazyGridMeasuredItem3.f4559l.a(i7, lazyGridMeasuredItem3.f4551b);
                                            float f9 = f6;
                                            int i8 = size2;
                                            if (a2 != null) {
                                                long j3 = a2.f4718l;
                                                if (z3) {
                                                    list2 = list3;
                                                    lazyGridPrefetchStrategy2 = lazyGridPrefetchStrategy3;
                                                    intValue = (int) (j3 >> 32);
                                                } else {
                                                    list2 = list3;
                                                    lazyGridPrefetchStrategy2 = lazyGridPrefetchStrategy3;
                                                    intValue = Integer.valueOf(((int) (j3 >> 32)) + t02).intValue();
                                                }
                                                a2.f4718l = IntOffsetKt.a(intValue, z3 ? ((int) (j3 & 4294967295L)) + t02 : (int) (j3 & 4294967295L));
                                            } else {
                                                list2 = list3;
                                                lazyGridPrefetchStrategy2 = lazyGridPrefetchStrategy3;
                                            }
                                            i7++;
                                            f6 = f9;
                                            size2 = i8;
                                            lazyGridPrefetchStrategy3 = lazyGridPrefetchStrategy2;
                                            list3 = list2;
                                        }
                                        f5 = f6;
                                        list = list3;
                                        lazyGridPrefetchStrategy = lazyGridPrefetchStrategy3;
                                    }
                                    i6++;
                                    f6 = f5;
                                    f8 = f4;
                                    lazyGridMeasureResult2 = lazyGridMeasureResult;
                                    lazyGridPrefetchStrategy3 = lazyGridPrefetchStrategy;
                                    list3 = list;
                                }
                                float f10 = f8;
                                LazyGridPrefetchStrategy lazyGridPrefetchStrategy4 = lazyGridPrefetchStrategy3;
                                f2 = f6;
                                lazyGridMeasureResult2.d = t02;
                                if (!lazyGridMeasureResult2.f4538c && t02 > 0) {
                                    lazyGridMeasureResult2.f4538c = true;
                                }
                                lazyGridState.f(lazyGridMeasureResult2, true);
                                ObservableScopeInvalidator.b(lazyGridState.f4617p);
                                float f11 = f10 - lazyGridState.e;
                                if (lazyGridState.f4608g) {
                                    lazyGridPrefetchStrategy4.c(lazyGridState$prefetchScope$1, f11, lazyGridMeasureResult2);
                                }
                            }
                        }
                    }
                }
                f2 = f6;
                Remeasurement remeasurement = lazyGridState.f4609h;
                if (remeasurement != null) {
                    remeasurement.d();
                }
                float f12 = f8 - lazyGridState.e;
                LazyGridLayoutInfo i9 = lazyGridState.i();
                if (lazyGridState.f4608g) {
                    lazyGridPrefetchStrategy3.c(lazyGridState$prefetchScope$1, f12, i9);
                }
            } else {
                f2 = f6;
            }
            if (Math.abs(lazyGridState.e) <= 0.5f) {
                f3 = f2;
            } else {
                f3 = f2 - lazyGridState.e;
                lazyGridState.e = 0.0f;
            }
        }
        return Float.valueOf(-f3);
    }
}
