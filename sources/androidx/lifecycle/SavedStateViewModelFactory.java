package androidx.lifecycle;

import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.internal.ViewModelProviders;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryOwner;
import java.lang.reflect.Constructor;

/* loaded from: classes4.dex */
public final class SavedStateViewModelFactory extends ViewModelProvider.OnRequeryFactory implements ViewModelProvider.Factory {

    /* renamed from: a, reason: collision with root package name */
    public final Application f20106a;

    /* renamed from: b, reason: collision with root package name */
    public final ViewModelProvider.AndroidViewModelFactory f20107b;

    /* renamed from: c, reason: collision with root package name */
    public final Bundle f20108c;
    public final Lifecycle d;
    public final SavedStateRegistry e;

    public SavedStateViewModelFactory(Application application, SavedStateRegistryOwner savedStateRegistryOwner, Bundle bundle) {
        ViewModelProvider.AndroidViewModelFactory androidViewModelFactory;
        p0.a.s(savedStateRegistryOwner, "owner");
        this.e = savedStateRegistryOwner.getSavedStateRegistry();
        this.d = savedStateRegistryOwner.getLifecycle();
        this.f20108c = bundle;
        this.f20106a = application;
        if (application != null) {
            if (ViewModelProvider.AndroidViewModelFactory.f20126c == null) {
                ViewModelProvider.AndroidViewModelFactory.f20126c = new ViewModelProvider.AndroidViewModelFactory(application);
            }
            androidViewModelFactory = ViewModelProvider.AndroidViewModelFactory.f20126c;
            p0.a.p(androidViewModelFactory);
        } else {
            androidViewModelFactory = new ViewModelProvider.AndroidViewModelFactory(null);
        }
        this.f20107b = androidViewModelFactory;
    }

    @Override // androidx.lifecycle.ViewModelProvider.OnRequeryFactory
    public final void a(ViewModel viewModel) {
        Lifecycle lifecycle = this.d;
        if (lifecycle != null) {
            SavedStateRegistry savedStateRegistry = this.e;
            p0.a.p(savedStateRegistry);
            LegacySavedStateHandleController.a(viewModel, savedStateRegistry, lifecycle);
        }
    }

    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object, androidx.lifecycle.ViewModelProvider$NewInstanceFactory] */
    public final ViewModel b(Class cls, String str) {
        p0.a.s(cls, "modelClass");
        Lifecycle lifecycle = this.d;
        if (lifecycle == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean isAssignableFrom = AndroidViewModel.class.isAssignableFrom(cls);
        Application application = this.f20106a;
        Constructor a2 = (!isAssignableFrom || application == null) ? SavedStateViewModelFactoryKt.a(SavedStateViewModelFactoryKt.f20110b, cls) : SavedStateViewModelFactoryKt.a(SavedStateViewModelFactoryKt.f20109a, cls);
        if (a2 == null) {
            if (application != null) {
                return this.f20107b.create(cls);
            }
            if (ViewModelProvider.NewInstanceFactory.f20128a == null) {
                ViewModelProvider.NewInstanceFactory.f20128a = new Object();
            }
            ViewModelProvider.NewInstanceFactory newInstanceFactory = ViewModelProvider.NewInstanceFactory.f20128a;
            p0.a.p(newInstanceFactory);
            return newInstanceFactory.create(cls);
        }
        SavedStateRegistry savedStateRegistry = this.e;
        p0.a.p(savedStateRegistry);
        SavedStateHandleController b2 = LegacySavedStateHandleController.b(savedStateRegistry, lifecycle, str, this.f20108c);
        SavedStateHandle savedStateHandle = b2.f20096b;
        ViewModel b3 = (!isAssignableFrom || application == null) ? SavedStateViewModelFactoryKt.b(cls, a2, savedStateHandle) : SavedStateViewModelFactoryKt.b(cls, a2, application, savedStateHandle);
        b3.addCloseable("androidx.lifecycle.savedstate.vm.tag", b2);
        return b3;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final ViewModel create(Class cls, CreationExtras creationExtras) {
        Constructor a2;
        p0.a.s(cls, "modelClass");
        p0.a.s(creationExtras, "extras");
        String str = (String) creationExtras.a(ViewModelProviders.ViewModelKey.f20247a);
        if (str != null) {
            if (creationExtras.a(SavedStateHandleSupport.f20098a) == null || creationExtras.a(SavedStateHandleSupport.f20099b) == null) {
                if (this.d != null) {
                    return b(cls, str);
                }
                throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
            }
            Application application = (Application) creationExtras.a(ViewModelProvider.AndroidViewModelFactory.d);
            boolean isAssignableFrom = AndroidViewModel.class.isAssignableFrom(cls);
            if (isAssignableFrom && application != null) {
                a2 = SavedStateViewModelFactoryKt.a(SavedStateViewModelFactoryKt.f20109a, cls);
            } else {
                a2 = SavedStateViewModelFactoryKt.a(SavedStateViewModelFactoryKt.f20110b, cls);
            }
            if (a2 == null) {
                return this.f20107b.create(cls, creationExtras);
            }
            if (isAssignableFrom && application != null) {
                return SavedStateViewModelFactoryKt.b(cls, a2, application, SavedStateHandleSupport.a(creationExtras));
            }
            return SavedStateViewModelFactoryKt.b(cls, a2, SavedStateHandleSupport.a(creationExtras));
        }
        throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final ViewModel create(Class cls) {
        p0.a.s(cls, "modelClass");
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return b(cls, canonicalName);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }
}
