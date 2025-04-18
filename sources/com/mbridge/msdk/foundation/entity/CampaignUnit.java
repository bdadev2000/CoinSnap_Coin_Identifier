package com.mbridge.msdk.foundation.entity;

import android.content.Context;
import android.os.Build;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.z;
import com.mbridge.msdk.out.MBConfiguration;
import com.mbridge.msdk.system.NoProGuard;
import java.io.Serializable;

/* loaded from: classes4.dex */
public class CampaignUnit extends b implements NoProGuard, Serializable {
    private static final String TAG = "CampaignUnit";

    @Override // com.mbridge.msdk.foundation.entity.b
    public String assembCParams() {
        String str;
        String str2;
        StringBuffer stringBuffer = this.cParams;
        if (stringBuffer != null && stringBuffer.length() > 0) {
            return this.cParams.toString();
        }
        try {
            String c10 = com.mbridge.msdk.foundation.tools.e.c();
            Context c11 = com.mbridge.msdk.foundation.controller.c.m().c();
            String k10 = z.k(c11);
            String j3 = z.j(c11);
            if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                str = "";
                str2 = str;
            } else {
                str2 = String.valueOf(z.l(c11));
                str = z.i(c11) + "x" + z.g(c11);
            }
            StringBuffer stringBuffer2 = this.cParams;
            stringBuffer2.append(getAdType());
            stringBuffer2.append("|");
            stringBuffer2.append(nullToEmpty("1"));
            stringBuffer2.append("|");
            stringBuffer2.append(nullToEmpty(Build.VERSION.RELEASE));
            stringBuffer2.append("|");
            stringBuffer2.append(nullToEmpty(MBConfiguration.SDK_VERSION));
            stringBuffer2.append("|");
            stringBuffer2.append(nullToEmpty(z.h()));
            stringBuffer2.append("|");
            stringBuffer2.append(nullToEmpty(str));
            stringBuffer2.append("|");
            stringBuffer2.append(nullToEmpty(Integer.valueOf(z.r(com.mbridge.msdk.foundation.controller.c.m().c()))));
            stringBuffer2.append("|");
            stringBuffer2.append(nullToEmpty(z.s(com.mbridge.msdk.foundation.controller.c.m().c())));
            stringBuffer2.append("|");
            stringBuffer2.append(nullToEmpty(str2));
            stringBuffer2.append("|");
            stringBuffer2.append(nullToEmpty(j3));
            stringBuffer2.append(nullToEmpty(k10));
            stringBuffer2.append("|");
            stringBuffer2.append("|");
            stringBuffer2.append("|");
            stringBuffer2.append("|");
            stringBuffer2.append(nullToEmpty(c10));
            stringBuffer2.append("|");
            stringBuffer2.append(nullToEmpty(""));
            stringBuffer2.append("|");
            stringBuffer2.append(nullToEmpty(z.x()));
            stringBuffer2.append("|");
            stringBuffer2.append(nullToEmpty(""));
            stringBuffer2.append("|");
            stringBuffer2.append("");
            stringBuffer2.append("|");
            stringBuffer2.append(nullToEmpty(""));
            stringBuffer2.append("|");
            stringBuffer2.append(nullToEmpty(com.mbridge.msdk.foundation.same.a.U + "," + com.mbridge.msdk.foundation.same.a.f13276g));
            stringBuffer2.append("|");
            stringBuffer2.append(z.i());
            stringBuffer2.append("|");
            this.cParams = stringBuffer2;
        } catch (Throwable th2) {
            if (MBridgeConstans.DEBUG) {
                ad.b(TAG, th2.getMessage(), th2);
            }
        }
        return this.cParams.toString();
    }
}
