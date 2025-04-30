package com.facebook.internal;

/* loaded from: classes.dex */
public final /* synthetic */ class u implements Runnable {
    public final /* synthetic */ int b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.facebook.appevents.m f13669c;

    public /* synthetic */ u(com.facebook.appevents.m mVar) {
        this.f13669c = mVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.facebook.appevents.m mVar = this.f13669c;
        switch (this.b) {
            case 0:
                mVar.getClass();
                return;
            default:
                mVar.getClass();
                r rVar = r.f13653a;
                r.a(new com.applovin.impl.sdk.ad.g(9), p.AAM);
                r.a(new com.applovin.impl.sdk.ad.g(10), p.RestrictiveDataFiltering);
                r.a(new com.applovin.impl.sdk.ad.g(11), p.PrivacyProtection);
                r.a(new com.applovin.impl.sdk.ad.g(12), p.EventDeactivation);
                r.a(new com.applovin.impl.sdk.ad.g(13), p.IapLogging);
                r.a(new com.applovin.impl.sdk.ad.g(14), p.ProtectedMode);
                r.a(new com.applovin.impl.sdk.ad.g(15), p.MACARuleMatching);
                r.a(new com.applovin.impl.sdk.ad.g(16), p.CloudBridge);
                return;
        }
    }

    public /* synthetic */ u(com.facebook.appevents.m mVar, t tVar) {
        this.f13669c = mVar;
    }
}
