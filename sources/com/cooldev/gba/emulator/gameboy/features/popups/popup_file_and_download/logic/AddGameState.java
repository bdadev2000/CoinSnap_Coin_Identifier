package com.cooldev.gba.emulator.gameboy.features.popups.popup_file_and_download.logic;

import android.support.v4.media.d;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
/* loaded from: classes.dex */
public final class AddGameState {
    public static final int $stable = 0;
    private final boolean showingPopupSelect;

    public AddGameState() {
        this(false, 1, null);
    }

    public static /* synthetic */ AddGameState copy$default(AddGameState addGameState, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z2 = addGameState.showingPopupSelect;
        }
        return addGameState.copy(z2);
    }

    public final boolean component1() {
        return this.showingPopupSelect;
    }

    @NotNull
    public final AddGameState copy(boolean z2) {
        return new AddGameState(z2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AddGameState) && this.showingPopupSelect == ((AddGameState) obj).showingPopupSelect;
    }

    public final boolean getShowingPopupSelect() {
        return this.showingPopupSelect;
    }

    public int hashCode() {
        return Boolean.hashCode(this.showingPopupSelect);
    }

    @NotNull
    public String toString() {
        return d.s(new StringBuilder("AddGameState(showingPopupSelect="), this.showingPopupSelect, ')');
    }

    public AddGameState(boolean z2) {
        this.showingPopupSelect = z2;
    }

    public /* synthetic */ AddGameState(boolean z2, int i2, k kVar) {
        this((i2 & 1) != 0 ? false : z2);
    }
}
