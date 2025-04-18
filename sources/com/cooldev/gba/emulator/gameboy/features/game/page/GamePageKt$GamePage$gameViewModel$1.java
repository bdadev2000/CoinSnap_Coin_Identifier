package com.cooldev.gba.emulator.gameboy.features.game.page;

import com.cooldev.gba.emulator.gameboy.features.home.models.Game;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.parameter.ParametersHolderKt;
import q0.a;

/* loaded from: classes3.dex */
public final class GamePageKt$GamePage$gameViewModel$1 extends r implements a {
    final /* synthetic */ Game $game;
    final /* synthetic */ Boolean $isRestart;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GamePageKt$GamePage$gameViewModel$1(Game game, Boolean bool) {
        super(0);
        this.$game = game;
        this.$isRestart = bool;
    }

    @Override // q0.a
    @NotNull
    public final ParametersHolder invoke() {
        return ParametersHolderKt.parametersOf(this.$game, Boolean.valueOf(p0.a.g(this.$isRestart, Boolean.TRUE)));
    }
}
