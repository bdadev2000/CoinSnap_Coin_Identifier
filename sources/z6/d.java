package z6;

import android.util.Log;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdLoadListener;
import com.google.ads.mediation.pangle.PangleMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;

/* loaded from: classes3.dex */
public final class d implements PAGBannerAdLoadListener {
    public final /* synthetic */ e a;

    public d(e eVar) {
        this.a = eVar;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    public final void onAdLoaded(PAGBannerAd pAGBannerAd) {
        PAGBannerAd pAGBannerAd2 = pAGBannerAd;
        e eVar = this.a;
        pAGBannerAd2.setAdInteractionListener(eVar.f28535d);
        f fVar = eVar.f28535d;
        fVar.f28541h.addView(pAGBannerAd2.getBannerView());
        fVar.f28540g = (MediationBannerAdCallback) fVar.f28537c.onSuccess(fVar);
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.wN
    public final void onError(int i10, String str) {
        AdError j3 = com.bumptech.glide.d.j(i10, str);
        Log.w(PangleMediationAdapter.TAG, j3.toString());
        this.a.f28535d.f28537c.onFailure(j3);
    }
}
