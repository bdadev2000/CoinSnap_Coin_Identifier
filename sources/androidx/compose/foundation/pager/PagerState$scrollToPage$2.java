package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.ui.layout.Remeasurement;
import d0.b0;
import h0.g;
import i0.a;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import q0.p;

@e(c = "androidx.compose.foundation.pager.PagerState$scrollToPage$2", f = "PagerState.kt", l = {498}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class PagerState$scrollToPage$2 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f5300a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PagerState f5301b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f5302c;
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagerState$scrollToPage$2(PagerState pagerState, float f2, int i2, g gVar) {
        super(2, gVar);
        this.f5301b = pagerState;
        this.f5302c = f2;
        this.d = i2;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        return new PagerState$scrollToPage$2(this.f5301b, this.f5302c, this.d, gVar);
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((PagerState$scrollToPage$2) create((ScrollScope) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f30806a;
        int i2 = this.f5300a;
        b0 b0Var = b0.f30125a;
        PagerState pagerState = this.f5301b;
        if (i2 == 0) {
            q.m(obj);
            this.f5300a = 1;
            Object a2 = pagerState.x.a(this);
            if (a2 != aVar) {
                a2 = b0Var;
            }
            if (a2 == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q.m(obj);
        }
        float f2 = this.f5302c;
        double d = f2;
        if (-0.5d > d || d > 0.5d) {
            throw new IllegalArgumentException(("pageOffsetFraction " + f2 + " is not within the range -0.5 to 0.5").toString());
        }
        int i3 = pagerState.i(this.d);
        PagerScrollPosition pagerScrollPosition = pagerState.f5265c;
        pagerScrollPosition.f5259b.b(i3);
        pagerScrollPosition.f5261f.a(i3);
        pagerScrollPosition.f5260c.n(f2);
        pagerScrollPosition.e = null;
        Remeasurement remeasurement = (Remeasurement) pagerState.f5283y.getValue();
        if (remeasurement != null) {
            remeasurement.d();
        }
        return b0Var;
    }
}
