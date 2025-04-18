package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.ScrollExtensionsKt;
import b1.d0;
import d0.b0;
import h0.g;
import i0.a;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import q0.p;

@e(c = "androidx.compose.foundation.pager.PagerState$requestScrollToPage$1", f = "PagerState.kt", l = {576}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class PagerState$requestScrollToPage$1 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f5293a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PagerState f5294b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagerState$requestScrollToPage$1(PagerState pagerState, g gVar) {
        super(2, gVar);
        this.f5294b = pagerState;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        return new PagerState$requestScrollToPage$1(this.f5294b, gVar);
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((PagerState$requestScrollToPage$1) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f30806a;
        int i2 = this.f5293a;
        if (i2 == 0) {
            q.m(obj);
            this.f5293a = 1;
            if (ScrollExtensionsKt.c(this.f5294b, this) == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q.m(obj);
        }
        return b0.f30125a;
    }
}
