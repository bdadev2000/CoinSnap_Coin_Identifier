package com.cooldev.gba.emulator.gameboy.network.services.analytic.events;

import androidx.compose.runtime.internal.StabilityInferred;
import com.cooldev.gba.emulator.gameboy.network.services.analytic.FirebaseAnalyticsManager;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
/* loaded from: classes3.dex */
public final class HomeEvents {
    public static final int $stable = 0;

    @NotNull
    private static final String HOME_SETTING = "home_settings";

    @NotNull
    private static final String HOME_THEME = "home_theme";

    @NotNull
    public static final HomeEvents INSTANCE = new HomeEvents();

    private HomeEvents() {
    }

    public final void logSettingButton() {
        FirebaseAnalyticsManager.logEvent$default(FirebaseAnalyticsManager.INSTANCE, HOME_SETTING, null, 2, null);
    }

    public final void logThemeButton() {
        FirebaseAnalyticsManager.logEvent$default(FirebaseAnalyticsManager.INSTANCE, HOME_THEME, null, 2, null);
    }
}
