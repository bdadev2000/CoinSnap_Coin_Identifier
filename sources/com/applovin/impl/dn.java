package com.applovin.impl;

import com.applovin.impl.bq;
import com.applovin.impl.sm;
import com.applovin.sdk.AppLovinAdLoadListener;
import java.util.HashSet;

/* loaded from: classes.dex */
class dn extends xl {

    /* renamed from: h, reason: collision with root package name */
    private final fq f7335h;

    /* renamed from: i, reason: collision with root package name */
    private final AppLovinAdLoadListener f7336i;

    public dn(fq fqVar, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.k kVar) {
        super("TaskRenderVastAd", kVar);
        this.f7336i = appLovinAdLoadListener;
        this.f7335h = fqVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        String str;
        if (com.applovin.impl.sdk.t.a()) {
            this.f12279c.a(this.b, "Rendering VAST ad...");
        }
        int size = this.f7335h.a().size();
        HashSet hashSet = new HashSet(size);
        HashSet hashSet2 = new HashSet(size);
        String str2 = "";
        kq kqVar = null;
        oq oqVar = null;
        eq eqVar = null;
        dq dqVar = null;
        String str3 = "";
        for (fs fsVar : this.f7335h.a()) {
            if (nq.b(fsVar)) {
                str = "Wrapper";
            } else {
                str = "InLine";
            }
            fs b = fsVar.b(str);
            if (b != null) {
                fs b8 = b.b("AdSystem");
                if (b8 != null) {
                    kqVar = kq.a(b8, kqVar, this.f12278a);
                }
                str2 = nq.a(b, "AdTitle", str2);
                str3 = nq.a(b, "Description", str3);
                nq.a(b.a("Impression"), hashSet, this.f7335h, this.f12278a);
                fs c9 = b.c("ViewableImpression");
                if (c9 != null) {
                    nq.a(c9.a("Viewable"), hashSet, this.f7335h, this.f12278a);
                }
                fs b9 = b.b("AdVerifications");
                if (b9 != null) {
                    dqVar = dq.a(b9, dqVar, this.f7335h, this.f12278a);
                }
                nq.a(b.a("Error"), hashSet2, this.f7335h, this.f12278a);
                fs c10 = b.c("Creatives");
                if (c10 != null) {
                    for (fs fsVar2 : c10.b()) {
                        fs c11 = fsVar2.c("Linear");
                        if (c11 != null) {
                            oqVar = oq.a(c11, oqVar, this.f7335h, this.f12278a);
                        } else {
                            fs b10 = fsVar2.b("CompanionAds");
                            if (b10 != null) {
                                fs b11 = b10.b("Companion");
                                if (b11 != null) {
                                    eqVar = eq.a(b11, eqVar, this.f7335h, this.f12278a);
                                }
                            } else if (com.applovin.impl.sdk.t.a()) {
                                this.f12279c.b(this.b, "Received and will skip rendering for an unidentified creative: " + fsVar2);
                            }
                        }
                    }
                }
            } else if (com.applovin.impl.sdk.t.a()) {
                this.f12279c.b(this.b, "Did not find wrapper or inline response for node: " + fsVar);
            }
        }
        bq a6 = new bq.b().a(this.f12278a).a(this.f7335h.b()).b(this.f7335h.e()).a(this.f7335h.c()).b(str2).a(str3).a(kqVar).a(oqVar).a(eqVar).a(dqVar).b(hashSet).a(dqVar).a(hashSet2).a();
        gq c12 = nq.c(a6);
        if (c12 == null) {
            if (com.applovin.impl.sdk.t.a()) {
                this.f12279c.a(this.b, "Finished rendering VAST ad: " + a6);
            }
            a6.getAdEventTracker().e();
            this.f12278a.l0().a((xl) new cm(a6, this.f12278a, this.f7336i), sm.b.CACHING);
            return;
        }
        nq.a(this.f7335h, this.f7336i, c12, -6, this.f12278a);
    }
}
