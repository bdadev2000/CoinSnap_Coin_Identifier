package com.cooldev.gba.emulator.gameboy.features.overlays.paywalls.paywall_default;

import com.cooldev.gba.emulator.gameboy.features.overlays.paywalls.logic.PurchaseOverlayViewModel;
import com.cooldev.gba.emulator.gameboy.network.services.analytic.events.PaywallEvents;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.a;

/* loaded from: classes.dex */
public final class PaywallDefaultOverlayKt$PaywallDefaultOverlay$3$1$2 extends r implements a {
    final /* synthetic */ PurchaseOverlayViewModel $purchaseOverlayViewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaywallDefaultOverlayKt$PaywallDefaultOverlay$3$1$2(PurchaseOverlayViewModel purchaseOverlayViewModel) {
        super(0);
        this.$purchaseOverlayViewModel = purchaseOverlayViewModel;
    }

    @Override // q0.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m282invoke();
        return b0.f30125a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m282invoke() {
        PaywallEvents.INSTANCE.logClickClosePaywall();
        this.$purchaseOverlayViewModel.hideOverlay();
    }
}
