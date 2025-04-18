package com.cooldev.gba.emulator.gameboy.features.admob.banner_ads.logic;

import h0.g;
import j0.c;
import j0.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@e(c = "com.cooldev.gba.emulator.gameboy.features.admob.banner_ads.logic.BannerAdOnboardingViewModel", f = "BannerAdOnboardingViewModel.kt", l = {54}, m = "initializeAd")
/* loaded from: classes.dex */
public final class BannerAdOnboardingViewModel$initializeAd$1 extends c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BannerAdOnboardingViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BannerAdOnboardingViewModel$initializeAd$1(BannerAdOnboardingViewModel bannerAdOnboardingViewModel, g gVar) {
        super(gVar);
        this.this$0 = bannerAdOnboardingViewModel;
    }

    @Override // j0.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.initializeAd(this);
    }
}
