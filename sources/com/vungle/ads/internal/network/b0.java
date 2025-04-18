package com.vungle.ads.internal.network;

import bh.g1;
import bh.t2;
import com.mbridge.msdk.foundation.download.Command;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonKt;
import wh.c0;
import wh.d0;
import wh.l0;
import wh.n0;
import wh.r0;
import wh.s0;

/* loaded from: classes4.dex */
public final class b0 implements VungleApi {
    private static final String VUNGLE_VERSION = "7.1.0";
    private String appId;
    private final ch.b emptyResponseConverter;
    private final wh.j okHttpClient;
    public static final a0 Companion = new a0(null);
    private static final Json json = JsonKt.Json$default(null, z.INSTANCE, 1, null);

    public b0(wh.j okHttpClient) {
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        this.okHttpClient = okHttpClient;
        this.emptyResponseConverter = new ch.b();
    }

    private final n0 defaultBuilder(String str, String str2) {
        n0 n0Var = new n0();
        n0Var.i(str2);
        n0Var.a(Command.HTTP_HEADER_USER_AGENT, str);
        n0Var.a("Vungle-Version", VUNGLE_VERSION);
        n0Var.a("Content-Type", "application/json");
        String str3 = this.appId;
        if (str3 != null) {
            n0Var.a("X-Vungle-App-Id", str3);
        }
        return n0Var;
    }

    private final n0 defaultProtoBufBuilder(String str, String str2) {
        n0 n0Var = new n0();
        n0Var.i(str2);
        n0Var.a(Command.HTTP_HEADER_USER_AGENT, str);
        n0Var.a("Vungle-Version", VUNGLE_VERSION);
        n0Var.a("Content-Type", "application/x-protobuf");
        String str3 = this.appId;
        if (str3 != null) {
            n0Var.a("X-Vungle-App-Id", str3);
        }
        return n0Var;
    }

    @Override // com.vungle.ads.internal.network.VungleApi
    public a ads(String ua2, String path, g1 body) {
        Intrinsics.checkNotNullParameter(ua2, "ua");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(body, "body");
        try {
            Json json2 = json;
            KSerializer<Object> serializer = SerializersKt.serializer(json2.getSerializersModule(), Reflection.typeOf(g1.class));
            Intrinsics.checkNotNull(serializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
            String encodeToString = json2.encodeToString(serializer, body);
            n0 defaultBuilder = defaultBuilder(ua2, path);
            s0.Companion.getClass();
            defaultBuilder.f(r0.a(encodeToString, null));
            return new h(((l0) this.okHttpClient).a(defaultBuilder.b()), new ch.e(Reflection.typeOf(bh.z.class)));
        } catch (Exception unused) {
            com.vungle.ads.s.INSTANCE.logError$vungle_ads_release(101, vd.e.e("Error with url: ", path), (r13 & 4) != 0 ? null : null, (r13 & 8) != 0 ? null : null, (r13 & 16) != 0 ? null : null);
            return null;
        }
    }

    @Override // com.vungle.ads.internal.network.VungleApi
    public a config(String ua2, String path, g1 body) {
        Intrinsics.checkNotNullParameter(ua2, "ua");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(body, "body");
        try {
            Json json2 = json;
            KSerializer<Object> serializer = SerializersKt.serializer(json2.getSerializersModule(), Reflection.typeOf(g1.class));
            Intrinsics.checkNotNull(serializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
            String encodeToString = json2.encodeToString(serializer, body);
            n0 defaultBuilder = defaultBuilder(ua2, path);
            s0.Companion.getClass();
            defaultBuilder.f(r0.a(encodeToString, null));
            return new h(((l0) this.okHttpClient).a(defaultBuilder.b()), new ch.e(Reflection.typeOf(t2.class)));
        } catch (Exception unused) {
            return null;
        }
    }

    public final wh.j getOkHttpClient$vungle_ads_release() {
        return this.okHttpClient;
    }

    @Override // com.vungle.ads.internal.network.VungleApi
    public a pingTPAT(String ua2, String url) {
        Intrinsics.checkNotNullParameter(ua2, "ua");
        Intrinsics.checkNotNullParameter(url, "url");
        char[] cArr = d0.f27032k;
        n0 defaultBuilder = defaultBuilder(ua2, c0.i(url).f().a().f27040i);
        defaultBuilder.e("GET", null);
        return new h(((l0) this.okHttpClient).a(defaultBuilder.b()), this.emptyResponseConverter);
    }

    @Override // com.vungle.ads.internal.network.VungleApi
    public a ri(String ua2, String path, g1 body) {
        Intrinsics.checkNotNullParameter(ua2, "ua");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(body, "body");
        try {
            Json json2 = json;
            KSerializer<Object> serializer = SerializersKt.serializer(json2.getSerializersModule(), Reflection.typeOf(g1.class));
            Intrinsics.checkNotNull(serializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
            String encodeToString = json2.encodeToString(serializer, body);
            n0 defaultBuilder = defaultBuilder(ua2, path);
            s0.Companion.getClass();
            defaultBuilder.f(r0.a(encodeToString, null));
            return new h(((l0) this.okHttpClient).a(defaultBuilder.b()), this.emptyResponseConverter);
        } catch (Exception unused) {
            com.vungle.ads.s.INSTANCE.logError$vungle_ads_release(101, vd.e.e("Error with url: ", path), (r13 & 4) != 0 ? null : null, (r13 & 8) != 0 ? null : null, (r13 & 16) != 0 ? null : null);
            return null;
        }
    }

    @Override // com.vungle.ads.internal.network.VungleApi
    public a sendAdMarkup(String url, s0 requestBody) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        char[] cArr = d0.f27032k;
        n0 defaultBuilder = defaultBuilder("debug", c0.i(url).f().a().f27040i);
        defaultBuilder.f(requestBody);
        return new h(((l0) this.okHttpClient).a(defaultBuilder.b()), this.emptyResponseConverter);
    }

    @Override // com.vungle.ads.internal.network.VungleApi
    public a sendErrors(String ua2, String path, s0 requestBody) {
        Intrinsics.checkNotNullParameter(ua2, "ua");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        char[] cArr = d0.f27032k;
        n0 defaultProtoBufBuilder = defaultProtoBufBuilder(ua2, c0.i(path).f().a().f27040i);
        defaultProtoBufBuilder.f(requestBody);
        return new h(((l0) this.okHttpClient).a(defaultProtoBufBuilder.b()), this.emptyResponseConverter);
    }

    @Override // com.vungle.ads.internal.network.VungleApi
    public a sendMetrics(String ua2, String path, s0 requestBody) {
        Intrinsics.checkNotNullParameter(ua2, "ua");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        char[] cArr = d0.f27032k;
        n0 defaultProtoBufBuilder = defaultProtoBufBuilder(ua2, c0.i(path).f().a().f27040i);
        defaultProtoBufBuilder.f(requestBody);
        return new h(((l0) this.okHttpClient).a(defaultProtoBufBuilder.b()), this.emptyResponseConverter);
    }

    @Override // com.vungle.ads.internal.network.VungleApi
    public void setAppId(String appId) {
        Intrinsics.checkNotNullParameter(appId, "appId");
        this.appId = appId;
    }
}
