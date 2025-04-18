package com.cooldev.gba.emulator.gameboy.network.services.analytic.events;

import androidx.compose.runtime.internal.StabilityInferred;
import com.cooldev.gba.emulator.gameboy.network.services.analytic.FirebaseAnalyticsManager;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
/* loaded from: classes2.dex */
public final class IntroEvents {
    public static final int $stable = 0;

    @NotNull
    public static final IntroEvents INSTANCE = new IntroEvents();

    @NotNull
    private static final String INTRO_NAVIGATE_TO_ONBOARDING = "intro_navigate_to_onboarding";

    @NotNull
    private static final String INTRO_NAVIGATE_TO_PAYWALL = "intro_navigate_to_paywall";

    private IntroEvents() {
    }

    public final void logIntroNavigateToOnboarding() {
        FirebaseAnalyticsManager.logEvent$default(FirebaseAnalyticsManager.INSTANCE, INTRO_NAVIGATE_TO_ONBOARDING, null, 2, null);
    }

    public final void logIntroNavigateToPaywall() {
        FirebaseAnalyticsManager.logEvent$default(FirebaseAnalyticsManager.INSTANCE, INTRO_NAVIGATE_TO_PAYWALL, null, 2, null);
    }
}
