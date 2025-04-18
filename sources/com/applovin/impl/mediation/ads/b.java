package com.applovin.impl.mediation.ads;

import android.view.ViewGroup;
import com.applovin.impl.ar;
import com.applovin.impl.br;
import com.applovin.impl.je;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.sdk.n;

/* loaded from: classes.dex */
public class b implements br.a {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.j f25365a;

    /* renamed from: b, reason: collision with root package name */
    private final je f25366b;

    /* renamed from: c, reason: collision with root package name */
    private final br f25367c;
    private final ar d;
    private final a.InterfaceC0085a e;

    public b(je jeVar, ViewGroup viewGroup, a.InterfaceC0085a interfaceC0085a, com.applovin.impl.sdk.j jVar) {
        this.f25365a = jVar;
        this.f25366b = jeVar;
        this.e = interfaceC0085a;
        this.d = new ar(viewGroup, jVar);
        br brVar = new br(viewGroup, jVar, this);
        this.f25367c = brVar;
        brVar.a(jeVar);
        jVar.J();
        if (n.a()) {
            jVar.J().a("MaxNativeAdView", "Created new MaxNativeAdView (" + this + ")");
        }
    }

    public void a() {
        this.f25367c.b();
    }

    public je b() {
        return this.f25366b;
    }

    public void c() {
        this.f25365a.J();
        if (n.a()) {
            this.f25365a.J().a("MaxNativeAdView", "Handling view attached to window");
        }
        if (this.f25366b.s0().compareAndSet(false, true)) {
            this.f25365a.J();
            if (n.a()) {
                this.f25365a.J().a("MaxNativeAdView", "Scheduling impression for ad manually...");
            }
            if (this.f25366b.getNativeAd().isExpired()) {
                n.h("MaxNativeAdView", "Attempting to display an expired native ad. Check if an ad is expired before displaying using `MaxAd.getNativeAd().isExpired()`");
            } else {
                this.f25365a.f().a(this.f25366b);
            }
            this.f25365a.Q().processRawAdImpression(this.f25366b, this.e);
        }
    }

    @Override // com.applovin.impl.br.a
    public void onLogVisibilityImpression() {
        a(this.d.a(this.f25366b));
    }

    private void a(long j2) {
        if (this.f25366b.u0().compareAndSet(false, true)) {
            this.f25365a.J();
            if (n.a()) {
                this.f25365a.J().a("MaxNativeAdView", "Scheduling viewability impression for ad...");
            }
            this.f25365a.Q().processViewabilityAdImpressionPostback(this.f25366b, j2, this.e);
        }
    }
}
