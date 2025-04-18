package z6;

import android.net.Uri;
import android.util.Log;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdLoadListener;
import com.google.ads.mediation.pangle.PangleMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;

/* loaded from: classes3.dex */
public final class i implements PAGNativeAdLoadListener {
    public final /* synthetic */ b a;

    public i(b bVar) {
        this.a = bVar;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    public final void onAdLoaded(PAGNativeAd pAGNativeAd) {
        PAGNativeAd pAGNativeAd2 = pAGNativeAd;
        b bVar = this.a;
        k kVar = (k) bVar.f28526d;
        kVar.f28557j = pAGNativeAd2;
        PAGNativeAdData nativeAdData = pAGNativeAd2.getNativeAdData();
        kVar.setHeadline(nativeAdData.getTitle());
        kVar.setBody(nativeAdData.getDescription());
        kVar.setCallToAction(nativeAdData.getButtonText());
        if (nativeAdData.getIcon() != null) {
            kVar.setIcon(new j(Uri.parse(nativeAdData.getIcon().getImageUrl())));
        }
        kVar.setOverrideClickHandling(true);
        kVar.setMediaView(nativeAdData.getMediaView());
        kVar.setAdChoicesContent(nativeAdData.getAdLogoView());
        k kVar2 = (k) bVar.f28526d;
        kVar2.f28556i = (MediationNativeAdCallback) kVar2.f28551c.onSuccess(kVar2);
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.wN
    public final void onError(int i10, String str) {
        AdError j3 = com.bumptech.glide.d.j(i10, str);
        Log.w(PangleMediationAdapter.TAG, j3.toString());
        ((k) this.a.f28526d).f28551c.onFailure(j3);
    }
}
