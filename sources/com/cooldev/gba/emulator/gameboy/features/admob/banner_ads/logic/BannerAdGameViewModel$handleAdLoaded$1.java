package com.cooldev.gba.emulator.gameboy.features.admob.banner_ads.logic;

import com.google.android.gms.ads.AdView;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import p0.a;
import q0.l;

/* loaded from: classes2.dex */
public final class BannerAdGameViewModel$handleAdLoaded$1 extends r implements l {
    final /* synthetic */ AdView $adView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BannerAdGameViewModel$handleAdLoaded$1(AdView adView) {
        super(1);
        this.$adView = adView;
    }

    @Override // q0.l
    @NotNull
    public final BannerAdState invoke(@NotNull BannerAdState bannerAdState) {
        a.s(bannerAdState, "it");
        return BannerAdState.copy$default(bannerAdState, false, this.$adView, false, 1, null);
    }
}
