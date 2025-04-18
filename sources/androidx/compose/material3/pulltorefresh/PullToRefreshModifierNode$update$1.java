package androidx.compose.material3.pulltorefresh;

import b1.d0;
import d0.b0;
import h0.g;
import i0.a;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import q0.p;

@e(c = "androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$update$1", f = "PullToRefresh.kt", l = {333, 335}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class PullToRefreshModifierNode$update$1 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f13191a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PullToRefreshModifierNode f13192b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PullToRefreshModifierNode$update$1(PullToRefreshModifierNode pullToRefreshModifierNode, g gVar) {
        super(2, gVar);
        this.f13192b = pullToRefreshModifierNode;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        return new PullToRefreshModifierNode$update$1(this.f13192b, gVar);
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((PullToRefreshModifierNode$update$1) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f30806a;
        int i2 = this.f13191a;
        if (i2 == 0) {
            q.m(obj);
            PullToRefreshModifierNode pullToRefreshModifierNode = this.f13192b;
            if (pullToRefreshModifierNode.f13168q) {
                this.f13191a = 2;
                if (pullToRefreshModifierNode.i2(this) == aVar) {
                    return aVar;
                }
            } else {
                this.f13191a = 1;
                if (pullToRefreshModifierNode.h2(this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i2 != 1 && i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q.m(obj);
        }
        return b0.f30125a;
    }
}
