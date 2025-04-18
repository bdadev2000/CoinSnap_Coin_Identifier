package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import b1.d0;
import d0.b0;
import h0.g;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import org.objectweb.asm.TypeReference;
import q0.p;

@e(c = "androidx.lifecycle.LifecycleCoroutineScope$launchWhenStarted$1", f = "Lifecycle.jvm.kt", l = {TypeReference.CONSTRUCTOR_REFERENCE_TYPE_ARGUMENT}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class LifecycleCoroutineScope$launchWhenStarted$1 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f20001a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LifecycleCoroutineScope f20002b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f20003c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LifecycleCoroutineScope$launchWhenStarted$1(LifecycleCoroutineScope lifecycleCoroutineScope, p pVar, g gVar) {
        super(2, gVar);
        this.f20002b = lifecycleCoroutineScope;
        this.f20003c = pVar;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        return new LifecycleCoroutineScope$launchWhenStarted$1(this.f20002b, this.f20003c, gVar);
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((LifecycleCoroutineScope$launchWhenStarted$1) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        int i2 = this.f20001a;
        if (i2 == 0) {
            q.m(obj);
            Lifecycle a2 = this.f20002b.a();
            this.f20001a = 1;
            if (PausingDispatcherKt.a(a2, Lifecycle.State.d, this.f20003c, this) == aVar) {
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
