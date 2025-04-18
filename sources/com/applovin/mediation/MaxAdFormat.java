package com.applovin.mediation;

import android.content.Context;
import android.support.v4.media.d;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.applovin.impl.af;
import com.applovin.impl.sdk.n;
import com.applovin.sdk.AppLovinSdkUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;

/* loaded from: classes3.dex */
public class MaxAdFormat {

    /* renamed from: a, reason: collision with root package name */
    private final String f28399a;

    /* renamed from: b, reason: collision with root package name */
    private final String f28400b;
    public static final MaxAdFormat BANNER = new MaxAdFormat(BrandSafetyUtils.f29190m, "Banner");
    public static final MaxAdFormat MREC = new MaxAdFormat(BrandSafetyUtils.f29192o, BrandSafetyUtils.f29192o);
    public static final MaxAdFormat LEADER = new MaxAdFormat(BrandSafetyUtils.f29191n, "Leader");
    public static final MaxAdFormat INTERSTITIAL = new MaxAdFormat(BrandSafetyUtils.f29187j, "Interstitial");
    public static final MaxAdFormat APP_OPEN = new MaxAdFormat(BrandSafetyUtils.f29189l, "App Open");
    public static final MaxAdFormat REWARDED = new MaxAdFormat(BrandSafetyUtils.f29188k, "Rewarded");
    public static final MaxAdFormat REWARDED_INTERSTITIAL = new MaxAdFormat("REWARDED_INTER", "Rewarded Interstitial");
    public static final MaxAdFormat NATIVE = new MaxAdFormat("NATIVE", "Native");

    private MaxAdFormat(String str, String str2) {
        this.f28399a = str;
        this.f28400b = str2;
    }

    @Nullable
    public static MaxAdFormat formatFromString(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.equalsIgnoreCase("banner")) {
            return BANNER;
        }
        if (str.equalsIgnoreCase("mrec")) {
            return MREC;
        }
        if (str.equalsIgnoreCase("native")) {
            return NATIVE;
        }
        if (str.equalsIgnoreCase("leaderboard") || str.equalsIgnoreCase("leader")) {
            return LEADER;
        }
        if (str.equalsIgnoreCase("interstitial") || str.equalsIgnoreCase("inter")) {
            return INTERSTITIAL;
        }
        if (str.equalsIgnoreCase("appopen") || str.equalsIgnoreCase(FirebaseAnalytics.Event.APP_OPEN)) {
            return APP_OPEN;
        }
        if (str.equalsIgnoreCase("rewarded") || str.equalsIgnoreCase("reward")) {
            return REWARDED;
        }
        if (str.equalsIgnoreCase("rewarded_inter") || str.equalsIgnoreCase("rewarded_interstitial")) {
            return REWARDED_INTERSTITIAL;
        }
        n.h("AppLovinSdk", "Unknown ad format: ".concat(str));
        return null;
    }

    public AppLovinSdkUtils.Size getAdaptiveSize(Context context) {
        return getAdaptiveSize(-1, context);
    }

    @Deprecated
    public String getDisplayName() {
        return this.f28400b;
    }

    public String getLabel() {
        return this.f28399a;
    }

    public AppLovinSdkUtils.Size getSize() {
        return this == BANNER ? new AppLovinSdkUtils.Size(320, 50) : this == LEADER ? new AppLovinSdkUtils.Size(728, 90) : this == MREC ? new AppLovinSdkUtils.Size(300, 250) : new AppLovinSdkUtils.Size(0, 0);
    }

    public boolean isAdViewAd() {
        return this == BANNER || this == MREC || this == LEADER;
    }

    public boolean isBannerOrLeaderAd() {
        return this == BANNER || this == LEADER;
    }

    public boolean isFullscreenAd() {
        return this == INTERSTITIAL || this == APP_OPEN || this == REWARDED || this == REWARDED_INTERSTITIAL;
    }

    public String toString() {
        return d.r(new StringBuilder("MaxAdFormat{label='"), this.f28399a, "'}");
    }

    public AppLovinSdkUtils.Size getAdaptiveSize(int i2, Context context) {
        if (this != BANNER && this != LEADER) {
            return getSize();
        }
        return af.a(i2, this, context);
    }
}
