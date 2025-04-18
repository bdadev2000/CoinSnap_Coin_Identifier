package com.safedk.android.analytics.brandsafety.creatives.infos;

import android.os.Bundle;
import android.text.TextUtils;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.annotations.AdNetworkIdentifier;
import com.safedk.android.utils.g;

@AdNetworkIdentifier(packageName = g.f30049b)
/* loaded from: classes4.dex */
public class AdColonyCreativeInfo extends CreativeInfo {
    private static final String Y = "AdColonyCreativeInfo";

    /* renamed from: a, reason: collision with root package name */
    public static final String f29612a = "manifest_url";
    private static final long serialVersionUID = -5937630405018276749L;
    private String Z;
    private String aa;

    public String a() {
        return this.Z;
    }

    public String b() {
        return this.aa;
    }

    public AdColonyCreativeInfo(String id, String creativeId, String campaignId, String clickUrl, String videoUrl, String adFormat, String placementId, String sdkVersion, boolean isPlayable, String struct) {
        super(BrandSafetyUtils.AdType.INTERSTITIAL, g.f30049b, id, creativeId, clickUrl, videoUrl, struct);
        this.Z = campaignId;
        p(adFormat);
        this.K = placementId;
        this.Q = sdkVersion;
        this.W = isPlayable;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo
    public boolean c() {
        return TextUtils.isEmpty(N()) || TextUtils.isEmpty(M());
    }

    public void a(String str) {
        this.aa = str;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo
    public Bundle d() {
        Bundle d = super.d();
        if (!TextUtils.isEmpty(this.Z)) {
            d.putString("campaign_id", this.Z);
        }
        if (this.aa != null && !this.aa.isEmpty()) {
            d.putString(f29612a, this.aa);
        }
        return d;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo
    public void a(Object obj) {
        if (this.aW != null) {
            Logger.d(Y, "ci matching object address was not set because it was already set previously to: " + this.aW);
        } else if (obj != null) {
            this.aX = obj.getClass().getCanonicalName();
            this.aW = BrandSafetyUtils.a(obj);
            Logger.d(Y, "set matching object - type: " + this.aX + ", address: " + this.aW + ", ad id: " + L());
        }
    }
}
