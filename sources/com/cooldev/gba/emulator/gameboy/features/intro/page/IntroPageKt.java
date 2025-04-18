package com.cooldev.gba.emulator.gameboy.features.intro.page;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.activity.compose.BackHandlerKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.applovin.impl.adview.t;
import com.cooldev.gba.emulator.gameboy.effects.HideNavigationEffectKt;
import com.cooldev.gba.emulator.gameboy.effects.SetRequestedOrientationPortraitKt;
import com.cooldev.gba.emulator.gameboy.features.admob.banner_ads.logic.BannerAdGameViewModel;
import com.cooldev.gba.emulator.gameboy.features.admob.banner_ads.logic.BannerAdOnboardingViewModel;
import com.cooldev.gba.emulator.gameboy.features.admob.banner_ads.logic.BannerAdViewModel;
import com.cooldev.gba.emulator.gameboy.features.admob.interstitial_ad.logic.InterstitialAdViewModel;
import com.cooldev.gba.emulator.gameboy.features.admob.rewarded_ad.logic.RewardedAdViewModel;
import com.cooldev.gba.emulator.gameboy.features.app.logic.AppState;
import com.cooldev.gba.emulator.gameboy.features.app.logic.AppViewModel;
import com.cooldev.gba.emulator.gameboy.features.app.logic.PaywallNavigationViewModel;
import com.cooldev.gba.emulator.gameboy.features.network.ConnectivityObserverSingleton;
import com.cooldev.gba.emulator.gameboy.features.paywalls.logic.IAPState;
import com.cooldev.gba.emulator.gameboy.features.paywalls.logic.IAPViewModel;
import com.cooldev.gba.emulator.gameboy.local.storage.AppPrefUtils;
import com.cooldev.gba.emulator.gameboy.local.storage.InterstitialAdPrefUtils;
import com.cooldev.gba.emulator.gameboy.network.services.analytic.events.IntroEvents;
import com.cooldev.gba.emulator.gameboy.router.MultiNavigationAppStateKt;
import com.cooldev.gba.emulator.gameboy.router.RouterName;
import d0.b0;
import org.jetbrains.annotations.Nullable;
import org.koin.core.scope.Scope;

