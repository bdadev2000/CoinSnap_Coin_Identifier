package com.safedk.android.analytics.brandsafety.creatives.infos;

import android.os.Bundle;
import android.text.TextUtils;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.annotations.AdNetworkIdentifier;

@AdNetworkIdentifier(packageName = "com.facebook.ads")
/* loaded from: classes2.dex */
public class FacebookAudienceNetworkCreativeInfo extends CreativeInfo {
    public static final String E = "unknown";
    public static final String Y = "template";
    public static final String Z = "markup";

    /* renamed from: a, reason: collision with root package name */
    public static final String f29637a = "placementId";
    public static final String aa = "end_card_markup";
    public static final String ab = "template_carousel";
    String ac;

    public FacebookAudienceNetworkCreativeInfo(BrandSafetyUtils.AdType adType, String id, String clickUrl, String videoUrl, String placementId, String downstreamStruct) {
        super(adType, "com.facebook.ads", id, null, clickUrl, videoUrl, downstreamStruct);
        this.H = true;
        this.ac = placementId;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo
    public String G() {
        return super.G() + this.ac;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo
    public Bundle d() {
        Bundle d = super.d();
        d.putString(f29637a, this.ac);
        return d;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo
    public boolean c() {
        return TextUtils.isEmpty(this.ac) || (TextUtils.isEmpty(M()) && TextUtils.isEmpty(this.J));
    }
}
