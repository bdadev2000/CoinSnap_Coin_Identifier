package b3;

import android.util.Log;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdLoadListener;
import com.google.ads.mediation.pangle.PangleMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import w4.v0;

/* renamed from: b3.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0559d implements PAGBannerAdLoadListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0560e f5285a;

    public C0559d(C0560e c0560e) {
        this.f5285a = c0560e;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    public final void onAdLoaded(PAGBannerAd pAGBannerAd) {
        PAGBannerAd pAGBannerAd2 = pAGBannerAd;
        C0560e c0560e = this.f5285a;
        pAGBannerAd2.setAdInteractionListener(c0560e.f5288d);
        C0561f c0561f = c0560e.f5288d;
        c0561f.f5293h.addView(pAGBannerAd2.getBannerView());
        c0561f.f5292g = (MediationBannerAdCallback) c0561f.f5289c.onSuccess(c0561f);
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.KS
    public final void onError(int i9, String str) {
        AdError i10 = v0.i(i9, str);
        Log.w(PangleMediationAdapter.TAG, i10.toString());
        this.f5285a.f5288d.f5289c.onFailure(i10);
    }
}
