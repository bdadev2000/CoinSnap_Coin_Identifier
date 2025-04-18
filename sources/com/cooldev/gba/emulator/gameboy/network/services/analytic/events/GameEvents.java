package com.cooldev.gba.emulator.gameboy.network.services.analytic.events;

import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import com.cooldev.gba.emulator.gameboy.network.services.analytic.FirebaseAnalyticsManager;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
/* loaded from: classes3.dex */
public final class GameEvents {
    public static final int $stable = 0;

    @NotNull
    private static final String ADD_YOUR_GAME = "add_your_game";

    @NotNull
    private static final String CLICK_ALERT_ON = "click_alert_on";

    @NotNull
    private static final String CLICK_GAME_FORWARD = "click_game_forward";

    @NotNull
    private static final String CLICK_GAME_QUIT = "click_game_quit";

    @NotNull
    private static final String CLICK_GAME_SAVE = "click_game_save";

    @NotNull
    private static final String COUNT_RECENT_GAME = "count_recent_game";

    @NotNull
    public static final GameEvents INSTANCE = new GameEvents();

    @NotNull
    private static final String VIEW_ALERT_SAVE = "view_alert_save";

    @NotNull
    private static final String VIEW_PLAY_GAME = "view_play_game";

    @NotNull
    private static final String VIEW_PLAY_GAME_SETTINGS = "view_play_game_settings";

    private GameEvents() {
    }

    public final void logAddGame(int i2) {
        Bundle bundle = new Bundle();
        bundle.putInt("count", i2);
        FirebaseAnalyticsManager.INSTANCE.logEvent(ADD_YOUR_GAME, bundle);
    }

    public final void logClickQuit() {
        FirebaseAnalyticsManager.logEvent$default(FirebaseAnalyticsManager.INSTANCE, CLICK_GAME_QUIT, null, 2, null);
    }

    public final void logClickSave() {
        FirebaseAnalyticsManager.logEvent$default(FirebaseAnalyticsManager.INSTANCE, CLICK_GAME_SAVE, null, 2, null);
    }

    public final void logLickForward() {
        FirebaseAnalyticsManager.logEvent$default(FirebaseAnalyticsManager.INSTANCE, CLICK_GAME_FORWARD, null, 2, null);
    }

    public final void logRecentGame(int i2) {
        Bundle bundle = new Bundle();
        bundle.putInt("count", i2);
        FirebaseAnalyticsManager.INSTANCE.logEvent(COUNT_RECENT_GAME, bundle);
    }

    public final void logTurnOnAlert() {
        FirebaseAnalyticsManager.logEvent$default(FirebaseAnalyticsManager.INSTANCE, CLICK_ALERT_ON, null, 2, null);
    }

    public final void logViewAlertSaveGame() {
        FirebaseAnalyticsManager.logEvent$default(FirebaseAnalyticsManager.INSTANCE, VIEW_ALERT_SAVE, null, 2, null);
    }

    public final void logViewPlayGame() {
        FirebaseAnalyticsManager.logEvent$default(FirebaseAnalyticsManager.INSTANCE, VIEW_PLAY_GAME, null, 2, null);
    }

    public final void logViewSettingGame() {
        FirebaseAnalyticsManager.logEvent$default(FirebaseAnalyticsManager.INSTANCE, VIEW_PLAY_GAME_SETTINGS, null, 2, null);
    }
}
