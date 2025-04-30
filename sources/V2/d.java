package V2;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import com.facebook.ads.Ad;
import com.facebook.ads.AdListener;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.NativeAdBase;
import com.facebook.ads.NativeAdListener;
import com.facebook.ads.NativeBannerAd;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import j5.C2400c;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class d implements AdListener, NativeAdListener {
    public final WeakReference b;

    /* renamed from: c, reason: collision with root package name */
    public final NativeAdBase f3458c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e f3459d;

    public d(e eVar, Context context, NativeAdBase nativeAdBase) {
        this.f3459d = eVar;
        this.f3458c = nativeAdBase;
        this.b = new WeakReference(context);
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdClicked(Ad ad) {
        e eVar = this.f3459d;
        eVar.f3462f.reportAdClicked();
        eVar.f3462f.onAdOpened();
        eVar.f3462f.onAdLeftApplication();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [com.google.android.gms.ads.formats.NativeAd$Image, V2.c] */
    @Override // com.facebook.ads.AdListener
    public final void onAdLoaded(Ad ad) {
        boolean z8;
        NativeAdBase nativeAdBase = this.f3458c;
        e eVar = this.f3459d;
        if (ad != nativeAdBase) {
            AdError adError = new AdError(106, "Ad Loaded is not a Native Ad.", FacebookMediationAdapter.ERROR_DOMAIN);
            Log.e(FacebookMediationAdapter.TAG, adError.getMessage());
            eVar.f3460c.onFailure(adError);
            return;
        }
        Context context = (Context) this.b.get();
        if (context == null) {
            AdError adError2 = new AdError(107, "Context is null.", FacebookMediationAdapter.ERROR_DOMAIN);
            Log.e(FacebookMediationAdapter.TAG, adError2.getMessage());
            eVar.f3460c.onFailure(adError2);
            return;
        }
        NativeAdBase nativeAdBase2 = eVar.f3461d;
        boolean z9 = false;
        if (nativeAdBase2.getAdHeadline() != null && nativeAdBase2.getAdBodyText() != null && nativeAdBase2.getAdIcon() != null && nativeAdBase2.getAdCallToAction() != null) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (!(nativeAdBase2 instanceof NativeBannerAd)) {
            if (z8 && nativeAdBase2.getAdCoverImage() != null && eVar.f3463g != null) {
                z9 = true;
            }
            z8 = z9;
        }
        MediationAdLoadCallback mediationAdLoadCallback = eVar.f3460c;
        if (!z8) {
            AdError adError3 = new AdError(108, "Ad from Meta Audience Network doesn't have all required assets.", FacebookMediationAdapter.ERROR_DOMAIN);
            String str = FacebookMediationAdapter.TAG;
            Log.w(str, adError3.getMessage());
            Log.w(str, adError3.getMessage());
            mediationAdLoadCallback.onFailure(adError3);
            return;
        }
        eVar.setHeadline(eVar.f3461d.getAdHeadline());
        if (eVar.f3461d.getAdCoverImage() != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new c(Uri.parse(eVar.f3461d.getAdCoverImage().getUrl())));
            eVar.setImages(arrayList);
        }
        eVar.setBody(eVar.f3461d.getAdBodyText());
        if (eVar.f3461d.getPreloadedIconViewDrawable() == null) {
            if (eVar.f3461d.getAdIcon() == null) {
                eVar.setIcon(new NativeAd.Image());
            } else {
                eVar.setIcon(new c(Uri.parse(eVar.f3461d.getAdIcon().getUrl())));
            }
        } else {
            Drawable preloadedIconViewDrawable = eVar.f3461d.getPreloadedIconViewDrawable();
            ?? image = new NativeAd.Image();
            image.f3457a = preloadedIconViewDrawable;
            eVar.setIcon(image);
        }
        eVar.setCallToAction(eVar.f3461d.getAdCallToAction());
        eVar.setAdvertiser(eVar.f3461d.getAdvertiserName());
        eVar.f3463g.setListener(new C2400c(eVar, 21));
        eVar.setHasVideoContent(true);
        eVar.setMediaView(eVar.f3463g);
        Bundle bundle = new Bundle();
        bundle.putCharSequence("id", eVar.f3461d.getId());
        bundle.putCharSequence(FacebookMediationAdapter.KEY_SOCIAL_CONTEXT_ASSET, eVar.f3461d.getAdSocialContext());
        eVar.setExtras(bundle);
        eVar.setAdChoicesContent(new AdOptionsView(context, eVar.f3461d, null));
        eVar.f3462f = (MediationNativeAdCallback) mediationAdLoadCallback.onSuccess(eVar);
    }

    @Override // com.facebook.ads.AdListener
    public final void onError(Ad ad, com.facebook.ads.AdError adError) {
        AdError adError2 = FacebookMediationAdapter.getAdError(adError);
        Log.w(FacebookMediationAdapter.TAG, adError2.getMessage());
        this.f3459d.f3460c.onFailure(adError2);
    }

    @Override // com.facebook.ads.NativeAdListener
    public final void onMediaDownloaded(Ad ad) {
        Log.d(FacebookMediationAdapter.TAG, "onMediaDownloaded");
    }

    @Override // com.facebook.ads.AdListener
    public final void onLoggingImpression(Ad ad) {
    }
}
