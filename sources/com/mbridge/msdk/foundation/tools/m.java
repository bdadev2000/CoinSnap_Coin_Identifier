package com.mbridge.msdk.foundation.tools;

import android.content.Context;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* loaded from: classes3.dex */
public class m extends d {
    public static void a(Context context, CampaignEx campaignEx) {
        if (context == null) {
            return;
        }
        com.mbridge.msdk.foundation.db.j a6 = com.mbridge.msdk.foundation.db.j.a(com.mbridge.msdk.foundation.db.g.a(context));
        if (campaignEx != null && a6 != null && !a6.b(campaignEx.getId())) {
            com.mbridge.msdk.foundation.entity.g gVar = new com.mbridge.msdk.foundation.entity.g();
            gVar.a(campaignEx.getId());
            gVar.b(campaignEx.getFca());
            gVar.c(campaignEx.getFcb());
            gVar.a(0);
            gVar.d(0);
            gVar.a(System.currentTimeMillis());
            a6.a(gVar);
        }
    }
}
