package com.apm.insight.l;

import android.text.TextUtils;
import com.apm.insight.CrashType;
import com.apm.insight.entity.Header;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class r {
    public static void a(com.apm.insight.entity.a aVar, Header header, CrashType crashType) {
        if (aVar != null) {
            a(aVar.h(), header, crashType);
        }
    }

    public static void a(JSONObject jSONObject, Header header, CrashType crashType) {
        if (jSONObject == null || crashType == null) {
            return;
        }
        long optLong = jSONObject.optLong("crash_time");
        String a = com.apm.insight.i.c().a();
        if (optLong <= 0 || TextUtils.isEmpty(crashType.getName())) {
            return;
        }
        try {
            String str = "android__" + a + "_" + optLong + "_" + crashType;
            if (header == null || (jSONObject = header.f()) != null) {
                jSONObject.put("unique_key", str);
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }
}
