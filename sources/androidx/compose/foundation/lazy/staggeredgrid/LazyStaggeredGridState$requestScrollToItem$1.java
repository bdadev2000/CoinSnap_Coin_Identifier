package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.gestures.ScrollExtensionsKt;
import b1.d0;
import d0.b0;
import h0.g;
import i0.a;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import q0.p;

@e(c = "androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$requestScrollToItem$1", f = "LazyStaggeredGridState.kt", l = {360}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class LazyStaggeredGridState$requestScrollToItem$1 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f5070a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LazyStaggeredGridState f5071b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyStaggeredGridState$requestScrollToItem$1(LazyStaggeredGridState lazyStaggeredGridState, g gVar) {
        super(2, gVar);
        this.f5071b = lazyStaggeredGridState;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        return new LazyStaggeredGridState$requestScrollToItem$1(this.f5071b, gVar);
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((LazyStaggeredGridState$requestScrollToItem$1) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f30806a;
        int i2 = this.f5070a;
        if (i2 == 0) {
            q.m(obj);
            this.f5070a = 1;
            if (ScrollExtensionsKt.c(this.f5071b, this) == aVar) {
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
