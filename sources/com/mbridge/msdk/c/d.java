package com.mbridge.msdk.c;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: f, reason: collision with root package name */
    private String f14719f;

    /* renamed from: g, reason: collision with root package name */
    private String f14720g;

    /* renamed from: h, reason: collision with root package name */
    private int f14721h;

    /* renamed from: a, reason: collision with root package name */
    private int f14715a = 1;
    private int b = 1;

    /* renamed from: c, reason: collision with root package name */
    private int f14716c = 0;

    /* renamed from: d, reason: collision with root package name */
    private int f14717d = 30;

    /* renamed from: e, reason: collision with root package name */
    private int f14718e = 0;

    /* renamed from: i, reason: collision with root package name */
    private int f14722i = 0;

    public static d a(String str) {
        Exception e4;
        d dVar;
        try {
            JSONObject jSONObject = new JSONObject(str);
            dVar = new d();
            try {
                dVar.f14719f = jSONObject.optString("h_d", com.mbridge.msdk.foundation.same.net.e.d.f().f15829e);
                dVar.f14720g = jSONObject.optString("t_d", com.mbridge.msdk.foundation.same.net.e.d.f().f15834j);
                dVar.f14721h = jSONObject.optInt("t_p", com.mbridge.msdk.foundation.same.net.e.d.f().f15836n);
                dVar.f14722i = jSONObject.optInt("type", 1);
                dVar.f14717d = jSONObject.optInt("d_t", 30);
                dVar.f14716c = jSONObject.optInt("d_a", 0);
            } catch (Exception e9) {
                e4 = e9;
                e4.printStackTrace();
                return dVar;
            }
        } catch (Exception e10) {
            e4 = e10;
            dVar = null;
        }
        return dVar;
    }

    public final int b() {
        return this.f14717d;
    }

    public final String c() {
        return this.f14719f;
    }

    public final String d() {
        return this.f14720g;
    }

    public final int e() {
        return this.f14721h;
    }

    public final int a() {
        return this.f14716c;
    }
}
