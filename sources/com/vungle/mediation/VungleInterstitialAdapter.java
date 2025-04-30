package com.vungle.mediation;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import c3.C0605c;
import com.google.ads.mediation.vungle.VungleMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.MediationUtils;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.mbridge.msdk.foundation.entity.o;
import com.vungle.ads.C;
import com.vungle.ads.C2073d;
import com.vungle.ads.C2076e0;
import com.vungle.ads.C2149y;
import e3.C2220d;
import java.util.ArrayList;

@Keep
/* loaded from: classes3.dex */
public class VungleInterstitialAdapter implements MediationInterstitialAdapter, MediationBannerAdapter {
    private C2149y bannerAd;
    private RelativeLayout bannerLayout;
    private C2076e0 interstitialAd;
    private MediationBannerListener mediationBannerListener;
    private MediationInterstitialListener mediationInterstitialListener;

    public void createBanner() {
        C2149y c2149y = this.bannerAd;
        if (c2149y == null) {
            AdError adError = new AdError(106, "Try to play banner ad but the Vungle BannerAd instance not created.", VungleMediationAdapter.ERROR_DOMAIN);
            Log.d(VungleMediationAdapter.TAG, adError.toString());
            MediationBannerListener mediationBannerListener = this.mediationBannerListener;
            if (mediationBannerListener != null) {
                mediationBannerListener.onAdFailedToLoad(this, adError);
                return;
            }
            return;
        }
        View bannerView = c2149y.getBannerView();
        if (bannerView == null) {
            AdError adError2 = new AdError(106, "Vungle SDK returned a successful load callback, but getBannerView() returned null.", VungleMediationAdapter.ERROR_DOMAIN);
            Log.d(VungleMediationAdapter.TAG, adError2.toString());
            MediationBannerListener mediationBannerListener2 = this.mediationBannerListener;
            if (mediationBannerListener2 != null) {
                mediationBannerListener2.onAdFailedToLoad(this, adError2);
                return;
            }
            return;
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(14, -1);
        layoutParams.addRule(15, -1);
        bannerView.setLayoutParams(layoutParams);
        this.bannerLayout.addView(bannerView);
        MediationBannerListener mediationBannerListener3 = this.mediationBannerListener;
        if (mediationBannerListener3 != null) {
            mediationBannerListener3.onAdLoaded(this);
        }
    }

    public static C getVungleBannerAdSizeFromGoogleAdSize(Context context, AdSize adSize) {
        ArrayList arrayList = new ArrayList();
        C c9 = C.BANNER_SHORT;
        arrayList.add(new AdSize(c9.getWidth(), c9.getHeight()));
        C c10 = C.BANNER;
        arrayList.add(new AdSize(c10.getWidth(), c10.getHeight()));
        C c11 = C.BANNER_LEADERBOARD;
        arrayList.add(new AdSize(c11.getWidth(), c11.getHeight()));
        C c12 = C.VUNGLE_MREC;
        arrayList.add(new AdSize(c12.getWidth(), c12.getHeight()));
        AdSize findClosestSize = MediationUtils.findClosestSize(context, adSize, arrayList);
        if (findClosestSize == null) {
            return null;
        }
        Log.d(VungleMediationAdapter.TAG, "Found closest Liftoff Monetize banner ad size: " + findClosestSize + " for requested ad size: " + adSize);
        if (findClosestSize.getWidth() == c9.getWidth() && findClosestSize.getHeight() == c9.getHeight()) {
            return c9;
        }
        if (findClosestSize.getWidth() == c10.getWidth() && findClosestSize.getHeight() == c10.getHeight()) {
            return c10;
        }
        if (findClosestSize.getWidth() == c11.getWidth() && findClosestSize.getHeight() == c11.getHeight()) {
            return c11;
        }
        if (findClosestSize.getWidth() != c12.getWidth() || findClosestSize.getHeight() != c12.getHeight()) {
            return null;
        }
        return c12;
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    @NonNull
    public View getBannerView() {
        Log.d(VungleMediationAdapter.TAG, "getBannerView # instance: " + hashCode());
        return this.bannerLayout;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onDestroy() {
        Log.d(VungleMediationAdapter.TAG, "onDestroy: " + hashCode());
        if (this.bannerAd != null) {
            this.bannerLayout.removeAllViews();
            this.bannerAd.finishAd();
            this.bannerAd = null;
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onPause() {
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onResume() {
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public void requestBannerAd(@NonNull Context context, @NonNull MediationBannerListener mediationBannerListener, @NonNull Bundle bundle, @NonNull AdSize adSize, @NonNull MediationAdRequest mediationAdRequest, @Nullable Bundle bundle2) {
        this.mediationBannerListener = mediationBannerListener;
        String string = bundle.getString("appid");
        if (TextUtils.isEmpty(string)) {
            AdError adError = new AdError(101, "Failed to load waterfall banner ad from Liftoff Monetize. Missing or invalid App ID configured for this ad source instance in the AdMob or Ad Manager UI.", VungleMediationAdapter.ERROR_DOMAIN);
            Log.w(VungleMediationAdapter.TAG, adError.toString());
            mediationBannerListener.onAdFailedToLoad(this, adError);
            return;
        }
        C0605c c0605c = C0605c.f5405c;
        int taggedForChildDirectedTreatment = mediationAdRequest.taggedForChildDirectedTreatment();
        c0605c.getClass();
        C0605c.b(taggedForChildDirectedTreatment);
        String string2 = bundle.getString("placementID");
        if (TextUtils.isEmpty(string2)) {
            AdError adError2 = new AdError(101, "Failed to load waterfall banner ad from Liftoff Monetize. Missing or invalid Placement ID configured for this ad source instance in the AdMob or Ad Manager UI.", VungleMediationAdapter.ERROR_DOMAIN);
            Log.w(VungleMediationAdapter.TAG, adError2.toString());
            mediationBannerListener.onAdFailedToLoad(this, adError2);
            return;
        }
        C vungleBannerAdSizeFromGoogleAdSize = getVungleBannerAdSizeFromGoogleAdSize(context, adSize);
        if (vungleBannerAdSizeFromGoogleAdSize == null) {
            AdError adError3 = new AdError(102, "Failed to load waterfall banner ad from Liftoff Monetize. Invalid banner size.", VungleMediationAdapter.ERROR_DOMAIN);
            Log.w(VungleMediationAdapter.TAG, adError3.toString());
            mediationBannerListener.onAdFailedToLoad(this, adError3);
        } else {
            String str = VungleMediationAdapter.TAG;
            StringBuilder n2 = o.n("requestBannerAd for Placement: ", string2, " ### Adapter instance: ");
            n2.append(hashCode());
            Log.d(str, n2.toString());
            c0605c.a(string, context, new C2220d(this, context, adSize, vungleBannerAdSizeFromGoogleAdSize, string2));
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void requestInterstitialAd(@NonNull Context context, @NonNull MediationInterstitialListener mediationInterstitialListener, @NonNull Bundle bundle, @NonNull MediationAdRequest mediationAdRequest, @Nullable Bundle bundle2) {
        this.mediationInterstitialListener = mediationInterstitialListener;
        String string = bundle.getString("appid");
        if (TextUtils.isEmpty(string)) {
            AdError adError = new AdError(101, "Failed to load waterfall interstitial ad from Liftoff Monetize. Missing or invalid App ID configured for this ad source instance in the AdMob or Ad Manager UI.", VungleMediationAdapter.ERROR_DOMAIN);
            Log.w(VungleMediationAdapter.TAG, adError.toString());
            mediationInterstitialListener.onAdFailedToLoad(this, adError);
            return;
        }
        String string2 = bundle.getString("placementID");
        if (TextUtils.isEmpty(string2)) {
            AdError adError2 = new AdError(101, "Failed to load waterfall interstitial ad from Liftoff Monetize. Missing or invalid Placement ID configured for this ad source instance in the AdMob or Ad Manager UI.", VungleMediationAdapter.ERROR_DOMAIN);
            Log.w(VungleMediationAdapter.TAG, adError2.toString());
            mediationInterstitialListener.onAdFailedToLoad(this, adError2);
            return;
        }
        C0605c c0605c = C0605c.f5405c;
        int taggedForChildDirectedTreatment = mediationAdRequest.taggedForChildDirectedTreatment();
        c0605c.getClass();
        C0605c.b(taggedForChildDirectedTreatment);
        C2073d c2073d = new C2073d();
        if (bundle2 != null && bundle2.containsKey("adOrientation")) {
            c2073d.setAdOrientation(bundle2.getInt("adOrientation", 2));
        }
        c0605c.a(string, context, new C2220d(this, context, string2, c2073d, mediationInterstitialListener, 1));
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void showInterstitial() {
        C2076e0 c2076e0 = this.interstitialAd;
        if (c2076e0 != null) {
            c2076e0.play(null);
        }
    }
}
