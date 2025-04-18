package androidx.compose.material3.pulltorefresh;

import h0.g;
import j0.c;
import j0.e;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode", f = "PullToRefresh.kt", l = {359, 362}, m = "onRelease")
/* loaded from: classes2.dex */
public final class PullToRefreshModifierNode$onRelease$1 extends c {

    /* renamed from: a, reason: collision with root package name */
    public PullToRefreshModifierNode f13187a;

    /* renamed from: b, reason: collision with root package name */
    public float f13188b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f13189c;
    public final /* synthetic */ PullToRefreshModifierNode d;

    /* renamed from: f, reason: collision with root package name */
    public int f13190f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PullToRefreshModifierNode$onRelease$1(PullToRefreshModifierNode pullToRefreshModifierNode, g gVar) {
        super(gVar);
        this.d = pullToRefreshModifierNode;
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        this.f13189c = obj;
        this.f13190f |= Integer.MIN_VALUE;
        return this.d.l2(0.0f, this);
    }
}
