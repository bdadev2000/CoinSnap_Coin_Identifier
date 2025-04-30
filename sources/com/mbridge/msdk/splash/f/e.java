package com.mbridge.msdk.splash.f;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.out.MBridgeIds;

/* loaded from: classes3.dex */
public final class e extends a {
    public static com.mbridge.msdk.foundation.same.net.f.e a(Context context, MBridgeIds mBridgeIds, f fVar) {
        String k6 = com.mbridge.msdk.foundation.controller.c.m().k();
        String md5 = SameMD5.getMD5(com.mbridge.msdk.foundation.controller.c.m().k() + com.mbridge.msdk.foundation.controller.c.m().b());
        com.mbridge.msdk.foundation.same.net.f.e eVar = new com.mbridge.msdk.foundation.same.net.f.e();
        String a6 = com.mbridge.msdk.foundation.same.a.b.a(mBridgeIds.getUnitId(), "splash");
        String a9 = ai.a(context, mBridgeIds.getUnitId());
        com.mbridge.msdk.foundation.same.net.e.b.a(eVar, MBridgeConstans.APP_ID, k6);
        com.mbridge.msdk.foundation.same.net.e.b.a(eVar, MBridgeConstans.PROPERTIES_UNIT_ID, mBridgeIds.getUnitId());
        if (!TextUtils.isEmpty(mBridgeIds.getPlacementId())) {
            com.mbridge.msdk.foundation.same.net.e.b.a(eVar, MBridgeConstans.PLACEMENT_ID, mBridgeIds.getPlacementId());
        }
        com.mbridge.msdk.foundation.same.net.e.b.a(eVar, "sign", md5);
        com.mbridge.msdk.foundation.same.net.e.b.a(eVar, "req_type", fVar.a() + "");
        com.mbridge.msdk.foundation.same.net.e.b.a(eVar, "ad_num", "1");
        com.mbridge.msdk.foundation.same.net.e.b.a(eVar, "tnum", "1");
        com.mbridge.msdk.foundation.same.net.e.b.a(eVar, "only_impression", "1");
        com.mbridge.msdk.foundation.same.net.e.b.a(eVar, "ping_mode", "1");
        com.mbridge.msdk.foundation.same.net.e.b.a(eVar, com.mbridge.msdk.foundation.same.net.f.e.f15853d, a6);
        com.mbridge.msdk.foundation.same.net.e.b.a(eVar, com.mbridge.msdk.foundation.same.net.f.e.f15854e, a9);
        com.mbridge.msdk.foundation.same.net.e.b.a(eVar, com.mbridge.msdk.foundation.same.net.f.e.f15855f, fVar.b());
        com.mbridge.msdk.foundation.same.net.e.b.a(eVar, "ad_type", "297");
        com.mbridge.msdk.foundation.same.net.e.b.a(eVar, "offset", fVar.c() + "");
        com.mbridge.msdk.foundation.same.net.e.b.a(eVar, com.mbridge.msdk.foundation.entity.b.JSON_KEY_UNIT_SIZE, fVar.d() + "x" + fVar.e());
        return eVar;
    }
}
