package com.mbridge.msdk.foundation.same.net.f;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.x;
import com.mbridge.msdk.foundation.tools.z;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private static String f15861a = "";
    private static String b = "";

    public static void a(e eVar) {
    }

    public static void b(e eVar) {
    }

    public static void c(e eVar) {
    }

    public static void a(e eVar, Context context) {
    }

    public static void a(e eVar, Context context, boolean z8, com.mbridge.msdk.c.g gVar) {
        if (eVar == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                jSONObject.put("dmt", z.o() + "");
                jSONObject.put("dmf", z.f());
                jSONObject.put("adid_limit", com.mbridge.msdk.foundation.tools.e.a() + "");
                jSONObject.put("adid_limit_dev", com.mbridge.msdk.foundation.controller.authoritycontroller.b.b() ? "1" : "0");
            }
            if (gVar.as() == 1 && !TextUtils.isEmpty(com.mbridge.msdk.foundation.tools.e.d()) && com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
                jSONObject.put("az_aid_info", com.mbridge.msdk.foundation.tools.e.d());
            }
            if (TextUtils.isEmpty(jSONObject.toString())) {
                return;
            }
            if (!jSONObject.equals(b)) {
                f15861a = x.b(jSONObject.toString());
            }
            if (TextUtils.isEmpty(f15861a)) {
                return;
            }
            eVar.a("dvi", f15861a);
        } catch (Exception e4) {
            if (MBridgeConstans.DEBUG) {
                ad.b("CommonRequestParamsForAddDiff", e4.getMessage());
            }
        }
    }
}
