package v6;

import android.util.Log;
import com.google.ads.mediation.mintegral.MintegralMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.mbridge.msdk.newinterstitial.out.NewInterstitialWithCodeListener;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.out.RewardInfo;

/* loaded from: classes3.dex */
public abstract class c extends NewInterstitialWithCodeListener implements MediationInterstitialAd {

    /* renamed from: b, reason: collision with root package name */
    public final MediationInterstitialAdConfiguration f26051b;

    /* renamed from: c, reason: collision with root package name */
    public final MediationAdLoadCallback f26052c;

    /* renamed from: d, reason: collision with root package name */
    public MediationInterstitialAdCallback f26053d;

    public c(MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, MediationAdLoadCallback mediationAdLoadCallback) {
        this.f26051b = mediationInterstitialAdConfiguration;
        this.f26052c = mediationAdLoadCallback;
    }

    @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
    public final void onAdClicked(MBridgeIds mBridgeIds) {
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.f26053d;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.reportAdClicked();
        }
    }

    @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
    public final void onAdClose(MBridgeIds mBridgeIds, RewardInfo rewardInfo) {
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.f26053d;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdClosed();
        }
    }

    @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
    public final void onAdCloseWithNIReward(MBridgeIds mBridgeIds, RewardInfo rewardInfo) {
    }

    @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
    public final void onAdShow(MBridgeIds mBridgeIds) {
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.f26053d;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdOpened();
            this.f26053d.reportAdImpression();
        }
    }

    @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
    public final void onEndcardShow(MBridgeIds mBridgeIds) {
    }

    @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
    public final void onLoadCampaignSuccess(MBridgeIds mBridgeIds) {
    }

    @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialWithCodeListener
    public final void onResourceLoadFailWithCode(MBridgeIds mBridgeIds, int i10, String str) {
        AdError h10 = c6.c.h(i10, str);
        Log.w(MintegralMediationAdapter.TAG, h10.toString());
        this.f26052c.onFailure(h10);
    }

    @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
    public final void onResourceLoadSuccess(MBridgeIds mBridgeIds) {
        this.f26053d = (MediationInterstitialAdCallback) this.f26052c.onSuccess(this);
    }

    @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialWithCodeListener
    public final void onShowFailWithCode(MBridgeIds mBridgeIds, int i10, String str) {
        AdError h10 = c6.c.h(i10, str);
        Log.w(MintegralMediationAdapter.TAG, h10.toString());
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.f26053d;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdFailedToShow(h10);
        }
    }

    @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
    public final void onVideoComplete(MBridgeIds mBridgeIds) {
    }
}
