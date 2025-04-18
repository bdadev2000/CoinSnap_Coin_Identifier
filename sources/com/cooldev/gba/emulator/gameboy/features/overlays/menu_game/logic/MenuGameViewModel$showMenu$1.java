package com.cooldev.gba.emulator.gameboy.features.overlays.menu_game.logic;

import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import p0.a;
import q0.l;

/* loaded from: classes2.dex */
public final class MenuGameViewModel$showMenu$1 extends r implements l {
    public static final MenuGameViewModel$showMenu$1 INSTANCE = new MenuGameViewModel$showMenu$1();

    public MenuGameViewModel$showMenu$1() {
        super(1);
    }

    @Override // q0.l
    @NotNull
    public final MenuGameState invoke(@NotNull MenuGameState menuGameState) {
        a.s(menuGameState, "it");
        return menuGameState.copy(true);
    }
}
