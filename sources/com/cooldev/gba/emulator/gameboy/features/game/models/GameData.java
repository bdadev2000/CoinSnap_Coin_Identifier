package com.cooldev.gba.emulator.gameboy.features.game.models;

import androidx.compose.runtime.internal.StabilityInferred;
import com.cooldev.gba.emulator.gameboy.features.home.models.ControllerConfig;
import com.cooldev.gba.emulator.gameboy.features.home.models.Game;
import com.cooldev.gba.emulator.gameboy.features.home.models.GameSystem;
import com.cooldev.gba.emulator.gameboy.features.home.models.SystemCoreConfig;
import com.cooldev.gba.emulator.gameboy.router.RouterName;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;

@StabilityInferred
/* loaded from: classes4.dex */
public final class GameData {
    public static final int $stable = 8;

    @NotNull
    private final ControllerConfig controllerConfig;

    @NotNull
    private final String coreLibrary;

    @NotNull
    private final Game game;

    @NotNull
    private final GameSystem gameSystem;

    @Nullable
    private final SaveState quickSaveData;

    @NotNull
    private final RomFiles romFiles;

    @Nullable
    private final byte[] saveRAMData;

    @NotNull
    private final SystemCoreConfig systemCoreConfig;

    public GameData(@NotNull Game game, @NotNull String str, @NotNull RomFiles romFiles, @NotNull ControllerConfig controllerConfig, @Nullable byte[] bArr, @NotNull GameSystem gameSystem, @NotNull SystemCoreConfig systemCoreConfig, @Nullable SaveState saveState) {
        a.s(game, RouterName.GAME);
        a.s(str, "coreLibrary");
        a.s(romFiles, "romFiles");
        a.s(controllerConfig, "controllerConfig");
        a.s(gameSystem, "gameSystem");
        a.s(systemCoreConfig, "systemCoreConfig");
        this.game = game;
        this.coreLibrary = str;
        this.romFiles = romFiles;
        this.controllerConfig = controllerConfig;
        this.saveRAMData = bArr;
        this.gameSystem = gameSystem;
        this.systemCoreConfig = systemCoreConfig;
        this.quickSaveData = saveState;
    }

    @NotNull
    public final Game component1() {
        return this.game;
    }

    @NotNull
    public final String component2() {
        return this.coreLibrary;
    }

    @NotNull
    public final RomFiles component3() {
        return this.romFiles;
    }

    @NotNull
    public final ControllerConfig component4() {
        return this.controllerConfig;
    }

    @Nullable
    public final byte[] component5() {
        return this.saveRAMData;
    }

    @NotNull
    public final GameSystem component6() {
        return this.gameSystem;
    }

    @NotNull
    public final SystemCoreConfig component7() {
        return this.systemCoreConfig;
    }

    @Nullable
    public final SaveState component8() {
        return this.quickSaveData;
    }

    @NotNull
    public final GameData copy(@NotNull Game game, @NotNull String str, @NotNull RomFiles romFiles, @NotNull ControllerConfig controllerConfig, @Nullable byte[] bArr, @NotNull GameSystem gameSystem, @NotNull SystemCoreConfig systemCoreConfig, @Nullable SaveState saveState) {
        a.s(game, RouterName.GAME);
        a.s(str, "coreLibrary");
        a.s(romFiles, "romFiles");
        a.s(controllerConfig, "controllerConfig");
        a.s(gameSystem, "gameSystem");
        a.s(systemCoreConfig, "systemCoreConfig");
        return new GameData(game, str, romFiles, controllerConfig, bArr, gameSystem, systemCoreConfig, saveState);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GameData)) {
            return false;
        }
        GameData gameData = (GameData) obj;
        return a.g(this.game, gameData.game) && a.g(this.coreLibrary, gameData.coreLibrary) && a.g(this.romFiles, gameData.romFiles) && a.g(this.controllerConfig, gameData.controllerConfig) && a.g(this.saveRAMData, gameData.saveRAMData) && a.g(this.gameSystem, gameData.gameSystem) && a.g(this.systemCoreConfig, gameData.systemCoreConfig) && a.g(this.quickSaveData, gameData.quickSaveData);
    }

    @NotNull
    public final ControllerConfig getControllerConfig() {
        return this.controllerConfig;
    }

    @NotNull
    public final String getCoreLibrary() {
        return this.coreLibrary;
    }

    @NotNull
    public final Game getGame() {
        return this.game;
    }

    @NotNull
    public final GameSystem getGameSystem() {
        return this.gameSystem;
    }

    @Nullable
    public final SaveState getQuickSaveData() {
        return this.quickSaveData;
    }

    @NotNull
    public final RomFiles getRomFiles() {
        return this.romFiles;
    }

    @Nullable
    public final byte[] getSaveRAMData() {
        return this.saveRAMData;
    }

    @NotNull
    public final SystemCoreConfig getSystemCoreConfig() {
        return this.systemCoreConfig;
    }

    public int hashCode() {
        int hashCode = (this.controllerConfig.hashCode() + ((this.romFiles.hashCode() + androidx.compose.foundation.text.input.a.b(this.coreLibrary, this.game.hashCode() * 31, 31)) * 31)) * 31;
        byte[] bArr = this.saveRAMData;
        int hashCode2 = (this.systemCoreConfig.hashCode() + ((this.gameSystem.hashCode() + ((hashCode + (bArr == null ? 0 : Arrays.hashCode(bArr))) * 31)) * 31)) * 31;
        SaveState saveState = this.quickSaveData;
        return hashCode2 + (saveState != null ? saveState.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "GameData(game=" + this.game + ", coreLibrary=" + this.coreLibrary + ", romFiles=" + this.romFiles + ", controllerConfig=" + this.controllerConfig + ", saveRAMData=" + Arrays.toString(this.saveRAMData) + ", gameSystem=" + this.gameSystem + ", systemCoreConfig=" + this.systemCoreConfig + ", quickSaveData=" + this.quickSaveData + ')';
    }
}
