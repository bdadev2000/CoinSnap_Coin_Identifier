package com.mbridge.msdk.c;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    private String f14607e;

    /* renamed from: f, reason: collision with root package name */
    private String f14608f;

    /* renamed from: g, reason: collision with root package name */
    private int f14609g;

    /* renamed from: a, reason: collision with root package name */
    private int f14604a = 1;
    private int b = 0;

    /* renamed from: c, reason: collision with root package name */
    private int f14605c = 0;

    /* renamed from: d, reason: collision with root package name */
    private int f14606d = 0;

    /* renamed from: h, reason: collision with root package name */
    private int f14610h = 0;

    public static a a(String str) {
        Exception e4;
        a aVar;
        try {
            JSONObject jSONObject = new JSONObject(str);
            aVar = new a();
            try {
                aVar.f14607e = jSONObject.optString("http_domain", com.mbridge.msdk.foundation.same.net.e.d.f().f15831g);
                aVar.f14608f = jSONObject.optString("tcp_domain", com.mbridge.msdk.foundation.same.net.e.d.f().f15835k);
                aVar.f14609g = jSONObject.optInt("tcp_port", com.mbridge.msdk.foundation.same.net.e.d.f().f15837o);
                aVar.f14610h = jSONObject.optInt("type", 0);
                int i9 = 1;
                int optInt = jSONObject.optInt("batch_size", 1);
                if (optInt >= 1) {
                    i9 = optInt;
                }
                aVar.f14604a = i9;
                aVar.f14605c = jSONObject.optInt("duration", 0);
                aVar.b = jSONObject.optInt("disable", 0);
                aVar.f14606d = jSONObject.optInt("e_t_l", 0);
            } catch (Exception e9) {
                e4 = e9;
                e4.printStackTrace();
                return aVar;
            }
        } catch (Exception e10) {
            e4 = e10;
            aVar = null;
        }
        return aVar;
    }

    public final int b() {
        return this.b;
    }

    public final int c() {
        return this.f14605c;
    }

    public final int d() {
        return this.f14606d;
    }

    public final String e() {
        return this.f14607e;
    }

    public final String f() {
        return this.f14608f;
    }

    public final int g() {
        return this.f14609g;
    }

    public final int h() {
        return this.f14610h;
    }

    public final int a() {
        return this.f14604a;
    }
}
