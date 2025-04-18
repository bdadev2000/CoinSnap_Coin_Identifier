package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.gestures.ScrollScope;
import d0.b0;
import h0.g;
import i0.a;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import q0.p;

@e(c = "androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$scrollToItem$2", f = "LazyStaggeredGridState.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class LazyStaggeredGridState$scrollToItem$2 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LazyStaggeredGridState f5077a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5078b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f5079c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyStaggeredGridState$scrollToItem$2(LazyStaggeredGridState lazyStaggeredGridState, int i2, int i3, g gVar) {
        super(2, gVar);
        this.f5077a = lazyStaggeredGridState;
        this.f5078b = i2;
        this.f5079c = i3;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        return new LazyStaggeredGridState$scrollToItem$2(this.f5077a, this.f5078b, this.f5079c, gVar);
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        LazyStaggeredGridState$scrollToItem$2 lazyStaggeredGridState$scrollToItem$2 = (LazyStaggeredGridState$scrollToItem$2) create((ScrollScope) obj, (g) obj2);
        b0 b0Var = b0.f30125a;
        lazyStaggeredGridState$scrollToItem$2.invokeSuspend(b0Var);
        return b0Var;
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f30806a;
        q.m(obj);
        this.f5077a.i(this.f5078b, this.f5079c);
        return b0.f30125a;
    }
}
