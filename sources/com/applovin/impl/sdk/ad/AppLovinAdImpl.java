package com.applovin.impl.sdk.ad;

import android.os.Bundle;
import androidx.annotation.NonNull;
import com.applovin.impl.h0;
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
    private final Bundle a;

    /* renamed from: b, reason: collision with root package name */
    private h0 f7584b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f7585c;

    /* renamed from: d, reason: collision with root package name */
    private c f7586d;

    public AppLovinAdImpl(JSONObject jSONObject, JSONObject jSONObject2, k kVar) {
        super(jSONObject, jSONObject2, kVar);
        this.a = new Bundle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String a(String str, String str2, ql qlVar) {
        return JsonUtils.getString(qlVar.a("ad_values", new JSONObject()), str, str2);
    }

    public boolean canExpire() {
        return getSize() == AppLovinAdSize.INTERSTITIAL && a() > 0;
    }

    public boolean equals(Object obj) {
        AppLovinAd b3;
        if ((obj instanceof c) && (b3 = ((c) obj).b()) != null) {
            obj = b3;
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

    public h0 getAdZone() {
        h0 h0Var = this.f7584b;
        if (h0Var != null) {
            if (h0Var.f() != null && this.f7584b.g() != null) {
                return this.f7584b;
            }
            if (getSize() == null && getType() == null) {
                return this.f7584b;
            }
        }
        h0 a = h0.a(getSize(), getType(), getStringFromFullResponse(AppLovinUtils.ServerParameterKeys.ZONE_ID, null), getBooleanFromFullResponse("is_bidding", false), getBooleanFromFullResponse("is_direct_sold", false));
        this.f7584b = a;
        return a;
    }

    public c getDummyAd() {
        return this.f7586d;
    }

    public Bundle getMAXAdValues() {
        return this.a;
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
        if (!t.a()) {
            return false;
        }
        this.sdk.L().b("AppLovinAd", "Attempting to invoke hasVideoUrl() from base ad class");
        return false;
    }

    public int hashCode() {
        return (int) getAdIdNumber();
    }

    public boolean isExpired() {
        return this.f7585c;
    }

    @Override // com.applovin.sdk.AppLovinAd
    public boolean isVideoAd() {
        if (this.adObject.has("is_video_ad")) {
            return getBooleanFromAdObject("is_video_ad", Boolean.FALSE);
        }
        return hasVideoUrl();
    }

    public void setDummyAd(c cVar) {
        this.f7586d = cVar;
    }

    @Override // com.applovin.impl.h8
    public void setExpired() {
        this.f7585c = true;
    }

    public void setHasShown(boolean z10) {
        try {
            ql qlVar = this.synchronizedAdObject;
            if (qlVar != null) {
                qlVar.a("shown", (Object) Boolean.valueOf(z10));
                return;
            }
            synchronized (this.adObjectLock) {
                this.adObject.put("shown", z10);
            }
        } catch (Throwable unused) {
        }
    }

    public void setMaxAdValue(String str, Object obj) {
        BundleUtils.put(str, obj, this.a);
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
            return (String) qlVar.a(new androidx.fragment.app.e(5, str, str2));
        }
        return JsonUtils.getString(getJsonObjectFromAdObject("ad_values", new JSONObject()), str, str2);
    }

    private long a() {
        return getLongFromAdObject("ad_expiration_ms", ((Long) this.sdk.a(oj.f6729p1)).longValue());
    }
}
