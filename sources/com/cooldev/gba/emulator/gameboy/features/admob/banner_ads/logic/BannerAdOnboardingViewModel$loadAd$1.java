package com.cooldev.gba.emulator.gameboy.features.admob.banner_ads.logic;

import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import p0.a;
import q0.l;

/* loaded from: classes.dex */
public final class BannerAdOnboardingViewModel$loadAd$1 extends r implements l {
    public static final BannerAdOnboardingViewModel$loadAd$1 INSTANCE = new BannerAdOnboardingViewModel$loadAd$1();

    public BannerAdOnboardingViewModel$loadAd$1() {
        super(1);
    }

    @Override // q0.l
    @NotNull
    public final BannerAdOnboardingState invoke(@NotNull BannerAdOnboardingState bannerAdOnboardingState) {
        a.s(bannerAdOnboardingState, "it");
        return BannerAdOnboardingState.copy$default(bannerAdOnboardingState, false, null, true, 3, null);
    }
}
