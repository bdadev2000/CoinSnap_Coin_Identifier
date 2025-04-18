package com.mbridge.msdk.foundation.same.report;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.n;
import com.mbridge.msdk.foundation.tools.z;

/* loaded from: classes4.dex */
public final class g {
    private static Handler a = new Handler(Looper.getMainLooper());

    public static void a(CampaignEx campaignEx, String str, String str2, String str3) {
        if (campaignEx == null || !campaignEx.isMraid()) {
            return;
        }
        n nVar = new n("m_download_end", TextUtils.isEmpty(campaignEx.getMraid()) ^ true ? 1 : 3, "0", "", campaignEx.getId(), str2, str, String.valueOf(campaignEx.getKeyIaRst()));
        nVar.e(campaignEx.getId());
        nVar.f(campaignEx.getRequestId());
        nVar.s(campaignEx.getCurrentLocalRid());
        nVar.g(campaignEx.getRequestIdNotice());
        nVar.c(campaignEx.getAdSpaceT());
        nVar.d(str3);
        nVar.e(7);
        nVar.a(z.l(com.mbridge.msdk.foundation.controller.c.m().c()));
        nVar.d(campaignEx.isMraid() ? n.a : n.f13247b);
        com.mbridge.msdk.foundation.same.report.d.c.a().a(nVar, campaignEx);
    }

    public static void b(n nVar, Context context, String str) {
        a(n.b(nVar), context, str);
    }

    public static void c(n nVar, Context context, String str) {
        a(n.c(nVar), context, str);
    }

    public static void d(n nVar, Context context, String str) {
        if (nVar != null) {
            nVar.a("2000060");
            nVar.c(str);
            nVar.a(z.l(context));
            a(n.f(nVar), context, str);
        }
    }

    public static void b(n nVar, String str, CampaignEx campaignEx) {
        if (nVar != null) {
            nVar.a("2000059");
            nVar.c(str);
            nVar.a(z.l(com.mbridge.msdk.foundation.controller.c.m().c()));
            nVar.j(com.mbridge.msdk.foundation.tools.e.c());
            a(n.g(nVar), com.mbridge.msdk.foundation.controller.c.m().c(), str);
        }
    }

    public static void a(n nVar, String str, CampaignEx campaignEx) {
        int adType;
        if (nVar != null) {
            nVar.j(com.mbridge.msdk.foundation.tools.e.c());
            if (campaignEx != null && ((adType = campaignEx.getAdType()) == 94 || adType == 287)) {
                com.mbridge.msdk.foundation.same.report.d.c.a().a(nVar, campaignEx);
            } else {
                a(n.e(nVar), com.mbridge.msdk.foundation.controller.c.m().c(), str);
            }
        }
    }

    public static void a(String str, Context context, String str2) {
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        a(new com.mbridge.msdk.foundation.same.f.a(str, str2));
    }

    private static void a(Runnable runnable) {
        Handler handler = a;
        if (handler != null) {
            handler.post(runnable);
        }
    }

    public static void a(n nVar, Context context, String str) {
        if (nVar != null) {
            nVar.a("2000063");
            nVar.c(str);
            nVar.a(z.l(context));
            a(n.d(nVar), context, str);
        }
    }
}
