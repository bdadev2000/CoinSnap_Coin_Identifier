package com.cooldev.gba.emulator.gameboy.features.overlays.paywalls.paywall_weekly_non_trial;

import com.cooldev.gba.emulator.gameboy.features.overlays.paywalls.logic.PurchaseOverlayViewModel;
import com.cooldev.gba.emulator.gameboy.network.services.analytic.events.PaywallEvents;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.a;

/* loaded from: classes.dex */
public final class PaywallWeeklyNonTrialOverlayKt$PaywallWeeklyNonTrialOverlay$3$1$2 extends r implements a {
    final /* synthetic */ PurchaseOverlayViewModel $purchaseOverlayViewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaywallWeeklyNonTrialOverlayKt$PaywallWeeklyNonTrialOverlay$3$1$2(PurchaseOverlayViewModel purchaseOverlayViewModel) {
        super(0);
        this.$purchaseOverlayViewModel = purchaseOverlayViewModel;
    }

    @Override // q0.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m286invoke();
        return b0.f30125a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m286invoke() {
        PaywallEvents.INSTANCE.logClickClosePaywall();
        this.$purchaseOverlayViewModel.hideOverlay();
    }
}
