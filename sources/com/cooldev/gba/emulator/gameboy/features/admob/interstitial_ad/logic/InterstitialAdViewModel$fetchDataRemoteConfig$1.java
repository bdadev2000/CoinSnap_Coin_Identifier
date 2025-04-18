package com.cooldev.gba.emulator.gameboy.features.admob.interstitial_ad.logic;

import h0.g;
import j0.c;
import j0.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.objectweb.asm.Opcodes;

@e(c = "com.cooldev.gba.emulator.gameboy.features.admob.interstitial_ad.logic.InterstitialAdViewModel", f = "InterstitialAdViewModel.kt", l = {Opcodes.DUP2_X1, Opcodes.SWAP, 96}, m = "fetchDataRemoteConfig")
/* loaded from: classes2.dex */
public final class InterstitialAdViewModel$fetchDataRemoteConfig$1 extends c {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ InterstitialAdViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InterstitialAdViewModel$fetchDataRemoteConfig$1(InterstitialAdViewModel interstitialAdViewModel, g gVar) {
        super(gVar);
        this.this$0 = interstitialAdViewModel;
    }

    @Override // j0.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object fetchDataRemoteConfig;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        fetchDataRemoteConfig = this.this$0.fetchDataRemoteConfig(this);
        return fetchDataRemoteConfig;
    }
}
