package com.cooldev.gba.emulator.gameboy.features.admob.rewarded_ad.manager;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q0.l;

@StabilityInferred
/* loaded from: classes.dex */
public final class RewardedAdManager {

    @NotNull
    private final String adUnitId;

    @NotNull
    private final Context context;
    private boolean isAdShowing;

    @Nullable
    private RewardedAd rewardedAd;

    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final String LOG_TAG = "RewardedAdManager";

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public RewardedAdManager(@NotNull Context context, @NotNull String str) {
        p0.a.s(context, "context");
        p0.a.s(str, "adUnitId");
        this.context = context;
        this.adUnitId = str;
    }

    public static /* synthetic */ void loadAd$default(RewardedAdManager rewardedAdManager, q0.a aVar, l lVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            aVar = RewardedAdManager$loadAd$1.INSTANCE;
        }
        if ((i2 & 2) != 0) {
            lVar = RewardedAdManager$loadAd$2.INSTANCE;
        }
        rewardedAdManager.loadAd(aVar, lVar);
    }

    public static /* synthetic */ void loadAdWithRetry$default(RewardedAdManager rewardedAdManager, q0.a aVar, l lVar, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            aVar = RewardedAdManager$loadAdWithRetry$1.INSTANCE;
        }
        if ((i3 & 2) != 0) {
            lVar = RewardedAdManager$loadAdWithRetry$2.INSTANCE;
        }
        if ((i3 & 4) != 0) {
            i2 = 3;
        }
        rewardedAdManager.loadAdWithRetry(aVar, lVar, i2);
    }

    public static final void showAd$lambda$0(l lVar, RewardItem rewardItem) {
        p0.a.s(lVar, "$tmp0");
        p0.a.s(rewardItem, "p0");
        lVar.invoke(rewardItem);
    }

    public final void loadAd(@NotNull final q0.a aVar, @NotNull final l lVar) {
        p0.a.s(aVar, "onAdLoaded");
        p0.a.s(lVar, "onAdFailedToLoad");
        if (this.rewardedAd != null) {
            Log.d(LOG_TAG, "Rewarded ad is already loaded.");
            return;
        }
        AdRequest build = new AdRequest.Builder().build();
        p0.a.r(build, "build(...)");
        RewardedAd.load(this.context, this.adUnitId, build, new RewardedAdLoadCallback() { // from class: com.cooldev.gba.emulator.gameboy.features.admob.rewarded_ad.manager.RewardedAdManager$loadAd$3
            @Override // com.google.android.gms.ads.AdLoadCallback
            public void onAdFailedToLoad(@NotNull LoadAdError loadAdError) {
                String str;
                p0.a.s(loadAdError, "adError");
                RewardedAdManager.this.rewardedAd = null;
                str = RewardedAdManager.LOG_TAG;
                Log.e(str, "Rewarded ad failed to load: " + loadAdError.getMessage());
                l lVar2 = lVar;
                String message = loadAdError.getMessage();
                p0.a.r(message, "getMessage(...)");
                lVar2.invoke(message);
            }

            @Override // com.google.android.gms.ads.AdLoadCallback
            public void onAdLoaded(@NotNull RewardedAd rewardedAd) {
                String str;
                p0.a.s(rewardedAd, "ad");
                RewardedAdManager.this.rewardedAd = rewardedAd;
                str = RewardedAdManager.LOG_TAG;
                Log.d(str, "Rewarded ad loaded successfully");
                aVar.invoke();
            }
        });
    }

    public final void loadAdWithRetry(@NotNull q0.a aVar, @NotNull l lVar, int i2) {
        p0.a.s(aVar, "onAdLoaded");
        p0.a.s(lVar, "onAdFailedToLoad");
        loadAd(aVar, new RewardedAdManager$loadAdWithRetry$3(i2, lVar, this, aVar));
    }

    public final void showAd(@NotNull Activity activity, @NotNull final q0.a aVar, @NotNull final l lVar, @NotNull q0.a aVar2, @NotNull final q0.a aVar3, @NotNull l lVar2, @NotNull final q0.a aVar4) {
        p0.a.s(activity, "activity");
        p0.a.s(aVar, "onAdDismissed");
        p0.a.s(lVar, "onAdFailedToShow");
        p0.a.s(aVar2, "onAdNotReady");
        p0.a.s(aVar3, "onAdShowed");
        p0.a.s(lVar2, "onUserEarnedReward");
        p0.a.s(aVar4, "onAdClicked");
        if (this.isAdShowing) {
            Log.d(LOG_TAG, "Ad is already showing, cannot show another one.");
            return;
        }
        RewardedAd rewardedAd = this.rewardedAd;
        if (rewardedAd == null) {
            Log.d(LOG_TAG, "Rewarded ad is not ready");
            aVar2.invoke();
            loadAdWithRetry$default(this, null, null, 0, 7, null);
        } else {
            if (rewardedAd != null) {
                rewardedAd.setFullScreenContentCallback(new FullScreenContentCallback() { // from class: com.cooldev.gba.emulator.gameboy.features.admob.rewarded_ad.manager.RewardedAdManager$showAd$7
                    @Override // com.google.android.gms.ads.FullScreenContentCallback
                    public void onAdClicked() {
                        super.onAdClicked();
                        aVar4.invoke();
                    }

                    @Override // com.google.android.gms.ads.FullScreenContentCallback
                    public void onAdDismissedFullScreenContent() {
                        String str;
                        str = RewardedAdManager.LOG_TAG;
                        Log.d(str, "Rewarded ad dismissed");
                        RewardedAdManager.this.isAdShowing = false;
                        RewardedAdManager.this.rewardedAd = null;
                        aVar.invoke();
                        RewardedAdManager.loadAdWithRetry$default(RewardedAdManager.this, null, null, 0, 7, null);
                    }

                    @Override // com.google.android.gms.ads.FullScreenContentCallback
                    public void onAdFailedToShowFullScreenContent(@NotNull AdError adError) {
                        String str;
                        p0.a.s(adError, "adError");
                        super.onAdFailedToShowFullScreenContent(adError);
                        str = RewardedAdManager.LOG_TAG;
                        Log.e(str, "Rewarded ad failed to show: " + adError.getMessage());
                        RewardedAdManager.this.isAdShowing = false;
                        RewardedAdManager.this.rewardedAd = null;
                        l lVar3 = lVar;
                        String message = adError.getMessage();
                        p0.a.r(message, "getMessage(...)");
                        lVar3.invoke(message);
                        RewardedAdManager.loadAdWithRetry$default(RewardedAdManager.this, null, null, 0, 7, null);
                    }

                    @Override // com.google.android.gms.ads.FullScreenContentCallback
                    public void onAdShowedFullScreenContent() {
                        String str;
                        str = RewardedAdManager.LOG_TAG;
                        Log.d(str, "Rewarded ad showed");
                        RewardedAdManager.this.isAdShowing = true;
                        RewardedAdManager.this.rewardedAd = null;
                        aVar3.invoke();
                    }
                });
            }
            RewardedAd rewardedAd2 = this.rewardedAd;
            if (rewardedAd2 != null) {
                rewardedAd2.show(activity, new a(lVar2));
            }
        }
    }
}
