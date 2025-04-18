package com.cooldev.gba.emulator.gameboy.features.game.logic;

import h0.g;
import j0.c;
import j0.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@e(c = "com.cooldev.gba.emulator.gameboy.features.game.logic.GameViewModel", f = "GameViewModel.kt", l = {527, 529, 531, 822, 555, 560}, m = "launchGameAsync")
/* loaded from: classes.dex */
public final class GameViewModel$launchGameAsync$1 extends c {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GameViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GameViewModel$launchGameAsync$1(GameViewModel gameViewModel, g gVar) {
        super(gVar);
        this.this$0 = gameViewModel;
    }

    @Override // j0.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.launchGameAsync(this);
    }
}
