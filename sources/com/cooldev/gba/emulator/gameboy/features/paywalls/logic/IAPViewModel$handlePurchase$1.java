package com.cooldev.gba.emulator.gameboy.features.paywalls.logic;

import com.android.billingclient.api.Purchase;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import p0.a;
import q0.l;

/* loaded from: classes.dex */
public final class IAPViewModel$handlePurchase$1 extends r implements l {
    final /* synthetic */ Purchase $purchase;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IAPViewModel$handlePurchase$1(Purchase purchase) {
        super(1);
        this.$purchase = purchase;
    }

    @Override // q0.l
    @NotNull
    public final IAPState invoke(@NotNull IAPState iAPState) {
        a.s(iAPState, "it");
        return IAPState.copy$default(iAPState, null, null, false, false, this.$purchase, 15, null);
    }
}
