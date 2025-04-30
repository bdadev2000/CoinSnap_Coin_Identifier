package com.applovin.impl.mediation.ads;

import android.view.ViewGroup;
import com.applovin.impl.br;
import com.applovin.impl.cr;
import com.applovin.impl.ee;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.sdk.t;

/* loaded from: classes.dex */
public class b implements cr.a {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f9026a;
    private final ee b;

    /* renamed from: c, reason: collision with root package name */
    private final cr f9027c;

    /* renamed from: d, reason: collision with root package name */
    private final br f9028d;

    /* renamed from: e, reason: collision with root package name */
    private final a.InterfaceC0023a f9029e;

    public b(ee eeVar, ViewGroup viewGroup, a.InterfaceC0023a interfaceC0023a, com.applovin.impl.sdk.k kVar) {
        this.f9026a = kVar;
        this.b = eeVar;
        this.f9029e = interfaceC0023a;
        this.f9028d = new br(viewGroup, kVar);
        cr crVar = new cr(viewGroup, kVar, this);
        this.f9027c = crVar;
        crVar.a(eeVar);
        kVar.L();
        if (t.a()) {
            kVar.L().a("MaxNativeAdView", "Created new MaxNativeAdView (" + this + ")");
        }
    }

    public void a() {
        this.f9027c.b();
    }

    public ee b() {
        return this.b;
    }

    public void c() {
        this.f9026a.L();
        if (t.a()) {
            this.f9026a.L().a("MaxNativeAdView", "Handling view attached to window");
        }
        if (this.b.n0().compareAndSet(false, true)) {
            this.f9026a.L();
            if (t.a()) {
                this.f9026a.L().a("MaxNativeAdView", "Scheduling impression for ad manually...");
            }
            if (this.b.getNativeAd().isExpired()) {
                t.h("MaxNativeAdView", "Attempting to display an expired native ad. Check if an ad is expired before displaying using `MaxAd.getNativeAd().isExpired()`");
            } else {
                this.f9026a.f().a(this.b);
            }
            this.f9026a.S().processRawAdImpression(this.b, this.f9029e);
        }
    }

    @Override // com.applovin.impl.cr.a
    public void onLogVisibilityImpression() {
        a(this.f9028d.a(this.b));
    }

    private void a(long j7) {
        if (this.b.p0().compareAndSet(false, true)) {
            this.f9026a.L();
            if (t.a()) {
                this.f9026a.L().a("MaxNativeAdView", "Scheduling viewability impression for ad...");
            }
            this.f9026a.S().processViewabilityAdImpressionPostback(this.b, j7, this.f9029e);
        }
    }
}
