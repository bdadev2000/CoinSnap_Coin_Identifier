package com.cooldev.gba.emulator.gameboy.features.themenew.logic;

import androidx.compose.runtime.internal.StabilityInferred;
import com.cooldev.gba.emulator.gameboy.features.themenew.enums.GamePadTheme;
import com.cooldev.gba.emulator.gameboy.router.RouterName;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;

@StabilityInferred
/* loaded from: classes2.dex */
public final class ThemeState {
    public static final int $stable = 0;

    @NotNull
    private final GamePadTheme theme;

    public ThemeState() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ ThemeState copy$default(ThemeState themeState, GamePadTheme gamePadTheme, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            gamePadTheme = themeState.theme;
        }
        return themeState.copy(gamePadTheme);
    }

    @NotNull
    public final GamePadTheme component1() {
        return this.theme;
    }

    @NotNull
    public final ThemeState copy(@NotNull GamePadTheme gamePadTheme) {
        a.s(gamePadTheme, RouterName.THEME);
        return new ThemeState(gamePadTheme);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ThemeState) && this.theme == ((ThemeState) obj).theme;
    }

    @NotNull
    public final GamePadTheme getTheme() {
        return this.theme;
    }

    public int hashCode() {
        return this.theme.hashCode();
    }

    @NotNull
    public String toString() {
        return "ThemeState(theme=" + this.theme + ')';
    }

    public ThemeState(@NotNull GamePadTheme gamePadTheme) {
        a.s(gamePadTheme, RouterName.THEME);
        this.theme = gamePadTheme;
    }

    public /* synthetic */ ThemeState(GamePadTheme gamePadTheme, int i2, k kVar) {
        this((i2 & 1) != 0 ? GamePadTheme.Default : gamePadTheme);
    }
}
