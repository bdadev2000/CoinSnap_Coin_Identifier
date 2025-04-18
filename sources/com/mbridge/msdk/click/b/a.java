package com.mbridge.msdk.click.b;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.URLUtil;
import bh.z;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.i;
import com.mbridge.msdk.foundation.tools.ab;
import com.mbridge.msdk.foundation.tools.ad;
import java.io.File;

/* loaded from: classes4.dex */
public final class a {
    public static int a = 1;

    /* renamed from: b, reason: collision with root package name */
    public static int f12505b = 2;

    /* renamed from: c, reason: collision with root package name */
    public static int f12506c = 1500;

    /* renamed from: d, reason: collision with root package name */
    private static String f12507d = "2000109";

    /* renamed from: e, reason: collision with root package name */
    private static String f12508e = "DspFilterUtils";

    public static boolean a(CampaignEx campaignEx, String str, int i10) {
        boolean z10 = false;
        if (campaignEx != null && campaignEx.getTpOffer() == 1) {
            if (campaignEx.getFac() != 0) {
                z10 = true;
            }
            try {
                Context c10 = c.m().c();
                if (c10 != null) {
                    if (URLUtil.isFileUrl(str)) {
                        File file = new File(str.replace("file:////", "").replace("file:///", "").replace(z.FILE_SCHEME, ""));
                        if (file.exists()) {
                            str = ab.b(file);
                        }
                    }
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("key=" + f12507d + "&");
                    stringBuffer.append("type=" + i10 + "&");
                    stringBuffer.append("html=" + str + "&");
                    stringBuffer.append("network_type=" + com.mbridge.msdk.foundation.tools.z.l(c10) + "&");
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
                    i.a(c10, stringBuffer.toString());
                }
            } catch (Throwable th2) {
                ad.b(f12508e, th2.getMessage());
            }
        }
        return z10;
    }
}
