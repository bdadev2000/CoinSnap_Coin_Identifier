package androidx.compose.foundation;

import b1.f0;
import d0.b0;
import h0.g;
import i0.a;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import q0.l;

@e(c = "androidx.compose.foundation.BasicTooltipStateImpl$show$cancellableShow$1", f = "BasicTooltip.kt", l = {247}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class BasicTooltipStateImpl$show$cancellableShow$1 extends i implements l {

    /* renamed from: a, reason: collision with root package name */
    public Object f2514a;

    /* renamed from: b, reason: collision with root package name */
    public int f2515b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BasicTooltipStateImpl f2516c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasicTooltipStateImpl$show$cancellableShow$1(BasicTooltipStateImpl basicTooltipStateImpl, g gVar) {
        super(1, gVar);
        this.f2516c = basicTooltipStateImpl;
    }

    @Override // j0.a
    public final g create(g gVar) {
        return new BasicTooltipStateImpl$show$cancellableShow$1(this.f2516c, gVar);
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        BasicTooltipStateImpl$show$cancellableShow$1 basicTooltipStateImpl$show$cancellableShow$1 = (BasicTooltipStateImpl$show$cancellableShow$1) create((g) obj);
        b0 b0Var = b0.f30125a;
        basicTooltipStateImpl$show$cancellableShow$1.invokeSuspend(b0Var);
        return b0Var;
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f30806a;
        int i2 = this.f2515b;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q.m(obj);
            return b0.f30125a;
        }
        q.m(obj);
        BasicTooltipStateImpl basicTooltipStateImpl = this.f2516c;
        this.f2514a = basicTooltipStateImpl;
        this.f2515b = 1;
        new b1.l(1, f0.r(this)).p();
        basicTooltipStateImpl.getClass();
        throw null;
    }
}
