package e3;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import c3.C0603a;
import c3.C0605c;
import com.google.ads.mediation.vungle.VungleMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.vungle.ads.C2073d;
import com.vungle.ads.J0;
import com.vungle.ads.L0;
import com.vungle.ads.P;
import com.vungle.ads.o1;

/* loaded from: classes.dex */
public final class j implements MediationRewardedAd, L0 {
    public final MediationRewardedAdConfiguration b;

    /* renamed from: c, reason: collision with root package name */
    public final MediationAdLoadCallback f20106c;

    /* renamed from: d, reason: collision with root package name */
    public MediationRewardedAdCallback f20107d;

    /* renamed from: f, reason: collision with root package name */
    public J0 f20108f;

    /* renamed from: g, reason: collision with root package name */
    public final C0603a f20109g;

    public j(MediationRewardedAdConfiguration mediationRewardedAdConfiguration, MediationAdLoadCallback mediationAdLoadCallback, C0603a c0603a) {
        this.b = mediationRewardedAdConfiguration;
        this.f20106c = mediationAdLoadCallback;
        this.f20109g = c0603a;
    }

    public final void a() {
        MediationRewardedAdConfiguration mediationRewardedAdConfiguration = this.b;
        Bundle mediationExtras = mediationRewardedAdConfiguration.getMediationExtras();
        Bundle serverParameters = mediationRewardedAdConfiguration.getServerParameters();
        String string = mediationExtras.getString("userId");
        String string2 = serverParameters.getString("appid");
        boolean isEmpty = TextUtils.isEmpty(string2);
        MediationAdLoadCallback mediationAdLoadCallback = this.f20106c;
        if (isEmpty) {
            AdError adError = new AdError(101, "Failed to load bidding rewarded ad from Liftoff Monetize. Missing or invalid App ID configured for this ad source instance in the AdMob or Ad Manager UI.", VungleMediationAdapter.ERROR_DOMAIN);
            Log.w(VungleMediationAdapter.TAG, adError.toString());
            mediationAdLoadCallback.onFailure(adError);
            return;
        }
        String string3 = serverParameters.getString("placementID");
        if (TextUtils.isEmpty(string3)) {
            AdError adError2 = new AdError(101, "Failed to load bidding rewarded ad from Liftoff Monetize. Missing or invalid Placement ID configured for this ad source instance in the AdMob or Ad Manager UI.", VungleMediationAdapter.ERROR_DOMAIN);
            Log.w(VungleMediationAdapter.TAG, adError2.toString());
            mediationAdLoadCallback.onFailure(adError2);
            return;
        }
        String bidResponse = mediationRewardedAdConfiguration.getBidResponse();
        this.f20109g.getClass();
        C2073d c2073d = new C2073d();
        if (mediationExtras.containsKey("adOrientation")) {
            c2073d.setAdOrientation(mediationExtras.getInt("adOrientation", 2));
        }
        String watermark = mediationRewardedAdConfiguration.getWatermark();
        if (!TextUtils.isEmpty(watermark)) {
            c2073d.setWatermark(watermark);
        }
        Context context = mediationRewardedAdConfiguration.getContext();
        C0605c.f5405c.a(string2, context, new i(this, context, string3, c2073d, string, bidResponse));
    }

    @Override // com.vungle.ads.L0, com.vungle.ads.InterfaceC2070b0, com.vungle.ads.Q
    public final void onAdClicked(P p2) {
        MediationRewardedAdCallback mediationRewardedAdCallback = this.f20107d;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.reportAdClicked();
        }
    }

    @Override // com.vungle.ads.L0, com.vungle.ads.InterfaceC2070b0, com.vungle.ads.Q
    public final void onAdEnd(P p2) {
        MediationRewardedAdCallback mediationRewardedAdCallback = this.f20107d;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onAdClosed();
        }
    }

    @Override // com.vungle.ads.L0, com.vungle.ads.InterfaceC2070b0, com.vungle.ads.Q
    public final void onAdFailedToLoad(P p2, o1 o1Var) {
        AdError adError = VungleMediationAdapter.getAdError(o1Var);
        Log.w(VungleMediationAdapter.TAG, adError.toString());
        this.f20106c.onFailure(adError);
    }

    @Override // com.vungle.ads.L0, com.vungle.ads.InterfaceC2070b0, com.vungle.ads.Q
    public final void onAdFailedToPlay(P p2, o1 o1Var) {
        AdError adError = VungleMediationAdapter.getAdError(o1Var);
        Log.w(VungleMediationAdapter.TAG, adError.toString());
        MediationRewardedAdCallback mediationRewardedAdCallback = this.f20107d;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onAdFailedToShow(adError);
        }
    }

    @Override // com.vungle.ads.L0, com.vungle.ads.InterfaceC2070b0, com.vungle.ads.Q
    public final void onAdImpression(P p2) {
        MediationRewardedAdCallback mediationRewardedAdCallback = this.f20107d;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onVideoStart();
            this.f20107d.reportAdImpression();
        }
    }

    @Override // com.vungle.ads.L0, com.vungle.ads.InterfaceC2070b0, com.vungle.ads.Q
    public final void onAdLoaded(P p2) {
        this.f20107d = (MediationRewardedAdCallback) this.f20106c.onSuccess(this);
    }

    @Override // com.vungle.ads.L0
    public final void onAdRewarded(P p2) {
        MediationRewardedAdCallback mediationRewardedAdCallback = this.f20107d;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onVideoComplete();
            this.f20107d.onUserEarnedReward(new R3.e(18));
        }
    }

    @Override // com.vungle.ads.L0, com.vungle.ads.InterfaceC2070b0, com.vungle.ads.Q
    public final void onAdStart(P p2) {
        MediationRewardedAdCallback mediationRewardedAdCallback = this.f20107d;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onAdOpened();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAd
    public final void showAd(Context context) {
        J0 j02 = this.f20108f;
        if (j02 != null) {
            j02.play(context);
        } else if (this.f20107d != null) {
            AdError adError = new AdError(107, "Failed to show bidding rewardedad from Liftoff Monetize.", VungleMediationAdapter.ERROR_DOMAIN);
            Log.w(VungleMediationAdapter.TAG, adError.toString());
            this.f20107d.onAdFailedToShow(adError);
        }
    }

    @Override // com.vungle.ads.L0, com.vungle.ads.InterfaceC2070b0, com.vungle.ads.Q
    public final void onAdLeftApplication(P p2) {
    }
}
