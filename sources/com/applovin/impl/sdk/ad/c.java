package com.applovin.impl.sdk.ad;

import android.os.Bundle;
import com.applovin.impl.h0;
import com.applovin.impl.ig;
import com.applovin.impl.sdk.k;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class c extends AppLovinAdImpl {

    /* renamed from: f, reason: collision with root package name */
    private AppLovinAd f7613f;

    /* renamed from: g, reason: collision with root package name */
    private final h0 f7614g;

    public c(h0 h0Var, k kVar) {
        super(new JSONObject(), new JSONObject(), kVar);
        this.f7614g = h0Var;
    }

    private AppLovinAd c() {
        return (AppLovinAd) this.sdk.g().f(this.f7614g);
    }

    private String d() {
        h0 adZone = getAdZone();
        if (adZone != null && !adZone.i()) {
            return adZone.e();
        }
        return null;
    }

    public void a(AppLovinAd appLovinAd) {
        this.f7613f = appLovinAd;
    }

    public AppLovinAd b() {
        AppLovinAd appLovinAd = this.f7613f;
        return appLovinAd != null ? appLovinAd : c();
    }

    public AppLovinAd e() {
        return this.f7613f;
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            AppLovinAd b3 = b();
            if (b3 != null) {
                return b3.equals(obj);
            }
            return super.equals(obj);
        }
        return false;
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.hg
    public ig getAdEventTracker() {
        return null;
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl, com.applovin.impl.sdk.AppLovinAdBase, com.applovin.sdk.AppLovinAd
    public long getAdIdNumber() {
        AppLovinAd b3 = b();
        if (b3 != null) {
            return b3.getAdIdNumber();
        }
        return 0L;
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public h0 getAdZone() {
        AppLovinAdImpl appLovinAdImpl = (AppLovinAdImpl) b();
        if (appLovinAdImpl != null) {
            return appLovinAdImpl.getAdZone();
        }
        return this.f7614g;
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase
    public long getCreatedAtMillis() {
        AppLovinAd b3 = b();
        if (b3 instanceof AppLovinAdImpl) {
            return ((AppLovinAdImpl) b3).getCreatedAtMillis();
        }
        return 0L;
    }

    @Override // com.applovin.impl.sdk.array.ArrayDirectDownloadAd
    public Bundle getDirectDownloadParameters() {
        return new Bundle();
    }

    @Override // com.applovin.impl.sdk.array.ArrayDirectDownloadAd
    public String getDirectDownloadToken() {
        return null;
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.hg
    public String getOpenMeasurementContentUrl() {
        return null;
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.hg
    public String getOpenMeasurementCustomReferenceData() {
        return null;
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.hg
    public List getOpenMeasurementVerificationScriptResources() {
        return null;
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public JSONObject getOriginalFullResponse() {
        AppLovinAd b3 = b();
        if (b3 instanceof AppLovinAdImpl) {
            return ((AppLovinAdImpl) b3).getOriginalFullResponse();
        }
        return null;
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl, com.applovin.sdk.AppLovinAd
    public AppLovinAdSize getSize() {
        return getAdZone().f();
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl, com.applovin.sdk.AppLovinAd
    public AppLovinAdType getType() {
        return getAdZone().g();
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl, com.applovin.sdk.AppLovinAd
    public String getZoneId() {
        if (this.f7614g.i()) {
            return null;
        }
        return this.f7614g.e();
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public int hashCode() {
        AppLovinAd b3 = b();
        if (b3 != null) {
            return b3.hashCode();
        }
        return super.hashCode();
    }

    @Override // com.applovin.impl.sdk.array.ArrayDirectDownloadAd
    public boolean isDirectDownloadEnabled() {
        return false;
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public boolean isExpired() {
        AppLovinAdImpl appLovinAdImpl = (AppLovinAdImpl) b();
        if (appLovinAdImpl != null && appLovinAdImpl.isExpired()) {
            return true;
        }
        return false;
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.hg
    public boolean isOpenMeasurementEnabled() {
        return false;
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl, com.applovin.sdk.AppLovinAd
    public boolean isVideoAd() {
        AppLovinAd b3 = b();
        if (b3 != null && b3.isVideoAd()) {
            return true;
        }
        return false;
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public String toString() {
        StringBuilder sb2 = new StringBuilder("AppLovinAd{ #");
        sb2.append(getAdIdNumber());
        sb2.append(", adType=");
        sb2.append(getType());
        sb2.append(", adSize=");
        sb2.append(getSize());
        sb2.append(", zoneId='");
        return vd.e.h(sb2, d(), "'}");
    }
}
