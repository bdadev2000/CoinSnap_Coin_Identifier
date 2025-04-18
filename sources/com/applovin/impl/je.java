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
public class je extends ne implements j8 {

    /* renamed from: v, reason: collision with root package name */
    private final AtomicBoolean f24668v;
    private final AtomicBoolean w;

    public je(int i2, Map map, JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.j jVar) {
        super(i2, map, jSONObject, jSONObject2, null, jVar);
        this.f24668v = new AtomicBoolean();
        this.w = new AtomicBoolean();
    }

    private long p0() {
        long a2 = a("ad_expiration_ms", -1L);
        return a2 < 0 ? b("ad_expiration_ms", ((Long) this.f26025a.a(ve.t7)).longValue()) : a2;
    }

    public void a(MaxNativeAdView maxNativeAdView) {
        this.f24090o.a(maxNativeAdView);
    }

    @Override // com.applovin.impl.j8
    public long getTimeToLiveMillis() {
        return p0() - (SystemClock.elapsedRealtime() - K());
    }

    public MaxNativeAdView q0() {
        return this.f24090o.f();
    }

    public ViewGroup r0() {
        return this.f24090o.h();
    }

    public AtomicBoolean s0() {
        return this.f24668v;
    }

    @Override // com.applovin.impl.j8
    public void setExpired() {
        MaxNativeAd nativeAd = getNativeAd();
        if (nativeAd != null) {
            nativeAd.setExpired();
        }
    }

    public String t0() {
        return BundleUtils.getString("template", "", l());
    }

    public AtomicBoolean u0() {
        return this.w;
    }

    public boolean v0() {
        return a("inacc", (Boolean) this.f26025a.a(ve.O7)).booleanValue();
    }

    public boolean w0() {
        return this.f24090o == null;
    }

    public void a(ViewGroup viewGroup) {
        this.f24090o.a(viewGroup);
    }

    @Override // com.applovin.impl.ge
    public ge a(com.applovin.impl.mediation.g gVar) {
        return new je(this, gVar);
    }

    private je(je jeVar, com.applovin.impl.mediation.g gVar) {
        super(jeVar.J(), jeVar.i(), jeVar.a(), jeVar.g(), gVar, jeVar.f26025a);
        this.f24668v = new AtomicBoolean();
        this.w = new AtomicBoolean();
    }
}
