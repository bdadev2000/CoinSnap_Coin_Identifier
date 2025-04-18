package com.safedk.android.analytics.brandsafety.creatives.infos;

import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.annotations.AdNetworkIdentifier;
import com.safedk.android.utils.g;

@AdNetworkIdentifier(packageName = g.D)
/* loaded from: classes.dex */
public class MolocoCreativeInfo extends CreativeInfo {
    public MolocoCreativeInfo(BrandSafetyUtils.AdType adType, String sdk, String id, String creativeId, String downstreamStruct, String sdkVersion, String placementId, String packageName, String adDomain, String eventId) {
        super(adType, sdk, id, creativeId, null, null, downstreamStruct);
        this.Q = sdkVersion;
        this.K = placementId;
        this.M = packageName;
        this.aY = adDomain;
        f(eventId);
    }
}
