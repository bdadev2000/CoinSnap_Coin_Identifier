package com.cooldev.gba.emulator.gameboy.features.admob.banner_ads.logic;

import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import p0.a;
import q0.l;

/* loaded from: classes.dex */
public final class BannerAdViewModel$handleAdLoadFailure$1 extends r implements l {
    public static final BannerAdViewModel$handleAdLoadFailure$1 INSTANCE = new BannerAdViewModel$handleAdLoadFailure$1();

    public BannerAdViewModel$handleAdLoadFailure$1() {
        super(1);
    }

    @Override // q0.l
    @NotNull
    public final BannerAdState invoke(@NotNull BannerAdState bannerAdState) {
        a.s(bannerAdState, "it");
        return BannerAdState.copy$default(bannerAdState, false, null, false, 1, null);
    }
}
