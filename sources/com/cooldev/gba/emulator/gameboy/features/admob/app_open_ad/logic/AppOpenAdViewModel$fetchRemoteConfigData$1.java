package com.cooldev.gba.emulator.gameboy.features.admob.app_open_ad.logic;

import h0.g;
import j0.c;
import j0.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.objectweb.asm.Opcodes;

@e(c = "com.cooldev.gba.emulator.gameboy.features.admob.app_open_ad.logic.AppOpenAdViewModel", f = "AppOpenAdViewModel.kt", l = {Opcodes.V17}, m = "fetchRemoteConfigData")
/* loaded from: classes.dex */
public final class AppOpenAdViewModel$fetchRemoteConfigData$1 extends c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AppOpenAdViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppOpenAdViewModel$fetchRemoteConfigData$1(AppOpenAdViewModel appOpenAdViewModel, g gVar) {
        super(gVar);
        this.this$0 = appOpenAdViewModel;
    }

    @Override // j0.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object fetchRemoteConfigData;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        fetchRemoteConfigData = this.this$0.fetchRemoteConfigData(this);
        return fetchRemoteConfigData;
    }
}
