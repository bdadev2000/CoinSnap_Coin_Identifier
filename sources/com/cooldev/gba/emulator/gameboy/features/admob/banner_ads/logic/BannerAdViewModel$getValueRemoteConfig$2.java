package com.cooldev.gba.emulator.gameboy.features.admob.banner_ads.logic;

import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import p0.a;
import q0.l;

/* loaded from: classes.dex */
public final class BannerAdViewModel$getValueRemoteConfig$2 extends r implements l {
    final /* synthetic */ boolean $isBannerVisible;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BannerAdViewModel$getValueRemoteConfig$2(boolean z2) {
        super(1);
        this.$isBannerVisible = z2;
    }

    @Override // q0.l
    @NotNull
    public final BannerAdState invoke(@NotNull BannerAdState bannerAdState) {
        a.s(bannerAdState, "it");
        return BannerAdState.copy$default(bannerAdState, this.$isBannerVisible, null, false, 6, null);
    }
}
