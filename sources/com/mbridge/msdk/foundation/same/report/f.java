package com.mbridge.msdk.foundation.same.report;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.ad;
import java.net.URLEncoder;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class f {
    private static volatile f a;

    /* renamed from: b, reason: collision with root package name */
    private volatile com.mbridge.msdk.tracker.m f13504b;

    public static f a() {
        if (a == null) {
            synchronized (f.class) {
                if (a == null) {
                    a = new f();
                }
            }
        }
        return a;
    }

    public final void b() {
        if (this.f13504b != null) {
            this.f13504b.f();
        }
    }

    public final void c() {
        d().f();
    }

    public final com.mbridge.msdk.tracker.m d() {
        if (this.f13504b == null) {
            this.f13504b = com.mbridge.msdk.foundation.same.report.d.c.a().c();
        }
        return this.f13504b;
    }

    public final void a(Context context, String str, String str2, String str3, String str4, int i10) {
        com.mbridge.msdk.tracker.m d10 = a().d();
        if (d10 == null) {
            return;
        }
        if (!d10.a("2000105")) {
            ad.a("MetricsReportUtil", "reportClickImpException can not track");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            if (TextUtils.isEmpty(str2)) {
                jSONObject.put("url", "");
            } else {
                jSONObject.put("url", URLEncoder.encode(str2, "utf-8"));
            }
            jSONObject.put("type", i10);
            if (!TextUtils.isEmpty(str3)) {
                jSONObject.put("rid", str3);
            }
            if (!TextUtils.isEmpty(str4)) {
                jSONObject.put("rid_n", str4);
            }
            try {
                long[] h10 = d10.h();
                jSONObject.put("track_time", h10[0]);
                jSONObject.put("track_count", h10[1]);
                jSONObject.put("session_id", d10.b());
            } catch (Exception unused) {
            }
            jSONObject.put("reason", URLEncoder.encode(str, "utf-8"));
            com.mbridge.msdk.tracker.e eVar = new com.mbridge.msdk.tracker.e("2000105");
            eVar.a(jSONObject);
            eVar.b(0);
            eVar.a(0);
            eVar.a(c.c());
            d10.a(eVar);
        } catch (Exception e2) {
            ad.b("MetricsReportUtil", e2.getMessage());
        }
    }
}
