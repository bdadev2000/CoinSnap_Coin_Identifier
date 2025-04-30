package Y2;

import android.content.Context;
import android.util.Log;
import com.applovin.mediation.AppLovinExtras;
import com.google.ads.mediation.mintegral.MintegralMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.mbridge.msdk.out.BaseExtraInterfaceForHandler;
import com.mbridge.msdk.out.MBBidRewardVideoHandler;
import com.mbridge.msdk.out.MBRewardVideoHandler;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.out.RewardInfo;
import com.mbridge.msdk.out.RewardVideoWithCodeListener;
import n1.C2475f;

/* loaded from: classes.dex */
public final class e extends RewardVideoWithCodeListener implements MediationRewardedAd {
    public final MediationRewardedAdConfiguration b;

    /* renamed from: c, reason: collision with root package name */
    public final MediationAdLoadCallback f3767c;

    /* renamed from: d, reason: collision with root package name */
    public MediationRewardedAdCallback f3768d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f3769f;

    /* renamed from: g, reason: collision with root package name */
    public BaseExtraInterfaceForHandler f3770g;

    public e(MediationRewardedAdConfiguration mediationRewardedAdConfiguration, MediationAdLoadCallback mediationAdLoadCallback, int i9) {
        this.f3769f = i9;
        this.b = mediationRewardedAdConfiguration;
        this.f3767c = mediationAdLoadCallback;
    }

    @Override // com.mbridge.msdk.out.RewardVideoListener, com.mbridge.msdk.video.bt.module.b.g
    public final void onAdClose(MBridgeIds mBridgeIds, RewardInfo rewardInfo) {
        if (this.f3768d == null) {
            return;
        }
        if (rewardInfo != null && rewardInfo.isCompleteView()) {
            this.f3768d.onUserEarnedReward(new C2475f(rewardInfo, 20));
        } else {
            Log.w(MintegralMediationAdapter.TAG, "Mintegral SDK failed to reward user due to missing rewarded settings or rewarded ad playback not completed.");
        }
        this.f3768d.onAdClosed();
    }

    @Override // com.mbridge.msdk.out.RewardVideoListener, com.mbridge.msdk.video.bt.module.b.g
    public final void onAdShow(MBridgeIds mBridgeIds) {
        MediationRewardedAdCallback mediationRewardedAdCallback = this.f3768d;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onAdOpened();
            this.f3768d.reportAdImpression();
        }
    }

    @Override // com.mbridge.msdk.out.RewardVideoWithCodeListener
    public final void onShowFailWithCode(MBridgeIds mBridgeIds, int i9, String str) {
        AdError l = android.support.v4.media.session.a.l(i9, str);
        Log.w(MintegralMediationAdapter.TAG, l.toString());
        MediationRewardedAdCallback mediationRewardedAdCallback = this.f3768d;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onAdFailedToShow(l);
        }
    }

    @Override // com.mbridge.msdk.out.RewardVideoListener, com.mbridge.msdk.video.bt.module.b.g
    public final void onVideoAdClicked(MBridgeIds mBridgeIds) {
        MediationRewardedAdCallback mediationRewardedAdCallback = this.f3768d;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.reportAdClicked();
        }
    }

    @Override // com.mbridge.msdk.out.RewardVideoWithCodeListener
    public final void onVideoLoadFailWithCode(MBridgeIds mBridgeIds, int i9, String str) {
        AdError l = android.support.v4.media.session.a.l(i9, str);
        Log.w(MintegralMediationAdapter.TAG, l.toString());
        this.f3767c.onFailure(l);
    }

    @Override // com.mbridge.msdk.out.RewardVideoListener, com.mbridge.msdk.video.bt.module.b.g
    public final void onVideoLoadSuccess(MBridgeIds mBridgeIds) {
        this.f3768d = (MediationRewardedAdCallback) this.f3767c.onSuccess(this);
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAd
    public final void showAd(Context context) {
        int i9 = 2;
        MediationRewardedAdConfiguration mediationRewardedAdConfiguration = this.b;
        switch (this.f3769f) {
            case 0:
                boolean z8 = mediationRewardedAdConfiguration.getMediationExtras().getBoolean(AppLovinExtras.Keys.MUTE_AUDIO);
                MBBidRewardVideoHandler mBBidRewardVideoHandler = (MBBidRewardVideoHandler) this.f3770g;
                if (z8) {
                    i9 = 1;
                }
                mBBidRewardVideoHandler.playVideoMute(i9);
                ((MBBidRewardVideoHandler) this.f3770g).showFromBid();
                return;
            default:
                boolean z9 = mediationRewardedAdConfiguration.getMediationExtras().getBoolean(AppLovinExtras.Keys.MUTE_AUDIO);
                MBRewardVideoHandler mBRewardVideoHandler = (MBRewardVideoHandler) this.f3770g;
                if (z9) {
                    i9 = 1;
                }
                mBRewardVideoHandler.playVideoMute(i9);
                ((MBRewardVideoHandler) this.f3770g).show();
                return;
        }
    }

    @Override // com.mbridge.msdk.out.RewardVideoListener, com.mbridge.msdk.video.bt.module.b.g
    public final void onEndcardShow(MBridgeIds mBridgeIds) {
    }

    @Override // com.mbridge.msdk.out.RewardVideoListener, com.mbridge.msdk.video.bt.module.b.g
    public final void onLoadSuccess(MBridgeIds mBridgeIds) {
    }

    @Override // com.mbridge.msdk.out.RewardVideoListener, com.mbridge.msdk.video.bt.module.b.g
    public final void onVideoComplete(MBridgeIds mBridgeIds) {
    }
}
