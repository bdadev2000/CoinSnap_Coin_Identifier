package com.applovin.impl;

import com.applovin.impl.mediation.MaxAdWaterfallInfoImpl;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdWaterfallInfo;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.sdk.AppLovinSdkUtils;
import com.google.android.gms.ads.AdError;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
public class gf implements MaxAd {

    /* renamed from: a, reason: collision with root package name */
    private final String f7902a;
    private final MaxAdFormat b;

    /* renamed from: c, reason: collision with root package name */
    private final String f7903c;

    public gf(String str, MaxAdFormat maxAdFormat, String str2) {
        this.f7902a = str;
        this.b = maxAdFormat;
        this.f7903c = str2;
    }

    @Override // com.applovin.mediation.MaxAd
    public String getAdReviewCreativeId() {
        return null;
    }

    @Override // com.applovin.mediation.MaxAd
    public String getAdUnitId() {
        return this.f7902a;
    }

    @Override // com.applovin.mediation.MaxAd
    public String getAdValue(String str) {
        return null;
    }

    @Override // com.applovin.mediation.MaxAd
    public String getCreativeId() {
        return null;
    }

    @Override // com.applovin.mediation.MaxAd
    public String getDspId() {
        return null;
    }

    @Override // com.applovin.mediation.MaxAd
    public String getDspName() {
        return null;
    }

    @Override // com.applovin.mediation.MaxAd
    public MaxAdFormat getFormat() {
        return this.b;
    }

    @Override // com.applovin.mediation.MaxAd
    public MaxNativeAd getNativeAd() {
        return null;
    }

    @Override // com.applovin.mediation.MaxAd
    public String getNetworkName() {
        return "";
    }

    @Override // com.applovin.mediation.MaxAd
    public String getNetworkPlacement() {
        return null;
    }

    @Override // com.applovin.mediation.MaxAd
    public String getPlacement() {
        return this.f7903c;
    }

    @Override // com.applovin.mediation.MaxAd
    public long getRequestLatencyMillis() {
        return 0L;
    }

    @Override // com.applovin.mediation.MaxAd
    public double getRevenue() {
        return 0.0d;
    }

    @Override // com.applovin.mediation.MaxAd
    public String getRevenuePrecision() {
        return AdError.UNDEFINED_DOMAIN;
    }

    @Override // com.applovin.mediation.MaxAd
    public AppLovinSdkUtils.Size getSize() {
        return getFormat().getSize();
    }

    @Override // com.applovin.mediation.MaxAd
    public MaxAdWaterfallInfo getWaterfall() {
        return new MaxAdWaterfallInfoImpl(null, "", "", 0L, new ArrayList(), Collections.EMPTY_LIST, "");
    }

    public String toString() {
        return "MaxAd{adUnitId=" + this.f7902a + ", format=" + this.b + "}";
    }

    @Override // com.applovin.mediation.MaxAd
    public String getAdValue(String str, String str2) {
        return null;
    }
}
