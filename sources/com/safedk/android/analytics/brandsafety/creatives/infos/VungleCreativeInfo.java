package com.safedk.android.analytics.brandsafety.creatives.infos;

import android.text.TextUtils;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.annotations.AdNetworkIdentifier;
import com.safedk.android.utils.g;
import java.sql.Timestamp;

@AdNetworkIdentifier(packageName = g.d)
/* loaded from: classes3.dex */
public class VungleCreativeInfo extends CreativeInfo {

    /* renamed from: a, reason: collision with root package name */
    public static final String f29643a = "vungle_mraid";
    private static final long serialVersionUID = -7630682732175543531L;
    private boolean Y;

    public VungleCreativeInfo(BrandSafetyUtils.AdType adType, String id, String creativeId, String clickUrl, String videoUrl, String adFormat, String placement_id, String sdkVersion, long expiry, String struct) {
        super(adType, g.d, id, creativeId, clickUrl, videoUrl, struct);
        this.Y = false;
        p(adFormat);
        this.K = placement_id;
        this.Q = sdkVersion;
        this.R = new Timestamp(expiry);
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo
    public boolean c() {
        return TextUtils.isEmpty(N()) || TextUtils.isEmpty(M());
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo
    public void b(boolean z2) {
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo
    public boolean v(String str) {
        return super.v(str);
    }

    public boolean a() {
        return this.Y;
    }

    public void i(boolean z2) {
        this.Y = z2;
    }
}
