package com.mbridge.msdk.foundation.same.report;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.z;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class j {
    public static JSONObject a(Context context, com.mbridge.msdk.c.g gVar) throws Exception {
        String str;
        JSONObject jSONObject = new JSONObject();
        if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            String l10 = z.l();
            if (!TextUtils.isEmpty(l10)) {
                jSONObject.put("manufacturer", l10);
            }
            int k10 = z.k();
            if (k10 != -1) {
                jSONObject.put("sdkint", k10);
            }
            String m10 = z.m(context);
            if (!TextUtils.isEmpty(m10)) {
                jSONObject.put("is24H", m10);
            }
            String p10 = z.p();
            if (!TextUtils.isEmpty(p10)) {
                jSONObject.put("totalram", p10);
            }
            String n10 = z.n(context);
            if (!TextUtils.isEmpty(n10)) {
                jSONObject.put("totalmemory", n10);
            }
            jSONObject.put("adid_limit", com.mbridge.msdk.foundation.tools.e.a() + "");
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.b.b()) {
                str = "1";
            } else {
                str = "0";
            }
            jSONObject.put("adid_limit_dev", str);
        }
        if (gVar.as() == 1 && !TextUtils.isEmpty(com.mbridge.msdk.foundation.tools.e.d()) && com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
            jSONObject.put("az_aid_info", com.mbridge.msdk.foundation.tools.e.d());
        }
        return jSONObject;
    }
}
