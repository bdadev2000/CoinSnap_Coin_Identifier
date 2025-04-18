package com.safedk.android.analytics.brandsafety.creatives.infos;

import android.text.TextUtils;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.annotations.AdNetworkIdentifier;
import com.safedk.android.utils.g;

@AdNetworkIdentifier(packageName = g.f30051f)
/* loaded from: classes4.dex */
public class IronSourceCreativeInfo extends CreativeInfo {
    private static final String Y = "playableAd";
    private static final String Z = "creativeURL&quot;:&quot;";

    /* renamed from: a, reason: collision with root package name */
    private static final String f29639a = "cpvi";
    private static final long serialVersionUID = 583040939198244951L;
    private String aa;
    private String ab;
    private String ac;

    public IronSourceCreativeInfo(String id, String creativeId, String clickUrl, String videoUrl, String adType, String playableAd, String adFormat, String placementId, String endCardUrl, String sdkVersion, String buyerID) {
        super(BrandSafetyUtils.AdType.INTERSTITIAL, g.f30051f, id, creativeId, clickUrl, videoUrl, adType);
        this.aa = playableAd;
        z(this.aa);
        p(adFormat);
        this.K = placementId;
        this.Q = sdkVersion;
        this.ab = adType;
        this.ar = buyerID;
        this.T = false;
        this.W = !TextUtils.isEmpty(playableAd);
        this.at = endCardUrl;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0030, code lost:
    
        if (r4.equals(com.safedk.android.analytics.brandsafety.creatives.infos.IronSourceCreativeInfo.f29639a) != false) goto L11;
     */
    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean c() {
        /*
            r6 = this;
            r3 = 1
            r1 = 0
            java.lang.String r0 = r6.N()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L16
            java.lang.String r0 = r6.M()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L28
        L16:
            r0 = r3
        L17:
            if (r0 != 0) goto L27
            java.lang.String r4 = r6.ab
            r2 = -1
            int r5 = r4.hashCode()
            switch(r5) {
                case 3060704: goto L2a;
                case 1967260497: goto L33;
                default: goto L23;
            }
        L23:
            r1 = r2
        L24:
            switch(r1) {
                case 0: goto L3d;
                case 1: goto L44;
                default: goto L27;
            }
        L27:
            return r0
        L28:
            r0 = r1
            goto L17
        L2a:
            java.lang.String r3 = "cpvi"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L23
            goto L24
        L33:
            java.lang.String r1 = "playableAd"
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L23
            r1 = r3
            goto L24
        L3d:
            java.lang.String r0 = r6.J
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            goto L27
        L44:
            java.lang.String r0 = r6.aa
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            goto L27
        */
        throw new UnsupportedOperationException("Method not decompiled: com.safedk.android.analytics.brandsafety.creatives.infos.IronSourceCreativeInfo.c():boolean");
    }

    public String a() {
        return this.ac;
    }

    public String b() {
        return this.ab;
    }

    public String aj() {
        return this.aa;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo
    public void F(String str) {
        super.F(str);
        if (str != null && str.indexOf(Z) > -1) {
            this.ac = str.split(Z)[1].split("&quot;,&quot;")[0];
        }
    }
}
