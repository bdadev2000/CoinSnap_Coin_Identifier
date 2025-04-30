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

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static String f17057a = "RewardCandidateController";
    private final c b;

    /* renamed from: c, reason: collision with root package name */
    private com.mbridge.msdk.newreward.function.a.c f17058c;

    public a(String str, boolean z8, c cVar) {
        this.b = cVar;
        try {
            com.mbridge.msdk.newreward.function.a.c a6 = com.mbridge.msdk.newreward.function.a.a.a.a().a(str, b.a().a(com.mbridge.msdk.foundation.controller.c.m().k(), str, z8).G());
            this.f17058c = a6;
            a6.a(cVar);
        } catch (Exception e4) {
            e4.printStackTrace();
        }
    }

    private List<com.mbridge.msdk.newreward.function.d.a.b> b(List<com.mbridge.msdk.newreward.function.d.a.b> list, com.mbridge.msdk.newreward.function.a.b bVar) {
        List<com.mbridge.msdk.newreward.function.d.a.a> s5;
        if (list != null && list.size() != 0) {
            ArrayList arrayList = new ArrayList();
            for (int i9 = 0; i9 < list.size(); i9++) {
                com.mbridge.msdk.newreward.function.d.a.b bVar2 = list.get(i9);
                if (bVar2 != null && (s5 = bVar2.s()) != null && s5.size() != 0) {
                    arrayList.add(bVar2);
                }
            }
            return arrayList;
        }
        return list;
    }

    public final com.mbridge.msdk.newreward.function.a.b a(com.mbridge.msdk.foundation.same.report.d.b bVar, com.mbridge.msdk.foundation.c.b bVar2, e eVar, int i9) {
        String str;
        int i10;
        CampaignEx campaignEx;
        String str2;
        String requestId;
        int i11;
        String str3;
        String str4;
        com.mbridge.msdk.newreward.function.a.b a6;
        com.mbridge.msdk.newreward.function.a.b bVar3 = new com.mbridge.msdk.newreward.function.a.b();
        if (eVar == null) {
            str = "";
            str2 = null;
            i10 = 94;
            campaignEx = null;
        } else {
            try {
                String C8 = eVar.C();
                CampaignEx campaignEx2 = (eVar.x() == null || eVar.x().b() == null || eVar.x().b().C() == null || eVar.x().b().C().size() <= 0) ? null : eVar.x().b().C().get(0);
                if (this.f17058c == null) {
                    str = "";
                    i10 = 94;
                    campaignEx = campaignEx2;
                } else {
                    int p2 = eVar.p();
                    String w2 = eVar.w();
                    this.f17058c.a(p2);
                    this.f17058c.f(w2);
                    this.f17058c.a(eVar);
                    i10 = p2;
                    campaignEx = campaignEx2;
                    str = w2;
                }
                str2 = C8;
            } catch (Exception unused) {
                bVar3.d("getCandidateCampaignList result exception");
                bVar3.a(com.mbridge.msdk.foundation.b.c.f15352c);
                return bVar3;
            }
        }
        if (campaignEx == null) {
            requestId = "";
        } else {
            try {
                requestId = campaignEx.getRequestId();
            } catch (Exception unused2) {
                bVar3.d("getRewardCandidateCampaignList result exception");
                bVar3.a(com.mbridge.msdk.foundation.b.c.f15352c);
                return bVar3;
            }
        }
        if (bVar2 != null) {
            i11 = bVar2.f();
            str3 = bVar2.b();
        } else {
            i11 = 0;
            str3 = null;
        }
        com.mbridge.msdk.newreward.function.a.c cVar = this.f17058c;
        if (cVar == null) {
            a6 = new com.mbridge.msdk.newreward.function.a.b();
            a6.d("can not get manager");
            a6.a(com.mbridge.msdk.foundation.b.c.f15352c);
        } else {
            com.mbridge.msdk.newreward.function.a.b c9 = cVar.c(str2);
            if (c9.h() > com.mbridge.msdk.foundation.b.c.b) {
                return c9;
            }
            String[] split = x.a(str2.split("_")[3]).split("\\|");
            double parseDouble = Double.parseDouble(split[0]);
            if (split.length <= 1) {
                str4 = "";
            } else {
                str4 = split[1];
            }
            a6 = a(parseDouble, str4, bVar, str2, eVar, i9, i10, str);
            if (a6 != null && a6.a() != null) {
                this.f17058c.a(a6.a().s(), bVar, requestId, i11, str3, i9, parseDouble);
            }
        }
        return a6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v6 */
    private com.mbridge.msdk.newreward.function.a.b a(double d2, String str, com.mbridge.msdk.foundation.same.report.d.b bVar, String str2, e eVar, int i9, int i10, String str3) {
        JSONObject jSONObject;
        com.mbridge.msdk.newreward.function.a.b bVar2;
        ArrayList arrayList;
        int i11;
        JSONObject jSONObject2;
        List<com.mbridge.msdk.newreward.function.d.a.a> s5;
        com.mbridge.msdk.newreward.function.a.b bVar3 = this;
        com.mbridge.msdk.newreward.function.a.b a6 = bVar3.f17058c.a();
        try {
        } catch (Exception unused) {
            bVar3 = a6;
        }
        if (a6.h() > 0) {
            return a6;
        }
        JSONObject a9 = bVar3.f17058c.a(str);
        try {
            if (a9 != null) {
                int optInt = a9.optInt("max_usage_limit", 10);
                if (a9.optInt("max_cache_num", 20) > 0) {
                    List<com.mbridge.msdk.newreward.function.d.a.b> a10 = bVar3.f17058c.a(optInt, i10, str3);
                    if (a10 != null && a10.size() > 0) {
                        com.mbridge.msdk.newreward.function.a.b bVar4 = new com.mbridge.msdk.newreward.function.a.b();
                        if (a10.size() == 0) {
                            bVar4.d("candidate is null");
                            bVar4.a(com.mbridge.msdk.foundation.b.c.f15352c);
                        } else {
                            for (int i12 = 0; i12 < a10.size(); i12++) {
                                com.mbridge.msdk.newreward.function.d.a.b bVar5 = a10.get(i12);
                                if (bVar5 != null) {
                                    bVar4.a(bVar5.d());
                                }
                            }
                            if (a10.size() > 0) {
                                if (a10.size() != 0) {
                                    ArrayList arrayList2 = new ArrayList();
                                    for (int i13 = 0; i13 < a10.size(); i13++) {
                                        com.mbridge.msdk.newreward.function.d.a.b bVar6 = a10.get(i13);
                                        if (bVar6 != null && (s5 = bVar6.s()) != null && s5.size() != 0) {
                                            int i14 = 0;
                                            boolean z8 = false;
                                            while (true) {
                                                if (i14 >= s5.size()) {
                                                    break;
                                                }
                                                com.mbridge.msdk.newreward.function.d.a.a aVar = s5.get(i14);
                                                boolean c9 = ai.c(com.mbridge.msdk.foundation.controller.c.m().c(), aVar.g().getPackageName());
                                                if (c9) {
                                                    bVar4.c(bVar6.d());
                                                    com.mbridge.msdk.newreward.function.a.c cVar = bVar3.f17058c;
                                                    if (cVar != null) {
                                                        cVar.a(bVar6.e(), bVar6.d(), 2, aVar.h().q());
                                                    }
                                                    z8 = c9;
                                                } else {
                                                    i14++;
                                                    z8 = c9;
                                                }
                                            }
                                            if (!z8) {
                                                arrayList2.add(bVar6);
                                            }
                                        }
                                    }
                                    a10 = arrayList2;
                                }
                                if (a10.size() == 0) {
                                    bVar4.d("existed");
                                    bVar4.a(com.mbridge.msdk.foundation.b.c.f15352c);
                                }
                            }
                            if (a10.size() > 0 && ((a10 = bVar3.a(a10, bVar4)) == null || a10.size() == 0)) {
                                bVar4.d("not ready");
                                bVar4.a(com.mbridge.msdk.foundation.b.c.f15352c);
                            }
                            if (a10.size() > 0 && ((a10 = bVar3.b(a10, bVar4)) == null || a10.size() == 0)) {
                                bVar4.d("had in cache");
                                bVar4.a(com.mbridge.msdk.foundation.b.c.f15352c);
                            }
                            if (a10 == null || a10.size() <= 0) {
                                jSONObject = a9;
                                bVar2 = a6;
                                arrayList = null;
                            } else {
                                ArrayList arrayList3 = new ArrayList();
                                double optDouble = a9.optDouble("t_disc", 0.8d);
                                double optDouble2 = a9.optDouble("u_disc", 0.95d);
                                double optDouble3 = a9.optDouble("max_ecppv_diff", 0.0d);
                                int optInt2 = a9.optInt("time_interval", 1800);
                                int size = a10.size();
                                double d9 = 0.0d;
                                com.mbridge.msdk.newreward.function.d.a.b bVar7 = null;
                                int i15 = 0;
                                while (i15 < size) {
                                    com.mbridge.msdk.newreward.function.d.a.b bVar8 = a10.get(i15);
                                    if (bVar8 != null) {
                                        bVar2 = a6;
                                        i11 = size;
                                        jSONObject2 = a9;
                                        try {
                                            double pow = Math.pow(optDouble2, bVar8.r()) * bVar8.q() * Math.pow(optDouble, (System.currentTimeMillis() - bVar8.G()) / (optInt2 * 1000.0d));
                                            arrayList3.add(new a.C0174a(pow, bVar8));
                                            if (pow >= d2 - optDouble3 && pow > d9) {
                                                d9 = pow;
                                                bVar7 = bVar8;
                                            }
                                        } catch (Exception unused2) {
                                            bVar3 = bVar2;
                                            bVar3.d("getHighestCampaigns exception");
                                            bVar3.a(com.mbridge.msdk.foundation.b.c.f15352c);
                                            return bVar3;
                                        }
                                    } else {
                                        i11 = size;
                                        jSONObject2 = a9;
                                        bVar2 = a6;
                                    }
                                    i15++;
                                    a9 = jSONObject2;
                                    size = i11;
                                    a6 = bVar2;
                                }
                                jSONObject = a9;
                                bVar2 = a6;
                                if (bVar7 != null) {
                                    bVar4.a(bVar7);
                                    bVar4.a(com.mbridge.msdk.foundation.b.c.f15353d);
                                } else {
                                    bVar4.d("no match campaign");
                                    bVar4.a(com.mbridge.msdk.foundation.b.c.f15352c);
                                }
                                arrayList = arrayList3;
                            }
                            a(bVar, str2, bVar4, arrayList, jSONObject, eVar, i9);
                        }
                        return bVar4;
                    }
                    com.mbridge.msdk.newreward.function.a.b bVar9 = a6;
                    bVar9.d("no cache");
                    bVar9.a(com.mbridge.msdk.foundation.b.c.f15352c);
                    a(bVar, str2, bVar9, null, a9, eVar, 2);
                    bVar3 = bVar9;
                } else {
                    com.mbridge.msdk.newreward.function.a.b bVar10 = a6;
                    bVar10.d("max cache num error");
                    bVar10.a(com.mbridge.msdk.foundation.b.c.f15352c);
                    bVar3 = bVar10;
                }
            } else {
                com.mbridge.msdk.newreward.function.a.b bVar11 = a6;
                bVar11.d("setting config not mapping");
                bVar11.a(com.mbridge.msdk.foundation.b.c.f15352c);
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
        for (int i9 = 0; i9 < list.size(); i9++) {
            com.mbridge.msdk.newreward.function.d.a.b bVar2 = list.get(i9);
            if (bVar2 != null && (s5 = bVar2.s()) != null && s5.size() != 0) {
                int i10 = 0;
                boolean z8 = false;
                while (true) {
                    if (i10 >= s5.size()) {
                        break;
                    }
                    com.mbridge.msdk.newreward.function.d.a.a aVar = s5.get(i10);
                    boolean y4 = aVar.h().y();
                    if (y4) {
                        i10++;
                        z8 = y4;
                    } else {
                        bVar.b(bVar2.d());
                        com.mbridge.msdk.newreward.function.a.c cVar = this.f17058c;
                        if (cVar != null) {
                            cVar.a(bVar2.e(), bVar2.d(), 2, aVar.h().q());
                        }
                        z8 = y4;
                    }
                }
                if (z8) {
                    arrayList.add(bVar2);
                }
            }
        }
        return arrayList;
    }

    public final boolean a(String str) {
        JSONObject a6;
        try {
            com.mbridge.msdk.newreward.function.a.c cVar = this.f17058c;
            if (cVar != null && (a6 = cVar.a(cVar.b(str))) != null) {
                return a6.optInt("c_cb", 0) == 1;
            }
        } catch (Exception e4) {
            e4.printStackTrace();
        }
        return false;
    }

    public final void a(com.mbridge.msdk.foundation.same.report.d.b bVar, String str, com.mbridge.msdk.newreward.function.a.b bVar2, List<a.C0174a> list, JSONObject jSONObject, e eVar, int i9) {
        String str2;
        try {
            d dVar = new d();
            if (i9 == 1) {
                str2 = "cb";
            } else if (i9 == 2) {
                str2 = "candidate";
            } else if (i9 != 3) {
                str2 = AppLovinMediationProvider.UNKNOWN;
            } else {
                str2 = "track";
            }
            dVar.a("scene", str2);
            com.mbridge.msdk.newreward.function.a.c cVar = this.f17058c;
            if (cVar != null) {
                double d2 = cVar.d(str);
                if (d2 >= 0.0d) {
                    dVar.a("bp", x.b(d2 + ""));
                }
                dVar.a("cb_state", a(str) ? q.OPEN : "close");
                try {
                    com.mbridge.msdk.newreward.function.a.c cVar2 = this.f17058c;
                    JSONObject a6 = cVar2.a(cVar2.b(str));
                    if (a6 != null) {
                        dVar.a("config", a6.toString());
                    }
                } catch (Exception e4) {
                    e4.printStackTrace();
                }
            }
            if (bVar2 != null) {
                if (bVar2.h() == com.mbridge.msdk.foundation.b.c.f15353d) {
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
                for (int i10 = 0; i10 < list.size(); i10++) {
                    com.mbridge.msdk.newreward.function.d.a.b a9 = list.get(i10).a();
                    if (a9 != null) {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("ecppv", x.b(a9.q() + ""));
                        jSONObject2.put("showCount", a9.r());
                        jSONObject2.put("intervalTime", System.currentTimeMillis() - a9.G());
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
            c cVar3 = this.b;
            cVar3.a(eVar, com.mbridge.msdk.newreward.function.c.e.METRICS_KEY_M_CANDIDATE_DATE, cVar3.a("metrics_data", dVar));
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }
}
