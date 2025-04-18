package z6;

import android.util.Log;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdLoadListener;
import com.google.ads.mediation.pangle.PangleMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;

/* loaded from: classes3.dex */
public final class l implements PAGRewardedAdLoadListener {
    public final /* synthetic */ b a;

    public l(b bVar) {
        this.a = bVar;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    public final void onAdLoaded(PAGRewardedAd pAGRewardedAd) {
        b bVar = this.a;
        m mVar = (m) bVar.f28526d;
        mVar.f28562g = (MediationRewardedAdCallback) mVar.f28559c.onSuccess(mVar);
        ((m) bVar.f28526d).f28563h = pAGRewardedAd;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.wN
    public final void onError(int i10, String str) {
        AdError j3 = com.bumptech.glide.d.j(i10, str);
        Log.w(PangleMediationAdapter.TAG, j3.toString());
        ((m) this.a.f28526d).f28559c.onFailure(j3);
    }
}
