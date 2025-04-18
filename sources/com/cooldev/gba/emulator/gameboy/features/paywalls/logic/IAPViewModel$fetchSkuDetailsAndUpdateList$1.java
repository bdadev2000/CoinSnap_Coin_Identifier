package com.cooldev.gba.emulator.gameboy.features.paywalls.logic;

import h0.g;
import j0.c;
import j0.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@e(c = "com.cooldev.gba.emulator.gameboy.features.paywalls.logic.IAPViewModel", f = "IAPViewModel.kt", l = {229, 229, 229}, m = "fetchSkuDetailsAndUpdateList")
/* loaded from: classes.dex */
public final class IAPViewModel$fetchSkuDetailsAndUpdateList$1 extends c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ IAPViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IAPViewModel$fetchSkuDetailsAndUpdateList$1(IAPViewModel iAPViewModel, g gVar) {
        super(gVar);
        this.this$0 = iAPViewModel;
    }

    @Override // j0.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object fetchSkuDetailsAndUpdateList;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        fetchSkuDetailsAndUpdateList = this.this$0.fetchSkuDetailsAndUpdateList(null, this);
        return fetchSkuDetailsAndUpdateList;
    }
}
