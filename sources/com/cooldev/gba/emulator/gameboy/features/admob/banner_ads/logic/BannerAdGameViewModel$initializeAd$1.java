package com.cooldev.gba.emulator.gameboy.features.admob.banner_ads.logic;

import h0.g;
import j0.c;
import j0.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@e(c = "com.cooldev.gba.emulator.gameboy.features.admob.banner_ads.logic.BannerAdGameViewModel", f = "BannerAdGameViewModel.kt", l = {54}, m = "initializeAd")
/* loaded from: classes2.dex */
public final class BannerAdGameViewModel$initializeAd$1 extends c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BannerAdGameViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BannerAdGameViewModel$initializeAd$1(BannerAdGameViewModel bannerAdGameViewModel, g gVar) {
        super(gVar);
        this.this$0 = bannerAdGameViewModel;
    }

    @Override // j0.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.initializeAd(this);
    }
}
