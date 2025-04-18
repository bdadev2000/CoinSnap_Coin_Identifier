package androidx.compose.material3;

import androidx.compose.foundation.MutatePriority;
import b1.d0;
import d0.b0;
import h0.g;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import q0.l;
import q0.p;

@e(c = "androidx.compose.material3.TooltipStateImpl$show$2", f = "Tooltip.kt", l = {504, 506}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class TooltipStateImpl$show$2 extends i implements l {

    /* renamed from: a, reason: collision with root package name */
    public int f12560a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TooltipStateImpl f12561b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f12562c;
    public final /* synthetic */ MutatePriority d;

    /* JADX INFO: Access modifiers changed from: package-private */
    @e(c = "androidx.compose.material3.TooltipStateImpl$show$2$1", f = "Tooltip.kt", l = {506}, m = "invokeSuspend")
    /* renamed from: androidx.compose.material3.TooltipStateImpl$show$2$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    public final class AnonymousClass1 extends i implements p {

        /* renamed from: a, reason: collision with root package name */
        public int f12563a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l f12564b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(l lVar, g gVar) {
            super(2, gVar);
            this.f12564b = lVar;
        }

        @Override // j0.a
        public final g create(Object obj, g gVar) {
            return new AnonymousClass1(this.f12564b, gVar);
        }

        @Override // q0.p
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
        }

        @Override // j0.a
        public final Object invokeSuspend(Object obj) {
            i0.a aVar = i0.a.f30806a;
            int i2 = this.f12563a;
            if (i2 == 0) {
                q.m(obj);
                this.f12563a = 1;
                if (this.f12564b.invoke(this) == aVar) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TooltipStateImpl$show$2(TooltipStateImpl tooltipStateImpl, l lVar, MutatePriority mutatePriority, g gVar) {
        super(1, gVar);
        this.f12561b = tooltipStateImpl;
        this.f12562c = lVar;
        this.d = mutatePriority;
    }

    @Override // j0.a
    public final g create(g gVar) {
        return new TooltipStateImpl$show$2(this.f12561b, this.f12562c, this.d, gVar);
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        return ((TooltipStateImpl$show$2) create((g) obj)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        int i2 = this.f12560a;
        MutatePriority mutatePriority = MutatePriority.f2813c;
        MutatePriority mutatePriority2 = this.d;
        TooltipStateImpl tooltipStateImpl = this.f12561b;
        try {
            if (i2 == 0) {
                q.m(obj);
                tooltipStateImpl.getClass();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f12562c, null);
                this.f12560a = 2;
                if (p0.a.H0(1500L, anonymousClass1, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1 && i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                q.m(obj);
            }
            if (mutatePriority2 == mutatePriority) {
                return b0.f30125a;
            }
            tooltipStateImpl.getClass();
            throw null;
        } catch (Throwable th) {
            if (mutatePriority2 == mutatePriority) {
                throw th;
            }
            tooltipStateImpl.getClass();
            throw null;
        }
    }
}
