package com.cooldev.gba.emulator.gameboy.features.home.utils;

import d0.n;
import h0.g;
import i0.a;
import j0.c;
import j0.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@e(c = "com.cooldev.gba.emulator.gameboy.features.home.utils.UtilsKt", f = "Utils.kt", l = {116}, m = "runCatchingWithRetry")
/* loaded from: classes.dex */
public final class UtilsKt$runCatchingWithRetry$1<T> extends c {
    int I$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;

    public UtilsKt$runCatchingWithRetry$1(g gVar) {
        super(gVar);
    }

    @Override // j0.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object runCatchingWithRetry = UtilsKt.runCatchingWithRetry(0, null, this);
        return runCatchingWithRetry == a.f30806a ? runCatchingWithRetry : new n(runCatchingWithRetry);
    }
}
