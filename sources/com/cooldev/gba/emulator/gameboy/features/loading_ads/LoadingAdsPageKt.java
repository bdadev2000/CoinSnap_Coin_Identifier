package com.cooldev.gba.emulator.gameboy.features.loading_ads;

import android.annotation.SuppressLint;
import android.app.Activity;
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
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.applovin.impl.adview.t;
import com.cooldev.gba.emulator.gameboy.effects.HideNavigationEffectKt;
import com.cooldev.gba.emulator.gameboy.effects.SetRequestedOrientationPortraitKt;
import com.cooldev.gba.emulator.gameboy.features.admob.app_open_ad.logic.AppOpenAdViewModel;
import com.cooldev.gba.emulator.gameboy.features.app.components.ManageAppOpenAdLifecycleKt;
import com.cooldev.gba.emulator.gameboy.features.network.ConnectivityObserverSingleton;
import com.cooldev.gba.emulator.gameboy.features.paywalls.logic.IAPViewModel;
import com.cooldev.gba.emulator.gameboy.network.services.remote_config.RemoteConfigService;
import com.cooldev.gba.emulator.gameboy.router.MultiNavigationAppStateKt;
import com.cooldev.gba.emulator.gameboy.router.RouterName;
import d0.b0;
import org.jetbrains.annotations.Nullable;
import org.koin.core.scope.Scope;
import p0.a;
import q0.p;

/* loaded from: classes.dex */
public final class LoadingAdsPageKt {
    @ComposableTarget
    @Composable
    @SuppressLint({"UnusedMaterial3ScaffoldPaddingParameter"})
    public static final void LoadingAdsPage(@Nullable Composer composer, int i2) {
        ComposerImpl g2 = composer.g(2084992474);
        if (i2 == 0 && g2.i()) {
            g2.A();
        } else {
            Context context = (Context) g2.K(AndroidCompositionLocals_androidKt.f16325b);
            a.q(context, "null cannot be cast to non-null type android.app.Activity");
            Activity activity = (Activity) context;
            LogEventScreen(g2, 0);
            HideNavigationEffectKt.HideNavigationEffect(g2, 0);
            ManageAppOpenAdLifecycleKt.ManageAppOpenAdLifecycle(context, g2, 8);
            SetRequestedOrientationPortraitKt.SetRequestedOrientationPortrait(false, g2, 0, 1);
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
                u3 = t.g(IAPViewModel.class, q3, null, null, g2);
            }
            g2.V(false);
            g2.V(false);
            IAPViewModel iAPViewModel = (IAPViewModel) u3;
            Scope q4 = t.q(g2, 414512006, g2, 0, 1274527078);
            boolean y4 = t.y(g2, false, 511388516, null) | g2.I(q4);
            Object u4 = g2.u();
            if (y4 || u4 == composer$Companion$Empty$1) {
                u4 = t.g(RemoteConfigService.class, q4, null, null, g2);
            }
            g2.V(false);
            g2.V(false);
            MutableState a2 = SnapshotStateKt.a(ConnectivityObserverSingleton.INSTANCE.getInstance(context).observe(), Boolean.TRUE, null, g2, 56, 2);
            BackHandlerKt.a(false, LoadingAdsPageKt$LoadingAdsPage$1.INSTANCE, g2, 48, 1);
            EffectsKt.f(b0.f30125a, new LoadingAdsPageKt$LoadingAdsPage$2(a2, (RemoteConfigService) u4, iAPViewModel, appOpenAdViewModel, activity, null), g2);
            Boolean valueOf = Boolean.valueOf(LoadingAdsPage$lambda$0(a2));
            g2.J(-996284658);
            boolean I = g2.I(a2);
            Object u5 = g2.u();
            if (I || u5 == composer$Companion$Empty$1) {
                u5 = new LoadingAdsPageKt$LoadingAdsPage$3$1(a2, null);
                g2.o(u5);
            }
            g2.V(false);
            EffectsKt.f(valueOf, (p) u5, g2);
            ScaffoldKt.a(null, null, null, null, null, 0, Color.f14958c, 0L, null, ComposableSingletons$LoadingAdsPageKt.INSTANCE.m250getLambda1$gba_v1_0_35_54__09Apr2025_1046_release(), g2, 806879232, 447);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new LoadingAdsPageKt$LoadingAdsPage$4(i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean LoadingAdsPage$lambda$0(State<Boolean> state) {
        return ((Boolean) state.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    public static final void LogEventScreen(Composer composer, int i2) {
        ComposerImpl g2 = composer.g(-1130302533);
        if (i2 == 0 && g2.i()) {
            g2.A();
        } else {
            EffectsKt.f(b0.f30125a, new LoadingAdsPageKt$LogEventScreen$1(null), g2);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new LoadingAdsPageKt$LogEventScreen$2(i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void navigateToIntroPage() {
        MultiNavigationAppStateKt.getLocalNavigationState().getRootNavigation().navigateAndClearStack(RouterName.INTRO);
    }
}
