package com.cooldev.gba.emulator.gameboy.features.paywalls.paywall_lifetime.widgets;

import android.content.Context;
import androidx.navigation.NavHostController;
import com.android.billingclient.api.SkuDetails;
import com.cooldev.gba.emulator.gameboy.features.MainActivity;
import com.cooldev.gba.emulator.gameboy.features.paywalls.logic.IAPViewModel;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.a;

/* loaded from: classes.dex */
public final class BillingsPaywallLifetimeKt$PurchaseLifetime$1$2 extends r implements a {
    final /* synthetic */ Context $context;
    final /* synthetic */ IAPViewModel $iapViewModel;
    final /* synthetic */ SkuDetails $item;
    final /* synthetic */ NavHostController $navController;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BillingsPaywallLifetimeKt$PurchaseLifetime$1$2(IAPViewModel iAPViewModel, SkuDetails skuDetails, NavHostController navHostController, Context context) {
        super(0);
        this.$iapViewModel = iAPViewModel;
        this.$item = skuDetails;
        this.$navController = navHostController;
        this.$context = context;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m309invoke() {
        IAPViewModel iAPViewModel = this.$iapViewModel;
        SkuDetails skuDetails = this.$item;
        Context context = this.$navController.f20345a;
        p0.a.q(context, "null cannot be cast to non-null type com.cooldev.gba.emulator.gameboy.features.MainActivity");
        iAPViewModel.launchPurchaseFlow(skuDetails, (MainActivity) context, this.$context);
    }

    @Override // q0.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m309invoke();
        return b0.f30125a;
    }
}
