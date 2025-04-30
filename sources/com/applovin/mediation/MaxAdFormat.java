package com.applovin.mediation;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.applovin.impl.sdk.t;
import com.applovin.impl.ve;
import com.applovin.sdk.AppLovinSdkUtils;
import x0.AbstractC2914a;

/* loaded from: classes.dex */
public class MaxAdFormat {

    /* renamed from: a, reason: collision with root package name */
    private final String f12690a;
    private final String b;
    public static final MaxAdFormat BANNER = new MaxAdFormat("BANNER", "Banner");
    public static final MaxAdFormat MREC = new MaxAdFormat("MREC", "MREC");
    public static final MaxAdFormat LEADER = new MaxAdFormat("LEADER", "Leader");
    public static final MaxAdFormat INTERSTITIAL = new MaxAdFormat("INTER", "Interstitial");
    public static final MaxAdFormat APP_OPEN = new MaxAdFormat("APPOPEN", "App Open");
    public static final MaxAdFormat REWARDED = new MaxAdFormat("REWARDED", "Rewarded");
    public static final MaxAdFormat REWARDED_INTERSTITIAL = new MaxAdFormat("REWARDED_INTER", "Rewarded Interstitial");
    public static final MaxAdFormat NATIVE = new MaxAdFormat("NATIVE", "Native");

    private MaxAdFormat(String str, String str2) {
        this.f12690a = str;
        this.b = str2;
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
        if (!str.equalsIgnoreCase("leaderboard") && !str.equalsIgnoreCase("leader")) {
            if (!str.equalsIgnoreCase("interstitial") && !str.equalsIgnoreCase("inter")) {
                if (!str.equalsIgnoreCase("appopen") && !str.equalsIgnoreCase("app_open")) {
                    if (!str.equalsIgnoreCase("rewarded") && !str.equalsIgnoreCase("reward")) {
                        if (!str.equalsIgnoreCase("rewarded_inter") && !str.equalsIgnoreCase("rewarded_interstitial")) {
                            t.h("AppLovinSdk", "Unknown ad format: ".concat(str));
                            return null;
                        }
                        return REWARDED_INTERSTITIAL;
                    }
                    return REWARDED;
                }
                return APP_OPEN;
            }
            return INTERSTITIAL;
        }
        return LEADER;
    }

    public AppLovinSdkUtils.Size getAdaptiveSize(Activity activity) {
        return getAdaptiveSize(-1, activity);
    }

    @Deprecated
    public String getDisplayName() {
        return this.b;
    }

    public String getLabel() {
        return this.f12690a;
    }

    public AppLovinSdkUtils.Size getSize() {
        if (this == BANNER) {
            return new AppLovinSdkUtils.Size(320, 50);
        }
        if (this == LEADER) {
            return new AppLovinSdkUtils.Size(728, 90);
        }
        if (this == MREC) {
            return new AppLovinSdkUtils.Size(300, 250);
        }
        return new AppLovinSdkUtils.Size(0, 0);
    }

    public boolean isAdViewAd() {
        if (this != BANNER && this != MREC && this != LEADER) {
            return false;
        }
        return true;
    }

    public boolean isBannerOrLeaderAd() {
        if (this != BANNER && this != LEADER) {
            return false;
        }
        return true;
    }

    public boolean isFullscreenAd() {
        if (this != INTERSTITIAL && this != APP_OPEN && this != REWARDED && this != REWARDED_INTERSTITIAL) {
            return false;
        }
        return true;
    }

    public String toString() {
        return AbstractC2914a.h(new StringBuilder("MaxAdFormat{label='"), this.f12690a, "'}");
    }

    public AppLovinSdkUtils.Size getAdaptiveSize(int i9, Context context) {
        if (this != BANNER && this != LEADER) {
            return getSize();
        }
        return ve.a(i9, this, context);
    }
}
