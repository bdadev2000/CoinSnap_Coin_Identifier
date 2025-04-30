package com.applovin.sdk;

import java.util.Locale;
import x0.AbstractC2914a;

/* loaded from: classes.dex */
public class AppLovinAdSize {
    public static final int SPAN = -1;

    /* renamed from: a, reason: collision with root package name */
    private final String f12763a;
    private final int b;

    /* renamed from: c, reason: collision with root package name */
    private final int f12764c;
    public static final AppLovinAdSize BANNER = new AppLovinAdSize(-1, 50, "BANNER");
    public static final AppLovinAdSize LEADER = new AppLovinAdSize(-1, 90, "LEADER");
    public static final AppLovinAdSize MREC = new AppLovinAdSize(300, 250, "MREC");
    public static final AppLovinAdSize INTERSTITIAL = new AppLovinAdSize(-1, -1, "INTER");
    public static final AppLovinAdSize NATIVE = new AppLovinAdSize(-1, -1, "NATIVE");

    private AppLovinAdSize(int i9, int i10, String str) {
        this.b = i9;
        this.f12764c = i10;
        this.f12763a = str;
    }

    public static AppLovinAdSize fromString(String str) {
        if ("BANNER".equalsIgnoreCase(str)) {
            return BANNER;
        }
        if ("MREC".equalsIgnoreCase(str)) {
            return MREC;
        }
        if ("LEADER".equalsIgnoreCase(str)) {
            return LEADER;
        }
        if (!"INTERSTITIAL".equalsIgnoreCase(str) && !"INTER".equalsIgnoreCase(str)) {
            if ("NATIVE".equalsIgnoreCase(str)) {
                return NATIVE;
            }
            throw new IllegalArgumentException(AbstractC2914a.d("Unknown Ad Size: ", str));
        }
        return INTERSTITIAL;
    }

    public int getHeight() {
        return this.f12764c;
    }

    public String getLabel() {
        return this.f12763a.toUpperCase(Locale.ENGLISH);
    }

    public int getWidth() {
        return this.b;
    }

    public String toString() {
        return getLabel();
    }
}
