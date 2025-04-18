package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.internal.ViewModelProviders;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryOwner;

/* loaded from: classes.dex */
public final class SavedStateHandleSupport {

    /* renamed from: a, reason: collision with root package name */
    public static final SavedStateHandleSupport$SAVED_STATE_REGISTRY_OWNER_KEY$1 f20098a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final SavedStateHandleSupport$VIEW_MODEL_STORE_OWNER_KEY$1 f20099b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static final SavedStateHandleSupport$DEFAULT_ARGS_KEY$1 f20100c = new Object();

    /* JADX WARN: Type inference failed for: r5v0, types: [androidx.lifecycle.ViewModelProvider$Factory, java.lang.Object] */
    public static final SavedStateHandle a(CreationExtras creationExtras) {
        p0.a.s(creationExtras, "<this>");
        SavedStateRegistryOwner savedStateRegistryOwner = (SavedStateRegistryOwner) creationExtras.a(f20098a);
        if (savedStateRegistryOwner == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) creationExtras.a(f20099b);
        if (viewModelStoreOwner == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        Bundle bundle = (Bundle) creationExtras.a(f20100c);
        String str = (String) creationExtras.a(ViewModelProviders.ViewModelKey.f20247a);
        if (str == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
        }
        SavedStateRegistry.SavedStateProvider b2 = savedStateRegistryOwner.getSavedStateRegistry().b();
        SavedStateHandlesProvider savedStateHandlesProvider = b2 instanceof SavedStateHandlesProvider ? (SavedStateHandlesProvider) b2 : null;
        if (savedStateHandlesProvider == null) {
            throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
        }
        SavedStateHandlesVM savedStateHandlesVM = (SavedStateHandlesVM) new ViewModelProvider(viewModelStoreOwner, (ViewModelProvider.Factory) new Object()).b(SavedStateHandlesVM.class, "androidx.lifecycle.internal.SavedStateHandlesVM");
        SavedStateHandle savedStateHandle = (SavedStateHandle) savedStateHandlesVM.f20105b.get(str);
        if (savedStateHandle != null) {
            return savedStateHandle;
        }
        Class[] clsArr = SavedStateHandle.f20090f;
        savedStateHandlesProvider.b();
        Bundle bundle2 = savedStateHandlesProvider.f20103c;
        Bundle bundle3 = bundle2 != null ? bundle2.getBundle(str) : null;
        Bundle bundle4 = savedStateHandlesProvider.f20103c;
        if (bundle4 != null) {
            bundle4.remove(str);
        }
        Bundle bundle5 = savedStateHandlesProvider.f20103c;
        if (bundle5 != null && bundle5.isEmpty()) {
            savedStateHandlesProvider.f20103c = null;
        }
        SavedStateHandle a2 = SavedStateHandle.Companion.a(bundle3, bundle);
        savedStateHandlesVM.f20105b.put(str, a2);
        return a2;
    }

    public static final void b(SavedStateRegistryOwner savedStateRegistryOwner) {
        p0.a.s(savedStateRegistryOwner, "<this>");
        Lifecycle.State b2 = savedStateRegistryOwner.getLifecycle().b();
        if (b2 != Lifecycle.State.f19988b && b2 != Lifecycle.State.f19989c) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (savedStateRegistryOwner.getSavedStateRegistry().b() == null) {
            SavedStateHandlesProvider savedStateHandlesProvider = new SavedStateHandlesProvider(savedStateRegistryOwner.getSavedStateRegistry(), (ViewModelStoreOwner) savedStateRegistryOwner);
            savedStateRegistryOwner.getSavedStateRegistry().c("androidx.lifecycle.internal.SavedStateHandlesProvider", savedStateHandlesProvider);
            savedStateRegistryOwner.getLifecycle().a(new SavedStateHandleAttacher(savedStateHandlesProvider));
        }
    }
}
