package com.applovin.impl.mediation.ads;

import android.view.ViewGroup;
import com.applovin.impl.br;
import com.applovin.impl.cr;
import com.applovin.impl.ee;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.sdk.t;

/* loaded from: classes.dex */
public class b implements cr.a {
    private final com.applovin.impl.sdk.k a;

    /* renamed from: b, reason: collision with root package name */
    private final ee f6070b;

    /* renamed from: c, reason: collision with root package name */
    private final cr f6071c;

    /* renamed from: d, reason: collision with root package name */
    private final br f6072d;

    /* renamed from: e, reason: collision with root package name */
    private final a.InterfaceC0023a f6073e;

    public b(ee eeVar, ViewGroup viewGroup, a.InterfaceC0023a interfaceC0023a, com.applovin.impl.sdk.k kVar) {
        this.a = kVar;
        this.f6070b = eeVar;
        this.f6073e = interfaceC0023a;
        this.f6072d = new br(viewGroup, kVar);
        cr crVar = new cr(viewGroup, kVar, this);
        this.f6071c = crVar;
        crVar.a(eeVar);
        kVar.L();
        if (t.a()) {
            kVar.L().a("MaxNativeAdView", "Created new MaxNativeAdView (" + this + ")");
        }
    }

    public void a() {
        this.f6071c.b();
    }

    public ee b() {
        return this.f6070b;
    }

    public void c() {
        this.a.L();
        if (t.a()) {
            this.a.L().a("MaxNativeAdView", "Handling view attached to window");
        }
        if (this.f6070b.n0().compareAndSet(false, true)) {
            this.a.L();
            if (t.a()) {
                this.a.L().a("MaxNativeAdView", "Scheduling impression for ad manually...");
            }
            if (this.f6070b.getNativeAd().isExpired()) {
                t.h("MaxNativeAdView", "Attempting to display an expired native ad. Check if an ad is expired before displaying using `MaxAd.getNativeAd().isExpired()`");
            } else {
                this.a.f().a(this.f6070b);
            }
            this.a.S().processRawAdImpression(this.f6070b, this.f6073e);
        }
    }

    @Override // com.applovin.impl.cr.a
    public void onLogVisibilityImpression() {
        a(this.f6072d.a(this.f6070b));
    }

    private void a(long j3) {
        if (this.f6070b.p0().compareAndSet(false, true)) {
            this.a.L();
            if (t.a()) {
                this.a.L().a("MaxNativeAdView", "Scheduling viewability impression for ad...");
            }
            this.a.S().processViewabilityAdImpressionPostback(this.f6070b, j3, this.f6073e);
        }
    }
}
