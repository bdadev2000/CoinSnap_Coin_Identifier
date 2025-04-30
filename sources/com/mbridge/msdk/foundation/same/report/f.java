package com.mbridge.msdk.foundation.same.report;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.ad;
import java.net.URLEncoder;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private static volatile f f15941a;
    private volatile com.mbridge.msdk.tracker.m b;

    public static f a() {
        if (f15941a == null) {
            synchronized (f.class) {
                try {
                    if (f15941a == null) {
                        f15941a = new f();
                    }
                } finally {
                }
            }
        }
        return f15941a;
    }

    public final void b() {
        if (this.b != null) {
            this.b.f();
        }
    }

    public final void c() {
        d().f();
    }

    public final com.mbridge.msdk.tracker.m d() {
        if (this.b == null) {
            this.b = com.mbridge.msdk.foundation.same.report.d.c.a().c();
        }
        return this.b;
    }

    public final void a(Context context, String str, String str2, String str3, String str4, int i9) {
        com.mbridge.msdk.tracker.m d2 = a().d();
        if (d2 == null) {
            return;
        }
        if (!d2.a("2000105")) {
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
            jSONObject.put("type", i9);
            if (!TextUtils.isEmpty(str3)) {
                jSONObject.put("rid", str3);
            }
            if (!TextUtils.isEmpty(str4)) {
                jSONObject.put("rid_n", str4);
            }
            try {
                long[] h6 = d2.h();
                jSONObject.put("track_time", h6[0]);
                jSONObject.put("track_count", h6[1]);
                jSONObject.put("session_id", d2.b());
            } catch (Exception unused) {
            }
            jSONObject.put("reason", URLEncoder.encode(str, "utf-8"));
            com.mbridge.msdk.tracker.e eVar = new com.mbridge.msdk.tracker.e("2000105");
            eVar.a(jSONObject);
            eVar.b(0);
            eVar.a(0);
            eVar.a(c.c());
            d2.a(eVar);
        } catch (Exception e4) {
            ad.b("MetricsReportUtil", e4.getMessage());
        }
    }
}
