package ih;

import android.util.Log;
import com.google.ads.mediation.vungle.VungleMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.vungle.ads.b0;
import com.vungle.ads.n3;
import com.vungle.ads.o0;
import com.vungle.mediation.VungleInterstitialAdapter;

/* loaded from: classes4.dex */
public final class a implements b0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ VungleInterstitialAdapter f19650b;

    public a(VungleInterstitialAdapter vungleInterstitialAdapter) {
        this.f19650b = vungleInterstitialAdapter;
    }

    @Override // com.vungle.ads.b0, com.vungle.ads.p0
    public final void onAdClicked(o0 o0Var) {
        MediationBannerListener mediationBannerListener;
        MediationBannerListener mediationBannerListener2;
        MediationBannerListener mediationBannerListener3;
        VungleInterstitialAdapter vungleInterstitialAdapter = this.f19650b;
        mediationBannerListener = vungleInterstitialAdapter.mediationBannerListener;
        if (mediationBannerListener != null) {
            mediationBannerListener2 = vungleInterstitialAdapter.mediationBannerListener;
            mediationBannerListener2.onAdClicked(vungleInterstitialAdapter);
            mediationBannerListener3 = vungleInterstitialAdapter.mediationBannerListener;
            mediationBannerListener3.onAdOpened(vungleInterstitialAdapter);
        }
    }

    @Override // com.vungle.ads.b0, com.vungle.ads.p0
    public final void onAdEnd(o0 o0Var) {
    }

    @Override // com.vungle.ads.b0, com.vungle.ads.p0
    public final void onAdFailedToLoad(o0 o0Var, n3 n3Var) {
        MediationBannerListener mediationBannerListener;
        MediationBannerListener mediationBannerListener2;
        AdError adError = VungleMediationAdapter.getAdError(n3Var);
        Log.w(VungleMediationAdapter.TAG, adError.toString());
        VungleInterstitialAdapter vungleInterstitialAdapter = this.f19650b;
        mediationBannerListener = vungleInterstitialAdapter.mediationBannerListener;
        if (mediationBannerListener != null) {
            mediationBannerListener2 = vungleInterstitialAdapter.mediationBannerListener;
            mediationBannerListener2.onAdFailedToLoad(vungleInterstitialAdapter, adError);
        }
    }

    @Override // com.vungle.ads.b0, com.vungle.ads.p0
    public final void onAdFailedToPlay(o0 o0Var, n3 n3Var) {
        Log.w(VungleMediationAdapter.TAG, VungleMediationAdapter.getAdError(n3Var).toString());
    }

    @Override // com.vungle.ads.b0, com.vungle.ads.p0
    public final void onAdImpression(o0 o0Var) {
    }

    @Override // com.vungle.ads.b0, com.vungle.ads.p0
    public final void onAdLeftApplication(o0 o0Var) {
        MediationBannerListener mediationBannerListener;
        MediationBannerListener mediationBannerListener2;
        VungleInterstitialAdapter vungleInterstitialAdapter = this.f19650b;
        mediationBannerListener = vungleInterstitialAdapter.mediationBannerListener;
        if (mediationBannerListener != null) {
            mediationBannerListener2 = vungleInterstitialAdapter.mediationBannerListener;
            mediationBannerListener2.onAdLeftApplication(vungleInterstitialAdapter);
        }
    }

    @Override // com.vungle.ads.b0, com.vungle.ads.p0
    public final void onAdLoaded(o0 o0Var) {
        this.f19650b.createBanner();
    }

    @Override // com.vungle.ads.b0, com.vungle.ads.p0
    public final void onAdStart(o0 o0Var) {
    }
}
