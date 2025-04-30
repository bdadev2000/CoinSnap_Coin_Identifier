package b3;

import android.net.Uri;
import android.util.Log;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdLoadListener;
import com.google.ads.mediation.pangle.PangleMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import w4.v0;

/* renamed from: b3.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0564i implements PAGNativeAdLoadListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0557b f5300a;

    public C0564i(C0557b c0557b) {
        this.f5300a = c0557b;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    public final void onAdLoaded(PAGNativeAd pAGNativeAd) {
        PAGNativeAd pAGNativeAd2 = pAGNativeAd;
        C0557b c0557b = this.f5300a;
        C0566k c0566k = (C0566k) c0557b.f5279d;
        c0566k.f5309j = pAGNativeAd2;
        PAGNativeAdData nativeAdData = pAGNativeAd2.getNativeAdData();
        c0566k.setHeadline(nativeAdData.getTitle());
        c0566k.setBody(nativeAdData.getDescription());
        c0566k.setCallToAction(nativeAdData.getButtonText());
        if (nativeAdData.getIcon() != null) {
            c0566k.setIcon(new C0565j(Uri.parse(nativeAdData.getIcon().getImageUrl())));
        }
        c0566k.setOverrideClickHandling(true);
        c0566k.setMediaView(nativeAdData.getMediaView());
        c0566k.setAdChoicesContent(nativeAdData.getAdLogoView());
        C0566k c0566k2 = (C0566k) c0557b.f5279d;
        c0566k2.f5308i = (MediationNativeAdCallback) c0566k2.f5303c.onSuccess(c0566k2);
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.KS
    public final void onError(int i9, String str) {
        AdError i10 = v0.i(i9, str);
        Log.w(PangleMediationAdapter.TAG, i10.toString());
        ((C0566k) this.f5300a.f5279d).f5303c.onFailure(i10);
    }
}
