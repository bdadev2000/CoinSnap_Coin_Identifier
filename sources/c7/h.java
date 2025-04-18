package c7;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import bh.z;
import com.google.ads.mediation.vungle.VungleMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import com.vungle.ads.n3;
import com.vungle.ads.o0;
import com.vungle.ads.t1;
import com.vungle.ads.w1;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes3.dex */
public final class h extends UnifiedNativeAdMapper implements w1 {

    /* renamed from: b, reason: collision with root package name */
    public final MediationNativeAdConfiguration f2694b;

    /* renamed from: c, reason: collision with root package name */
    public final MediationAdLoadCallback f2695c;

    /* renamed from: d, reason: collision with root package name */
    public MediationNativeAdCallback f2696d;

    /* renamed from: f, reason: collision with root package name */
    public t1 f2697f;

    /* renamed from: g, reason: collision with root package name */
    public hh.g f2698g;

    /* renamed from: h, reason: collision with root package name */
    public String f2699h;

    /* renamed from: i, reason: collision with root package name */
    public final a7.a f2700i;

    public h(MediationNativeAdConfiguration mediationNativeAdConfiguration, MediationAdLoadCallback mediationAdLoadCallback, a7.a aVar) {
        this.f2694b = mediationNativeAdConfiguration;
        this.f2695c = mediationAdLoadCallback;
        this.f2700i = aVar;
    }

    public final void a() {
        int i10;
        int i11;
        MediationNativeAdConfiguration mediationNativeAdConfiguration = this.f2694b;
        Bundle serverParameters = mediationNativeAdConfiguration.getServerParameters();
        NativeAdOptions nativeAdOptions = mediationNativeAdConfiguration.getNativeAdOptions();
        Context context = mediationNativeAdConfiguration.getContext();
        String string = serverParameters.getString("appid");
        boolean isEmpty = TextUtils.isEmpty(string);
        MediationAdLoadCallback mediationAdLoadCallback = this.f2695c;
        if (isEmpty) {
            AdError adError = new AdError(101, "Failed to load bidding native ad from Liftoff Monetize. Missing or invalid app ID configured for this ad source instance in the AdMob or Ad Manager UI.", VungleMediationAdapter.ERROR_DOMAIN);
            Log.d(VungleMediationAdapter.TAG, adError.toString());
            mediationAdLoadCallback.onFailure(adError);
            return;
        }
        String string2 = serverParameters.getString("placementID");
        if (TextUtils.isEmpty(string2)) {
            AdError adError2 = new AdError(101, "Failed to load bidding native ad from Liftoff Monetize. Missing or Invalid placement ID configured for this ad source instance in the AdMob or Ad Manager UI.", VungleMediationAdapter.ERROR_DOMAIN);
            Log.d(VungleMediationAdapter.TAG, adError2.toString());
            mediationAdLoadCallback.onFailure(adError2);
            return;
        }
        this.f2699h = mediationNativeAdConfiguration.getBidResponse();
        int adChoicesPlacement = nativeAdOptions.getAdChoicesPlacement();
        if (adChoicesPlacement != 0) {
            if (adChoicesPlacement != 2) {
                if (adChoicesPlacement != 3) {
                    i10 = 1;
                } else {
                    i11 = 2;
                }
            } else {
                i11 = 3;
            }
            a7.c.f306c.a(string, context, new f(this, context, string2, i11, mediationNativeAdConfiguration.getWatermark()));
        }
        i10 = 0;
        i11 = i10;
        a7.c.f306c.a(string, context, new f(this, context, string2, i11, mediationNativeAdConfiguration.getWatermark()));
    }

    @Override // com.vungle.ads.w1, com.vungle.ads.p0
    public final void onAdClicked(o0 o0Var) {
        MediationNativeAdCallback mediationNativeAdCallback = this.f2696d;
        if (mediationNativeAdCallback != null) {
            mediationNativeAdCallback.reportAdClicked();
            this.f2696d.onAdOpened();
        }
    }

    @Override // com.vungle.ads.w1, com.vungle.ads.p0
    public final void onAdEnd(o0 o0Var) {
    }

