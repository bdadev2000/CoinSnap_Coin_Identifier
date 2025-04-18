package com.cooldev.gba.emulator.gameboy.features.admob.banner_ads.manager;

import android.content.Context;
import android.util.Log;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q0.l;

@StabilityInferred
/* loaded from: classes.dex */
public final class BannerAdManager {

    @Nullable
    private AdView adView;

    @NotNull
    private final String bannerAdUnitId;

    @NotNull
    private final Context context;

    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static String TAG = "BannerAdManager";

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public BannerAdManager(@NotNull Context context, @NotNull String str) {
        p0.a.s(context, "context");
        p0.a.s(str, "bannerAdUnitId");
        this.context = context;
        this.bannerAdUnitId = str;
    }

    public static /* synthetic */ void loadAd$default(BannerAdManager bannerAdManager, l lVar, l lVar2, q0.a aVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            lVar = BannerAdManager$loadAd$1.INSTANCE;
        }
        if ((i2 & 2) != 0) {
            lVar2 = BannerAdManager$loadAd$2.INSTANCE;
        }
        if ((i2 & 4) != 0) {
            aVar = BannerAdManager$loadAd$3.INSTANCE;
        }
        bannerAdManager.loadAd(lVar, lVar2, aVar);
    }

    public static /* synthetic */ void loadAdWithRetry$default(BannerAdManager bannerAdManager, l lVar, l lVar2, q0.a aVar, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            lVar = BannerAdManager$loadAdWithRetry$1.INSTANCE;
        }
        if ((i3 & 2) != 0) {
            lVar2 = BannerAdManager$loadAdWithRetry$2.INSTANCE;
        }
        if ((i3 & 4) != 0) {
            aVar = BannerAdManager$loadAdWithRetry$3.INSTANCE;
        }
        if ((i3 & 8) != 0) {
            i2 = 3;
        }
        bannerAdManager.loadAdWithRetry(lVar, lVar2, aVar, i2);
    }

    public final void destroy() {
        Log.d(TAG, "Destroying AdView.");
        AdView adView = this.adView;
        if (adView != null) {
            adView.destroy();
        }
        this.adView = null;
    }

    public final void loadAd(@NotNull final l lVar, @NotNull final l lVar2, @NotNull final q0.a aVar) {
        p0.a.s(lVar, "onAdLoaded");
        p0.a.s(lVar2, "onAdFailedToLoad");
        p0.a.s(aVar, "onAdClicked");
        AdView adView = new AdView(this.context);
        AdSize currentOrientationAnchoredAdaptiveBannerAdSize = AdSize.getCurrentOrientationAnchoredAdaptiveBannerAdSize(adView.getContext(), (int) (adView.getContext().getResources().getDisplayMetrics().widthPixels / adView.getContext().getResources().getDisplayMetrics().density));
        p0.a.r(currentOrientationAnchoredAdaptiveBannerAdSize, "getCurrentOrientationAnc…AdaptiveBannerAdSize(...)");
        adView.setAdSize(currentOrientationAnchoredAdaptiveBannerAdSize);
        adView.setAdUnitId(this.bannerAdUnitId);
        this.adView = adView;
        AdRequest build = new AdRequest.Builder().build();
        p0.a.r(build, "build(...)");
        AdView adView2 = this.adView;
        if (adView2 != null) {
            adView2.loadAd(build);
        }
        AdView adView3 = this.adView;
        if (adView3 == null) {
            return;
        }
        adView3.setAdListener(new AdListener() { // from class: com.cooldev.gba.emulator.gameboy.features.admob.banner_ads.manager.BannerAdManager$loadAd$5
            @Override // com.google.android.gms.ads.AdListener
            public void onAdClicked() {
                String str;
                str = BannerAdManager.TAG;
                Log.d(str, "Banner ad clicked.");
                aVar.invoke();
            }

            @Override // com.google.android.gms.ads.AdListener
            public void onAdFailedToLoad(@NotNull LoadAdError loadAdError) {
                String str;
                p0.a.s(loadAdError, "adError");
                str = BannerAdManager.TAG;
                Log.e(str, "Failed to load banner ad: " + loadAdError.getMessage());
                l lVar3 = lVar2;
                String message = loadAdError.getMessage();
                p0.a.r(message, "getMessage(...)");
                lVar3.invoke(message);
            }

            @Override // com.google.android.gms.ads.AdListener
            public void onAdLoaded() {
                String str;
                AdView adView4;
                str = BannerAdManager.TAG;
                Log.d(str, "Banner ad loaded successfully.");
                l lVar3 = l.this;
                adView4 = this.adView;
                p0.a.p(adView4);
                lVar3.invoke(adView4);
            }
        });
    }

    public final void loadAdWithRetry(@NotNull l lVar, @NotNull l lVar2, @NotNull q0.a aVar, int i2) {
        p0.a.s(lVar, "onAdLoaded");
        p0.a.s(lVar2, "onAdFailedToLoad");
        p0.a.s(aVar, "onAdClicked");
        loadAd(lVar, new BannerAdManager$loadAdWithRetry$4(i2, lVar2, this, aVar, lVar), aVar);
    }
}
