package com.mbridge.msdk.foundation.same.report;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.z;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class j {
    public static JSONObject a(Context context, com.mbridge.msdk.c.g gVar) throws Exception {
        String str;
        JSONObject jSONObject = new JSONObject();
        if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            String l = z.l();
            if (!TextUtils.isEmpty(l)) {
                jSONObject.put("manufacturer", l);
            }
            int k6 = z.k();
            if (k6 != -1) {
                jSONObject.put("sdkint", k6);
            }
            String m = z.m(context);
            if (!TextUtils.isEmpty(m)) {
                jSONObject.put("is24H", m);
            }
            String p2 = z.p();
            if (!TextUtils.isEmpty(p2)) {
                jSONObject.put("totalram", p2);
            }
            String n2 = z.n(context);
            if (!TextUtils.isEmpty(n2)) {
                jSONObject.put("totalmemory", n2);
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
