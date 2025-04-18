package com.cooldev.gba.emulator.gameboy.features.game.logic;

import h0.g;
import j0.c;
import j0.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@e(c = "com.cooldev.gba.emulator.gameboy.features.game.logic.GameViewModel", f = "GameViewModel.kt", l = {377, 379, 387}, m = "takeScreenshotPreview")
/* loaded from: classes.dex */
public final class GameViewModel$takeScreenshotPreview$1 extends c {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GameViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GameViewModel$takeScreenshotPreview$1(GameViewModel gameViewModel, g gVar) {
        super(gVar);
        this.this$0 = gameViewModel;
    }

    @Override // j0.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object takeScreenshotPreview;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        takeScreenshotPreview = this.this$0.takeScreenshotPreview(0, this);
        return takeScreenshotPreview;
    }
}
