package com.cooldev.gba.emulator.gameboy.features.admob.banner_ads.logic;

import com.google.android.gms.ads.AdView;
import d0.b0;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import p0.a;
import q0.l;

/* loaded from: classes.dex */
public final class BannerAdOnboardingViewModel$loadAd$2 extends r implements l {
    final /* synthetic */ BannerAdOnboardingViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BannerAdOnboardingViewModel$loadAd$2(BannerAdOnboardingViewModel bannerAdOnboardingViewModel) {
        super(1);
        this.this$0 = bannerAdOnboardingViewModel;
    }

    @Override // q0.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((AdView) obj);
        return b0.f30125a;
    }

    public final void invoke(@NotNull AdView adView) {
        a.s(adView, "adView");
        this.this$0.handleAdLoaded(adView);
    }
}
