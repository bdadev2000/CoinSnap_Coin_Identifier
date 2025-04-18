package com.cooldev.gba.emulator.gameboy.features.dashboard.pages;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.support.v4.media.d;
import androidx.activity.compose.ActivityResultRegistryKt;
import androidx.activity.compose.ManagedActivityResultLauncher;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.StructuralEqualityPolicy;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.ContentScale$Companion$FillWidth$1;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.navigation.NamedNavArgumentKt;
import androidx.navigation.NavGraphBuilder;
import androidx.navigation.NavHostController;
import androidx.navigation.Navigator;
import androidx.navigation.compose.NavGraphBuilderKt;
import androidx.navigation.compose.NavHostControllerKt;
import b1.f0;
import com.applovin.impl.adview.t;
import com.cooldev.gba.emulator.gameboy.R;
import com.cooldev.gba.emulator.gameboy.constants.MyApps;
import com.cooldev.gba.emulator.gameboy.constants.MyColors;
import com.cooldev.gba.emulator.gameboy.constants.MyImages;
import com.cooldev.gba.emulator.gameboy.effects.HideNavigationEffectKt;
import com.cooldev.gba.emulator.gameboy.effects.SetRequestedOrientationPortraitKt;
import com.cooldev.gba.emulator.gameboy.effects.ShowStatusBarKt;
import com.cooldev.gba.emulator.gameboy.features.GBAEmulatorAppKt;
import com.cooldev.gba.emulator.gameboy.features.admob.banner_ads.logic.BannerAdState;
import com.cooldev.gba.emulator.gameboy.features.admob.banner_ads.logic.BannerAdViewModel;
import com.cooldev.gba.emulator.gameboy.features.admob.rewarded_ad.logic.RewardedAdViewModel;
import com.cooldev.gba.emulator.gameboy.features.app.logic.AppState;
import com.cooldev.gba.emulator.gameboy.features.app.logic.AppViewModel;
import com.cooldev.gba.emulator.gameboy.features.app.logic.PaywallNavigationViewModel;
import com.cooldev.gba.emulator.gameboy.features.dashboard.logic.UserGuideViewModel;
import com.cooldev.gba.emulator.gameboy.features.dashboard.utils.DashboardUtils;
import com.cooldev.gba.emulator.gameboy.features.home.logic.HomeState;
import com.cooldev.gba.emulator.gameboy.features.home.logic.HomeViewModel;
import com.cooldev.gba.emulator.gameboy.features.in_app_update.InAppUpdateManager;
import com.cooldev.gba.emulator.gameboy.features.onboarding.logic.OnboardingViewModel;
import com.cooldev.gba.emulator.gameboy.features.paywalls.logic.IAPState;
import com.cooldev.gba.emulator.gameboy.features.paywalls.logic.IAPViewModel;
import com.cooldev.gba.emulator.gameboy.router.MultiNavigationAppStateKt;
import com.cooldev.gba.emulator.gameboy.router.RouterName;
import d0.b0;
import org.jetbrains.annotations.Nullable;
import org.koin.compose.KoinApplicationKt;
import org.koin.core.scope.Scope;
import p0.a;
import q0.l;
import q0.p;

