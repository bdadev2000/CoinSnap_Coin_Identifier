package com.cooldev.gba.emulator.gameboy.features.admob.banner_ads.logic;

import com.google.android.gms.ads.AdView;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import p0.a;
import q0.l;

/* loaded from: classes.dex */
public final class BannerAdOnboardingViewModel$handleAdLoaded$1 extends r implements l {
    final /* synthetic */ AdView $adView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BannerAdOnboardingViewModel$handleAdLoaded$1(AdView adView) {
        super(1);
        this.$adView = adView;
    }

    @Override // q0.l
    @NotNull
    public final BannerAdOnboardingState invoke(@NotNull BannerAdOnboardingState bannerAdOnboardingState) {
        a.s(bannerAdOnboardingState, "it");
        return BannerAdOnboardingState.copy$default(bannerAdOnboardingState, false, this.$adView, false, 1, null);
    }
}
