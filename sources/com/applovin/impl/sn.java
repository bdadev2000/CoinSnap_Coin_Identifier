package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class sn {

    /* renamed from: a, reason: collision with root package name */
    private final a f11220a;
    private final Integer b;

    /* renamed from: c, reason: collision with root package name */
    private final String f11221c;

    /* renamed from: d, reason: collision with root package name */
    private final String f11222d;

    /* renamed from: e, reason: collision with root package name */
    private Boolean f11223e;

    /* loaded from: classes.dex */
    public enum a {
        TCF_VENDOR,
        ATP_NETWORK,
        OTHER;

        /* JADX INFO: Access modifiers changed from: private */
        public static a b(int i9) {
            if (i9 != 0) {
                if (i9 != 1) {
                    return OTHER;
                }
                return ATP_NETWORK;
            }
            return TCF_VENDOR;
        }
    }

    public sn(JSONObject jSONObject, String str) {
        this.f11222d = str;
        this.f11220a = a.b(JsonUtils.getInt(jSONObject, "type", a.OTHER.ordinal()));
        this.b = JsonUtils.getInteger(jSONObject, "id", null);
        this.f11221c = JsonUtils.getString(jSONObject, "name", null);
    }

    public Boolean a() {
        return this.f11223e;
    }

    public String b() {
        return this.f11222d;
    }

    public String c() {
        return this.f11221c;
    }

    public Integer d() {
        return this.b;
    }

    public String e() {
        String a6;
        Boolean bool = this.f11223e;
        if (bool != null) {
            a6 = String.valueOf(bool);
        } else {
            a6 = y3.b().a(com.applovin.impl.sdk.k.k());
        }
        return Q7.n0.l(new StringBuilder("\n"), this.f11222d, " - ", a6);
    }

    public a f() {
        return this.f11220a;
    }

    public void a(Boolean bool) {
        this.f11223e = bool;
    }
}
