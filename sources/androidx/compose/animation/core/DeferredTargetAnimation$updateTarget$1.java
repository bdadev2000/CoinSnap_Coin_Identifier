package androidx.compose.animation.core;

import b1.d0;
import d0.b0;
import h0.g;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import q0.p;

@e(c = "androidx.compose.animation.core.DeferredTargetAnimation$updateTarget$1", f = "DeferredTargetAnimation.kt", l = {77}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class DeferredTargetAnimation$updateTarget$1 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Animatable f2079a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DeferredTargetAnimation f2080b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2081c;
    public final /* synthetic */ FiniteAnimationSpec d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeferredTargetAnimation$updateTarget$1(Animatable animatable, DeferredTargetAnimation deferredTargetAnimation, Object obj, FiniteAnimationSpec finiteAnimationSpec, g gVar) {
        super(2, gVar);
        this.f2079a = animatable;
        this.f2080b = deferredTargetAnimation;
        this.f2081c = obj;
        this.d = finiteAnimationSpec;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        return new DeferredTargetAnimation$updateTarget$1(this.f2079a, this.f2080b, this.f2081c, this.d, gVar);
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        DeferredTargetAnimation$updateTarget$1 deferredTargetAnimation$updateTarget$1 = (DeferredTargetAnimation$updateTarget$1) create((d0) obj, (g) obj2);
        b0 b0Var = b0.f30125a;
        deferredTargetAnimation$updateTarget$1.invokeSuspend(b0Var);
        return b0Var;
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        q.m(obj);
        this.f2079a.e.getValue();
        this.f2080b.getClass();
        throw null;
    }
}
