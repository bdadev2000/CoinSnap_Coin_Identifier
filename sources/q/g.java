package q;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;

/* loaded from: classes.dex */
public final class g extends Lifecycle {

    /* renamed from: b, reason: collision with root package name */
    public static final g f31267b = new Lifecycle();

    /* renamed from: c, reason: collision with root package name */
    public static final f f31268c = new Object();

    @Override // androidx.lifecycle.Lifecycle
    public final void a(LifecycleObserver lifecycleObserver) {
        if (!(lifecycleObserver instanceof DefaultLifecycleObserver)) {
            throw new IllegalArgumentException((lifecycleObserver + " must implement androidx.lifecycle.DefaultLifecycleObserver.").toString());
        }
        DefaultLifecycleObserver defaultLifecycleObserver = (DefaultLifecycleObserver) lifecycleObserver;
        f fVar = f31268c;
        defaultLifecycleObserver.onCreate(fVar);
        defaultLifecycleObserver.onStart(fVar);
        defaultLifecycleObserver.onResume(fVar);
    }

    @Override // androidx.lifecycle.Lifecycle
    public final Lifecycle.State b() {
        return Lifecycle.State.f19990f;
    }

    @Override // androidx.lifecycle.Lifecycle
    public final void d(LifecycleObserver lifecycleObserver) {
    }

    public final String toString() {
        return "coil.request.GlobalLifecycle";
    }
}
