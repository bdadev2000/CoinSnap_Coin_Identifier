package com.cooldev.gba.emulator.gameboy.features.admob.banner_ads.logic;

import d0.b0;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import p0.a;
import q0.l;

/* loaded from: classes.dex */
public final class BannerAdOnboardingViewModel$loadAd$3 extends r implements l {
    final /* synthetic */ BannerAdOnboardingViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BannerAdOnboardingViewModel$loadAd$3(BannerAdOnboardingViewModel bannerAdOnboardingViewModel) {
        super(1);
        this.this$0 = bannerAdOnboardingViewModel;
    }

    @Override // q0.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((String) obj);
        return b0.f30125a;
    }

    public final void invoke(@NotNull String str) {
        a.s(str, "it");
        this.this$0.handleAdLoadFailure();
    }
}
