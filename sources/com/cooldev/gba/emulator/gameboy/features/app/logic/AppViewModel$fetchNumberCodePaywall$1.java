package com.cooldev.gba.emulator.gameboy.features.app.logic;

import h0.g;
import j0.c;
import j0.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@e(c = "com.cooldev.gba.emulator.gameboy.features.app.logic.AppViewModel", f = "AppViewModel.kt", l = {46}, m = "fetchNumberCodePaywall")
/* loaded from: classes2.dex */
public final class AppViewModel$fetchNumberCodePaywall$1 extends c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AppViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppViewModel$fetchNumberCodePaywall$1(AppViewModel appViewModel, g gVar) {
        super(gVar);
        this.this$0 = appViewModel;
    }

    @Override // j0.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object fetchNumberCodePaywall;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        fetchNumberCodePaywall = this.this$0.fetchNumberCodePaywall(this);
        return fetchNumberCodePaywall;
    }
}
