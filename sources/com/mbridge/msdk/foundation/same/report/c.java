package com.mbridge.msdk.foundation.same.report;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.z;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class c {
    private static final String a = "c";

    public static JSONObject a() {
        return a.a();
    }

    public static com.mbridge.msdk.tracker.f b() {
        return new com.mbridge.msdk.tracker.f() { // from class: com.mbridge.msdk.foundation.same.report.c.1
            @Override // com.mbridge.msdk.tracker.f
            public final boolean a(com.mbridge.msdk.tracker.e eVar) throws Exception {
                return c.a(eVar);
            }
        };
    }

    public static com.mbridge.msdk.tracker.h c() {
        return new com.mbridge.msdk.tracker.h() { // from class: com.mbridge.msdk.foundation.same.report.c.2
            @Override // com.mbridge.msdk.tracker.h
            public final JSONObject a(com.mbridge.msdk.tracker.e eVar) {
                String str = "";
                if (eVar == null) {
                    return null;
                }
                JSONObject d10 = eVar.d();
                if (d10 == null) {
                    d10 = new JSONObject();
                }
                try {
                    d10.put("key", eVar.a());
                    Context c10 = com.mbridge.msdk.foundation.controller.c.m().c();
                    int l10 = z.l(c10);
                    if (!d10.has("network_type")) {
                        d10.put("network_type", l10);
                        d10.put("network_str", z.a(c10, l10));
                    }
                    if (!d10.has("st")) {
                        d10.put("st", System.currentTimeMillis());
                    }
                    String optString = d10.optString(MBridgeConstans.PROPERTIES_UNIT_ID, "");
                    if (!TextUtils.isEmpty(optString)) {
                        String str2 = com.mbridge.msdk.foundation.controller.a.f13020b.get(optString);
                        if (str2 != null) {
                            str = str2;
                        }
                        d10.put("u_stid", str);
                    }
                    if (!TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.U) && !d10.has(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B)) {
                        d10.put(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, com.mbridge.msdk.foundation.same.a.U);
                    }
                    if (!TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.f13276g) && !d10.has("c")) {
                        d10.put("c", com.mbridge.msdk.foundation.same.a.f13276g);
                    }
                } catch (Exception e2) {
                    ad.b(c.a, e2.getMessage());
                }
                return d10;
            }
        };
    }

    public static void a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            jSONObject.remove("model");
            jSONObject.remove("brand");
            jSONObject.remove("screen_size");
            jSONObject.remove("sub_ip");
            jSONObject.remove("network_type");
            jSONObject.remove("useragent");
            jSONObject.remove("ua");
            jSONObject.remove("language");
            jSONObject.remove("network_str");
            jSONObject.remove("mnc");
            jSONObject.remove("mcc");
            jSONObject.remove("os_version");
            jSONObject.remove("gp_version");
            jSONObject.remove("country_code");
        }
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_OTHER)) {
            jSONObject.remove(com.mbridge.msdk.foundation.same.net.f.e.a);
            jSONObject.remove(com.mbridge.msdk.foundation.same.net.f.e.f13416b);
            jSONObject.remove("power_rate");
            jSONObject.remove("charging");
            jSONObject.remove("timezone");
        }
        if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
            return;
        }
        jSONObject.remove("gaid");
        jSONObject.remove("gaid2");
        jSONObject.remove("oaid");
        jSONObject.remove("az_aid_info");
    }

    public static /* synthetic */ boolean a(com.mbridge.msdk.tracker.e eVar) {
        if (eVar == null || TextUtils.isEmpty(eVar.a())) {
            return false;
        }
        String a10 = eVar.a();
        if (TextUtils.isEmpty(a10)) {
            return false;
        }
        com.mbridge.msdk.c.g d10 = com.applovin.impl.mediation.ads.e.d(com.mbridge.msdk.c.h.a());
        if (d10 == null) {
            return true;
        }
        return b.a(d10, a10);
    }
}
