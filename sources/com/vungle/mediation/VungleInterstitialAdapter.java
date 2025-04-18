package com.vungle.mediation;

import a4.j;
import a7.c;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import c7.d;
import com.google.ads.mediation.vungle.VungleMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.MediationUtils;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.vungle.ads.c0;
import com.vungle.ads.c1;
import com.vungle.ads.y;
import java.util.ArrayList;

@Keep
/* loaded from: classes4.dex */
public class VungleInterstitialAdapter implements MediationInterstitialAdapter, MediationBannerAdapter {
    private y bannerAd;
    private RelativeLayout bannerLayout;
    private c1 interstitialAd;
    private MediationBannerListener mediationBannerListener;
    private MediationInterstitialListener mediationInterstitialListener;

    public static /* bridge */ /* synthetic */ y a(VungleInterstitialAdapter vungleInterstitialAdapter) {
        return vungleInterstitialAdapter.bannerAd;
    }

    public static /* bridge */ /* synthetic */ RelativeLayout b(VungleInterstitialAdapter vungleInterstitialAdapter) {
        return vungleInterstitialAdapter.bannerLayout;
    }

    public static /* bridge */ /* synthetic */ c1 c(VungleInterstitialAdapter vungleInterstitialAdapter) {
        return vungleInterstitialAdapter.interstitialAd;
    }

    public void createBanner() {
        y yVar = this.bannerAd;
        if (yVar == null) {
            AdError adError = new AdError(106, "Try to play banner ad but the Vungle BannerAd instance not created.", VungleMediationAdapter.ERROR_DOMAIN);
            Log.d(VungleMediationAdapter.TAG, adError.toString());
            MediationBannerListener mediationBannerListener = this.mediationBannerListener;
            if (mediationBannerListener != null) {
                mediationBannerListener.onAdFailedToLoad(this, adError);
                return;
            }
            return;
        }
        View bannerView = yVar.getBannerView();
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

    public static /* bridge */ /* synthetic */ MediationBannerListener d(VungleInterstitialAdapter vungleInterstitialAdapter) {
        return vungleInterstitialAdapter.mediationBannerListener;
    }

    public static /* bridge */ /* synthetic */ void f(VungleInterstitialAdapter vungleInterstitialAdapter, y yVar) {
        vungleInterstitialAdapter.bannerAd = yVar;
    }

    public static /* bridge */ /* synthetic */ void g(VungleInterstitialAdapter vungleInterstitialAdapter, RelativeLayout relativeLayout) {
        vungleInterstitialAdapter.bannerLayout = relativeLayout;
    }

    public static c0 getVungleBannerAdSizeFromGoogleAdSize(Context context, AdSize adSize) {
        ArrayList arrayList = new ArrayList();
        c0 c0Var = c0.BANNER_SHORT;
        arrayList.add(new AdSize(c0Var.getWidth(), c0Var.getHeight()));
        c0 c0Var2 = c0.BANNER;
        arrayList.add(new AdSize(c0Var2.getWidth(), c0Var2.getHeight()));
        c0 c0Var3 = c0.BANNER_LEADERBOARD;
        arrayList.add(new AdSize(c0Var3.getWidth(), c0Var3.getHeight()));
        c0 c0Var4 = c0.VUNGLE_MREC;
        arrayList.add(new AdSize(c0Var4.getWidth(), c0Var4.getHeight()));
        AdSize findClosestSize = MediationUtils.findClosestSize(context, adSize, arrayList);
        if (findClosestSize == null) {
            return null;
        }
        Log.d(VungleMediationAdapter.TAG, "Found closest Liftoff Monetize banner ad size: " + findClosestSize + " for requested ad size: " + adSize);
        if (findClosestSize.getWidth() == c0Var.getWidth() && findClosestSize.getHeight() == c0Var.getHeight()) {
            return c0Var;
        }
        if (findClosestSize.getWidth() == c0Var2.getWidth() && findClosestSize.getHeight() == c0Var2.getHeight()) {
            return c0Var2;
        }
        if (findClosestSize.getWidth() == c0Var3.getWidth() && findClosestSize.getHeight() == c0Var3.getHeight()) {
            return c0Var3;
        }
        if (findClosestSize.getWidth() != c0Var4.getWidth() || findClosestSize.getHeight() != c0Var4.getHeight()) {
            return null;
        }
        return c0Var4;
    }

    public static /* bridge */ /* synthetic */ void h(VungleInterstitialAdapter vungleInterstitialAdapter, c1 c1Var) {
        vungleInterstitialAdapter.interstitialAd = c1Var;
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
        c cVar = c.f306c;
        int taggedForChildDirectedTreatment = mediationAdRequest.taggedForChildDirectedTreatment();
        cVar.getClass();
        c.b(taggedForChildDirectedTreatment);
        String string2 = bundle.getString("placementID");
        if (TextUtils.isEmpty(string2)) {
            AdError adError2 = new AdError(101, "Failed to load waterfall banner ad from Liftoff Monetize. Missing or invalid Placement ID configured for this ad source instance in the AdMob or Ad Manager UI.", VungleMediationAdapter.ERROR_DOMAIN);
            Log.w(VungleMediationAdapter.TAG, adError2.toString());
            mediationBannerListener.onAdFailedToLoad(this, adError2);
            return;
        }
        c0 vungleBannerAdSizeFromGoogleAdSize = getVungleBannerAdSizeFromGoogleAdSize(context, adSize);
        if (vungleBannerAdSizeFromGoogleAdSize == null) {
            AdError adError3 = new AdError(102, "Failed to load waterfall banner ad from Liftoff Monetize. Invalid banner size.", VungleMediationAdapter.ERROR_DOMAIN);
            Log.w(VungleMediationAdapter.TAG, adError3.toString());
            mediationBannerListener.onAdFailedToLoad(this, adError3);
        } else {
            String str = VungleMediationAdapter.TAG;
            StringBuilder o10 = j.o("requestBannerAd for Placement: ", string2, " ### Adapter instance: ");
            o10.append(hashCode());
            Log.d(str, o10.toString());
            cVar.a(string, context, new d(this, context, adSize, vungleBannerAdSizeFromGoogleAdSize, string2));
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
        c cVar = c.f306c;
        int taggedForChildDirectedTreatment = mediationAdRequest.taggedForChildDirectedTreatment();
        cVar.getClass();
        c.b(taggedForChildDirectedTreatment);
        com.vungle.ads.d dVar = new com.vungle.ads.d();
        if (bundle2 != null && bundle2.containsKey("adOrientation")) {
            dVar.setAdOrientation(bundle2.getInt("adOrientation", 2));
        }
        cVar.a(string, context, new d(this, context, string2, dVar, mediationInterstitialListener, 1));
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void showInterstitial() {
        c1 c1Var = this.interstitialAd;
        if (c1Var != null) {
            c1Var.play(null);
        }
    }
}
