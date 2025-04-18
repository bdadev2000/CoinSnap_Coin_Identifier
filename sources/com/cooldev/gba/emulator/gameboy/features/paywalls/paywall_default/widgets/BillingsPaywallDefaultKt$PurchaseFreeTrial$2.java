package com.cooldev.gba.emulator.gameboy.features.paywalls.paywall_default.widgets;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.android.billingclient.api.SkuDetails;
import com.cooldev.gba.emulator.gameboy.features.paywalls.enums.BillingEnum;
import com.cooldev.gba.emulator.gameboy.features.paywalls.logic.IAPViewModel;
import d0.b0;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.Nullable;
import q0.p;

/* loaded from: classes3.dex */
public final class BillingsPaywallDefaultKt$PurchaseFreeTrial$2 extends r implements p {
    final /* synthetic */ int $$changed;
    final /* synthetic */ BillingEnum $billingEnum;
    final /* synthetic */ IAPViewModel $iapViewModel;
    final /* synthetic */ SkuDetails $item;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BillingsPaywallDefaultKt$PurchaseFreeTrial$2(IAPViewModel iAPViewModel, SkuDetails skuDetails, BillingEnum billingEnum, int i2) {
        super(2);
        this.$iapViewModel = iAPViewModel;
        this.$item = skuDetails;
        this.$billingEnum = billingEnum;
        this.$$changed = i2;
    }

    @Override // q0.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return b0.f30125a;
    }

    public final void invoke(@Nullable Composer composer, int i2) {
        BillingsPaywallDefaultKt.PurchaseFreeTrial(this.$iapViewModel, this.$item, this.$billingEnum, composer, RecomposeScopeImplKt.a(this.$$changed | 1));
    }
}
