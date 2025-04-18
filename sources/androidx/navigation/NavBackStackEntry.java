package androidx.navigation;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.AbstractSavedStateViewModelFactory;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.SavedStateViewModelFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.MutableCreationExtras;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryController;
import androidx.savedstate.SavedStateRegistryOwner;
import b1.f0;
import d0.p;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.UUID;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public final class NavBackStackEntry implements LifecycleOwner, ViewModelStoreOwner, HasDefaultViewModelProviderFactory, SavedStateRegistryOwner {

    /* renamed from: a, reason: collision with root package name */
    public final Context f20327a;

    /* renamed from: b, reason: collision with root package name */
    public NavDestination f20328b;

    /* renamed from: c, reason: collision with root package name */
    public final Bundle f20329c;
    public Lifecycle.State d;

    /* renamed from: f, reason: collision with root package name */
    public final NavViewModelStoreProvider f20330f;

    /* renamed from: g, reason: collision with root package name */
    public final String f20331g;

    /* renamed from: h, reason: collision with root package name */
    public final Bundle f20332h;

    /* renamed from: i, reason: collision with root package name */
    public final LifecycleRegistry f20333i = new LifecycleRegistry(this);

    /* renamed from: j, reason: collision with root package name */
    public final SavedStateRegistryController f20334j = SavedStateRegistryController.Companion.a(this);

    /* renamed from: k, reason: collision with root package name */
    public boolean f20335k;

    /* renamed from: l, reason: collision with root package name */
    public final p f20336l;

    /* renamed from: m, reason: collision with root package name */
    public Lifecycle.State f20337m;

    /* renamed from: n, reason: collision with root package name */
    public final SavedStateViewModelFactory f20338n;

    /* loaded from: classes2.dex */
    public static final class Companion {
        public static NavBackStackEntry a(Context context, NavDestination navDestination, Bundle bundle, Lifecycle.State state, NavControllerViewModel navControllerViewModel) {
            String uuid = UUID.randomUUID().toString();
            p0.a.r(uuid, "randomUUID().toString()");
            p0.a.s(navDestination, "destination");
            p0.a.s(state, "hostLifecycleState");
            return new NavBackStackEntry(context, navDestination, bundle, state, navControllerViewModel, uuid, null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class NavResultSavedStateFactory extends AbstractSavedStateViewModelFactory {
        @Override // androidx.lifecycle.AbstractSavedStateViewModelFactory
        public final ViewModel b(String str, Class cls, SavedStateHandle savedStateHandle) {
            p0.a.s(cls, "modelClass");
            p0.a.s(savedStateHandle, "handle");
            return new SavedStateViewModel(savedStateHandle);
        }
    }

    /* loaded from: classes2.dex */
    public static final class SavedStateViewModel extends ViewModel {

        /* renamed from: b, reason: collision with root package name */
        public final SavedStateHandle f20339b;

        public SavedStateViewModel(@NotNull SavedStateHandle savedStateHandle) {
            p0.a.s(savedStateHandle, "handle");
            this.f20339b = savedStateHandle;
        }
    }

    public NavBackStackEntry(Context context, NavDestination navDestination, Bundle bundle, Lifecycle.State state, NavViewModelStoreProvider navViewModelStoreProvider, String str, Bundle bundle2) {
        this.f20327a = context;
        this.f20328b = navDestination;
        this.f20329c = bundle;
        this.d = state;
        this.f20330f = navViewModelStoreProvider;
        this.f20331g = str;
        this.f20332h = bundle2;
        p t2 = f0.t(new NavBackStackEntry$defaultFactory$2(this));
        this.f20336l = f0.t(new NavBackStackEntry$savedStateHandle$2(this));
        this.f20337m = Lifecycle.State.f19988b;
        this.f20338n = (SavedStateViewModelFactory) t2.getValue();
    }

    public final Bundle a() {
        Bundle bundle = this.f20329c;
        if (bundle == null) {
            return null;
        }
        return new Bundle(bundle);
    }

    public final SavedStateHandle b() {
        return (SavedStateHandle) this.f20336l.getValue();
    }

    public final void c(Lifecycle.State state) {
        p0.a.s(state, "maxState");
        this.f20337m = state;
        d();
    }

    public final void d() {
        if (!this.f20335k) {
            SavedStateRegistryController savedStateRegistryController = this.f20334j;
            savedStateRegistryController.a();
            this.f20335k = true;
            if (this.f20330f != null) {
                SavedStateHandleSupport.b(this);
            }
            savedStateRegistryController.b(this.f20332h);
        }
        int ordinal = this.d.ordinal();
        int ordinal2 = this.f20337m.ordinal();
        LifecycleRegistry lifecycleRegistry = this.f20333i;
        if (ordinal < ordinal2) {
            lifecycleRegistry.i(this.d);
        } else {
            lifecycleRegistry.i(this.f20337m);
        }
    }

    public final boolean equals(Object obj) {
        Set<String> keySet;
        if (obj == null || !(obj instanceof NavBackStackEntry)) {
            return false;
        }
        NavBackStackEntry navBackStackEntry = (NavBackStackEntry) obj;
        if (!p0.a.g(this.f20331g, navBackStackEntry.f20331g) || !p0.a.g(this.f20328b, navBackStackEntry.f20328b) || !p0.a.g(this.f20333i, navBackStackEntry.f20333i) || !p0.a.g(this.f20334j.f21437b, navBackStackEntry.f20334j.f21437b)) {
            return false;
        }
        Bundle bundle = this.f20329c;
        Bundle bundle2 = navBackStackEntry.f20329c;
        if (!p0.a.g(bundle, bundle2)) {
            if (bundle == null || (keySet = bundle.keySet()) == null) {
                return false;
            }
            Set<String> set = keySet;
            if (!(set instanceof Collection) || !set.isEmpty()) {
                for (String str : set) {
                    if (!p0.a.g(bundle.get(str), bundle2 != null ? bundle2.get(str) : null)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final CreationExtras getDefaultViewModelCreationExtras() {
        MutableCreationExtras mutableCreationExtras = new MutableCreationExtras(0);
        Context context = this.f20327a;
        Object applicationContext = context != null ? context.getApplicationContext() : null;
        Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
        LinkedHashMap linkedHashMap = mutableCreationExtras.f20235a;
        if (application != null) {
            linkedHashMap.put(ViewModelProvider.AndroidViewModelFactory.d, application);
        }
        linkedHashMap.put(SavedStateHandleSupport.f20098a, this);
        linkedHashMap.put(SavedStateHandleSupport.f20099b, this);
        Bundle a2 = a();
        if (a2 != null) {
            linkedHashMap.put(SavedStateHandleSupport.f20100c, a2);
        }
        return mutableCreationExtras;
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return this.f20338n;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.f20333i;
    }

    @Override // androidx.savedstate.SavedStateRegistryOwner
    public final SavedStateRegistry getSavedStateRegistry() {
        return this.f20334j.f21437b;
    }

    @Override // androidx.lifecycle.ViewModelStoreOwner
    public final ViewModelStore getViewModelStore() {
        if (!this.f20335k) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).".toString());
        }
        if (this.f20333i.d == Lifecycle.State.f19987a) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels after the NavBackStackEntry is destroyed.".toString());
        }
        NavViewModelStoreProvider navViewModelStoreProvider = this.f20330f;
        if (navViewModelStoreProvider != null) {
            return navViewModelStoreProvider.a(this.f20331g);
        }
        throw new IllegalStateException("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.".toString());
    }

    public final int hashCode() {
        Set<String> keySet;
        int hashCode = this.f20328b.hashCode() + (this.f20331g.hashCode() * 31);
        Bundle bundle = this.f20329c;
        if (bundle != null && (keySet = bundle.keySet()) != null) {
            Iterator<T> it = keySet.iterator();
            while (it.hasNext()) {
                int i2 = hashCode * 31;
                Object obj = bundle.get((String) it.next());
                hashCode = i2 + (obj != null ? obj.hashCode() : 0);
            }
        }
        return this.f20334j.f21437b.hashCode() + ((this.f20333i.hashCode() + (hashCode * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NavBackStackEntry");
        sb.append("(" + this.f20331g + ')');
        sb.append(" destination=");
        sb.append(this.f20328b);
        String sb2 = sb.toString();
        p0.a.r(sb2, "sb.toString()");
        return sb2;
    }
}
