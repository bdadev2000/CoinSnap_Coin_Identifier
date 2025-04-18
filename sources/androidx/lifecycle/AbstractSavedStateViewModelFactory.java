package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.internal.ViewModelProviders;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryOwner;

/* loaded from: classes4.dex */
public abstract class AbstractSavedStateViewModelFactory extends ViewModelProvider.OnRequeryFactory implements ViewModelProvider.Factory {

    /* renamed from: a, reason: collision with root package name */
    public final SavedStateRegistry f19929a;

    /* renamed from: b, reason: collision with root package name */
    public final Lifecycle f19930b;

    /* renamed from: c, reason: collision with root package name */
    public final Bundle f19931c;

    public AbstractSavedStateViewModelFactory(SavedStateRegistryOwner savedStateRegistryOwner, Bundle bundle) {
        this.f19929a = savedStateRegistryOwner.getSavedStateRegistry();
        this.f19930b = savedStateRegistryOwner.getLifecycle();
        this.f19931c = bundle;
    }

    @Override // androidx.lifecycle.ViewModelProvider.OnRequeryFactory
    public final void a(ViewModel viewModel) {
        SavedStateRegistry savedStateRegistry = this.f19929a;
        if (savedStateRegistry != null) {
            Lifecycle lifecycle = this.f19930b;
            p0.a.p(lifecycle);
            LegacySavedStateHandleController.a(viewModel, savedStateRegistry, lifecycle);
        }
    }

    public abstract ViewModel b(String str, Class cls, SavedStateHandle savedStateHandle);

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final ViewModel create(Class cls, CreationExtras creationExtras) {
        p0.a.s(cls, "modelClass");
        p0.a.s(creationExtras, "extras");
        String str = (String) creationExtras.a(ViewModelProviders.ViewModelKey.f20247a);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        SavedStateRegistry savedStateRegistry = this.f19929a;
        if (savedStateRegistry != null) {
            p0.a.p(savedStateRegistry);
            Lifecycle lifecycle = this.f19930b;
            p0.a.p(lifecycle);
            SavedStateHandleController b2 = LegacySavedStateHandleController.b(savedStateRegistry, lifecycle, str, this.f19931c);
            ViewModel b3 = b(str, cls, b2.f20096b);
            b3.addCloseable("androidx.lifecycle.savedstate.vm.tag", b2);
            return b3;
        }
        return b(str, cls, SavedStateHandleSupport.a(creationExtras));
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final ViewModel create(Class cls) {
        p0.a.s(cls, "modelClass");
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        if (this.f19930b != null) {
            SavedStateRegistry savedStateRegistry = this.f19929a;
            p0.a.p(savedStateRegistry);
            Lifecycle lifecycle = this.f19930b;
            p0.a.p(lifecycle);
            SavedStateHandleController b2 = LegacySavedStateHandleController.b(savedStateRegistry, lifecycle, canonicalName, this.f19931c);
            ViewModel b3 = b(canonicalName, cls, b2.f20096b);
            b3.addCloseable("androidx.lifecycle.savedstate.vm.tag", b2);
            return b3;
        }
        throw new UnsupportedOperationException("AbstractSavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
    }
}
