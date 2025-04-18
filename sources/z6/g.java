package z6;

import android.util.Log;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdLoadListener;
import com.google.ads.mediation.pangle.PangleMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;

/* loaded from: classes3.dex */
public final class g implements PAGInterstitialAdLoadListener {
    public final /* synthetic */ b a;

    public g(b bVar) {
        this.a = bVar;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    public final void onAdLoaded(PAGInterstitialAd pAGInterstitialAd) {
        b bVar = this.a;
        h hVar = (h) bVar.f28526d;
        hVar.f28546g = (MediationInterstitialAdCallback) hVar.f28543c.onSuccess(hVar);
        ((h) bVar.f28526d).f28547h = pAGInterstitialAd;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.wN
    public final void onError(int i10, String str) {
        AdError j3 = com.bumptech.glide.d.j(i10, str);
        Log.w(PangleMediationAdapter.TAG, j3.toString());
        ((h) this.a.f28526d).f28543c.onFailure(j3);
    }
}
