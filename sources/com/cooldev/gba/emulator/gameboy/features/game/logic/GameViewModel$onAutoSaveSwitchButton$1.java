package com.cooldev.gba.emulator.gameboy.features.game.logic;

import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import p0.a;
import q0.l;

/* loaded from: classes.dex */
public final class GameViewModel$onAutoSaveSwitchButton$1 extends r implements l {
    final /* synthetic */ boolean $value;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GameViewModel$onAutoSaveSwitchButton$1(boolean z2) {
        super(1);
        this.$value = z2;
    }

    @Override // q0.l
    @NotNull
    public final GameState invoke(@NotNull GameState gameState) {
        GameState copy;
        a.s(gameState, "it");
        copy = gameState.copy((r22 & 1) != 0 ? gameState.game : null, (r22 & 2) != 0 ? gameState.gameData : null, (r22 & 4) != 0 ? gameState.retroView : null, (r22 & 8) != 0 ? gameState.fastForwardEnabled : false, (r22 & 16) != 0 ? gameState.autoSaveEnable : this.$value, (r22 & 32) != 0 ? gameState.isFirstTimeInPremium : false, (r22 & 64) != 0 ? gameState.audioEnabled : false, (r22 & 128) != 0 ? gameState.saveSlot : null, (r22 & 256) != 0 ? gameState.loadSlot : null, (r22 & 512) != 0 ? gameState.thumbnail : null);
        return copy;
    }
}
