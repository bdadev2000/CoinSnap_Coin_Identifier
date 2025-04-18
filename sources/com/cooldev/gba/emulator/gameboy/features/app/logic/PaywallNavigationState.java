package com.cooldev.gba.emulator.gameboy.features.app.logic;

import android.support.v4.media.d;
import androidx.compose.runtime.internal.StabilityInferred;
import com.cooldev.gba.emulator.gameboy.features.paywalls.enums.PaywallType;
import java.util.Iterator;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
/* loaded from: classes3.dex */
public final class PaywallNavigationState {
    public static final int $stable = 0;
    private final int numberCodePaywall;

    public PaywallNavigationState() {
        this(0, 1, null);
    }

    public static /* synthetic */ PaywallNavigationState copy$default(PaywallNavigationState paywallNavigationState, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = paywallNavigationState.numberCodePaywall;
        }
        return paywallNavigationState.copy(i2);
    }

    public final int component1() {
        return this.numberCodePaywall;
    }

    @NotNull
    public final PaywallNavigationState copy(int i2) {
        return new PaywallNavigationState(i2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PaywallNavigationState) && this.numberCodePaywall == ((PaywallNavigationState) obj).numberCodePaywall;
    }

    public final int getNumberCodePaywall() {
        return this.numberCodePaywall;
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
        return Integer.hashCode(this.numberCodePaywall);
    }

    @NotNull
    public String toString() {
        return d.o(new StringBuilder("PaywallNavigationState(numberCodePaywall="), this.numberCodePaywall, ')');
    }

    public PaywallNavigationState(int i2) {
        this.numberCodePaywall = i2;
    }

    public /* synthetic */ PaywallNavigationState(int i2, int i3, k kVar) {
        this((i3 & 1) != 0 ? 0 : i2);
    }
}
