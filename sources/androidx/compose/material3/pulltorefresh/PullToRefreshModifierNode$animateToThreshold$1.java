package androidx.compose.material3.pulltorefresh;

import h0.g;
import j0.c;
import j0.e;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode", f = "PullToRefresh.kt", l = {400}, m = "animateToThreshold")
/* loaded from: classes2.dex */
public final class PullToRefreshModifierNode$animateToThreshold$1 extends c {

    /* renamed from: a, reason: collision with root package name */
    public PullToRefreshModifierNode f13177a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f13178b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PullToRefreshModifierNode f13179c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PullToRefreshModifierNode$animateToThreshold$1(PullToRefreshModifierNode pullToRefreshModifierNode, g gVar) {
        super(gVar);
        this.f13179c = pullToRefreshModifierNode;
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        this.f13178b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f13179c.i2(this);
    }
}
