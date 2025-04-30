package U2;

import L4.f;
import R3.e;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.ads.Ad;
import com.facebook.ads.AdExperienceType;
import com.facebook.ads.ExtraHints;
import com.facebook.ads.RewardedVideoAd;
import com.facebook.ads.RewardedVideoAdExtendedListener;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class c implements MediationRewardedAd, RewardedVideoAdExtendedListener {
    public final MediationRewardedAdConfiguration b;

    /* renamed from: c, reason: collision with root package name */
    public final MediationAdLoadCallback f3130c;

    /* renamed from: d, reason: collision with root package name */
    public RewardedVideoAd f3131d;

    /* renamed from: g, reason: collision with root package name */
    public MediationRewardedAdCallback f3133g;

    /* renamed from: i, reason: collision with root package name */
    public final e f3135i;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f3132f = new AtomicBoolean();

    /* renamed from: h, reason: collision with root package name */
    public final AtomicBoolean f3134h = new AtomicBoolean();

    public c(MediationRewardedAdConfiguration mediationRewardedAdConfiguration, MediationAdLoadCallback mediationAdLoadCallback, e eVar) {
        this.b = mediationRewardedAdConfiguration;
        this.f3130c = mediationAdLoadCallback;
        this.f3135i = eVar;
    }

    public AdExperienceType a() {
        return AdExperienceType.AD_EXPERIENCE_TYPE_REWARDED;
    }

    public final void b() {
        MediationRewardedAdConfiguration mediationRewardedAdConfiguration = this.b;
        Context context = mediationRewardedAdConfiguration.getContext();
        String placementID = FacebookMediationAdapter.getPlacementID(mediationRewardedAdConfiguration.getServerParameters());
        if (TextUtils.isEmpty(placementID)) {
            AdError adError = new AdError(101, "Failed to request ad. PlacementID is null or empty.", FacebookMediationAdapter.ERROR_DOMAIN);
            Log.e(FacebookMediationAdapter.TAG, adError.getMessage());
            this.f3130c.onFailure(adError);
            return;
        }
        FacebookMediationAdapter.setMixedAudience(mediationRewardedAdConfiguration);
        this.f3135i.getClass();
        this.f3131d = new RewardedVideoAd(context, placementID);
        if (!TextUtils.isEmpty(mediationRewardedAdConfiguration.getWatermark())) {
            this.f3131d.setExtraHints(new ExtraHints.Builder().mediationData(mediationRewardedAdConfiguration.getWatermark()).build());
        }
        RewardedVideoAd rewardedVideoAd = this.f3131d;
        rewardedVideoAd.loadAd(rewardedVideoAd.buildLoadAdConfig().withAdListener(this).withBid(mediationRewardedAdConfiguration.getBidResponse()).withAdExperience(a()).build());
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdClicked(Ad ad) {
        MediationRewardedAdCallback mediationRewardedAdCallback = this.f3133g;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.reportAdClicked();
        }
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdLoaded(Ad ad) {
        MediationAdLoadCallback mediationAdLoadCallback = this.f3130c;
        if (mediationAdLoadCallback != null) {
            this.f3133g = (MediationRewardedAdCallback) mediationAdLoadCallback.onSuccess(this);
        }
    }

    @Override // com.facebook.ads.AdListener
    public final void onError(Ad ad, com.facebook.ads.AdError adError) {
        AdError adError2 = FacebookMediationAdapter.getAdError(adError);
        if (this.f3132f.get()) {
            Log.w(FacebookMediationAdapter.TAG, adError2.getMessage());
            MediationRewardedAdCallback mediationRewardedAdCallback = this.f3133g;
            if (mediationRewardedAdCallback != null) {
                mediationRewardedAdCallback.onAdFailedToShow(adError2);
            }
        } else {
            Log.w(FacebookMediationAdapter.TAG, adError2.getMessage());
            MediationAdLoadCallback mediationAdLoadCallback = this.f3130c;
            if (mediationAdLoadCallback != null) {
                mediationAdLoadCallback.onFailure(adError2);
            }
        }
        this.f3131d.destroy();
    }

    @Override // com.facebook.ads.AdListener
    public final void onLoggingImpression(Ad ad) {
        MediationRewardedAdCallback mediationRewardedAdCallback = this.f3133g;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.reportAdImpression();
        }
    }

    @Override // com.facebook.ads.RewardedVideoAdExtendedListener
    public final void onRewardedVideoActivityDestroyed() {
        MediationRewardedAdCallback mediationRewardedAdCallback;
        if (!this.f3134h.getAndSet(true) && (mediationRewardedAdCallback = this.f3133g) != null) {
            mediationRewardedAdCallback.onAdClosed();
        }
        RewardedVideoAd rewardedVideoAd = this.f3131d;
        if (rewardedVideoAd != null) {
            rewardedVideoAd.destroy();
        }
    }

    @Override // com.facebook.ads.RewardedVideoAdListener
    public final void onRewardedVideoClosed() {
        MediationRewardedAdCallback mediationRewardedAdCallback;
        if (!this.f3134h.getAndSet(true) && (mediationRewardedAdCallback = this.f3133g) != null) {
            mediationRewardedAdCallback.onAdClosed();
        }
        RewardedVideoAd rewardedVideoAd = this.f3131d;
        if (rewardedVideoAd != null) {
            rewardedVideoAd.destroy();
        }
    }

    @Override // com.facebook.ads.RewardedVideoAdListener
    public final void onRewardedVideoCompleted() {
        this.f3133g.onVideoComplete();
        this.f3133g.onUserEarnedReward(new f(11));
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAd
    public final void showAd(Context context) {
        this.f3132f.set(true);
        if (!this.f3131d.show()) {
            AdError adError = new AdError(110, "Failed to present rewarded ad.", FacebookMediationAdapter.ERROR_DOMAIN);
            Log.w(FacebookMediationAdapter.TAG, adError.getMessage());
            MediationRewardedAdCallback mediationRewardedAdCallback = this.f3133g;
            if (mediationRewardedAdCallback != null) {
                mediationRewardedAdCallback.onAdFailedToShow(adError);
            }
            this.f3131d.destroy();
            return;
        }
        MediationRewardedAdCallback mediationRewardedAdCallback2 = this.f3133g;
        if (mediationRewardedAdCallback2 != null) {
            mediationRewardedAdCallback2.onVideoStart();
            this.f3133g.onAdOpened();
        }
    }
}
