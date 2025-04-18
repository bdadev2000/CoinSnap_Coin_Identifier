package com.cooldev.gba.emulator.gameboy.features.home.utils;

import com.cooldev.gba.emulator.gameboy.features.home.models.DirectoriesManager;
import com.cooldev.gba.emulator.gameboy.features.home.models.Game;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public interface SavesMigrator {
    @Nullable
    byte[] loadPreviousSaveForGame(@NotNull Game game, @NotNull DirectoriesManager directoriesManager);
}
