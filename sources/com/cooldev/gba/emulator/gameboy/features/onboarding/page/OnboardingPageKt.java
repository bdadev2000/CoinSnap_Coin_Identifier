package com.cooldev.gba.emulator.gameboy.features.onboarding.page;

import android.annotation.SuppressLint;
import androidx.activity.compose.BackHandlerKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.applovin.impl.adview.t;
import com.cooldev.gba.emulator.gameboy.constants.MyApps;
import com.cooldev.gba.emulator.gameboy.constants.MyColors;
import com.cooldev.gba.emulator.gameboy.effects.HideNavigationEffectKt;
import com.cooldev.gba.emulator.gameboy.effects.SetRequestedOrientationPortraitKt;
import com.cooldev.gba.emulator.gameboy.features.admob.banner_ads.logic.BannerAdOnboardingState;
import com.cooldev.gba.emulator.gameboy.features.admob.banner_ads.logic.BannerAdOnboardingViewModel;
import com.cooldev.gba.emulator.gameboy.features.dashboard.logic.UserGuideViewModel;
import com.cooldev.gba.emulator.gameboy.features.dialogs.rating_dialog.page.RatingDialogKt;
import com.cooldev.gba.emulator.gameboy.features.paywalls.logic.IAPState;
import com.cooldev.gba.emulator.gameboy.features.paywalls.logic.IAPViewModel;
import d0.b0;
import org.jetbrains.annotations.Nullable;
import org.koin.core.scope.Scope;

/* loaded from: classes3.dex */
public final class OnboardingPageKt {
    @ComposableTarget
    @Composable
    @SuppressLint({"UnusedMaterial3ScaffoldPaddingParameter"})
    public static final void OnboardingPage(@Nullable Composer composer, int i2) {
        ComposerImpl g2 = composer.g(-1413353193);
        if (i2 == 0 && g2.i()) {
            g2.A();
        } else {
            Scope q2 = t.q(g2, 414512006, g2, 0, 1274527078);
            boolean y2 = t.y(g2, false, 511388516, null) | g2.I(q2);
            Object u2 = g2.u();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f13690a;
            if (y2 || u2 == composer$Companion$Empty$1) {
                u2 = t.g(BannerAdOnboardingViewModel.class, q2, null, null, g2);
            }
            g2.V(false);
            g2.V(false);
            BannerAdOnboardingViewModel bannerAdOnboardingViewModel = (BannerAdOnboardingViewModel) u2;
            BannerAdOnboardingState bannerAdOnboardingState = (BannerAdOnboardingState) SnapshotStateKt.b(bannerAdOnboardingViewModel.getState(), g2, 8).getValue();
            Scope q3 = t.q(g2, 414512006, g2, 0, 1274527078);
            boolean y3 = t.y(g2, false, 511388516, null) | g2.I(q3);
            Object u3 = g2.u();
            if (y3 || u3 == composer$Companion$Empty$1) {
                u3 = t.g(IAPViewModel.class, q3, null, null, g2);
            }
            g2.V(false);
            g2.V(false);
            IAPViewModel iAPViewModel = (IAPViewModel) u3;
            Scope q4 = t.q(g2, 414512006, g2, 0, 1274527078);
            boolean y4 = t.y(g2, false, 511388516, null) | g2.I(q4);
            Object u4 = g2.u();
            if (y4 || u4 == composer$Companion$Empty$1) {
                u4 = t.g(UserGuideViewModel.class, q4, null, null, g2);
            }
            g2.V(false);
            g2.V(false);
            boolean z2 = bannerAdOnboardingState.getShouldShowBannerAd() && !((IAPState) t.f(iAPViewModel, g2, 8)).isPremium();
            float m10getHeightAdsBannerD9Ej5fM = z2 ? MyApps.INSTANCE.m10getHeightAdsBannerD9Ej5fM() : 0;
            HideNavigationEffectKt.HideNavigationEffect(g2, 0);
            SetRequestedOrientationPortraitKt.SetRequestedOrientationPortrait(false, g2, 0, 1);
            RatingDialogKt.RatingDialog(false, g2, 0, 1);
            BackHandlerKt.a(false, OnboardingPageKt$OnboardingPage$1.INSTANCE, g2, 48, 1);
            EffectsKt.c(b0.f30125a, new OnboardingPageKt$OnboardingPage$2(bannerAdOnboardingViewModel), g2);
            ScaffoldKt.a(null, null, ComposableLambdaKt.c(-1793300388, new OnboardingPageKt$OnboardingPage$3(z2, bannerAdOnboardingState), g2), null, null, 0, MyColors.INSTANCE.m25getText200d7_KjU(), 0L, null, ComposableLambdaKt.c(-11320794, new OnboardingPageKt$OnboardingPage$4(m10getHeightAdsBannerD9Ej5fM), g2), g2, 806879616, 443);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new OnboardingPageKt$OnboardingPage$5(i2);
        }
    }
}
