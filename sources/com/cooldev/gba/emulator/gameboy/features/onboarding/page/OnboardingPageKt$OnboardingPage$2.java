package com.cooldev.gba.emulator.gameboy.features.onboarding.page;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import com.cooldev.gba.emulator.gameboy.features.admob.banner_ads.logic.BannerAdOnboardingViewModel;
import com.cooldev.gba.emulator.gameboy.network.services.analytic.events.ScreenEvents;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import p0.a;
import q0.l;

/* loaded from: classes3.dex */
public final class OnboardingPageKt$OnboardingPage$2 extends r implements l {
    final /* synthetic */ BannerAdOnboardingViewModel $bannerAdOnboardingViewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingPageKt$OnboardingPage$2(BannerAdOnboardingViewModel bannerAdOnboardingViewModel) {
        super(1);
        this.$bannerAdOnboardingViewModel = bannerAdOnboardingViewModel;
    }

    @Override // q0.l
    @NotNull
    public final DisposableEffectResult invoke(@NotNull DisposableEffectScope disposableEffectScope) {
        a.s(disposableEffectScope, "$this$DisposableEffect");
        ScreenEvents.INSTANCE.logOnboardingScreen();
        this.$bannerAdOnboardingViewModel.retryGetBannerAdView();
        final BannerAdOnboardingViewModel bannerAdOnboardingViewModel = this.$bannerAdOnboardingViewModel;
        return new DisposableEffectResult() { // from class: com.cooldev.gba.emulator.gameboy.features.onboarding.page.OnboardingPageKt$OnboardingPage$2$invoke$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                BannerAdOnboardingViewModel.this.onCleared();
            }
        };
    }
}
