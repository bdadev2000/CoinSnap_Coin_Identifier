package com.mbridge.msdk.reward.a;

import android.text.TextUtils;
import com.applovin.sdk.AppLovinMediationProvider;
import com.mbridge.msdk.foundation.b.a;
import com.mbridge.msdk.foundation.b.d;
import com.mbridge.msdk.foundation.controller.b;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.foundation.tools.x;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import com.vungle.ads.internal.presenter.q;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class a {
    private static String a = "RewardCandidateController";

    /* renamed from: b, reason: collision with root package name */
    private d f14742b;

    public a(String str, boolean z10) {
        try {
            this.f14742b = b.a().a(str, com.mbridge.msdk.videocommon.d.b.a().a(c.m().k(), str, z10).G());
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final void a(List<CampaignEx> list, String str, com.mbridge.msdk.reward.adapter.c cVar, String str2) {
        try {
            if (this.f14742b == null || TextUtils.isEmpty(str)) {
                return;
            }
            this.f14742b.a(com.mbridge.msdk.foundation.b.a.f12977b, 2, list, this.f14742b.a(list, str) > 0, "", "", -1, str2);
            d dVar = this.f14742b;
            JSONObject a10 = dVar.a(dVar.b(str));
            if (a10 == null || this.f14742b.d(str) <= 0.0d) {
                return;
            }
            a(this.f14742b.a(a10.optInt("max_usage_limit", 10), 0L), a10, a10.optInt("max_cache_num", 20), -1.0d, cVar, new com.mbridge.msdk.foundation.same.report.d.b(), str, false, 0);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final com.mbridge.msdk.foundation.b.c a(String str, com.mbridge.msdk.foundation.same.report.d.b bVar, CampaignEx campaignEx, com.mbridge.msdk.foundation.c.b bVar2, int i10, com.mbridge.msdk.reward.adapter.c cVar) {
        String requestId;
        int i11;
        String str2;
        com.mbridge.msdk.foundation.b.c a10;
        com.mbridge.msdk.foundation.b.c cVar2 = new com.mbridge.msdk.foundation.b.c();
        if (campaignEx == null) {
            requestId = "";
        } else {
            try {
                try {
                    requestId = campaignEx.getRequestId();
                } catch (Exception unused) {
                    cVar2.d("getCandidateCampaignList result exception");
                    cVar2.a(com.mbridge.msdk.foundation.b.c.f12993c);
                    return cVar2;
                }
            } catch (Exception unused2) {
                cVar2.d("getRewardCandidateCampaignList result exception");
                cVar2.a(com.mbridge.msdk.foundation.b.c.f12993c);
                return cVar2;
            }
        }
        if (bVar2 != null) {
            i11 = bVar2.f();
            str2 = bVar2.b();
        } else {
            i11 = 0;
            str2 = null;
        }
        d dVar = this.f14742b;
        if (dVar == null) {
            a10 = new com.mbridge.msdk.foundation.b.c();
            a10.d("can not get manager");
            a10.a(com.mbridge.msdk.foundation.b.c.f12993c);
        } else {
            com.mbridge.msdk.foundation.b.c c10 = dVar.c(str);
            if (c10.g() > com.mbridge.msdk.foundation.b.c.f12992b) {
                a10 = c10;
            } else {
                String[] split = x.a(str.split("_")[3]).split("\\|");
                double parseDouble = Double.parseDouble(split[0]);
                a10 = a(parseDouble, split.length > 1 ? split[1] : "", cVar, bVar, str, i10);
                this.f14742b.a(a10.a(), bVar, requestId, i11, str2, i10, parseDouble);
            }
        }
        return a10;
    }

    private com.mbridge.msdk.foundation.b.c a(double d10, String str, com.mbridge.msdk.reward.adapter.c cVar, com.mbridge.msdk.foundation.same.report.d.b bVar, String str2, int i10) {
        com.mbridge.msdk.foundation.b.c a10 = this.f14742b.a();
        try {
        } catch (Exception unused) {
            a10.d("getHighestCampaigns exception");
            a10.a(com.mbridge.msdk.foundation.b.c.f12993c);
        }
        if (a10.g() > 0) {
            return a10;
        }
        JSONObject a11 = this.f14742b.a(str);
        if (a11 != null) {
            int optInt = a11.optInt("max_usage_limit", 10);
            int optInt2 = a11.optInt("max_cache_num", 20);
            if (optInt2 > 0) {
                long j3 = 8640000;
                long optLong = a11.optLong("show_interval_time", 8640000L);
                if (optLong != 0) {
                    j3 = optLong;
                }
                List<com.mbridge.msdk.foundation.b.b> a12 = this.f14742b.a(optInt, System.currentTimeMillis() - (j3 * 1000));
                if (a12 != null && a12.size() > 0) {
                    return a(a12, a11, optInt2, d10, cVar, bVar, str2, true, i10);
                }
                a10.d("no cache");
                a10.a(com.mbridge.msdk.foundation.b.c.f12993c);
                a(bVar, str2, a10, (List<a.C0167a>) null, a11, 2);
            } else {
                a10.d("max cache num error");
                a10.a(com.mbridge.msdk.foundation.b.c.f12993c);
            }
        } else {
            a10.d("setting config not mapping");
            a10.a(com.mbridge.msdk.foundation.b.c.f12993c);
        }
        return a10;
    }

    private com.mbridge.msdk.foundation.b.c a(List<com.mbridge.msdk.foundation.b.b> list, JSONObject jSONObject, int i10, double d10, com.mbridge.msdk.reward.adapter.c cVar, com.mbridge.msdk.foundation.same.report.d.b bVar, String str, boolean z10, int i11) {
        ArrayList arrayList;
        int i12;
        com.mbridge.msdk.foundation.b.c cVar2;
        a aVar = this;
        List<com.mbridge.msdk.foundation.b.b> list2 = list;
        com.mbridge.msdk.foundation.b.c cVar3 = new com.mbridge.msdk.foundation.b.c();
        if (jSONObject == null) {
            cVar3.d("config is null");
            cVar3.a(com.mbridge.msdk.foundation.b.c.f12993c);
            return cVar3;
        }
        if (list2 != null && list.size() != 0) {
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                com.mbridge.msdk.foundation.b.b bVar2 = list2.get(i14);
                if (bVar2 != null) {
                    cVar3.a(bVar2.e());
                }
            }
            if (list.size() > 0 && ((list2 = aVar.a(list2, cVar3)) == null || list2.size() == 0)) {
                cVar3.d("existed");
                cVar3.a(com.mbridge.msdk.foundation.b.c.f12993c);
            }
            if (list2.size() > 0 && ((list2 = aVar.a(list2, cVar, cVar3)) == null || list2.size() == 0)) {
                cVar3.d("not ready");
                cVar3.a(com.mbridge.msdk.foundation.b.c.f12993c);
            }
            com.mbridge.msdk.foundation.b.b bVar3 = null;
            if (list2 == null || list2.size() <= 0) {
                arrayList = null;
            } else {
                ArrayList arrayList2 = new ArrayList();
                double optDouble = jSONObject.optDouble("t_disc", 0.8d);
                double optDouble2 = jSONObject.optDouble("u_disc", 0.95d);
                double d11 = 0.0d;
                double optDouble3 = jSONObject.optDouble("max_ecppv_diff", 0.0d);
                int optInt = jSONObject.optInt("time_interval", 1800);
                int size = list2.size();
                while (i13 < size) {
                    List<com.mbridge.msdk.foundation.b.b> list3 = list2;
                    com.mbridge.msdk.foundation.b.b bVar4 = list2.get(i13);
                    if (bVar4 != null) {
                        i12 = size;
                        cVar2 = cVar3;
                        double pow = Math.pow(optDouble2, bVar4.f()) * Math.pow(optDouble, (System.currentTimeMillis() - bVar4.h()) / (optInt * 1000.0d)) * bVar4.c();
                        arrayList2.add(new a.C0167a(pow, bVar4));
                        if (pow >= d10 - optDouble3 && pow > d11) {
                            bVar3 = bVar4;
                            d11 = pow;
                        }
                    } else {
                        i12 = size;
                        cVar2 = cVar3;
                    }
                    i13++;
                    aVar = this;
                    list2 = list3;
                    size = i12;
                    cVar3 = cVar2;
                }
                com.mbridge.msdk.foundation.b.c cVar4 = cVar3;
                d dVar = aVar.f14742b;
                if (dVar != null) {
                    dVar.a(arrayList2, i10);
                }
                if (bVar3 != null) {
                    cVar3 = cVar4;
                    cVar3.a(bVar3.b());
                    cVar3.a(com.mbridge.msdk.foundation.b.c.f12994d);
                } else {
                    cVar3 = cVar4;
                    cVar3.d("no match campaign");
                    cVar3.a(com.mbridge.msdk.foundation.b.c.f12993c);
                }
                arrayList = arrayList2;
            }
            if (z10) {
                a(bVar, str, cVar3, arrayList, jSONObject, 2);
            }
            return cVar3;
        }
        cVar3.d("candidate is null");
        cVar3.a(com.mbridge.msdk.foundation.b.c.f12993c);
        return cVar3;
    }

    private List<com.mbridge.msdk.foundation.b.b> a(List<com.mbridge.msdk.foundation.b.b> list, com.mbridge.msdk.foundation.b.c cVar) {
        CopyOnWriteArrayList<CampaignEx> b3;
        if (list == null || list.size() == 0) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            com.mbridge.msdk.foundation.b.b bVar = list.get(i10);
            if (bVar != null && (b3 = bVar.b()) != null && b3.size() != 0) {
                int i11 = 0;
                boolean z10 = false;
                while (true) {
                    if (i11 >= b3.size()) {
                        break;
                    }
                    CampaignEx campaignEx = b3.get(i11);
                    boolean c10 = ai.c(c.m().c(), campaignEx.getPackageName());
                    if (c10) {
                        cVar.c(bVar.e());
                        d dVar = this.f14742b;
                        if (dVar != null) {
                            dVar.a(bVar.d(), bVar.e(), 2, campaignEx.getEcppv());
                        }
                        z10 = c10;
                    } else {
                        i11++;
                        z10 = c10;
                    }
                }
                if (!z10) {
                    arrayList.add(bVar);
                }
            }
        }
        return arrayList;
    }

    private List<com.mbridge.msdk.foundation.b.b> a(List<com.mbridge.msdk.foundation.b.b> list, com.mbridge.msdk.reward.adapter.c cVar, com.mbridge.msdk.foundation.b.c cVar2) {
        CopyOnWriteArrayList<CampaignEx> b3;
        if (list == null || list.size() == 0) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            com.mbridge.msdk.foundation.b.b bVar = list.get(i10);
            if (bVar != null && (b3 = bVar.b()) != null && b3.size() != 0) {
                int i11 = 0;
                boolean z10 = false;
                while (true) {
                    if (i11 >= b3.size()) {
                        break;
                    }
                    CampaignEx campaignEx = b3.get(i11);
                    if (cVar == null || (z10 = cVar.a(b3, !TextUtils.isEmpty(campaignEx.getCMPTEntryUrl())))) {
                        i11++;
                    } else {
                        cVar2.b(bVar.e());
                        d dVar = this.f14742b;
                        if (dVar != null) {
                            dVar.a(bVar.d(), bVar.e(), 2, campaignEx.getEcppv());
                        }
                    }
                }
                if (z10) {
                    arrayList.add(bVar);
                }
            }
        }
        return arrayList;
    }

    public final boolean a(String str) {
        JSONObject a10;
        try {
            d dVar = this.f14742b;
            if (dVar != null && (a10 = dVar.a(dVar.b(str))) != null) {
                return a10.optInt("c_cb", 0) == 1;
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return false;
    }

    public final void a(String str, String str2, int i10, String str3) {
        d dVar = this.f14742b;
        if (dVar != null) {
            dVar.a(str, str2, i10, str3);
        }
    }

    public final void a(com.mbridge.msdk.foundation.same.report.d.b bVar, String str, com.mbridge.msdk.foundation.b.c cVar, List<a.C0167a> list, JSONObject jSONObject, int i10) {
        try {
            com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
            dVar.a("scene", i10 != 1 ? i10 != 2 ? i10 != 3 ? AppLovinMediationProvider.UNKNOWN : "track" : "candidate" : "cb");
            d dVar2 = this.f14742b;
            if (dVar2 != null) {
                double d10 = dVar2.d(str);
                if (d10 >= 0.0d) {
                    dVar.a("bp", x.b(d10 + ""));
                }
                dVar.a("cb_state", a(str) ? q.OPEN : "close");
                try {
                    d dVar3 = this.f14742b;
                    JSONObject a10 = dVar3.a(dVar3.b(str));
                    if (a10 != null) {
                        dVar.a("config", a10.toString());
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
            if (cVar != null) {
                if (cVar.g() == com.mbridge.msdk.foundation.b.c.f12994d) {
                    dVar.a("result", 1);
                } else {
                    dVar.a("result", 2);
                    dVar.a("reason", cVar.b());
                }
                dVar.a("acr", cVar.c());
                dVar.a("her", cVar.e());
                dVar.a("nrr", cVar.d());
                dVar.a("cer", cVar.f());
            } else {
                dVar.a("result", 2);
                dVar.a("reason", "candidate result is null");
            }
            if (list != null && list.size() > 0) {
                JSONArray jSONArray = new JSONArray();
                for (int i11 = 0; i11 < list.size(); i11++) {
                    com.mbridge.msdk.foundation.b.b a11 = list.get(i11).a();
                    if (a11 != null) {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("ecppv", x.b(a11.c() + ""));
                        jSONObject2.put("showCount", a11.f());
                        jSONObject2.put("intervalTime", System.currentTimeMillis() - a11.h());
                        jSONArray.put(jSONObject2);
                    }
                }
                dVar.a(DataSchemeDataSource.SCHEME_DATA, jSONArray.toString());
            }
            if (bVar != null) {
                bVar.a("m_candidate_data");
                bVar.k("m_candidate_data");
                bVar.a("m_candidate_data", dVar);
                if (cVar != null && cVar.a() != null) {
                    bVar.b(cVar.a());
                }
            }
            com.mbridge.msdk.foundation.same.report.d.c.a().a("m_candidate_data", bVar, (com.mbridge.msdk.foundation.same.report.d.a.a) null);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}
