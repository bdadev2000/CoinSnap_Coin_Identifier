package com.instagram.common.viewpoint.core;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdScrollView;
import com.facebook.ads.NativeAdView;
import com.facebook.ads.NativeAdViewAttributes;
import com.facebook.ads.NativeAdsManager;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.aK, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1073aK extends C3E {
    public static String[] A02 = {"mOKLXDYLG6rjJ8Uhc3dA94WggTy9aTCY", "BGa58WlKg30brm3iaXDpmKRreNqQx6sP", "OEIW0kNKyti99uOllTeGQwyl2xTRs9Rh", "66ZfANP52P8mfwFN1T5txUDlKbhE7PV5", "bDC5rvyouDOgyvzMPOhXiUUV9GXsFm8X", "OYxAj3HMhtWdnmP8KTtjhXT1I6nqQa9s", "h9E4hr1XPZf2wtmTKQKy9uKgM46lwlc6", "41TCzlsMJFbrsVbgrjJGy8KkwVmNtDJ0"};
    public List<NativeAd> A00 = new ArrayList();
    public final /* synthetic */ C03025l A01;

    public C1073aK(C03025l c03025l) {
        this.A01 = c03025l;
    }

    @Override // com.instagram.common.viewpoint.core.C3E
    public final int A01() {
        return this.A00.size();
    }

    @Override // com.instagram.common.viewpoint.core.C3E
    public final int A02(Object obj) {
        int index = this.A00.indexOf(obj);
        if (index >= 0) {
            return index;
        }
        return -2;
    }

    @Override // com.instagram.common.viewpoint.core.C3E
    public final Object A04(ViewGroup viewGroup, int i2) {
        NativeAdScrollView.AdViewProvider adViewProvider;
        NativeAdView.Type type;
        C1045Zs c1045Zs;
        NativeAdViewAttributes nativeAdViewAttributes;
        View adView;
        C1045Zs c1045Zs2;
        NativeAdView.Type type2;
        NativeAdViewAttributes nativeAdViewAttributes2;
        NativeAdScrollView.AdViewProvider adViewProvider2;
        adViewProvider = this.A01.A01;
        if (adViewProvider != null) {
            adViewProvider2 = this.A01.A01;
            adView = adViewProvider2.createView(this.A00.get(i2), i2);
        } else {
            type = this.A01.A02;
            if (type != null) {
                c1045Zs2 = this.A01.A06;
                NativeAd nativeAd = this.A00.get(i2);
                type2 = this.A01.A02;
                nativeAdViewAttributes2 = this.A01.A03;
                adView = NativeAdView.render(c1045Zs2, nativeAd, type2, nativeAdViewAttributes2);
            } else {
                c1045Zs = this.A01.A06;
                NativeAd nativeAd2 = this.A00.get(i2);
                nativeAdViewAttributes = this.A01.A03;
                adView = NativeAdView.render(c1045Zs, nativeAd2, nativeAdViewAttributes);
            }
        }
        viewGroup.addView(adView);
        return adView;
    }

    @Override // com.instagram.common.viewpoint.core.C3E
    public final void A07(ViewGroup viewGroup, int i2, Object obj) {
        NativeAdScrollView.AdViewProvider adViewProvider;
        NativeAdScrollView.AdViewProvider adViewProvider2;
        if (i2 < this.A00.size()) {
            C03025l c03025l = this.A01;
            if (A02[4].charAt(30) == 'x') {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[2] = "v77RhDbNLQhSOdbZwI5GIdcCxuAqz5PX";
            strArr[7] = "TxIZGVGrDJLkO7AUrnSGEi4CFfNom122";
            adViewProvider = c03025l.A01;
            if (adViewProvider != null) {
                adViewProvider2 = this.A01.A01;
                adViewProvider2.destroyView(this.A00.get(i2), (View) obj);
            } else {
                this.A00.get(i2).unregisterView();
            }
        }
        viewGroup.removeView((View) obj);
    }

    @Override // com.instagram.common.viewpoint.core.C3E
    public final boolean A08(View view, Object obj) {
        return view == obj;
    }

    public final void A09() {
        int i2;
        NativeAdsManager nativeAdsManager;
        NativeAdsManager nativeAdsManager2;
        this.A00.clear();
        i2 = this.A01.A00;
        nativeAdsManager = this.A01.A04;
        int min = Math.min(i2, nativeAdsManager.getUniqueNativeAdCount());
        for (int i3 = 0; i3 < min; i3++) {
            nativeAdsManager2 = this.A01.A04;
            NativeAd ad = nativeAdsManager2.nextNativeAd();
            W7.A0L(ad.getInternalNativeAd()).A1c(true);
            this.A00.add(ad);
        }
        A05();
    }
}
