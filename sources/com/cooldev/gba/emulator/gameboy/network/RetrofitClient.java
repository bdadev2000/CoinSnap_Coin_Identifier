package com.cooldev.gba.emulator.gameboy.network;

import androidx.compose.runtime.internal.StabilityInferred;
import b1.f0;
import com.cooldev.gba.emulator.gameboy.network.repo.SlackApiRepository;
import d0.h;
import org.jetbrains.annotations.NotNull;
import p0.a;
import retrofit2.Retrofit;

@StabilityInferred
/* loaded from: classes.dex */
public final class RetrofitClient {

    @NotNull
    public static final RetrofitClient INSTANCE = new RetrofitClient();

    @NotNull
    private static final h instanceSlack$delegate = f0.t(RetrofitClient$instanceSlack$2.INSTANCE);

    @NotNull
    private static final h slack$delegate = f0.t(RetrofitClient$slack$2.INSTANCE);
    public static final int $stable = 8;

    private RetrofitClient() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Retrofit getInstanceSlack() {
        Object value = instanceSlack$delegate.getValue();
        a.r(value, "getValue(...)");
        return (Retrofit) value;
    }

    @NotNull
    public final SlackApiRepository getSlack() {
        Object value = slack$delegate.getValue();
        a.r(value, "getValue(...)");
        return (SlackApiRepository) value;
    }
}
