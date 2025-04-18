package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class sn {
    private final a a;

    /* renamed from: b, reason: collision with root package name */
    private final Integer f8056b;

    /* renamed from: c, reason: collision with root package name */
    private final String f8057c;

    /* renamed from: d, reason: collision with root package name */
    private final String f8058d;

    /* renamed from: e, reason: collision with root package name */
    private Boolean f8059e;

    /* loaded from: classes.dex */
    public enum a {
        TCF_VENDOR,
        ATP_NETWORK,
        OTHER;

        /* JADX INFO: Access modifiers changed from: private */
        public static a b(int i10) {
            if (i10 != 0) {
                if (i10 != 1) {
                    return OTHER;
                }
                return ATP_NETWORK;
            }
            return TCF_VENDOR;
        }
    }

    public sn(JSONObject jSONObject, String str) {
        this.f8058d = str;
        this.a = a.b(JsonUtils.getInt(jSONObject, "type", a.OTHER.ordinal()));
        this.f8056b = JsonUtils.getInteger(jSONObject, "id", null);
        this.f8057c = JsonUtils.getString(jSONObject, "name", null);
    }

    public Boolean a() {
        return this.f8059e;
    }

    public String b() {
        return this.f8058d;
    }

    public String c() {
        return this.f8057c;
    }

    public Integer d() {
        return this.f8056b;
    }

    public String e() {
        String a10;
        Boolean bool = this.f8059e;
        if (bool != null) {
            a10 = String.valueOf(bool);
        } else {
            a10 = y3.b().a(com.applovin.impl.sdk.k.k());
        }
        return kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.n(new StringBuilder("\n"), this.f8058d, " - ", a10);
    }

    public a f() {
        return this.a;
    }

    public void a(Boolean bool) {
        this.f8059e = bool;
    }
}
