package s6;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.ads.Ad;
import com.facebook.ads.AdExperienceType;
import com.facebook.ads.ExtraHints;
import com.facebook.ads.RewardedVideoAd;
import com.facebook.ads.RewardedVideoAdExtendedListener;
import com.facebook.internal.m;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public class c implements MediationRewardedAd, RewardedVideoAdExtendedListener {

    /* renamed from: b, reason: collision with root package name */
    public final MediationRewardedAdConfiguration f24245b;

    /* renamed from: c, reason: collision with root package name */
    public final MediationAdLoadCallback f24246c;

    /* renamed from: d, reason: collision with root package name */
    public RewardedVideoAd f24247d;

    /* renamed from: g, reason: collision with root package name */
    public MediationRewardedAdCallback f24249g;

    /* renamed from: i, reason: collision with root package name */
    public final m f24251i;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f24248f = new AtomicBoolean();

    /* renamed from: h, reason: collision with root package name */
    public final AtomicBoolean f24250h = new AtomicBoolean();

    public c(MediationRewardedAdConfiguration mediationRewardedAdConfiguration, MediationAdLoadCallback mediationAdLoadCallback, m mVar) {
        this.f24245b = mediationRewardedAdConfiguration;
        this.f24246c = mediationAdLoadCallback;
        this.f24251i = mVar;
    }

    public AdExperienceType a() {
        return AdExperienceType.AD_EXPERIENCE_TYPE_REWARDED;
    }

    public final void b() {
        MediationRewardedAdConfiguration mediationRewardedAdConfiguration = this.f24245b;
        Context context = mediationRewardedAdConfiguration.getContext();
        String placementID = FacebookMediationAdapter.getPlacementID(mediationRewardedAdConfiguration.getServerParameters());
        if (TextUtils.isEmpty(placementID)) {
            AdError adError = new AdError(101, "Failed to request ad. PlacementID is null or empty.", FacebookMediationAdapter.ERROR_DOMAIN);
            Log.e(FacebookMediationAdapter.TAG, adError.getMessage());
            this.f24246c.onFailure(adError);
            return;
        }
        FacebookMediationAdapter.setMixedAudience(mediationRewardedAdConfiguration);
        this.f24251i.getClass();
        this.f24247d = new RewardedVideoAd(context, placementID);
        if (!TextUtils.isEmpty(mediationRewardedAdConfiguration.getWatermark())) {
            this.f24247d.setExtraHints(new ExtraHints.Builder().mediationData(mediationRewardedAdConfiguration.getWatermark()).build());
        }
        RewardedVideoAd rewardedVideoAd = this.f24247d;
        rewardedVideoAd.loadAd(rewardedVideoAd.buildLoadAdConfig().withAdListener(this).withBid(mediationRewardedAdConfiguration.getBidResponse()).withAdExperience(a()).build());
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdClicked(Ad ad2) {
        MediationRewardedAdCallback mediationRewardedAdCallback = this.f24249g;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.reportAdClicked();
        }
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdLoaded(Ad ad2) {
        MediationAdLoadCallback mediationAdLoadCallback = this.f24246c;
        if (mediationAdLoadCallback != null) {
            this.f24249g = (MediationRewardedAdCallback) mediationAdLoadCallback.onSuccess(this);
        }
    }

    @Override // com.facebook.ads.AdListener
    public final void onError(Ad ad2, com.facebook.ads.AdError adError) {
        AdError adError2 = FacebookMediationAdapter.getAdError(adError);
        if (this.f24248f.get()) {
            Log.w(FacebookMediationAdapter.TAG, adError2.getMessage());
            MediationRewardedAdCallback mediationRewardedAdCallback = this.f24249g;
            if (mediationRewardedAdCallback != null) {
                mediationRewardedAdCallback.onAdFailedToShow(adError2);
            }
        } else {
            Log.w(FacebookMediationAdapter.TAG, adError2.getMessage());
            MediationAdLoadCallback mediationAdLoadCallback = this.f24246c;
            if (mediationAdLoadCallback != null) {
                mediationAdLoadCallback.onFailure(adError2);
            }
        }
        this.f24247d.destroy();
    }

    @Override // com.facebook.ads.AdListener
    public final void onLoggingImpression(Ad ad2) {
        MediationRewardedAdCallback mediationRewardedAdCallback = this.f24249g;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.reportAdImpression();
        }
    }

    @Override // com.facebook.ads.RewardedVideoAdExtendedListener
    public final void onRewardedVideoActivityDestroyed() {
        MediationRewardedAdCallback mediationRewardedAdCallback;
        if (!this.f24250h.getAndSet(true) && (mediationRewardedAdCallback = this.f24249g) != null) {
            mediationRewardedAdCallback.onAdClosed();
        }
        RewardedVideoAd rewardedVideoAd = this.f24247d;
        if (rewardedVideoAd != null) {
            rewardedVideoAd.destroy();
        }
    }

    @Override // com.facebook.ads.RewardedVideoAdListener
    public final void onRewardedVideoClosed() {
        MediationRewardedAdCallback mediationRewardedAdCallback;
        if (!this.f24250h.getAndSet(true) && (mediationRewardedAdCallback = this.f24249g) != null) {
            mediationRewardedAdCallback.onAdClosed();
        }
        RewardedVideoAd rewardedVideoAd = this.f24247d;
        if (rewardedVideoAd != null) {
            rewardedVideoAd.destroy();
        }
    }

    @Override // com.facebook.ads.RewardedVideoAdListener
    public final void onRewardedVideoCompleted() {
        this.f24249g.onVideoComplete();
        this.f24249g.onUserEarnedReward(new ni.a());
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAd
    public final void showAd(Context context) {
        this.f24248f.set(true);
        if (!this.f24247d.show()) {
            AdError adError = new AdError(110, "Failed to present rewarded ad.", FacebookMediationAdapter.ERROR_DOMAIN);
            Log.w(FacebookMediationAdapter.TAG, adError.getMessage());
            MediationRewardedAdCallback mediationRewardedAdCallback = this.f24249g;
            if (mediationRewardedAdCallback != null) {
                mediationRewardedAdCallback.onAdFailedToShow(adError);
            }
            this.f24247d.destroy();
            return;
        }
        MediationRewardedAdCallback mediationRewardedAdCallback2 = this.f24249g;
        if (mediationRewardedAdCallback2 != null) {
            mediationRewardedAdCallback2.onVideoStart();
            this.f24249g.onAdOpened();
        }
    }
}
