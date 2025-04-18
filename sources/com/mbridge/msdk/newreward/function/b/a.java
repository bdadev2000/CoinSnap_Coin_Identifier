package com.mbridge.msdk.newreward.function.b;

import com.applovin.sdk.AppLovinMediationProvider;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.d.d;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.foundation.tools.x;
import com.mbridge.msdk.newreward.a.e;
import com.mbridge.msdk.newreward.function.a.a;
import com.mbridge.msdk.newreward.function.c.c;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import com.mbridge.msdk.videocommon.d.b;
import com.vungle.ads.internal.presenter.q;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class a {
    private static String a = "RewardCandidateController";

    /* renamed from: b, reason: collision with root package name */
    private final c f14454b;

    /* renamed from: c, reason: collision with root package name */
    private com.mbridge.msdk.newreward.function.a.c f14455c;

    public a(String str, boolean z10, c cVar) {
        this.f14454b = cVar;
        try {
            com.mbridge.msdk.newreward.function.a.c a10 = com.mbridge.msdk.newreward.function.a.a.a.a().a(str, b.a().a(com.mbridge.msdk.foundation.controller.c.m().k(), str, z10).G());
            this.f14455c = a10;
            a10.a(cVar);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private List<com.mbridge.msdk.newreward.function.d.a.b> b(List<com.mbridge.msdk.newreward.function.d.a.b> list, com.mbridge.msdk.newreward.function.a.b bVar) {
        List<com.mbridge.msdk.newreward.function.d.a.a> s5;
        if (list != null && list.size() != 0) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < list.size(); i10++) {
                com.mbridge.msdk.newreward.function.d.a.b bVar2 = list.get(i10);
                if (bVar2 != null && (s5 = bVar2.s()) != null && s5.size() != 0) {
                    arrayList.add(bVar2);
                }
            }
            return arrayList;
        }
        return list;
    }

    public final com.mbridge.msdk.newreward.function.a.b a(com.mbridge.msdk.foundation.same.report.d.b bVar, com.mbridge.msdk.foundation.c.b bVar2, e eVar, int i10) {
        String str;
        int i11;
        CampaignEx campaignEx;
        String str2;
        String requestId;
        int i12;
        String str3;
        com.mbridge.msdk.newreward.function.a.b a10;
        com.mbridge.msdk.newreward.function.a.b bVar3 = new com.mbridge.msdk.newreward.function.a.b();
        if (eVar != null) {
            try {
                String C = eVar.C();
                CampaignEx campaignEx2 = (eVar.x() == null || eVar.x().b() == null || eVar.x().b().C() == null || eVar.x().b().C().size() <= 0) ? null : eVar.x().b().C().get(0);
                if (this.f14455c != null) {
                    int p10 = eVar.p();
                    String w10 = eVar.w();
                    this.f14455c.a(p10);
                    this.f14455c.f(w10);
                    this.f14455c.a(eVar);
                    i11 = p10;
                    campaignEx = campaignEx2;
                    str = w10;
                } else {
                    str = "";
                    i11 = 94;
                    campaignEx = campaignEx2;
                }
                str2 = C;
            } catch (Exception unused) {
                bVar3.d("getCandidateCampaignList result exception");
                bVar3.a(com.mbridge.msdk.foundation.b.c.f12993c);
                return bVar3;
            }
        } else {
            str = "";
            str2 = null;
            i11 = 94;
            campaignEx = null;
        }
        if (campaignEx == null) {
            requestId = "";
        } else {
            try {
                requestId = campaignEx.getRequestId();
            } catch (Exception unused2) {
                bVar3.d("getRewardCandidateCampaignList result exception");
                bVar3.a(com.mbridge.msdk.foundation.b.c.f12993c);
                return bVar3;
            }
        }
        if (bVar2 != null) {
            i12 = bVar2.f();
            str3 = bVar2.b();
        } else {
            i12 = 0;
            str3 = null;
        }
        com.mbridge.msdk.newreward.function.a.c cVar = this.f14455c;
        if (cVar == null) {
            a10 = new com.mbridge.msdk.newreward.function.a.b();
            a10.d("can not get manager");
            a10.a(com.mbridge.msdk.foundation.b.c.f12993c);
        } else {
            com.mbridge.msdk.newreward.function.a.b c10 = cVar.c(str2);
            if (c10.h() > com.mbridge.msdk.foundation.b.c.f12992b) {
                return c10;
            }
            String[] split = x.a(str2.split("_")[3]).split("\\|");
            double parseDouble = Double.parseDouble(split[0]);
            a10 = a(parseDouble, split.length > 1 ? split[1] : "", bVar, str2, eVar, i10, i11, str);
            if (a10 != null && a10.a() != null) {
                this.f14455c.a(a10.a().s(), bVar, requestId, i12, str3, i10, parseDouble);
            }
        }
        return a10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v6 */
    private com.mbridge.msdk.newreward.function.a.b a(double d10, String str, com.mbridge.msdk.foundation.same.report.d.b bVar, String str2, e eVar, int i10, int i11, String str3) {
        JSONObject jSONObject;
        com.mbridge.msdk.newreward.function.a.b bVar2;
        ArrayList arrayList;
        int i12;
        JSONObject jSONObject2;
        List<com.mbridge.msdk.newreward.function.d.a.a> s5;
        com.mbridge.msdk.newreward.function.a.b bVar3 = this;
        com.mbridge.msdk.newreward.function.a.b a10 = bVar3.f14455c.a();
        try {
        } catch (Exception unused) {
            bVar3 = a10;
        }
        if (a10.h() > 0) {
            return a10;
        }
        JSONObject a11 = bVar3.f14455c.a(str);
        try {
            if (a11 != null) {
                int optInt = a11.optInt("max_usage_limit", 10);
                if (a11.optInt("max_cache_num", 20) > 0) {
                    List<com.mbridge.msdk.newreward.function.d.a.b> a12 = bVar3.f14455c.a(optInt, i11, str3);
                    if (a12 != null && a12.size() > 0) {
                        com.mbridge.msdk.newreward.function.a.b bVar4 = new com.mbridge.msdk.newreward.function.a.b();
                        if (a12.size() == 0) {
                            bVar4.d("candidate is null");
                            bVar4.a(com.mbridge.msdk.foundation.b.c.f12993c);
                        } else {
                            for (int i13 = 0; i13 < a12.size(); i13++) {
                                com.mbridge.msdk.newreward.function.d.a.b bVar5 = a12.get(i13);
                                if (bVar5 != null) {
                                    bVar4.a(bVar5.d());
                                }
                            }
                            if (a12.size() > 0) {
                                if (a12.size() != 0) {
                                    ArrayList arrayList2 = new ArrayList();
                                    for (int i14 = 0; i14 < a12.size(); i14++) {
                                        com.mbridge.msdk.newreward.function.d.a.b bVar6 = a12.get(i14);
                                        if (bVar6 != null && (s5 = bVar6.s()) != null && s5.size() != 0) {
                                            int i15 = 0;
                                            boolean z10 = false;
                                            while (true) {
                                                if (i15 >= s5.size()) {
                                                    break;
                                                }
                                                com.mbridge.msdk.newreward.function.d.a.a aVar = s5.get(i15);
                                                boolean c10 = ai.c(com.mbridge.msdk.foundation.controller.c.m().c(), aVar.g().getPackageName());
                                                if (c10) {
                                                    bVar4.c(bVar6.d());
                                                    com.mbridge.msdk.newreward.function.a.c cVar = bVar3.f14455c;
                                                    if (cVar != null) {
                                                        cVar.a(bVar6.e(), bVar6.d(), 2, aVar.h().q());
                                                    }
                                                    z10 = c10;
                                                } else {
                                                    i15++;
                                                    z10 = c10;
                                                }
                                            }
                                            if (!z10) {
                                                arrayList2.add(bVar6);
                                            }
                                        }
                                    }
                                    a12 = arrayList2;
                                }
                                if (a12.size() == 0) {
                                    bVar4.d("existed");
                                    bVar4.a(com.mbridge.msdk.foundation.b.c.f12993c);
                                }
                            }
                            if (a12.size() > 0 && ((a12 = bVar3.a(a12, bVar4)) == null || a12.size() == 0)) {
                                bVar4.d("not ready");
                                bVar4.a(com.mbridge.msdk.foundation.b.c.f12993c);
                            }
                            if (a12.size() > 0 && ((a12 = bVar3.b(a12, bVar4)) == null || a12.size() == 0)) {
                                bVar4.d("had in cache");
                                bVar4.a(com.mbridge.msdk.foundation.b.c.f12993c);
                            }
                            if (a12 == null || a12.size() <= 0) {
                                jSONObject = a11;
                                bVar2 = a10;
                                arrayList = null;
                            } else {
                                ArrayList arrayList3 = new ArrayList();
                                double optDouble = a11.optDouble("t_disc", 0.8d);
                                double optDouble2 = a11.optDouble("u_disc", 0.95d);
                                double optDouble3 = a11.optDouble("max_ecppv_diff", 0.0d);
                                int optInt2 = a11.optInt("time_interval", 1800);
                                int size = a12.size();
                                double d11 = 0.0d;
                                com.mbridge.msdk.newreward.function.d.a.b bVar7 = null;
                                int i16 = 0;
                                while (i16 < size) {
                                    com.mbridge.msdk.newreward.function.d.a.b bVar8 = a12.get(i16);
                                    if (bVar8 != null) {
                                        bVar2 = a10;
                                        i12 = size;
                                        jSONObject2 = a11;
                                        try {
                                            double pow = Math.pow(optDouble2, bVar8.r()) * bVar8.q() * Math.pow(optDouble, (System.currentTimeMillis() - bVar8.G()) / (optInt2 * 1000.0d));
                                            arrayList3.add(new a.C0186a(pow, bVar8));
                                            if (pow >= d10 - optDouble3 && pow > d11) {
                                                d11 = pow;
                                                bVar7 = bVar8;
                                            }
                                        } catch (Exception unused2) {
                                            bVar3 = bVar2;
                                            bVar3.d("getHighestCampaigns exception");
                                            bVar3.a(com.mbridge.msdk.foundation.b.c.f12993c);
                                            return bVar3;
                                        }
                                    } else {
                                        i12 = size;
                                        jSONObject2 = a11;
                                        bVar2 = a10;
                                    }
                                    i16++;
                                    a11 = jSONObject2;
                                    size = i12;
                                    a10 = bVar2;
                                }
                                jSONObject = a11;
                                bVar2 = a10;
                                if (bVar7 != null) {
                                    bVar4.a(bVar7);
                                    bVar4.a(com.mbridge.msdk.foundation.b.c.f12994d);
                                } else {
                                    bVar4.d("no match campaign");
                                    bVar4.a(com.mbridge.msdk.foundation.b.c.f12993c);
                                }
                                arrayList = arrayList3;
                            }
                            a(bVar, str2, bVar4, arrayList, jSONObject, eVar, i10);
                        }
                        return bVar4;
                    }
                    com.mbridge.msdk.newreward.function.a.b bVar9 = a10;
                    bVar9.d("no cache");
                    bVar9.a(com.mbridge.msdk.foundation.b.c.f12993c);
                    a(bVar, str2, bVar9, null, a11, eVar, 2);
                    bVar3 = bVar9;
                } else {
                    com.mbridge.msdk.newreward.function.a.b bVar10 = a10;
                    bVar10.d("max cache num error");
                    bVar10.a(com.mbridge.msdk.foundation.b.c.f12993c);
                    bVar3 = bVar10;
                }
            } else {
                com.mbridge.msdk.newreward.function.a.b bVar11 = a10;
                bVar11.d("setting config not mapping");
                bVar11.a(com.mbridge.msdk.foundation.b.c.f12993c);
                bVar3 = bVar11;
            }
        } catch (Exception unused3) {
        }
        return bVar3;
    }

    private List<com.mbridge.msdk.newreward.function.d.a.b> a(List<com.mbridge.msdk.newreward.function.d.a.b> list, com.mbridge.msdk.newreward.function.a.b bVar) {
        List<com.mbridge.msdk.newreward.function.d.a.a> s5;
        if (list == null || list.size() == 0) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            com.mbridge.msdk.newreward.function.d.a.b bVar2 = list.get(i10);
            if (bVar2 != null && (s5 = bVar2.s()) != null && s5.size() != 0) {
                int i11 = 0;
                boolean z10 = false;
                while (true) {
                    if (i11 >= s5.size()) {
                        break;
                    }
                    com.mbridge.msdk.newreward.function.d.a.a aVar = s5.get(i11);
                    boolean y4 = aVar.h().y();
                    if (y4) {
                        i11++;
                        z10 = y4;
                    } else {
                        bVar.b(bVar2.d());
                        com.mbridge.msdk.newreward.function.a.c cVar = this.f14455c;
                        if (cVar != null) {
                            cVar.a(bVar2.e(), bVar2.d(), 2, aVar.h().q());
                        }
                        z10 = y4;
                    }
                }
                if (z10) {
                    arrayList.add(bVar2);
                }
            }
        }
        return arrayList;
    }

    public final boolean a(String str) {
        JSONObject a10;
        try {
            com.mbridge.msdk.newreward.function.a.c cVar = this.f14455c;
            if (cVar != null && (a10 = cVar.a(cVar.b(str))) != null) {
                return a10.optInt("c_cb", 0) == 1;
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return false;
    }

    public final void a(com.mbridge.msdk.foundation.same.report.d.b bVar, String str, com.mbridge.msdk.newreward.function.a.b bVar2, List<a.C0186a> list, JSONObject jSONObject, e eVar, int i10) {
        try {
            d dVar = new d();
            dVar.a("scene", i10 != 1 ? i10 != 2 ? i10 != 3 ? AppLovinMediationProvider.UNKNOWN : "track" : "candidate" : "cb");
            com.mbridge.msdk.newreward.function.a.c cVar = this.f14455c;
            if (cVar != null) {
                double d10 = cVar.d(str);
                if (d10 >= 0.0d) {
                    dVar.a("bp", x.b(d10 + ""));
                }
                dVar.a("cb_state", a(str) ? q.OPEN : "close");
                try {
                    com.mbridge.msdk.newreward.function.a.c cVar2 = this.f14455c;
                    JSONObject a10 = cVar2.a(cVar2.b(str));
                    if (a10 != null) {
                        dVar.a("config", a10.toString());
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
            if (bVar2 != null) {
                if (bVar2.h() == com.mbridge.msdk.foundation.b.c.f12994d) {
                    dVar.a("result", 1);
                } else {
                    dVar.a("result", 2);
                    dVar.a("reason", bVar2.b());
                }
                dVar.a("acr", bVar2.c());
                dVar.a("her", bVar2.e());
                dVar.a("nrr", bVar2.d());
                dVar.a("cer", bVar2.f());
            } else {
                dVar.a("result", 2);
                dVar.a("reason", "candidate result is null");
            }
            if (list != null && list.size() > 0) {
                JSONArray jSONArray = new JSONArray();
                for (int i11 = 0; i11 < list.size(); i11++) {
                    com.mbridge.msdk.newreward.function.d.a.b a11 = list.get(i11).a();
                    if (a11 != null) {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("ecppv", x.b(a11.q() + ""));
                        jSONObject2.put("showCount", a11.r());
                        jSONObject2.put("intervalTime", System.currentTimeMillis() - a11.G());
                        jSONArray.put(jSONObject2);
                    }
                }
                dVar.a(DataSchemeDataSource.SCHEME_DATA, jSONArray.toString());
            }
            if (bVar != null) {
                bVar.a("m_candidate_data");
                bVar.k("m_candidate_data");
                bVar.a("m_candidate_data", dVar);
                if (bVar2 != null && bVar2.a() != null && eVar != null) {
                    bVar.b(eVar.x().a());
                }
            }
            c cVar3 = this.f14454b;
            cVar3.a(eVar, com.mbridge.msdk.newreward.function.c.e.METRICS_KEY_M_CANDIDATE_DATE, cVar3.a("metrics_data", dVar));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}
