package com.cooldev.gba.emulator.gameboy.features.admob.interstitial_ad.logic;

import h0.g;
import j0.c;
import j0.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.TypeReference;

@e(c = "com.cooldev.gba.emulator.gameboy.features.admob.interstitial_ad.logic.InterstitialAdViewModel", f = "InterstitialAdViewModel.kt", l = {TypeReference.METHOD_REFERENCE, Opcodes.SASTORE}, m = "loadAd")
/* loaded from: classes2.dex */
public final class InterstitialAdViewModel$loadAd$1 extends c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ InterstitialAdViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InterstitialAdViewModel$loadAd$1(InterstitialAdViewModel interstitialAdViewModel, g gVar) {
        super(gVar);
        this.this$0 = interstitialAdViewModel;
    }

    @Override // j0.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object loadAd;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        loadAd = this.this$0.loadAd(this);
        return loadAd;
    }
}
