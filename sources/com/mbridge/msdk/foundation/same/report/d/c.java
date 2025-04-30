package com.mbridge.msdk.foundation.same.report.d;

import android.content.Context;
import android.text.TextUtils;
import com.applovin.impl.L;
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

/* loaded from: classes3.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private static c f15920a;
    private volatile m b;

    /* renamed from: c, reason: collision with root package name */
    private Map<String, d> f15921c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private LinkedHashMap<String, b> f15922d = new LinkedHashMap<>();

    /* renamed from: e, reason: collision with root package name */
    private Map<String, d> f15923e = new HashMap();

    private c() {
        if (this.b == null) {
            this.b = m.a("metrics_sdk", com.mbridge.msdk.foundation.controller.c.m().c(), d());
        }
        JSONObject a6 = com.mbridge.msdk.foundation.same.report.c.a();
        if (this.b != null) {
            this.b.a(a6);
            this.b.a();
        }
    }

    private w d() {
        o oVar;
        try {
            int a6 = af.a().a("metrics", "t_m_e_t", af.a().a("t_m_e_t", 604800000));
            int a9 = af.a().a("metrics", "t_m_e_s", af.a().a("t_m_e_s", 50));
            int a10 = af.a().a("metrics", "t_m_r_c", af.a().a("t_m_r_c", 50));
            int a11 = af.a().a("metrics", "t_m_t", af.a().a("t_m_t", DefaultLoadControl.DEFAULT_MIN_BUFFER_MS));
            int a12 = af.a().a("metrics", "t_m_r_t_s", af.a().a("t_m_r_t_s", 2));
            int a13 = af.a().a("metrics", "t_r_t", af.a().a("t_r_t", 1));
            if (a13 != 0 && a13 != 1) {
                a13 = 0;
            }
            w.a a14 = new w.a().e(a6).a(a9).d(a10).b(a11).c(a12).a(new com.mbridge.msdk.foundation.same.report.d()).a(com.mbridge.msdk.foundation.same.report.c.b()).a(new com.mbridge.msdk.foundation.same.report.m());
            if (a13 == 1) {
                oVar = new o(new l((byte) 2), com.mbridge.msdk.foundation.same.net.e.d.f().f15833i, com.mbridge.msdk.foundation.same.net.e.d.f().m);
            } else {
                oVar = new o(new h(), com.mbridge.msdk.foundation.same.net.e.d.f().f15827c, 0);
            }
            return a14.a(a13, oVar).a();
        } catch (Exception e4) {
            L.s(e4, new StringBuilder("configTrackManager error: "), "EventLibraryReport");
            return null;
        }
    }

    public final void a(b bVar) {
        if (bVar != null) {
            try {
                if (this.f15921c != null) {
                    d dVar = new d();
                    dVar.a("rs_rid", bVar.k());
                    dVar.a("r_stid", bVar.m());
                    dVar.a("rus_rid", bVar.l());
                    dVar.a("u_stid", bVar.t());
                    this.f15921c.put(bVar.i(), dVar);
                }
            } catch (Exception e4) {
                if (MBridgeConstans.DEBUG) {
                    e4.printStackTrace();
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
            new e().b(str, this.b, bVar, null);
        } catch (Exception e4) {
            if (MBridgeConstans.DEBUG) {
                e4.printStackTrace();
            }
        }
    }

    public final void c(String str) {
        LinkedHashMap<String, b> linkedHashMap;
        try {
            if (!TextUtils.isEmpty(str) && (linkedHashMap = this.f15922d) != null && linkedHashMap.containsKey(str)) {
                this.f15922d.remove(str);
            }
        } catch (Exception e4) {
            if (MBridgeConstans.DEBUG) {
                e4.printStackTrace();
            }
        }
    }

    public final m c() {
        return this.b;
    }

    public final d a(String str) {
        Map<String, d> map;
        d dVar = new d();
        try {
            return (TextUtils.isEmpty(str) || (map = this.f15921c) == null || !map.containsKey(str)) ? dVar : this.f15921c.get(str);
        } catch (Exception e4) {
            if (!MBridgeConstans.DEBUG) {
                return dVar;
            }
            e4.printStackTrace();
            return dVar;
        }
    }

    private void b(String str, b bVar, com.mbridge.msdk.foundation.same.report.d.a.a aVar) {
        try {
            if (Arrays.asList(a.f15889c).contains(str)) {
                bVar.m(str);
            }
            Map<String, d> map = this.f15923e;
            if (map != null && map.containsKey(str)) {
                bVar.a(str, this.f15923e.get(str));
            }
            new e().a(str, this.b, bVar, aVar);
        } catch (Exception e4) {
            if (MBridgeConstans.DEBUG) {
                e4.printStackTrace();
            }
        }
    }

    public final void a(String str, d dVar) {
        Map<String, d> map = this.f15923e;
        if (map != null) {
            map.put(str, dVar);
        }
    }

    public final d a(int i9, int i10, String str, boolean z8, int i11) {
        d dVar = new d();
        try {
            dVar.a(CampaignEx.JSON_KEY_HB, Integer.valueOf(i9));
            dVar.a("adtp", Integer.valueOf(i10));
            dVar.a(MBridgeConstans.PROPERTIES_UNIT_ID, str);
            if (z8) {
                dVar.a("auto_load", Integer.valueOf(i11));
            }
        } catch (Exception e4) {
            if (MBridgeConstans.DEBUG) {
                e4.printStackTrace();
            }
        }
        return dVar;
    }

    public final LinkedHashMap<String, b> b() {
        return this.f15922d;
    }

    public final b b(String str) {
        LinkedHashMap<String, b> linkedHashMap;
        try {
            if (!TextUtils.isEmpty(str) && (linkedHashMap = this.f15922d) != null && linkedHashMap.containsKey(str)) {
                return this.f15922d.get(str);
            }
            return null;
        } catch (Exception e4) {
            if (MBridgeConstans.DEBUG) {
                e4.printStackTrace();
            }
            return null;
        }
    }

    public static c a() {
        if (f15920a == null) {
            synchronized (c.class) {
                try {
                    if (f15920a == null) {
                        f15920a = new c();
                    }
                } finally {
                }
            }
        }
        return f15920a;
    }

    public final b b(b bVar) {
        if (bVar == null) {
            return null;
        }
        try {
            return (b) bVar.clone();
        } catch (CloneNotSupportedException e4) {
            if (!MBridgeConstans.DEBUG) {
                return null;
            }
            e4.printStackTrace();
            return null;
        }
    }

    public final void a(String str, CampaignEx campaignEx, d dVar) {
        b bVar;
        String str2 = "";
        if (campaignEx != null) {
            try {
                str2 = campaignEx.getLocalRequestId();
                bVar = this.f15922d.get(str2);
            } catch (Exception e4) {
                if (MBridgeConstans.DEBUG) {
                    e4.printStackTrace();
                    return;
                }
                return;
            }
        } else {
            bVar = null;
        }
        if (bVar != null) {
            if (Arrays.asList(a.f15894h).contains(str)) {
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
            JSONObject a6 = com.mbridge.msdk.foundation.same.c.a(str);
            if (a6 != null && a6.length() != 0) {
                String optString = a6.optString("key");
                if (TextUtils.isEmpty(optString)) {
                    return;
                }
                com.mbridge.msdk.tracker.e eVar = new com.mbridge.msdk.tracker.e(optString);
                eVar.b(0);
                eVar.a(0);
                eVar.a(com.mbridge.msdk.foundation.same.report.c.c());
                eVar.a(a6);
                m mVar = a().b;
                if (mVar == null || !mVar.e()) {
                    return;
                }
                mVar.a(eVar);
            }
        } catch (Exception e4) {
            if (MBridgeConstans.DEBUG) {
                L.s(e4, new StringBuilder("reportByTrackManager error: "), "EventLibraryReport");
            }
        }
    }

    public final void a(String str, CampaignEx campaignEx) {
        String str2 = "";
        if (campaignEx != null) {
            try {
                str2 = campaignEx.getCurrentLocalRid();
            } catch (Exception e4) {
                if (MBridgeConstans.DEBUG) {
                    e4.printStackTrace();
                    return;
                }
                return;
            }
        }
        b bVar = this.f15922d.get(str2);
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
            } catch (Exception e4) {
                if (MBridgeConstans.DEBUG) {
                    e4.printStackTrace();
                    return;
                }
                return;
            }
        }
        b bVar = this.f15922d.get(str2);
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
            Map<String, d> map = this.f15923e;
            if (map != null && map.containsKey(str)) {
                bVar.a(str, this.f15923e.get(str));
            }
            new e().a(str, this.b, bVar, null);
        } catch (Exception e4) {
            if (MBridgeConstans.DEBUG) {
                e4.printStackTrace();
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
        } catch (Exception e4) {
            if (MBridgeConstans.DEBUG) {
                e4.printStackTrace();
            }
        }
    }
}
