package com.applovin.impl;

import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdLoadListener;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class in extends xl {

    /* renamed from: h, reason: collision with root package name */
    private final fq f8324h;

    /* renamed from: i, reason: collision with root package name */
    private final AppLovinAdLoadListener f8325i;

    /* loaded from: classes.dex */
    public class a extends en {
        public a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar) {
            super(aVar, kVar);
        }

        @Override // com.applovin.impl.en, com.applovin.impl.b4.e
        public void a(String str, fs fsVar, int i9) {
            this.f12278a.l0().a(bn.a(fsVar, in.this.f8324h, in.this.f8325i, in.this.f12278a));
        }

        @Override // com.applovin.impl.en, com.applovin.impl.b4.e
        public void a(String str, int i9, String str2, fs fsVar) {
            if (com.applovin.impl.sdk.t.a()) {
                this.f12279c.b(this.b, "Unable to resolve VAST wrapper. Server returned " + i9);
            }
            in.this.a(i9);
        }
    }

    public in(fq fqVar, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.k kVar) {
        super("TaskResolveVastWrapper", kVar);
        this.f8325i = appLovinAdLoadListener;
        this.f8324h = fqVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        String a6 = nq.a(this.f8324h);
        if (StringUtils.isValidString(a6)) {
            if (com.applovin.impl.sdk.t.a()) {
                this.f12279c.a(this.b, "Resolving VAST ad with depth " + this.f8324h.d() + " at " + a6);
            }
            try {
                this.f12278a.l0().a(new a(com.applovin.impl.sdk.network.a.a(this.f12278a).b(a6).c("GET").a(fs.f7759f).a(((Integer) this.f12278a.a(oj.f9686U4)).intValue()).c(((Integer) this.f12278a.a(oj.f9693V4)).intValue()).a(false).a(), this.f12278a));
                return;
            } catch (Throwable th) {
                if (com.applovin.impl.sdk.t.a()) {
                    this.f12279c.a(this.b, "Unable to resolve VAST wrapper", th);
                }
                a(-1);
                return;
            }
        }
        if (com.applovin.impl.sdk.t.a()) {
            this.f12279c.b(this.b, "Resolving VAST failed. Could not find resolution URL");
        }
        a(-1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i9) {
        if (com.applovin.impl.sdk.t.a()) {
            this.f12279c.b(this.b, "Failed to resolve VAST wrapper due to error code " + i9);
        }
        if (i9 == -1009) {
            AppLovinAdLoadListener appLovinAdLoadListener = this.f8325i;
            if (appLovinAdLoadListener != null) {
                appLovinAdLoadListener.failedToReceiveAd(i9);
                return;
            }
            return;
        }
        nq.a(this.f8324h, this.f8325i, i9 == -1001 ? gq.TIMED_OUT : gq.GENERAL_WRAPPER_ERROR, i9, this.f12278a);
    }
}
