package com.cooldev.gba.emulator.gameboy.features.home.utils;

import h0.g;
import j0.c;
import j0.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@e(c = "com.cooldev.gba.emulator.gameboy.features.home.utils.UtilsKt", f = "Utils.kt", l = {240}, m = "timeMeasurement")
/* loaded from: classes.dex */
public final class UtilsKt$timeMeasurement$1 extends c {
    long J$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;

    public UtilsKt$timeMeasurement$1(g gVar) {
        super(gVar);
    }

    @Override // j0.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return UtilsKt.timeMeasurement(null, null, this);
    }
}
