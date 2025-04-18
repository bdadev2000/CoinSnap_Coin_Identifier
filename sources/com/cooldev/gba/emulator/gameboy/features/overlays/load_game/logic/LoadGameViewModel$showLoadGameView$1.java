package com.cooldev.gba.emulator.gameboy.features.overlays.load_game.logic;

import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import p0.a;
import q0.l;

/* loaded from: classes3.dex */
public final class LoadGameViewModel$showLoadGameView$1 extends r implements l {
    public static final LoadGameViewModel$showLoadGameView$1 INSTANCE = new LoadGameViewModel$showLoadGameView$1();

    public LoadGameViewModel$showLoadGameView$1() {
        super(1);
    }

    @Override // q0.l
    @NotNull
    public final LoadGameState invoke(@NotNull LoadGameState loadGameState) {
        a.s(loadGameState, "it");
        return loadGameState.copy(true);
    }
}
