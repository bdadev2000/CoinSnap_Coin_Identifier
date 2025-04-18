package com.cooldev.gba.emulator.gameboy.features.overlays.save_game.logic;

import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import p0.a;
import q0.l;

/* loaded from: classes.dex */
public final class SaveGameViewModel$hideSaveGameView$1 extends r implements l {
    public static final SaveGameViewModel$hideSaveGameView$1 INSTANCE = new SaveGameViewModel$hideSaveGameView$1();

    public SaveGameViewModel$hideSaveGameView$1() {
        super(1);
    }

    @Override // q0.l
    @NotNull
    public final SaveGameState invoke(@NotNull SaveGameState saveGameState) {
        a.s(saveGameState, "it");
        return saveGameState.copy(false);
    }
}
