package com.safedk.android.analytics.brandsafety.creatives.infos;

import android.os.Bundle;
import android.text.TextUtils;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.annotations.AdNetworkIdentifier;
import com.safedk.android.utils.g;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

@AdNetworkIdentifier(packageName = g.f30061p)
/* loaded from: classes3.dex */
public class FyberCreativeInfo extends CreativeInfo {
    private static final String Y = "FyberCreativeInfo";
    private static final String aa = "alternative_click_url";
    private static final List<String> ac = Arrays.asList("www.serveroute.com/log_string", "column=", "line=", "ad_exchange=inneractive&mraid_version=");
    private static final long serialVersionUID = -5726627304425536096L;
    private String ad;
    private String ag;

    public String a() {
        return this.ad;
    }

    public String b() {
        return this.ag;
    }

    public FyberCreativeInfo(String id, String creativeId, String campaignId, String clickUrl, String videoUrl, String adFormat, BrandSafetyUtils.AdType adType, String spotId, String sdkVersion, String adNetwork, String adDomain, String alternativeClickUrl, String eventId) {
        super(adType, g.f30061p, id, creativeId, clickUrl, videoUrl, "");
        this.K = spotId;
        Logger.d(Y, "FyberCreativeInfo ctor started");
        p(adFormat);
        this.ad = campaignId;
        this.Q = sdkVersion;
        this.ar = adNetwork;
        this.aY = adDomain;
        this.ag = alternativeClickUrl;
        f(eventId);
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo
    public boolean c() {
        return false;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo
    public Bundle d() {
        Bundle d = super.d();
        if (!TextUtils.isEmpty(this.ad)) {
            d.putString("campaign_id", this.ad);
        }
        if (!TextUtils.isEmpty(this.ag)) {
            d.putString(aa, this.ag);
        }
        return d;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo
    public void b(List<String> list) {
        Logger.d(Y, "classifyPrefetchUrl started, urlList=" + list);
        if (list != null) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                String D = D(it.next());
                boolean z2 = false;
                if (!TextUtils.isEmpty(D)) {
                    if (b(D)) {
                        z(D);
                        z2 = true;
                    } else if (v(D) && !D.equals(M())) {
                        x(D);
                        z2 = true;
                    }
                    if (!z2) {
                        Logger.d(Y, "classifyPrefetchUrl url is unclassified and will be dropped : " + D);
                    }
                }
            }
        }
    }
}
