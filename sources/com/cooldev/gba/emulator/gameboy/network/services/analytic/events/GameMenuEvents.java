package com.cooldev.gba.emulator.gameboy.network.services.analytic.events;

import androidx.compose.runtime.internal.StabilityInferred;
import com.cooldev.gba.emulator.gameboy.network.services.analytic.FirebaseAnalyticsManager;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
/* loaded from: classes2.dex */
public final class GameMenuEvents {
    public static final int $stable = 0;

    @NotNull
    private static final String ADD_YOUR_GAME = "add_your_game";

    @NotNull
    private static final String CLICK_AUTO_SAVE_MENU_GAME = "click_auto_save_menu_game";

    @NotNull
    public static final GameMenuEvents INSTANCE = new GameMenuEvents();

    private GameMenuEvents() {
    }

    public final void logAddYourGame() {
        FirebaseAnalyticsManager.logEvent$default(FirebaseAnalyticsManager.INSTANCE, ADD_YOUR_GAME, null, 2, null);
    }

    public final void logClickAutoSaveMenuGame() {
        FirebaseAnalyticsManager.logEvent$default(FirebaseAnalyticsManager.INSTANCE, CLICK_AUTO_SAVE_MENU_GAME, null, 2, null);
    }
}
