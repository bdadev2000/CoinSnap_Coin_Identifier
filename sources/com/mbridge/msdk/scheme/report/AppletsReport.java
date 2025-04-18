package com.mbridge.msdk.scheme.report;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.same.a;
import com.mbridge.msdk.foundation.same.report.d.c;
import com.mbridge.msdk.foundation.tools.z;

/* loaded from: classes4.dex */
public class AppletsReport {
    public static final String APPLETS_API_VALUE = "2000118";
    private static final String TAG = "com.mbridge.msdk.scheme.report.AppletsReport";

    public static void reportAppletsLoadState(Context context, String str, String str2, String str3) {
        if (context != null) {
            try {
                if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                    StringBuffer stringBuffer = new StringBuffer("key=2000118&");
                    stringBuffer.append("network_type=" + z.l(context) + "&");
                    stringBuffer.append("unit_id=" + str2 + "&");
                    if (!TextUtils.isEmpty(a.U)) {
                        stringBuffer.append("b=" + a.U + "&");
                    }
                    if (!TextUtils.isEmpty(a.f13276g)) {
                        stringBuffer.append("c=" + a.f13276g + "&");
                    }
                    stringBuffer.append("hb=0&");
                    if (!TextUtils.isEmpty(str3)) {
                        stringBuffer.append("rid_n=");
                        stringBuffer.append(str3);
                        stringBuffer.append("&");
                    }
                    stringBuffer.append("reason=" + str);
                    reportLoadData(context, stringBuffer.toString());
                }
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
    }

    private static void reportLoadData(Context context, String str) {
        if (context != null && !TextUtils.isEmpty(str)) {
            c.a().d(str);
        }
    }
}
