package com.cooldev.gba.emulator.gameboy.features.game.widgets;

import androidx.compose.runtime.MutableFloatState;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import q0.a;

/* loaded from: classes2.dex */
public final class MainGameViewKt$MainGameView$gamePadWeight$1$1 extends r implements a {
    final /* synthetic */ MutableFloatState $gameWeight;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainGameViewKt$MainGameView$gamePadWeight$1$1(MutableFloatState mutableFloatState) {
        super(0);
        this.$gameWeight = mutableFloatState;
    }

    @Override // q0.a
    @NotNull
    public final Float invoke() {
        return Float.valueOf(this.$gameWeight.c() == 1.0f ? 0.8f : 1 - this.$gameWeight.c());
    }
}
