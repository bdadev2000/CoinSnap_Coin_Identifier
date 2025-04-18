package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import b1.d0;
import d0.b0;
import h0.g;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import org.objectweb.asm.Opcodes;
import q0.p;

@e(c = "androidx.lifecycle.LifecycleCoroutineScope$launchWhenResumed$1", f = "Lifecycle.jvm.kt", l = {Opcodes.DUP2_X1}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class LifecycleCoroutineScope$launchWhenResumed$1 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f19998a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LifecycleCoroutineScope f19999b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f20000c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LifecycleCoroutineScope$launchWhenResumed$1(LifecycleCoroutineScope lifecycleCoroutineScope, p pVar, g gVar) {
        super(2, gVar);
        this.f19999b = lifecycleCoroutineScope;
        this.f20000c = pVar;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        return new LifecycleCoroutineScope$launchWhenResumed$1(this.f19999b, this.f20000c, gVar);
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((LifecycleCoroutineScope$launchWhenResumed$1) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        int i2 = this.f19998a;
        if (i2 == 0) {
            q.m(obj);
            Lifecycle a2 = this.f19999b.a();
            this.f19998a = 1;
            if (PausingDispatcherKt.a(a2, Lifecycle.State.f19990f, this.f20000c, this) == aVar) {
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
