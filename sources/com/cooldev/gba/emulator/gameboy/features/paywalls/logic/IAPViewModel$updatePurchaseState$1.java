package com.cooldev.gba.emulator.gameboy.features.paywalls.logic;

import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import p0.a;
import q0.l;

/* loaded from: classes.dex */
public final class IAPViewModel$updatePurchaseState$1 extends r implements l {
    final /* synthetic */ PurchaseState $newState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IAPViewModel$updatePurchaseState$1(PurchaseState purchaseState) {
        super(1);
        this.$newState = purchaseState;
    }

    @Override // q0.l
    @NotNull
    public final IAPState invoke(@NotNull IAPState iAPState) {
        a.s(iAPState, "it");
        return IAPState.copy$default(iAPState, null, this.$newState, false, false, null, 29, null);
    }
}
