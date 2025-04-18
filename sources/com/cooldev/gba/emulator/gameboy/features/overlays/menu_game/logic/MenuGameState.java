package com.cooldev.gba.emulator.gameboy.features.overlays.menu_game.logic;

import android.support.v4.media.d;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
/* loaded from: classes3.dex */
public final class MenuGameState {
    public static final int $stable = 0;
    private final boolean showingMenu;

    public MenuGameState() {
        this(false, 1, null);
    }

    public static /* synthetic */ MenuGameState copy$default(MenuGameState menuGameState, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z2 = menuGameState.showingMenu;
        }
        return menuGameState.copy(z2);
    }

    public final boolean component1() {
        return this.showingMenu;
    }

    @NotNull
    public final MenuGameState copy(boolean z2) {
        return new MenuGameState(z2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MenuGameState) && this.showingMenu == ((MenuGameState) obj).showingMenu;
    }

    public final boolean getShowingMenu() {
        return this.showingMenu;
    }

    public int hashCode() {
        return Boolean.hashCode(this.showingMenu);
    }

    @NotNull
    public String toString() {
        return d.s(new StringBuilder("MenuGameState(showingMenu="), this.showingMenu, ')');
    }

    public MenuGameState(boolean z2) {
        this.showingMenu = z2;
    }

    public /* synthetic */ MenuGameState(boolean z2, int i2, k kVar) {
        this((i2 & 1) != 0 ? false : z2);
    }
}
