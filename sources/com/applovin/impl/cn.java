package com.applovin.impl;

import com.applovin.impl.aq;
import com.applovin.impl.tm;
import com.applovin.sdk.AppLovinAdLoadListener;
import java.util.HashSet;

/* loaded from: classes3.dex */
class cn extends yl {

    /* renamed from: h, reason: collision with root package name */
    private final eq f23340h;

    /* renamed from: i, reason: collision with root package name */
    private final AppLovinAdLoadListener f23341i;

    public cn(eq eqVar, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.j jVar) {
        super("TaskRenderVastAd", jVar);
        this.f23341i = appLovinAdLoadListener;
        this.f23340h = eqVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (com.applovin.impl.sdk.n.a()) {
            this.f28218c.a(this.f28217b, "Rendering VAST ad...");
        }
        int size = this.f23340h.a().size();
        HashSet hashSet = new HashSet(size);
        HashSet hashSet2 = new HashSet(size);
        String str = "";
        jq jqVar = null;
        nq nqVar = null;
        dq dqVar = null;
        cq cqVar = null;
        String str2 = "";
        for (es esVar : this.f23340h.a()) {
            es b2 = esVar.b(mq.b(esVar) ? "Wrapper" : "InLine");
            if (b2 != null) {
                es b3 = b2.b("AdSystem");
                if (b3 != null) {
                    jqVar = jq.a(b3, jqVar, this.f28216a);
                }
                str = mq.a(b2, "AdTitle", str);
                str2 = mq.a(b2, "Description", str2);
                mq.a(b2.a("Impression"), hashSet, this.f23340h, this.f28216a);
                es c2 = b2.c("ViewableImpression");
                if (c2 != null) {
                    mq.a(c2.a("Viewable"), hashSet, this.f23340h, this.f28216a);
                }
                es b4 = b2.b("AdVerifications");
                if (b4 != null) {
                    cqVar = cq.a(b4, cqVar, this.f23340h, this.f28216a);
                }
                mq.a(b2.a("Error"), hashSet2, this.f23340h, this.f28216a);
                es c3 = b2.c("Creatives");
                if (c3 != null) {
                    for (es esVar2 : c3.b()) {
                        es c4 = esVar2.c("Linear");
                        if (c4 != null) {
                            nqVar = nq.a(c4, nqVar, this.f23340h, this.f28216a);
                        } else {
                            es b5 = esVar2.b("CompanionAds");
                            if (b5 != null) {
                                es b6 = b5.b("Companion");
                                if (b6 != null) {
                                    dqVar = dq.a(b6, dqVar, this.f23340h, this.f28216a);
                                }
                            } else if (com.applovin.impl.sdk.n.a()) {
                                this.f28218c.b(this.f28217b, "Received and will skip rendering for an unidentified creative: " + esVar2);
                            }
                        }
                    }
                }
            } else if (com.applovin.impl.sdk.n.a()) {
                this.f28218c.b(this.f28217b, "Did not find wrapper or inline response for node: " + esVar);
            }
        }
        aq a2 = new aq.b().a(this.f28216a).a(this.f23340h.b()).b(this.f23340h.e()).a(this.f23340h.c()).b(str).a(str2).a(jqVar).a(nqVar).a(dqVar).a(cqVar).b(hashSet).a(cqVar).a(hashSet2).a();
        fq c5 = mq.c(a2);
        if (c5 != null) {
            mq.a(this.f23340h, this.f23341i, c5, -6, this.f28216a);
            return;
        }
        if (com.applovin.impl.sdk.n.a()) {
            this.f28218c.a(this.f28217b, "Finished rendering VAST ad: " + a2);
        }
        a2.getAdEventTracker().e();
        this.f28216a.j0().a((yl) new dm(a2, this.f28216a, this.f23341i), tm.b.CACHING);
    }
}
