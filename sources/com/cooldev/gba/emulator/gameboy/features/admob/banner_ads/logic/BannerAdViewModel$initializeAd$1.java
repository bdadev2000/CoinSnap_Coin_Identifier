package com.cooldev.gba.emulator.gameboy.features.admob.banner_ads.logic;

import h0.g;
import j0.c;
import j0.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@e(c = "com.cooldev.gba.emulator.gameboy.features.admob.banner_ads.logic.BannerAdViewModel", f = "BannerAdViewModel.kt", l = {54}, m = "initializeAd")
/* loaded from: classes.dex */
public final class BannerAdViewModel$initializeAd$1 extends c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BannerAdViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BannerAdViewModel$initializeAd$1(BannerAdViewModel bannerAdViewModel, g gVar) {
        super(gVar);
        this.this$0 = bannerAdViewModel;
    }

    @Override // j0.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.initializeAd(this);
    }
}
