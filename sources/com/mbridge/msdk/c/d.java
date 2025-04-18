package com.mbridge.msdk.c;

import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: f, reason: collision with root package name */
    private String f12428f;

    /* renamed from: g, reason: collision with root package name */
    private String f12429g;

    /* renamed from: h, reason: collision with root package name */
    private int f12430h;
    private int a = 1;

    /* renamed from: b, reason: collision with root package name */
    private int f12424b = 1;

    /* renamed from: c, reason: collision with root package name */
    private int f12425c = 0;

    /* renamed from: d, reason: collision with root package name */
    private int f12426d = 30;

    /* renamed from: e, reason: collision with root package name */
    private int f12427e = 0;

    /* renamed from: i, reason: collision with root package name */
    private int f12431i = 0;

    public static d a(String str) {
        Exception e2;
        d dVar;
        try {
            JSONObject jSONObject = new JSONObject(str);
            dVar = new d();
            try {
                dVar.f12428f = jSONObject.optString("h_d", com.mbridge.msdk.foundation.same.net.e.d.f().f13395e);
                dVar.f12429g = jSONObject.optString("t_d", com.mbridge.msdk.foundation.same.net.e.d.f().f13400j);
                dVar.f12430h = jSONObject.optInt("t_p", com.mbridge.msdk.foundation.same.net.e.d.f().f13404n);
                dVar.f12431i = jSONObject.optInt("type", 1);
                dVar.f12426d = jSONObject.optInt("d_t", 30);
                dVar.f12425c = jSONObject.optInt("d_a", 0);
            } catch (Exception e10) {
                e2 = e10;
                e2.printStackTrace();
                return dVar;
            }
        } catch (Exception e11) {
            e2 = e11;
            dVar = null;
        }
        return dVar;
    }

    public final int b() {
        return this.f12426d;
    }

    public final String c() {
        return this.f12428f;
    }

    public final String d() {
        return this.f12429g;
    }

    public final int e() {
        return this.f12430h;
    }

    public final int a() {
        return this.f12425c;
    }
}
