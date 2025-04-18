package com.cooldev.gba.emulator.gameboy.features.intro.page;

import android.content.Context;
import b1.d0;
import b1.f0;
import com.cooldev.gba.emulator.gameboy.features.admob.banner_ads.logic.BannerAdGameViewModel;
import com.cooldev.gba.emulator.gameboy.features.admob.banner_ads.logic.BannerAdOnboardingViewModel;
import com.cooldev.gba.emulator.gameboy.features.admob.banner_ads.logic.BannerAdViewModel;
import com.cooldev.gba.emulator.gameboy.features.admob.interstitial_ad.logic.InterstitialAdViewModel;
import com.cooldev.gba.emulator.gameboy.features.admob.rewarded_ad.logic.RewardedAdViewModel;
import com.cooldev.gba.emulator.gameboy.features.app.logic.AppState;
import com.cooldev.gba.emulator.gameboy.features.app.logic.AppViewModel;
import com.cooldev.gba.emulator.gameboy.features.app.logic.PaywallNavigationViewModel;
import com.cooldev.gba.emulator.gameboy.local.storage.AppPrefUtils;
import com.cooldev.gba.emulator.gameboy.local.storage.InterstitialAdPrefUtils;
import d0.b0;
import h0.g;
import i0.a;
import j0.e;
import j0.i;
import java.util.List;
import kotlin.jvm.internal.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.objectweb.asm.Opcodes;
import q0.p;

@e(c = "com.cooldev.gba.emulator.gameboy.features.intro.page.IntroPageKt$IntroPage$2$result$1", f = "IntroPage.kt", l = {Opcodes.FADD, 111}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class IntroPageKt$IntroPage$2$result$1 extends i implements p {
    final /* synthetic */ AppPrefUtils $appPrefUtils;
    final /* synthetic */ AppState $appState;
    final /* synthetic */ AppViewModel $appViewModel;
    final /* synthetic */ BannerAdGameViewModel $bannerAdGameViewModel;
    final /* synthetic */ BannerAdOnboardingViewModel $bannerAdOnboardingViewModel;
    final /* synthetic */ BannerAdViewModel $bannerAdViewModel;
    final /* synthetic */ Context $context;
    final /* synthetic */ InterstitialAdPrefUtils $interstitialAdPrefUtils;
    final /* synthetic */ InterstitialAdViewModel $interstitialAdViewModel;
    final /* synthetic */ boolean $isOnboardingVisible;
    final /* synthetic */ boolean $isPremium;
    final /* synthetic */ PaywallNavigationViewModel $paywallNavigationViewModel;
    final /* synthetic */ RewardedAdViewModel $rewardedAdViewModel;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntroPageKt$IntroPage$2$result$1(InterstitialAdPrefUtils interstitialAdPrefUtils, Context context, AppPrefUtils appPrefUtils, AppViewModel appViewModel, boolean z2, AppState appState, boolean z3, PaywallNavigationViewModel paywallNavigationViewModel, BannerAdViewModel bannerAdViewModel, BannerAdGameViewModel bannerAdGameViewModel, BannerAdOnboardingViewModel bannerAdOnboardingViewModel, InterstitialAdViewModel interstitialAdViewModel, RewardedAdViewModel rewardedAdViewModel, g gVar) {
        super(2, gVar);
        this.$interstitialAdPrefUtils = interstitialAdPrefUtils;
        this.$context = context;
        this.$appPrefUtils = appPrefUtils;
        this.$appViewModel = appViewModel;
        this.$isOnboardingVisible = z2;
        this.$appState = appState;
        this.$isPremium = z3;
        this.$paywallNavigationViewModel = paywallNavigationViewModel;
        this.$bannerAdViewModel = bannerAdViewModel;
        this.$bannerAdGameViewModel = bannerAdGameViewModel;
        this.$bannerAdOnboardingViewModel = bannerAdOnboardingViewModel;
        this.$interstitialAdViewModel = interstitialAdViewModel;
        this.$rewardedAdViewModel = rewardedAdViewModel;
    }

    @Override // j0.a
    @NotNull
    public final g create(@Nullable Object obj, @NotNull g gVar) {
        IntroPageKt$IntroPage$2$result$1 introPageKt$IntroPage$2$result$1 = new IntroPageKt$IntroPage$2$result$1(this.$interstitialAdPrefUtils, this.$context, this.$appPrefUtils, this.$appViewModel, this.$isOnboardingVisible, this.$appState, this.$isPremium, this.$paywallNavigationViewModel, this.$bannerAdViewModel, this.$bannerAdGameViewModel, this.$bannerAdOnboardingViewModel, this.$interstitialAdViewModel, this.$rewardedAdViewModel, gVar);
        introPageKt$IntroPage$2$result$1.L$0 = obj;
        return introPageKt$IntroPage$2$result$1;
    }

    @Override // q0.p
    @Nullable
    public final Object invoke(@NotNull d0 d0Var, @Nullable g gVar) {
        return ((IntroPageKt$IntroPage$2$result$1) create(d0Var, gVar)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        d0 d0Var;
        a aVar = a.f30806a;
        int i2 = this.label;
        if (i2 == 0) {
            q.m(obj);
            d0Var = (d0) this.L$0;
            this.$interstitialAdPrefUtils.setCountShowInterstitialAds(this.$context, 0);
            this.$interstitialAdPrefUtils.setLastTimeShowAds(this.$context, 0L);
            this.$appPrefUtils.setSurveyDialogShown(this.$context, false);
            this.$appPrefUtils.setHasCheckedForUpdate(this.$context, false);
            AppViewModel appViewModel = this.$appViewModel;
            this.L$0 = d0Var;
            this.label = 1;
            if (appViewModel.fetchDataRemoteConfig(this) == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                q.m(obj);
                IntroPageKt.navigateBasedOnAppState(this.$isOnboardingVisible, this.$appState.getShouldShowPurchase(), this.$isPremium, this.$paywallNavigationViewModel);
                return b0.f30125a;
            }
            d0Var = (d0) this.L$0;
            q.m(obj);
        }
        List v2 = f0.v(kotlin.jvm.internal.e.f(d0Var, null, new IntroPageKt$IntroPage$2$result$1$initializationTasks$1(this.$bannerAdViewModel, null), 3), kotlin.jvm.internal.e.f(d0Var, null, new IntroPageKt$IntroPage$2$result$1$initializationTasks$2(this.$bannerAdGameViewModel, null), 3), kotlin.jvm.internal.e.f(d0Var, null, new IntroPageKt$IntroPage$2$result$1$initializationTasks$3(this.$isOnboardingVisible, this.$bannerAdOnboardingViewModel, null), 3), kotlin.jvm.internal.e.f(d0Var, null, new IntroPageKt$IntroPage$2$result$1$initializationTasks$4(this.$interstitialAdViewModel, null), 3), kotlin.jvm.internal.e.f(d0Var, null, new IntroPageKt$IntroPage$2$result$1$initializationTasks$5(this.$rewardedAdViewModel, null), 3));
        this.L$0 = null;
        this.label = 2;
        if (p0.a.h(v2, this) == aVar) {
            return aVar;
        }
        IntroPageKt.navigateBasedOnAppState(this.$isOnboardingVisible, this.$appState.getShouldShowPurchase(), this.$isPremium, this.$paywallNavigationViewModel);
        return b0.f30125a;
    }
}
