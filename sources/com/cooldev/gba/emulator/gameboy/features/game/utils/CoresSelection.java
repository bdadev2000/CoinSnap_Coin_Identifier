package com.cooldev.gba.emulator.gameboy.features.game.utils;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.cooldev.gba.emulator.gameboy.features.home.models.GameSystem;
import com.cooldev.gba.emulator.gameboy.features.home.models.SystemCoreConfig;
import com.cooldev.gba.emulator.gameboy.features.home.models.SystemID;
import e0.u;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import p0.a;

@StabilityInferred
/* loaded from: classes2.dex */
public final class CoresSelection {
    public static final int $stable = 0;

    @NotNull
    private static final String CORE_SELECTION_BINDING_PREFERENCE_BASE_KEY = "pref_key_core_selection";

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }

        @NotNull
        public final String computeSystemPreferenceKey(@NotNull SystemID systemID) {
            a.s(systemID, "systemID");
            return "pref_key_core_selection_" + systemID.getDbname();
        }
    }

    private final SystemCoreConfig getSelectedCoreConfigForSystem(Context context, GameSystem gameSystem) {
        String selectedCoreNameForSystem = getSelectedCoreNameForSystem(context, gameSystem);
        for (SystemCoreConfig systemCoreConfig : gameSystem.getSystemCoreConfigs()) {
            if (a.g(systemCoreConfig.getCoreID().getCoreName(), selectedCoreNameForSystem)) {
                return systemCoreConfig;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    private final String getSelectedCoreNameForSystem(Context context, GameSystem gameSystem) {
        String string = context.getSharedPreferences(context.getPackageName(), 0).getString(Companion.computeSystemPreferenceKey(gameSystem.getId()), ((SystemCoreConfig) u.E0(gameSystem.getSystemCoreConfigs())).getCoreID().getCoreName());
        return string == null ? ((SystemCoreConfig) u.E0(gameSystem.getSystemCoreConfigs())).getCoreID().getCoreName() : string;
    }

    @NotNull
    public final SystemCoreConfig getCoreConfigForSystem(@NotNull Context context, @NotNull GameSystem gameSystem) {
        a.s(context, "context");
        a.s(gameSystem, "system");
        return getSelectedCoreConfigForSystem(context, gameSystem);
    }
}
