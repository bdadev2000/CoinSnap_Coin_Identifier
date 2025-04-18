package z6;

import android.util.Log;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAd;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdLoadListener;
import com.google.ads.mediation.pangle.PangleMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAppOpenAdCallback;

/* loaded from: classes3.dex */
public final class a implements PAGAppOpenAdLoadListener {
    public final /* synthetic */ b a;

    public a(b bVar) {
        this.a = bVar;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    public final void onAdLoaded(PAGAppOpenAd pAGAppOpenAd) {
        b bVar = this.a;
        c cVar = (c) bVar.f28526d;
        cVar.f28531g = (MediationAppOpenAdCallback) cVar.f28528c.onSuccess(cVar);
        ((c) bVar.f28526d).f28532h = pAGAppOpenAd;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.wN
    public final void onError(int i10, String str) {
        AdError j3 = com.bumptech.glide.d.j(i10, str);
        Log.w(PangleMediationAdapter.TAG, j3.toString());
        ((c) this.a.f28526d).f28528c.onFailure(j3);
    }
}
