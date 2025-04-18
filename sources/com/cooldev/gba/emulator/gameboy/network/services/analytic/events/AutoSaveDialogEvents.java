package com.cooldev.gba.emulator.gameboy.network.services.analytic.events;

import androidx.compose.runtime.internal.StabilityInferred;
import com.cooldev.gba.emulator.gameboy.network.services.analytic.FirebaseAnalyticsManager;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
/* loaded from: classes2.dex */
public final class AutoSaveDialogEvents {
    public static final int $stable = 0;

    @NotNull
    private static final String CLICK_TURN_ON_AUTO_SAVE_DIALOG = "click_turn_on_auto_save_dialog";

    @NotNull
    public static final AutoSaveDialogEvents INSTANCE = new AutoSaveDialogEvents();

    private AutoSaveDialogEvents() {
    }

    public final void logClickTurnOnAutoSaveDialog() {
        FirebaseAnalyticsManager.logEvent$default(FirebaseAnalyticsManager.INSTANCE, CLICK_TURN_ON_AUTO_SAVE_DIALOG, null, 2, null);
    }
}
