package c7;

import a4.k;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.ads.mediation.vungle.VungleMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.vungle.ads.h2;
import com.vungle.ads.j2;
import com.vungle.ads.n3;
import com.vungle.ads.o0;

/* loaded from: classes3.dex */
public final class j implements MediationRewardedAd, j2 {

    /* renamed from: b, reason: collision with root package name */
    public final MediationRewardedAdConfiguration f2706b;

    /* renamed from: c, reason: collision with root package name */
    public final MediationAdLoadCallback f2707c;

    /* renamed from: d, reason: collision with root package name */
    public MediationRewardedAdCallback f2708d;

    /* renamed from: f, reason: collision with root package name */
    public h2 f2709f;

    /* renamed from: g, reason: collision with root package name */
    public final a7.a f2710g;

    public j(MediationRewardedAdConfiguration mediationRewardedAdConfiguration, MediationAdLoadCallback mediationAdLoadCallback, a7.a aVar) {
        this.f2706b = mediationRewardedAdConfiguration;
        this.f2707c = mediationAdLoadCallback;
        this.f2710g = aVar;
    }

    public final void a() {
        MediationRewardedAdConfiguration mediationRewardedAdConfiguration = this.f2706b;
        Bundle mediationExtras = mediationRewardedAdConfiguration.getMediationExtras();
        Bundle serverParameters = mediationRewardedAdConfiguration.getServerParameters();
        String string = mediationExtras.getString("userId");
        String string2 = serverParameters.getString("appid");
        boolean isEmpty = TextUtils.isEmpty(string2);
        MediationAdLoadCallback mediationAdLoadCallback = this.f2707c;
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
        this.f2710g.getClass();
        com.vungle.ads.d dVar = new com.vungle.ads.d();
        if (mediationExtras.containsKey("adOrientation")) {
            dVar.setAdOrientation(mediationExtras.getInt("adOrientation", 2));
        }
        String watermark = mediationRewardedAdConfiguration.getWatermark();
        if (!TextUtils.isEmpty(watermark)) {
            dVar.setWatermark(watermark);
        }
        Context context = mediationRewardedAdConfiguration.getContext();
        a7.c.f306c.a(string2, context, new i(this, context, string3, dVar, string, bidResponse));
    }

    @Override // com.vungle.ads.j2, com.vungle.ads.z0, com.vungle.ads.p0
    public final void onAdClicked(o0 o0Var) {
        MediationRewardedAdCallback mediationRewardedAdCallback = this.f2708d;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.reportAdClicked();
        }
    }

    @Override // com.vungle.ads.j2, com.vungle.ads.z0, com.vungle.ads.p0
    public final void onAdEnd(o0 o0Var) {
        MediationRewardedAdCallback mediationRewardedAdCallback = this.f2708d;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onAdClosed();
        }
    }

    @Override // com.vungle.ads.j2, com.vungle.ads.z0, com.vungle.ads.p0
    public final void onAdFailedToLoad(o0 o0Var, n3 n3Var) {
        AdError adError = VungleMediationAdapter.getAdError(n3Var);
        Log.w(VungleMediationAdapter.TAG, adError.toString());
        this.f2707c.onFailure(adError);
    }

    @Override // com.vungle.ads.j2, com.vungle.ads.z0, com.vungle.ads.p0
    public final void onAdFailedToPlay(o0 o0Var, n3 n3Var) {
        AdError adError = VungleMediationAdapter.getAdError(n3Var);
        Log.w(VungleMediationAdapter.TAG, adError.toString());
        MediationRewardedAdCallback mediationRewardedAdCallback = this.f2708d;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onAdFailedToShow(adError);
        }
    }

    @Override // com.vungle.ads.j2, com.vungle.ads.z0, com.vungle.ads.p0
    public final void onAdImpression(o0 o0Var) {
        MediationRewardedAdCallback mediationRewardedAdCallback = this.f2708d;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onVideoStart();
            this.f2708d.reportAdImpression();
        }
    }

    @Override // com.vungle.ads.j2, com.vungle.ads.z0, com.vungle.ads.p0
    public final void onAdLeftApplication(o0 o0Var) {
    }

    @Override // com.vungle.ads.j2, com.vungle.ads.z0, com.vungle.ads.p0
    public final void onAdLoaded(o0 o0Var) {
        this.f2708d = (MediationRewardedAdCallback) this.f2707c.onSuccess(this);
    }

    @Override // com.vungle.ads.j2
    public final void onAdRewarded(o0 o0Var) {
        MediationRewardedAdCallback mediationRewardedAdCallback = this.f2708d;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onVideoComplete();
            this.f2708d.onUserEarnedReward(new k((Object) null));
        }
    }

    @Override // com.vungle.ads.j2, com.vungle.ads.z0, com.vungle.ads.p0
    public final void onAdStart(o0 o0Var) {
        MediationRewardedAdCallback mediationRewardedAdCallback = this.f2708d;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onAdOpened();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAd
    public final void showAd(Context context) {
        h2 h2Var = this.f2709f;
        if (h2Var != null) {
            h2Var.play(context);
        } else if (this.f2708d != null) {
            AdError adError = new AdError(107, "Failed to show bidding rewardedad from Liftoff Monetize.", VungleMediationAdapter.ERROR_DOMAIN);
            Log.w(VungleMediationAdapter.TAG, adError.toString());
            this.f2708d.onAdFailedToShow(adError);
        }
    }
}
