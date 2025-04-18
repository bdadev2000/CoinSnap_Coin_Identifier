package v6;

import android.util.Log;
import com.google.ads.mediation.mintegral.MintegralMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.out.RewardInfo;
import com.mbridge.msdk.out.RewardVideoWithCodeListener;

/* loaded from: classes3.dex */
public abstract class g extends RewardVideoWithCodeListener implements MediationRewardedAd {

    /* renamed from: b, reason: collision with root package name */
    public final MediationRewardedAdConfiguration f26062b;

    /* renamed from: c, reason: collision with root package name */
    public final MediationAdLoadCallback f26063c;

    /* renamed from: d, reason: collision with root package name */
    public MediationRewardedAdCallback f26064d;

    public g(MediationRewardedAdConfiguration mediationRewardedAdConfiguration, MediationAdLoadCallback mediationAdLoadCallback) {
        this.f26062b = mediationRewardedAdConfiguration;
        this.f26063c = mediationAdLoadCallback;
    }

    @Override // com.mbridge.msdk.out.RewardVideoListener, com.mbridge.msdk.video.bt.module.b.g
    public final void onAdClose(MBridgeIds mBridgeIds, RewardInfo rewardInfo) {
        if (this.f26064d == null) {
            return;
        }
        if (rewardInfo != null && rewardInfo.isCompleteView()) {
            this.f26064d.onUserEarnedReward(new r4.c(4, this, rewardInfo));
        } else {
            Log.w(MintegralMediationAdapter.TAG, "Mintegral SDK failed to reward user due to missing rewarded settings or rewarded ad playback not completed.");
        }
        this.f26064d.onAdClosed();
    }

    @Override // com.mbridge.msdk.out.RewardVideoListener, com.mbridge.msdk.video.bt.module.b.g
    public final void onAdShow(MBridgeIds mBridgeIds) {
        MediationRewardedAdCallback mediationRewardedAdCallback = this.f26064d;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onAdOpened();
            this.f26064d.reportAdImpression();
        }
    }

    @Override // com.mbridge.msdk.out.RewardVideoListener, com.mbridge.msdk.video.bt.module.b.g
    public final void onEndcardShow(MBridgeIds mBridgeIds) {
    }

    @Override // com.mbridge.msdk.out.RewardVideoListener, com.mbridge.msdk.video.bt.module.b.g
    public final void onLoadSuccess(MBridgeIds mBridgeIds) {
    }

    @Override // com.mbridge.msdk.out.RewardVideoWithCodeListener
    public final void onShowFailWithCode(MBridgeIds mBridgeIds, int i10, String str) {
        AdError h10 = c6.c.h(i10, str);
        Log.w(MintegralMediationAdapter.TAG, h10.toString());
        MediationRewardedAdCallback mediationRewardedAdCallback = this.f26064d;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onAdFailedToShow(h10);
        }
    }

    @Override // com.mbridge.msdk.out.RewardVideoListener, com.mbridge.msdk.video.bt.module.b.g
    public final void onVideoAdClicked(MBridgeIds mBridgeIds) {
        MediationRewardedAdCallback mediationRewardedAdCallback = this.f26064d;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.reportAdClicked();
        }
    }

    @Override // com.mbridge.msdk.out.RewardVideoListener, com.mbridge.msdk.video.bt.module.b.g
    public final void onVideoComplete(MBridgeIds mBridgeIds) {
    }

    @Override // com.mbridge.msdk.out.RewardVideoWithCodeListener
    public final void onVideoLoadFailWithCode(MBridgeIds mBridgeIds, int i10, String str) {
        AdError h10 = c6.c.h(i10, str);
        Log.w(MintegralMediationAdapter.TAG, h10.toString());
        this.f26063c.onFailure(h10);
    }

    @Override // com.mbridge.msdk.out.RewardVideoListener, com.mbridge.msdk.video.bt.module.b.g
    public final void onVideoLoadSuccess(MBridgeIds mBridgeIds) {
        this.f26064d = (MediationRewardedAdCallback) this.f26063c.onSuccess(this);
    }
}
