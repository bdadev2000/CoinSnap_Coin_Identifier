package androidx.compose.runtime;

import b1.d0;
import d0.b0;
import h0.g;
import j0.e;
import j0.i;
import org.objectweb.asm.TypeReference;
import q0.p;
import q0.q;

@e(c = "androidx.compose.runtime.RecomposerKt$withRunningRecomposer$2", f = "Recomposer.kt", l = {76, 78}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class RecomposerKt$withRunningRecomposer$2 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f13964a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f13965b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q f13966c;

    /* JADX INFO: Access modifiers changed from: package-private */
    @e(c = "androidx.compose.runtime.RecomposerKt$withRunningRecomposer$2$1", f = "Recomposer.kt", l = {TypeReference.METHOD_REFERENCE_TYPE_ARGUMENT}, m = "invokeSuspend")
    /* renamed from: androidx.compose.runtime.RecomposerKt$withRunningRecomposer$2$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    public final class AnonymousClass1 extends i implements p {

        /* renamed from: a, reason: collision with root package name */
        public int f13967a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Recomposer f13968b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Recomposer recomposer, g gVar) {
            super(2, gVar);
            this.f13968b = recomposer;
        }

        @Override // j0.a
        public final g create(Object obj, g gVar) {
            return new AnonymousClass1(this.f13968b, gVar);
        }

        @Override // q0.p
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
        }

        @Override // j0.a
        public final Object invokeSuspend(Object obj) {
            i0.a aVar = i0.a.f30806a;
            int i2 = this.f13967a;
            if (i2 == 0) {
                kotlin.jvm.internal.q.m(obj);
                this.f13967a = 1;
                if (this.f13968b.N(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.jvm.internal.q.m(obj);
            }
            return b0.f30125a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecomposerKt$withRunningRecomposer$2(q qVar, g gVar) {
        super(2, gVar);
        this.f13966c = qVar;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        RecomposerKt$withRunningRecomposer$2 recomposerKt$withRunningRecomposer$2 = new RecomposerKt$withRunningRecomposer$2(this.f13966c, gVar);
        recomposerKt$withRunningRecomposer$2.f13965b = obj;
        return recomposerKt$withRunningRecomposer$2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((RecomposerKt$withRunningRecomposer$2) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        Recomposer recomposer;
        i0.a aVar = i0.a.f30806a;
        int i2 = this.f13964a;
        if (i2 == 0) {
            kotlin.jvm.internal.q.m(obj);
            d0 d0Var = (d0) this.f13965b;
            recomposer = new Recomposer(d0Var.getCoroutineContext());
            kotlin.jvm.internal.e.v(d0Var, null, 0, new AnonymousClass1(recomposer, null), 3);
            q qVar = this.f13966c;
            this.f13965b = recomposer;
            this.f13964a = 1;
            obj = qVar.invoke(d0Var, recomposer, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Object obj2 = this.f13965b;
                kotlin.jvm.internal.q.m(obj);
                return obj2;
            }
            recomposer = (Recomposer) this.f13965b;
            kotlin.jvm.internal.q.m(obj);
        }
        if (recomposer.f13895u.Z(b0.f30125a)) {
            synchronized (recomposer.f13878b) {
                recomposer.f13891q = true;
            }
        }
        this.f13965b = obj;
        this.f13964a = 2;
        return recomposer.G(this) == aVar ? aVar : obj;
    }
}
