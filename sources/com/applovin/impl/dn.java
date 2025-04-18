package com.applovin.impl;

import com.applovin.impl.bq;
import com.applovin.impl.sm;
import com.applovin.sdk.AppLovinAdLoadListener;
import java.util.HashSet;

/* loaded from: classes.dex */
class dn extends xl {

    /* renamed from: h, reason: collision with root package name */
    private final fq f4345h;

    /* renamed from: i, reason: collision with root package name */
    private final AppLovinAdLoadListener f4346i;

    public dn(fq fqVar, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.k kVar) {
        super("TaskRenderVastAd", kVar);
        this.f4346i = appLovinAdLoadListener;
        this.f4345h = fqVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        String str;
        if (com.applovin.impl.sdk.t.a()) {
            this.f9061c.a(this.f9060b, "Rendering VAST ad...");
        }
        int size = this.f4345h.a().size();
        HashSet hashSet = new HashSet(size);
        HashSet hashSet2 = new HashSet(size);
        String str2 = "";
        kq kqVar = null;
        oq oqVar = null;
        eq eqVar = null;
        dq dqVar = null;
        String str3 = "";
        for (fs fsVar : this.f4345h.a()) {
            if (nq.b(fsVar)) {
                str = "Wrapper";
            } else {
                str = "InLine";
            }
            fs b3 = fsVar.b(str);
            if (b3 != null) {
                fs b10 = b3.b("AdSystem");
                if (b10 != null) {
                    kqVar = kq.a(b10, kqVar, this.a);
                }
                str2 = nq.a(b3, "AdTitle", str2);
                str3 = nq.a(b3, "Description", str3);
                nq.a(b3.a("Impression"), hashSet, this.f4345h, this.a);
                fs c10 = b3.c("ViewableImpression");
                if (c10 != null) {
                    nq.a(c10.a("Viewable"), hashSet, this.f4345h, this.a);
                }
                fs b11 = b3.b("AdVerifications");
                if (b11 != null) {
                    dqVar = dq.a(b11, dqVar, this.f4345h, this.a);
                }
                nq.a(b3.a("Error"), hashSet2, this.f4345h, this.a);
                fs c11 = b3.c("Creatives");
                if (c11 != null) {
                    for (fs fsVar2 : c11.b()) {
                        fs c12 = fsVar2.c("Linear");
                        if (c12 != null) {
                            oqVar = oq.a(c12, oqVar, this.f4345h, this.a);
                        } else {
                            fs b12 = fsVar2.b("CompanionAds");
                            if (b12 != null) {
                                fs b13 = b12.b("Companion");
                                if (b13 != null) {
                                    eqVar = eq.a(b13, eqVar, this.f4345h, this.a);
                                }
                            } else if (com.applovin.impl.sdk.t.a()) {
                                this.f9061c.b(this.f9060b, "Received and will skip rendering for an unidentified creative: " + fsVar2);
                            }
                        }
                    }
                }
            } else if (com.applovin.impl.sdk.t.a()) {
                this.f9061c.b(this.f9060b, "Did not find wrapper or inline response for node: " + fsVar);
            }
        }
        bq a = new bq.b().a(this.a).a(this.f4345h.b()).b(this.f4345h.e()).a(this.f4345h.c()).b(str2).a(str3).a(kqVar).a(oqVar).a(eqVar).a(dqVar).b(hashSet).a(dqVar).a(hashSet2).a();
        gq c13 = nq.c(a);
        if (c13 == null) {
            if (com.applovin.impl.sdk.t.a()) {
                this.f9061c.a(this.f9060b, "Finished rendering VAST ad: " + a);
            }
            a.getAdEventTracker().e();
            this.a.l0().a((xl) new cm(a, this.a, this.f4346i), sm.b.CACHING);
            return;
        }
        nq.a(this.f4345h, this.f4346i, c13, -6, this.a);
    }
}
