package com.cooldev.gba.emulator.gameboy.features.paywalls.logic;

import h0.g;
import j0.c;
import j0.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@e(c = "com.cooldev.gba.emulator.gameboy.features.paywalls.logic.IAPViewModel", f = "IAPViewModel.kt", l = {234, 235}, m = "getCurrentPurchased")
/* loaded from: classes.dex */
public final class IAPViewModel$getCurrentPurchased$1 extends c {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ IAPViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IAPViewModel$getCurrentPurchased$1(IAPViewModel iAPViewModel, g gVar) {
        super(gVar);
        this.this$0 = iAPViewModel;
    }

    @Override // j0.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object currentPurchased;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        currentPurchased = this.this$0.getCurrentPurchased(this);
        return currentPurchased;
    }
}
