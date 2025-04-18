package com.safedk.android.analytics.brandsafety.creatives.infos;

import android.os.Bundle;
import android.text.TextUtils;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.events.BrandSafetyEvent;
import com.safedk.android.utils.g;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class InMobiCreativeInfo extends CreativeInfo {

    /* renamed from: a, reason: collision with root package name */
    public static final String f29638a = "advertised_content";
    private static final String aa = "InMobiCreativeInfo";
    private static final long serialVersionUID = 5552604508381236855L;
    private int E;
    private String Y;
    private String Z;

    public String a() {
        return this.Y;
    }

    public InMobiCreativeInfo(String id, String creativeId, String placementId, String sdkVersion, BrandSafetyUtils.AdType adType, int multiAds, BrandSafetyEvent.AdFormatType adFormat, String eventId, String advertisedContent) {
        super(adType, g.f30054i, id, creativeId, null, null, null);
        BrandSafetyEvent.AdFormatType adFormat2;
        this.K = placementId;
        this.Y = id;
        this.Q = sdkVersion;
        this.E = multiAds;
        if (adFormat != null) {
            p(adFormat == BrandSafetyEvent.AdFormatType.LEADER ? BrandSafetyEvent.AdFormatType.BANNER.name() : adFormat.name());
        } else if (adType != null && (adFormat2 = BrandSafetyUtils.a(adType)) != null) {
            p(adFormat2.name());
        }
        f(eventId);
        this.Z = advertisedContent;
    }

    public int b() {
        return this.E;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo
    public Bundle d() {
        Bundle d = super.d();
        if (this.aw != null && !this.aw.isEmpty()) {
            synchronized (this.aw) {
                d.putStringArrayList(BrandSafetyEvent.f29794u, new ArrayList<>(this.aw));
            }
        }
        if (!TextUtils.isEmpty(this.Z)) {
            d.putString(f29638a, this.Z);
        }
        return d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo
    public boolean b(String str) {
        if (str == null) {
            return false;
        }
        return super.b(str.split("&")[0]);
    }

    public InMobiCreativeInfo aj() {
        return new InMobiCreativeInfo(L(), N(), this.K, this.Q, K(), this.E, BrandSafetyEvent.AdFormatType.valueOf(I()), m(), this.Z);
    }
}
