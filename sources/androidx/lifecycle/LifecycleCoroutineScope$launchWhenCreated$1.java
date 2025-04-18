package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import b1.d0;
import d0.b0;
import h0.g;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import q0.p;

@e(c = "androidx.lifecycle.LifecycleCoroutineScope$launchWhenCreated$1", f = "Lifecycle.jvm.kt", l = {55}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class LifecycleCoroutineScope$launchWhenCreated$1 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f19995a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LifecycleCoroutineScope f19996b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f19997c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LifecycleCoroutineScope$launchWhenCreated$1(LifecycleCoroutineScope lifecycleCoroutineScope, p pVar, g gVar) {
        super(2, gVar);
        this.f19996b = lifecycleCoroutineScope;
        this.f19997c = pVar;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        return new LifecycleCoroutineScope$launchWhenCreated$1(this.f19996b, this.f19997c, gVar);
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((LifecycleCoroutineScope$launchWhenCreated$1) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        int i2 = this.f19995a;
        if (i2 == 0) {
            q.m(obj);
            Lifecycle a2 = this.f19996b.a();
            this.f19995a = 1;
            if (PausingDispatcherKt.a(a2, Lifecycle.State.f19989c, this.f19997c, this) == aVar) {
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
