package androidx.compose.foundation.pager;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope;
import androidx.compose.ui.layout.Remeasurement;
import d0.b0;
import e0.u;
import h0.g;
import i0.a;
import java.util.List;
import q0.p;

/* loaded from: classes4.dex */
public final class PagerLazyAnimateScrollScopeKt$PagerLazyAnimateScrollScope$1 implements LazyLayoutAnimateScrollScope {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PagerState f5196a;

    public PagerLazyAnimateScrollScopeKt$PagerLazyAnimateScrollScope$1(PagerState pagerState) {
        this.f5196a = pagerState;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope
    public final int a() {
        return ((PageInfo) u.L0(this.f5196a.l().h())).getIndex();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope
    public final void b(int i2, int i3) {
        PagerState pagerState = this.f5196a;
        PagerScrollPosition pagerScrollPosition = pagerState.f5265c;
        pagerScrollPosition.f5259b.b(i2);
        pagerScrollPosition.f5261f.a(i2);
        pagerScrollPosition.f5260c.n(i3 / pagerState.o());
        pagerScrollPosition.e = null;
        Remeasurement remeasurement = (Remeasurement) pagerState.f5283y.getValue();
        if (remeasurement != null) {
            remeasurement.d();
        }
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope
    public final float c(int i2) {
        Object obj;
        PagerState pagerState = this.f5196a;
        List h2 = pagerState.l().h();
        int size = h2.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                obj = null;
                break;
            }
            obj = h2.get(i3);
            if (((PageInfo) obj).getIndex() == i2) {
                break;
            }
            i3++;
        }
        if (((PageInfo) obj) != null) {
            return r4.a();
        }
        return ((i2 - pagerState.j()) * (((PagerMeasureResult) pagerState.f5275o.getValue()).f5241c + pagerState.n())) - (pagerState.k() * pagerState.o());
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope
    public final int d() {
        return this.f5196a.e;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope
    public final int e() {
        return this.f5196a.d;
    }

    public final Object f(p pVar, g gVar) {
        Object b2 = this.f5196a.b(MutatePriority.f2811a, pVar, gVar);
        return b2 == a.f30806a ? b2 : b0.f30125a;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope
    public final int getItemCount() {
        return this.f5196a.m();
    }
}
