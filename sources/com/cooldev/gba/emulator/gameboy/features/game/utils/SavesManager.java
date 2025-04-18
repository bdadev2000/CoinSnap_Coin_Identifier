package com.cooldev.gba.emulator.gameboy.features.game.utils;

import androidx.compose.runtime.internal.StabilityInferred;
import b1.o0;
import com.cooldev.gba.emulator.gameboy.features.home.models.DirectoriesManager;
import com.cooldev.gba.emulator.gameboy.features.home.models.Game;
import com.cooldev.gba.emulator.gameboy.features.home.models.SystemCoreConfig;
import h0.g;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;
import z0.m;

@StabilityInferred
/* loaded from: classes.dex */
public final class SavesManager {
    private static final int FILE_ACCESS_RETRIES = 3;

    @NotNull
    private final DirectoriesManager directoriesManager;

    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public SavesManager(@NotNull DirectoriesManager directoriesManager) {
        a.s(directoriesManager, "directoriesManager");
        this.directoriesManager = directoriesManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getSaveFile(String str, g gVar) {
        return e.G(gVar, o0.f22356b, new SavesManager$getSaveFile$2(this, str, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getSaveRAMFileName(Game game) {
        return m.w1(game.getFileName()).concat(".srm");
    }

    @Nullable
    public final Object getSaveRAM(@NotNull Game game, @NotNull SystemCoreConfig systemCoreConfig, @NotNull g gVar) {
        return e.G(gVar, o0.f22356b, new SavesManager$getSaveRAM$2(this, game, systemCoreConfig, null));
    }

    @Nullable
    public final Object getSaveRAMInfo(@NotNull Game game, @NotNull g gVar) {
        return e.G(gVar, o0.f22356b, new SavesManager$getSaveRAMInfo$2(this, game, null));
    }

    @Nullable
    public final Object setSaveRAM(@NotNull Game game, @NotNull byte[] bArr, @NotNull g gVar) {
        return e.G(gVar, o0.f22356b, new SavesManager$setSaveRAM$2(bArr, this, game, null));
    }
}
