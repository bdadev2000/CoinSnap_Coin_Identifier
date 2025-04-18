package com.mbridge.msdk.newreward.function.g;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.same.net.Aa;
import com.mbridge.msdk.foundation.same.net.f.e;
import com.mbridge.msdk.foundation.same.net.f.f;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.newreward.function.d.b.g;
import java.net.URLEncoder;
import java.util.Map;
import kotlin.text.Typography;

/* loaded from: classes4.dex */
public final class c extends a {
    private String a;

    /* renamed from: b, reason: collision with root package name */
    private int f14708b;

    /* renamed from: c, reason: collision with root package name */
    private String f14709c;

    /* renamed from: d, reason: collision with root package name */
    private int f14710d;

    public final void a(String str) {
        this.a = str;
    }

    public final String b() {
        return this.a;
    }

    public final Map<String, String> c() {
        String str;
        e eVar = new e(a());
        if (this.f14710d == g.f14584b && !TextUtils.isEmpty(this.a)) {
            eVar.a("unit_ids", String.format("[%s]", this.a));
        }
        if (TextUtils.isEmpty(this.f14709c)) {
            str = "";
        } else {
            str = this.f14709c;
        }
        eVar.a("vtag", str);
        if (com.mbridge.msdk.e.b.a()) {
            String b3 = Aa.b();
            if (!TextUtils.isEmpty(b3)) {
                eVar.a("keyword", b3);
            }
        }
        com.mbridge.msdk.c.a.d.a(com.mbridge.msdk.foundation.controller.c.m().c(), eVar);
        f.d(eVar);
        f.f(eVar);
        return eVar.a();
    }

    public final String d() {
        StringBuilder sb2 = new StringBuilder();
        try {
            for (Map.Entry<String, String> entry : c().entrySet()) {
                if (sb2.length() > 0) {
                    sb2.append(Typography.amp);
                }
                sb2.append(URLEncoder.encode(entry.getKey(), "UTF-8"));
                sb2.append("=");
                sb2.append(URLEncoder.encode(entry.getValue(), "UTF-8"));
            }
        } catch (Throwable th2) {
            ad.b("RewardSettingReqParameters", th2.getMessage());
        }
        return sb2.toString();
    }

    public final void a(int i10) {
        this.f14708b = i10;
    }

    public final void b(String str) {
        this.f14709c = str;
    }

    public final void b(int i10) {
        this.f14710d = i10;
    }
}
