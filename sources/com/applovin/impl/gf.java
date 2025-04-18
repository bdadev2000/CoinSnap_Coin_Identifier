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
    private final String a;

    /* renamed from: b, reason: collision with root package name */
    private final MaxAdFormat f4928b;

    /* renamed from: c, reason: collision with root package name */
    private final String f4929c;

    public gf(String str, MaxAdFormat maxAdFormat, String str2) {
        this.a = str;
        this.f4928b = maxAdFormat;
        this.f4929c = str2;
    }

    @Override // com.applovin.mediation.MaxAd
    public String getAdReviewCreativeId() {
        return null;
    }

    @Override // com.applovin.mediation.MaxAd
    public String getAdUnitId() {
        return this.a;
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
        return this.f4928b;
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
        return this.f4929c;
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
        return "MaxAd{adUnitId=" + this.a + ", format=" + this.f4928b + "}";
    }

    @Override // com.applovin.mediation.MaxAd
    public String getAdValue(String str, String str2) {
        return null;
    }
}
