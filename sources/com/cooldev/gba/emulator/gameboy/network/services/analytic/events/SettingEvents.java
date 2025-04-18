package com.cooldev.gba.emulator.gameboy.network.services.analytic.events;

import androidx.compose.runtime.internal.StabilityInferred;
import com.cooldev.gba.emulator.gameboy.network.services.analytic.FirebaseAnalyticsManager;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
/* loaded from: classes3.dex */
public final class SettingEvents {
    public static final int $stable = 0;

    @NotNull
    private static final String CLICK_BANNER_SETTING_NAVIGATE_TO_PAYWALL = "click_settings_upgrade";

    @NotNull
    public static final SettingEvents INSTANCE = new SettingEvents();

    private SettingEvents() {
    }

    public final void logClickBannerSettingNavigateToPaywall() {
        FirebaseAnalyticsManager.logEvent$default(FirebaseAnalyticsManager.INSTANCE, CLICK_BANNER_SETTING_NAVIGATE_TO_PAYWALL, null, 2, null);
    }
}
