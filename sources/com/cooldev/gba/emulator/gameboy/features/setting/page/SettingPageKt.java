package com.cooldev.gba.emulator.gameboy.features.setting.page;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import com.cooldev.gba.emulator.gameboy.constants.MyColors;
import com.cooldev.gba.emulator.gameboy.effects.HideNavigationEffectKt;
import com.cooldev.gba.emulator.gameboy.effects.SetRequestedOrientationPortraitKt;
import com.cooldev.gba.emulator.gameboy.effects.SetSystemBarsColorKt;
import com.cooldev.gba.emulator.gameboy.features.setting.logic.SettingViewModel;
import kotlin.jvm.internal.g0;
import org.jetbrains.annotations.Nullable;
import org.koin.androidx.compose.ViewModelInternalsKt;
import org.koin.androidx.viewmodel.GetViewModelKt;
import org.koin.compose.KoinApplicationKt;

/* loaded from: classes.dex */
public final class SettingPageKt {
    @ComposableTarget
    @Composable
    @SuppressLint({"UnusedMaterial3ScaffoldPaddingParameter"})
    public static final void SettingPage(@Nullable Composer composer, int i2) {
        ComposerImpl g2 = composer.g(937479740);
        if (i2 == 0 && g2.i()) {
            g2.A();
        } else {
            SetRequestedOrientationPortraitKt.SetRequestedOrientationPortrait(false, g2, 0, 1);
            HideNavigationEffectKt.HideNavigationEffect(g2, 0);
            MyColors myColors = MyColors.INSTANCE;
            SetSystemBarsColorKt.m41SetSystemBarsColorek8zF_U(myColors.m35getText50d7_KjU(), g2, 6);
            Context context = (Context) g2.K(AndroidCompositionLocals_androidKt.f16325b);
            g2.t(-1614864554);
            ViewModelStoreOwner a2 = LocalViewModelStoreOwner.a(g2);
            if (a2 == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            ViewModel resolveViewModel = GetViewModelKt.resolveViewModel(g0.a(SettingViewModel.class), a2.getViewModelStore(), null, ViewModelInternalsKt.defaultExtras(a2, g2, 8), null, KoinApplicationKt.currentKoinScope(g2, 0), null);
            g2.V(false);
            ScaffoldKt.a(null, null, null, null, null, 0, myColors.m25getText200d7_KjU(), 0L, null, ComposableLambdaKt.c(1114652749, new SettingPageKt$SettingPage$1((SettingViewModel) resolveViewModel, context), g2), g2, 806879232, 447);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new SettingPageKt$SettingPage$2(i2);
        }
    }
}
