package com.cooldev.gba.emulator.gameboy.features.intro.page;

import android.content.Context;
import androidx.compose.runtime.State;
import b1.d0;
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
import kotlin.jvm.internal.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.objectweb.asm.Opcodes;
import q0.p;

@e(c = "com.cooldev.gba.emulator.gameboy.features.intro.page.IntroPageKt$IntroPage$2", f = "IntroPage.kt", l = {Opcodes.DUP2}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class IntroPageKt$IntroPage$2 extends i implements p {
    final /* synthetic */ AppPrefUtils $appPrefUtils;
    final /* synthetic */ AppState $appState;
    final /* synthetic */ AppViewModel $appViewModel;
    final /* synthetic */ BannerAdGameViewModel $bannerAdGameViewModel;
    final /* synthetic */ BannerAdOnboardingViewModel $bannerAdOnboardingViewModel;
    final /* synthetic */ BannerAdViewModel $bannerAdViewModel;
    final /* synthetic */ Context $context;
    final /* synthetic */ InterstitialAdPrefUtils $interstitialAdPrefUtils;
    final /* synthetic */ InterstitialAdViewModel $interstitialAdViewModel;
    final /* synthetic */ State<Boolean> $isConnected$delegate;
    final /* synthetic */ boolean $isOnboardingVisible;
    final /* synthetic */ boolean $isPremium;
    final /* synthetic */ PaywallNavigationViewModel $paywallNavigationViewModel;
    final /* synthetic */ RewardedAdViewModel $rewardedAdViewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntroPageKt$IntroPage$2(boolean z2, AppState appState, boolean z3, PaywallNavigationViewModel paywallNavigationViewModel, State<Boolean> state, InterstitialAdPrefUtils interstitialAdPrefUtils, Context context, AppPrefUtils appPrefUtils, AppViewModel appViewModel, BannerAdViewModel bannerAdViewModel, BannerAdGameViewModel bannerAdGameViewModel, BannerAdOnboardingViewModel bannerAdOnboardingViewModel, InterstitialAdViewModel interstitialAdViewModel, RewardedAdViewModel rewardedAdViewModel, g gVar) {
        super(2, gVar);
        this.$isOnboardingVisible = z2;
        this.$appState = appState;
        this.$isPremium = z3;
        this.$paywallNavigationViewModel = paywallNavigationViewModel;
        this.$isConnected$delegate = state;
        this.$interstitialAdPrefUtils = interstitialAdPrefUtils;
        this.$context = context;
        this.$appPrefUtils = appPrefUtils;
        this.$appViewModel = appViewModel;
        this.$bannerAdViewModel = bannerAdViewModel;
        this.$bannerAdGameViewModel = bannerAdGameViewModel;
        this.$bannerAdOnboardingViewModel = bannerAdOnboardingViewModel;
        this.$interstitialAdViewModel = interstitialAdViewModel;
        this.$rewardedAdViewModel = rewardedAdViewModel;
    }

    @Override // j0.a
    @NotNull
    public final g create(@Nullable Object obj, @NotNull g gVar) {
        return new IntroPageKt$IntroPage$2(this.$isOnboardingVisible, this.$appState, this.$isPremium, this.$paywallNavigationViewModel, this.$isConnected$delegate, this.$interstitialAdPrefUtils, this.$context, this.$appPrefUtils, this.$appViewModel, this.$bannerAdViewModel, this.$bannerAdGameViewModel, this.$bannerAdOnboardingViewModel, this.$interstitialAdViewModel, this.$rewardedAdViewModel, gVar);
    }

    @Override // q0.p
    @Nullable
    public final Object invoke(@NotNull d0 d0Var, @Nullable g gVar) {
        return ((IntroPageKt$IntroPage$2) create(d0Var, gVar)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        boolean IntroPage$lambda$0;
        b0 b0Var;
        Object I0;
        a aVar = a.f30806a;
        int i2 = this.label;
        b0 b0Var2 = b0.f30125a;
        if (i2 == 0) {
            q.m(obj);
            IntroPage$lambda$0 = IntroPageKt.IntroPage$lambda$0(this.$isConnected$delegate);
            if (!IntroPage$lambda$0) {
                return b0Var2;
            }
            b0Var = b0Var2;
            IntroPageKt$IntroPage$2$result$1 introPageKt$IntroPage$2$result$1 = new IntroPageKt$IntroPage$2$result$1(this.$interstitialAdPrefUtils, this.$context, this.$appPrefUtils, this.$appViewModel, this.$isOnboardingVisible, this.$appState, this.$isPremium, this.$paywallNavigationViewModel, this.$bannerAdViewModel, this.$bannerAdGameViewModel, this.$bannerAdOnboardingViewModel, this.$interstitialAdViewModel, this.$rewardedAdViewModel, null);
            this.label = 1;
            I0 = p0.a.I0(15000L, introPageKt$IntroPage$2$result$1, this);
            if (I0 == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q.m(obj);
            I0 = obj;
            b0Var = b0Var2;
        }
        if (((b0) I0) == null) {
            IntroPageKt.navigateBasedOnAppState(this.$isOnboardingVisible, this.$appState.getShouldShowPurchase(), this.$isPremium, this.$paywallNavigationViewModel);
        }
        return b0Var;
    }
}
