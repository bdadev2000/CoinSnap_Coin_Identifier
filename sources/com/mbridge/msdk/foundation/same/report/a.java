package com.mbridge.msdk.foundation.same.report;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.same.DomainNameUtils;
import com.mbridge.msdk.foundation.same.net.Aa;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.foundation.tools.x;
import com.vungle.ads.internal.presenter.q;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class a {
    public static JSONObject a() {
        JSONObject jSONObject;
        Context c9 = com.mbridge.msdk.foundation.controller.c.m().c();
        try {
            jSONObject = i.a(c9).c();
        } catch (Exception e4) {
            ad.b("CommonDeviceInfo", "getCommonProperty error", e4);
            jSONObject = null;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            if (TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.f15673U)) {
                com.mbridge.msdk.foundation.same.a.f15673U = com.mbridge.msdk.foundation.a.a.a.a().a(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B);
            }
            if (!TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.f15673U)) {
                jSONObject.put(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, com.mbridge.msdk.foundation.same.a.f15673U);
            }
            if (TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.f15681g)) {
                com.mbridge.msdk.foundation.same.a.f15681g = com.mbridge.msdk.foundation.a.a.a.a().a(com.mbridge.msdk.foundation.controller.a.f15376a);
            }
            if (!TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.f15681g)) {
                jSONObject.put(com.mbridge.msdk.foundation.controller.a.f15376a, com.mbridge.msdk.foundation.same.a.f15681g);
            }
            jSONObject.put(q.OPEN, com.mbridge.msdk.foundation.same.a.f15670R);
            String a6 = Aa.a();
            if (a6 == null) {
                a6 = "";
            }
            jSONObject.put("channel", a6);
            jSONObject.put("band_width", com.mbridge.msdk.foundation.same.net.a.a().b());
            if (!com.mbridge.msdk.foundation.controller.authoritycontroller.b.a()) {
                jSONObject.put("dev_source", MBridgeConstans.API_REUQEST_CATEGORY_APP);
            }
            if (DomainNameUtils.getInstance().isExcludeCNDomain()) {
                jSONObject.put("re_domain", "1");
            }
            com.mbridge.msdk.c.g b = com.mbridge.msdk.c.h.a().b(com.mbridge.msdk.foundation.controller.c.m().k());
            if (b == null) {
                com.mbridge.msdk.c.h.a();
                b = com.mbridge.msdk.c.i.a();
            }
            JSONObject a9 = a(b);
            if (a9 != null) {
                String jSONObject2 = a9.toString();
                if (!TextUtils.isEmpty(jSONObject2)) {
                    String b8 = x.b(jSONObject2);
                    if (!TextUtils.isEmpty(b8)) {
                        jSONObject.put("dvi", b8);
                    }
                }
            }
            jSONObject.put(MBridgeConstans.APP_ID, com.mbridge.msdk.foundation.controller.c.m().k());
            jSONObject.put("m_sdk", "msdk");
            jSONObject.put("lqswt", String.valueOf(1));
            jSONObject.put("network_available", String.valueOf(ai.l(c9)));
            String str = "UNKNOWN";
            if (b != null) {
                str = b.o();
                jSONObject.put("a_stid", b.a());
            }
            jSONObject.put("country_code", str);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    private static JSONObject a(com.mbridge.msdk.c.g gVar) {
        try {
            return i.a(com.mbridge.msdk.foundation.controller.c.m().c(), gVar);
        } catch (Exception unused) {
            return null;
        }
    }
}
