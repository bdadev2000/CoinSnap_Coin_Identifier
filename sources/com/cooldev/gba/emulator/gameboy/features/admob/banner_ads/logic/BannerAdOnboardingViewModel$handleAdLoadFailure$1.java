package com.cooldev.gba.emulator.gameboy.features.admob.banner_ads.logic;

import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import p0.a;
import q0.l;

/* loaded from: classes.dex */
public final class BannerAdOnboardingViewModel$handleAdLoadFailure$1 extends r implements l {
    public static final BannerAdOnboardingViewModel$handleAdLoadFailure$1 INSTANCE = new BannerAdOnboardingViewModel$handleAdLoadFailure$1();

    public BannerAdOnboardingViewModel$handleAdLoadFailure$1() {
        super(1);
    }

    @Override // q0.l
    @NotNull
    public final BannerAdOnboardingState invoke(@NotNull BannerAdOnboardingState bannerAdOnboardingState) {
        a.s(bannerAdOnboardingState, "it");
        return BannerAdOnboardingState.copy$default(bannerAdOnboardingState, false, null, false, 1, null);
    }
}
