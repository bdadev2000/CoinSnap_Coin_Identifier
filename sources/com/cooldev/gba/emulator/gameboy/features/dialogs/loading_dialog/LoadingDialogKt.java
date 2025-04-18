package com.cooldev.gba.emulator.gameboy.features.dialogs.loading_dialog;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.window.AndroidDialog_androidKt;
import androidx.compose.ui.window.DialogProperties;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import com.cooldev.gba.emulator.gameboy.features.dialogs.loading_dialog.logic.LoadingDialogState;
import com.cooldev.gba.emulator.gameboy.features.dialogs.loading_dialog.logic.LoadingDialogViewModel;
import kotlin.jvm.internal.g0;
import org.jetbrains.annotations.Nullable;
import org.koin.androidx.compose.ViewModelInternalsKt;
import org.koin.androidx.viewmodel.GetViewModelKt;
import org.koin.compose.KoinApplicationKt;

/* loaded from: classes4.dex */
public final class LoadingDialogKt {
    @ComposableTarget
    @Composable
    public static final void LoadingDialog(@Nullable Composer composer, int i2) {
        ComposerImpl g2 = composer.g(651154515);
        if (i2 == 0 && g2.i()) {
            g2.A();
        } else {
            g2.t(-1614864554);
            ViewModelStoreOwner a2 = LocalViewModelStoreOwner.a(g2);
            if (a2 == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            ViewModel resolveViewModel = GetViewModelKt.resolveViewModel(g0.a(LoadingDialogViewModel.class), a2.getViewModelStore(), null, ViewModelInternalsKt.defaultExtras(a2, g2, 8), null, KoinApplicationKt.currentKoinScope(g2, 0), null);
            g2.V(false);
            LoadingDialogViewModel loadingDialogViewModel = (LoadingDialogViewModel) resolveViewModel;
            if (((LoadingDialogState) SnapshotStateKt.b(loadingDialogViewModel.getState(), g2, 8).getValue()).getShowDialog()) {
                AndroidDialog_androidKt.a(new LoadingDialogKt$LoadingDialog$1(loadingDialogViewModel), new DialogProperties(4), ComposableSingletons$LoadingDialogKt.INSTANCE.m166getLambda1$gba_v1_0_35_54__09Apr2025_1046_release(), g2, 432, 0);
            }
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new LoadingDialogKt$LoadingDialog$2(i2);
        }
    }
}
