package androidx.compose.material3.pulltorefresh;

import h0.g;
import j0.c;
import j0.e;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode", f = "PullToRefresh.kt", l = {327}, m = "onPreFling-QWom1Mo")
/* loaded from: classes3.dex */
public final class PullToRefreshModifierNode$onPreFling$1 extends c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f13184a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PullToRefreshModifierNode f13185b;

    /* renamed from: c, reason: collision with root package name */
    public int f13186c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PullToRefreshModifierNode$onPreFling$1(PullToRefreshModifierNode pullToRefreshModifierNode, g gVar) {
        super(gVar);
        this.f13185b = pullToRefreshModifierNode;
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        this.f13184a = obj;
        this.f13186c |= Integer.MIN_VALUE;
        return this.f13185b.W0(0L, this);
    }
}
