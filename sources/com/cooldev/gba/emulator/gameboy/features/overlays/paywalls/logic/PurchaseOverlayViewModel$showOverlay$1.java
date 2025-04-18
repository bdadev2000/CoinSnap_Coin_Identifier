package com.cooldev.gba.emulator.gameboy.features.overlays.paywalls.logic;

import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import p0.a;
import q0.l;

/* loaded from: classes2.dex */
public final class PurchaseOverlayViewModel$showOverlay$1 extends r implements l {
    public static final PurchaseOverlayViewModel$showOverlay$1 INSTANCE = new PurchaseOverlayViewModel$showOverlay$1();

    public PurchaseOverlayViewModel$showOverlay$1() {
        super(1);
    }

    @Override // q0.l
    @NotNull
    public final PurchaseOverlayState invoke(@NotNull PurchaseOverlayState purchaseOverlayState) {
        a.s(purchaseOverlayState, "it");
        return PurchaseOverlayState.copy$default(purchaseOverlayState, true, 0, 2, null);
    }
}
