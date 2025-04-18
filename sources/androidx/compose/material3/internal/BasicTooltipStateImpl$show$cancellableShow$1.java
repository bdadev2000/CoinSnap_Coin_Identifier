package androidx.compose.material3.internal;

import b1.f0;
import d0.b0;
import h0.g;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import org.objectweb.asm.Opcodes;
import q0.l;

@e(c = "androidx.compose.material3.internal.BasicTooltipStateImpl$show$cancellableShow$1", f = "BasicTooltip.kt", l = {Opcodes.ANEWARRAY}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class BasicTooltipStateImpl$show$cancellableShow$1 extends i implements l {

    /* renamed from: a, reason: collision with root package name */
    public Object f12873a;

    /* renamed from: b, reason: collision with root package name */
    public int f12874b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BasicTooltipStateImpl f12875c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasicTooltipStateImpl$show$cancellableShow$1(BasicTooltipStateImpl basicTooltipStateImpl, g gVar) {
        super(1, gVar);
        this.f12875c = basicTooltipStateImpl;
    }

    @Override // j0.a
    public final g create(g gVar) {
        return new BasicTooltipStateImpl$show$cancellableShow$1(this.f12875c, gVar);
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        return ((BasicTooltipStateImpl$show$cancellableShow$1) create((g) obj)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        int i2 = this.f12874b;
        if (i2 == 0) {
            q.m(obj);
            BasicTooltipStateImpl basicTooltipStateImpl = this.f12875c;
            this.f12874b = 1;
            b1.l lVar = new b1.l(1, f0.r(this));
            lVar.p();
            basicTooltipStateImpl.f12867c.setValue(Boolean.TRUE);
            basicTooltipStateImpl.e = lVar;
            if (lVar.o() == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q.m(obj);
        }
        return b0.f30125a;
    }
}
