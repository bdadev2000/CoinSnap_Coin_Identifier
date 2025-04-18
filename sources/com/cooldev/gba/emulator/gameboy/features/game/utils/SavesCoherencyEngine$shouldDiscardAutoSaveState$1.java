package com.cooldev.gba.emulator.gameboy.features.game.utils;

import h0.g;
import j0.c;
import j0.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@e(c = "com.cooldev.gba.emulator.gameboy.features.game.utils.SavesCoherencyEngine", f = "SavesCoherencyEngine.kt", l = {31, 32}, m = "shouldDiscardAutoSaveState")
/* loaded from: classes2.dex */
public final class SavesCoherencyEngine$shouldDiscardAutoSaveState$1 extends c {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SavesCoherencyEngine this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SavesCoherencyEngine$shouldDiscardAutoSaveState$1(SavesCoherencyEngine savesCoherencyEngine, g gVar) {
        super(gVar);
        this.this$0 = savesCoherencyEngine;
    }

    @Override // j0.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.shouldDiscardAutoSaveState(null, null, this);
    }
}
