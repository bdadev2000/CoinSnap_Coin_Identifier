package com.safedk.android.analytics.brandsafety.creatives.infos;

import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.annotations.AdNetworkIdentifier;
import com.safedk.android.utils.g;

@AdNetworkIdentifier(packageName = g.f30053h)
/* loaded from: classes4.dex */
public class AdMobCreativeInfo extends CreativeInfo {
    private static String[] Y = {"googleusercontent.com", "/simgad/", "mts0.google.com", "gstatic.com", "pageadimg/imgad"};

    /* renamed from: a, reason: collision with root package name */
    private static final String f29613a = "AdMobCreativeInfo";
    private static final long serialVersionUID = -3498860760603370212L;

    public AdMobCreativeInfo(String id, BrandSafetyUtils.AdType adType, String creativeId, String clickUrl, String placementId, String videoUrl, String sdkVersion, String downstreamStruct, String appPackageName) {
        super(adType, g.f30053h, id, creativeId, clickUrl, videoUrl, downstreamStruct);
        this.K = placementId;
        this.Q = sdkVersion;
        if (o() == null && appPackageName != null) {
            q(appPackageName);
        }
    }

    public static boolean a(String str) {
        for (String str2 : Y) {
            if (str.contains(str2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo
    public boolean b(String str) {
        return a(str) || super.b(str);
    }
}
