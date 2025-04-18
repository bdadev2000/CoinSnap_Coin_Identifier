package com.cooldev.gba.emulator.gameboy.network.services.remote_config;

import h0.g;
import j0.c;
import j0.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@e(c = "com.cooldev.gba.emulator.gameboy.network.services.remote_config.RemoteConfigService", f = "RemoteConfigService.kt", l = {50}, m = "fetchConfigValue")
/* loaded from: classes2.dex */
public final class RemoteConfigService$fetchConfigValue$1<T> extends c {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RemoteConfigService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteConfigService$fetchConfigValue$1(RemoteConfigService remoteConfigService, g gVar) {
        super(gVar);
        this.this$0 = remoteConfigService;
    }

    @Override // j0.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.fetchConfigValue(null, null, this);
    }
}
