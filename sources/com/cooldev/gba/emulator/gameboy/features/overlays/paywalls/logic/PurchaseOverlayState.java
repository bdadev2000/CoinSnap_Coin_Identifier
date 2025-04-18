package com.cooldev.gba.emulator.gameboy.features.overlays.paywalls.logic;

import android.support.v4.media.d;
import androidx.compose.runtime.internal.StabilityInferred;
import com.cooldev.gba.emulator.gameboy.features.paywalls.enums.PaywallType;
import java.util.Iterator;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
/* loaded from: classes3.dex */
public final class PurchaseOverlayState {
    public static final int $stable = 0;
    private final int numberCodePaywall;
    private final boolean overlayVisible;

    public PurchaseOverlayState() {
        this(false, 0 == true ? 1 : 0, 3, null);
    }

    public static /* synthetic */ PurchaseOverlayState copy$default(PurchaseOverlayState purchaseOverlayState, boolean z2, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            z2 = purchaseOverlayState.overlayVisible;
        }
        if ((i3 & 2) != 0) {
            i2 = purchaseOverlayState.numberCodePaywall;
        }
        return purchaseOverlayState.copy(z2, i2);
    }

    public final boolean component1() {
        return this.overlayVisible;
    }

    public final int component2() {
        return this.numberCodePaywall;
    }

    @NotNull
    public final PurchaseOverlayState copy(boolean z2, int i2) {
        return new PurchaseOverlayState(z2, i2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PurchaseOverlayState)) {
            return false;
        }
        PurchaseOverlayState purchaseOverlayState = (PurchaseOverlayState) obj;
        return this.overlayVisible == purchaseOverlayState.overlayVisible && this.numberCodePaywall == purchaseOverlayState.numberCodePaywall;
    }

    public final int getNumberCodePaywall() {
        return this.numberCodePaywall;
    }

    public final boolean getOverlayVisible() {
        return this.overlayVisible;
    }

    @NotNull
    public final PaywallType getPaywallType() {
        Object obj;
        Iterator<E> it = PaywallType.getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((PaywallType) obj).getNumberCode() == this.numberCodePaywall) {
                break;
            }
        }
        PaywallType paywallType = (PaywallType) obj;
        return paywallType == null ? PaywallType.DEFAULT : paywallType;
    }

    public int hashCode() {
        return Integer.hashCode(this.numberCodePaywall) + (Boolean.hashCode(this.overlayVisible) * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("PurchaseOverlayState(overlayVisible=");
        sb.append(this.overlayVisible);
        sb.append(", numberCodePaywall=");
        return d.o(sb, this.numberCodePaywall, ')');
    }

    public PurchaseOverlayState(boolean z2, int i2) {
        this.overlayVisible = z2;
        this.numberCodePaywall = i2;
    }

    public /* synthetic */ PurchaseOverlayState(boolean z2, int i2, int i3, k kVar) {
        this((i3 & 1) != 0 ? false : z2, (i3 & 2) != 0 ? 0 : i2);
    }
}
