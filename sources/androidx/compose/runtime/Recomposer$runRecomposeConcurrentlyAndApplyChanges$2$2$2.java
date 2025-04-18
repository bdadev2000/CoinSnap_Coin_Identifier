package androidx.compose.runtime;

import b1.d0;
import b1.k;
import d0.b0;
import h0.g;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import q0.p;

@e(c = "androidx.compose.runtime.Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$2$2", f = "Recomposer.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$2$2 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Recomposer f13955a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ControlledComposition f13956b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$2$2(Recomposer recomposer, ControlledComposition controlledComposition, g gVar) {
        super(2, gVar);
        this.f13955a = recomposer;
        this.f13956b = controlledComposition;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        return new Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$2$2(this.f13955a, this.f13956b, gVar);
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$2$2 recomposer$runRecomposeConcurrentlyAndApplyChanges$2$2$2 = (Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$2$2) create((d0) obj, (g) obj2);
        b0 b0Var = b0.f30125a;
        recomposer$runRecomposeConcurrentlyAndApplyChanges$2$2$2.invokeSuspend(b0Var);
        return b0Var;
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        k C;
        i0.a aVar = i0.a.f30806a;
        q.m(obj);
        ControlledComposition x = Recomposer.x(this.f13955a, this.f13956b, null);
        Recomposer recomposer = this.f13955a;
        synchronized (recomposer.f13878b) {
            if (x != null) {
                try {
                    recomposer.f13883i.add(x);
                } catch (Throwable th) {
                    throw th;
                }
            }
            recomposer.f13890p--;
            C = recomposer.C();
        }
        if (C != null) {
            C.resumeWith(b0.f30125a);
        }
        return b0.f30125a;
    }
}
