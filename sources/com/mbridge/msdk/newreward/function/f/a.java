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
import com.mbridge.msdk.newreward.function.common.MBridgeError;
import com.mbridge.msdk.newreward.function.common.MBridgeGlobalCommon;
import com.mbridge.msdk.newreward.function.common.MBridgeSharedPreferenceModel;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private com.mbridge.msdk.newreward.function.d.a.b f17303a;
    private com.mbridge.msdk.newreward.a.e b;

    private boolean a(com.mbridge.msdk.newreward.function.d.a.a aVar) {
        CampaignEx g9;
        if (aVar != null && (g9 = aVar.g()) != null) {
            try {
                if (g9.getPlayable_ads_without_video() == 2) {
                    return true;
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    public final com.mbridge.msdk.newreward.function.d.a.b b() {
        return this.f17303a;
    }

    public final boolean c() {
        com.mbridge.msdk.newreward.function.d.a.b bVar = this.f17303a;
        return bVar != null && bVar.y();
    }

    public final void b(com.mbridge.msdk.newreward.function.d.a.b bVar) throws MBridgeError {
        boolean z8;
        if (bVar != null && bVar.s() != null) {
            for (com.mbridge.msdk.newreward.function.d.a.a aVar : bVar.s()) {
                CampaignEx g9 = aVar.g();
                if (g9 != null && g9.getOfferType() != 99) {
                    if (a(aVar)) {
                        z8 = (an.a(g9.getendcard_url()) && TextUtils.isEmpty(g9.getMraid())) ? false : true;
                        if (aVar.f() == null && aVar.e() == null) {
                            throw new MBridgeError(880003, "playable offer endcard or mraid is null");
                        }
                    } else {
                        z8 = !an.a(g9.getVideoUrlEncode());
                        if (aVar.d() == null) {
                            throw new MBridgeError(880003, "No video campaign");
                        }
                    }
                    if (z8) {
                        Context c9 = com.mbridge.msdk.foundation.controller.c.m().c();
                        if (com.mbridge.msdk.e.b.a() && ai.c(g9)) {
                            g9.setRtinsType(ai.c(c9, g9.getPackageName()) ? 1 : 2);
                        }
                        try {
                            com.mbridge.msdk.foundation.same.report.d.b b = com.mbridge.msdk.foundation.same.report.d.c.a().b(g9.getLocalRequestId());
                            if (b == null) {
                                b = new com.mbridge.msdk.foundation.same.report.d.b();
                                b.c(g9.getLocalRequestId());
                                b.b(g9.getAdType());
                                b.d(g9.getCampaignUnitId());
                                b.i(g9.isBidCampaign() ? "1" : "0");
                            }
                            b.a(g9);
                            com.mbridge.msdk.newreward.a.e eVar = this.b;
                            if (eVar != null && eVar.r() != null) {
                                com.mbridge.msdk.videocommon.d.a a6 = this.b.r().a();
                                if (a6 != null) {
                                    b.h(a6.b());
                                    b.f(a6.c());
                                }
                                com.mbridge.msdk.videocommon.d.c b8 = this.b.r().b();
                                if (b8 != null) {
                                    b.g(b8.l());
                                    b.n(b8.k());
                                }
                            }
                            com.mbridge.msdk.foundation.same.c.a(g9, com.mbridge.msdk.foundation.controller.c.m().c(), b, new c.a() { // from class: com.mbridge.msdk.newreward.function.f.a.1
                                @Override // com.mbridge.msdk.foundation.same.c.a
                                public final void a(String str, com.mbridge.msdk.foundation.same.report.d.b bVar2) {
                                    com.mbridge.msdk.foundation.same.report.d.c.a().a(str, bVar2);
                                }
                            });
                        } catch (Exception e4) {
                            if (MBridgeConstans.DEBUG) {
                                e4.printStackTrace();
                            }
                        }
                        if (!com.mbridge.msdk.foundation.same.c.a(c9, g9)) {
                            ai.a(bVar.c(), g9, com.mbridge.msdk.foundation.same.a.f15696x);
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
        Context c9 = com.mbridge.msdk.foundation.controller.c.m().c();
        j a6 = j.a(g.a(c9));
        Iterator<com.mbridge.msdk.newreward.function.d.a.a> it = bVar.s().iterator();
        while (it.hasNext()) {
            CampaignEx g9 = it.next().g();
            if (g9 != null) {
                if (com.mbridge.msdk.e.b.a()) {
                    if (!ai.c(c9, g9.getPackageName())) {
                        a(a6, g9);
                    }
                } else {
                    a(a6, g9);
                }
            }
        }
    }

    public final List<CampaignEx> a() {
        com.mbridge.msdk.newreward.function.d.a.b bVar = this.f17303a;
        if (bVar == null) {
            return null;
        }
        return bVar.C();
    }

    public final void a(com.mbridge.msdk.newreward.function.d.a.b bVar) {
        this.f17303a = bVar;
    }

    public final void a(com.mbridge.msdk.newreward.a.e eVar, com.mbridge.msdk.newreward.function.g.a aVar, com.mbridge.msdk.newreward.a.b.b bVar) {
        this.b = eVar;
        try {
            new com.mbridge.msdk.newreward.a.b.c(eVar).a(aVar, new C0178a(eVar, this, bVar));
        } catch (IOException e4) {
            if (bVar != null) {
                bVar.a(new com.mbridge.msdk.foundation.c.b(880020, e4.getMessage()));
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
    /* loaded from: classes3.dex */
    public static final class C0178a implements com.mbridge.msdk.newreward.a.b.b {

        /* renamed from: a, reason: collision with root package name */
        private com.mbridge.msdk.newreward.a.e f17305a;
        private a b;

        /* renamed from: c, reason: collision with root package name */
        private com.mbridge.msdk.newreward.a.b.b f17306c;

        public C0178a(com.mbridge.msdk.newreward.a.e eVar, a aVar, com.mbridge.msdk.newreward.a.b.b bVar) {
            this.f17305a = eVar;
            this.b = aVar;
            this.f17306c = bVar;
        }

        @Override // com.mbridge.msdk.newreward.a.b.b
        public final void a(Object obj) {
            try {
                com.mbridge.msdk.newreward.function.d.a.b bVar = (com.mbridge.msdk.newreward.function.d.a.b) obj;
                bVar.b(this.f17305a.z());
                int J8 = (int) (this.f17305a.J() * 1.2d);
                bVar.d(J8);
                bVar.e(J8);
                bVar.b(Math.max(this.f17305a.L(), bVar.n()));
                this.b.a(bVar);
                if (!TextUtils.isEmpty(bVar.i())) {
                    MBridgeGlobalCommon.SESSION_ID = bVar.i();
                }
                MBridgeSharedPreferenceModel.getInstance().putInteger("vcn_" + bVar.c(), bVar.D());
                com.mbridge.msdk.newreward.function.e.c.a().b().a(bVar);
                com.mbridge.msdk.newreward.a.b.b bVar2 = this.f17306c;
                if (bVar2 == null) {
                    return;
                }
                bVar2.a(obj);
            } catch (Exception e4) {
                ad.b("CampaignModel", "reqSuccessful: ", e4);
                com.mbridge.msdk.newreward.a.b.b bVar3 = this.f17306c;
                if (bVar3 != null) {
                    bVar3.a(new com.mbridge.msdk.foundation.c.b(880020, e4.getMessage()));
                }
            }
        }

        @Override // com.mbridge.msdk.newreward.a.b.b
        public final void a(com.mbridge.msdk.foundation.c.b bVar) {
            com.mbridge.msdk.newreward.a.b.b bVar2 = this.f17306c;
            if (bVar2 == null) {
                return;
            }
            try {
                bVar2.a(bVar);
            } catch (Exception e4) {
                ad.b("CampaignModel", "reqFailed: ", e4);
            }
        }
    }
}
