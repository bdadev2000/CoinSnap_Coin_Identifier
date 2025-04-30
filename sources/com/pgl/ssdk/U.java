package com.pgl.ssdk;

import android.content.Context;

/* loaded from: classes3.dex */
public class U extends F {

    /* renamed from: n, reason: collision with root package name */
    private Context f19554n;

    public U(Context context, String str) {
        super(context, null);
        this.f19554n = context;
        this.b = E.b() + b();
    }

    @Override // com.pgl.ssdk.F
    public boolean a(int i9, byte[] bArr) {
        Object a6;
        try {
            a6 = Q.a(bArr);
        } catch (Throwable unused) {
        }
        if ((a6 instanceof Integer) && ((Integer) a6).intValue() == 0) {
            Q.f19550a = 200;
            return true;
        }
        if (a6 instanceof String) {
            Q.f19551c = (String) a6;
            Q.f19550a = 200;
            return true;
        }
        return false;
    }

    public String b() {
        return "?os=android&app_id=" + Q.b + "&did=" + com.pgl.ssdk.ces.c.d() + "&app_ver=" + AbstractC2049c.a(this.f19554n) + "&platform=android&ver=6.0.0.0.overseas-rc.5&mode=1";
    }
}
