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
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: e, reason: collision with root package name */
    private static final Map f5047e = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    private static final Object f5048f = new Object();
    private JSONObject a;

    /* renamed from: b, reason: collision with root package name */
    private final String f5049b;

    /* renamed from: c, reason: collision with root package name */
    private AppLovinAdSize f5050c;

    /* renamed from: d, reason: collision with root package name */
    private AppLovinAdType f5051d;

    private h0(AppLovinAdSize appLovinAdSize, AppLovinAdType appLovinAdType, String str, boolean z10, boolean z11) {
        String lowerCase;
        if (TextUtils.isEmpty(str) && (appLovinAdType == null || appLovinAdSize == null)) {
            throw new IllegalArgumentException("No zone identifier or type or size specified");
        }
        this.f5050c = appLovinAdSize;
        this.f5051d = appLovinAdType;
        if (StringUtils.isValidString(str)) {
            lowerCase = str.trim().toLowerCase(Locale.ENGLISH);
        } else {
            lowerCase = (appLovinAdSize.getLabel() + "_" + appLovinAdType.getLabel()).toLowerCase(Locale.ENGLISH);
        }
        lowerCase = z10 ? eb.j.k(lowerCase, "_bidding") : lowerCase;
        this.f5049b = z11 ? eb.j.k(lowerCase, "_direct_sold") : lowerCase;
    }

    public static h0 a(AppLovinAdSize appLovinAdSize, AppLovinAdType appLovinAdType) {
        return a(appLovinAdSize, appLovinAdType, null);
    }

    public static h0 b(String str) {
        return a(AppLovinAdSize.INTERSTITIAL, AppLovinAdType.INCENTIVIZED, str);
    }

    public static h0 c() {
        return a(AppLovinAdSize.BANNER, AppLovinAdType.REGULAR);
    }

    public static h0 h() {
        return a(AppLovinAdSize.INTERSTITIAL, AppLovinAdType.INCENTIVIZED);
    }

    public static h0 j() {
        return a(AppLovinAdSize.LEADER, AppLovinAdType.REGULAR);
    }

    public static h0 k() {
        return a(AppLovinAdSize.MREC, AppLovinAdType.REGULAR);
    }

    public static h0 l() {
        return a(AppLovinAdSize.NATIVE, AppLovinAdType.NATIVE);
    }

    public static h0 m() {
        return a(AppLovinAdSize.INTERSTITIAL, AppLovinAdType.REGULAR);
    }

    public MaxAdFormat d() {
        AppLovinAdSize f10 = f();
        if (f10 == AppLovinAdSize.BANNER) {
            return MaxAdFormat.BANNER;
        }
        if (f10 == AppLovinAdSize.LEADER) {
            return MaxAdFormat.LEADER;
        }
        if (f10 == AppLovinAdSize.MREC) {
            return MaxAdFormat.MREC;
        }
        if (f10 == AppLovinAdSize.INTERSTITIAL) {
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
        if (f10 == AppLovinAdSize.NATIVE) {
            return MaxAdFormat.NATIVE;
        }
        return null;
    }

    public String e() {
        return this.f5049b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && h0.class == obj.getClass()) {
            return this.f5049b.equalsIgnoreCase(((h0) obj).f5049b);
        }
        return false;
    }

    public AppLovinAdSize f() {
        if (this.f5050c == null && JsonUtils.valueExists(this.a, "ad_size")) {
            this.f5050c = AppLovinAdSize.fromString(JsonUtils.getString(this.a, "ad_size", null));
        }
        return this.f5050c;
    }

    public AppLovinAdType g() {
        if (this.f5051d == null && JsonUtils.valueExists(this.a, "ad_type")) {
            this.f5051d = AppLovinAdType.fromString(JsonUtils.getString(this.a, "ad_type", null));
        }
        return this.f5051d;
    }

    public int hashCode() {
        return this.f5049b.hashCode();
    }

    public boolean i() {
        return a().contains(this);
    }

    public String toString() {
        return "AdZone{id=" + this.f5049b + ", zoneObject=" + this.a + AbstractJsonLexerKt.END_OBJ;
    }

    public static h0 a(AppLovinAdSize appLovinAdSize, AppLovinAdType appLovinAdType, String str) {
        return a(appLovinAdSize, appLovinAdType, str, false, false);
    }

    public static h0 b() {
        return a(AppLovinAdSize.INTERSTITIAL, AppLovinAdType.APP_OPEN);
    }

    public static h0 a(String str) {
        return a(null, null, str);
    }

    public static void a(JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.has("ad_size") && jSONObject.has("ad_type")) {
            synchronized (f5048f) {
                h0 h0Var = (h0) f5047e.get(JsonUtils.getString(jSONObject, AppLovinUtils.ServerParameterKeys.ZONE_ID, ""));
                if (h0Var != null) {
                    h0Var.f5050c = AppLovinAdSize.fromString(JsonUtils.getString(jSONObject, "ad_size", ""));
                    h0Var.f5051d = AppLovinAdType.fromString(JsonUtils.getString(jSONObject, "ad_type", ""));
                }
            }
        }
    }

    public static h0 a(AppLovinAdSize appLovinAdSize, AppLovinAdType appLovinAdType, String str, boolean z10, boolean z11) {
        h0 h0Var = new h0(appLovinAdSize, appLovinAdType, str, z10, z11);
        synchronized (f5048f) {
            String str2 = h0Var.f5049b;
            Map map = f5047e;
            if (map.containsKey(str2)) {
                h0Var = (h0) map.get(str2);
            } else {
                map.put(str2, h0Var);
            }
        }
        return h0Var;
    }

    public static Collection a() {
        LinkedHashSet linkedHashSet = new LinkedHashSet(7);
        Collections.addAll(linkedHashSet, c(), k(), j(), m(), b(), h(), l());
        return Collections.unmodifiableSet(linkedHashSet);
    }
}
