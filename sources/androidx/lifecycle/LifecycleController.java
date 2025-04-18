package androidx.lifecycle;

import androidx.annotation.MainThread;
import androidx.lifecycle.Lifecycle;
import b1.h1;

@MainThread
/* loaded from: classes.dex */
public final class LifecycleController {

    /* renamed from: a, reason: collision with root package name */
    public final Lifecycle f19992a;

    /* renamed from: b, reason: collision with root package name */
    public final Lifecycle.State f19993b;

    /* renamed from: c, reason: collision with root package name */
    public final DispatchQueue f19994c;
    public final androidx.core.view.c d;

    public LifecycleController(Lifecycle lifecycle, Lifecycle.State state, DispatchQueue dispatchQueue, h1 h1Var) {
        p0.a.s(lifecycle, "lifecycle");
        p0.a.s(state, "minState");
        p0.a.s(dispatchQueue, "dispatchQueue");
        this.f19992a = lifecycle;
        this.f19993b = state;
        this.f19994c = dispatchQueue;
        androidx.core.view.c cVar = new androidx.core.view.c(1, this, h1Var);
        this.d = cVar;
        if (lifecycle.b() != Lifecycle.State.f19987a) {
            lifecycle.a(cVar);
        } else {
            h1Var.a(null);
            a();
        }
    }

    public final void a() {
        this.f19992a.d(this.d);
        DispatchQueue dispatchQueue = this.f19994c;
        dispatchQueue.f19958b = true;
        dispatchQueue.a();
    }
}
