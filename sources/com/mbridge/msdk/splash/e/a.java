package com.mbridge.msdk.splash.e;

import android.content.Context;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.n;
import com.mbridge.msdk.foundation.same.report.g;
import com.mbridge.msdk.foundation.tools.z;

/* loaded from: classes4.dex */
public final class a {
    public static void a(Context context, CampaignEx campaignEx, String str, String str2, long j3, int i10) {
        if (campaignEx != null) {
            try {
                if (campaignEx.isMraid()) {
                    n nVar = new n();
                    nVar.f(campaignEx.getRequestId());
                    nVar.g(campaignEx.getRequestIdNotice());
                    nVar.e(campaignEx.getId());
                    nVar.b(i10);
                    nVar.l(String.valueOf(System.currentTimeMillis() - j3));
                    nVar.n("");
                    nVar.h(str2);
                    nVar.d("6");
                    nVar.d(n.a);
                    g.b(nVar, str, campaignEx);
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public static void a(String str, CampaignEx campaignEx) {
        if (campaignEx == null || !campaignEx.isMraid()) {
            return;
        }
        n nVar = new n("2000061", campaignEx.getId(), campaignEx.getRequestId(), campaignEx.getRequestIdNotice(), str, z.l(c.m().c()));
        nVar.d(n.a);
        g.b(nVar, c.m().c(), str);
    }

    public static void a(CampaignEx campaignEx, String str, String str2) {
        a(campaignEx, str, 2, str2);
    }

    public static void a(CampaignEx campaignEx, String str) {
        a(campaignEx, "", 1, str);
    }

    private static void a(CampaignEx campaignEx, String str, int i10, String str2) {
        a(com.mbridge.msdk.splash.a.c.a().c(campaignEx.getId()).b(str2).d(campaignEx.getRequestId()).g(campaignEx.getRequestIdNotice()).f(str).b(i10).a(campaignEx.isBidCampaign()), str2);
    }

    private static void a(com.mbridge.msdk.splash.a.c cVar, String str) {
        if (cVar != null) {
            cVar.a("2000068");
            g.a(cVar.b(), c.m().c(), str);
        }
    }

    public static void a(com.mbridge.msdk.splash.a.c cVar, String str, int i10) {
        if (cVar != null) {
            cVar.a("2000069");
            cVar.a(i10);
            g.a(cVar.b(), c.m().c(), str);
        }
    }

    public static void a(Context context, CampaignEx campaignEx) {
        if (campaignEx == null || campaignEx.getNativeVideoTracking() == null || campaignEx.getNativeVideoTracking().l() == null) {
            return;
        }
        com.mbridge.msdk.click.a.a(context, campaignEx, campaignEx.getCampaignUnitId(), campaignEx.getNativeVideoTracking().l(), false, false);
    }
}
