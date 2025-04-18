package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.SavedStateHandle;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryOwner;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* loaded from: classes2.dex */
public final class LegacySavedStateHandleController {

    /* loaded from: classes2.dex */
    public static final class OnRecreation implements SavedStateRegistry.AutoRecreated {
        @Override // androidx.savedstate.SavedStateRegistry.AutoRecreated
        public final void a(SavedStateRegistryOwner savedStateRegistryOwner) {
            p0.a.s(savedStateRegistryOwner, "owner");
            if (!(savedStateRegistryOwner instanceof ViewModelStoreOwner)) {
                throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner".toString());
            }
            ViewModelStore viewModelStore = ((ViewModelStoreOwner) savedStateRegistryOwner).getViewModelStore();
            SavedStateRegistry savedStateRegistry = savedStateRegistryOwner.getSavedStateRegistry();
            viewModelStore.getClass();
            LinkedHashMap linkedHashMap = viewModelStore.f20129a;
            Iterator it = new HashSet(linkedHashMap.keySet()).iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                p0.a.s(str, SDKConstants.PARAM_KEY);
                ViewModel viewModel = (ViewModel) linkedHashMap.get(str);
                p0.a.p(viewModel);
                LegacySavedStateHandleController.a(viewModel, savedStateRegistry, savedStateRegistryOwner.getLifecycle());
            }
            if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
                savedStateRegistry.d();
            }
        }
    }

    public static final void a(ViewModel viewModel, SavedStateRegistry savedStateRegistry, Lifecycle lifecycle) {
        p0.a.s(savedStateRegistry, "registry");
        p0.a.s(lifecycle, "lifecycle");
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) viewModel.getCloseable("androidx.lifecycle.savedstate.vm.tag");
        if (savedStateHandleController == null || savedStateHandleController.f20097c) {
            return;
        }
        savedStateHandleController.a(lifecycle, savedStateRegistry);
        c(lifecycle, savedStateRegistry);
    }

    public static final SavedStateHandleController b(SavedStateRegistry savedStateRegistry, Lifecycle lifecycle, String str, Bundle bundle) {
        Bundle a2 = savedStateRegistry.a(str);
        Class[] clsArr = SavedStateHandle.f20090f;
        SavedStateHandleController savedStateHandleController = new SavedStateHandleController(str, SavedStateHandle.Companion.a(a2, bundle));
        savedStateHandleController.a(lifecycle, savedStateRegistry);
        c(lifecycle, savedStateRegistry);
        return savedStateHandleController;
    }

    public static void c(final Lifecycle lifecycle, final SavedStateRegistry savedStateRegistry) {
        Lifecycle.State b2 = lifecycle.b();
        if (b2 == Lifecycle.State.f19988b || b2.compareTo(Lifecycle.State.d) >= 0) {
            savedStateRegistry.d();
        } else {
            lifecycle.a(new LifecycleEventObserver() { // from class: androidx.lifecycle.LegacySavedStateHandleController$tryToAddRecreator$1
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void c(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    if (event == Lifecycle.Event.ON_START) {
                        Lifecycle.this.d(this);
                        savedStateRegistry.d();
                    }
                }
            });
        }
    }
}
