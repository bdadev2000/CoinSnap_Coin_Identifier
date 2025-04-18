package com.cooldev.gba.emulator.gameboy.features.paywalls.logic;

import com.android.billingclient.api.SkuDetails;
import e0.u;
import java.util.List;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import p0.a;
import q0.l;

/* loaded from: classes.dex */
public final class IAPViewModel$fetchSkuDetailsAndUpdateList$2$1$1 extends r implements l {
    final /* synthetic */ List<SkuDetails> $currentList;
    final /* synthetic */ List<SkuDetails> $skuDetailsList;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IAPViewModel$fetchSkuDetailsAndUpdateList$2$1$1(List<? extends SkuDetails> list, List<SkuDetails> list2) {
        super(1);
        this.$currentList = list;
        this.$skuDetailsList = list2;
    }

    @Override // q0.l
    @NotNull
    public final IAPState invoke(@NotNull IAPState iAPState) {
        a.s(iAPState, "it");
        List<SkuDetails> list = this.$currentList;
        List<SkuDetails> list2 = this.$skuDetailsList;
        a.r(list2, "$skuDetailsList");
        return IAPState.copy$default(iAPState, u.P0(list2, list), null, false, false, null, 30, null);
    }
}
