package com.cooldev.gba.emulator.gameboy.features.guide.logic;

import android.support.v4.media.d;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
/* loaded from: classes2.dex */
public final class GuideState {
    public static final int $stable = 0;
    private final boolean showingMenu;

    public GuideState() {
        this(false, 1, null);
    }

    public static /* synthetic */ GuideState copy$default(GuideState guideState, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z2 = guideState.showingMenu;
        }
        return guideState.copy(z2);
    }

    public final boolean component1() {
        return this.showingMenu;
    }

    @NotNull
    public final GuideState copy(boolean z2) {
        return new GuideState(z2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GuideState) && this.showingMenu == ((GuideState) obj).showingMenu;
    }

    public final boolean getShowingMenu() {
        return this.showingMenu;
    }

    public int hashCode() {
        return Boolean.hashCode(this.showingMenu);
    }

    @NotNull
    public String toString() {
        return d.s(new StringBuilder("GuideState(showingMenu="), this.showingMenu, ')');
    }

    public GuideState(boolean z2) {
        this.showingMenu = z2;
    }

    public /* synthetic */ GuideState(boolean z2, int i2, k kVar) {
        this((i2 & 1) != 0 ? false : z2);
    }
}
