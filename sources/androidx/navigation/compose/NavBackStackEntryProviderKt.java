package androidx.navigation.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.DynamicProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.internal.DefaultViewModelProviderFactory;
import androidx.navigation.NavBackStackEntry;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.j;
import org.objectweb.asm.Opcodes;
import q0.p;

/* loaded from: classes4.dex */
public final class NavBackStackEntryProviderKt {
    public static final void a(NavBackStackEntry navBackStackEntry, SaveableStateHolder saveableStateHolder, p pVar, Composer composer, int i2) {
        int i3;
        ComposerImpl g2 = composer.g(-1579360880);
        if ((i2 & 6) == 0) {
            i3 = (g2.w(navBackStackEntry) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= g2.w(saveableStateHolder) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= g2.w(pVar) ? 256 : 128;
        }
        if ((i3 & Opcodes.I2S) == 146 && g2.i()) {
            g2.A();
        } else {
            DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal = LocalViewModelStoreOwner.f20240a;
            p0.a.s(navBackStackEntry, "viewModelStoreOwner");
            CompositionLocalKt.b(new ProvidedValue[]{LocalViewModelStoreOwner.f20240a.c(navBackStackEntry), LocalLifecycleOwnerKt.f20226a.c(navBackStackEntry), AndroidCompositionLocals_androidKt.e.c(navBackStackEntry)}, ComposableLambdaKt.c(-52928304, new NavBackStackEntryProviderKt$LocalOwnersProvider$1(saveableStateHolder, pVar), g2), g2, 56);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new NavBackStackEntryProviderKt$LocalOwnersProvider$2(navBackStackEntry, saveableStateHolder, pVar, i2);
        }
    }

    public static final void b(SaveableStateHolder saveableStateHolder, p pVar, Composer composer, int i2) {
        int i3;
        ViewModelProvider viewModelProvider;
        ComposerImpl g2 = composer.g(1211832233);
        if ((i2 & 6) == 0) {
            i3 = (g2.w(saveableStateHolder) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= g2.w(pVar) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && g2.i()) {
            g2.A();
        } else {
            g2.t(1729797275);
            ViewModelStoreOwner a2 = LocalViewModelStoreOwner.a(g2);
            if (a2 == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            boolean z2 = a2 instanceof HasDefaultViewModelProviderFactory;
            CreationExtras defaultViewModelCreationExtras = z2 ? ((HasDefaultViewModelProviderFactory) a2).getDefaultViewModelCreationExtras() : CreationExtras.Empty.f20236b;
            j a3 = g0.a(BackStackEntryIdViewModel.class);
            g2.t(1673618944);
            p0.a.s(defaultViewModelCreationExtras, "extras");
            if (z2) {
                ViewModelStore viewModelStore = a2.getViewModelStore();
                ViewModelProvider.Factory defaultViewModelProviderFactory = ((HasDefaultViewModelProviderFactory) a2).getDefaultViewModelProviderFactory();
                p0.a.s(viewModelStore, "store");
                p0.a.s(defaultViewModelProviderFactory, "factory");
                viewModelProvider = new ViewModelProvider(viewModelStore, defaultViewModelProviderFactory, defaultViewModelCreationExtras);
            } else {
                ViewModelProvider.Factory defaultViewModelProviderFactory2 = z2 ? ((HasDefaultViewModelProviderFactory) a2).getDefaultViewModelProviderFactory() : DefaultViewModelProviderFactory.f20243a;
                CreationExtras defaultViewModelCreationExtras2 = z2 ? ((HasDefaultViewModelProviderFactory) a2).getDefaultViewModelCreationExtras() : CreationExtras.Empty.f20236b;
                p0.a.s(defaultViewModelProviderFactory2, "factory");
                p0.a.s(defaultViewModelCreationExtras2, "extras");
                viewModelProvider = new ViewModelProvider(a2.getViewModelStore(), defaultViewModelProviderFactory2, defaultViewModelCreationExtras2);
            }
            ViewModel c2 = viewModelProvider.c(a3);
            g2.V(false);
            g2.V(false);
            BackStackEntryIdViewModel backStackEntryIdViewModel = (BackStackEntryIdViewModel) c2;
            backStackEntryIdViewModel.f20528c = new WeakReference(saveableStateHolder);
            saveableStateHolder.f(backStackEntryIdViewModel.f20527b, pVar, g2, ((i3 << 6) & 896) | (i3 & 112));
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new NavBackStackEntryProviderKt$SaveableStateProvider$1(saveableStateHolder, pVar, i2);
        }
    }
}
