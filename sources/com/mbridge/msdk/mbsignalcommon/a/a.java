package com.mbridge.msdk.mbsignalcommon.a;

import android.content.Context;
import android.util.Base64;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.mbridge.msdk.foundation.db.g;
import com.mbridge.msdk.foundation.db.o;
import com.mbridge.msdk.foundation.entity.n;
import com.mbridge.msdk.foundation.same.report.d.c;
import com.mbridge.msdk.foundation.tools.ad;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: c, reason: collision with root package name */
    private static final String f16577c = "a";

    /* renamed from: a, reason: collision with root package name */
    int f16578a = 0;
    int b = 1;

    /* renamed from: com.mbridge.msdk.mbsignalcommon.a.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0167a {

        /* renamed from: a, reason: collision with root package name */
        private static a f16579a = new a();
    }

    public static a a() {
        return C0167a.f16579a;
    }

    public final void a(Object obj, String str, JSONArray jSONArray, int i9) {
        String str2;
        String str3;
        String str4;
        String str5;
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
        int i10;
        try {
            if (jSONArray == null) {
                a(this.b, "called reporter failed, params empty", obj);
                return;
            }
            int length = jSONArray.length();
            if (length == 0) {
                a(this.b, "called reporter failed, params empty", obj);
                return;
            }
            int i11 = 0;
            if ("reportMessageR".equalsIgnoreCase(str)) {
                StringBuffer stringBuffer = new StringBuffer();
                while (true) {
                    i10 = length - 1;
                    if (i11 >= i10) {
                        break;
                    }
                    JSONObject optJSONObject12 = jSONArray.optJSONObject(i11);
                    if (optJSONObject12 != null) {
                        stringBuffer.append(optJSONObject12.optString("key"));
                        stringBuffer.append("=");
                        stringBuffer.append(optJSONObject12.opt(AppMeasurementSdk.ConditionalUserProperty.VALUE));
                        stringBuffer.append("&");
                    }
                    i11++;
                }
                JSONObject optJSONObject13 = jSONArray.optJSONObject(i10);
                if (optJSONObject13 != null) {
                    stringBuffer.append(optJSONObject13.optString("key"));
                    stringBuffer.append("=");
                    stringBuffer.append(optJSONObject13.opt(AppMeasurementSdk.ConditionalUserProperty.VALUE));
                }
                c.a().d(stringBuffer.toString());
            } else if ("reportMessageD".equalsIgnoreCase(str)) {
                String str6 = "";
                if (length <= 0 || (optJSONObject11 = jSONArray.optJSONObject(0)) == null) {
                    str2 = "";
                } else {
                    str2 = optJSONObject11.getString(AppMeasurementSdk.ConditionalUserProperty.VALUE);
                }
                int i12 = -1;
                int i13 = (length <= 1 || (optJSONObject10 = jSONArray.optJSONObject(1)) == null) ? -1 : optJSONObject10.getInt(AppMeasurementSdk.ConditionalUserProperty.VALUE);
                int i14 = (length <= 2 || (optJSONObject9 = jSONArray.optJSONObject(2)) == null) ? -1 : optJSONObject9.getInt(AppMeasurementSdk.ConditionalUserProperty.VALUE);
                int i15 = (length <= 3 || (optJSONObject8 = jSONArray.optJSONObject(3)) == null) ? -1 : optJSONObject8.getInt(AppMeasurementSdk.ConditionalUserProperty.VALUE);
                int i16 = (length <= 4 || (optJSONObject7 = jSONArray.optJSONObject(4)) == null) ? -1 : optJSONObject7.getInt(AppMeasurementSdk.ConditionalUserProperty.VALUE);
                if (length <= 5 || (optJSONObject6 = jSONArray.optJSONObject(5)) == null) {
                    str3 = "";
                } else {
                    str3 = optJSONObject6.getString(AppMeasurementSdk.ConditionalUserProperty.VALUE);
                }
                if (length <= 6 || (optJSONObject5 = jSONArray.optJSONObject(6)) == null) {
                    str4 = "";
                } else {
                    str4 = optJSONObject5.getString(AppMeasurementSdk.ConditionalUserProperty.VALUE);
                }
                int i17 = (length <= 7 || (optJSONObject4 = jSONArray.optJSONObject(7)) == null) ? -1 : optJSONObject4.getInt(AppMeasurementSdk.ConditionalUserProperty.VALUE);
                if (length <= 8 || (optJSONObject3 = jSONArray.optJSONObject(8)) == null) {
                    str5 = "";
                } else {
                    str5 = optJSONObject3.getString(AppMeasurementSdk.ConditionalUserProperty.VALUE);
                }
                if (length > 9 && (optJSONObject2 = jSONArray.optJSONObject(9)) != null) {
                    i12 = optJSONObject2.getInt(AppMeasurementSdk.ConditionalUserProperty.VALUE);
                }
                int i18 = i12;
                if (length > 10 && (optJSONObject = jSONArray.optJSONObject(10)) != null) {
                    str6 = optJSONObject.getString(AppMeasurementSdk.ConditionalUserProperty.VALUE);
                }
                String str7 = str6;
                try {
                    Context c9 = com.mbridge.msdk.foundation.controller.c.m().c();
                    if (c9 != null) {
                        o.a(g.a(c9)).a(new n(str2, i13, i14, i15, i16, str3, str4, i17, str5, i18, str7));
                    }
                } catch (Throwable th) {
                    ad.a(f16577c, th.getMessage());
                }
            }
            a(this.f16578a, "called reporter success", obj);
        } catch (Throwable th2) {
            ad.a(f16577c, th2.getMessage());
            a(this.b, "exception: " + th2.getMessage(), obj);
        }
    }

    private void a(int i9, String str, Object obj) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", i9);
            jSONObject.put("message", str);
            com.mbridge.msdk.mbsignalcommon.windvane.g.a().a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (JSONException e4) {
            ad.a(f16577c, e4.getMessage());
        } catch (Throwable th) {
            ad.a(f16577c, th.getMessage());
        }
    }
}
