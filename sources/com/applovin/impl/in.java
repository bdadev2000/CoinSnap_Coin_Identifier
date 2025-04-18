package com.applovin.impl;

import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdLoadListener;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class in extends xl {

    /* renamed from: h, reason: collision with root package name */
    private final fq f5359h;

    /* renamed from: i, reason: collision with root package name */
    private final AppLovinAdLoadListener f5360i;

    /* loaded from: classes.dex */
    public class a extends en {
        public a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar) {
            super(aVar, kVar);
        }

        @Override // com.applovin.impl.en, com.applovin.impl.b4.e
        public void a(String str, fs fsVar, int i10) {
            this.a.l0().a(bn.a(fsVar, in.this.f5359h, in.this.f5360i, in.this.a));
        }

        @Override // com.applovin.impl.en, com.applovin.impl.b4.e
        public void a(String str, int i10, String str2, fs fsVar) {
            if (com.applovin.impl.sdk.t.a()) {
                this.f9061c.b(this.f9060b, "Unable to resolve VAST wrapper. Server returned " + i10);
            }
            in.this.a(i10);
        }
    }

    public in(fq fqVar, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.k kVar) {
        super("TaskResolveVastWrapper", kVar);
        this.f5360i = appLovinAdLoadListener;
        this.f5359h = fqVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        String a10 = nq.a(this.f5359h);
        if (StringUtils.isValidString(a10)) {
            if (com.applovin.impl.sdk.t.a()) {
                this.f9061c.a(this.f9060b, "Resolving VAST ad with depth " + this.f5359h.d() + " at " + a10);
            }
            try {
                this.a.l0().a(new a(com.applovin.impl.sdk.network.a.a(this.a).b(a10).c("GET").a(fs.f4801f).a(((Integer) this.a.a(oj.U4)).intValue()).c(((Integer) this.a.a(oj.V4)).intValue()).a(false).a(), this.a));
                return;
            } catch (Throwable th2) {
                if (com.applovin.impl.sdk.t.a()) {
                    this.f9061c.a(this.f9060b, "Unable to resolve VAST wrapper", th2);
                }
                a(-1);
                return;
            }
        }
        if (com.applovin.impl.sdk.t.a()) {
            this.f9061c.b(this.f9060b, "Resolving VAST failed. Could not find resolution URL");
        }
        a(-1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i10) {
        if (com.applovin.impl.sdk.t.a()) {
            this.f9061c.b(this.f9060b, "Failed to resolve VAST wrapper due to error code " + i10);
        }
        if (i10 == -1009) {
            AppLovinAdLoadListener appLovinAdLoadListener = this.f5360i;
            if (appLovinAdLoadListener != null) {
                appLovinAdLoadListener.failedToReceiveAd(i10);
                return;
            }
            return;
        }
        nq.a(this.f5359h, this.f5360i, i10 == -1001 ? gq.TIMED_OUT : gq.GENERAL_WRAPPER_ERROR, i10, this.a);
    }
}
