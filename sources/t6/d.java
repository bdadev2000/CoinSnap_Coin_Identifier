package t6;

import android.content.Context;
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
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class d implements AdListener, NativeAdListener {

    /* renamed from: b, reason: collision with root package name */
    public final WeakReference f25278b;

    /* renamed from: c, reason: collision with root package name */
    public final NativeAdBase f25279c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e f25280d;

    public d(e eVar, Context context, NativeAdBase nativeAdBase) {
        this.f25280d = eVar;
        this.f25279c = nativeAdBase;
        this.f25278b = new WeakReference(context);
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdClicked(Ad ad2) {
        e eVar = this.f25280d;
        eVar.f25284f.reportAdClicked();
        eVar.f25284f.onAdOpened();
        eVar.f25284f.onAdLeftApplication();
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdLoaded(Ad ad2) {
        boolean z10;
        NativeAdBase nativeAdBase = this.f25279c;
        e eVar = this.f25280d;
        if (ad2 != nativeAdBase) {
            AdError adError = new AdError(106, "Ad Loaded is not a Native Ad.", FacebookMediationAdapter.ERROR_DOMAIN);
            Log.e(FacebookMediationAdapter.TAG, adError.getMessage());
            eVar.f25282c.onFailure(adError);
            return;
        }
        Context context = (Context) this.f25278b.get();
        if (context == null) {
            AdError adError2 = new AdError(107, "Context is null.", FacebookMediationAdapter.ERROR_DOMAIN);
            Log.e(FacebookMediationAdapter.TAG, adError2.getMessage());
            eVar.f25282c.onFailure(adError2);
            return;
        }
        fb.c cVar = new fb.c(this, 21);
        NativeAdBase nativeAdBase2 = eVar.f25283d;
        boolean z11 = false;
        if (nativeAdBase2.getAdHeadline() != null && nativeAdBase2.getAdBodyText() != null && nativeAdBase2.getAdIcon() != null && nativeAdBase2.getAdCallToAction() != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!(nativeAdBase2 instanceof NativeBannerAd)) {
            if (z10 && nativeAdBase2.getAdCoverImage() != null && eVar.f25285g != null) {
                z11 = true;
            }
            z10 = z11;
        }
        if (!z10) {
            AdError adError3 = new AdError(108, "Ad from Meta Audience Network doesn't have all required assets.", FacebookMediationAdapter.ERROR_DOMAIN);
            String str = FacebookMediationAdapter.TAG;
            Log.w(str, adError3.getMessage());
            Log.w(str, adError3.getMessage());
            ((d) cVar.f17773c).f25280d.f25282c.onFailure(adError3);
            return;
        }
        eVar.setHeadline(eVar.f25283d.getAdHeadline());
        if (eVar.f25283d.getAdCoverImage() != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new c(Uri.parse(eVar.f25283d.getAdCoverImage().getUrl())));
            eVar.setImages(arrayList);
        }
        eVar.setBody(eVar.f25283d.getAdBodyText());
        if (eVar.f25283d.getPreloadedIconViewDrawable() == null) {
            if (eVar.f25283d.getAdIcon() == null) {
                eVar.setIcon(new c());
            } else {
                eVar.setIcon(new c(Uri.parse(eVar.f25283d.getAdIcon().getUrl())));
            }
        } else {
            eVar.setIcon(new c(eVar.f25283d.getPreloadedIconViewDrawable()));
        }
        eVar.setCallToAction(eVar.f25283d.getAdCallToAction());
        eVar.setAdvertiser(eVar.f25283d.getAdvertiserName());
        eVar.f25285g.setListener(new v3.c(eVar, 24));
        eVar.setHasVideoContent(true);
        eVar.setMediaView(eVar.f25285g);
        Bundle bundle = new Bundle();
        bundle.putCharSequence("id", eVar.f25283d.getId());
        bundle.putCharSequence(FacebookMediationAdapter.KEY_SOCIAL_CONTEXT_ASSET, eVar.f25283d.getAdSocialContext());
        eVar.setExtras(bundle);
        eVar.setAdChoicesContent(new AdOptionsView(context, eVar.f25283d, null));
        e eVar2 = ((d) cVar.f17773c).f25280d;
        eVar2.f25284f = (MediationNativeAdCallback) eVar2.f25282c.onSuccess(eVar2);
    }

    @Override // com.facebook.ads.AdListener
    public final void onError(Ad ad2, com.facebook.ads.AdError adError) {
        AdError adError2 = FacebookMediationAdapter.getAdError(adError);
        Log.w(FacebookMediationAdapter.TAG, adError2.getMessage());
        this.f25280d.f25282c.onFailure(adError2);
    }

    @Override // com.facebook.ads.AdListener
    public final void onLoggingImpression(Ad ad2) {
    }

    @Override // com.facebook.ads.NativeAdListener
    public final void onMediaDownloaded(Ad ad2) {
        Log.d(FacebookMediationAdapter.TAG, "onMediaDownloaded");
    }
}
