package com.cooldev.gba.emulator.gameboy.features.admob.rewarded_ad.logic;

import h0.g;
import j0.c;
import j0.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.objectweb.asm.Opcodes;

@e(c = "com.cooldev.gba.emulator.gameboy.features.admob.rewarded_ad.logic.RewardedAdViewModel", f = "RewardedAdViewModel.kt", l = {57, Opcodes.V15}, m = "initializeAd")
/* loaded from: classes.dex */
public final class RewardedAdViewModel$initializeAd$1 extends c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RewardedAdViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RewardedAdViewModel$initializeAd$1(RewardedAdViewModel rewardedAdViewModel, g gVar) {
        super(gVar);
        this.this$0 = rewardedAdViewModel;
    }

    @Override // j0.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.initializeAd(this);
    }
}
