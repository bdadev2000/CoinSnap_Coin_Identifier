package com.cooldev.gba.emulator.gameboy.network.services.analytic.events;

import androidx.compose.runtime.internal.StabilityInferred;
import com.cooldev.gba.emulator.gameboy.network.services.analytic.FirebaseAnalyticsManager;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
/* loaded from: classes3.dex */
public final class RatingDialogEvents {
    public static final int $stable = 0;

    @NotNull
    private static final String CLICK_CANCEL_RATING_DIALOG = "click_cancel_rating_dialog";

    @NotNull
    private static final String CLICK_SUBMIT_RATING_DIALOG = "click_submit_rating_dialog";

    @NotNull
    public static final RatingDialogEvents INSTANCE = new RatingDialogEvents();

    @NotNull
    private static final String RATING_DIALOG_VISIBLE = "rating_dialog_visible";

    private RatingDialogEvents() {
    }

    public final void logClickCancelRatingDialog() {
        FirebaseAnalyticsManager.logEvent$default(FirebaseAnalyticsManager.INSTANCE, CLICK_CANCEL_RATING_DIALOG, null, 2, null);
    }

    public final void logClickSubmitRatingDialog() {
        FirebaseAnalyticsManager.logEvent$default(FirebaseAnalyticsManager.INSTANCE, CLICK_SUBMIT_RATING_DIALOG, null, 2, null);
    }

    public final void logRatingDialogVisible() {
        FirebaseAnalyticsManager.logEvent$default(FirebaseAnalyticsManager.INSTANCE, RATING_DIALOG_VISIBLE, null, 2, null);
    }
}
