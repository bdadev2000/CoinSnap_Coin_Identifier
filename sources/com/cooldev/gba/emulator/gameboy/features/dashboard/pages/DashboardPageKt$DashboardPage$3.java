package com.cooldev.gba.emulator.gameboy.features.dashboard.pages;

import android.app.Activity;
import android.content.Context;
import android.support.v4.media.d;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.navigation.NavHostController;
import androidx.navigation.compose.NavHostKt;
import com.cooldev.gba.emulator.gameboy.features.admob.rewarded_ad.logic.RewardedAdViewModel;
import com.cooldev.gba.emulator.gameboy.features.app.logic.PaywallNavigationViewModel;
import com.cooldev.gba.emulator.gameboy.features.component.BlackOverlayKt;
import com.cooldev.gba.emulator.gameboy.features.dialogs.rating_dialog.page.RatingDialogKt;
import com.cooldev.gba.emulator.gameboy.features.home.logic.HomeState;
import com.cooldev.gba.emulator.gameboy.features.home.logic.HomeViewModel;
import com.cooldev.gba.emulator.gameboy.features.popups.popup_file_and_download.view.PopupFileAndDownloadKt;
import com.cooldev.gba.emulator.gameboy.router.MultiNavigationAppStateKt;
import com.cooldev.gba.emulator.gameboy.router.RouterName;
import com.google.android.gms.location.GeofenceStatusCodes;
import d0.b0;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;
import q0.p;
import q0.q;

/* loaded from: classes.dex */
public final class DashboardPageKt$DashboardPage$3 extends r implements q {
    final /* synthetic */ Activity $activity;
    final /* synthetic */ Context $context;
    final /* synthetic */ HomeState $homeState;
    final /* synthetic */ HomeViewModel $homeViewModel;
    final /* synthetic */ NavHostController $navController;
    final /* synthetic */ float $pBottomBannerAds;
    final /* synthetic */ float $pBottomNavigationBar;
    final /* synthetic */ PaywallNavigationViewModel $paywallNavigationViewModel;
    final /* synthetic */ RewardedAdViewModel $rewardedAdViewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DashboardPageKt$DashboardPage$3(float f2, float f3, NavHostController navHostController, HomeViewModel homeViewModel, HomeState homeState, PaywallNavigationViewModel paywallNavigationViewModel, RewardedAdViewModel rewardedAdViewModel, Activity activity, Context context) {
        super(3);
        this.$pBottomBannerAds = f2;
        this.$pBottomNavigationBar = f3;
        this.$navController = navHostController;
        this.$homeViewModel = homeViewModel;
        this.$homeState = homeState;
        this.$paywallNavigationViewModel = paywallNavigationViewModel;
        this.$rewardedAdViewModel = rewardedAdViewModel;
        this.$activity = activity;
        this.$context = context;
    }

