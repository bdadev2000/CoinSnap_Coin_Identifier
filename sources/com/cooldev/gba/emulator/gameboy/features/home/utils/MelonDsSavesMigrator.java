package com.cooldev.gba.emulator.gameboy.features.home.utils;

import androidx.compose.runtime.internal.StabilityInferred;
import com.cooldev.gba.emulator.gameboy.features.home.models.DirectoriesManager;
import com.cooldev.gba.emulator.gameboy.features.home.models.Game;
import com.cooldev.gba.emulator.gameboy.router.RouterName;
import java.io.File;
import kotlin.jvm.internal.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;
import z0.m;

@StabilityInferred
/* loaded from: classes4.dex */
public final class MelonDsSavesMigrator implements SavesMigrator {
    public static final int $stable = 0;

    @NotNull
    public static final MelonDsSavesMigrator INSTANCE = new MelonDsSavesMigrator();

    private MelonDsSavesMigrator() {
    }

    @Override // com.cooldev.gba.emulator.gameboy.features.home.utils.SavesMigrator
    @Nullable
    public byte[] loadPreviousSaveForGame(@NotNull Game game, @NotNull DirectoriesManager directoriesManager) {
        a.s(game, RouterName.GAME);
        a.s(directoriesManager, "directoriesManager");
        File file = new File(directoriesManager.getSavesDirectory(), m.w1(game.getFileName()).concat(".sav"));
        if (!file.exists() || file.length() <= 0) {
            return null;
        }
        return q.j(file);
    }
}
