package com.safedk.android.analytics.brandsafety.creatives.infos;

import android.os.Bundle;
import android.text.TextUtils;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.e;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.annotations.AdNetworkIdentifier;
import com.safedk.android.utils.g;
import com.safedk.android.utils.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

@AdNetworkIdentifier(packageName = g.f30056k)
/* loaded from: classes2.dex */
public class UnityAdsCreativeInfo extends CreativeInfo {
    private static final String E = "UnityAdsCreativeInfo";
    private static final String Z = "playableUrl";
    private static final String[] ah = {g.f30053h, g.f30056k};
    private static final long serialVersionUID = 7447619620074487878L;

    /* renamed from: a, reason: collision with root package name */
    private String f29642a;
    private String ac;
    private String ae;
    private String af;
    private String ag;

    public String a() {
        return this.f29642a;
    }

    public String b() {
        return this.ae;
    }

    public String aj() {
        return this.af;
    }

    public UnityAdsCreativeInfo(String id, String creativeId, String clickUrl, String videoUrl, String playableAd, String contentType, String adDomain, String adFormat, String placementId, String sdkVersion, String bundleId, String buyerId, String endCardUrl) {
        super(BrandSafetyUtils.b(adFormat), g.f30056k, id, creativeId, clickUrl, videoUrl, contentType);
        this.f29642a = null;
        this.ac = playableAd;
        this.aY = adDomain;
        p(adFormat);
        this.K = placementId;
        this.Q = sdkVersion;
        if (TextUtils.isEmpty(this.M)) {
            this.M = bundleId;
        }
        this.ar = buyerId;
        this.at = endCardUrl;
        this.W = !TextUtils.isEmpty(this.ac);
    }

    public String ak() {
        return this.at;
    }

    public String al() {
        return this.ac;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo
    public String n() {
        return this.aY;
    }

    public void c(String str, String str2) {
        this.ae = str;
        this.af = str2;
        if (!TextUtils.isEmpty(str2)) {
            this.T = true;
        }
    }

    public void a(String str) {
        this.ag = str;
        if (!TextUtils.isEmpty(str)) {
            this.T = true;
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo
    public Bundle d() {
        Bundle d = super.d();
        if (!TextUtils.isEmpty(this.ac)) {
            d.putString(Z, this.ac);
        }
        if (N() == null || (this.I && this.ae != null)) {
            d.putString("creative_id", this.ae);
        }
        if (this.J == null || (this.I && this.af != null)) {
            d.putString(CreativeInfo.e, this.af);
        }
        return d;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo
    public boolean c() {
        return TextUtils.isEmpty(N()) || TextUtils.isEmpty(M());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo
    public boolean v(String str) {
        return (this.F.contains("admob-video") || this.F.contains("admob-display")) ? e.a(ah, str) : super.v(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo
    public boolean b(String str) {
        if (this.F.contains("admob-video") || this.F.contains("admob-display")) {
            return AdMobCreativeInfo.a(str) || k.a(str, (Map<String, String>) null) || k.p(str);
        }
        return super.b(str);
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo
    public String aa() {
        return N() + (this.ae != null ? ", " + this.ae : "");
    }

    public void H(String str) {
        this.f29642a = str;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo
    public void a(CreativeInfo creativeInfo) {
        Logger.d(E, "mergeScarAdmobCi started");
        l(creativeInfo.Q());
        c(new ArrayList(creativeInfo.s()));
        Iterator<String> it = creativeInfo.p().iterator();
        while (it.hasNext()) {
            x(it.next());
        }
        Iterator<String> it2 = creativeInfo.u().iterator();
        while (it2.hasNext()) {
            C(it2.next());
        }
        Logger.d(E, "mergeScarAdmobCi admob's click url is: " + creativeInfo.M());
        if (creativeInfo.M() != null) {
            Logger.d(E, "mergeScarAdmobCi: setting this object with current ci");
            t(creativeInfo.M());
        }
        if (creativeInfo.v()) {
            d(true);
        }
        if (creativeInfo.H() != null) {
            o(creativeInfo.H());
        }
        if (creativeInfo.g()) {
            Z();
            F(creativeInfo.A());
        }
        if (creativeInfo.N() != null) {
            i(creativeInfo.N());
        }
        if (creativeInfo.U() != null) {
            u(creativeInfo.U());
        }
    }
}
