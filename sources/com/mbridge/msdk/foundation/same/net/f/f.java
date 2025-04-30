package com.mbridge.msdk.foundation.same.net.f;

import android.content.Context;
import android.text.TextUtils;
import com.applovin.impl.L;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ag;
import com.mbridge.msdk.foundation.tools.z;

/* loaded from: classes3.dex */
public final class f {
    public static void a(e eVar) {
        eVar.a("api_version", com.mbridge.msdk.foundation.same.a.f15678d);
    }

    public static void b(e eVar) {
        try {
            if (TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.f15673U)) {
                com.mbridge.msdk.foundation.same.a.f15673U = com.mbridge.msdk.foundation.a.a.a.a().a(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B);
            }
            if (!TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.f15673U)) {
                eVar.a(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, com.mbridge.msdk.foundation.same.a.f15673U);
            }
            if (TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.f15681g)) {
                com.mbridge.msdk.foundation.same.a.f15681g = com.mbridge.msdk.foundation.a.a.a.a().a(com.mbridge.msdk.foundation.controller.a.f15376a);
            }
            if (!TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.f15681g)) {
                eVar.a(com.mbridge.msdk.foundation.controller.a.f15376a, com.mbridge.msdk.foundation.same.a.f15681g);
            }
        } catch (Exception e4) {
            ad.b("CommonRequestParamsForAdd", e4.getMessage());
        }
    }

    public static void c(e eVar) {
        eVar.a("dyview_type", com.mbridge.msdk.foundation.same.a.f15695w);
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
            String i9 = z.i();
            if (!TextUtils.isEmpty(i9)) {
                eVar.a("hardware", i9);
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
            eVar.a(e.f15856g, z.n());
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
                eVar.a(e.f15851a);
                eVar.a(e.b);
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
        int t9 = z.t();
        if (t9 != -1) {
            eVar.a("unknown_source", t9 + "");
        }
    }

    private static void h(e eVar) {
        String e4 = com.mbridge.msdk.foundation.tools.e.e();
        if (!TextUtils.isEmpty(e4)) {
            eVar.a("az_aid_info", e4);
        }
    }

    private static void i(e eVar) {
        String str = com.mbridge.msdk.e.c.f15331a;
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
            String i9 = z.i();
            if (!TextUtils.isEmpty(i9)) {
                eVar.a("hardware", i9);
            }
            com.mbridge.msdk.foundation.controller.authoritycontroller.c.j();
            if (com.mbridge.msdk.foundation.a.a.a.a().a(MBridgeConstans.AUTHORITY_DNT, 0) == 1) {
                eVar.a("dnt", "1");
            }
            eVar.a(e.f15852c, com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().f() + "");
            eVar.a("adid_limit", com.mbridge.msdk.foundation.tools.e.a() + "");
            eVar.a("adid_limit_dev", com.mbridge.msdk.foundation.controller.authoritycontroller.b.b() ? "1" : "0");
        }
        if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_OTHER)) {
            eVar.a(e.f15851a, ag.b() + "");
            eVar.a(e.b, ag.a() + "");
            eVar.a(e.f15856g, z.n());
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
        com.mbridge.msdk.c.g f9 = L.f(com.mbridge.msdk.c.h.a());
        if (f9 == null) {
            com.mbridge.msdk.c.h.a();
            f9 = com.mbridge.msdk.c.i.a();
        }
        if (f9.H() == 1) {
            eVar.a("gdpr_consent", com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().g() + "");
        } else if (f9.aE()) {
            eVar.a("gdpr_consent", com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().g() + "");
        }
        String i10 = com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().i();
        if (!TextUtils.isEmpty(i10)) {
            eVar.a("tc_string", i10);
        }
        h(eVar);
        i(eVar);
        g.a(eVar);
    }

    private static void a(e eVar, boolean z8) {
        com.mbridge.msdk.c.g f9 = L.f(com.mbridge.msdk.c.h.a());
        Context c9 = com.mbridge.msdk.foundation.controller.c.m().c();
        if (f9 != null) {
            if (!TextUtils.isEmpty(f9.a()) && z8) {
                eVar.a("a_stid", f9.a());
            }
            try {
                g.a(eVar, c9, z8, f9);
            } catch (Exception e4) {
                ad.b("CommonRequestParamsForAdd", e4.getMessage());
            }
        }
    }
}
