package com.safedk.android.analytics.brandsafety.creatives.infos;

import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.annotations.AdNetworkIdentifier;
import com.safedk.android.utils.g;

@AdNetworkIdentifier(packageName = g.f30069z)
/* loaded from: classes2.dex */
public class LineCreativeInfo extends CreativeInfo {
    private static final long serialVersionUID = -7630682732175543532L;
    private String Y;

    /* renamed from: a, reason: collision with root package name */
    private int f29640a;

    public LineCreativeInfo(BrandSafetyUtils.AdType adType, String id, String creativeId, String clickUrl, String interstitialImageUrl, String placementId, String sdkVersion) {
        super(adType == null ? BrandSafetyUtils.AdType.INTERSTITIAL : adType, g.f30069z, id, creativeId, clickUrl, null, null);
        this.f29640a = 0;
        this.Y = null;
        h(placementId);
        this.Y = interstitialImageUrl;
        this.Q = sdkVersion;
    }

    public int a() {
        return this.f29640a;
    }

    public String b() {
        return this.Y;
    }
}
