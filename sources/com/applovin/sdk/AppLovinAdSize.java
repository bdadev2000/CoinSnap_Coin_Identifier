package com.applovin.sdk;

import androidx.compose.ui.platform.j;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import java.util.Locale;

/* loaded from: classes2.dex */
public class AppLovinAdSize {
    public static final int SPAN = -1;

    /* renamed from: a, reason: collision with root package name */
    private final String f28478a;

    /* renamed from: b, reason: collision with root package name */
    private final int f28479b;

    /* renamed from: c, reason: collision with root package name */
    private final int f28480c;
    public static final AppLovinAdSize BANNER = new AppLovinAdSize(-1, 50, BrandSafetyUtils.f29190m);
    public static final AppLovinAdSize LEADER = new AppLovinAdSize(-1, 90, BrandSafetyUtils.f29191n);
    public static final AppLovinAdSize MREC = new AppLovinAdSize(300, 250, BrandSafetyUtils.f29192o);
    public static final AppLovinAdSize INTERSTITIAL = new AppLovinAdSize(-1, -1, BrandSafetyUtils.f29187j);
    public static final AppLovinAdSize NATIVE = new AppLovinAdSize(-1, -1, "NATIVE");

    private AppLovinAdSize(int i2, int i3, String str) {
        this.f28479b = i2;
        this.f28480c = i3;
        this.f28478a = str;
    }

    public static AppLovinAdSize fromString(String str) {
        if (BrandSafetyUtils.f29190m.equalsIgnoreCase(str)) {
            return BANNER;
        }
        if (BrandSafetyUtils.f29192o.equalsIgnoreCase(str)) {
            return MREC;
        }
        if (BrandSafetyUtils.f29191n.equalsIgnoreCase(str)) {
            return LEADER;
        }
        if ("INTERSTITIAL".equalsIgnoreCase(str) || BrandSafetyUtils.f29187j.equalsIgnoreCase(str)) {
            return INTERSTITIAL;
        }
        if ("NATIVE".equalsIgnoreCase(str)) {
            return NATIVE;
        }
        throw new IllegalArgumentException(j.b("Unknown Ad Size: ", str));
    }

    public int getHeight() {
        return this.f28480c;
    }

    public String getLabel() {
        return this.f28478a.toUpperCase(Locale.ENGLISH);
    }

    public int getWidth() {
        return this.f28479b;
    }

    public String toString() {
        return getLabel();
    }
}
