package com.applovin.impl.sdk.ad;

import android.os.Bundle;
import com.applovin.impl.C0703h0;
import com.applovin.impl.ig;
import com.applovin.impl.sdk.k;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import java.util.List;
import org.json.JSONObject;
import x0.AbstractC2914a;

/* loaded from: classes.dex */
public final class c extends AppLovinAdImpl {

    /* renamed from: f, reason: collision with root package name */
    private AppLovinAd f10764f;

    /* renamed from: g, reason: collision with root package name */
    private final C0703h0 f10765g;

    public c(C0703h0 c0703h0, k kVar) {
        super(new JSONObject(), new JSONObject(), kVar);
        this.f10765g = c0703h0;
    }

    private AppLovinAd c() {
        return (AppLovinAd) this.sdk.g().f(this.f10765g);
    }

    private String d() {
        C0703h0 adZone = getAdZone();
        if (adZone != null && !adZone.i()) {
            return adZone.e();
        }
        return null;
    }

    public void a(AppLovinAd appLovinAd) {
        this.f10764f = appLovinAd;
    }

    public AppLovinAd b() {
        AppLovinAd appLovinAd = this.f10764f;
        if (appLovinAd == null) {
            return c();
        }
        return appLovinAd;
    }

    public AppLovinAd e() {
        return this.f10764f;
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            AppLovinAd b = b();
            if (b != null) {
                return b.equals(obj);
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
        AppLovinAd b = b();
        if (b != null) {
            return b.getAdIdNumber();
        }
        return 0L;
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public C0703h0 getAdZone() {
        AppLovinAdImpl appLovinAdImpl = (AppLovinAdImpl) b();
        if (appLovinAdImpl != null) {
            return appLovinAdImpl.getAdZone();
        }
        return this.f10765g;
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase
    public long getCreatedAtMillis() {
        AppLovinAd b = b();
        if (b instanceof AppLovinAdImpl) {
            return ((AppLovinAdImpl) b).getCreatedAtMillis();
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
        AppLovinAd b = b();
        if (b instanceof AppLovinAdImpl) {
            return ((AppLovinAdImpl) b).getOriginalFullResponse();
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
        if (this.f10765g.i()) {
            return null;
        }
        return this.f10765g.e();
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public int hashCode() {
        AppLovinAd b = b();
        if (b != null) {
            return b.hashCode();
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
        AppLovinAd b = b();
        if (b != null && b.isVideoAd()) {
            return true;
        }
        return false;
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public String toString() {
        StringBuilder sb = new StringBuilder("AppLovinAd{ #");
        sb.append(getAdIdNumber());
        sb.append(", adType=");
        sb.append(getType());
        sb.append(", adSize=");
        sb.append(getSize());
        sb.append(", zoneId='");
        return AbstractC2914a.h(sb, d(), "'}");
    }
}