/* loaded from: classes2.dex */
public final class IntroPageKt {
    @ComposableTarget
    @Composable
    @SuppressLint({"UnusedMaterial3ScaffoldPaddingParameter"})
    public static final void IntroPage(@Nullable Composer composer, int i2) {
        ComposerImpl g2 = composer.g(1520152104);
        if (i2 == 0 && g2.i()) {
            g2.A();
        } else {
            Context context = (Context) g2.K(AndroidCompositionLocals_androidKt.f16325b);
            Scope q2 = t.q(g2, 414512006, g2, 0, 1274527078);
            boolean y2 = t.y(g2, false, 511388516, null) | g2.I(q2);
            Object u2 = g2.u();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f13690a;
            if (y2 || u2 == composer$Companion$Empty$1) {
                u2 = t.g(AppViewModel.class, q2, null, null, g2);
            }
            g2.V(false);
            g2.V(false);
            AppViewModel appViewModel = (AppViewModel) u2;
            AppState appState = (AppState) SnapshotStateKt.b(appViewModel.getState(), g2, 8).getValue();
            Scope q3 = t.q(g2, 414512006, g2, 0, 1274527078);
            boolean y3 = t.y(g2, false, 511388516, null) | g2.I(q3);
            Object u3 = g2.u();
            if (y3 || u3 == composer$Companion$Empty$1) {
                u3 = t.g(IAPViewModel.class, q3, null, null, g2);
            }
            g2.V(false);
            g2.V(false);
            boolean isPremium = ((IAPState) t.f((IAPViewModel) u3, g2, 8)).isPremium();
            InterstitialAdPrefUtils interstitialAdPrefUtils = InterstitialAdPrefUtils.INSTANCE;
            AppPrefUtils appPrefUtils = AppPrefUtils.INSTANCE;
            Scope q4 = t.q(g2, 414512006, g2, 0, 1274527078);
            boolean y4 = t.y(g2, false, 511388516, null) | g2.I(q4);
            Object u4 = g2.u();
            if (y4 || u4 == composer$Companion$Empty$1) {
                u4 = t.g(BannerAdViewModel.class, q4, null, null, g2);
            }
            g2.V(false);
            g2.V(false);
            BannerAdViewModel bannerAdViewModel = (BannerAdViewModel) u4;
            Scope q5 = t.q(g2, 414512006, g2, 0, 1274527078);
            boolean y5 = t.y(g2, false, 511388516, null) | g2.I(q5);
            Object u5 = g2.u();
            if (y5 || u5 == composer$Companion$Empty$1) {
                u5 = t.g(BannerAdOnboardingViewModel.class, q5, null, null, g2);
            }
            g2.V(false);
            g2.V(false);
            BannerAdOnboardingViewModel bannerAdOnboardingViewModel = (BannerAdOnboardingViewModel) u5;
            Scope q6 = t.q(g2, 414512006, g2, 0, 1274527078);
            boolean I = g2.I(q6) | t.y(g2, false, 511388516, null);
            Object u6 = g2.u();
            if (I || u6 == composer$Companion$Empty$1) {
                u6 = t.g(BannerAdGameViewModel.class, q6, null, null, g2);
            }
            g2.V(false);
            g2.V(false);
            BannerAdGameViewModel bannerAdGameViewModel = (BannerAdGameViewModel) u6;
            Scope q7 = t.q(g2, 414512006, g2, 0, 1274527078);
            boolean I2 = g2.I(q7) | t.y(g2, false, 511388516, null);
            Object u7 = g2.u();
            if (I2 || u7 == composer$Companion$Empty$1) {
                u7 = t.g(InterstitialAdViewModel.class, q7, null, null, g2);
            }
            g2.V(false);
            g2.V(false);
            InterstitialAdViewModel interstitialAdViewModel = (InterstitialAdViewModel) u7;
            Scope q8 = t.q(g2, 414512006, g2, 0, 1274527078);
            boolean I3 = g2.I(q8) | t.y(g2, false, 511388516, null);
            Object u8 = g2.u();
            if (I3 || u8 == composer$Companion$Empty$1) {
                u8 = t.g(PaywallNavigationViewModel.class, q8, null, null, g2);
            }
            g2.V(false);
            g2.V(false);
            PaywallNavigationViewModel paywallNavigationViewModel = (PaywallNavigationViewModel) u8;
            Scope q9 = t.q(g2, 414512006, g2, 0, 1274527078);
            boolean y6 = t.y(g2, false, 511388516, null) | g2.I(q9);
            Object u9 = g2.u();
            if (y6 || u9 == composer$Companion$Empty$1) {
                u9 = t.g(RewardedAdViewModel.class, q9, null, null, g2);
            }
            g2.V(false);
            g2.V(false);
            MutableState a2 = SnapshotStateKt.a(ConnectivityObserverSingleton.INSTANCE.getInstance(context).observe(), Boolean.TRUE, null, g2, 56, 2);
            boolean valueOnboardingVisible = appPrefUtils.getValueOnboardingVisible(context);
            LogEventScreen(g2, 0);
            HideNavigationEffectKt.HideNavigationEffect(g2, 0);
            SetRequestedOrientationPortraitKt.SetRequestedOrientationPortrait(false, g2, 0, 1);
            BackHandlerKt.a(false, IntroPageKt$IntroPage$1.INSTANCE, g2, 48, 1);
            EffectsKt.f(b0.f30125a, new IntroPageKt$IntroPage$2(valueOnboardingVisible, appState, isPremium, paywallNavigationViewModel, a2, interstitialAdPrefUtils, context, appPrefUtils, appViewModel, bannerAdViewModel, bannerAdGameViewModel, bannerAdOnboardingViewModel, interstitialAdViewModel, (RewardedAdViewModel) u9, null), g2);
            EffectsKt.f(Boolean.valueOf(IntroPage$lambda$0(a2)), new IntroPageKt$IntroPage$3(valueOnboardingVisible, appState, paywallNavigationViewModel, a2, null), g2);
            ScaffoldKt.a(null, null, null, null, null, 0, 0L, 0L, null, ComposableSingletons$IntroPageKt.INSTANCE.m248getLambda1$gba_v1_0_35_54__09Apr2025_1046_release(), g2, 805306368, 511);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new IntroPageKt$IntroPage$4(i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean IntroPage$lambda$0(State<Boolean> state) {
        return ((Boolean) state.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    public static final void LogEventScreen(Composer composer, int i2) {
        ComposerImpl g2 = composer.g(1279055045);
        if (i2 == 0 && g2.i()) {
            g2.A();
        } else {
            EffectsKt.f(b0.f30125a, new IntroPageKt$LogEventScreen$1(null), g2);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new IntroPageKt$LogEventScreen$2(i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void navigateBasedOnAppState(boolean z2, boolean z3, boolean z4, PaywallNavigationViewModel paywallNavigationViewModel) {
        if (z2) {
            IntroEvents.INSTANCE.logIntroNavigateToOnboarding();
            MultiNavigationAppStateKt.getLocalNavigationState().getRootNavigation().navigateAndClearStack(RouterName.ONBOARDING);
            return;
        }
        MultiNavigationAppStateKt.getLocalNavigationState().getRootNavigation().navigateAndClearStack(RouterName.DASHBOARD);
        if (!z3 || z4) {
            return;
        }
        IntroEvents.INSTANCE.logIntroNavigateToPaywall();
        paywallNavigationViewModel.navigateToPaywall();
    }
}
