package ih;

import android.util.Log;
import com.google.ads.mediation.vungle.VungleMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.vungle.ads.e1;
import com.vungle.ads.n3;
import com.vungle.ads.o0;
import com.vungle.mediation.VungleInterstitialAdapter;

/* loaded from: classes4.dex */
public final class b implements e1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ VungleInterstitialAdapter f19651b;

    public b(VungleInterstitialAdapter vungleInterstitialAdapter) {
        this.f19651b = vungleInterstitialAdapter;
    }

    @Override // com.vungle.ads.e1, com.vungle.ads.z0, com.vungle.ads.p0
    public final void onAdClicked(o0 o0Var) {
        MediationInterstitialListener mediationInterstitialListener;
        MediationInterstitialListener mediationInterstitialListener2;
        VungleInterstitialAdapter vungleInterstitialAdapter = this.f19651b;
        mediationInterstitialListener = vungleInterstitialAdapter.mediationInterstitialListener;
        if (mediationInterstitialListener != null) {
            mediationInterstitialListener2 = vungleInterstitialAdapter.mediationInterstitialListener;
            mediationInterstitialListener2.onAdClicked(vungleInterstitialAdapter);
        }
    }

    @Override // com.vungle.ads.e1, com.vungle.ads.z0, com.vungle.ads.p0
    public final void onAdEnd(o0 o0Var) {
        MediationInterstitialListener mediationInterstitialListener;
        MediationInterstitialListener mediationInterstitialListener2;
        VungleInterstitialAdapter vungleInterstitialAdapter = this.f19651b;
        mediationInterstitialListener = vungleInterstitialAdapter.mediationInterstitialListener;
        if (mediationInterstitialListener != null) {
            mediationInterstitialListener2 = vungleInterstitialAdapter.mediationInterstitialListener;
            mediationInterstitialListener2.onAdClosed(vungleInterstitialAdapter);
        }
    }

    @Override // com.vungle.ads.e1, com.vungle.ads.z0, com.vungle.ads.p0
    public final void onAdFailedToLoad(o0 o0Var, n3 n3Var) {
        MediationInterstitialListener mediationInterstitialListener;
        MediationInterstitialListener mediationInterstitialListener2;
        AdError adError = VungleMediationAdapter.getAdError(n3Var);
        Log.w(VungleMediationAdapter.TAG, adError.toString());
        VungleInterstitialAdapter vungleInterstitialAdapter = this.f19651b;
        mediationInterstitialListener = vungleInterstitialAdapter.mediationInterstitialListener;
        if (mediationInterstitialListener != null) {
            mediationInterstitialListener2 = vungleInterstitialAdapter.mediationInterstitialListener;
            mediationInterstitialListener2.onAdFailedToLoad(vungleInterstitialAdapter, adError);
        }
    }

    @Override // com.vungle.ads.e1, com.vungle.ads.z0, com.vungle.ads.p0
    public final void onAdFailedToPlay(o0 o0Var, n3 n3Var) {
        Log.w(VungleMediationAdapter.TAG, VungleMediationAdapter.getAdError(n3Var).toString());
    }

    @Override // com.vungle.ads.e1, com.vungle.ads.z0, com.vungle.ads.p0
    public final void onAdImpression(o0 o0Var) {
    }

    @Override // com.vungle.ads.e1, com.vungle.ads.z0, com.vungle.ads.p0
    public final void onAdLeftApplication(o0 o0Var) {
        MediationInterstitialListener mediationInterstitialListener;
        MediationInterstitialListener mediationInterstitialListener2;
        VungleInterstitialAdapter vungleInterstitialAdapter = this.f19651b;
        mediationInterstitialListener = vungleInterstitialAdapter.mediationInterstitialListener;
        if (mediationInterstitialListener != null) {
            mediationInterstitialListener2 = vungleInterstitialAdapter.mediationInterstitialListener;
            mediationInterstitialListener2.onAdLeftApplication(vungleInterstitialAdapter);
        }
    }

    @Override // com.vungle.ads.e1, com.vungle.ads.z0, com.vungle.ads.p0
    public final void onAdLoaded(o0 o0Var) {
        MediationInterstitialListener mediationInterstitialListener;
        MediationInterstitialListener mediationInterstitialListener2;
        VungleInterstitialAdapter vungleInterstitialAdapter = this.f19651b;
        mediationInterstitialListener = vungleInterstitialAdapter.mediationInterstitialListener;
        if (mediationInterstitialListener != null) {
            mediationInterstitialListener2 = vungleInterstitialAdapter.mediationInterstitialListener;
            mediationInterstitialListener2.onAdLoaded(vungleInterstitialAdapter);
        }
    }

    @Override // com.vungle.ads.e1, com.vungle.ads.z0, com.vungle.ads.p0
    public final void onAdStart(o0 o0Var) {
        MediationInterstitialListener mediationInterstitialListener;
        MediationInterstitialListener mediationInterstitialListener2;
        VungleInterstitialAdapter vungleInterstitialAdapter = this.f19651b;
        mediationInterstitialListener = vungleInterstitialAdapter.mediationInterstitialListener;
        if (mediationInterstitialListener != null) {
            mediationInterstitialListener2 = vungleInterstitialAdapter.mediationInterstitialListener;
            mediationInterstitialListener2.onAdOpened(vungleInterstitialAdapter);
        }
    }
}
