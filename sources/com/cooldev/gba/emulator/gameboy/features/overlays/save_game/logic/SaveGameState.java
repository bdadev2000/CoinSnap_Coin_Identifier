package com.cooldev.gba.emulator.gameboy.features.overlays.save_game.logic;

import android.support.v4.media.d;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
/* loaded from: classes3.dex */
public final class SaveGameState {
    public static final int $stable = 0;
    private final boolean showingSaveGameView;

    public SaveGameState() {
        this(false, 1, null);
    }

    public static /* synthetic */ SaveGameState copy$default(SaveGameState saveGameState, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z2 = saveGameState.showingSaveGameView;
        }
        return saveGameState.copy(z2);
    }

    public final boolean component1() {
        return this.showingSaveGameView;
    }

    @NotNull
    public final SaveGameState copy(boolean z2) {
        return new SaveGameState(z2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SaveGameState) && this.showingSaveGameView == ((SaveGameState) obj).showingSaveGameView;
    }

    public final boolean getShowingSaveGameView() {
        return this.showingSaveGameView;
    }

    public int hashCode() {
        return Boolean.hashCode(this.showingSaveGameView);
    }

    @NotNull
    public String toString() {
        return d.s(new StringBuilder("SaveGameState(showingSaveGameView="), this.showingSaveGameView, ')');
    }

    public SaveGameState(boolean z2) {
        this.showingSaveGameView = z2;
    }

    public /* synthetic */ SaveGameState(boolean z2, int i2, k kVar) {
        this((i2 & 1) != 0 ? false : z2);
    }
}
