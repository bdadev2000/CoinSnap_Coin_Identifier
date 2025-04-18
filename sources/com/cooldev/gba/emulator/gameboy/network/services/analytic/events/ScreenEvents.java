package com.cooldev.gba.emulator.gameboy.network.services.analytic.events;

import androidx.compose.runtime.internal.StabilityInferred;
import com.cooldev.gba.emulator.gameboy.network.services.analytic.FirebaseAnalyticsManager;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
/* loaded from: classes4.dex */
public final class ScreenEvents {
    public static final int $stable = 0;

    @NotNull
    private static final String FIRST_LOADING_SCREEN = "first_loading_screen";

    @NotNull
    private static final String HOME_SCREEN = "home_screen";

    @NotNull
    public static final ScreenEvents INSTANCE = new ScreenEvents();

    @NotNull
    private static final String INTRO_SCREEN = "intro_screen";

    @NotNull
    private static final String ONBOARDING_SCREEN = "onboarding_screen";

    @NotNull
    private static final String PAYWALL_SCREEN = "paywall_screen";

    private ScreenEvents() {
    }

    public final void logFirstLoadingScreen() {
        FirebaseAnalyticsManager.logEvent$default(FirebaseAnalyticsManager.INSTANCE, FIRST_LOADING_SCREEN, null, 2, null);
    }

    public final void logHomeScreen() {
        FirebaseAnalyticsManager.logEvent$default(FirebaseAnalyticsManager.INSTANCE, HOME_SCREEN, null, 2, null);
    }

    public final void logIntroScreen() {
        FirebaseAnalyticsManager.logEvent$default(FirebaseAnalyticsManager.INSTANCE, INTRO_SCREEN, null, 2, null);
    }

    public final void logOnboardingScreen() {
        FirebaseAnalyticsManager.logEvent$default(FirebaseAnalyticsManager.INSTANCE, ONBOARDING_SCREEN, null, 2, null);
    }

    public final void logPaywallScreen() {
        FirebaseAnalyticsManager.logEvent$default(FirebaseAnalyticsManager.INSTANCE, PAYWALL_SCREEN, null, 2, null);
    }
}
