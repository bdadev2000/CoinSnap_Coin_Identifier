package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class rn {

    /* renamed from: a, reason: collision with root package name */
    private final a f26352a;

    /* renamed from: b, reason: collision with root package name */
    private final Integer f26353b;

    /* renamed from: c, reason: collision with root package name */
    private final String f26354c;
    private final String d;
    private Boolean e;

    /* loaded from: classes2.dex */
    public enum a {
        TCF_VENDOR,
        ATP_NETWORK,
        OTHER;

        /* JADX INFO: Access modifiers changed from: private */
        public static a b(int i2) {
            return i2 != 0 ? i2 != 1 ? OTHER : ATP_NETWORK : TCF_VENDOR;
        }
    }

    public rn(JSONObject jSONObject, String str) {
        this.d = str;
        this.f26352a = a.b(JsonUtils.getInt(jSONObject, "type", a.OTHER.ordinal()));
        this.f26353b = JsonUtils.getInteger(jSONObject, "id", null);
        this.f26354c = JsonUtils.getString(jSONObject, "name", null);
    }

    public Boolean a() {
        return this.e;
    }

    public String b() {
        return this.d;
    }

    public String c() {
        return this.f26354c;
    }

    public Integer d() {
        return this.f26353b;
    }

    public String e() {
        Boolean bool = this.e;
        return "\n" + this.d + " - " + (bool != null ? String.valueOf(bool) : a4.b().a(com.applovin.impl.sdk.j.l()));
    }

    public a f() {
        return this.f26352a;
    }

    public void a(Boolean bool) {
        this.e = bool;
    }
}
