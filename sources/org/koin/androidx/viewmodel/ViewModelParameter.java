package org.koin.androidx.viewmodel;

import androidx.lifecycle.ViewModelStoreOwner;
import androidx.savedstate.SavedStateRegistryOwner;
import d0.a;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.annotation.KoinInternalApi;
import org.koin.core.qualifier.Qualifier;
import x0.c;

@a
@KoinInternalApi
/* loaded from: classes3.dex */
public final class ViewModelParameter<T> {

    @NotNull
    private final c clazz;

    @Nullable
    private final q0.a parameters;

    @Nullable
    private final Qualifier qualifier;

    @Nullable
    private final SavedStateRegistryOwner registryOwner;

    @Nullable
    private final q0.a state;

    @NotNull
    private final ViewModelStoreOwner viewModelStoreOwner;

    public ViewModelParameter(@NotNull c cVar, @Nullable Qualifier qualifier, @Nullable q0.a aVar, @Nullable q0.a aVar2, @NotNull ViewModelStoreOwner viewModelStoreOwner, @Nullable SavedStateRegistryOwner savedStateRegistryOwner) {
        p0.a.s(cVar, "clazz");
        p0.a.s(viewModelStoreOwner, "viewModelStoreOwner");
        this.clazz = cVar;
        this.qualifier = qualifier;
        this.state = aVar;
        this.parameters = aVar2;
        this.viewModelStoreOwner = viewModelStoreOwner;
        this.registryOwner = savedStateRegistryOwner;
    }

    @NotNull
    public final c getClazz() {
        return this.clazz;
    }

    @Nullable
    public final q0.a getParameters() {
        return this.parameters;
    }

    @Nullable
    public final Qualifier getQualifier() {
        return this.qualifier;
    }

    @Nullable
    public final SavedStateRegistryOwner getRegistryOwner() {
        return this.registryOwner;
    }

    @Nullable
    public final q0.a getState() {
        return this.state;
    }

    @NotNull
    public final ViewModelStoreOwner getViewModelStoreOwner() {
        return this.viewModelStoreOwner;
    }

    public /* synthetic */ ViewModelParameter(c cVar, Qualifier qualifier, q0.a aVar, q0.a aVar2, ViewModelStoreOwner viewModelStoreOwner, SavedStateRegistryOwner savedStateRegistryOwner, int i2, k kVar) {
        this(cVar, (i2 & 2) != 0 ? null : qualifier, (i2 & 4) != 0 ? null : aVar, (i2 & 8) != 0 ? null : aVar2, viewModelStoreOwner, (i2 & 32) != 0 ? null : savedStateRegistryOwner);
    }
}
