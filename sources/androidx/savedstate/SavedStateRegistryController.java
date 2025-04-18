package androidx.savedstate;

import android.os.Bundle;
import androidx.arch.core.internal.SafeIterableMap;
import androidx.lifecycle.Lifecycle;
import androidx.savedstate.SavedStateRegistry;
import java.util.Map;
import p0.a;

/* loaded from: classes.dex */
public final class SavedStateRegistryController {

    /* renamed from: a, reason: collision with root package name */
    public final SavedStateRegistryOwner f21436a;

    /* renamed from: b, reason: collision with root package name */
    public final SavedStateRegistry f21437b = new SavedStateRegistry();

    /* renamed from: c, reason: collision with root package name */
    public boolean f21438c;

    /* loaded from: classes.dex */
    public static final class Companion {
        public static SavedStateRegistryController a(SavedStateRegistryOwner savedStateRegistryOwner) {
            a.s(savedStateRegistryOwner, "owner");
            return new SavedStateRegistryController(savedStateRegistryOwner);
        }
    }

    public SavedStateRegistryController(SavedStateRegistryOwner savedStateRegistryOwner) {
        this.f21436a = savedStateRegistryOwner;
    }

    public final void a() {
        SavedStateRegistryOwner savedStateRegistryOwner = this.f21436a;
        Lifecycle lifecycle = savedStateRegistryOwner.getLifecycle();
        if (lifecycle.b() != Lifecycle.State.f19988b) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage".toString());
        }
        lifecycle.a(new Recreator(savedStateRegistryOwner));
        SavedStateRegistry savedStateRegistry = this.f21437b;
        savedStateRegistry.getClass();
        int i2 = 1;
        if (!(!savedStateRegistry.f21433b)) {
            throw new IllegalStateException("SavedStateRegistry was already attached.".toString());
        }
        lifecycle.a(new androidx.navigation.a(savedStateRegistry, i2));
        savedStateRegistry.f21433b = true;
        this.f21438c = true;
    }

    public final void b(Bundle bundle) {
        if (!this.f21438c) {
            a();
        }
        Lifecycle lifecycle = this.f21436a.getLifecycle();
        if (!(!(lifecycle.b().compareTo(Lifecycle.State.d) >= 0))) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + lifecycle.b()).toString());
        }
        SavedStateRegistry savedStateRegistry = this.f21437b;
        if (!savedStateRegistry.f21433b) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).".toString());
        }
        if (!(!savedStateRegistry.d)) {
            throw new IllegalStateException("SavedStateRegistry was already restored.".toString());
        }
        savedStateRegistry.f21434c = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
        savedStateRegistry.d = true;
    }

    public final void c(Bundle bundle) {
        a.s(bundle, "outBundle");
        SavedStateRegistry savedStateRegistry = this.f21437b;
        savedStateRegistry.getClass();
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = savedStateRegistry.f21434c;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        SafeIterableMap safeIterableMap = savedStateRegistry.f21432a;
        safeIterableMap.getClass();
        SafeIterableMap.IteratorWithAdditions iteratorWithAdditions = new SafeIterableMap.IteratorWithAdditions();
        safeIterableMap.f1312c.put(iteratorWithAdditions, Boolean.FALSE);
        while (iteratorWithAdditions.hasNext()) {
            Map.Entry entry = (Map.Entry) iteratorWithAdditions.next();
            bundle2.putBundle((String) entry.getKey(), ((SavedStateRegistry.SavedStateProvider) entry.getValue()).a());
        }
        if (bundle2.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }
}
