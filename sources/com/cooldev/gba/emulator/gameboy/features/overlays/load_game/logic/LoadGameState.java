package com.cooldev.gba.emulator.gameboy.features.overlays.load_game.logic;

import android.support.v4.media.d;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
/* loaded from: classes4.dex */
public final class LoadGameState {
    public static final int $stable = 0;
    private final boolean showingLoadGameView;

    public LoadGameState() {
        this(false, 1, null);
    }

    public static /* synthetic */ LoadGameState copy$default(LoadGameState loadGameState, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z2 = loadGameState.showingLoadGameView;
        }
        return loadGameState.copy(z2);
    }

    public final boolean component1() {
        return this.showingLoadGameView;
    }

    @NotNull
    public final LoadGameState copy(boolean z2) {
        return new LoadGameState(z2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LoadGameState) && this.showingLoadGameView == ((LoadGameState) obj).showingLoadGameView;
    }

    public final boolean getShowingLoadGameView() {
        return this.showingLoadGameView;
    }

    public int hashCode() {
        return Boolean.hashCode(this.showingLoadGameView);
    }

    @NotNull
    public String toString() {
        return d.s(new StringBuilder("LoadGameState(showingLoadGameView="), this.showingLoadGameView, ')');
    }

    public LoadGameState(boolean z2) {
        this.showingLoadGameView = z2;
    }

    public /* synthetic */ LoadGameState(boolean z2, int i2, k kVar) {
        this((i2 & 1) != 0 ? false : z2);
    }
}
