package com.cooldev.gba.emulator.gameboy.features.game.logic;

import d0.n;
import h0.g;
import i0.a;
import j0.c;
import j0.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@e(c = "com.cooldev.gba.emulator.gameboy.features.game.logic.GameViewModel", f = "GameViewModel.kt", l = {582, 585}, m = "getQuickSaveData-BWLJW6A")
/* loaded from: classes.dex */
public final class GameViewModel$getQuickSaveData$1 extends c {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GameViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GameViewModel$getQuickSaveData$1(GameViewModel gameViewModel, g gVar) {
        super(gVar);
        this.this$0 = gameViewModel;
    }

    @Override // j0.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object m199getQuickSaveDataBWLJW6A;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        m199getQuickSaveDataBWLJW6A = this.this$0.m199getQuickSaveDataBWLJW6A(null, null, null, this);
        return m199getQuickSaveDataBWLJW6A == a.f30806a ? m199getQuickSaveDataBWLJW6A : new n(m199getQuickSaveDataBWLJW6A);
    }
}
