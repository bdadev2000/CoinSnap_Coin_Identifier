package com.mbridge.msdk.newreward.function.f;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.db.g;
import com.mbridge.msdk.foundation.db.j;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.c;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.foundation.tools.an;
import com.mbridge.msdk.newreward.function.common.MBridgeCommon;
import com.mbridge.msdk.newreward.function.common.MBridgeError;
import com.mbridge.msdk.newreward.function.common.MBridgeGlobalCommon;
import com.mbridge.msdk.newreward.function.common.MBridgeSharedPreferenceModel;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public final class a {
    private com.mbridge.msdk.newreward.function.d.a.b a;

    /* renamed from: b, reason: collision with root package name */
    private com.mbridge.msdk.newreward.a.e f14678b;

    private boolean a(com.mbridge.msdk.newreward.function.d.a.a aVar) {
        CampaignEx g10;
        if (aVar != null && (g10 = aVar.g()) != null) {
            try {
                if (g10.getPlayable_ads_without_video() == 2) {
                    return true;
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    public final com.mbridge.msdk.newreward.function.d.a.b b() {
        return this.a;
    }

    public final boolean c() {
        com.mbridge.msdk.newreward.function.d.a.b bVar = this.a;
        return bVar != null && bVar.y();
    }

    public final void b(com.mbridge.msdk.newreward.function.d.a.b bVar) throws MBridgeError {
        boolean z10;
        if (bVar != null && bVar.s() != null) {
            for (com.mbridge.msdk.newreward.function.d.a.a aVar : bVar.s()) {
                CampaignEx g10 = aVar.g();
                if (g10 != null && g10.getOfferType() != 99) {
                    if (a(aVar)) {
                        z10 = (an.a(g10.getendcard_url()) && TextUtils.isEmpty(g10.getMraid())) ? false : true;
                        if (aVar.f() == null && aVar.e() == null) {
                            throw new MBridgeError(880003, "playable offer endcard or mraid is null");
                        }
                    } else {
                        z10 = !an.a(g10.getVideoUrlEncode());
                        if (aVar.d() == null) {
                            throw new MBridgeError(880003, "No video campaign");
                        }
                    }
                    if (z10) {
                        Context c10 = com.mbridge.msdk.foundation.controller.c.m().c();
                        if (com.mbridge.msdk.e.b.a() && ai.c(g10)) {
                            g10.setRtinsType(ai.c(c10, g10.getPackageName()) ? 1 : 2);
                        }
                        try {
                            com.mbridge.msdk.foundation.same.report.d.b b3 = com.mbridge.msdk.foundation.same.report.d.c.a().b(g10.getLocalRequestId());
                            if (b3 == null) {
                                b3 = new com.mbridge.msdk.foundation.same.report.d.b();
                                b3.c(g10.getLocalRequestId());
                                b3.b(g10.getAdType());
                                b3.d(g10.getCampaignUnitId());
                                b3.i(g10.isBidCampaign() ? "1" : "0");
                            }
                            b3.a(g10);
                            com.mbridge.msdk.newreward.a.e eVar = this.f14678b;
                            if (eVar != null && eVar.r() != null) {
                                com.mbridge.msdk.videocommon.d.a a = this.f14678b.r().a();
                                if (a != null) {
                                    b3.h(a.b());
                                    b3.f(a.c());
                                }
                                com.mbridge.msdk.videocommon.d.c b10 = this.f14678b.r().b();
                                if (b10 != null) {
                                    b3.g(b10.l());
                                    b3.n(b10.k());
                                }
                            }
                            com.mbridge.msdk.foundation.same.c.a(g10, com.mbridge.msdk.foundation.controller.c.m().c(), b3, new c.a() { // from class: com.mbridge.msdk.newreward.function.f.a.1
                                @Override // com.mbridge.msdk.foundation.same.c.a
                                public final void a(String str, com.mbridge.msdk.foundation.same.report.d.b bVar2) {
                                    com.mbridge.msdk.foundation.same.report.d.c.a().a(str, bVar2);
                                }
                            });
                        } catch (Exception e2) {
                            if (MBridgeConstans.DEBUG) {
                                e2.printStackTrace();
                            }
                        }
                        if (!com.mbridge.msdk.foundation.same.c.a(c10, g10)) {
                            ai.a(bVar.c(), g10, com.mbridge.msdk.foundation.same.a.f13292x);
                            throw new MBridgeError(880021, "APP ALREADY INSTALLED");
                        }
                    } else {
                        continue;
                    }
                }
            }
            return;
        }
        throw new MBridgeError(880003, "Need show campaign list is NULL!");
    }

    public final void c(com.mbridge.msdk.newreward.function.d.a.b bVar) {
        if (bVar == null || bVar.s() == null) {
            return;
        }
        Context c10 = com.mbridge.msdk.foundation.controller.c.m().c();
        j a = j.a(g.a(c10));
        Iterator<com.mbridge.msdk.newreward.function.d.a.a> it = bVar.s().iterator();
        while (it.hasNext()) {
            CampaignEx g10 = it.next().g();
            if (g10 != null) {
                if (com.mbridge.msdk.e.b.a()) {
                    if (!ai.c(c10, g10.getPackageName())) {
                        a(a, g10);
                    }
                } else {
                    a(a, g10);
                }
            }
        }
    }

    public final List<CampaignEx> a() {
        com.mbridge.msdk.newreward.function.d.a.b bVar = this.a;
        if (bVar == null) {
            return null;
        }
        return bVar.C();
    }

    public final void a(com.mbridge.msdk.newreward.function.d.a.b bVar) {
        this.a = bVar;
    }

    public final void a(com.mbridge.msdk.newreward.a.e eVar, com.mbridge.msdk.newreward.function.g.a aVar, com.mbridge.msdk.newreward.a.b.b bVar) {
        this.f14678b = eVar;
        try {
            new com.mbridge.msdk.newreward.a.b.c(eVar).a(aVar, new C0190a(eVar, this, bVar));
        } catch (IOException e2) {
            if (bVar != null) {
                bVar.a(new com.mbridge.msdk.foundation.c.b(880020, e2.getMessage()));
            }
        }
    }

    private void a(j jVar, CampaignEx campaignEx) {
        if (jVar == null || jVar.b(campaignEx.getId())) {
            return;
        }
        com.mbridge.msdk.foundation.entity.g gVar = new com.mbridge.msdk.foundation.entity.g();
        gVar.a(campaignEx.getId());
        gVar.b(campaignEx.getFca());
        gVar.c(campaignEx.getFcb());
        gVar.a(0);
        gVar.d(0);
        gVar.a(System.currentTimeMillis());
        jVar.a(gVar);
    }

    /* renamed from: com.mbridge.msdk.newreward.function.f.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0190a implements com.mbridge.msdk.newreward.a.b.b {
        private com.mbridge.msdk.newreward.a.e a;

        /* renamed from: b, reason: collision with root package name */
        private a f14679b;

        /* renamed from: c, reason: collision with root package name */
        private com.mbridge.msdk.newreward.a.b.b f14680c;

        public C0190a(com.mbridge.msdk.newreward.a.e eVar, a aVar, com.mbridge.msdk.newreward.a.b.b bVar) {
            this.a = eVar;
            this.f14679b = aVar;
            this.f14680c = bVar;
        }

        @Override // com.mbridge.msdk.newreward.a.b.b
        public final void a(Object obj) {
            try {
                com.mbridge.msdk.newreward.function.d.a.b bVar = (com.mbridge.msdk.newreward.function.d.a.b) obj;
                bVar.b(this.a.z());
                int J = (int) (this.a.J() * 1.2d);
                bVar.d(J);
                bVar.e(J);
                bVar.b(Math.max(this.a.L(), bVar.n()));
                this.f14679b.a(bVar);
                if (!TextUtils.isEmpty(bVar.i())) {
                    MBridgeGlobalCommon.SESSION_ID = bVar.i();
                }
                MBridgeSharedPreferenceModel.getInstance().putInteger(String.format(MBridgeCommon.SharedPreference.KEY_VCN, bVar.c()), bVar.D());
                com.mbridge.msdk.newreward.function.e.c.a().b().a(bVar);
                com.mbridge.msdk.newreward.a.b.b bVar2 = this.f14680c;
                if (bVar2 == null) {
                    return;
                }
                bVar2.a(obj);
            } catch (Exception e2) {
                ad.b("CampaignModel", "reqSuccessful: ", e2);
                com.mbridge.msdk.newreward.a.b.b bVar3 = this.f14680c;
                if (bVar3 != null) {
                    bVar3.a(new com.mbridge.msdk.foundation.c.b(880020, e2.getMessage()));
                }
            }
        }

        @Override // com.mbridge.msdk.newreward.a.b.b
        public final void a(com.mbridge.msdk.foundation.c.b bVar) {
            com.mbridge.msdk.newreward.a.b.b bVar2 = this.f14680c;
            if (bVar2 == null) {
                return;
            }
            try {
                bVar2.a(bVar);
            } catch (Exception e2) {
                ad.b("CampaignModel", "reqFailed: ", e2);
            }
        }
    }
}
