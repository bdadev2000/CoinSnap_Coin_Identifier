package com.cooldev.gba.emulator.gameboy.network;

import com.cooldev.gba.emulator.gameboy.network.repo.SlackApiRepository;
import kotlin.jvm.internal.r;
import q0.a;
import retrofit2.Retrofit;

/* loaded from: classes.dex */
public final class RetrofitClient$slack$2 extends r implements a {
    public static final RetrofitClient$slack$2 INSTANCE = new RetrofitClient$slack$2();

    public RetrofitClient$slack$2() {
        super(0);
    }

    @Override // q0.a
    public final SlackApiRepository invoke() {
        Retrofit instanceSlack;
        instanceSlack = RetrofitClient.INSTANCE.getInstanceSlack();
        return (SlackApiRepository) instanceSlack.create(SlackApiRepository.class);
    }
}
