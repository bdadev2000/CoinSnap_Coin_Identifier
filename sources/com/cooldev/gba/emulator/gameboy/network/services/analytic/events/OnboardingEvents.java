package com.cooldev.gba.emulator.gameboy.network.services.analytic.events;

import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import com.cooldev.gba.emulator.gameboy.network.services.analytic.FirebaseAnalyticsManager;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
/* loaded from: classes.dex */
public final class OnboardingEvents {
    public static final int $stable = 0;

    @NotNull
    private static final String CLICK_ONBOARDING_NEXT1 = "click_onboarding_next1";

    @NotNull
    private static final String CLICK_ONBOARDING_NEXT2 = "click_onboarding_next2";

    @NotNull
    private static final String CLICK_ONBOARDING_NEXT3 = "click_onboarding_start";

    @NotNull
    public static final OnboardingEvents INSTANCE = new OnboardingEvents();

    @NotNull
    private static final String ONBOARDING_NAVIGATE_TO_PAYWALL = "onboarding_navigate_to_paywall";

    private OnboardingEvents() {
    }

    public final void logClickOnboardingNext1() {
        FirebaseAnalyticsManager.logEvent$default(FirebaseAnalyticsManager.INSTANCE, CLICK_ONBOARDING_NEXT1, null, 2, null);
    }

    public final void logClickOnboardingNext2() {
        FirebaseAnalyticsManager.logEvent$default(FirebaseAnalyticsManager.INSTANCE, CLICK_ONBOARDING_NEXT2, null, 2, null);
    }

    public final void logClickOnboardingNext3(boolean z2) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("is_rating_dialog_shown", z2);
        FirebaseAnalyticsManager.INSTANCE.logEvent(CLICK_ONBOARDING_NEXT3, bundle);
    }

    public final void logOnboardingNavigateToPaywall() {
        FirebaseAnalyticsManager.logEvent$default(FirebaseAnalyticsManager.INSTANCE, ONBOARDING_NAVIGATE_TO_PAYWALL, null, 2, null);
    }
}
