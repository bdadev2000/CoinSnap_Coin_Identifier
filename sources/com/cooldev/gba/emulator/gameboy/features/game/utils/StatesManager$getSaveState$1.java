package com.cooldev.gba.emulator.gameboy.features.game.utils;

import h0.g;
import j0.c;
import j0.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@e(c = "com.cooldev.gba.emulator.gameboy.features.game.utils.StatesManager", f = "StatesManager.kt", l = {96}, m = "getSaveState")
/* loaded from: classes.dex */
public final class StatesManager$getSaveState$1 extends c {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ StatesManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StatesManager$getSaveState$1(StatesManager statesManager, g gVar) {
        super(gVar);
        this.this$0 = statesManager;
    }

    @Override // j0.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object saveState;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        saveState = this.this$0.getSaveState(null, null, this);
        return saveState;
    }
}
