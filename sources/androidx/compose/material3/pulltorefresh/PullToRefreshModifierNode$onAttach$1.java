package androidx.compose.material3.pulltorefresh;

import b1.d0;
import d0.b0;
import h0.g;
import i0.a;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import q0.p;

@e(c = "androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$onAttach$1", f = "PullToRefresh.kt", l = {287, 289}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class PullToRefreshModifierNode$onAttach$1 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f13180a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PullToRefreshModifierNode f13181b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PullToRefreshModifierNode$onAttach$1(PullToRefreshModifierNode pullToRefreshModifierNode, g gVar) {
        super(2, gVar);
        this.f13181b = pullToRefreshModifierNode;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        return new PullToRefreshModifierNode$onAttach$1(this.f13181b, gVar);
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((PullToRefreshModifierNode$onAttach$1) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f30806a;
        int i2 = this.f13180a;
        if (i2 == 0) {
            q.m(obj);
            PullToRefreshModifierNode pullToRefreshModifierNode = this.f13181b;
            if (pullToRefreshModifierNode.f13168q) {
                PullToRefreshState pullToRefreshState = pullToRefreshModifierNode.f13171t;
                this.f13180a = 1;
                if (pullToRefreshState.b(1.0f, this) == aVar) {
                    return aVar;
                }
            } else {
                PullToRefreshState pullToRefreshState2 = pullToRefreshModifierNode.f13171t;
                this.f13180a = 2;
                if (pullToRefreshState2.b(0.0f, this) == aVar) {
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
