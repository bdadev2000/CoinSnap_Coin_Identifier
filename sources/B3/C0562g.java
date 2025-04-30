package b3;

import android.util.Log;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdLoadListener;
import com.google.ads.mediation.pangle.PangleMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import w4.v0;

/* renamed from: b3.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0562g implements PAGInterstitialAdLoadListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0557b f5294a;

    public C0562g(C0557b c0557b) {
        this.f5294a = c0557b;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    public final void onAdLoaded(PAGInterstitialAd pAGInterstitialAd) {
        C0557b c0557b = this.f5294a;
        C0563h c0563h = (C0563h) c0557b.f5279d;
        c0563h.f5298g = (MediationInterstitialAdCallback) c0563h.f5295c.onSuccess(c0563h);
        ((C0563h) c0557b.f5279d).f5299h = pAGInterstitialAd;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.KS
    public final void onError(int i9, String str) {
        AdError i10 = v0.i(i9, str);
        Log.w(PangleMediationAdapter.TAG, i10.toString());
        ((C0563h) this.f5294a.f5279d).f5295c.onFailure(i10);
    }
}
