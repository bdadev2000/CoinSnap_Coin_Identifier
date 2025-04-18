package com.cooldev.gba.emulator.gameboy.features.admob.banner_ads.logic;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.util.Log;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.AndroidViewModel;
import com.cooldev.gba.emulator.gameboy.features.admob.banner_ads.manager.BannerAdManager;
import com.cooldev.gba.emulator.gameboy.features.paywalls.logic.IAPState;
import com.cooldev.gba.emulator.gameboy.features.paywalls.logic.IAPViewModel;
import com.cooldev.gba.emulator.gameboy.network.services.remote_config.RemoteConfigService;
import com.google.android.gms.ads.AdView;
import e1.g1;
import e1.i1;
import e1.m0;
import e1.o0;
import e1.t0;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import p0.a;
import q0.l;

@StabilityInferred
/* loaded from: classes.dex */
public final class BannerAdOnboardingViewModel extends AndroidViewModel {

    @NotNull
    private final m0 _state;

    @NotNull
    private final String adUnitId;

    @NotNull
    private final BannerAdManager bannerAdManager;

    @SuppressLint({"StaticFieldLeak"})
    private final Context context;

    @NotNull
    private final IAPViewModel iapViewModel;

    @NotNull
    private final RemoteConfigService remoteConfigService;

