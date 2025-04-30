package e3;

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
import c3.C0603a;
import c3.C0605c;
import c7.C0665z;
import com.google.ads.mediation.vungle.VungleMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import com.vungle.ads.C2144v0;
import com.vungle.ads.InterfaceC2150y0;
import com.vungle.ads.P;
import com.vungle.ads.o1;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes.dex */
public final class h extends UnifiedNativeAdMapper implements InterfaceC2150y0 {
    public final MediationNativeAdConfiguration b;

    /* renamed from: c, reason: collision with root package name */
    public final MediationAdLoadCallback f20095c;

    /* renamed from: d, reason: collision with root package name */
    public MediationNativeAdCallback f20096d;

    /* renamed from: f, reason: collision with root package name */
    public C2144v0 f20097f;

    /* renamed from: g, reason: collision with root package name */
    public i7.g f20098g;

    /* renamed from: h, reason: collision with root package name */
    public String f20099h;

    /* renamed from: i, reason: collision with root package name */
    public final C0603a f20100i;

    public h(MediationNativeAdConfiguration mediationNativeAdConfiguration, MediationAdLoadCallback mediationAdLoadCallback, C0603a c0603a) {
        this.b = mediationNativeAdConfiguration;
        this.f20095c = mediationAdLoadCallback;
        this.f20100i = c0603a;
    }

    public final void a() {
        int i9;
        int i10;
        MediationNativeAdConfiguration mediationNativeAdConfiguration = this.b;
        Bundle serverParameters = mediationNativeAdConfiguration.getServerParameters();
        NativeAdOptions nativeAdOptions = mediationNativeAdConfiguration.getNativeAdOptions();
        Context context = mediationNativeAdConfiguration.getContext();
        String string = serverParameters.getString("appid");
        boolean isEmpty = TextUtils.isEmpty(string);
        MediationAdLoadCallback mediationAdLoadCallback = this.f20095c;
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
        this.f20099h = mediationNativeAdConfiguration.getBidResponse();
        int adChoicesPlacement = nativeAdOptions.getAdChoicesPlacement();
        if (adChoicesPlacement != 0) {
            if (adChoicesPlacement != 2) {
                if (adChoicesPlacement != 3) {
                    i9 = 1;
                } else {
                    i10 = 2;
                }
            } else {
                i10 = 3;
            }
            C0605c.f5405c.a(string, context, new f(this, context, string2, i10, mediationNativeAdConfiguration.getWatermark()));
        }
        i9 = 0;
        i10 = i9;
        C0605c.f5405c.a(string, context, new f(this, context, string2, i10, mediationNativeAdConfiguration.getWatermark()));
    }

    @Override // com.vungle.ads.InterfaceC2150y0, com.vungle.ads.Q
    public final void onAdClicked(P p2) {
        MediationNativeAdCallback mediationNativeAdCallback = this.f20096d;
        if (mediationNativeAdCallback != null) {
            mediationNativeAdCallback.reportAdClicked();
            this.f20096d.onAdOpened();
        }
    }

    @Override // com.vungle.ads.InterfaceC2150y0, com.vungle.ads.Q
    public final void onAdFailedToLoad(P p2, o1 o1Var) {
        this.f20095c.onFailure(VungleMediationAdapter.getAdError(o1Var));
    }

    @Override // com.vungle.ads.InterfaceC2150y0, com.vungle.ads.Q
    public final void onAdFailedToPlay(P p2, o1 o1Var) {
        Log.w(VungleMediationAdapter.TAG, VungleMediationAdapter.getAdError(o1Var).toString());
    }

    @Override // com.vungle.ads.InterfaceC2150y0, com.vungle.ads.Q
    public final void onAdImpression(P p2) {
        MediationNativeAdCallback mediationNativeAdCallback = this.f20096d;
        if (mediationNativeAdCallback != null) {
            mediationNativeAdCallback.reportAdImpression();
        }
    }

    @Override // com.vungle.ads.InterfaceC2150y0, com.vungle.ads.Q
    public final void onAdLeftApplication(P p2) {
        MediationNativeAdCallback mediationNativeAdCallback = this.f20096d;
        if (mediationNativeAdCallback != null) {
            mediationNativeAdCallback.onAdLeftApplication();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [com.google.android.gms.ads.formats.NativeAd$Image, e3.g] */
    @Override // com.vungle.ads.InterfaceC2150y0, com.vungle.ads.Q
    public final void onAdLoaded(P p2) {
        setHeadline(this.f20097f.getAdTitle());
        setBody(this.f20097f.getAdBodyText());
        setCallToAction(this.f20097f.getAdCallToActionText());
        Double adStarRating = this.f20097f.getAdStarRating();
        if (adStarRating != null) {
            setStarRating(adStarRating);
        }
        setAdvertiser(this.f20097f.getAdSponsoredText());
        setMediaView(this.f20098g);
        String appIcon = this.f20097f.getAppIcon();
        if (!TextUtils.isEmpty(appIcon) && appIcon.startsWith(C0665z.FILE_SCHEME)) {
            Uri parse = Uri.parse(appIcon);
            ?? image = new NativeAd.Image();
            image.f20094a = parse;
            setIcon(image);
        }
        if (TextUtils.isEmpty(this.f20099h)) {
            setOverrideImpressionRecording(true);
        }
        setOverrideClickHandling(true);
        this.f20096d = (MediationNativeAdCallback) this.f20095c.onSuccess(this);
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
        C2144v0 c2144v0 = this.f20097f;
        if (c2144v0 != null && c2144v0.canPlayAd().booleanValue()) {
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
            this.f20097f.registerViewForInteraction((FrameLayout) childAt, this.f20098g, imageView, arrayList);
        }
    }

    @Override // com.google.android.gms.ads.mediation.UnifiedNativeAdMapper
    public final void untrackView(View view) {
        super.untrackView(view);
        Log.d(VungleMediationAdapter.TAG, "untrackView()");
        C2144v0 c2144v0 = this.f20097f;
        if (c2144v0 == null) {
            return;
        }
        c2144v0.unregisterView();
    }

    @Override // com.vungle.ads.InterfaceC2150y0, com.vungle.ads.Q
    public final void onAdEnd(P p2) {
    }

    @Override // com.vungle.ads.InterfaceC2150y0, com.vungle.ads.Q
    public final void onAdStart(P p2) {
    }
}
