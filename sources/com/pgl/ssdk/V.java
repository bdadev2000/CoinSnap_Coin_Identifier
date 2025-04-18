package com.pgl.ssdk;

import android.content.Context;

/* loaded from: classes4.dex */
public class V extends G {

    /* renamed from: n, reason: collision with root package name */
    private Context f16532n;

    public V(Context context, String str) {
        super(context, null);
        this.f16532n = context;
        this.f16508b = F.b() + b();
    }

    @Override // com.pgl.ssdk.G
    public boolean a(int i10, byte[] bArr) {
        Object a;
        try {
            a = S.a(bArr);
        } catch (Throwable unused) {
        }
        if ((a instanceof Integer) && ((Integer) a).intValue() == 0) {
            S.a = 200;
            return true;
        }
        if (a instanceof String) {
            S.f16529c = (String) a;
            S.a = 200;
            return true;
        }
        return false;
    }

    public String b() {
        return "?os=android&app_id=" + S.f16528b + "&did=" + com.pgl.ssdk.ces.c.e() + "&app_ver=" + x.c(this.f16532n) + "&platform=android&ver=6.3.0.0.overseas-rc.4&mode=1";
    }
}
