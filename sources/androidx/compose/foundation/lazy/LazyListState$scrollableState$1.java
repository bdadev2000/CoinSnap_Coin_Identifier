package androidx.compose.foundation.lazy;

import androidx.compose.foundation.lazy.layout.ObservableScopeInvalidator;
import androidx.compose.ui.layout.Remeasurement;
import kotlin.jvm.internal.r;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class LazyListState$scrollableState$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LazyListState f4427a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyListState$scrollableState$1(LazyListState lazyListState) {
        super(1);
        this.f4427a = lazyListState;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        float f2 = -((Number) obj).floatValue();
        LazyListState lazyListState = this.f4427a;
        if ((f2 < 0.0f && !lazyListState.d()) || (f2 > 0.0f && !lazyListState.c())) {
            f2 = 0.0f;
        } else {
            if (Math.abs(lazyListState.f4396h) > 0.5f) {
                throw new IllegalStateException(("entered drag with non-zero pending scroll: " + lazyListState.f4396h).toString());
            }
            float f3 = lazyListState.f4396h + f2;
            lazyListState.f4396h = f3;
            if (Math.abs(f3) > 0.5f) {
                LazyListMeasureResult lazyListMeasureResult = (LazyListMeasureResult) lazyListState.f4394f.getValue();
                float f4 = lazyListState.f4396h;
                int round = Math.round(f4);
                LazyListMeasureResult lazyListMeasureResult2 = lazyListState.f4393c;
                boolean j2 = lazyListMeasureResult.j(round, !lazyListState.f4392b);
                if (j2 && lazyListMeasureResult2 != null) {
                    j2 = lazyListMeasureResult2.j(round, true);
                }
                LazyListPrefetchStrategy lazyListPrefetchStrategy = lazyListState.f4391a;
                LazyListState$prefetchScope$1 lazyListState$prefetchScope$1 = lazyListState.f4405q;
                if (j2) {
                    lazyListState.f(lazyListMeasureResult, lazyListState.f4392b, true);
                    ObservableScopeInvalidator.b(lazyListState.f4410v);
                    float f5 = f4 - lazyListState.f4396h;
                    if (lazyListState.f4398j) {
                        lazyListPrefetchStrategy.b(lazyListState$prefetchScope$1, f5, lazyListMeasureResult);
                    }
                } else {
                    Remeasurement remeasurement = lazyListState.f4399k;
                    if (remeasurement != null) {
                        remeasurement.d();
                    }
                    float f6 = f4 - lazyListState.f4396h;
                    LazyListLayoutInfo i2 = lazyListState.i();
                    if (lazyListState.f4398j) {
                        lazyListPrefetchStrategy.b(lazyListState$prefetchScope$1, f6, i2);
                    }
                }
            }
            if (Math.abs(lazyListState.f4396h) > 0.5f) {
                f2 -= lazyListState.f4396h;
                lazyListState.f4396h = 0.0f;
            }
        }
        return Float.valueOf(-f2);
    }
}
