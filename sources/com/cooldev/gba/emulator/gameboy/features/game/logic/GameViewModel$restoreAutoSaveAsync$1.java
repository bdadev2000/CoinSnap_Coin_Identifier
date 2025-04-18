package com.cooldev.gba.emulator.gameboy.features.game.logic;

import h0.g;
import j0.c;
import j0.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@e(c = "com.cooldev.gba.emulator.gameboy.features.game.logic.GameViewModel", f = "GameViewModel.kt", l = {816, 292}, m = "restoreAutoSaveAsync")
/* loaded from: classes.dex */
public final class GameViewModel$restoreAutoSaveAsync$1 extends c {
    int I$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GameViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GameViewModel$restoreAutoSaveAsync$1(GameViewModel gameViewModel, g gVar) {
        super(gVar);
        this.this$0 = gameViewModel;
    }

    @Override // j0.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object restoreAutoSaveAsync;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        restoreAutoSaveAsync = this.this$0.restoreAutoSaveAsync(null, this);
        return restoreAutoSaveAsync;
    }
}
