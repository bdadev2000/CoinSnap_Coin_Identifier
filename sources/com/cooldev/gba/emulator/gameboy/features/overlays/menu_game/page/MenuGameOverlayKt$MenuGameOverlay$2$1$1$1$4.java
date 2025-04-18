package com.cooldev.gba.emulator.gameboy.features.overlays.menu_game.page;

import com.cooldev.gba.emulator.gameboy.features.overlays.paywalls.logic.PurchaseOverlayViewModel;
import com.cooldev.gba.emulator.gameboy.network.services.analytic.events.GameMenuEvents;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.a;

/* loaded from: classes2.dex */
public final class MenuGameOverlayKt$MenuGameOverlay$2$1$1$1$4 extends r implements a {
    final /* synthetic */ PurchaseOverlayViewModel $purchaseOverlayViewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MenuGameOverlayKt$MenuGameOverlay$2$1$1$1$4(PurchaseOverlayViewModel purchaseOverlayViewModel) {
        super(0);
        this.$purchaseOverlayViewModel = purchaseOverlayViewModel;
    }

    @Override // q0.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m275invoke();
        return b0.f30125a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m275invoke() {
        GameMenuEvents.INSTANCE.logClickAutoSaveMenuGame();
        this.$purchaseOverlayViewModel.showOverlay();
    }
}
