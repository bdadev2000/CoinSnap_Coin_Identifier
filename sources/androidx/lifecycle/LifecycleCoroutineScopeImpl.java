package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import h0.l;
import kotlin.jvm.internal.e;

/* loaded from: classes2.dex */
public final class LifecycleCoroutineScopeImpl extends LifecycleCoroutineScope implements LifecycleEventObserver {

    /* renamed from: a, reason: collision with root package name */
    public final Lifecycle f20004a;

    /* renamed from: b, reason: collision with root package name */
    public final l f20005b;

    public LifecycleCoroutineScopeImpl(Lifecycle lifecycle, l lVar) {
        p0.a.s(lifecycle, "lifecycle");
        p0.a.s(lVar, "coroutineContext");
        this.f20004a = lifecycle;
        this.f20005b = lVar;
        if (lifecycle.b() == Lifecycle.State.f19987a) {
            e.h(lVar, null);
        }
    }

    @Override // androidx.lifecycle.LifecycleCoroutineScope
    public final Lifecycle a() {
        return this.f20004a;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void c(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        Lifecycle lifecycle = this.f20004a;
        if (lifecycle.b().compareTo(Lifecycle.State.f19987a) <= 0) {
            lifecycle.d(this);
            e.h(this.f20005b, null);
        }
    }

    @Override // b1.d0
    public final l getCoroutineContext() {
        return this.f20005b;
    }
}
