package com.mbridge.msdk.foundation.same.net.f;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ag;
import com.mbridge.msdk.foundation.tools.z;

/* loaded from: classes4.dex */
public final class f {
    public static void a(e eVar) {
        eVar.a("api_version", com.mbridge.msdk.foundation.same.a.f13273d);
    }

    public static void b(e eVar) {
        try {
            if (TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.U)) {
                com.mbridge.msdk.foundation.same.a.U = com.mbridge.msdk.foundation.a.a.a.a().a(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B);
            }
            if (!TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.U)) {
                eVar.a(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, com.mbridge.msdk.foundation.same.a.U);
            }
            if (TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.f13276g)) {
                com.mbridge.msdk.foundation.same.a.f13276g = com.mbridge.msdk.foundation.a.a.a.a().a(com.mbridge.msdk.foundation.controller.a.a);
            }
            if (!TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.f13276g)) {
                eVar.a(com.mbridge.msdk.foundation.controller.a.a, com.mbridge.msdk.foundation.same.a.f13276g);
            }
        } catch (Exception e2) {
            ad.b("CommonRequestParamsForAdd", e2.getMessage());
        }
    }

    public static void c(e eVar) {
        eVar.a("dyview_type", com.mbridge.msdk.foundation.same.a.f13291w);
    }

    public static void d(e eVar) {
        String str;
        if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            eVar.a("withGP", z.v() + "");
            eVar.a("has_wx", z.u(com.mbridge.msdk.foundation.controller.c.m().c()) + "");
            eVar.a("integrated_wx", z.z() + "");
            eVar.a("opensdk_ver", z.u() + "");
            eVar.a("wx_api_ver", z.c(com.mbridge.msdk.foundation.controller.c.m().h()) + "");
            eVar.a("mnc", z.k(com.mbridge.msdk.foundation.controller.c.m().c()));
            eVar.a("mcc", z.j(com.mbridge.msdk.foundation.controller.c.m().c()));
            String i10 = z.i();
            if (!TextUtils.isEmpty(i10)) {
                eVar.a("hardware", i10);
            }
            eVar.a("adid_limit", com.mbridge.msdk.foundation.tools.e.a() + "");
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.b.b()) {
                str = "1";
            } else {
                str = "0";
            }
            eVar.a("adid_limit_dev", str);
        }
        if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_OTHER)) {
            eVar.a(e.f13421g, z.n());
        }
        g.b(eVar);
        a(eVar, false);
        g(eVar);
        b(eVar);
        h(eVar);
        i(eVar);
    }

    public static void e(e eVar) {
        if (z.q() == 0) {
            return;
        }
        eVar.a("tun", z.q() + "");
    }

    public static void f(e eVar) {
        if (eVar != null) {
            if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                eVar.a("model");
                eVar.a("brand");
                eVar.a("screen_size");
                eVar.a("sub_ip");
                eVar.a("network_type");
                eVar.a("useragent");
                eVar.a("ua");
                eVar.a("language");
                eVar.a("network_str");
                eVar.a("os_version");
                eVar.a("country_code");
                eVar.a("cronet_env");
                eVar.a("adid_limit");
                eVar.a("adid_limit_dev");
            }
            if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_OTHER)) {
                eVar.a(e.a);
                eVar.a(e.f13416b);
                eVar.a("power_rate");
                eVar.a("charging");
                eVar.a("timezone");
            }
            if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
                eVar.a("gaid");
                eVar.a("gaid2");
                eVar.a("az_aid_info");
            }
            g.c(eVar);
        }
    }

    private static void g(e eVar) {
        int t5 = z.t();
        if (t5 != -1) {
            eVar.a("unknown_source", t5 + "");
        }
    }

    private static void h(e eVar) {
        String e2 = com.mbridge.msdk.foundation.tools.e.e();
        if (!TextUtils.isEmpty(e2)) {
            eVar.a("az_aid_info", e2);
        }
    }

    private static void i(e eVar) {
        String str = com.mbridge.msdk.e.c.a;
        if (!TextUtils.isEmpty(str)) {
            eVar.a("cronet_env", str);
        }
    }

    public static void a(e eVar, Context context) {
        if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            eVar.a("withGP", z.v() + "");
            eVar.a("has_wx", z.u(context) + "");
            eVar.a("integrated_wx", z.z() + "");
            eVar.a("opensdk_ver", z.u() + "");
            eVar.a("wx_api_ver", z.c(com.mbridge.msdk.foundation.controller.c.m().h()) + "");
            eVar.a("mnc", z.k(com.mbridge.msdk.foundation.controller.c.m().c()));
            eVar.a("mcc", z.j(com.mbridge.msdk.foundation.controller.c.m().c()));
            String i10 = z.i();
            if (!TextUtils.isEmpty(i10)) {
                eVar.a("hardware", i10);
            }
            com.mbridge.msdk.foundation.controller.authoritycontroller.c.j();
            if (com.mbridge.msdk.foundation.a.a.a.a().a(MBridgeConstans.AUTHORITY_DNT, 0) == 1) {
                eVar.a("dnt", "1");
            }
            eVar.a(e.f13417c, com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().f() + "");
            eVar.a("adid_limit", com.mbridge.msdk.foundation.tools.e.a() + "");
            eVar.a("adid_limit_dev", com.mbridge.msdk.foundation.controller.authoritycontroller.b.b() ? "1" : "0");
        }
        if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_OTHER)) {
            eVar.a(e.a, ag.b() + "");
            eVar.a(e.f13416b, ag.a() + "");
            eVar.a(e.f13421g, z.n());
        }
        eVar.a("pkg_source", z.a(z.e(context), context));
        if (com.mbridge.msdk.foundation.controller.c.m().i() != null) {
            eVar.a("web_env", com.mbridge.msdk.foundation.controller.c.m().i().toString());
        }
        eVar.a("http_req", MBridgeConstans.API_REUQEST_CATEGORY_APP);
        g.a(eVar, context);
        a(eVar, true);
        g(eVar);
        b(eVar);
        com.mbridge.msdk.c.g d10 = com.applovin.impl.mediation.ads.e.d(com.mbridge.msdk.c.h.a());
        if (d10 == null) {
            com.mbridge.msdk.c.h.a();
            d10 = com.mbridge.msdk.c.i.a();
        }
        if (d10.H() == 1) {
            eVar.a("gdpr_consent", com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().g() + "");
        } else if (d10.aE()) {
            eVar.a("gdpr_consent", com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().g() + "");
        }
        String i11 = com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().i();
        if (!TextUtils.isEmpty(i11)) {
            eVar.a("tc_string", i11);
        }
        h(eVar);
        i(eVar);
        g.a(eVar);
    }

    private static void a(e eVar, boolean z10) {
        com.mbridge.msdk.c.g d10 = com.applovin.impl.mediation.ads.e.d(com.mbridge.msdk.c.h.a());
        Context c10 = com.mbridge.msdk.foundation.controller.c.m().c();
        if (d10 != null) {
            if (!TextUtils.isEmpty(d10.a()) && z10) {
                eVar.a("a_stid", d10.a());
            }
            try {
                g.a(eVar, c10, z10, d10);
            } catch (Exception e2) {
                ad.b("CommonRequestParamsForAdd", e2.getMessage());
            }
        }
    }
}
