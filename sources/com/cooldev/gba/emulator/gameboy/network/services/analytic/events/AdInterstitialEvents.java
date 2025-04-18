package com.cooldev.gba.emulator.gameboy.network.services.analytic.events;

import androidx.compose.runtime.internal.StabilityInferred;
import com.cooldev.gba.emulator.gameboy.network.services.analytic.FirebaseAnalyticsManager;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
/* loaded from: classes2.dex */
public final class AdInterstitialEvents {
    public static final int $stable = 0;

    @NotNull
    private static final String AD_INTERSTITIAL_CLICKED_BOTTOM_NAV = "ad_interstitial_clicked_bottom_nav";

    @NotNull
    private static final String AD_INTERSTITIAL_DISMISSED_BOTTOM_NAV = "ad_interstitial_dismissed_bottom_nav";

    @NotNull
    private static final String AD_INTERSTITIAL_FAILED_TO_LOAD_BOTTOM_NAV = "ad_interstitial_failed_to_load_bottom_nav";

    @NotNull
    private static final String AD_INTERSTITIAL_LOADED_BOTTOM_NAV = "ad_interstitial_loaded_bottom_nav";

    @NotNull
    private static final String AD_INTERSTITIAL_NOT_ENABLED_BOTTOM_NAV = "ad_interstitial_not_enabled_bottom_nav";

    @NotNull
    private static final String AD_INTERSTITIAL_NOT_READY_BOTTOM_NAV = "ad_interstitial_not_ready_bottom_nav";

    @NotNull
    private static final String AD_INTERSTITIAL_NO_INTERNET_BOTTOM_NAV = "ad_interstitial_no_internet_bottom_nav";

    @NotNull
    private static final String AD_INTERSTITIAL_ODD_SKIPPING_BOTTOM_NAV = "ad_interstitial_odd_skipping_ad_bottom_nav";

    @NotNull
    private static final String AD_INTERSTITIAL_SHOWED_BOTTOM_NAV = "ad_interstitial_showed_bottom_nav";

    @NotNull
    private static final String AD_INTERSTITIAL_SHOWED_FAILURE_BOTTOM_NAV = "ad_interstitial_showed_failure_bottom_nav";

    @NotNull
    private static final String AD_INTERSTITIAL_SHOWING_BOTTOM_NAV = "ad_interstitial_showing_bottom_nav";

    @NotNull
    private static final String AD_INTERSTITIAL_SHOW_LIMIT_REACHED_BOTTOM_NAV = "ad_interstitial_show_limit_reached_bottom_nav";

    @NotNull
    private static final String AD_INTERSTITIAL_TIMEOUT_TO_LOAD_BOTTOM_NAV = "ad_interstitial_timeout_to_load_bottom_nav";

    @NotNull
    private static final String CLICKED_BOTTOM_NAV = "click_bottom_nav";

    @NotNull
    public static final AdInterstitialEvents INSTANCE = new AdInterstitialEvents();

    private AdInterstitialEvents() {
    }

    public final void logAdInterstitialBottomNavLoaded() {
        FirebaseAnalyticsManager.logEvent$default(FirebaseAnalyticsManager.INSTANCE, AD_INTERSTITIAL_LOADED_BOTTOM_NAV, null, 2, null);
    }

    public final void logAdInterstitialClickedBottomNav() {
        FirebaseAnalyticsManager.logEvent$default(FirebaseAnalyticsManager.INSTANCE, AD_INTERSTITIAL_CLICKED_BOTTOM_NAV, null, 2, null);
    }

    public final void logAdInterstitialDismissedBottomNav() {
        FirebaseAnalyticsManager.logEvent$default(FirebaseAnalyticsManager.INSTANCE, AD_INTERSTITIAL_DISMISSED_BOTTOM_NAV, null, 2, null);
    }

    public final void logAdInterstitialFailedToLoadBottomNav() {
        FirebaseAnalyticsManager.logEvent$default(FirebaseAnalyticsManager.INSTANCE, AD_INTERSTITIAL_FAILED_TO_LOAD_BOTTOM_NAV, null, 2, null);
    }

    public final void logAdInterstitialNoInternetBottomNav() {
        FirebaseAnalyticsManager.logEvent$default(FirebaseAnalyticsManager.INSTANCE, AD_INTERSTITIAL_NO_INTERNET_BOTTOM_NAV, null, 2, null);
    }

    public final void logAdInterstitialNotEnabledBottomNav() {
        FirebaseAnalyticsManager.logEvent$default(FirebaseAnalyticsManager.INSTANCE, AD_INTERSTITIAL_NOT_ENABLED_BOTTOM_NAV, null, 2, null);
    }

    public final void logAdInterstitialNotReadyBottomNav() {
        FirebaseAnalyticsManager.logEvent$default(FirebaseAnalyticsManager.INSTANCE, AD_INTERSTITIAL_NOT_READY_BOTTOM_NAV, null, 2, null);
    }

    public final void logAdInterstitialOddSkippingBottomNav() {
        FirebaseAnalyticsManager.logEvent$default(FirebaseAnalyticsManager.INSTANCE, AD_INTERSTITIAL_ODD_SKIPPING_BOTTOM_NAV, null, 2, null);
    }

    public final void logAdInterstitialShowLimitReachedBottomNav() {
        FirebaseAnalyticsManager.logEvent$default(FirebaseAnalyticsManager.INSTANCE, AD_INTERSTITIAL_SHOW_LIMIT_REACHED_BOTTOM_NAV, null, 2, null);
    }

    public final void logAdInterstitialShowedBottomNav() {
        FirebaseAnalyticsManager.logEvent$default(FirebaseAnalyticsManager.INSTANCE, AD_INTERSTITIAL_SHOWED_BOTTOM_NAV, null, 2, null);
    }

    public final void logAdInterstitialShowedFailureBottomNav() {
        FirebaseAnalyticsManager.logEvent$default(FirebaseAnalyticsManager.INSTANCE, AD_INTERSTITIAL_SHOWED_FAILURE_BOTTOM_NAV, null, 2, null);
    }

    public final void logAdInterstitialShowingBottomNav() {
        FirebaseAnalyticsManager.logEvent$default(FirebaseAnalyticsManager.INSTANCE, AD_INTERSTITIAL_SHOWING_BOTTOM_NAV, null, 2, null);
    }

    public final void logAdInterstitialTimeoutToLoadBottomNav() {
        FirebaseAnalyticsManager.logEvent$default(FirebaseAnalyticsManager.INSTANCE, AD_INTERSTITIAL_TIMEOUT_TO_LOAD_BOTTOM_NAV, null, 2, null);
    }

    public final void logClickedBottomNav() {
        FirebaseAnalyticsManager.logEvent$default(FirebaseAnalyticsManager.INSTANCE, CLICKED_BOTTOM_NAV, null, 2, null);
    }
}
