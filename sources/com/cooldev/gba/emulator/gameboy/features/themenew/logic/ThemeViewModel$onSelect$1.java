package com.cooldev.gba.emulator.gameboy.features.themenew.logic;

import com.cooldev.gba.emulator.gameboy.features.themenew.enums.GamePadTheme;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import p0.a;
import q0.l;

/* loaded from: classes.dex */
public final class ThemeViewModel$onSelect$1 extends r implements l {
    final /* synthetic */ GamePadTheme $theme;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThemeViewModel$onSelect$1(GamePadTheme gamePadTheme) {
        super(1);
        this.$theme = gamePadTheme;
    }

    @Override // q0.l
    @NotNull
    public final ThemeState invoke(@NotNull ThemeState themeState) {
        a.s(themeState, "it");
        return themeState.copy(this.$theme);
    }
}
