package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import b1.d0;
import d0.b0;
import h0.g;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.lifecycle.LifecycleCoroutineScopeImpl$register$1", f = "Lifecycle.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class LifecycleCoroutineScopeImpl$register$1 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f20006a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LifecycleCoroutineScopeImpl f20007b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LifecycleCoroutineScopeImpl$register$1(LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl, g gVar) {
        super(2, gVar);
        this.f20007b = lifecycleCoroutineScopeImpl;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        LifecycleCoroutineScopeImpl$register$1 lifecycleCoroutineScopeImpl$register$1 = new LifecycleCoroutineScopeImpl$register$1(this.f20007b, gVar);
        lifecycleCoroutineScopeImpl$register$1.f20006a = obj;
        return lifecycleCoroutineScopeImpl$register$1;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        LifecycleCoroutineScopeImpl$register$1 lifecycleCoroutineScopeImpl$register$1 = (LifecycleCoroutineScopeImpl$register$1) create((d0) obj, (g) obj2);
        b0 b0Var = b0.f30125a;
        lifecycleCoroutineScopeImpl$register$1.invokeSuspend(b0Var);
        return b0Var;
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        q.m(obj);
        d0 d0Var = (d0) this.f20006a;
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl = this.f20007b;
        if (lifecycleCoroutineScopeImpl.f20004a.b().compareTo(Lifecycle.State.f19988b) >= 0) {
            lifecycleCoroutineScopeImpl.f20004a.a(lifecycleCoroutineScopeImpl);
        } else {
            kotlin.jvm.internal.e.h(d0Var.getCoroutineContext(), null);
        }
        return b0.f30125a;
    }
}