    @Override // q0.q
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((PaddingValues) obj, (Composer) obj2, ((Number) obj3).intValue());
        return b0.f30125a;
    }

    @ComposableTarget
    @Composable
    public final void invoke(@NotNull PaddingValues paddingValues, @Nullable Composer composer, int i2) {
        int i3;
        PaywallNavigationViewModel paywallNavigationViewModel;
        a.s(paddingValues, "levi");
        if ((i2 & 14) == 0) {
            i3 = i2 | (composer.I(paddingValues) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i3 & 91) == 18 && composer.i()) {
            composer.A();
            return;
        }
        Modifier.Companion companion = Modifier.Companion.f14687a;
        Modifier j2 = PaddingKt.j(SizeKt.f4107c, 0.0f, 0.0f, 0.0f, this.$pBottomBannerAds + this.$pBottomNavigationBar, 7);
        NavHostController navHostController = this.$navController;
        HomeViewModel homeViewModel = this.$homeViewModel;
        HomeState homeState = this.$homeState;
        float f2 = this.$pBottomBannerAds;
        float f3 = this.$pBottomNavigationBar;
        PaywallNavigationViewModel paywallNavigationViewModel2 = this.$paywallNavigationViewModel;
        RewardedAdViewModel rewardedAdViewModel = this.$rewardedAdViewModel;
        Activity activity = this.$activity;
        Context context = this.$context;
        MeasurePolicy e = BoxKt.e(Alignment.Companion.f14659a, false);
        int E = composer.E();
        PersistentCompositionLocalMap m2 = composer.m();
        Modifier c2 = ComposedModifierKt.c(composer, j2);
        ComposeUiNode.h8.getClass();
        q0.a aVar = ComposeUiNode.Companion.f15895b;
        if (composer.j() instanceof Applier) {
            composer.z();
            if (composer.e()) {
                composer.B(aVar);
            } else {
                composer.n();
            }
            Updater.b(composer, e, ComposeUiNode.Companion.f15898g);
            Updater.b(composer, m2, ComposeUiNode.Companion.f15897f);
            p pVar = ComposeUiNode.Companion.f15900i;
            if (composer.e() || !a.g(composer.u(), Integer.valueOf(E))) {
                d.w(E, composer, E, pVar);
            }
            Updater.b(composer, c2, ComposeUiNode.Companion.d);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f3816a;
            NavHostKt.b(navHostController, MultiNavigationAppStateKt.getLocalNavigationState().getDashboardNavigation().getGetStartDestination(), null, null, RouterName.DASHBOARD, null, null, null, null, null, DashboardPageKt$DashboardPage$3$1$1.INSTANCE, composer, 24584, 6, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION);
            RatingDialogKt.RatingDialog(false, composer, 6, 0);
            PopupFileAndDownloadKt.PopupFileAndDownload(boxScopeInstance.a(companion, Alignment.Companion.f14664h), composer, 0);
            composer.J(1792582200);
            boolean shouldNavigateToGame$default = HomeViewModel.shouldNavigateToGame$default(homeViewModel, false, 1, null);
            BiasAlignment biasAlignment = Alignment.Companion.e;
            if (!shouldNavigateToGame$default && homeState.isShowOfferFreeTrial() && homeState.isNewFlow()) {
                BlackOverlayKt.BlackOverlay(null, composer, 0, 1);
                paywallNavigationViewModel = paywallNavigationViewModel2;
                DashboardPageKt.PopupOfferFreeTrial(boxScopeInstance.a(PaddingKt.j(companion, 0.0f, f2 + f3, 0.0f, 0.0f, 13), biasAlignment), new DashboardPageKt$DashboardPage$3$1$2(homeViewModel), new DashboardPageKt$DashboardPage$3$1$3(homeViewModel, paywallNavigationViewModel), composer, 0);
            } else {
                paywallNavigationViewModel = paywallNavigationViewModel2;
            }
            composer.D();
            composer.J(1792605728);
            if (!HomeViewModel.shouldNavigateToGame$default(homeViewModel, false, 1, null) && homeState.isShowOfferReward3() && homeState.isShowOfferRewardRemoteConfig()) {
                DashboardPageKt.PopupOfferReward3(boxScopeInstance.a(PaddingKt.j(companion, 0.0f, f2 + f3, 0.0f, 0.0f, 13), biasAlignment), new DashboardPageKt$DashboardPage$3$1$4(homeViewModel), new DashboardPageKt$DashboardPage$3$1$5(homeViewModel, paywallNavigationViewModel), composer, 0);
            }
            composer.D();
            composer.J(1792626076);
            if (!HomeViewModel.shouldNavigateToGame$default(homeViewModel, false, 1, null) && homeState.isShowOfferReward2() && homeState.isShowOfferRewardRemoteConfig()) {
                DashboardPageKt.PopupOfferReward2(boxScopeInstance.a(PaddingKt.j(companion, 0.0f, f2 + f3, 0.0f, 0.0f, 13), biasAlignment), new DashboardPageKt$DashboardPage$3$1$6(homeViewModel), new DashboardPageKt$DashboardPage$3$1$7(homeViewModel, rewardedAdViewModel, activity, context), composer, 0);
            }
            composer.D();
            composer.J(1792662166);
            if (homeState.isShowToast()) {
                DashboardPageKt.Toast(PaddingKt.j(companion, 0.0f, paddingValues.d(), 0.0f, 0.0f, 13), composer, 0);
            }
            composer.D();
            composer.p();
            return;
        }
        ComposablesKt.a();
        throw null;
    }
}
