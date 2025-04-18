package com.cooldev.gba.emulator.gameboy.features.admob.app_open_ad.manager;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.util.Log;
import androidx.compose.runtime.internal.StabilityInferred;
import com.cooldev.gba.emulator.gameboy.network.models.SlackMessage;
import com.cooldev.gba.emulator.gameboy.network.repo.SlackApiRepositoryImpl;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.appopen.AppOpenAd;
import java.util.Date;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q0.l;

@StabilityInferred
/* loaded from: classes.dex */
public final class AppOpenAdManager {

    @NotNull
    private final String adUnitId;

    @Nullable
    private AppOpenAd appOpenAd;

    @NotNull
    private final Context context;
    private boolean isAdShowing;
    private long loadTime;
    private final long numHours;

    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final String LOG_TAG = "AppOpenAdManager";

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public AppOpenAdManager(@NotNull Context context, @NotNull String str) {
        p0.a.s(context, "context");
        p0.a.s(str, "adUnitId");
        this.context = context;
        this.adUnitId = str;
        this.numHours = 4L;
    }

    public static /* synthetic */ void loadAd$default(AppOpenAdManager appOpenAdManager, q0.a aVar, l lVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            aVar = AppOpenAdManager$loadAd$1.INSTANCE;
        }
        if ((i2 & 2) != 0) {
            lVar = AppOpenAdManager$loadAd$2.INSTANCE;
        }
        appOpenAdManager.loadAd(aVar, lVar);
    }

    public static /* synthetic */ void loadAdWithRetry$default(AppOpenAdManager appOpenAdManager, q0.a aVar, l lVar, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            aVar = AppOpenAdManager$loadAdWithRetry$1.INSTANCE;
        }
        if ((i3 & 2) != 0) {
            lVar = AppOpenAdManager$loadAdWithRetry$2.INSTANCE;
        }
        if ((i3 & 4) != 0) {
            i2 = 3;
        }
        appOpenAdManager.loadAdWithRetry(aVar, lVar, i2);
    }

    private final boolean wasLoadTimeLessThanNHoursAgo() {
        return new Date().getTime() - this.loadTime < this.numHours * 3600000;
    }

    public final void loadAd(@NotNull final q0.a aVar, @NotNull final l lVar) {
        p0.a.s(aVar, "onAdLoaded");
        p0.a.s(lVar, "onAdFailedToLoad");
        if (this.appOpenAd != null) {
            Log.d(LOG_TAG, "Ad is already loaded.");
            return;
        }
        try {
            AdRequest build = new AdRequest.Builder().build();
            p0.a.r(build, "build(...)");
            Context applicationContext = this.context.getApplicationContext();
            p0.a.q(applicationContext, "null cannot be cast to non-null type android.app.Application");
            AppOpenAd.load((Application) applicationContext, this.adUnitId, build, new AppOpenAd.AppOpenAdLoadCallback() { // from class: com.cooldev.gba.emulator.gameboy.features.admob.app_open_ad.manager.AppOpenAdManager$loadAd$3$1
                @Override // com.google.android.gms.ads.AdLoadCallback
                public void onAdFailedToLoad(@NotNull LoadAdError loadAdError) {
                    String str;
                    p0.a.s(loadAdError, "loadAdError");
                    AppOpenAdManager.this.appOpenAd = null;
                    str = AppOpenAdManager.LOG_TAG;
                    Log.e(str, "Failed to load ad: " + loadAdError.getMessage());
                    l lVar2 = lVar;
                    String message = loadAdError.getMessage();
                    p0.a.r(message, "getMessage(...)");
                    lVar2.invoke(message);
                }

                @Override // com.google.android.gms.ads.AdLoadCallback
                public void onAdLoaded(@NotNull AppOpenAd appOpenAd) {
                    String str;
                    p0.a.s(appOpenAd, "ad");
                    AppOpenAdManager.this.appOpenAd = appOpenAd;
                    AppOpenAdManager.this.loadTime = new Date().getTime();
                    aVar.invoke();
                    str = AppOpenAdManager.LOG_TAG;
                    Log.d(str, "Ad successfully loaded.");
                }
            });
        } catch (Throwable th) {
            new SlackApiRepositoryImpl().sendMessageToSlack(SlackMessage.Factory.template(th));
            Log.e(LOG_TAG, "Error loading ad: " + th.getMessage(), th);
        }
    }

    public final void loadAdWithRetry(@NotNull q0.a aVar, @NotNull l lVar, int i2) {
        p0.a.s(aVar, "onAdLoaded");
        p0.a.s(lVar, "onAdFailedToLoad");
        loadAd(aVar, new AppOpenAdManager$loadAdWithRetry$3(i2, lVar, this, aVar));
    }

    public final void showAd(@NotNull Activity activity, @NotNull final q0.a aVar, @NotNull final l lVar, @NotNull q0.a aVar2, @NotNull final q0.a aVar3, @NotNull q0.a aVar4, @NotNull final q0.a aVar5) {
        p0.a.s(activity, "activity");
        p0.a.s(aVar, "onAdDismissed");
        p0.a.s(lVar, "onAdFailedToShow");
        p0.a.s(aVar2, "onAdNotReady");
        p0.a.s(aVar3, "onAdShowed");
        p0.a.s(aVar4, "onAdExpired");
        p0.a.s(aVar5, "onAdClicked");
        if (this.isAdShowing) {
            Log.d(LOG_TAG, "Ad is already showing, cannot show another one.");
            return;
        }
        if (this.appOpenAd == null) {
            Log.d(LOG_TAG, "Ad is not available.");
            aVar2.invoke();
            loadAdWithRetry$default(this, null, null, 0, 7, null);
        } else {
            if (!wasLoadTimeLessThanNHoursAgo()) {
                Log.d(LOG_TAG, "Ad is expired.");
                aVar4.invoke();
                loadAdWithRetry$default(this, null, null, 0, 7, null);
                return;
            }
            AppOpenAd appOpenAd = this.appOpenAd;
            if (appOpenAd != null) {
                appOpenAd.setFullScreenContentCallback(new FullScreenContentCallback() { // from class: com.cooldev.gba.emulator.gameboy.features.admob.app_open_ad.manager.AppOpenAdManager$showAd$7
                    @Override // com.google.android.gms.ads.FullScreenContentCallback
                    public void onAdClicked() {
                        aVar5.invoke();
                    }

                    @Override // com.google.android.gms.ads.FullScreenContentCallback
                    public void onAdDismissedFullScreenContent() {
                        String str;
                        str = AppOpenAdManager.LOG_TAG;
                        Log.d(str, "Ad dismissed.");
                        AppOpenAdManager.this.isAdShowing = false;
                        AppOpenAdManager.this.appOpenAd = null;
                        aVar.invoke();
                        AppOpenAdManager.loadAdWithRetry$default(AppOpenAdManager.this, null, null, 0, 7, null);
                    }

                    @Override // com.google.android.gms.ads.FullScreenContentCallback
                    public void onAdFailedToShowFullScreenContent(@NotNull AdError adError) {
                        String str;
                        p0.a.s(adError, "adError");
                        str = AppOpenAdManager.LOG_TAG;
                        Log.e(str, "Ad failed to show: " + adError.getMessage());
                        AppOpenAdManager.this.isAdShowing = false;
                        AppOpenAdManager.this.appOpenAd = null;
                        l lVar2 = lVar;
                        String message = adError.getMessage();
                        p0.a.r(message, "getMessage(...)");
                        lVar2.invoke(message);
                        AppOpenAdManager.loadAdWithRetry$default(AppOpenAdManager.this, null, null, 0, 7, null);
                    }

                    @Override // com.google.android.gms.ads.FullScreenContentCallback
                    public void onAdShowedFullScreenContent() {
                        String str;
                        str = AppOpenAdManager.LOG_TAG;
                        Log.d(str, "Ad showed successfully.");
                        AppOpenAdManager.this.isAdShowing = true;
                        AppOpenAdManager.this.appOpenAd = null;
                        aVar3.invoke();
                    }
                });
            }
            Log.d(LOG_TAG, "Attempting to show ad.");
            this.isAdShowing = true;
            AppOpenAd appOpenAd2 = this.appOpenAd;
            if (appOpenAd2 != null) {
                appOpenAd2.show(activity);
            }
        }
    }
}
