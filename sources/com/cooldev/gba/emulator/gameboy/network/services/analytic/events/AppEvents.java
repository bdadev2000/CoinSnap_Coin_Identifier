package com.cooldev.gba.emulator.gameboy.network.services.analytic.events;

import androidx.compose.runtime.internal.StabilityInferred;
import com.cooldev.gba.emulator.gameboy.network.services.analytic.FirebaseAnalyticsManager;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
/* loaded from: classes3.dex */
public final class AppEvents {
    public static final int $stable = 0;

    @NotNull
    private static final String CLICK_DIAMOND_NAVIGATE_TO_PAYWALL = "click_diamond_navigate_to_paywall";

    @NotNull
    public static final AppEvents INSTANCE = new AppEvents();

    private AppEvents() {
    }

    public final void logClickDiamondNavigateToPaywall() {
        FirebaseAnalyticsManager.logEvent$default(FirebaseAnalyticsManager.INSTANCE, CLICK_DIAMOND_NAVIGATE_TO_PAYWALL, null, 2, null);
    }
}
