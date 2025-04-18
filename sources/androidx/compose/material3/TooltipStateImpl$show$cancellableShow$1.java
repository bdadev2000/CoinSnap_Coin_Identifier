package androidx.compose.material3;

import b1.f0;
import d0.b0;
import h0.g;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import q0.l;

@e(c = "androidx.compose.material3.TooltipStateImpl$show$cancellableShow$1", f = "Tooltip.kt", l = {646}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class TooltipStateImpl$show$cancellableShow$1 extends i implements l {

    /* renamed from: a, reason: collision with root package name */
    public Object f12565a;

    /* renamed from: b, reason: collision with root package name */
    public int f12566b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TooltipStateImpl f12567c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TooltipStateImpl$show$cancellableShow$1(TooltipStateImpl tooltipStateImpl, g gVar) {
        super(1, gVar);
        this.f12567c = tooltipStateImpl;
    }

    @Override // j0.a
    public final g create(g gVar) {
        return new TooltipStateImpl$show$cancellableShow$1(this.f12567c, gVar);
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        TooltipStateImpl$show$cancellableShow$1 tooltipStateImpl$show$cancellableShow$1 = (TooltipStateImpl$show$cancellableShow$1) create((g) obj);
        b0 b0Var = b0.f30125a;
        tooltipStateImpl$show$cancellableShow$1.invokeSuspend(b0Var);
        return b0Var;
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        int i2 = this.f12566b;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q.m(obj);
            return b0.f30125a;
        }
        q.m(obj);
        TooltipStateImpl tooltipStateImpl = this.f12567c;
        this.f12565a = tooltipStateImpl;
        this.f12566b = 1;
        new b1.l(1, f0.r(this)).p();
        tooltipStateImpl.getClass();
        throw null;
    }
}
