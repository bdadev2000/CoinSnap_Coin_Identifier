package com.cooldev.gba.emulator.gameboy.features.onboarding.page;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import com.cooldev.gba.emulator.gameboy.features.admob.banner_ads.logic.BannerAdOnboardingState;
import com.cooldev.gba.emulator.gameboy.features.admob.banner_ads.page.BannerAdOnboardingViewKt;
import d0.b0;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.Nullable;
import q0.p;

/* loaded from: classes3.dex */
public final class OnboardingPageKt$OnboardingPage$3 extends r implements p {
    final /* synthetic */ BannerAdOnboardingState $bannerAdOnboardingState;
    final /* synthetic */ boolean $bannerAdVisible;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingPageKt$OnboardingPage$3(boolean z2, BannerAdOnboardingState bannerAdOnboardingState) {
        super(2);
        this.$bannerAdVisible = z2;
        this.$bannerAdOnboardingState = bannerAdOnboardingState;
    }

    @Override // q0.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return b0.f30125a;
    }

    @ComposableTarget
    @Composable
    public final void invoke(@Nullable Composer composer, int i2) {
        if ((i2 & 11) == 2 && composer.i()) {
            composer.A();
        } else if (this.$bannerAdVisible) {
            BannerAdOnboardingViewKt.BannerAdOnboardingView(this.$bannerAdOnboardingState.getAdView(), composer, 8);
        }
    }
}
