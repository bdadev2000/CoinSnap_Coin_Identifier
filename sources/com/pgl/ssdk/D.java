package com.pgl.ssdk;

import android.content.Context;
import android.os.LocaleList;
import x0.AbstractC2914a;
import z.AbstractC2965e;

/* loaded from: classes3.dex */
public class D extends F {

    /* renamed from: n, reason: collision with root package name */
    private Context f19524n;

    public D(Context context, String str) {
        super(context, null);
        this.f19524n = context;
        this.b = E.a() + b();
    }

    @Override // com.pgl.ssdk.F
    public boolean a(int i9, byte[] bArr) {
        if (i9 == 200 && bArr != null) {
            try {
                if (bArr.length > 0) {
                    ((Integer) com.pgl.ssdk.ces.a.meta(com.vungle.ads.internal.protos.g.STALE_CACHED_RESPONSE_VALUE, null, bArr)).getClass();
                    return true;
                }
                return true;
            } catch (Throwable unused) {
                return true;
            }
        }
        return true;
    }

    public String b() {
        StringBuilder c9 = AbstractC2965e.c(AbstractC2914a.d("?os=0&ver=6.0.0.0.overseas-rc.5&mode=1&app_ver=", String.valueOf(AbstractC2049c.a(this.f19524n))), "&region=");
        c9.append(LocaleList.getDefault().get(0).getLanguage());
        StringBuilder c10 = AbstractC2965e.c(c9.toString(), "&did=");
        c10.append(com.pgl.ssdk.ces.c.d());
        StringBuilder c11 = AbstractC2965e.c(c10.toString(), "&aid=");
        c11.append(com.pgl.ssdk.ces.c.c());
        return c11.toString();
    }
}
