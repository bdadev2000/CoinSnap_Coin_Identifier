package com.safedk.android.analytics.brandsafety;

import android.os.SystemClock;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;

/* loaded from: classes3.dex */
public class RedirectDetails {

    /* renamed from: a, reason: collision with root package name */
    public Long f29337a = Long.valueOf(System.currentTimeMillis());

    /* renamed from: b, reason: collision with root package name */
    public Long f29338b = Long.valueOf(SystemClock.elapsedRealtime());

    /* renamed from: c, reason: collision with root package name */
    public String f29339c;
    public BrandSafetyUtils.AdType d;
    public RedirectType e;

    /* renamed from: f, reason: collision with root package name */
    public String f29340f;

    /* renamed from: g, reason: collision with root package name */
    public String f29341g;

    /* renamed from: h, reason: collision with root package name */
    public String f29342h;

    /* renamed from: i, reason: collision with root package name */
    public RedirectDetails f29343i;

    /* loaded from: classes3.dex */
    public enum RedirectType {
        REDIRECT,
        EXPAND
    }

    public RedirectDetails(String sdkPackageName, BrandSafetyUtils.AdType adType, RedirectType type, String viewAddress, String requestedUrl, String originatedMethod, RedirectDetails previousRedirectDetails) {
        this.f29339c = sdkPackageName;
        this.d = adType;
        this.e = type;
        this.f29340f = viewAddress;
        this.f29341g = requestedUrl;
        this.f29342h = originatedMethod;
        this.f29343i = previousRedirectDetails;
    }

    public String toString() {
        return "RedirectDetails{ " + this.f29338b + ", " + this.f29339c + ", " + this.d + ", " + this.e + ", " + this.f29340f + ", " + this.f29341g + ", " + this.f29342h + " }";
    }
}
