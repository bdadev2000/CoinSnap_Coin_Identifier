package com.mbridge.msdk.mbsignalcommon.a;

import android.content.Context;
import android.util.Base64;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.mbridge.msdk.foundation.db.g;
import com.mbridge.msdk.foundation.db.o;
import com.mbridge.msdk.foundation.entity.n;
import com.mbridge.msdk.foundation.same.report.d.c;
import com.mbridge.msdk.foundation.tools.ad;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class a {

    /* renamed from: c, reason: collision with root package name */
    private static final String f14071c = "a";
    int a = 0;

    /* renamed from: b, reason: collision with root package name */
    int f14072b = 1;

    /* renamed from: com.mbridge.msdk.mbsignalcommon.a.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0179a {
        private static a a = new a();
    }

    public static a a() {
        return C0179a.a;
    }

    public final void a(Object obj, String str, JSONArray jSONArray, int i10) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        JSONObject optJSONObject3;
        JSONObject optJSONObject4;
        JSONObject optJSONObject5;
        JSONObject optJSONObject6;
        JSONObject optJSONObject7;
        JSONObject optJSONObject8;
        JSONObject optJSONObject9;
        JSONObject optJSONObject10;
        JSONObject optJSONObject11;
        int i11;
        try {
            if (jSONArray == null) {
                a(this.f14072b, "called reporter failed, params empty", obj);
                return;
            }
            int length = jSONArray.length();
            if (length == 0) {
                a(this.f14072b, "called reporter failed, params empty", obj);
                return;
            }
            int i12 = 0;
            if ("reportMessageR".equalsIgnoreCase(str)) {
                StringBuffer stringBuffer = new StringBuffer();
                while (true) {
                    i11 = length - 1;
                    if (i12 >= i11) {
                        break;
                    }
                    JSONObject optJSONObject12 = jSONArray.optJSONObject(i12);
                    if (optJSONObject12 != null) {
                        stringBuffer.append(optJSONObject12.optString("key"));
                        stringBuffer.append("=");
                        stringBuffer.append(optJSONObject12.opt(AppMeasurementSdk.ConditionalUserProperty.VALUE));
                        stringBuffer.append("&");
                    }
                    i12++;
                }
                JSONObject optJSONObject13 = jSONArray.optJSONObject(i11);
                if (optJSONObject13 != null) {
                    stringBuffer.append(optJSONObject13.optString("key"));
                    stringBuffer.append("=");
                    stringBuffer.append(optJSONObject13.opt(AppMeasurementSdk.ConditionalUserProperty.VALUE));
                }
                c.a().d(stringBuffer.toString());
            } else if ("reportMessageD".equalsIgnoreCase(str)) {
                String str2 = "";
                String string = (length <= 0 || (optJSONObject11 = jSONArray.optJSONObject(0)) == null) ? "" : optJSONObject11.getString(AppMeasurementSdk.ConditionalUserProperty.VALUE);
                int i13 = -1;
                int i14 = (length <= 1 || (optJSONObject10 = jSONArray.optJSONObject(1)) == null) ? -1 : optJSONObject10.getInt(AppMeasurementSdk.ConditionalUserProperty.VALUE);
                int i15 = (length <= 2 || (optJSONObject9 = jSONArray.optJSONObject(2)) == null) ? -1 : optJSONObject9.getInt(AppMeasurementSdk.ConditionalUserProperty.VALUE);
                int i16 = (length <= 3 || (optJSONObject8 = jSONArray.optJSONObject(3)) == null) ? -1 : optJSONObject8.getInt(AppMeasurementSdk.ConditionalUserProperty.VALUE);
                int i17 = (length <= 4 || (optJSONObject7 = jSONArray.optJSONObject(4)) == null) ? -1 : optJSONObject7.getInt(AppMeasurementSdk.ConditionalUserProperty.VALUE);
                String string2 = (length <= 5 || (optJSONObject6 = jSONArray.optJSONObject(5)) == null) ? "" : optJSONObject6.getString(AppMeasurementSdk.ConditionalUserProperty.VALUE);
                String string3 = (length <= 6 || (optJSONObject5 = jSONArray.optJSONObject(6)) == null) ? "" : optJSONObject5.getString(AppMeasurementSdk.ConditionalUserProperty.VALUE);
                int i18 = (length <= 7 || (optJSONObject4 = jSONArray.optJSONObject(7)) == null) ? -1 : optJSONObject4.getInt(AppMeasurementSdk.ConditionalUserProperty.VALUE);
                String string4 = (length <= 8 || (optJSONObject3 = jSONArray.optJSONObject(8)) == null) ? "" : optJSONObject3.getString(AppMeasurementSdk.ConditionalUserProperty.VALUE);
                if (length > 9 && (optJSONObject2 = jSONArray.optJSONObject(9)) != null) {
                    i13 = optJSONObject2.getInt(AppMeasurementSdk.ConditionalUserProperty.VALUE);
                }
                int i19 = i13;
                if (length > 10 && (optJSONObject = jSONArray.optJSONObject(10)) != null) {
                    str2 = optJSONObject.getString(AppMeasurementSdk.ConditionalUserProperty.VALUE);
                }
                String str3 = str2;
                try {
                    Context c10 = com.mbridge.msdk.foundation.controller.c.m().c();
                    if (c10 != null) {
                        o.a(g.a(c10)).a(new n(string, i14, i15, i16, i17, string2, string3, i18, string4, i19, str3));
                    }
                } catch (Throwable th2) {
                    ad.a(f14071c, th2.getMessage());
                }
            }
            a(this.a, "called reporter success", obj);
        } catch (Throwable th3) {
            ad.a(f14071c, th3.getMessage());
            a(this.f14072b, "exception: " + th3.getMessage(), obj);
        }
    }

    private void a(int i10, String str, Object obj) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", i10);
            jSONObject.put(PglCryptUtils.KEY_MESSAGE, str);
            com.mbridge.msdk.mbsignalcommon.windvane.g.a().a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (JSONException e2) {
            ad.a(f14071c, e2.getMessage());
        } catch (Throwable th2) {
            ad.a(f14071c, th2.getMessage());
        }
    }
}
