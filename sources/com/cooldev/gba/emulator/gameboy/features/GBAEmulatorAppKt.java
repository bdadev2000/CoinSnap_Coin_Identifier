package com.cooldev.gba.emulator.gameboy.features;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import androidx.activity.compose.ManagedActivityResultLauncher;
import androidx.compose.foundation.layout.SizeKt;
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
import androidx.compose.runtime.StructuralEqualityPolicy;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import com.applovin.impl.adview.t;
import com.cooldev.gba.emulator.gameboy.db.GameDBManager;
import com.cooldev.gba.emulator.gameboy.features.admob.app_open_ad.logic.AppOpenAdViewModel;
import com.cooldev.gba.emulator.gameboy.features.admob.banner_ads.logic.BannerAdGameViewModel;
import com.cooldev.gba.emulator.gameboy.features.admob.banner_ads.logic.BannerAdOnboardingViewModel;
import com.cooldev.gba.emulator.gameboy.features.admob.banner_ads.logic.BannerAdViewModel;
import com.cooldev.gba.emulator.gameboy.features.admob.interstitial_ad.logic.InterstitialAdState;
import com.cooldev.gba.emulator.gameboy.features.admob.interstitial_ad.logic.InterstitialAdViewModel;
import com.cooldev.gba.emulator.gameboy.features.admob.rewarded_ad.logic.RewardedAdState;
import com.cooldev.gba.emulator.gameboy.features.admob.rewarded_ad.logic.RewardedAdViewModel;
import com.cooldev.gba.emulator.gameboy.features.app.components.ManageAppOpenAdLifecycleKt;
import com.cooldev.gba.emulator.gameboy.features.app.theme.ThemeKt;
import com.cooldev.gba.emulator.gameboy.features.dialogs.loading_dialog.LoadingDialogKt;
import com.cooldev.gba.emulator.gameboy.features.dialogs.no_internet_dialog.NoInternetDialogKt;
import com.cooldev.gba.emulator.gameboy.features.network.ConnectivityObserverSingleton;
import com.cooldev.gba.emulator.gameboy.features.paywalls.logic.IAPViewModel;
import com.cooldev.gba.emulator.gameboy.local.storage.AppPrefUtils;
import com.cooldev.gba.emulator.gameboy.router.MultiNavigationAppStateKt;
import com.cooldev.gba.emulator.gameboy.router.RouterName;
import d0.b0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.scope.Scope;
import p0.a;
import q0.l;

/* loaded from: classes.dex */
public final class GBAEmulatorAppKt {

    @SuppressLint({"StaticFieldLeak"})
    public static GameDBManager gameDBManager;
    public static ManagedActivityResultLauncher<Uri, Uri> launcher;

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget
    @Composable
    public static final void ConnectivityStatusDialog(Context context, Composer composer, int i2) {
        ComposerImpl g2 = composer.g(349365765);
        if (!ConnectivityStatusDialog$lambda$5(SnapshotStateKt.a(ConnectivityObserverSingleton.INSTANCE.getInstance(context).observe(), Boolean.TRUE, null, g2, 56, 2))) {
            NoInternetDialogKt.NoInternetDialog(g2, 0);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new GBAEmulatorAppKt$ConnectivityStatusDialog$1(context, i2);
        }
    }

    private static final boolean ConnectivityStatusDialog$lambda$5(State<Boolean> state) {
        return ((Boolean) state.getValue()).booleanValue();
    }

