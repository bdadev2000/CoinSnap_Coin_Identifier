package androidx.compose.foundation;

import b1.d0;
import d0.b0;
import h0.g;
import i0.a;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import org.objectweb.asm.Opcodes;
import q0.l;
import q0.p;

@e(c = "androidx.compose.foundation.BasicTooltipStateImpl$show$2", f = "BasicTooltip.kt", l = {156, 158}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class BasicTooltipStateImpl$show$2 extends i implements l {

    /* renamed from: a, reason: collision with root package name */
    public int f2509a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BasicTooltipStateImpl f2510b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f2511c;

    /* JADX INFO: Access modifiers changed from: package-private */
    @e(c = "androidx.compose.foundation.BasicTooltipStateImpl$show$2$1", f = "BasicTooltip.kt", l = {Opcodes.IF_ICMPEQ}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.BasicTooltipStateImpl$show$2$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass1 extends i implements p {

        /* renamed from: a, reason: collision with root package name */
        public int f2512a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l f2513b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(l lVar, g gVar) {
            super(2, gVar);
            this.f2513b = lVar;
        }

        @Override // j0.a
        public final g create(Object obj, g gVar) {
            return new AnonymousClass1(this.f2513b, gVar);
        }

        @Override // q0.p
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
        }

        @Override // j0.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f30806a;
            int i2 = this.f2512a;
            if (i2 == 0) {
                q.m(obj);
                this.f2512a = 1;
                if (this.f2513b.invoke(this) == aVar) {
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
        this.f2510b = basicTooltipStateImpl;
        this.f2511c = lVar;
    }

    @Override // j0.a
    public final g create(g gVar) {
        return new BasicTooltipStateImpl$show$2(this.f2510b, this.f2511c, gVar);
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        ((BasicTooltipStateImpl$show$2) create((g) obj)).invokeSuspend(b0.f30125a);
        return a.f30806a;
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f30806a;
        int i2 = this.f2509a;
        BasicTooltipStateImpl basicTooltipStateImpl = this.f2510b;
        if (i2 == 0) {
            q.m(obj);
            basicTooltipStateImpl.getClass();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f2511c, null);
            this.f2509a = 2;
            if (p0.a.H0(1500L, anonymousClass1, this) == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1 && i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q.m(obj);
        }
        basicTooltipStateImpl.getClass();
        throw null;
    }
}
