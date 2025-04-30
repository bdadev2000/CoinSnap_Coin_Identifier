package com.mbridge.msdk.click.b;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.URLUtil;
import c7.C0665z;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.i;
import com.mbridge.msdk.foundation.tools.ab;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.z;
import java.io.File;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static int f14795a = 1;
    public static int b = 2;

    /* renamed from: c, reason: collision with root package name */
    public static int f14796c = 1500;

    /* renamed from: d, reason: collision with root package name */
    private static String f14797d = "2000109";

    /* renamed from: e, reason: collision with root package name */
    private static String f14798e = "DspFilterUtils";

    public static boolean a(CampaignEx campaignEx, String str, int i9) {
        boolean z8 = false;
        if (campaignEx != null && campaignEx.getTpOffer() == 1) {
            if (campaignEx.getFac() != 0) {
                z8 = true;
            }
            try {
                Context c9 = c.m().c();
                if (c9 != null) {
                    if (URLUtil.isFileUrl(str)) {
                        File file = new File(str.replace("file:////", "").replace("file:///", "").replace(C0665z.FILE_SCHEME, ""));
                        if (file.exists()) {
                            str = ab.b(file);
                        }
                    }
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("key=" + f14797d + "&");
                    stringBuffer.append("type=" + i9 + "&");
                    stringBuffer.append("html=" + str + "&");
                    stringBuffer.append("network_type=" + z.l(c9) + "&");
                    stringBuffer.append("unit_id=" + campaignEx.getCampaignUnitId() + "&");
                    String requestId = campaignEx.getRequestId();
                    if (!TextUtils.isEmpty(requestId)) {
                        stringBuffer.append("rid=");
                        stringBuffer.append(requestId);
                        stringBuffer.append("&");
                    }
                    if (campaignEx.isBidCampaign()) {
                        stringBuffer.append("hb=1&");
                    }
                    String requestIdNotice = campaignEx.getRequestIdNotice();
                    if (!TextUtils.isEmpty(requestIdNotice)) {
                        stringBuffer.append("rid_n=");
                        stringBuffer.append(requestIdNotice);
                        stringBuffer.append("&");
                    }
                    stringBuffer.append("cid=" + campaignEx.getId());
                    i.a(c9, stringBuffer.toString());
                }
            } catch (Throwable th) {
                ad.b(f14798e, th.getMessage());
            }
        }
        return z8;
    }
}
