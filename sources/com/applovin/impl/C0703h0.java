package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.AppLovinUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.h0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0703h0 {

    /* renamed from: e, reason: collision with root package name */
    private static final Map f8016e = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    private static final Object f8017f = new Object();

    /* renamed from: a, reason: collision with root package name */
    private JSONObject f8018a;
    private final String b;

    /* renamed from: c, reason: collision with root package name */
    private AppLovinAdSize f8019c;

    /* renamed from: d, reason: collision with root package name */
    private AppLovinAdType f8020d;

    private C0703h0(AppLovinAdSize appLovinAdSize, AppLovinAdType appLovinAdType, String str, boolean z8, boolean z9) {
        String lowerCase;
        if (TextUtils.isEmpty(str) && (appLovinAdType == null || appLovinAdSize == null)) {
            throw new IllegalArgumentException("No zone identifier or type or size specified");
        }
        this.f8019c = appLovinAdSize;
        this.f8020d = appLovinAdType;
        if (StringUtils.isValidString(str)) {
            lowerCase = str.trim().toLowerCase(Locale.ENGLISH);
        } else {
            lowerCase = (appLovinAdSize.getLabel() + "_" + appLovinAdType.getLabel()).toLowerCase(Locale.ENGLISH);
        }
        lowerCase = z8 ? com.mbridge.msdk.foundation.entity.o.j(lowerCase, "_bidding") : lowerCase;
        this.b = z9 ? com.mbridge.msdk.foundation.entity.o.j(lowerCase, "_direct_sold") : lowerCase;
    }

    public static C0703h0 a(AppLovinAdSize appLovinAdSize, AppLovinAdType appLovinAdType) {
        return a(appLovinAdSize, appLovinAdType, null);
    }

    public static C0703h0 b(String str) {
        return a(AppLovinAdSize.INTERSTITIAL, AppLovinAdType.INCENTIVIZED, str);
    }

    public static C0703h0 c() {
        return a(AppLovinAdSize.BANNER, AppLovinAdType.REGULAR);
    }

    public static C0703h0 h() {
        return a(AppLovinAdSize.INTERSTITIAL, AppLovinAdType.INCENTIVIZED);
    }

    public static C0703h0 j() {
        return a(AppLovinAdSize.LEADER, AppLovinAdType.REGULAR);
    }

    public static C0703h0 k() {
        return a(AppLovinAdSize.MREC, AppLovinAdType.REGULAR);
    }

    public static C0703h0 l() {
        return a(AppLovinAdSize.NATIVE, AppLovinAdType.NATIVE);
    }

    public static C0703h0 m() {
        return a(AppLovinAdSize.INTERSTITIAL, AppLovinAdType.REGULAR);
    }

    public MaxAdFormat d() {
        AppLovinAdSize f9 = f();
        if (f9 == AppLovinAdSize.BANNER) {
            return MaxAdFormat.BANNER;
        }
        if (f9 == AppLovinAdSize.LEADER) {
            return MaxAdFormat.LEADER;
        }
        if (f9 == AppLovinAdSize.MREC) {
            return MaxAdFormat.MREC;
        }
        if (f9 == AppLovinAdSize.INTERSTITIAL) {
            if (g() == AppLovinAdType.REGULAR) {
                return MaxAdFormat.INTERSTITIAL;
            }
            if (g() == AppLovinAdType.APP_OPEN) {
                return MaxAdFormat.APP_OPEN;
            }
            if (g() == AppLovinAdType.INCENTIVIZED) {
                return MaxAdFormat.REWARDED;
            }
            if (g() == AppLovinAdType.AUTO_INCENTIVIZED) {
                return MaxAdFormat.REWARDED_INTERSTITIAL;
            }
            return null;
        }
        if (f9 == AppLovinAdSize.NATIVE) {
            return MaxAdFormat.NATIVE;
        }
        return null;
    }

    public String e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0703h0.class == obj.getClass()) {
            return this.b.equalsIgnoreCase(((C0703h0) obj).b);
        }
        return false;
    }

    public AppLovinAdSize f() {
        if (this.f8019c == null && JsonUtils.valueExists(this.f8018a, "ad_size")) {
            this.f8019c = AppLovinAdSize.fromString(JsonUtils.getString(this.f8018a, "ad_size", null));
        }
        return this.f8019c;
    }

    public AppLovinAdType g() {
        if (this.f8020d == null && JsonUtils.valueExists(this.f8018a, "ad_type")) {
            this.f8020d = AppLovinAdType.fromString(JsonUtils.getString(this.f8018a, "ad_type", null));
        }
        return this.f8020d;
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    public boolean i() {
        return a().contains(this);
    }

    public String toString() {
        return "AdZone{id=" + this.b + ", zoneObject=" + this.f8018a + '}';
    }

    public static C0703h0 a(AppLovinAdSize appLovinAdSize, AppLovinAdType appLovinAdType, String str) {
        return a(appLovinAdSize, appLovinAdType, str, false, false);
    }

    public static C0703h0 b() {
        return a(AppLovinAdSize.INTERSTITIAL, AppLovinAdType.APP_OPEN);
    }

    public static C0703h0 a(String str) {
        return a(null, null, str);
    }

    public static void a(JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.has("ad_size") && jSONObject.has("ad_type")) {
            synchronized (f8017f) {
                try {
                    C0703h0 c0703h0 = (C0703h0) f8016e.get(JsonUtils.getString(jSONObject, AppLovinUtils.ServerParameterKeys.ZONE_ID, ""));
                    if (c0703h0 != null) {
                        c0703h0.f8019c = AppLovinAdSize.fromString(JsonUtils.getString(jSONObject, "ad_size", ""));
                        c0703h0.f8020d = AppLovinAdType.fromString(JsonUtils.getString(jSONObject, "ad_type", ""));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static C0703h0 a(AppLovinAdSize appLovinAdSize, AppLovinAdType appLovinAdType, String str, boolean z8, boolean z9) {
        C0703h0 c0703h0 = new C0703h0(appLovinAdSize, appLovinAdType, str, z8, z9);
        synchronized (f8017f) {
            try {
                String str2 = c0703h0.b;
                Map map = f8016e;
                if (map.containsKey(str2)) {
                    c0703h0 = (C0703h0) map.get(str2);
                } else {
                    map.put(str2, c0703h0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0703h0;
    }

    public static Collection a() {
        LinkedHashSet linkedHashSet = new LinkedHashSet(7);
        Collections.addAll(linkedHashSet, c(), k(), j(), m(), b(), h(), l());
        return Collections.unmodifiableSet(linkedHashSet);
    }
}
