package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.MutatePriority;
import h0.g;
import j0.c;
import j0.e;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState", f = "LazyStaggeredGridState.kt", l = {235, 236}, m = "scroll")
/* loaded from: classes2.dex */
public final class LazyStaggeredGridState$scroll$1 extends c {

    /* renamed from: a, reason: collision with root package name */
    public LazyStaggeredGridState f5072a;

    /* renamed from: b, reason: collision with root package name */
    public MutatePriority f5073b;

    /* renamed from: c, reason: collision with root package name */
    public p f5074c;
    public /* synthetic */ Object d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ LazyStaggeredGridState f5075f;

    /* renamed from: g, reason: collision with root package name */
    public int f5076g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyStaggeredGridState$scroll$1(LazyStaggeredGridState lazyStaggeredGridState, g gVar) {
        super(gVar);
        this.f5075f = lazyStaggeredGridState;
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f5076g |= Integer.MIN_VALUE;
        return this.f5075f.b(null, null, this);
    }
}
