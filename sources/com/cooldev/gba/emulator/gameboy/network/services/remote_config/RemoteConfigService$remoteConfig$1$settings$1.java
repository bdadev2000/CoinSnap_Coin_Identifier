package com.cooldev.gba.emulator.gameboy.network.services.remote_config;

import com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings;
import d0.b0;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import p0.a;
import q0.l;

/* loaded from: classes2.dex */
public final class RemoteConfigService$remoteConfig$1$settings$1 extends r implements l {
    public static final RemoteConfigService$remoteConfig$1$settings$1 INSTANCE = new RemoteConfigService$remoteConfig$1$settings$1();

    public RemoteConfigService$remoteConfig$1$settings$1() {
        super(1);
    }

    @Override // q0.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((FirebaseRemoteConfigSettings.Builder) obj);
        return b0.f30125a;
    }

    public final void invoke(@NotNull FirebaseRemoteConfigSettings.Builder builder) {
        a.s(builder, "$this$remoteConfigSettings");
        builder.setFetchTimeoutInSeconds(30L);
        builder.setMinimumFetchIntervalInSeconds(10800L);
    }
}
