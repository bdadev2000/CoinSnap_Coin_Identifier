package com.applovin.impl.sdk.ad;

import android.os.Bundle;
import androidx.annotation.NonNull;
import com.applovin.impl.C0703h0;
import com.applovin.impl.h8;
import com.applovin.impl.oj;
import com.applovin.impl.ql;
import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.t;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.AppLovinUtils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class AppLovinAdImpl extends AppLovinAdBase implements AppLovinAd, h8 {

    /* renamed from: a */
    private final Bundle f10737a;
    private C0703h0 b;

    /* renamed from: c */
    private boolean f10738c;

    /* renamed from: d */
    private c f10739d;

    public AppLovinAdImpl(JSONObject jSONObject, JSONObject jSONObject2, k kVar) {
        super(jSONObject, jSONObject2, kVar);
        this.f10737a = new Bundle();
    }

    public static /* synthetic */ String a(String str, String str2, ql qlVar) {
        return JsonUtils.getString(qlVar.a("ad_values", new JSONObject()), str, str2);
    }

    public static /* synthetic */ String b(String str, String str2, ql qlVar) {
        return a(str, str2, qlVar);
    }

    public boolean canExpire() {
        if (getSize() == AppLovinAdSize.INTERSTITIAL && a() > 0) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        AppLovinAd b;
        if ((obj instanceof c) && (b = ((c) obj).b()) != null) {
            obj = b;
        }
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass() && getAdIdNumber() == ((AppLovinAdImpl) obj).getAdIdNumber()) {
            return true;
        }
        return false;
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase, com.applovin.sdk.AppLovinAd
    public long getAdIdNumber() {
        return getLongFromAdObject("ad_id", -1L);
    }

    @Override // com.applovin.sdk.AppLovinAd
    public String getAdValue(String str) {
        return getAdValue(str, null);
    }

    public C0703h0 getAdZone() {
        C0703h0 c0703h0 = this.b;
        if (c0703h0 != null) {
            if (c0703h0.f() != null && this.b.g() != null) {
                return this.b;
            }
            if (getSize() == null && getType() == null) {
                return this.b;
            }
        }
        C0703h0 a6 = C0703h0.a(getSize(), getType(), getStringFromFullResponse(AppLovinUtils.ServerParameterKeys.ZONE_ID, null), getBooleanFromFullResponse("is_bidding", false), getBooleanFromFullResponse("is_direct_sold", false));
        this.b = a6;
        return a6;
    }

    public c getDummyAd() {
        return this.f10739d;
    }

    public Bundle getMAXAdValues() {
        return this.f10737a;
    }

    public abstract JSONObject getOriginalFullResponse();

    public String getRawFullResponse() {
        String jSONObject;
        ql qlVar = this.synchronizedFullResponse;
        if (qlVar != null) {
            return qlVar.toString();
        }
        synchronized (this.fullResponseLock) {
            jSONObject = this.fullResponse.toString();
        }
        return jSONObject;
    }

    @Override // com.applovin.sdk.AppLovinAd
    public AppLovinAdSize getSize() {
        return AppLovinAdSize.fromString(getStringFromFullResponse("ad_size", null));
    }

    @Override // com.applovin.impl.h8
    public long getTimeToLiveMillis() {
        if (!canExpire()) {
            return Long.MAX_VALUE;
        }
        return a() - (System.currentTimeMillis() - getCreatedAtMillis());
    }

    @Override // com.applovin.sdk.AppLovinAd
    public AppLovinAdType getType() {
        return AppLovinAdType.fromString(getStringFromFullResponse("ad_type", null));
    }

    @Override // com.applovin.sdk.AppLovinAd
    public String getZoneId() {
        if (getAdZone().i()) {
            return null;
        }
        return getStringFromFullResponse(AppLovinUtils.ServerParameterKeys.ZONE_ID, null);
    }

    public boolean hasShown() {
        return getBooleanFromAdObject("shown", Boolean.FALSE);
    }

    public boolean hasVideoUrl() {
        this.sdk.L();
        if (t.a()) {
            this.sdk.L().b("AppLovinAd", "Attempting to invoke hasVideoUrl() from base ad class");
            return false;
        }
        return false;
    }

    public int hashCode() {
        return (int) getAdIdNumber();
    }

    public boolean isExpired() {
        return this.f10738c;
    }

    @Override // com.applovin.sdk.AppLovinAd
    public boolean isVideoAd() {
        if (this.adObject.has("is_video_ad")) {
            return getBooleanFromAdObject("is_video_ad", Boolean.FALSE);
        }
        return hasVideoUrl();
    }

    public void setDummyAd(c cVar) {
        this.f10739d = cVar;
    }

    @Override // com.applovin.impl.h8
    public void setExpired() {
        this.f10738c = true;
    }

    public void setHasShown(boolean z8) {
        try {
            ql qlVar = this.synchronizedAdObject;
            if (qlVar != null) {
                qlVar.a("shown", (Object) Boolean.valueOf(z8));
                return;
            }
            synchronized (this.adObjectLock) {
                this.adObject.put("shown", z8);
            }
        } catch (Throwable unused) {
        }
    }

    public void setMaxAdValue(String str, Object obj) {
        BundleUtils.put(str, obj, this.f10737a);
    }

    public boolean shouldCancelHtmlCachingIfShown() {
        return getBooleanFromAdObject("chcis", Boolean.FALSE);
    }

    @NonNull
    public String toString() {
        return "AppLovinAd{adIdNumber=" + getAdIdNumber() + ", zoneId=\"" + getZoneId() + "\"}";
    }

    @Override // com.applovin.sdk.AppLovinAd
    public String getAdValue(String str, String str2) {
        ql qlVar = this.synchronizedAdObject;
        if (qlVar != null) {
            return (String) qlVar.a(new F2.e(3, str, str2));
        }
        return JsonUtils.getString(getJsonObjectFromAdObject("ad_values", new JSONObject()), str, str2);
    }

    private long a() {
        return getLongFromAdObject("ad_expiration_ms", ((Long) this.sdk.a(oj.f9824p1)).longValue());
    }
}
