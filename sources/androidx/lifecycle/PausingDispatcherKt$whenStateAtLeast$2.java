package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import b1.a0;
import b1.d0;
import b1.h1;
import d0.b0;
import h0.g;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import q0.p;

@e(c = "androidx.lifecycle.PausingDispatcherKt$whenStateAtLeast$2", f = "PausingDispatcher.jvm.kt", l = {205}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class PausingDispatcherKt$whenStateAtLeast$2 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f20048a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f20049b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Lifecycle f20050c;
    public final /* synthetic */ Lifecycle.State d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p f20051f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PausingDispatcherKt$whenStateAtLeast$2(Lifecycle lifecycle, Lifecycle.State state, p pVar, g gVar) {
        super(2, gVar);
        this.f20050c = lifecycle;
        this.d = state;
        this.f20051f = pVar;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        PausingDispatcherKt$whenStateAtLeast$2 pausingDispatcherKt$whenStateAtLeast$2 = new PausingDispatcherKt$whenStateAtLeast$2(this.f20050c, this.d, this.f20051f, gVar);
        pausingDispatcherKt$whenStateAtLeast$2.f20049b = obj;
        return pausingDispatcherKt$whenStateAtLeast$2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((PausingDispatcherKt$whenStateAtLeast$2) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        LifecycleController lifecycleController;
        i0.a aVar = i0.a.f30806a;
        int i2 = this.f20048a;
        if (i2 == 0) {
            q.m(obj);
            h1 h1Var = (h1) ((d0) this.f20049b).getCoroutineContext().i(a0.f22285b);
            if (h1Var == null) {
                throw new IllegalStateException("when[State] methods should have a parent job".toString());
            }
            PausingDispatcher pausingDispatcher = new PausingDispatcher();
            LifecycleController lifecycleController2 = new LifecycleController(this.f20050c, this.d, pausingDispatcher.f20047c, h1Var);
            try {
                p pVar = this.f20051f;
                this.f20049b = lifecycleController2;
                this.f20048a = 1;
                obj = kotlin.jvm.internal.e.G(this, pausingDispatcher, pVar);
                if (obj == aVar) {
                    return aVar;
                }
                lifecycleController = lifecycleController2;
            } catch (Throwable th) {
                th = th;
                lifecycleController = lifecycleController2;
                lifecycleController.a();
                throw th;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            lifecycleController = (LifecycleController) this.f20049b;
            try {
                q.m(obj);
            } catch (Throwable th2) {
                th = th2;
                lifecycleController.a();
                throw th;
            }
        }
        lifecycleController.a();
        return obj;
    }
}
