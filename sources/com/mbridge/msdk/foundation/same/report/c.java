package com.mbridge.msdk.foundation.same.report;

import android.content.Context;
import android.text.TextUtils;
import com.applovin.impl.L;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.z;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private static final String f15886a = "c";

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
                JSONObject d2 = eVar.d();
                if (d2 == null) {
                    d2 = new JSONObject();
                }
                try {
                    d2.put("key", eVar.a());
                    Context c9 = com.mbridge.msdk.foundation.controller.c.m().c();
                    int l = z.l(c9);
                    if (!d2.has("network_type")) {
                        d2.put("network_type", l);
                        d2.put("network_str", z.a(c9, l));
                    }
                    if (!d2.has("st")) {
                        d2.put("st", System.currentTimeMillis());
                    }
                    String optString = d2.optString(MBridgeConstans.PROPERTIES_UNIT_ID, "");
                    if (!TextUtils.isEmpty(optString)) {
                        String str2 = com.mbridge.msdk.foundation.controller.a.b.get(optString);
                        if (str2 != null) {
                            str = str2;
                        }
                        d2.put("u_stid", str);
                    }
                    if (!TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.f15673U) && !d2.has(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B)) {
                        d2.put(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, com.mbridge.msdk.foundation.same.a.f15673U);
                    }
                    if (!TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.f15681g) && !d2.has("c")) {
                        d2.put("c", com.mbridge.msdk.foundation.same.a.f15681g);
                    }
                } catch (Exception e4) {
                    ad.b(c.f15886a, e4.getMessage());
                }
                return d2;
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
            jSONObject.remove(com.mbridge.msdk.foundation.same.net.f.e.f15851a);
            jSONObject.remove(com.mbridge.msdk.foundation.same.net.f.e.b);
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
        String a6 = eVar.a();
        if (TextUtils.isEmpty(a6)) {
            return false;
        }
        com.mbridge.msdk.c.g f9 = L.f(com.mbridge.msdk.c.h.a());
        if (f9 == null) {
            return true;
        }
        return b.a(f9, a6);
    }
}
