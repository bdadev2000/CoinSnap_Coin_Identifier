package com.mbridge.msdk.newreward.function.g;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.same.net.Aa;
import com.mbridge.msdk.foundation.same.net.f.e;
import com.mbridge.msdk.foundation.same.net.f.f;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.newreward.function.d.b.g;
import java.net.URLEncoder;
import java.util.Map;

/* loaded from: classes3.dex */
public final class c extends a {

    /* renamed from: a, reason: collision with root package name */
    private String f17340a;
    private int b;

    /* renamed from: c, reason: collision with root package name */
    private String f17341c;

    /* renamed from: d, reason: collision with root package name */
    private int f17342d;

    public final void a(String str) {
        this.f17340a = str;
    }

    public final String b() {
        return this.f17340a;
    }

    public final Map<String, String> c() {
        String str;
        e eVar = new e(a());
        if (this.f17342d == g.b && !TextUtils.isEmpty(this.f17340a)) {
            eVar.a("unit_ids", "[" + this.f17340a + "]");
        }
        if (TextUtils.isEmpty(this.f17341c)) {
            str = "";
        } else {
            str = this.f17341c;
        }
        eVar.a("vtag", str);
        if (com.mbridge.msdk.e.b.a()) {
            String b = Aa.b();
            if (!TextUtils.isEmpty(b)) {
                eVar.a("keyword", b);
            }
        }
        com.mbridge.msdk.c.a.d.a(com.mbridge.msdk.foundation.controller.c.m().c(), eVar);
        f.d(eVar);
        f.f(eVar);
        return eVar.a();
    }

    public final String d() {
        StringBuilder sb = new StringBuilder();
        try {
            for (Map.Entry<String, String> entry : c().entrySet()) {
                if (sb.length() > 0) {
                    sb.append('&');
                }
                sb.append(URLEncoder.encode(entry.getKey(), "UTF-8"));
                sb.append("=");
                sb.append(URLEncoder.encode(entry.getValue(), "UTF-8"));
            }
        } catch (Throwable th) {
            ad.b("RewardSettingReqParameters", th.getMessage());
        }
        return sb.toString();
    }

    public final void a(int i9) {
        this.b = i9;
    }

    public final void b(String str) {
        this.f17341c = str;
    }

    public final void b(int i9) {
        this.f17342d = i9;
    }
}