/* loaded from: classes.dex */
public final class DashboardPageKt {
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, androidx.activity.result.contract.ActivityResultContract] */
    @ComposableTarget
    @Composable
    @SuppressLint({"UnusedMaterial3ScaffoldPaddingParameter", "NewApi"})
    public static final void DashboardPage(@Nullable Composer composer, int i2) {
        float f2;
        ComposerImpl g2 = composer.g(-2132020433);
        if (i2 == 0 && g2.i()) {
            g2.A();
        } else {
            NavHostController b2 = NavHostControllerKt.b(new Navigator[0], g2);
            MultiNavigationAppStateKt.getLocalNavigationState().getDashboardNavigation().setNavController(b2);
            g2.t(414512006);
            Scope currentKoinScope = KoinApplicationKt.currentKoinScope(g2, 0);
            g2.t(1274527078);
            g2.V(false);
            g2.t(511388516);
            boolean I = g2.I(null) | g2.I(currentKoinScope);
            Object u2 = g2.u();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f13690a;
            if (I || u2 == composer$Companion$Empty$1) {
                u2 = t.g(BannerAdViewModel.class, currentKoinScope, null, null, g2);
            }
            g2.V(false);
            g2.V(false);
            BannerAdState bannerAdState = (BannerAdState) SnapshotStateKt.b(((BannerAdViewModel) u2).getState(), g2, 8).getValue();
            Scope q2 = t.q(g2, 414512006, g2, 0, 1274527078);
            boolean y2 = t.y(g2, false, 511388516, null) | g2.I(q2);
            Object u3 = g2.u();
            if (y2 || u3 == composer$Companion$Empty$1) {
                u3 = t.g(IAPViewModel.class, q2, null, null, g2);
            }
            g2.V(false);
            g2.V(false);
            IAPState iAPState = (IAPState) t.f((IAPViewModel) u3, g2, 8);
            Scope q3 = t.q(g2, 414512006, g2, 0, 1274527078);
            boolean y3 = t.y(g2, false, 511388516, null) | g2.I(q3);
            Object u4 = g2.u();
            if (y3 || u4 == composer$Companion$Empty$1) {
                u4 = t.g(OnboardingViewModel.class, q3, null, null, g2);
            }
            g2.V(false);
            g2.V(false);
            OnboardingViewModel onboardingViewModel = (OnboardingViewModel) u4;
            Scope q4 = t.q(g2, 414512006, g2, 0, 1274527078);
            boolean y4 = t.y(g2, false, 511388516, null) | g2.I(q4);
            Object u5 = g2.u();
            if (y4 || u5 == composer$Companion$Empty$1) {
                u5 = t.g(UserGuideViewModel.class, q4, null, null, g2);
            }
            g2.V(false);
            g2.V(false);
            UserGuideViewModel userGuideViewModel = (UserGuideViewModel) u5;
            boolean z2 = bannerAdState.getShouldShowBannerAd() && !iAPState.isPremium();
            boolean shouldShowBottomBar = DashboardUtils.INSTANCE.shouldShowBottomBar(g2, 6);
            if (z2) {
                MyApps myApps = MyApps.INSTANCE;
                f2 = myApps.m11getPAdsBannerD9Ej5fM() + myApps.m10getHeightAdsBannerD9Ej5fM();
            } else {
                f2 = 0;
            }
            float f3 = f2;
            float m9getHNavigationBarPortraitD9Ej5fM = shouldShowBottomBar ? MyApps.INSTANCE.m9getHNavigationBarPortraitD9Ej5fM() : 0;
            ShowStatusBarKt.ShowStatusBar(g2, 0);
            HideNavigationEffectKt.HideNavigationEffect(g2, 0);
            SetRequestedOrientationPortraitKt.SetRequestedOrientationPortrait(false, g2, 0, 1);
            Scope q5 = t.q(g2, 414512006, g2, 0, 1274527078);
            boolean y5 = t.y(g2, false, 511388516, null) | g2.I(q5);
            Object u6 = g2.u();
            if (y5 || u6 == composer$Companion$Empty$1) {
                u6 = t.g(HomeViewModel.class, q5, null, null, g2);
            }
            g2.V(false);
            g2.V(false);
            HomeViewModel homeViewModel = (HomeViewModel) u6;
            HomeState homeState = (HomeState) SnapshotStateKt.b(homeViewModel.getState(), g2, 8).getValue();
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = AndroidCompositionLocals_androidKt.f16325b;
            Context context = (Context) g2.K(staticProvidableCompositionLocal);
            Object K = g2.K(staticProvidableCompositionLocal);
            a.q(K, "null cannot be cast to non-null type android.app.Activity");
            Activity activity = (Activity) K;
            Scope q6 = t.q(g2, 414512006, g2, 0, 1274527078);
            boolean y6 = t.y(g2, false, 511388516, null) | g2.I(q6);
            Object u7 = g2.u();
            if (y6 || u7 == composer$Companion$Empty$1) {
                u7 = t.g(PaywallNavigationViewModel.class, q6, null, null, g2);
            }
            g2.V(false);
            g2.V(false);
            PaywallNavigationViewModel paywallNavigationViewModel = (PaywallNavigationViewModel) u7;
            Scope q7 = t.q(g2, 414512006, g2, 0, 1274527078);
            boolean y7 = t.y(g2, false, 511388516, null) | g2.I(q7);
            Object u8 = g2.u();
            if (y7 || u8 == composer$Companion$Empty$1) {
                u8 = t.g(RewardedAdViewModel.class, q7, null, null, g2);
            }
            g2.V(false);
            g2.V(false);
            InAppUpdate(g2, 0);
            GBAEmulatorAppKt.setLauncher(ActivityResultRegistryKt.a(new Object(), new DashboardPageKt$DashboardPage$1(homeViewModel, context, activity, onboardingViewModel, userGuideViewModel), g2, 8));
            ScaffoldKt.a(null, null, ComposableLambdaKt.c(781547444, new DashboardPageKt$DashboardPage$2(homeViewModel, homeState), g2), null, null, 0, MyColors.INSTANCE.m25getText200d7_KjU(), 0L, null, ComposableLambdaKt.c(1936473086, new DashboardPageKt$DashboardPage$3(f3, m9getHNavigationBarPortraitD9Ej5fM, b2, homeViewModel, homeState, paywallNavigationViewModel, (RewardedAdViewModel) u8, activity, context), g2), g2, 806879616, 443);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new DashboardPageKt$DashboardPage$4(i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, androidx.activity.result.contract.ActivityResultContract] */
    @Composable
    public static final void InAppUpdate(Composer composer, int i2) {
        ComposerImpl g2 = composer.g(-895860591);
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
            AppState appState = (AppState) SnapshotStateKt.b(((AppViewModel) u2).getState(), g2, 8).getValue();
            ManagedActivityResultLauncher a2 = ActivityResultRegistryKt.a(new Object(), DashboardPageKt$InAppUpdate$updateLauncher$1.INSTANCE, g2, 56);
            g2.J(-978349274);
            Object u3 = g2.u();
            if (u3 == composer$Companion$Empty$1) {
                u3 = new InAppUpdateManager(context, appState.getAppUpdateMode());
                g2.o(u3);
            }
            g2.V(false);
            EffectsKt.c(a2, new DashboardPageKt$InAppUpdate$1(context, (InAppUpdateManager) u3, a2), g2);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new DashboardPageKt$InAppUpdate$2(i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget
    @Composable
    public static final void PopupOfferFreeTrial(Modifier modifier, q0.a aVar, q0.a aVar2, Composer composer, int i2) {
        int i3;
        ComposerImpl g2 = composer.g(159254999);
        if ((i2 & 14) == 0) {
            i3 = (g2.I(modifier) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 112) == 0) {
            i3 |= g2.w(aVar) ? 32 : 16;
        }
        if ((i2 & 896) == 0) {
            i3 |= g2.w(aVar2) ? 256 : 128;
        }
        int i4 = i3;
        if ((i4 & 731) == 146 && g2.i()) {
            g2.A();
        } else {
            g2.J(2015719969);
            Object u2 = g2.u();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f13690a;
            if (u2 == composer$Companion$Empty$1) {
                u2 = SnapshotStateKt.f(new Size(0L), StructuralEqualityPolicy.f14078a);
                g2.o(u2);
            }
            MutableState mutableState = (MutableState) u2;
            g2.V(false);
            g2.J(2015721825);
            Object u3 = g2.u();
            if (u3 == composer$Companion$Empty$1) {
                u3 = SnapshotStateKt.f(new Size(0L), StructuralEqualityPolicy.f14078a);
                g2.o(u3);
            }
            MutableState mutableState2 = (MutableState) u3;
            g2.V(false);
            EffectsKt.f(Boolean.TRUE, new DashboardPageKt$PopupOfferFreeTrial$1(null), g2);
            Modifier T0 = modifier.T0(SizeKt.f4107c);
            g2.J(2015728177);
            Object u4 = g2.u();
            if (u4 == composer$Companion$Empty$1) {
                u4 = new DashboardPageKt$PopupOfferFreeTrial$2$1(mutableState2);
                g2.o(u4);
            }
            g2.V(false);
            Modifier a2 = OnGloballyPositionedModifierKt.a(T0, (l) u4);
            MeasurePolicy e = BoxKt.e(Alignment.Companion.f14659a, false);
            int i5 = g2.P;
            PersistentCompositionLocalMap Q = g2.Q();
            Modifier c2 = ComposedModifierKt.c(g2, a2);
            ComposeUiNode.h8.getClass();
            q0.a aVar3 = ComposeUiNode.Companion.f15895b;
            if (!(g2.f13691a instanceof Applier)) {
                ComposablesKt.a();
                throw null;
            }
            g2.z();
            if (g2.O) {
                g2.B(aVar3);
            } else {
                g2.n();
            }
            Updater.b(g2, e, ComposeUiNode.Companion.f15898g);
            Updater.b(g2, Q, ComposeUiNode.Companion.f15897f);
            p pVar = ComposeUiNode.Companion.f15900i;
            if (g2.O || !a.g(g2.u(), Integer.valueOf(i5))) {
                d.x(i5, g2, i5, pVar);
            }
            Updater.b(g2, c2, ComposeUiNode.Companion.d);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f3816a;
            Painter a3 = PainterResources_androidKt.a(R.drawable.free_trial_dialog, g2, 0);
            ContentScale$Companion$FillWidth$1 contentScale$Companion$FillWidth$1 = ContentScale.Companion.d;
            Modifier.Companion companion = Modifier.Companion.f14687a;
            Modifier d = SizeKt.d(companion, 1.0f);
            g2.J(-383364990);
            Object u5 = g2.u();
            if (u5 == composer$Companion$Empty$1) {
                u5 = new DashboardPageKt$PopupOfferFreeTrial$3$1$1(mutableState);
                g2.o(u5);
            }
            g2.V(false);
            Modifier a4 = OnGloballyPositionedModifierKt.a(d, (l) u5);
            g2.J(-383360823);
            boolean z2 = (i4 & 896) == 256;
            Object u6 = g2.u();
            if (z2 || u6 == composer$Companion$Empty$1) {
                u6 = new DashboardPageKt$PopupOfferFreeTrial$3$2$1(aVar2);
                g2.o(u6);
            }
            g2.V(false);
            ImageKt.a(a3, null, ClickableKt.c(a4, false, null, (q0.a) u6, 7), null, contentScale$Companion$FillWidth$1, 0.0f, null, g2, 24632, 104);
            Painter a5 = PainterResources_androidKt.a(MyImages.INSTANCE.getIcClose(), g2, 6);
            Modifier a6 = boxScopeInstance.a(SizeKt.n(PaddingKt.j(companion, 0.0f, ((Size.b(PopupOfferFreeTrial$lambda$16(mutableState2)) - Size.b(PopupOfferFreeTrial$lambda$13(mutableState))) / 2) + 40, 25, 0.0f, 9), 24), Alignment.Companion.f14661c);
            g2.J(-383347253);
            boolean z3 = (i4 & 112) == 32;
            Object u7 = g2.u();
            if (z3 || u7 == composer$Companion$Empty$1) {
                u7 = new DashboardPageKt$PopupOfferFreeTrial$3$3$1(aVar);
                g2.o(u7);
            }
            g2.V(false);
            ImageKt.a(a5, null, ClickableKt.c(a6, false, null, (q0.a) u7, 7), null, null, 0.0f, null, g2, 56, 120);
            g2.V(true);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new DashboardPageKt$PopupOfferFreeTrial$4(modifier, aVar, aVar2, i2);
        }
    }

    private static final long PopupOfferFreeTrial$lambda$13(MutableState<Size> mutableState) {
        return ((Size) mutableState.getValue()).f14923a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void PopupOfferFreeTrial$lambda$14(MutableState<Size> mutableState, long j2) {
        mutableState.setValue(new Size(j2));
    }

    private static final long PopupOfferFreeTrial$lambda$16(MutableState<Size> mutableState) {
        return ((Size) mutableState.getValue()).f14923a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void PopupOfferFreeTrial$lambda$17(MutableState<Size> mutableState, long j2) {
        mutableState.setValue(new Size(j2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget
    @Composable
    public static final void PopupOfferReward2(Modifier modifier, q0.a aVar, q0.a aVar2, Composer composer, int i2) {
        int i3;
        ComposerImpl g2 = composer.g(1730936944);
        if ((i2 & 14) == 0) {
            i3 = (g2.I(modifier) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 112) == 0) {
            i3 |= g2.w(aVar) ? 32 : 16;
        }
        if ((i2 & 896) == 0) {
            i3 |= g2.w(aVar2) ? 256 : 128;
        }
        int i4 = i3;
        if ((i4 & 731) == 146 && g2.i()) {
            g2.A();
        } else {
            g2.J(-960711142);
            Object u2 = g2.u();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f13690a;
            if (u2 == composer$Companion$Empty$1) {
                u2 = SnapshotStateKt.f(new Size(0L), StructuralEqualityPolicy.f14078a);
                g2.o(u2);
            }
            MutableState mutableState = (MutableState) u2;
            g2.V(false);
            g2.J(-960709286);
            Object u3 = g2.u();
            if (u3 == composer$Companion$Empty$1) {
                u3 = SnapshotStateKt.f(new Size(0L), StructuralEqualityPolicy.f14078a);
                g2.o(u3);
            }
            MutableState mutableState2 = (MutableState) u3;
            g2.V(false);
            Modifier T0 = modifier.T0(SizeKt.f4107c);
            g2.J(-960705366);
            Object u4 = g2.u();
            if (u4 == composer$Companion$Empty$1) {
                u4 = new DashboardPageKt$PopupOfferReward2$1$1(mutableState2);
                g2.o(u4);
            }
            g2.V(false);
            Modifier a2 = OnGloballyPositionedModifierKt.a(T0, (l) u4);
            MeasurePolicy e = BoxKt.e(Alignment.Companion.f14659a, false);
            int i5 = g2.P;
            PersistentCompositionLocalMap Q = g2.Q();
            Modifier c2 = ComposedModifierKt.c(g2, a2);
            ComposeUiNode.h8.getClass();
            q0.a aVar3 = ComposeUiNode.Companion.f15895b;
            if (!(g2.f13691a instanceof Applier)) {
                ComposablesKt.a();
                throw null;
            }
            g2.z();
            if (g2.O) {
                g2.B(aVar3);
            } else {
                g2.n();
            }
            Updater.b(g2, e, ComposeUiNode.Companion.f15898g);
            Updater.b(g2, Q, ComposeUiNode.Companion.f15897f);
            p pVar = ComposeUiNode.Companion.f15900i;
            if (g2.O || !a.g(g2.u(), Integer.valueOf(i5))) {
                d.x(i5, g2, i5, pVar);
            }
            Updater.b(g2, c2, ComposeUiNode.Companion.d);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f3816a;
            MyImages myImages = MyImages.INSTANCE;
            Painter a3 = PainterResources_androidKt.a(myImages.getRewardHome2(), g2, 6);
            ContentScale$Companion$FillWidth$1 contentScale$Companion$FillWidth$1 = ContentScale.Companion.d;
            Modifier.Companion companion = Modifier.Companion.f14687a;
            g2.J(-5633925);
            Object u5 = g2.u();
            if (u5 == composer$Companion$Empty$1) {
                u5 = new DashboardPageKt$PopupOfferReward2$2$1$1(mutableState);
                g2.o(u5);
            }
            g2.V(false);
            Modifier a4 = OnGloballyPositionedModifierKt.a(companion, (l) u5);
            g2.J(-5629758);
            boolean z2 = (i4 & 896) == 256;
            Object u6 = g2.u();
            if (z2 || u6 == composer$Companion$Empty$1) {
                u6 = new DashboardPageKt$PopupOfferReward2$2$2$1(aVar2);
                g2.o(u6);
            }
            g2.V(false);
            ImageKt.a(a3, null, ClickableKt.c(a4, false, null, (q0.a) u6, 7), null, contentScale$Companion$FillWidth$1, 0.0f, null, g2, 24632, 104);
            Painter a5 = PainterResources_androidKt.a(myImages.getIcClose(), g2, 6);
            Modifier a6 = boxScopeInstance.a(SizeKt.n(PaddingKt.j(companion, 0.0f, ((Size.b(PopupOfferReward2$lambda$27(mutableState2)) - Size.b(PopupOfferReward2$lambda$24(mutableState))) / 2) + 40, 25, 0.0f, 9), 24), Alignment.Companion.f14661c);
            g2.J(-5616188);
            boolean z3 = (i4 & 112) == 32;
            Object u7 = g2.u();
            if (z3 || u7 == composer$Companion$Empty$1) {
                u7 = new DashboardPageKt$PopupOfferReward2$2$3$1(aVar);
                g2.o(u7);
            }
            g2.V(false);
            ImageKt.a(a5, null, ClickableKt.c(a6, false, null, (q0.a) u7, 7), null, null, 0.0f, null, g2, 56, 120);
            g2.V(true);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new DashboardPageKt$PopupOfferReward2$3(modifier, aVar, aVar2, i2);
        }
    }

    private static final long PopupOfferReward2$lambda$24(MutableState<Size> mutableState) {
        return ((Size) mutableState.getValue()).f14923a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void PopupOfferReward2$lambda$25(MutableState<Size> mutableState, long j2) {
        mutableState.setValue(new Size(j2));
    }

    private static final long PopupOfferReward2$lambda$27(MutableState<Size> mutableState) {
        return ((Size) mutableState.getValue()).f14923a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void PopupOfferReward2$lambda$28(MutableState<Size> mutableState, long j2) {
        mutableState.setValue(new Size(j2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget
    @Composable
    public static final void PopupOfferReward3(Modifier modifier, q0.a aVar, q0.a aVar2, Composer composer, int i2) {
        int i3;
        ComposerImpl g2 = composer.g(1089850801);
        if ((i2 & 14) == 0) {
            i3 = (g2.I(modifier) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 112) == 0) {
            i3 |= g2.w(aVar) ? 32 : 16;
        }
        if ((i2 & 896) == 0) {
            i3 |= g2.w(aVar2) ? 256 : 128;
        }
        int i4 = i3;
        if ((i4 & 731) == 146 && g2.i()) {
            g2.A();
        } else {
            g2.J(-960796645);
            Object u2 = g2.u();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f13690a;
            if (u2 == composer$Companion$Empty$1) {
                u2 = SnapshotStateKt.f(new Size(0L), StructuralEqualityPolicy.f14078a);
                g2.o(u2);
            }
            MutableState mutableState = (MutableState) u2;
            g2.V(false);
            g2.J(-960794789);
            Object u3 = g2.u();
            if (u3 == composer$Companion$Empty$1) {
                u3 = SnapshotStateKt.f(new Size(0L), StructuralEqualityPolicy.f14078a);
                g2.o(u3);
            }
            MutableState mutableState2 = (MutableState) u3;
            g2.V(false);
            EffectsKt.f(b0.f30125a, new DashboardPageKt$PopupOfferReward3$1(null), g2);
            Modifier T0 = modifier.T0(SizeKt.f4107c);
            g2.J(-960788373);
            Object u4 = g2.u();
            if (u4 == composer$Companion$Empty$1) {
                u4 = new DashboardPageKt$PopupOfferReward3$2$1(mutableState2);
                g2.o(u4);
            }
            g2.V(false);
            Modifier a2 = OnGloballyPositionedModifierKt.a(T0, (l) u4);
            MeasurePolicy e = BoxKt.e(Alignment.Companion.f14659a, false);
            int i5 = g2.P;
            PersistentCompositionLocalMap Q = g2.Q();
            Modifier c2 = ComposedModifierKt.c(g2, a2);
            ComposeUiNode.h8.getClass();
            q0.a aVar3 = ComposeUiNode.Companion.f15895b;
            if (!(g2.f13691a instanceof Applier)) {
                ComposablesKt.a();
                throw null;
            }
            g2.z();
            if (g2.O) {
                g2.B(aVar3);
            } else {
                g2.n();
            }
            Updater.b(g2, e, ComposeUiNode.Companion.f15898g);
            Updater.b(g2, Q, ComposeUiNode.Companion.f15897f);
            p pVar = ComposeUiNode.Companion.f15900i;
            if (g2.O || !a.g(g2.u(), Integer.valueOf(i5))) {
                d.x(i5, g2, i5, pVar);
            }
            Updater.b(g2, c2, ComposeUiNode.Companion.d);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f3816a;
            MyImages myImages = MyImages.INSTANCE;
            Painter a3 = PainterResources_androidKt.a(myImages.getRewardHome1(), g2, 6);
            ContentScale$Companion$FillWidth$1 contentScale$Companion$FillWidth$1 = ContentScale.Companion.d;
            Modifier.Companion companion = Modifier.Companion.f14687a;
            g2.J(1501833916);
            Object u5 = g2.u();
            if (u5 == composer$Companion$Empty$1) {
                u5 = new DashboardPageKt$PopupOfferReward3$3$1$1(mutableState);
                g2.o(u5);
            }
            g2.V(false);
            Modifier a4 = OnGloballyPositionedModifierKt.a(companion, (l) u5);
            g2.J(1501838083);
            boolean z2 = (i4 & 896) == 256;
            Object u6 = g2.u();
            if (z2 || u6 == composer$Companion$Empty$1) {
                u6 = new DashboardPageKt$PopupOfferReward3$3$2$1(aVar2);
                g2.o(u6);
            }
            g2.V(false);
            ImageKt.a(a3, null, ClickableKt.c(a4, false, null, (q0.a) u6, 7), null, contentScale$Companion$FillWidth$1, 0.0f, null, g2, 24632, 104);
            Painter a5 = PainterResources_androidKt.a(myImages.getIcClose(), g2, 6);
            Modifier a6 = boxScopeInstance.a(SizeKt.n(PaddingKt.j(companion, 0.0f, ((Size.b(PopupOfferReward3$lambda$5(mutableState2)) - Size.b(PopupOfferReward3$lambda$2(mutableState))) / 2) + 40, 25, 0.0f, 9), 24), Alignment.Companion.f14661c);
            g2.J(1501851653);
            boolean z3 = (i4 & 112) == 32;
            Object u7 = g2.u();
            if (z3 || u7 == composer$Companion$Empty$1) {
                u7 = new DashboardPageKt$PopupOfferReward3$3$3$1(aVar);
                g2.o(u7);
            }
            g2.V(false);
            ImageKt.a(a5, null, ClickableKt.c(a6, false, null, (q0.a) u7, 7), null, null, 0.0f, null, g2, 56, 120);
            g2.V(true);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new DashboardPageKt$PopupOfferReward3$4(modifier, aVar, aVar2, i2);
        }
    }

    private static final long PopupOfferReward3$lambda$2(MutableState<Size> mutableState) {
        return ((Size) mutableState.getValue()).f14923a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void PopupOfferReward3$lambda$3(MutableState<Size> mutableState, long j2) {
        mutableState.setValue(new Size(j2));
    }

    private static final long PopupOfferReward3$lambda$5(MutableState<Size> mutableState) {
        return ((Size) mutableState.getValue()).f14923a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void PopupOfferReward3$lambda$6(MutableState<Size> mutableState, long j2) {
        mutableState.setValue(new Size(j2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget
    @Composable
    public static final void Toast(Modifier modifier, Composer composer, int i2) {
        int i3;
        ComposerImpl g2 = composer.g(-689401092);
        if ((i2 & 14) == 0) {
            i3 = (g2.I(modifier) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 11) == 2 && g2.i()) {
            g2.A();
        } else {
            Scope q2 = t.q(g2, 414512006, g2, 0, 1274527078);
            boolean y2 = t.y(g2, false, 511388516, null) | g2.I(q2);
            Object u2 = g2.u();
            if (y2 || u2 == Composer.Companion.f13690a) {
                u2 = t.g(HomeViewModel.class, q2, null, null, g2);
            }
            g2.V(false);
            g2.V(false);
            EffectsKt.f(b0.f30125a, new DashboardPageKt$Toast$1((HomeViewModel) u2, null), g2);
            Modifier j2 = PaddingKt.j(modifier.T0(SizeKt.f4107c), 0.0f, 100, 0.0f, 0.0f, 13);
            MeasurePolicy e = BoxKt.e(Alignment.Companion.f14659a, false);
            int i4 = g2.P;
            PersistentCompositionLocalMap Q = g2.Q();
            Modifier c2 = ComposedModifierKt.c(g2, j2);
            ComposeUiNode.h8.getClass();
            q0.a aVar = ComposeUiNode.Companion.f15895b;
            if (!(g2.f13691a instanceof Applier)) {
                ComposablesKt.a();
                throw null;
            }
            g2.z();
            if (g2.O) {
                g2.B(aVar);
            } else {
                g2.n();
            }
            Updater.b(g2, e, ComposeUiNode.Companion.f15898g);
            Updater.b(g2, Q, ComposeUiNode.Companion.f15897f);
            p pVar = ComposeUiNode.Companion.f15900i;
            if (g2.O || !a.g(g2.u(), Integer.valueOf(i4))) {
                d.x(i4, g2, i4, pVar);
            }
            Updater.b(g2, c2, ComposeUiNode.Companion.d);
            ImageKt.a(PainterResources_androidKt.a(MyImages.INSTANCE.getToast(), g2, 6), null, null, null, ContentScale.Companion.d, 0.0f, null, g2, 24632, 108);
            g2.V(true);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new DashboardPageKt$Toast$3(modifier, i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void homeWrapperGraph(NavGraphBuilder navGraphBuilder) {
        NavGraphBuilder navGraphBuilder2 = new NavGraphBuilder(navGraphBuilder.f20464h, RouterName.HOME, RouterName.HOME_WRAPPER);
        ComposableSingletons$DashboardPageKt composableSingletons$DashboardPageKt = ComposableSingletons$DashboardPageKt.INSTANCE;
        NavGraphBuilderKt.a(navGraphBuilder2, RouterName.HOME, null, composableSingletons$DashboardPageKt.m123getLambda5$gba_v1_0_35_54__09Apr2025_1046_release(), 254);
        NavGraphBuilderKt.a(navGraphBuilder2, "view-all?id={id}", f0.u(NamedNavArgumentKt.a("id", DashboardPageKt$homeWrapperGraph$1$1.INSTANCE)), composableSingletons$DashboardPageKt.m124getLambda6$gba_v1_0_35_54__09Apr2025_1046_release(), 252);
        navGraphBuilder.f20468l.add(navGraphBuilder2.a());
    }
}
