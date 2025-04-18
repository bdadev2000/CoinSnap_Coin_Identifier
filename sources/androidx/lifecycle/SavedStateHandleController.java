package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import androidx.savedstate.SavedStateRegistry;
import java.io.Closeable;

/* loaded from: classes2.dex */
public final class SavedStateHandleController implements LifecycleEventObserver, Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final String f20095a;

    /* renamed from: b, reason: collision with root package name */
    public final SavedStateHandle f20096b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f20097c;

    public SavedStateHandleController(String str, SavedStateHandle savedStateHandle) {
        this.f20095a = str;
        this.f20096b = savedStateHandle;
    }

    public final void a(Lifecycle lifecycle, SavedStateRegistry savedStateRegistry) {
        p0.a.s(savedStateRegistry, "registry");
        p0.a.s(lifecycle, "lifecycle");
        if (!(!this.f20097c)) {
            throw new IllegalStateException("Already attached to lifecycleOwner".toString());
        }
        this.f20097c = true;
        lifecycle.a(this);
        savedStateRegistry.c(this.f20095a, this.f20096b.e);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void c(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            this.f20097c = false;
            lifecycleOwner.getLifecycle().d(this);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
