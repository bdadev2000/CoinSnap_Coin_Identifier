package org.koin.androidx.compose;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import d0.a;
import org.koin.compose.KoinApplicationKt;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;

/* loaded from: classes3.dex */
public final class ViewModelKt {
    @Composable
    @a
    public static final <T extends ViewModel> T getViewModel(Qualifier qualifier, ViewModelStoreOwner viewModelStoreOwner, String str, CreationExtras creationExtras, Scope scope, q0.a aVar, Composer composer, int i2, int i3) {
        composer.t(667488325);
        if ((i3 & 2) != 0 && (viewModelStoreOwner = LocalViewModelStoreOwner.a(composer)) == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        if ((i3 & 8) != 0) {
            ViewModelInternalsKt.defaultExtras(viewModelStoreOwner, composer, 8);
        }
        if ((i3 & 16) != 0) {
            KoinApplicationKt.rememberCurrentKoinScope(composer, 0);
        }
        composer.t(-1614864554);
        p0.a.A0();
        throw null;
    }

    @Composable
    public static final <T extends ViewModel> T koinViewModel(Qualifier qualifier, ViewModelStoreOwner viewModelStoreOwner, String str, CreationExtras creationExtras, Scope scope, q0.a aVar, Composer composer, int i2, int i3) {
        composer.t(-1614864554);
        if ((i3 & 2) != 0 && (viewModelStoreOwner = LocalViewModelStoreOwner.a(composer)) == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        if ((i3 & 8) != 0) {
            ViewModelInternalsKt.defaultExtras(viewModelStoreOwner, composer, 8);
        }
        if ((i3 & 16) != 0) {
            KoinApplicationKt.currentKoinScope(composer, 0);
        }
        p0.a.A0();
        throw null;
    }
}
