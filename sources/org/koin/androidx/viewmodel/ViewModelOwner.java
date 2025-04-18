package org.koin.androidx.viewmodel;

import androidx.lifecycle.ViewModelStoreOwner;
import androidx.savedstate.SavedStateRegistryOwner;
import d0.a;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@a
/* loaded from: classes3.dex */
public final class ViewModelOwner {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @Nullable
    private final SavedStateRegistryOwner stateRegistry;

    @NotNull
    private final ViewModelStoreOwner storeOwner;

    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public static /* synthetic */ ViewModelOwner from$default(Companion companion, ViewModelStoreOwner viewModelStoreOwner, SavedStateRegistryOwner savedStateRegistryOwner, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                savedStateRegistryOwner = null;
            }
            return companion.from(viewModelStoreOwner, savedStateRegistryOwner);
        }

        @a
        @NotNull
        public final ViewModelOwner from(@NotNull ViewModelStoreOwner viewModelStoreOwner, @Nullable SavedStateRegistryOwner savedStateRegistryOwner) {
            p0.a.s(viewModelStoreOwner, "storeOwner");
            return new ViewModelOwner(viewModelStoreOwner, savedStateRegistryOwner);
        }

        @a
        @NotNull
        public final ViewModelOwner fromAny(@NotNull Object obj) {
            p0.a.s(obj, "owner");
            return new ViewModelOwner((ViewModelStoreOwner) obj, obj instanceof SavedStateRegistryOwner ? (SavedStateRegistryOwner) obj : null);
        }

        @a
        @NotNull
        public final ViewModelOwner from(@NotNull ViewModelStoreOwner viewModelStoreOwner) {
            p0.a.s(viewModelStoreOwner, "storeOwner");
            return new ViewModelOwner(viewModelStoreOwner, null, 2, 0 == true ? 1 : 0);
        }
    }

    public ViewModelOwner(@NotNull ViewModelStoreOwner viewModelStoreOwner, @Nullable SavedStateRegistryOwner savedStateRegistryOwner) {
        p0.a.s(viewModelStoreOwner, "storeOwner");
        this.storeOwner = viewModelStoreOwner;
        this.stateRegistry = savedStateRegistryOwner;
    }

    @Nullable
    public final SavedStateRegistryOwner getStateRegistry() {
        return this.stateRegistry;
    }

    @NotNull
    public final ViewModelStoreOwner getStoreOwner() {
        return this.storeOwner;
    }

    public /* synthetic */ ViewModelOwner(ViewModelStoreOwner viewModelStoreOwner, SavedStateRegistryOwner savedStateRegistryOwner, int i2, k kVar) {
        this(viewModelStoreOwner, (i2 & 2) != 0 ? null : savedStateRegistryOwner);
    }
}
