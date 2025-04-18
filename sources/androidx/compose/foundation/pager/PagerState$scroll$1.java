package androidx.compose.foundation.pager;

import androidx.compose.foundation.MutatePriority;
import h0.g;
import j0.c;
import j0.e;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.foundation.pager.PagerState", f = "PagerState.kt", l = {629, 634}, m = "scroll$suspendImpl")
/* loaded from: classes.dex */
public final class PagerState$scroll$1 extends c {

    /* renamed from: a, reason: collision with root package name */
    public PagerState f5295a;

    /* renamed from: b, reason: collision with root package name */
    public MutatePriority f5296b;

    /* renamed from: c, reason: collision with root package name */
    public p f5297c;
    public /* synthetic */ Object d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ PagerState f5298f;

    /* renamed from: g, reason: collision with root package name */
    public int f5299g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagerState$scroll$1(PagerState pagerState, g gVar) {
        super(gVar);
        this.f5298f = pagerState;
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f5299g |= Integer.MIN_VALUE;
        return PagerState.s(this.f5298f, null, null, this);
    }
}
