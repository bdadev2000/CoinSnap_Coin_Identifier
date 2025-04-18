package org.koin.androidx.compose;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.context.GlobalContext;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;
import p0.a;

/* loaded from: classes.dex */
public final class ViewModelInternalsKt {
    @Composable
    @NotNull
    public static final CreationExtras defaultExtras(@NotNull ViewModelStoreOwner viewModelStoreOwner, @Nullable Composer composer, int i2) {
        a.s(viewModelStoreOwner, "viewModelStoreOwner");
        composer.t(19932612);
        CreationExtras defaultViewModelCreationExtras = viewModelStoreOwner instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) viewModelStoreOwner).getDefaultViewModelCreationExtras() : CreationExtras.Empty.f20236b;
        composer.H();
        return defaultViewModelCreationExtras;
    }

    @Composable
    @d0.a
    public static final <T extends ViewModel> T getStateViewModel(Qualifier qualifier, ViewModelStoreOwner viewModelStoreOwner, Scope scope, q0.a aVar, q0.a aVar2, Composer composer, int i2, int i3) {
        a.s(aVar, "state");
        composer.t(-524436839);
        if ((i3 & 2) != 0 && LocalViewModelStoreOwner.a(composer) == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        if ((i3 & 4) != 0) {
            GlobalContext.INSTANCE.get().getScopeRegistry().getRootScope();
        }
        a.A0();
        throw null;
    }

    @Composable
    @d0.a
    public static final /* synthetic */ <T extends ViewModel> ViewModelLazy<T> viewModel(Qualifier qualifier, ViewModelStoreOwner viewModelStoreOwner, Scope scope, q0.a aVar, Composer composer, int i2, int i3) {
        composer.t(1205041158);
        if ((i3 & 2) != 0 && LocalViewModelStoreOwner.a(composer) == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        if ((i3 & 4) != 0) {
            GlobalContext.INSTANCE.get().getScopeRegistry().getRootScope();
        }
        throw new IllegalStateException("ViewModelLazy API is not supported by Jetpack Compose 1.1+".toString());
    }
}
