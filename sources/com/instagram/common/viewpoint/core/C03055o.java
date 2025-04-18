package com.instagram.common.viewpoint.core;

import android.content.Context;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdBase;
import com.facebook.ads.NativeAdListener;
import com.facebook.ads.NativeAdsManager;
import com.facebook.ads.internal.api.NativeAdsManagerApi;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.5o, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C03055o implements NativeAdsManagerApi {
    public static String[] A0A = {"gDYqLx0JK9708AoJnxJgyKqjnvDR", "XqufOA6aif4bGdY", "Su6jQEbJiG4f8aKvZwQ5GnKoGxisXaGJ", "amq5QC2giq7rrMPed26NLD1vQWHXorDG", "da4TAb4G8iALXV3W79mvavYrQ", "laLk", "uFxB7CH2AwGOjVY1RRN9", "Lrv7"};
    public static final String A0B = NativeAdsManager.class.getSimpleName();
    public NativeAdsManager.Listener A01;
    public C1162bo A02;
    public String A03;
    public final int A06;
    public final C1045Zs A07;
    public final String A08;
    public final List<NativeAd> A09;
    public int A00 = -1;
    public boolean A04 = false;
    public boolean A05 = false;

    public C03055o(Context context, String str, int i2) {
        this.A07 = C02925b.A03(context);
        this.A08 = str;
        this.A06 = Math.max(i2, 0);
        this.A09 = new ArrayList(i2);
    }

    public final NativeAdsManager.Listener A00() {
        return this.A01;
    }

    public final C1162bo A01() {
        return this.A02;
    }

    public final void A02() {
        this.A09.clear();
    }

    public final void A03(int i2) {
        this.A00 = i2;
    }

    public final void A04(NativeAd nativeAd) {
        this.A09.add(nativeAd);
    }

    public final void A05(boolean z2) {
        this.A04 = z2;
    }

    @Override // com.facebook.ads.internal.api.NativeAdsManagerApi
    public final void disableAutoRefresh() {
        this.A05 = true;
        if (this.A02 != null) {
            this.A02.A06();
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
        EnumC0629Jl enumC0629Jl = EnumC0629Jl.A06;
        int i2 = this.A06;
        C1162bo c1162bo = this.A02;
        this.A02 = new C1162bo(this.A07, this.A08, enumC0629Jl, null, i2);
        if (this.A05) {
            this.A02.A06();
        }
        this.A02.A09(this.A03);
        this.A02.A08(new C1068aF(this, this.A07, mediaCacheFlag));
        this.A02.A07();
    }

    @Override // com.facebook.ads.internal.api.NativeAdsManagerApi
    public final NativeAd nextNativeAd() {
        return nextNativeAd(null);
    }

    @Override // com.facebook.ads.internal.api.NativeAdsManagerApi
    public final NativeAd nextNativeAd(NativeAdListener nativeAdListener) {
        if (this.A09.size() == 0) {
            if (A0A[0].length() != 28) {
                throw new RuntimeException();
            }
            String[] strArr = A0A;
            strArr[6] = "mJMTRUXqz4crzwTyllZM";
            strArr[4] = "KHUxr2V0BkfXxoUOzUh0cEJhB";
            return null;
        }
        int i2 = this.A00;
        this.A00 = i2 + 1;
        List<NativeAd> list = this.A09;
        int pos = this.A09.size();
        NativeAd nativeAd = list.get(i2 % pos);
        if (nativeAdListener != null) {
            ((W7) nativeAd.getInternalNativeAd()).A1T(nativeAd, nativeAdListener);
        }
        int pos2 = this.A09.size();
        if (i2 >= pos2) {
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
