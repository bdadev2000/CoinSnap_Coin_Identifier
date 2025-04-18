package com.pgl.ssdk;

import android.content.Context;
import android.os.LocaleList;

/* loaded from: classes4.dex */
public class E extends G {

    /* renamed from: n, reason: collision with root package name */
    private Context f16507n;

    public E(Context context, String str) {
        super(context, null);
        this.f16507n = context;
        this.f16508b = F.a() + b();
    }

    @Override // com.pgl.ssdk.G
    public boolean a(int i10, byte[] bArr) {
        if (i10 == 200 && bArr != null) {
            try {
                if (bArr.length > 0) {
                    ((Integer) com.pgl.ssdk.ces.a.meta(com.vungle.ads.internal.protos.g.STALE_CACHED_RESPONSE_VALUE, null, bArr)).intValue();
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
        StringBuilder n10 = eb.j.n(vd.e.e("?os=0&ver=6.3.0.0.overseas-rc.4&mode=1&app_ver=", String.valueOf(x.c(this.f16507n))), "&region=");
        n10.append(LocaleList.getDefault().get(0).getLanguage());
        StringBuilder n11 = eb.j.n(n10.toString(), "&did=");
        n11.append(com.pgl.ssdk.ces.c.e());
        StringBuilder n12 = eb.j.n(n11.toString(), "&aid=");
        n12.append(com.pgl.ssdk.ces.c.d());
        return n12.toString();
    }
}
