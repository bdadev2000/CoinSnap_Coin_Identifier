package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;

/* loaded from: classes3.dex */
public final class SavedStateHandleAttacher implements LifecycleEventObserver {

    /* renamed from: a, reason: collision with root package name */
    public final SavedStateHandlesProvider f20094a;

    public SavedStateHandleAttacher(SavedStateHandlesProvider savedStateHandlesProvider) {
        this.f20094a = savedStateHandlesProvider;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void c(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_CREATE) {
            lifecycleOwner.getLifecycle().d(this);
            this.f20094a.b();
        } else {
            throw new IllegalStateException(("Next event must be ON_CREATE, it was " + event).toString());
        }
    }
}
