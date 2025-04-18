package com.facebook.ads.redexgen.uinode;

import android.content.Context;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdBase;
import com.facebook.ads.NativeAdListener;
import com.facebook.ads.NativeAdsManager;
import com.facebook.ads.internal.api.NativeAdsManagerApi;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.5m, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C03595m implements NativeAdsManagerApi {
    public static final String A0A = NativeAdsManager.class.getSimpleName();
    public NativeAdsManager.Listener A01;
    public C1148ag A02;
    public String A03;
    public final int A06;
    public final C1070Yn A07;
    public final String A08;
    public final List<NativeAd> A09;
    public int A00 = -1;
    public boolean A04 = false;
    public boolean A05 = false;

    public C03595m(Context context, String str, int i10) {
        this.A07 = C03495c.A03(context);
        this.A08 = str;
        this.A06 = Math.max(i10, 0);
        this.A09 = new ArrayList(i10);
    }

    public final NativeAdsManager.Listener A00() {
        return this.A01;
    }

    public final C1148ag A01() {
        return this.A02;
    }

    public final void A02() {
        this.A09.clear();
    }

    public final void A03(int i10) {
        this.A00 = i10;
    }

    public final void A04(NativeAd nativeAd) {
        this.A09.add(nativeAd);
    }

    public final void A05(boolean z10) {
        this.A04 = z10;
    }

    @Override // com.facebook.ads.internal.api.NativeAdsManagerApi
    public final void disableAutoRefresh() {
        this.A05 = true;
        C1148ag c1148ag = this.A02;
        if (c1148ag != null) {
            c1148ag.A06();
        }
    }

    @Override // com.facebook.ads.internal.api.NativeAdsManagerApi
    public final int getUniqueNativeAdCount() {
        return this.A09.size();
    }

    @Override // com.facebook.ads.internal.api.NativeAdsManagerApi
    public final boolean isLoaded() {
        return this.A04;
    }

    @Override // com.facebook.ads.internal.api.NativeAdsManagerApi
    public final void loadAds() {
        loadAds(NativeAdBase.MediaCacheFlag.ALL);
    }

    @Override // com.facebook.ads.internal.api.NativeAdsManagerApi
    public final void loadAds(NativeAdBase.MediaCacheFlag mediaCacheFlag) {
        EnumC0680Jg enumC0680Jg = EnumC0680Jg.A05;
        int i10 = this.A06;
        C1148ag c1148ag = this.A02;
        C1148ag c1148ag2 = new C1148ag(this.A07, this.A08, enumC0680Jg, null, i10);
        this.A02 = c1148ag2;
        if (this.A05) {
            c1148ag2.A06();
        }
        this.A02.A09(this.A03);
        this.A02.A08(new ZA(this, this.A07, mediaCacheFlag));
        this.A02.A07();
    }

    @Override // com.facebook.ads.internal.api.NativeAdsManagerApi
    public final NativeAd nextNativeAd() {
        return nextNativeAd(null);
    }

    @Override // com.facebook.ads.internal.api.NativeAdsManagerApi
    public final NativeAd nextNativeAd(NativeAdListener nativeAdListener) {
        if (this.A09.size() == 0) {
            return null;
        }
        int i10 = this.A00;
        this.A00 = i10 + 1;
        List<NativeAd> list = this.A09;
        int pos = list.size();
        NativeAd nativeAd = list.get(i10 % pos);
        if (nativeAdListener != null) {
            ((V2) nativeAd.getInternalNativeAd()).A1R(nativeAd, nativeAdListener);
        }
        int pos2 = this.A09.size();
        if (i10 >= pos2) {
            return new NativeAd(this.A07, nativeAd);
        }
        return nativeAd;
    }

    @Override // com.facebook.ads.internal.api.NativeAdsManagerApi
    public final void setExtraHints(String str) {
        this.A03 = str;
    }

    @Override // com.facebook.ads.internal.api.NativeAdsManagerApi
    public final void setListener(NativeAdsManager.Listener listener) {
        this.A01 = listener;
    }
}
