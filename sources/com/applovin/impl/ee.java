package com.applovin.impl;

import android.os.SystemClock;
import android.view.ViewGroup;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ee extends ie implements h8 {

    /* renamed from: v, reason: collision with root package name */
    private final AtomicBoolean f4442v;

    /* renamed from: w, reason: collision with root package name */
    private final AtomicBoolean f4443w;

    public ee(int i10, Map map, JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.k kVar) {
        super(i10, map, jSONObject, jSONObject2, null, kVar);
        this.f4442v = new AtomicBoolean();
        this.f4443w = new AtomicBoolean();
    }

    private long k0() {
        long a = a("ad_expiration_ms", -1L);
        if (a < 0) {
            return b("ad_expiration_ms", ((Long) this.a.a(qe.f7200l7)).longValue());
        }
        return a;
    }

    public void a(MaxNativeAdView maxNativeAdView) {
        this.f3865o.a(maxNativeAdView);
    }

    @Override // com.applovin.impl.h8
    public long getTimeToLiveMillis() {
        return k0() - (SystemClock.elapsedRealtime() - J());
    }

    public MaxNativeAdView l0() {
        return this.f3865o.f();
    }

    public ViewGroup m0() {
        return this.f3865o.h();
    }

    public AtomicBoolean n0() {
        return this.f4442v;
    }

    public String o0() {
        return BundleUtils.getString("template", "", l());
    }

    public AtomicBoolean p0() {
        return this.f4443w;
    }

    public boolean q0() {
        return a("inacc", (Boolean) this.a.a(qe.D7)).booleanValue();
    }

    public boolean r0() {
        return this.f3865o == null;
    }

    @Override // com.applovin.impl.h8
    public void setExpired() {
        MaxNativeAd nativeAd = getNativeAd();
        if (nativeAd != null) {
            nativeAd.setExpired();
        }
    }

    public void a(ViewGroup viewGroup) {
        this.f3865o.a(viewGroup);
    }

    @Override // com.applovin.impl.be
    public be a(com.applovin.impl.mediation.g gVar) {
        return new ee(this, gVar);
    }

    private ee(ee eeVar, com.applovin.impl.mediation.g gVar) {
        super(eeVar.I(), eeVar.i(), eeVar.a(), eeVar.g(), gVar, eeVar.a);
        this.f4442v = new AtomicBoolean();
        this.f4443w = new AtomicBoolean();
    }
}
