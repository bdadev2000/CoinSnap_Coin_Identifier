package com.applovin.impl.sdk.ad;

import android.os.Bundle;
import androidx.annotation.NonNull;
import com.applovin.impl.h0;
import com.applovin.impl.j8;
import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.impl.sdk.j;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sj;
import com.applovin.impl.tl;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import com.facebook.appevents.AppEventsConstants;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class AppLovinAdImpl extends AppLovinAdBase implements AppLovinAd, j8 {

    /* renamed from: a, reason: collision with root package name */
    private final Bundle f26542a;

    /* renamed from: b, reason: collision with root package name */
    private h0 f26543b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f26544c;
    private c d;

    public AppLovinAdImpl(JSONObject jSONObject, JSONObject jSONObject2, j jVar) {
        super(jSONObject, jSONObject2, jVar);
        this.f26542a = new Bundle();
    }

    private long a() {
        return getLongFromAdObject("ad_expiration_ms", ((Long) this.sdk.a(sj.r1)).longValue());
    }

    public boolean canExpire() {
        return getSize() == AppLovinAdSize.INTERSTITIAL && a() > 0;
    }

    public boolean equals(Object obj) {
        AppLovinAd b2;
        if ((obj instanceof c) && (b2 = ((c) obj).b()) != null) {
            obj = b2;
        }
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && getAdIdNumber() == ((AppLovinAdImpl) obj).getAdIdNumber();
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase
    public long getAdIdNumber() {
        return getLongFromAdObject(CreativeInfo.f29617c, -1L);
    }

    public h0 getAdZone() {
        h0 h0Var = this.f26543b;
        if (h0Var != null) {
            if (h0Var.f() != null && this.f26543b.g() != null) {
                return this.f26543b;
            }
            if (getSize() == null && getType() == null) {
                return this.f26543b;
            }
        }
        h0 a2 = h0.a(getSize(), getType(), getStringFromFullResponse("zone_id", null), getBooleanFromFullResponse("is_bidding", false), getBooleanFromFullResponse("is_direct_sold", false));
        this.f26543b = a2;
        return a2;
    }

    public c getDummyAd() {
        return this.d;
    }

    public Bundle getMAXAdValues() {
        return this.f26542a;
    }

    public abstract JSONObject getOriginalFullResponse();

    public String getRawFullResponse() {
        String jSONObject;
        tl tlVar = this.synchronizedFullResponse;
        if (tlVar != null) {
            return tlVar.toString();
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

    @Override // com.applovin.impl.j8
    public long getTimeToLiveMillis() {
        if (!canExpire()) {
            return Long.MAX_VALUE;
        }
        return a() - (System.currentTimeMillis() - getCreatedAtMillis());
    }

    @Override // com.applovin.sdk.AppLovinAd
    public AppLovinAdType getType() {
        return AppLovinAdType.fromString(getStringFromFullResponse(AppEventsConstants.EVENT_PARAM_AD_TYPE, null));
    }

    @Override // com.applovin.sdk.AppLovinAd
    public String getZoneId() {
        if (getAdZone().i()) {
            return null;
        }
        return getStringFromFullResponse("zone_id", null);
    }

    public boolean hasShown() {
        return getBooleanFromAdObject("shown", Boolean.FALSE);
    }

    public boolean hasVideoUrl() {
        this.sdk.J();
        if (!n.a()) {
            return false;
        }
        this.sdk.J().b("AppLovinAd", "Attempting to invoke hasVideoUrl() from base ad class");
        return false;
    }

    public int hashCode() {
        return (int) getAdIdNumber();
    }

    public boolean isExpired() {
        return this.f26544c;
    }

    public boolean isVideoAd() {
        return this.adObject.has("is_video_ad") ? getBooleanFromAdObject("is_video_ad", Boolean.FALSE) : hasVideoUrl();
    }

    public void setDummyAd(c cVar) {
        this.d = cVar;
    }

    @Override // com.applovin.impl.j8
    public void setExpired() {
        this.f26544c = true;
    }

    public void setHasShown(boolean z2) {
        try {
            tl tlVar = this.synchronizedAdObject;
            if (tlVar != null) {
                tlVar.a("shown", (Object) Boolean.valueOf(z2));
                return;
            }
            synchronized (this.adObjectLock) {
                this.adObject.put("shown", z2);
            }
        } catch (Throwable unused) {
        }
    }

    public void setMaxAdValue(String str, Object obj) {
        BundleUtils.put(str, obj, this.f26542a);
    }

    @NonNull
    public String toString() {
        return "AppLovinAd{adIdNumber=" + getAdIdNumber() + ", zoneId=\"" + getZoneId() + "\"}";
    }
}
