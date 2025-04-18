package com.applovin.impl;

import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdLoadListener;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class hn extends yl {

    /* renamed from: h, reason: collision with root package name */
    private final eq f24336h;

    /* renamed from: i, reason: collision with root package name */
    private final AppLovinAdLoadListener f24337i;

    /* loaded from: classes.dex */
    public class a extends dn {
        public a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.j jVar) {
            super(aVar, jVar);
        }

        @Override // com.applovin.impl.dn, com.applovin.impl.d4.e
        public void a(String str, es esVar, int i2) {
            this.f28216a.j0().a(zm.a(esVar, hn.this.f24336h, hn.this.f24337i, hn.this.f28216a));
        }

        @Override // com.applovin.impl.dn, com.applovin.impl.d4.e
        public void a(String str, int i2, String str2, es esVar) {
            if (com.applovin.impl.sdk.n.a()) {
                this.f28218c.b(this.f28217b, "Unable to resolve VAST wrapper. Server returned " + i2);
            }
            hn.this.a(i2);
        }
    }

    public hn(eq eqVar, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.j jVar) {
        super("TaskResolveVastWrapper", jVar);
        this.f24337i = appLovinAdLoadListener;
        this.f24336h = eqVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        String a2 = mq.a(this.f24336h);
        if (!StringUtils.isValidString(a2)) {
            if (com.applovin.impl.sdk.n.a()) {
                this.f28218c.b(this.f28217b, "Resolving VAST failed. Could not find resolution URL");
            }
            a(-1);
            return;
        }
        if (com.applovin.impl.sdk.n.a()) {
            this.f28218c.a(this.f28217b, "Resolving VAST ad with depth " + this.f24336h.d() + " at " + a2);
        }
        try {
            this.f28216a.j0().a(new a(com.applovin.impl.sdk.network.a.a(this.f28216a).b(a2).c("GET").a(es.f23752f).a(((Integer) this.f28216a.a(sj.Y4)).intValue()).c(((Integer) this.f28216a.a(sj.Z4)).intValue()).a(false).a(), this.f28216a));
        } catch (Throwable th) {
            if (com.applovin.impl.sdk.n.a()) {
                this.f28218c.a(this.f28217b, "Unable to resolve VAST wrapper", th);
            }
            a(-1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i2) {
        if (com.applovin.impl.sdk.n.a()) {
            this.f28218c.b(this.f28217b, "Failed to resolve VAST wrapper due to error code " + i2);
        }
        if (i2 != -1009) {
            mq.a(this.f24336h, this.f24337i, i2 == -1001 ? fq.TIMED_OUT : fq.GENERAL_WRAPPER_ERROR, i2, this.f28216a);
            return;
        }
        AppLovinAdLoadListener appLovinAdLoadListener = this.f24337i;
        if (appLovinAdLoadListener != null) {
            appLovinAdLoadListener.failedToReceiveAd(i2);
        }
    }
}
