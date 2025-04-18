package com.cooldev.gba.emulator.gameboy.network.services.analytic.events;

import androidx.compose.runtime.internal.StabilityInferred;
import com.cooldev.gba.emulator.gameboy.network.services.analytic.FirebaseAnalyticsManager;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
/* loaded from: classes3.dex */
public final class ThemeEvents {
    public static final int $stable = 0;

    @NotNull
    private static final String CLICK_SURVEY_LIKE = "click_survey_like";

    @NotNull
    public static final ThemeEvents INSTANCE = new ThemeEvents();

    @NotNull
    private static final String VIEW_POPUP_SURVEY = "view_popup_survey";

    private ThemeEvents() {
    }

    public final void logClickLike() {
        FirebaseAnalyticsManager.logEvent$default(FirebaseAnalyticsManager.INSTANCE, CLICK_SURVEY_LIKE, null, 2, null);
    }

    public final void logShowSurveyPopup() {
        FirebaseAnalyticsManager.logEvent$default(FirebaseAnalyticsManager.INSTANCE, VIEW_POPUP_SURVEY, null, 2, null);
    }
}
