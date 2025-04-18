package androidx.fragment.app;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.SavedStateViewModelFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.MutableCreationExtras;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryController;
import androidx.savedstate.SavedStateRegistryOwner;
import java.util.LinkedHashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class FragmentViewLifecycleOwner implements HasDefaultViewModelProviderFactory, SavedStateRegistryOwner, ViewModelStoreOwner {

    /* renamed from: a, reason: collision with root package name */
    public final Fragment f19844a;

    /* renamed from: b, reason: collision with root package name */
    public final ViewModelStore f19845b;

    /* renamed from: c, reason: collision with root package name */
    public final Runnable f19846c;
    public ViewModelProvider.Factory d;

    /* renamed from: f, reason: collision with root package name */
    public LifecycleRegistry f19847f = null;

    /* renamed from: g, reason: collision with root package name */
    public SavedStateRegistryController f19848g = null;

    public FragmentViewLifecycleOwner(Fragment fragment, ViewModelStore viewModelStore, androidx.compose.material.ripple.a aVar) {
        this.f19844a = fragment;
        this.f19845b = viewModelStore;
        this.f19846c = aVar;
    }

    public final void a(Lifecycle.Event event) {
        this.f19847f.g(event);
    }

    public final void b() {
        if (this.f19847f == null) {
            this.f19847f = new LifecycleRegistry(this);
            SavedStateRegistryController a2 = SavedStateRegistryController.Companion.a(this);
            this.f19848g = a2;
            a2.a();
            this.f19846c.run();
        }
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final CreationExtras getDefaultViewModelCreationExtras() {
        Application application;
        Fragment fragment = this.f19844a;
        Context applicationContext = fragment.requireContext().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        MutableCreationExtras mutableCreationExtras = new MutableCreationExtras(0);
        LinkedHashMap linkedHashMap = mutableCreationExtras.f20235a;
        if (application != null) {
            linkedHashMap.put(ViewModelProvider.AndroidViewModelFactory.d, application);
        }
        linkedHashMap.put(SavedStateHandleSupport.f20098a, fragment);
        linkedHashMap.put(SavedStateHandleSupport.f20099b, this);
        if (fragment.getArguments() != null) {
            linkedHashMap.put(SavedStateHandleSupport.f20100c, fragment.getArguments());
        }
        return mutableCreationExtras;
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        Application application;
        Fragment fragment = this.f19844a;
        ViewModelProvider.Factory defaultViewModelProviderFactory = fragment.getDefaultViewModelProviderFactory();
        if (!defaultViewModelProviderFactory.equals(fragment.mDefaultFactory)) {
            this.d = defaultViewModelProviderFactory;
            return defaultViewModelProviderFactory;
        }
        if (this.d == null) {
            Context applicationContext = fragment.requireContext().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            this.d = new SavedStateViewModelFactory(application, fragment, fragment.getArguments());
        }
        return this.d;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        b();
        return this.f19847f;
    }

    @Override // androidx.savedstate.SavedStateRegistryOwner
    public final SavedStateRegistry getSavedStateRegistry() {
        b();
        return this.f19848g.f21437b;
    }

    @Override // androidx.lifecycle.ViewModelStoreOwner
    public final ViewModelStore getViewModelStore() {
        b();
        return this.f19845b;
    }
}
