package com.mbridge.msdk.mbnative.e;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.d.c;
import com.mbridge.msdk.foundation.tools.z;

/* loaded from: classes3.dex */
public final class a {
    public static void a(Context context, String str, String str2, boolean z8, CampaignEx campaignEx) {
        if (context != null) {
            try {
                if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                    return;
                }
                StringBuffer stringBuffer = new StringBuffer("key=2000047&");
                stringBuffer.append("network_type=" + z.l(context) + "&");
                stringBuffer.append("unit_id=" + str2 + "&");
                stringBuffer.append("st=" + System.currentTimeMillis() + "&");
                if (campaignEx != null) {
                    stringBuffer.append("cid=" + campaignEx.getId() + "&");
                    stringBuffer.append("adtp=" + campaignEx.getAdType() + "&");
                    stringBuffer.append("rid=" + campaignEx.getRequestId());
                    stringBuffer.append("&");
                    stringBuffer.append("rid_n=" + campaignEx.getRequestIdNotice() + "&");
                }
                if (!TextUtils.isEmpty(str2)) {
                    String str3 = com.mbridge.msdk.foundation.controller.a.b.get(str2);
                    StringBuilder sb = new StringBuilder("u_stid=");
                    if (str3 == null) {
                        str3 = "";
                    }
                    sb.append(str3);
                    sb.append("&");
                    stringBuffer.append(sb.toString());
                }
                if (!TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.f15673U)) {
                    stringBuffer.append("b=" + com.mbridge.msdk.foundation.same.a.f15673U + "&");
                }
                if (!TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.f15681g)) {
                    stringBuffer.append("c=" + com.mbridge.msdk.foundation.same.a.f15681g + "&");
                }
                if (z8) {
                    stringBuffer.append("hb=1&");
                }
                stringBuffer.append("reason=" + str);
                c.a().d(stringBuffer.toString());
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public static void a(String str, com.mbridge.msdk.foundation.same.report.d.b bVar, CampaignEx campaignEx, Context context, com.mbridge.msdk.foundation.same.report.d.a.a aVar) {
        try {
            c.a().a(str, bVar, campaignEx, context, aVar);
        } catch (Exception e4) {
            if (MBridgeConstans.DEBUG) {
                e4.printStackTrace();
            }
        }
    }
}
