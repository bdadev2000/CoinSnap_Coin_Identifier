package com.mbridge.msdk.foundation.same.report.d;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.n;
import com.mbridge.msdk.foundation.same.report.l;
import com.mbridge.msdk.foundation.tools.af;
import com.mbridge.msdk.foundation.tools.z;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultLoadControl;
import com.mbridge.msdk.tracker.m;
import com.mbridge.msdk.tracker.network.toolbox.h;
import com.mbridge.msdk.tracker.o;
import com.mbridge.msdk.tracker.w;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class c {
    private static c a;

    /* renamed from: b, reason: collision with root package name */
    private volatile m f13484b;

    /* renamed from: c, reason: collision with root package name */
    private Map<String, d> f13485c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private LinkedHashMap<String, b> f13486d = new LinkedHashMap<>();

    /* renamed from: e, reason: collision with root package name */
    private Map<String, d> f13487e = new HashMap();

    private c() {
        if (this.f13484b == null) {
            this.f13484b = m.a("metrics_sdk", com.mbridge.msdk.foundation.controller.c.m().c(), d());
        }
        JSONObject a10 = com.mbridge.msdk.foundation.same.report.c.a();
        if (this.f13484b != null) {
            this.f13484b.a(a10);
            this.f13484b.a();
        }
    }

    private w d() {
        o oVar;
        try {
            int a10 = af.a().a("metrics", "t_m_e_t", af.a().a("t_m_e_t", 604800000));
            int a11 = af.a().a("metrics", "t_m_e_s", af.a().a("t_m_e_s", 50));
            int a12 = af.a().a("metrics", "t_m_r_c", af.a().a("t_m_r_c", 50));
            int a13 = af.a().a("metrics", "t_m_t", af.a().a("t_m_t", DefaultLoadControl.DEFAULT_MIN_BUFFER_MS));
            int a14 = af.a().a("metrics", "t_m_r_t_s", af.a().a("t_m_r_t_s", 2));
            int a15 = af.a().a("metrics", "t_r_t", af.a().a("t_r_t", 1));
            if (a15 != 0 && a15 != 1) {
                a15 = 0;
            }
            w.a a16 = new w.a().e(a10).a(a11).d(a12).b(a13).c(a14).a(new com.mbridge.msdk.foundation.same.report.d()).a(com.mbridge.msdk.foundation.same.report.c.b()).a(new com.mbridge.msdk.foundation.same.report.m());
            if (a15 == 1) {
                oVar = new o(new l((byte) 2), com.mbridge.msdk.foundation.same.net.e.d.f().f13399i, com.mbridge.msdk.foundation.same.net.e.d.f().f13403m);
            } else {
                oVar = new o(new h(), com.mbridge.msdk.foundation.same.net.e.d.f().f13393c, 0);
            }
            return a16.a(a15, oVar).a();
        } catch (Exception e2) {
            com.applovin.impl.mediation.ads.e.p(e2, new StringBuilder("configTrackManager error: "), "EventLibraryReport");
            return null;
        }
    }

    public final void a(b bVar) {
        if (bVar != null) {
            try {
                if (this.f13485c != null) {
                    d dVar = new d();
                    dVar.a("rs_rid", bVar.k());
                    dVar.a("r_stid", bVar.m());
                    dVar.a("rus_rid", bVar.l());
                    dVar.a("u_stid", bVar.t());
                    this.f13485c.put(bVar.i(), dVar);
                }
            } catch (Exception e2) {
                if (MBridgeConstans.DEBUG) {
                    e2.printStackTrace();
                }
            }
        }
    }

    public final void b(String str, d dVar) {
        try {
            b bVar = new b();
            if (dVar.b(MBridgeConstans.PROPERTIES_UNIT_ID) != null) {
                bVar.d(String.valueOf(dVar.b(MBridgeConstans.PROPERTIES_UNIT_ID)));
            }
            if (dVar.b("lrid") != null && (dVar.b("lrid") instanceof String)) {
                bVar.c(String.valueOf(dVar.b("lrid")));
            }
            bVar.a(str, dVar);
            new e().b(str, this.f13484b, bVar, null);
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                e2.printStackTrace();
            }
        }
    }

    public final void c(String str) {
        LinkedHashMap<String, b> linkedHashMap;
        try {
            if (!TextUtils.isEmpty(str) && (linkedHashMap = this.f13486d) != null && linkedHashMap.containsKey(str)) {
                this.f13486d.remove(str);
            }
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                e2.printStackTrace();
            }
        }
    }

    public final m c() {
        return this.f13484b;
    }

    public final d a(String str) {
        Map<String, d> map;
        d dVar = new d();
        try {
            return (TextUtils.isEmpty(str) || (map = this.f13485c) == null || !map.containsKey(str)) ? dVar : this.f13485c.get(str);
        } catch (Exception e2) {
            if (!MBridgeConstans.DEBUG) {
                return dVar;
            }
            e2.printStackTrace();
            return dVar;
        }
    }

    private void b(String str, b bVar, com.mbridge.msdk.foundation.same.report.d.a.a aVar) {
        try {
            if (Arrays.asList(a.f13451c).contains(str)) {
                bVar.m(str);
            }
            Map<String, d> map = this.f13487e;
            if (map != null && map.containsKey(str)) {
                bVar.a(str, this.f13487e.get(str));
            }
            new e().a(str, this.f13484b, bVar, aVar);
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                e2.printStackTrace();
            }
        }
    }

    public final void a(String str, d dVar) {
        Map<String, d> map = this.f13487e;
        if (map != null) {
            map.put(str, dVar);
        }
    }

    public final d a(int i10, int i11, String str, boolean z10, int i12) {
        d dVar = new d();
        try {
            dVar.a(CampaignEx.JSON_KEY_HB, Integer.valueOf(i10));
            dVar.a("adtp", Integer.valueOf(i11));
            dVar.a(MBridgeConstans.PROPERTIES_UNIT_ID, str);
            if (z10) {
                dVar.a("auto_load", Integer.valueOf(i12));
            }
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                e2.printStackTrace();
            }
        }
        return dVar;
    }

    public final LinkedHashMap<String, b> b() {
        return this.f13486d;
    }

    public final b b(String str) {
        LinkedHashMap<String, b> linkedHashMap;
        try {
            if (!TextUtils.isEmpty(str) && (linkedHashMap = this.f13486d) != null && linkedHashMap.containsKey(str)) {
                return this.f13486d.get(str);
            }
            return null;
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                e2.printStackTrace();
            }
            return null;
        }
    }

    public static c a() {
        if (a == null) {
            synchronized (c.class) {
                if (a == null) {
                    a = new c();
                }
            }
        }
        return a;
    }

    public final b b(b bVar) {
        if (bVar == null) {
            return null;
        }
        try {
            return (b) bVar.clone();
        } catch (CloneNotSupportedException e2) {
            if (!MBridgeConstans.DEBUG) {
                return null;
            }
            e2.printStackTrace();
            return null;
        }
    }

    public final void a(String str, CampaignEx campaignEx, d dVar) {
        b bVar;
        String str2 = "";
        if (campaignEx != null) {
            try {
                str2 = campaignEx.getLocalRequestId();
                bVar = this.f13486d.get(str2);
            } catch (Exception e2) {
                if (MBridgeConstans.DEBUG) {
                    e2.printStackTrace();
                    return;
                }
                return;
            }
        } else {
            bVar = null;
        }
        if (bVar != null) {
            if (Arrays.asList(a.f13456h).contains(str)) {
                bVar = b(bVar);
            }
        } else {
            bVar = new b();
        }
        bVar.a(campaignEx);
        bVar.c(str2);
        bVar.a(str, dVar);
        b(str, bVar, null);
    }

    public final void d(String str) {
        try {
            JSONObject a10 = com.mbridge.msdk.foundation.same.c.a(str);
            if (a10 != null && a10.length() != 0) {
                String optString = a10.optString("key");
                if (TextUtils.isEmpty(optString)) {
                    return;
                }
                com.mbridge.msdk.tracker.e eVar = new com.mbridge.msdk.tracker.e(optString);
                eVar.b(0);
                eVar.a(0);
                eVar.a(com.mbridge.msdk.foundation.same.report.c.c());
                eVar.a(a10);
                m mVar = a().f13484b;
                if (mVar == null || !mVar.e()) {
                    return;
                }
                mVar.a(eVar);
            }
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                com.applovin.impl.mediation.ads.e.p(e2, new StringBuilder("reportByTrackManager error: "), "EventLibraryReport");
            }
        }
    }

    public final void a(String str, CampaignEx campaignEx) {
        String str2 = "";
        if (campaignEx != null) {
            try {
                str2 = campaignEx.getCurrentLocalRid();
            } catch (Exception e2) {
                if (MBridgeConstans.DEBUG) {
                    e2.printStackTrace();
                    return;
                }
                return;
            }
        }
        b bVar = this.f13486d.get(str2);
        if (bVar == null) {
            bVar = new b();
        }
        bVar.a(campaignEx);
        bVar.c(str2);
        b(str, bVar, null);
    }

    public final void a(String str, List<CampaignEx> list, d dVar) {
        CampaignEx campaignEx;
        String str2 = "";
        if (list != null) {
            try {
                if (list.size() > 0 && (campaignEx = list.get(0)) != null) {
                    str2 = campaignEx.getCurrentLocalRid();
                }
            } catch (Exception e2) {
                if (MBridgeConstans.DEBUG) {
                    e2.printStackTrace();
                    return;
                }
                return;
            }
        }
        b bVar = this.f13486d.get(str2);
        if (bVar == null) {
            bVar = new b();
        }
        bVar.b(list);
        if (list != null && list.size() > 0) {
            bVar.c(list.get(0).getCurrentLocalRid());
        }
        bVar.a(str, dVar);
        b(str, bVar, null);
    }

    public final void a(String str, b bVar, com.mbridge.msdk.foundation.same.report.d.a.a aVar) {
        b(str, bVar, aVar);
    }

    public final void a(n nVar, CampaignEx campaignEx) {
        d dVar = new d();
        dVar.a("result", Integer.valueOf(nVar.m()));
        dVar.a("scenes", nVar.b("scenes", ""));
        dVar.a("resource_type", Integer.valueOf(nVar.A()));
        dVar.a("url", nVar.b("url", ""));
        dVar.a("reason", nVar.h());
        dVar.a("mraid_type", Integer.valueOf(nVar.y()));
        a().a(nVar.a(), campaignEx, dVar);
    }

    public final void a(String str, b bVar) {
        try {
            Map<String, d> map = this.f13487e;
            if (map != null && map.containsKey(str)) {
                bVar.a(str, this.f13487e.get(str));
            }
            new e().a(str, this.f13484b, bVar, null);
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                e2.printStackTrace();
            }
        }
    }

    public final void a(String str, b bVar, CampaignEx campaignEx, Context context, com.mbridge.msdk.foundation.same.report.d.a.a aVar) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            if (bVar == null) {
                bVar = new b();
            }
            d dVar = new d();
            dVar.a("st", Long.valueOf(System.currentTimeMillis()));
            if (campaignEx != null) {
                dVar.a(BidResponsedEx.KEY_CID, campaignEx.getId());
                dVar.a("lrid", campaignEx.getLocalRequestId());
                dVar.a("rid", campaignEx.getRequestId());
                dVar.a("rid_n", campaignEx.getRequestIdNotice());
                dVar.a("adtp", Integer.valueOf(campaignEx.getAdType()));
                if (!dVar.a(MBridgeConstans.PROPERTIES_UNIT_ID)) {
                    dVar.a(MBridgeConstans.PROPERTIES_UNIT_ID, campaignEx.getCampaignUnitId());
                }
                dVar.a(CampaignEx.JSON_KEY_HB, Integer.valueOf(campaignEx.isBidCampaign() ? 1 : 0));
                dVar.a("bid_tk", campaignEx.getBidToken());
            }
            if (context != null) {
                dVar.a("network_type", Integer.valueOf(z.l(context)));
            }
            bVar.a(str, dVar);
            b(str, bVar, aVar);
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                e2.printStackTrace();
            }
        }
    }
}
