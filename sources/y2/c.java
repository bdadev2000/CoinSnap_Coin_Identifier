package Y2;

import android.content.Context;
import android.util.Log;
import com.applovin.mediation.AppLovinExtras;
import com.google.ads.mediation.mintegral.MintegralMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.mbridge.msdk.newinterstitial.out.MBBidNewInterstitialHandler;
import com.mbridge.msdk.newinterstitial.out.MBNewInterstitialHandler;
import com.mbridge.msdk.newinterstitial.out.NewInterstitialWithCodeListener;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.out.RewardInfo;
import n1.C2475f;

/* loaded from: classes.dex */
public final class c extends NewInterstitialWithCodeListener implements MediationInterstitialAd {
    public final MediationInterstitialAdConfiguration b;

    /* renamed from: c, reason: collision with root package name */
    public final MediationAdLoadCallback f3762c;

    /* renamed from: d, reason: collision with root package name */
    public MediationInterstitialAdCallback f3763d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f3764f;

    /* renamed from: g, reason: collision with root package name */
    public Object f3765g;

    public c(MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, MediationAdLoadCallback mediationAdLoadCallback, int i9) {
        this.f3764f = i9;
        this.b = mediationInterstitialAdConfiguration;
        this.f3762c = mediationAdLoadCallback;
    }

    @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
    public final void onAdClicked(MBridgeIds mBridgeIds) {
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.f3763d;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.reportAdClicked();
        }
    }

    @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
    public final void onAdClose(MBridgeIds mBridgeIds, RewardInfo rewardInfo) {
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.f3763d;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdClosed();
        }
    }

    @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
    public final void onAdShow(MBridgeIds mBridgeIds) {
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.f3763d;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdOpened();
            this.f3763d.reportAdImpression();
        }
    }

    @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialWithCodeListener
    public final void onResourceLoadFailWithCode(MBridgeIds mBridgeIds, int i9, String str) {
        AdError l = android.support.v4.media.session.a.l(i9, str);
        Log.w(MintegralMediationAdapter.TAG, l.toString());
        this.f3762c.onFailure(l);
    }

    @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
    public final void onResourceLoadSuccess(MBridgeIds mBridgeIds) {
        this.f3763d = (MediationInterstitialAdCallback) this.f3762c.onSuccess(this);
    }

    @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialWithCodeListener
    public final void onShowFailWithCode(MBridgeIds mBridgeIds, int i9, String str) {
        AdError l = android.support.v4.media.session.a.l(i9, str);
        Log.w(MintegralMediationAdapter.TAG, l.toString());
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.f3763d;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdFailedToShow(l);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAd
    public final void showAd(Context context) {
        int i9 = 2;
        MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration = this.b;
        switch (this.f3764f) {
            case 0:
                boolean z8 = mediationInterstitialAdConfiguration.getMediationExtras().getBoolean(AppLovinExtras.Keys.MUTE_AUDIO);
                C2475f c2475f = (C2475f) this.f3765g;
                if (z8) {
                    i9 = 1;
                }
                MBBidNewInterstitialHandler mBBidNewInterstitialHandler = (MBBidNewInterstitialHandler) c2475f.f21833c;
                if (mBBidNewInterstitialHandler != null) {
                    mBBidNewInterstitialHandler.playVideoMute(i9);
                }
                MBBidNewInterstitialHandler mBBidNewInterstitialHandler2 = (MBBidNewInterstitialHandler) ((C2475f) this.f3765g).f21833c;
                if (mBBidNewInterstitialHandler2 != null) {
                    mBBidNewInterstitialHandler2.showFromBid();
                    return;
                }
                return;
            default:
                boolean z9 = mediationInterstitialAdConfiguration.getMediationExtras().getBoolean(AppLovinExtras.Keys.MUTE_AUDIO);
                E1.c cVar = (E1.c) this.f3765g;
                if (z9) {
                    i9 = 1;
                }
                MBNewInterstitialHandler mBNewInterstitialHandler = (MBNewInterstitialHandler) cVar.f972c;
                if (mBNewInterstitialHandler != null) {
                    mBNewInterstitialHandler.playVideoMute(i9);
                }
                MBNewInterstitialHandler mBNewInterstitialHandler2 = (MBNewInterstitialHandler) ((E1.c) this.f3765g).f972c;
                if (mBNewInterstitialHandler2 != null) {
                    mBNewInterstitialHandler2.show();
                    return;
                }
                return;
        }
    }

    @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
    public final void onEndcardShow(MBridgeIds mBridgeIds) {
    }

    @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
    public final void onLoadCampaignSuccess(MBridgeIds mBridgeIds) {
    }

    @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
    public final void onVideoComplete(MBridgeIds mBridgeIds) {
    }

    @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
    public final void onAdCloseWithNIReward(MBridgeIds mBridgeIds, RewardInfo rewardInfo) {
    }
}