    @NotNull
    private final g1 state;

    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final String TAG = "BannerAdOnboardingViewModel";

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BannerAdOnboardingViewModel(@NotNull Application application, @NotNull RemoteConfigService remoteConfigService, @NotNull IAPViewModel iAPViewModel) {
        super(application);
        a.s(application, "application");
        a.s(remoteConfigService, "remoteConfigService");
        a.s(iAPViewModel, "iapViewModel");
        this.remoteConfigService = remoteConfigService;
        this.iapViewModel = iAPViewModel;
        Context applicationContext = application.getApplicationContext();
        this.context = applicationContext;
        this.adUnitId = "ca-app-pub-1843002830475037/8406772584";
        a.r(applicationContext, "context");
        this.bannerAdManager = new BannerAdManager(applicationContext, "ca-app-pub-1843002830475037/8406772584");
        i1 c2 = t0.c(new BannerAdOnboardingState(false, null, false, 7, null));
        this._state = c2;
        this.state = new o0(c2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object getValueRemoteConfig(h0.g r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.cooldev.gba.emulator.gameboy.features.admob.banner_ads.logic.BannerAdOnboardingViewModel$getValueRemoteConfig$1
            if (r0 == 0) goto L13
            r0 = r5
            com.cooldev.gba.emulator.gameboy.features.admob.banner_ads.logic.BannerAdOnboardingViewModel$getValueRemoteConfig$1 r0 = (com.cooldev.gba.emulator.gameboy.features.admob.banner_ads.logic.BannerAdOnboardingViewModel$getValueRemoteConfig$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.cooldev.gba.emulator.gameboy.features.admob.banner_ads.logic.BannerAdOnboardingViewModel$getValueRemoteConfig$1 r0 = new com.cooldev.gba.emulator.gameboy.features.admob.banner_ads.logic.BannerAdOnboardingViewModel$getValueRemoteConfig$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            i0.a r1 = i0.a.f30806a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r0 = r0.L$0
            com.cooldev.gba.emulator.gameboy.features.admob.banner_ads.logic.BannerAdOnboardingViewModel r0 = (com.cooldev.gba.emulator.gameboy.features.admob.banner_ads.logic.BannerAdOnboardingViewModel) r0
            kotlin.jvm.internal.q.m(r5)
            goto L48
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L33:
            kotlin.jvm.internal.q.m(r5)
            com.cooldev.gba.emulator.gameboy.network.services.remote_config.RemoteConfigService r5 = r4.remoteConfigService
            com.cooldev.gba.emulator.gameboy.network.services.remote_config.AdSettingsConfig r5 = r5.getAdSettingsConfig()
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r5 = r5.getValueIsShowBannerOnboarding(r0)
            if (r5 != r1) goto L47
            return r1
        L47:
            r0 = r4
        L48:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            java.lang.String r1 = com.cooldev.gba.emulator.gameboy.features.admob.banner_ads.logic.BannerAdOnboardingViewModel.TAG
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Banner visibility from remote config: "
            r2.<init>(r3)
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            android.util.Log.d(r1, r2)
            com.cooldev.gba.emulator.gameboy.features.admob.banner_ads.logic.BannerAdOnboardingViewModel$getValueRemoteConfig$2 r1 = new com.cooldev.gba.emulator.gameboy.features.admob.banner_ads.logic.BannerAdOnboardingViewModel$getValueRemoteConfig$2
            r1.<init>(r5)
            r0.updateState(r1)
            d0.b0 r5 = d0.b0.f30125a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cooldev.gba.emulator.gameboy.features.admob.banner_ads.logic.BannerAdOnboardingViewModel.getValueRemoteConfig(h0.g):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleAdLoadFailure() {
        updateState(BannerAdOnboardingViewModel$handleAdLoadFailure$1.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleAdLoaded(AdView adView) {
        updateState(new BannerAdOnboardingViewModel$handleAdLoaded$1(adView));
    }

    private final boolean isAdEnabled() {
        return ((BannerAdOnboardingState) ((i1) this._state).getValue()).getBannerVisible() && !((IAPState) this.iapViewModel.getState().getValue()).isPremium() && !((BannerAdOnboardingState) ((i1) this._state).getValue()).isLoadingAd() && ((BannerAdOnboardingState) ((i1) this._state).getValue()).getAdView() == null;
    }

    private final void loadAd() {
        Log.d(TAG, "Loading ad...");
        updateState(BannerAdOnboardingViewModel$loadAd$1.INSTANCE);
        try {
            this.bannerAdManager.loadAd(new BannerAdOnboardingViewModel$loadAd$2(this), new BannerAdOnboardingViewModel$loadAd$3(this), new BannerAdOnboardingViewModel$loadAd$4(this));
        } catch (Exception e) {
            Log.e(TAG, "Error loading ad: " + e.getMessage());
            handleAdLoadFailure();
        }
    }

    private final void loadAdWithRetry() {
        Log.d(TAG, "Loading ad with retry...");
        updateState(BannerAdOnboardingViewModel$loadAdWithRetry$1.INSTANCE);
        try {
            BannerAdManager.loadAdWithRetry$default(this.bannerAdManager, new BannerAdOnboardingViewModel$loadAdWithRetry$2(this), new BannerAdOnboardingViewModel$loadAdWithRetry$3(this), new BannerAdOnboardingViewModel$loadAdWithRetry$4(this), 0, 8, null);
        } catch (Exception e) {
            Log.e(TAG, "Error loading ad with retry: " + e.getMessage());
            handleAdLoadFailure();
        }
    }

    private final void updateState(l lVar) {
        i1 i1Var;
        Object value;
        m0 m0Var = this._state;
        do {
            i1Var = (i1) m0Var;
            value = i1Var.getValue();
        } while (!i1Var.g(value, lVar.invoke(value)));
    }

    @NotNull
    public final g1 getState() {
        return this.state;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object initializeAd(@org.jetbrains.annotations.NotNull h0.g r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.cooldev.gba.emulator.gameboy.features.admob.banner_ads.logic.BannerAdOnboardingViewModel$initializeAd$1
            if (r0 == 0) goto L13
            r0 = r5
            com.cooldev.gba.emulator.gameboy.features.admob.banner_ads.logic.BannerAdOnboardingViewModel$initializeAd$1 r0 = (com.cooldev.gba.emulator.gameboy.features.admob.banner_ads.logic.BannerAdOnboardingViewModel$initializeAd$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.cooldev.gba.emulator.gameboy.features.admob.banner_ads.logic.BannerAdOnboardingViewModel$initializeAd$1 r0 = new com.cooldev.gba.emulator.gameboy.features.admob.banner_ads.logic.BannerAdOnboardingViewModel$initializeAd$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            i0.a r1 = i0.a.f30806a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r0 = r0.L$0
            com.cooldev.gba.emulator.gameboy.features.admob.banner_ads.logic.BannerAdOnboardingViewModel r0 = (com.cooldev.gba.emulator.gameboy.features.admob.banner_ads.logic.BannerAdOnboardingViewModel) r0
            kotlin.jvm.internal.q.m(r5)
            goto L42
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L33:
            kotlin.jvm.internal.q.m(r5)
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r5 = r4.getValueRemoteConfig(r0)
            if (r5 != r1) goto L41
            return r1
        L41:
            r0 = r4
        L42:
            boolean r5 = r0.isAdEnabled()
            if (r5 == 0) goto L4b
            r0.loadAd()
        L4b:
            d0.b0 r5 = d0.b0.f30125a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cooldev.gba.emulator.gameboy.features.admob.banner_ads.logic.BannerAdOnboardingViewModel.initializeAd(h0.g):java.lang.Object");
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        Log.d(TAG, "ViewModel cleared, destroying banner ad manager.");
        this.bannerAdManager.destroy();
        updateState(BannerAdOnboardingViewModel$onCleared$1.INSTANCE);
        super.onCleared();
    }

    public final void retryGetBannerAdView() {
        String str = TAG;
        Log.d(str, "Retrying to get banner ad view...");
        if (isAdEnabled()) {
            loadAdWithRetry();
        } else {
            Log.d(str, "Ad is not enabled, skipping retry.");
        }
    }
}
