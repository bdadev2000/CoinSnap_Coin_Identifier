package com.cooldev.gba.emulator.gameboy.network;

import com.cooldev.gba.emulator.gameboy.constants.EndPoints;
import kotlin.jvm.internal.r;
import q0.a;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/* loaded from: classes.dex */
public final class RetrofitClient$instanceSlack$2 extends r implements a {
    public static final RetrofitClient$instanceSlack$2 INSTANCE = new RetrofitClient$instanceSlack$2();

    public RetrofitClient$instanceSlack$2() {
        super(0);
    }

    @Override // q0.a
    public final Retrofit invoke() {
        return new Retrofit.Builder().baseUrl(EndPoints.URL_SLACK).addConverterFactory(GsonConverterFactory.create()).build();
    }
}
