package com.mbridge.msdk.c;

import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    private String f12344e;

    /* renamed from: f, reason: collision with root package name */
    private String f12345f;

    /* renamed from: g, reason: collision with root package name */
    private int f12346g;
    private int a = 1;

    /* renamed from: b, reason: collision with root package name */
    private int f12341b = 0;

    /* renamed from: c, reason: collision with root package name */
    private int f12342c = 0;

    /* renamed from: d, reason: collision with root package name */
    private int f12343d = 0;

    /* renamed from: h, reason: collision with root package name */
    private int f12347h = 0;

    public static a a(String str) {
        Exception e2;
        a aVar;
        try {
            JSONObject jSONObject = new JSONObject(str);
            aVar = new a();
            try {
                aVar.f12344e = jSONObject.optString("http_domain", com.mbridge.msdk.foundation.same.net.e.d.f().f13397g);
                aVar.f12345f = jSONObject.optString("tcp_domain", com.mbridge.msdk.foundation.same.net.e.d.f().f13401k);
                aVar.f12346g = jSONObject.optInt("tcp_port", com.mbridge.msdk.foundation.same.net.e.d.f().f13405o);
                aVar.f12347h = jSONObject.optInt("type", 0);
                int i10 = 1;
                int optInt = jSONObject.optInt("batch_size", 1);
                if (optInt >= 1) {
                    i10 = optInt;
                }
                aVar.a = i10;
                aVar.f12342c = jSONObject.optInt("duration", 0);
                aVar.f12341b = jSONObject.optInt("disable", 0);
                aVar.f12343d = jSONObject.optInt("e_t_l", 0);
            } catch (Exception e10) {
                e2 = e10;
                e2.printStackTrace();
                return aVar;
            }
        } catch (Exception e11) {
            e2 = e11;
            aVar = null;
        }
        return aVar;
    }

    public final int b() {
        return this.f12341b;
    }

    public final int c() {
        return this.f12342c;
    }

    public final int d() {
        return this.f12343d;
    }

    public final String e() {
        return this.f12344e;
    }

    public final String f() {
        return this.f12345f;
    }

    public final int g() {
        return this.f12346g;
    }

    public final int h() {
        return this.f12347h;
    }

    public final int a() {
        return this.a;
    }
}
