package com.mbridge.msdk.mbbanner.common.a;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.mbbanner.common.util.BannerUtils;
import com.mbridge.msdk.mbbid.out.BidResponsed;

/* loaded from: classes3.dex */
public class d extends e {

    /* renamed from: a, reason: collision with root package name */
    private static final String f16252a = "d";

    public static com.mbridge.msdk.foundation.same.net.f.e a(boolean z8, Context context, String str, String str2, int i9, b bVar) {
        String k6 = com.mbridge.msdk.foundation.controller.c.m().k();
        String md5 = SameMD5.getMD5(com.mbridge.msdk.foundation.controller.c.m().k() + com.mbridge.msdk.foundation.controller.c.m().b());
        String a6 = ai.a(context, str);
        String a9 = com.mbridge.msdk.foundation.same.a.b.a(str, "banner");
        String closeIds = BannerUtils.getCloseIds(str);
        com.mbridge.msdk.foundation.same.net.f.e eVar = new com.mbridge.msdk.foundation.same.net.f.e();
        com.mbridge.msdk.foundation.same.net.e.b.a(eVar, MBridgeConstans.APP_ID, k6);
        com.mbridge.msdk.foundation.same.net.e.b.a(eVar, MBridgeConstans.PROPERTIES_UNIT_ID, str);
        if (!TextUtils.isEmpty(bVar.d())) {
            com.mbridge.msdk.foundation.same.net.e.b.a(eVar, MBridgeConstans.PLACEMENT_ID, bVar.d());
        }
        com.mbridge.msdk.foundation.same.net.e.b.a(eVar, "sign", md5);
        com.mbridge.msdk.foundation.same.net.e.b.a(eVar, "only_impression", "1");
        com.mbridge.msdk.foundation.same.net.e.b.a(eVar, "ping_mode", "1");
        com.mbridge.msdk.foundation.same.net.e.b.a(eVar, com.mbridge.msdk.foundation.same.net.f.e.f15854e, a6);
        com.mbridge.msdk.foundation.same.net.e.b.a(eVar, CampaignEx.JSON_KEY_AD_SOURCE_ID, "1");
        com.mbridge.msdk.foundation.same.net.e.b.a(eVar, com.mbridge.msdk.foundation.same.net.f.e.f15855f, str2);
        com.mbridge.msdk.foundation.same.net.e.b.a(eVar, "ad_type", "296");
        com.mbridge.msdk.foundation.same.net.e.b.a(eVar, "offset", i9 + "");
        com.mbridge.msdk.foundation.same.net.e.b.a(eVar, com.mbridge.msdk.foundation.same.net.f.e.f15853d, a9);
        com.mbridge.msdk.foundation.same.net.e.b.a(eVar, "close_id", closeIds);
        com.mbridge.msdk.foundation.same.net.e.b.a(eVar, com.mbridge.msdk.foundation.entity.b.JSON_KEY_UNIT_SIZE, bVar.a() + "");
        com.mbridge.msdk.foundation.same.net.e.b.a(eVar, "refresh_time", bVar.b() + "");
        if (!TextUtils.isEmpty(bVar.c())) {
            com.mbridge.msdk.foundation.same.net.e.b.a(eVar, BidResponsed.KEY_TOKEN, bVar.c() + "");
        }
        if (!TextUtils.isEmpty(bVar.e())) {
            com.mbridge.msdk.foundation.same.net.e.b.a(eVar, CampaignEx.JSON_KEY_LOCAL_REQUEST_ID, bVar.e());
        }
        return eVar;
    }
}
