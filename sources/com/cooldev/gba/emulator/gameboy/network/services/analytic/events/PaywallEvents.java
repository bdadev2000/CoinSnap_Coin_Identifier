package com.cooldev.gba.emulator.gameboy.network.services.analytic.events;

import androidx.compose.runtime.internal.StabilityInferred;
import com.cooldev.gba.emulator.gameboy.network.services.analytic.FirebaseAnalyticsManager;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
/* loaded from: classes2.dex */
public final class PaywallEvents {
    public static final int $stable = 0;

    @NotNull
    private static final String CLICK_CLOSE_PAYWALL = "click_close_paywall";

    @NotNull
    public static final PaywallEvents INSTANCE = new PaywallEvents();

    private PaywallEvents() {
    }

    public final void logClickClosePaywall() {
        FirebaseAnalyticsManager.logEvent$default(FirebaseAnalyticsManager.INSTANCE, CLICK_CLOSE_PAYWALL, null, 2, null);
    }
}
