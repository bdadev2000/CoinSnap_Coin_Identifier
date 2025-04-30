package b3;

import android.util.Log;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdLoadListener;
import com.google.ads.mediation.pangle.PangleMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import w4.v0;

/* renamed from: b3.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0567l implements PAGRewardedAdLoadListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0557b f5310a;

    public C0567l(C0557b c0557b) {
        this.f5310a = c0557b;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    public final void onAdLoaded(PAGRewardedAd pAGRewardedAd) {
        C0557b c0557b = this.f5310a;
        C0568m c0568m = (C0568m) c0557b.f5279d;
        c0568m.f5314g = (MediationRewardedAdCallback) c0568m.f5311c.onSuccess(c0568m);
        ((C0568m) c0557b.f5279d).f5315h = pAGRewardedAd;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.KS
    public final void onError(int i9, String str) {
        AdError i10 = v0.i(i9, str);
        Log.w(PangleMediationAdapter.TAG, i10.toString());
        ((C0568m) this.f5310a.f5279d).f5311c.onFailure(i10);
    }
}
