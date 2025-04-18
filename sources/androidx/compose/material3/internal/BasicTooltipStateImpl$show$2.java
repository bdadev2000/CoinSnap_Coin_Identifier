package androidx.compose.material3.internal;

import b1.d0;
import d0.b0;
import h0.g;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import org.objectweb.asm.Opcodes;
import q0.l;
import q0.p;

@e(c = "androidx.compose.material3.internal.BasicTooltipStateImpl$show$2", f = "BasicTooltip.kt", l = {Opcodes.DCMPG, 154}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class BasicTooltipStateImpl$show$2 extends i implements l {

    /* renamed from: a, reason: collision with root package name */
    public int f12868a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BasicTooltipStateImpl f12869b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f12870c;

    /* JADX INFO: Access modifiers changed from: package-private */
    @e(c = "androidx.compose.material3.internal.BasicTooltipStateImpl$show$2$1", f = "BasicTooltip.kt", l = {154}, m = "invokeSuspend")
    /* renamed from: androidx.compose.material3.internal.BasicTooltipStateImpl$show$2$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public final class AnonymousClass1 extends i implements p {

        /* renamed from: a, reason: collision with root package name */
        public int f12871a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l f12872b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(l lVar, g gVar) {
            super(2, gVar);
            this.f12872b = lVar;
        }

        @Override // j0.a
        public final g create(Object obj, g gVar) {
            return new AnonymousClass1(this.f12872b, gVar);
        }

        @Override // q0.p
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
        }

        @Override // j0.a
        public final Object invokeSuspend(Object obj) {
            i0.a aVar = i0.a.f30806a;
            int i2 = this.f12871a;
            if (i2 == 0) {
                q.m(obj);
                this.f12871a = 1;
                if (this.f12872b.invoke(this) == aVar) {
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
    public BasicTooltipStateImpl$show$2(BasicTooltipStateImpl basicTooltipStateImpl, l lVar, g gVar) {
        super(1, gVar);
        this.f12869b = basicTooltipStateImpl;
        this.f12870c = lVar;
    }

    @Override // j0.a
    public final g create(g gVar) {
        return new BasicTooltipStateImpl$show$2(this.f12869b, this.f12870c, gVar);
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        return ((BasicTooltipStateImpl$show$2) create((g) obj)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        int i2 = this.f12868a;
        BasicTooltipStateImpl basicTooltipStateImpl = this.f12869b;
        try {
            if (i2 == 0) {
                q.m(obj);
                boolean z2 = basicTooltipStateImpl.f12865a;
                l lVar = this.f12870c;
                if (z2) {
                    this.f12868a = 1;
                    if (lVar.invoke(this) == aVar) {
                        return aVar;
                    }
                } else {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(lVar, null);
                    this.f12868a = 2;
                    if (p0.a.H0(1500L, anonymousClass1, this) == aVar) {
                        return aVar;
                    }
                }
            } else {
                if (i2 != 1 && i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                q.m(obj);
            }
            basicTooltipStateImpl.f12867c.setValue(Boolean.FALSE);
            return b0.f30125a;
        } catch (Throwable th) {
            basicTooltipStateImpl.f12867c.setValue(Boolean.FALSE);
            throw th;
        }
    }
}
