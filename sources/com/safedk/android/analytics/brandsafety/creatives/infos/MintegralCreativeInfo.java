package com.safedk.android.analytics.brandsafety.creatives.infos;

import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.g;
import java.util.Set;

/* loaded from: classes2.dex */
public class MintegralCreativeInfo extends CreativeInfo {
    private static final String aa = "MintegralCreativeInfo";
    private static final long serialVersionUID = 5780851683333587923L;
    private String Z;

    public MintegralCreativeInfo(String id, BrandSafetyUtils.AdType adType, String creativeId, String clickUrl, String videoUrl, String imageUrl, String adFormat, String placementId, String sdkVersion, String downstreamStruct, boolean playableAd, String packageName) {
        super(adType, g.f30060o, id, creativeId, clickUrl, videoUrl, downstreamStruct);
        this.Z = null;
        p(adFormat);
        this.K = placementId;
        this.Q = sdkVersion;
        this.M = packageName;
        this.W = playableAd;
        z(imageUrl);
    }

    public String a() {
        return this.Z;
    }

    public void a(String str) {
        this.Z = str;
        u("k=" + str);
    }

    public void b(String str, Set<String> set) {
        a(str, set);
        this.ay = true;
    }
}
