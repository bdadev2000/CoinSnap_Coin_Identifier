package com.mbridge.msdk.newreward.function.g;

import android.content.Context;
import android.os.Build;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.DomainNameUtils;
import com.mbridge.msdk.foundation.same.net.Aa;
import com.mbridge.msdk.foundation.same.net.f.e;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.z;
import com.mbridge.msdk.out.MBConfiguration;
import com.vungle.ads.internal.presenter.q;
import java.util.Map;

/* loaded from: classes4.dex */
public abstract class a {
    private static Map<String, String> a;

    public final Map<String, String> a() {
        if (a == null) {
            e eVar = new e();
            eVar.a("platform", "1");
            eVar.a("os_version", Build.VERSION.RELEASE);
            Context c10 = com.mbridge.msdk.foundation.controller.c.m().c();
            eVar.a(CampaignEx.JSON_KEY_PACKAGE_NAME, z.e(c10));
            eVar.a("app_version_name", z.p(c10));
            eVar.a("app_version_code", z.q(c10) + "");
            eVar.a("orientation", z.r(c10) + "");
            eVar.a("model", z.h());
            eVar.a("brand", z.x());
            eVar.a("gaid2", com.mbridge.msdk.foundation.tools.e.b());
            eVar.a("gaid", "");
            int l10 = z.l(c10);
            eVar.a("network_type", l10 + "");
            eVar.a("network_str", z.a(c10, l10));
            eVar.a("language", z.s(c10));
            eVar.a("timezone", z.y());
            eVar.a("useragent", z.g());
            eVar.a("sdk_version", MBConfiguration.SDK_VERSION);
            eVar.a("screen_size", z.i(c10) + "x" + z.g(c10));
            com.mbridge.msdk.foundation.same.net.e.b.a(eVar, MBridgeConstans.APP_ID, com.mbridge.msdk.foundation.controller.c.m().k());
            String a10 = Aa.a();
            if (a10 == null) {
                a10 = "";
            }
            eVar.a("channel", a10);
            eVar.a("band_width", com.mbridge.msdk.foundation.same.net.a.a().b() + "");
            eVar.a(q.OPEN, com.mbridge.msdk.foundation.same.a.R);
            if (!com.mbridge.msdk.foundation.controller.authoritycontroller.b.a()) {
                eVar.a("dev_source", MBridgeConstans.API_REUQEST_CATEGORY_APP);
            }
            if (DomainNameUtils.getInstance().isExcludeCNDomain()) {
                eVar.a("re_domain", "1");
            }
            long currentTimeMillis = System.currentTimeMillis();
            String l11 = com.mbridge.msdk.foundation.controller.c.m().l();
            com.mbridge.msdk.foundation.same.net.e.b.a(eVar, "sign", l11);
            eVar.a(CampaignEx.JSON_KEY_ST_TS, currentTimeMillis + "");
            if (com.mbridge.msdk.e.b.a()) {
                eVar.a("st", SameMD5.getMD5(l11 + currentTimeMillis));
            } else {
                eVar.a("st", SameMD5.getMD5(currentTimeMillis + l11));
            }
            a = eVar.a();
        }
        return a;
    }
}
