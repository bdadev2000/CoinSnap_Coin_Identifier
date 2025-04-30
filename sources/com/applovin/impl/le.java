package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class le extends c4 {

    /* renamed from: e, reason: collision with root package name */
    private static final String[] f8828e = {com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS, "settings", "auto_init_adapters", "test_mode_idfas", "test_mode_auto_init_adapters", "ad_unit_signal_providers"};

    /* renamed from: f, reason: collision with root package name */
    private static final String[] f8829f = {com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS, "settings", "signal_providers", "ad_unit_signal_providers"};

    public static void a(JSONObject jSONObject) {
    }

    public static String b(com.applovin.impl.sdk.k kVar) {
        return c4.a((String) kVar.a(qe.f10298I6), "1.0/mediate", kVar);
    }

    public static void d(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        if (JsonUtils.valueExists(jSONObject, "ad_unit_signal_providers")) {
            em.a(jSONObject, kVar);
        }
    }

    public static void e(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        if (jSONObject.length() == 0) {
            return;
        }
        if (!JsonUtils.valueExists(jSONObject, "auto_init_adapters") && !JsonUtils.valueExists(jSONObject, "test_mode_auto_init_adapters")) {
            kVar.c(qj.f10358G);
            return;
        }
        JSONObject shallowCopy = JsonUtils.shallowCopy(jSONObject);
        JsonUtils.removeObjectsForKeys(shallowCopy, f8829f);
        kVar.b(qj.f10358G, shallowCopy.toString());
    }

    public static void f(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        if (JsonUtils.valueExists(jSONObject, "signal_providers")) {
            JSONObject shallowCopy = JsonUtils.shallowCopy(jSONObject);
            JsonUtils.removeObjectsForKeys(shallowCopy, f8828e);
            kVar.b(qj.f10357F, shallowCopy.toString());
            em.a(shallowCopy);
        }
    }

    public static String i(com.applovin.impl.sdk.k kVar) {
        return c4.a((String) kVar.a(qe.f10299J6), "1.0/mediate_debug", kVar);
    }

    public static String j(com.applovin.impl.sdk.k kVar) {
        return c4.a((String) kVar.a(qe.f10298I6), "1.0/mediate_debug", kVar);
    }

    public static String a(com.applovin.impl.sdk.k kVar) {
        return c4.a((String) kVar.a(qe.f10299J6), "1.0/mediate", kVar);
    }
}