    @Override // com.vungle.ads.w1, com.vungle.ads.p0
    public final void onAdFailedToLoad(o0 o0Var, n3 n3Var) {
        this.f2695c.onFailure(VungleMediationAdapter.getAdError(n3Var));
    }

    @Override // com.vungle.ads.w1, com.vungle.ads.p0
    public final void onAdFailedToPlay(o0 o0Var, n3 n3Var) {
        Log.w(VungleMediationAdapter.TAG, VungleMediationAdapter.getAdError(n3Var).toString());
    }

    @Override // com.vungle.ads.w1, com.vungle.ads.p0
    public final void onAdImpression(o0 o0Var) {
        MediationNativeAdCallback mediationNativeAdCallback = this.f2696d;
        if (mediationNativeAdCallback != null) {
            mediationNativeAdCallback.reportAdImpression();
        }
    }

    @Override // com.vungle.ads.w1, com.vungle.ads.p0
    public final void onAdLeftApplication(o0 o0Var) {
        MediationNativeAdCallback mediationNativeAdCallback = this.f2696d;
        if (mediationNativeAdCallback != null) {
            mediationNativeAdCallback.onAdLeftApplication();
        }
    }

    @Override // com.vungle.ads.w1, com.vungle.ads.p0
    public final void onAdLoaded(o0 o0Var) {
        setHeadline(this.f2697f.getAdTitle());
        setBody(this.f2697f.getAdBodyText());
        setCallToAction(this.f2697f.getAdCallToActionText());
        Double adStarRating = this.f2697f.getAdStarRating();
        if (adStarRating != null) {
            setStarRating(adStarRating);
        }
        setAdvertiser(this.f2697f.getAdSponsoredText());
        setMediaView(this.f2698g);
        String appIcon = this.f2697f.getAppIcon();
        if (!TextUtils.isEmpty(appIcon) && appIcon.startsWith(z.FILE_SCHEME)) {
            setIcon(new g(Uri.parse(appIcon)));
        }
        if (TextUtils.isEmpty(this.f2699h)) {
            setOverrideImpressionRecording(true);
        }
        setOverrideClickHandling(true);
        this.f2696d = (MediationNativeAdCallback) this.f2695c.onSuccess(this);
    }

    @Override // com.vungle.ads.w1, com.vungle.ads.p0
    public final void onAdStart(o0 o0Var) {
    }

    @Override // com.google.android.gms.ads.mediation.UnifiedNativeAdMapper
    public final void trackViews(View view, Map map, Map map2) {
        super.trackViews(view, map, map2);
        String str = VungleMediationAdapter.TAG;
        Log.d(str, "trackViews()");
        if (!(view instanceof ViewGroup)) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        t1 t1Var = this.f2697f;
        if (t1Var != null && t1Var.canPlayAd().booleanValue()) {
            View childAt = viewGroup.getChildAt(viewGroup.getChildCount() - 1);
            if (!(childAt instanceof FrameLayout)) {
                Log.d(str, "Vungle requires a FrameLayout to render the native ad.");
                return;
            }
            ArrayList arrayList = new ArrayList();
            ImageView imageView = null;
            KeyEvent.Callback callback = null;
            for (Map.Entry entry : map.entrySet()) {
                arrayList.add((View) entry.getValue());
                if (((String) entry.getKey()).equals("3003")) {
                    callback = (View) entry.getValue();
                }
            }
            if (callback instanceof ImageView) {
                imageView = (ImageView) callback;
            } else {
                Log.d(VungleMediationAdapter.TAG, "The view to display a Vungle native icon image is not a type of ImageView, so it can't be registered for click events.");
            }
            this.f2697f.registerViewForInteraction((FrameLayout) childAt, this.f2698g, imageView, arrayList);
        }
    }

    @Override // com.google.android.gms.ads.mediation.UnifiedNativeAdMapper
    public final void untrackView(View view) {
        super.untrackView(view);
        Log.d(VungleMediationAdapter.TAG, "untrackView()");
        t1 t1Var = this.f2697f;
        if (t1Var == null) {
            return;
        }
        t1Var.unregisterView();
    }
}
