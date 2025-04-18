package com.cooldev.gba.emulator.gameboy.features.admob.interstitial_ad.manager;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q0.l;

@StabilityInferred
/* loaded from: classes.dex */
public final class InterstitialAdManager {

    @NotNull
    private final String adUnitId;

    @NotNull
    private final Context context;

    @Nullable
    private InterstitialAd interstitialAd;
    private boolean isAdShowing;

    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final String LOG_TAG = "InterstitialAdManager";

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public InterstitialAdManager(@NotNull Context context, @NotNull String str) {
        p0.a.s(context, "context");
        p0.a.s(str, "adUnitId");
        this.context = context;
        this.adUnitId = str;
    }

    public static /* synthetic */ void loadAd$default(InterstitialAdManager interstitialAdManager, q0.a aVar, l lVar, q0.a aVar2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            aVar = InterstitialAdManager$loadAd$1.INSTANCE;
        }
        if ((i2 & 2) != 0) {
            lVar = InterstitialAdManager$loadAd$2.INSTANCE;
        }
        if ((i2 & 4) != 0) {
            aVar2 = InterstitialAdManager$loadAd$3.INSTANCE;
        }
        interstitialAdManager.loadAd(aVar, lVar, aVar2);
    }

    public static /* synthetic */ void loadAdWithRetry$default(InterstitialAdManager interstitialAdManager, q0.a aVar, l lVar, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            aVar = InterstitialAdManager$loadAdWithRetry$1.INSTANCE;
        }
        if ((i3 & 2) != 0) {
            lVar = InterstitialAdManager$loadAdWithRetry$2.INSTANCE;
        }
        if ((i3 & 4) != 0) {
            i2 = 3;
        }
        interstitialAdManager.loadAdWithRetry(aVar, lVar, i2);
    }

    public static /* synthetic */ void showAd$default(InterstitialAdManager interstitialAdManager, Activity activity, q0.a aVar, l lVar, q0.a aVar2, q0.a aVar3, q0.a aVar4, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            aVar = InterstitialAdManager$showAd$1.INSTANCE;
        }
        q0.a aVar5 = aVar;
        if ((i2 & 4) != 0) {
            lVar = InterstitialAdManager$showAd$2.INSTANCE;
        }
        l lVar2 = lVar;
        if ((i2 & 8) != 0) {
            aVar2 = InterstitialAdManager$showAd$3.INSTANCE;
        }
        q0.a aVar6 = aVar2;
        if ((i2 & 16) != 0) {
            aVar3 = InterstitialAdManager$showAd$4.INSTANCE;
        }
        q0.a aVar7 = aVar3;
        if ((i2 & 32) != 0) {
            aVar4 = InterstitialAdManager$showAd$5.INSTANCE;
        }
        interstitialAdManager.showAd(activity, aVar5, lVar2, aVar6, aVar7, aVar4);
    }

    public final void loadAd(@NotNull final q0.a aVar, @NotNull final l lVar, @NotNull q0.a aVar2) {
        p0.a.s(aVar, "onAdLoaded");
        p0.a.s(lVar, "onAdFailedToLoad");
        p0.a.s(aVar2, "onAdAlreadyLoaded");
        if (this.interstitialAd != null) {
            Log.d(LOG_TAG, "Interstitial ad is already loaded.");
            aVar2.invoke();
        } else {
            AdRequest build = new AdRequest.Builder().build();
            p0.a.r(build, "build(...)");
            InterstitialAd.load(this.context, this.adUnitId, build, new InterstitialAdLoadCallback() { // from class: com.cooldev.gba.emulator.gameboy.features.admob.interstitial_ad.manager.InterstitialAdManager$loadAd$4
                @Override // com.google.android.gms.ads.AdLoadCallback
                public void onAdFailedToLoad(@NotNull LoadAdError loadAdError) {
                    String str;
                    p0.a.s(loadAdError, "adError");
                    InterstitialAdManager.this.interstitialAd = null;
                    str = InterstitialAdManager.LOG_TAG;
                    Log.e(str, "Interstitial ad failed to load: " + loadAdError.getMessage());
                    l lVar2 = lVar;
                    String message = loadAdError.getMessage();
                    p0.a.r(message, "getMessage(...)");
                    lVar2.invoke(message);
                }

                @Override // com.google.android.gms.ads.AdLoadCallback
                public void onAdLoaded(@NotNull InterstitialAd interstitialAd) {
                    String str;
                    p0.a.s(interstitialAd, "ad");
                    InterstitialAdManager.this.interstitialAd = interstitialAd;
                    str = InterstitialAdManager.LOG_TAG;
                    Log.d(str, "Interstitial ad loaded successfully");
                    aVar.invoke();
                }
            });
        }
    }

    public final void loadAdWithRetry(@NotNull q0.a aVar, @NotNull l lVar, int i2) {
        p0.a.s(aVar, "onAdLoaded");
        p0.a.s(lVar, "onAdFailedToLoad");
        loadAd$default(this, aVar, new InterstitialAdManager$loadAdWithRetry$3(i2, lVar, this, aVar), null, 4, null);
    }

    public final void showAd(@NotNull Activity activity, @NotNull final q0.a aVar, @NotNull final l lVar, @NotNull q0.a aVar2, @NotNull final q0.a aVar3, @NotNull final q0.a aVar4) {
        p0.a.s(activity, "activity");
        p0.a.s(aVar, "onAdDismissed");
        p0.a.s(lVar, "onAdFailedToShow");
        p0.a.s(aVar2, "onAdNotReady");
        p0.a.s(aVar3, "onAdShowed");
        p0.a.s(aVar4, "onAdClicked");
        if (this.isAdShowing) {
            Log.d(LOG_TAG, "Ad is already showing, cannot show another one.");
            return;
        }
        InterstitialAd interstitialAd = this.interstitialAd;
        if (interstitialAd == null) {
            Log.d(LOG_TAG, "Interstitial ad is not ready");
            aVar2.invoke();
            return;
        }
        if (interstitialAd != null) {
            interstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() { // from class: com.cooldev.gba.emulator.gameboy.features.admob.interstitial_ad.manager.InterstitialAdManager$showAd$6
                @Override // com.google.android.gms.ads.FullScreenContentCallback
                public void onAdClicked() {
                    super.onAdClicked();
                    aVar4.invoke();
                }

                @Override // com.google.android.gms.ads.FullScreenContentCallback
                public void onAdDismissedFullScreenContent() {
                    String str;
                    str = InterstitialAdManager.LOG_TAG;
                    Log.d(str, "Interstitial ad dismissed");
                    InterstitialAdManager.this.isAdShowing = false;
                    InterstitialAdManager.this.interstitialAd = null;
                    aVar.invoke();
                }

                @Override // com.google.android.gms.ads.FullScreenContentCallback
                public void onAdFailedToShowFullScreenContent(@NotNull AdError adError) {
                    String str;
                    p0.a.s(adError, "p0");
                    super.onAdFailedToShowFullScreenContent(adError);
                    str = InterstitialAdManager.LOG_TAG;
                    Log.e(str, "Interstitial ad failed to show: " + adError.getMessage());
                    InterstitialAdManager.this.isAdShowing = false;
                    InterstitialAdManager.this.interstitialAd = null;
                    l lVar2 = lVar;
                    String message = adError.getMessage();
                    p0.a.r(message, "getMessage(...)");
                    lVar2.invoke(message);
                }

                @Override // com.google.android.gms.ads.FullScreenContentCallback
                public void onAdShowedFullScreenContent() {
                    String str;
                    str = InterstitialAdManager.LOG_TAG;
                    Log.d(str, "Interstitial ad showed");
                    InterstitialAdManager.this.isAdShowing = true;
                    InterstitialAdManager.this.interstitialAd = null;
                    aVar3.invoke();
                }
            });
        }
        this.isAdShowing = true;
        InterstitialAd interstitialAd2 = this.interstitialAd;
        if (interstitialAd2 != null) {
            interstitialAd2.show(activity);
        }
    }
}
