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
    private final AtomicBoolean f7414v;

    /* renamed from: w, reason: collision with root package name */
    private final AtomicBoolean f7415w;

    public ee(int i9, Map map, JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.k kVar) {
        super(i9, map, jSONObject, jSONObject2, null, kVar);
        this.f7414v = new AtomicBoolean();
        this.f7415w = new AtomicBoolean();
    }

    private long k0() {
        long a6 = a("ad_expiration_ms", -1L);
        if (a6 < 0) {
            return b("ad_expiration_ms", ((Long) this.f8655a.a(qe.l7)).longValue());
        }
        return a6;
    }

    public void a(MaxNativeAdView maxNativeAdView) {
        this.f6845o.a(maxNativeAdView);
    }

    @Override // com.applovin.impl.h8
    public long getTimeToLiveMillis() {
        return k0() - (SystemClock.elapsedRealtime() - J());
    }

    public MaxNativeAdView l0() {
        return this.f6845o.f();
    }

    public ViewGroup m0() {
        return this.f6845o.h();
    }

    public AtomicBoolean n0() {
        return this.f7414v;
    }

    public String o0() {
        return BundleUtils.getString("template", "", l());
    }

    public AtomicBoolean p0() {
        return this.f7415w;
    }

    public boolean q0() {
        return a("inacc", (Boolean) this.f8655a.a(qe.f10291D7)).booleanValue();
    }

    public boolean r0() {
        if (this.f6845o == null) {
            return true;
        }
        return false;
    }

    @Override // com.applovin.impl.h8
    public void setExpired() {
        MaxNativeAd nativeAd = getNativeAd();
        if (nativeAd != null) {
            nativeAd.setExpired();
        }
    }

    public void a(ViewGroup viewGroup) {
        this.f6845o.a(viewGroup);
    }

    @Override // com.applovin.impl.be
    public be a(com.applovin.impl.mediation.g gVar) {
        return new ee(this, gVar);
    }

    private ee(ee eeVar, com.applovin.impl.mediation.g gVar) {
        super(eeVar.I(), eeVar.i(), eeVar.a(), eeVar.g(), gVar, eeVar.f8655a);
        this.f7414v = new AtomicBoolean();
        this.f7415w = new AtomicBoolean();
    }
}
