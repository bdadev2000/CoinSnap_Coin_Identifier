package com.meta.analytics.dsp.uinode;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdScrollView;
import com.facebook.ads.NativeAdView;
import com.facebook.ads.NativeAdViewAttributes;
import com.facebook.ads.NativeAdsManager;
import java.util.ArrayList;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public class ZF extends C3E {
    public static String[] A02 = {"f2MNSWDlL1YMuTPGOAjONPZtO", "cmMTh0pUaJ1RDNo0mFNR3IJYAK2Mf6gB", "4dFqjoT4qnH4w96CQtkjoCAuJyqtgp11", "6XB3g70NG5Gd02gyy8Ab40YcxuzvQEqb", "wwGHlt0jZwPrQfekoFOvLm8zPwbBrmxC", "1Rqxvwj8Vs8GuK5", "NKSqZWGd9qA279w", "7JvmemziLS26U2JKZlqSRSAl5nA0imSt"};
    public List<NativeAd> A00 = new ArrayList();
    public final /* synthetic */ C09225j A01;

    public ZF(C09225j c09225j) {
        this.A01 = c09225j;
    }

    @Override // com.meta.analytics.dsp.uinode.C3E
    public final int A01() {
        return this.A00.size();
    }

    @Override // com.meta.analytics.dsp.uinode.C3E
    public final int A02(Object obj) {
        int index = this.A00.indexOf(obj);
        if (index >= 0) {
            return index;
        }
        return -2;
    }

    @Override // com.meta.analytics.dsp.uinode.C3E
    public final Object A04(ViewGroup viewGroup, int i9) {
        NativeAdScrollView.AdViewProvider adViewProvider;
        NativeAdView.Type type;
        C1636Yn c1636Yn;
        NativeAdViewAttributes nativeAdViewAttributes;
        View adView;
        C1636Yn c1636Yn2;
        NativeAdView.Type type2;
        NativeAdViewAttributes nativeAdViewAttributes2;
        NativeAdScrollView.AdViewProvider adViewProvider2;
        adViewProvider = this.A01.A01;
        if (adViewProvider != null) {
            adViewProvider2 = this.A01.A01;
            List<NativeAd> list = this.A00;
            String[] strArr = A02;
            if (strArr[7].charAt(19) == strArr[4].charAt(19)) {
                throw new RuntimeException();
            }
            A02[2] = "d9x9bMDlXKa90r8XaToMTFuUxNqAoP43";
            adView = adViewProvider2.createView(list.get(i9), i9);
        } else {
            type = this.A01.A02;
            if (type != null) {
                c1636Yn2 = this.A01.A06;
                NativeAd nativeAd = this.A00.get(i9);
                type2 = this.A01.A02;
                nativeAdViewAttributes2 = this.A01.A03;
                adView = NativeAdView.render(c1636Yn2, nativeAd, type2, nativeAdViewAttributes2);
            } else {
                c1636Yn = this.A01.A06;
                NativeAd nativeAd2 = this.A00.get(i9);
                nativeAdViewAttributes = this.A01.A03;
                adView = NativeAdView.render(c1636Yn, nativeAd2, nativeAdViewAttributes);
            }
        }
        viewGroup.addView(adView);
        return adView;
    }

    @Override // com.meta.analytics.dsp.uinode.C3E
    public final void A07(ViewGroup viewGroup, int i9, Object obj) {
        NativeAdScrollView.AdViewProvider adViewProvider;
        NativeAdScrollView.AdViewProvider adViewProvider2;
        if (i9 < this.A00.size()) {
            adViewProvider = this.A01.A01;
            if (adViewProvider != null) {
                adViewProvider2 = this.A01.A01;
                adViewProvider2.destroyView(this.A00.get(i9), (View) obj);
            } else {
                List<NativeAd> list = this.A00;
                if (A02[0].length() != 25) {
                    throw new RuntimeException();
                }
                A02[0] = "BErMlyrXrYPfhoDWoAGZwiXdk";
                list.get(i9).unregisterView();
            }
        }
        viewGroup.removeView((View) obj);
    }

    @Override // com.meta.analytics.dsp.uinode.C3E
    public final boolean A08(View view, Object obj) {
        return view == obj;
    }

    public final void A09() {
        int i9;
        NativeAdsManager nativeAdsManager;
        NativeAdsManager nativeAdsManager2;
        this.A00.clear();
        i9 = this.A01.A00;
        nativeAdsManager = this.A01.A04;
        int min = Math.min(i9, nativeAdsManager.getUniqueNativeAdCount());
        for (int i10 = 0; i10 < min; i10++) {
            nativeAdsManager2 = this.A01.A04;
            NativeAd ad = nativeAdsManager2.nextNativeAd();
            V2.A0L(ad.getInternalNativeAd()).A1a(true);
            this.A00.add(ad);
        }
        A05();
    }
}