    @ComposableTarget
    @Composable
    @SuppressLint({"UnusedMaterial3ScaffoldPaddingParameter", "NewApi"})
    public static final void GBAEmulatorApp(@Nullable Composer composer, int i2) {
        ComposerImpl g2 = composer.g(2021618611);
        if (i2 == 0 && g2.i()) {
            g2.A();
        } else {
            Context context = (Context) g2.K(AndroidCompositionLocals_androidKt.f16325b);
            g2.J(1799398627);
            Object u2 = g2.u();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f13690a;
            if (u2 == composer$Companion$Empty$1) {
                u2 = SnapshotStateKt.f(Boolean.FALSE, StructuralEqualityPolicy.f14078a);
                g2.o(u2);
            }
            MutableState mutableState = (MutableState) u2;
            g2.V(false);
            g2.J(1799400891);
            Object u3 = g2.u();
            if (u3 == composer$Companion$Empty$1) {
                u3 = new GBAEmulatorAppKt$GBAEmulatorApp$1$1(mutableState);
                g2.o(u3);
            }
            g2.V(false);
            SetupMultiNavigation(context, (l) u3, g2, 56);
            ObserveAppLifecycleForAppOpenAd(context, g2, 8);
            ManageInterstitialAdLifecycle(context, g2, 8);
            ManageRewardedAdLifecycle(context, g2, 8);
            LoadAdsOnConnectivityChange(context, g2, 8);
            ConnectivityStatusDialog(context, g2, 8);
            LoadingDialogKt.LoadingDialog(g2, 0);
            ThemeKt.GBAEmulatorTheme(false, false, ComposableLambdaKt.c(106440560, new GBAEmulatorAppKt$GBAEmulatorApp$2(SizeKt.f4107c, mutableState), g2), g2, 384, 3);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new GBAEmulatorAppKt$GBAEmulatorApp$3(i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean GBAEmulatorApp$lambda$1(MutableState<Boolean> mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void GBAEmulatorApp$lambda$2(MutableState<Boolean> mutableState, boolean z2) {
        mutableState.setValue(Boolean.valueOf(z2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    public static final void LoadAdsOnConnectivityChange(Context context, Composer composer, int i2) {
        ComposerImpl g2 = composer.g(932429192);
        MutableState a2 = SnapshotStateKt.a(ConnectivityObserverSingleton.INSTANCE.getInstance(context).observe(), Boolean.TRUE, null, g2, 56, 2);
        Scope q2 = t.q(g2, 414512006, g2, 0, 1274527078);
        boolean y2 = t.y(g2, false, 511388516, null) | g2.I(q2);
        Object u2 = g2.u();
        Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f13690a;
        if (y2 || u2 == composer$Companion$Empty$1) {
            u2 = t.g(AppOpenAdViewModel.class, q2, null, null, g2);
        }
        g2.V(false);
        g2.V(false);
        AppOpenAdViewModel appOpenAdViewModel = (AppOpenAdViewModel) u2;
        Scope q3 = t.q(g2, 414512006, g2, 0, 1274527078);
        boolean y3 = t.y(g2, false, 511388516, null) | g2.I(q3);
        Object u3 = g2.u();
        if (y3 || u3 == composer$Companion$Empty$1) {
            u3 = t.g(BannerAdViewModel.class, q3, null, null, g2);
        }
        g2.V(false);
        g2.V(false);
        BannerAdViewModel bannerAdViewModel = (BannerAdViewModel) u3;
        Scope q4 = t.q(g2, 414512006, g2, 0, 1274527078);
        boolean y4 = t.y(g2, false, 511388516, null) | g2.I(q4);
        Object u4 = g2.u();
        if (y4 || u4 == composer$Companion$Empty$1) {
            u4 = t.g(BannerAdGameViewModel.class, q4, null, null, g2);
        }
        g2.V(false);
        g2.V(false);
        BannerAdGameViewModel bannerAdGameViewModel = (BannerAdGameViewModel) u4;
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
        boolean y6 = t.y(g2, false, 511388516, null) | g2.I(q6);
        Object u6 = g2.u();
        if (y6 || u6 == composer$Companion$Empty$1) {
            u6 = t.g(IAPViewModel.class, q6, null, null, g2);
        }
        g2.V(false);
        g2.V(false);
        IAPViewModel iAPViewModel = (IAPViewModel) u6;
        boolean valueOnboardingVisible = AppPrefUtils.INSTANCE.getValueOnboardingVisible(context);
        Scope q7 = t.q(g2, 414512006, g2, 0, 1274527078);
        boolean y7 = t.y(g2, false, 511388516, null) | g2.I(q7);
        Object u7 = g2.u();
        if (y7 || u7 == composer$Companion$Empty$1) {
            u7 = t.g(RewardedAdViewModel.class, q7, null, null, g2);
        }
        g2.V(false);
        g2.V(false);
        RewardedAdViewModel rewardedAdViewModel = (RewardedAdViewModel) u7;
        g2.J(1556246775);
        Object u8 = g2.u();
        if (u8 == composer$Companion$Empty$1) {
            u8 = SnapshotStateKt.f(Boolean.FALSE, StructuralEqualityPolicy.f14078a);
            g2.o(u8);
        }
        g2.V(false);
        EffectsKt.f(Boolean.valueOf(LoadAdsOnConnectivityChange$lambda$6(a2)), new GBAEmulatorAppKt$LoadAdsOnConnectivityChange$1(a2, (MutableState) u8, valueOnboardingVisible, appOpenAdViewModel, bannerAdViewModel, bannerAdGameViewModel, rewardedAdViewModel, bannerAdOnboardingViewModel, iAPViewModel, null), g2);
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new GBAEmulatorAppKt$LoadAdsOnConnectivityChange$2(context, i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean LoadAdsOnConnectivityChange$lambda$6(State<Boolean> state) {
        return ((Boolean) state.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean LoadAdsOnConnectivityChange$lambda$8(MutableState<Boolean> mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void LoadAdsOnConnectivityChange$lambda$9(MutableState<Boolean> mutableState, boolean z2) {
        mutableState.setValue(Boolean.valueOf(z2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    public static final void ManageInterstitialAdLifecycle(Context context, Composer composer, int i2) {
        ComposerImpl g2 = composer.g(-1269007730);
        Scope q2 = t.q(g2, 414512006, g2, 0, 1274527078);
        boolean y2 = t.y(g2, false, 511388516, null) | g2.I(q2);
        Object u2 = g2.u();
        if (y2 || u2 == Composer.Companion.f13690a) {
            u2 = t.g(InterstitialAdViewModel.class, q2, null, null, g2);
        }
        g2.V(false);
        g2.V(false);
        EffectsKt.f(ManageAppOpenAdLifecycleKt.rememberLifecycleEvent(null, g2, 0, 1), new GBAEmulatorAppKt$ManageInterstitialAdLifecycle$1((InterstitialAdState) SnapshotStateKt.b(((InterstitialAdViewModel) u2).getState(), g2, 8).getValue(), context, null), g2);
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new GBAEmulatorAppKt$ManageInterstitialAdLifecycle$2(context, i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    public static final void ManageRewardedAdLifecycle(Context context, Composer composer, int i2) {
        ComposerImpl g2 = composer.g(-1356560532);
        Scope q2 = t.q(g2, 414512006, g2, 0, 1274527078);
        boolean y2 = t.y(g2, false, 511388516, null) | g2.I(q2);
        Object u2 = g2.u();
        if (y2 || u2 == Composer.Companion.f13690a) {
            u2 = t.g(RewardedAdViewModel.class, q2, null, null, g2);
        }
        g2.V(false);
        g2.V(false);
        EffectsKt.f(ManageAppOpenAdLifecycleKt.rememberLifecycleEvent(null, g2, 0, 1), new GBAEmulatorAppKt$ManageRewardedAdLifecycle$1((RewardedAdState) SnapshotStateKt.b(((RewardedAdViewModel) u2).getState(), g2, 8).getValue(), context, null), g2);
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new GBAEmulatorAppKt$ManageRewardedAdLifecycle$2(context, i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    public static final void ObserveAppLifecycleForAppOpenAd(Context context, Composer composer, int i2) {
        ComposerImpl g2 = composer.g(57097570);
        a.q(context, "null cannot be cast to non-null type android.app.Activity");
        Activity activity = (Activity) context;
        LifecycleOwner lifecycleOwner = (LifecycleOwner) g2.K(LocalLifecycleOwnerKt.f20226a);
        Scope q2 = t.q(g2, 414512006, g2, 0, 1274527078);
        boolean y2 = t.y(g2, false, 511388516, null) | g2.I(q2);
        Object u2 = g2.u();
        if (y2 || u2 == Composer.Companion.f13690a) {
            u2 = t.g(AppOpenAdViewModel.class, q2, null, null, g2);
        }
        g2.V(false);
        g2.V(false);
        EffectsKt.c(b0.f30125a, new GBAEmulatorAppKt$ObserveAppLifecycleForAppOpenAd$1(lifecycleOwner, context, (AppOpenAdViewModel) u2, activity), g2);
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new GBAEmulatorAppKt$ObserveAppLifecycleForAppOpenAd$2(context, i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    public static final void SetupMultiNavigation(Context context, l lVar, Composer composer, int i2) {
        ComposerImpl g2 = composer.g(-881683951);
        EffectsKt.f(b0.f30125a, new GBAEmulatorAppKt$SetupMultiNavigation$1(MultiNavigationAppStateKt.rememberMultiNavigationAppState(RouterName.ROOT, null, g2, 6, 2), MultiNavigationAppStateKt.rememberMultiNavigationAppState(RouterName.HOME_WRAPPER, null, g2, 6, 2), context, lVar, null), g2);
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new GBAEmulatorAppKt$SetupMultiNavigation$2(context, lVar, i2);
        }
    }

    @NotNull
    public static final GameDBManager getGameDBManager() {
        GameDBManager gameDBManager2 = gameDBManager;
        if (gameDBManager2 != null) {
            return gameDBManager2;
        }
        a.B0("gameDBManager");
        throw null;
    }

    @NotNull
    public static final ManagedActivityResultLauncher<Uri, Uri> getLauncher() {
        ManagedActivityResultLauncher<Uri, Uri> managedActivityResultLauncher = launcher;
        if (managedActivityResultLauncher != null) {
            return managedActivityResultLauncher;
        }
        a.B0("launcher");
        throw null;
    }

    public static final void setGameDBManager(@NotNull GameDBManager gameDBManager2) {
        a.s(gameDBManager2, "<set-?>");
        gameDBManager = gameDBManager2;
    }

    public static final void setLauncher(@NotNull ManagedActivityResultLauncher<Uri, Uri> managedActivityResultLauncher) {
        a.s(managedActivityResultLauncher, "<set-?>");
        launcher = managedActivityResultLauncher;
    }
}
