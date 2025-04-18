package com.cooldev.gba.emulator.gameboy.features.paywalls.paywall_default.widgets;

import android.content.Context;
import com.cooldev.gba.emulator.gameboy.features.paywalls.logic.PurchasePageViewModel;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.a;

/* loaded from: classes2.dex */
public final class TermsAndPrivacyPaywallDefaultKt$TermsAndPrivacyPaywallDefault$1$1 extends r implements a {
    final /* synthetic */ Context $context;
    final /* synthetic */ PurchasePageViewModel $purchasePageViewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TermsAndPrivacyPaywallDefaultKt$TermsAndPrivacyPaywallDefault$1$1(PurchasePageViewModel purchasePageViewModel, Context context) {
        super(0);
        this.$purchasePageViewModel = purchasePageViewModel;
        this.$context = context;
    }

    @Override // q0.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m305invoke();
        return b0.f30125a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m305invoke() {
        this.$purchasePageViewModel.onTapTerm(this.$context);
    }
}
