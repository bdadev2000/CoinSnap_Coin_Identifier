package com.cooldev.gba.emulator.gameboy.features.admob.interstitial_ad.logic;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.util.Log;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.ViewModelKt;
import com.cooldev.gba.emulator.gameboy.features.admob.interstitial_ad.manager.InterstitialAdManager;
import com.cooldev.gba.emulator.gameboy.features.paywalls.logic.IAPState;
import com.cooldev.gba.emulator.gameboy.features.paywalls.logic.IAPViewModel;
import com.cooldev.gba.emulator.gameboy.local.storage.InterstitialAdPrefUtils;
import com.cooldev.gba.emulator.gameboy.network.services.analytic.events.AdInterstitialEvents;
import com.cooldev.gba.emulator.gameboy.network.services.remote_config.RemoteConfigService;
import d0.b0;
import e1.g1;
import e1.i1;
import e1.m0;
import e1.o0;
import e1.t0;
import h0.g;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;
import q0.l;

@StabilityInferred
/* loaded from: classes2.dex */
public final class InterstitialAdViewModel extends AndroidViewModel {

    @NotNull
    private final m0 _state;

    @NotNull
    private final String adUnitId;

    @SuppressLint({"StaticFieldLeak"})
    private final Context context;

    @NotNull
    private final IAPViewModel iapViewModel;

    @NotNull
    private final InterstitialAdManager interstitialAdManager;

    @NotNull
    private final InterstitialAdPrefUtils interstitialAdPrefUtils;
    private boolean isShowAdsInterstitial;
    private long maxInterstitialAdsCount;
    private final int millisecondsInASecond;
    private long minTimeBetweenAdsInSeconds;

    @NotNull
    private final RemoteConfigService remoteConfigService;

    @NotNull
    private final g1 state;

    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final String LOG_TAG = "InterstitialAdViewModel";

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InterstitialAdViewModel(@NotNull Application application, @NotNull RemoteConfigService remoteConfigService, @NotNull IAPViewModel iAPViewModel) {
        super(application);
        a.s(application, "application");
        a.s(remoteConfigService, "remoteConfigService");
        a.s(iAPViewModel, "iapViewModel");
        this.remoteConfigService = remoteConfigService;
        this.iapViewModel = iAPViewModel;
        Context applicationContext = application.getApplicationContext();
        this.context = applicationContext;
        this.millisecondsInASecond = 1000;
        this.adUnitId = "ca-app-pub-1843002830475037/4324853506";
        a.r(applicationContext, "context");
        this.interstitialAdManager = new InterstitialAdManager(applicationContext, "ca-app-pub-1843002830475037/4324853506");
        this.interstitialAdPrefUtils = InterstitialAdPrefUtils.INSTANCE;
        i1 c2 = t0.c(new InterstitialAdState(false, false, 3, null));
        this._state = c2;
        this.state = new o0(c2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0084 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object fetchDataRemoteConfig(h0.g r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.cooldev.gba.emulator.gameboy.features.admob.interstitial_ad.logic.InterstitialAdViewModel$fetchDataRemoteConfig$1
            if (r0 == 0) goto L13
            r0 = r8
            com.cooldev.gba.emulator.gameboy.features.admob.interstitial_ad.logic.InterstitialAdViewModel$fetchDataRemoteConfig$1 r0 = (com.cooldev.gba.emulator.gameboy.features.admob.interstitial_ad.logic.InterstitialAdViewModel$fetchDataRemoteConfig$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.cooldev.gba.emulator.gameboy.features.admob.interstitial_ad.logic.InterstitialAdViewModel$fetchDataRemoteConfig$1 r0 = new com.cooldev.gba.emulator.gameboy.features.admob.interstitial_ad.logic.InterstitialAdViewModel$fetchDataRemoteConfig$1
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.result
            i0.a r1 = i0.a.f30806a
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L52
            if (r2 == r5) goto L46
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r0 = r0.L$0
            com.cooldev.gba.emulator.gameboy.features.admob.interstitial_ad.logic.InterstitialAdViewModel r0 = (com.cooldev.gba.emulator.gameboy.features.admob.interstitial_ad.logic.InterstitialAdViewModel) r0
            kotlin.jvm.internal.q.m(r8)
            goto La4
        L32:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L3a:
            java.lang.Object r2 = r0.L$1
            com.cooldev.gba.emulator.gameboy.features.admob.interstitial_ad.logic.InterstitialAdViewModel r2 = (com.cooldev.gba.emulator.gameboy.features.admob.interstitial_ad.logic.InterstitialAdViewModel) r2
            java.lang.Object r4 = r0.L$0
            com.cooldev.gba.emulator.gameboy.features.admob.interstitial_ad.logic.InterstitialAdViewModel r4 = (com.cooldev.gba.emulator.gameboy.features.admob.interstitial_ad.logic.InterstitialAdViewModel) r4
            kotlin.jvm.internal.q.m(r8)
            goto L87
        L46:
            java.lang.Object r2 = r0.L$1
            com.cooldev.gba.emulator.gameboy.features.admob.interstitial_ad.logic.InterstitialAdViewModel r2 = (com.cooldev.gba.emulator.gameboy.features.admob.interstitial_ad.logic.InterstitialAdViewModel) r2
            java.lang.Object r5 = r0.L$0
            com.cooldev.gba.emulator.gameboy.features.admob.interstitial_ad.logic.InterstitialAdViewModel r5 = (com.cooldev.gba.emulator.gameboy.features.admob.interstitial_ad.logic.InterstitialAdViewModel) r5
            kotlin.jvm.internal.q.m(r8)
            goto L6a
        L52:
            kotlin.jvm.internal.q.m(r8)
            com.cooldev.gba.emulator.gameboy.network.services.remote_config.RemoteConfigService r8 = r7.remoteConfigService
            com.cooldev.gba.emulator.gameboy.network.services.remote_config.AdSettingsConfig r8 = r8.getAdSettingsConfig()
            r0.L$0 = r7
            r0.L$1 = r7
            r0.label = r5
            java.lang.Object r8 = r8.getValueIsInterstitialAdEnabled(r0)
            if (r8 != r1) goto L68
            return r1
        L68:
            r2 = r7
            r5 = r2
        L6a:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            r2.isShowAdsInterstitial = r8
            com.cooldev.gba.emulator.gameboy.network.services.remote_config.RemoteConfigService r8 = r5.remoteConfigService
            com.cooldev.gba.emulator.gameboy.network.services.remote_config.AdSettingsConfig r8 = r8.getAdSettingsConfig()
            r0.L$0 = r5
            r0.L$1 = r5
            r0.label = r4
            java.lang.Object r8 = r8.getMinInterstitialTimeBetweenAdsInSeconds(r0)
            if (r8 != r1) goto L85
            return r1
        L85:
            r2 = r5
            r4 = r2
        L87:
            java.lang.Number r8 = (java.lang.Number) r8
            long r5 = r8.longValue()
            r2.minTimeBetweenAdsInSeconds = r5
            com.cooldev.gba.emulator.gameboy.network.services.remote_config.RemoteConfigService r8 = r4.remoteConfigService
            com.cooldev.gba.emulator.gameboy.network.services.remote_config.AdSettingsConfig r8 = r8.getAdSettingsConfig()
            r0.L$0 = r4
            r2 = 0
            r0.L$1 = r2
            r0.label = r3
            java.lang.Object r8 = r8.getMaxInterstitialAdsCount(r0)
            if (r8 != r1) goto La3
            return r1
        La3:
            r0 = r4
        La4:
            java.lang.Number r8 = (java.lang.Number) r8
            long r1 = r8.longValue()
            r0.maxInterstitialAdsCount = r1
            d0.b0 r8 = d0.b0.f30125a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cooldev.gba.emulator.gameboy.features.admob.interstitial_ad.logic.InterstitialAdViewModel.fetchDataRemoteConfig(h0.g):java.lang.Object");
    }

    private final boolean isAdEnabled() {
        return this.isShowAdsInterstitial && !((IAPState) this.iapViewModel.getState().getValue()).isPremium();
    }

    private final boolean isInterstitialAdReadyToShow() {
        long currentTimeMillis = System.currentTimeMillis();
        long j2 = this.minTimeBetweenAdsInSeconds;
        long j3 = this.maxInterstitialAdsCount;
        InterstitialAdPrefUtils interstitialAdPrefUtils = this.interstitialAdPrefUtils;
        Context context = this.context;
        a.r(context, "context");
        int countShowInterstitialAds = interstitialAdPrefUtils.getCountShowInterstitialAds(context);
        if (j3 <= 0) {
            return false;
        }
        if (countShowInterstitialAds < j3) {
            Log.d(LOG_TAG, "Count show is less than " + j3 + ", returning true.");
            return true;
        }
        InterstitialAdPrefUtils interstitialAdPrefUtils2 = this.interstitialAdPrefUtils;
        Context context2 = this.context;
        a.r(context2, "context");
        if ((currentTimeMillis - interstitialAdPrefUtils2.getLastAdTimeShowAds(context2)) / this.millisecondsInASecond < j2) {
            Log.d(LOG_TAG, "Not enough time has passed, returning false.");
            return false;
        }
        InterstitialAdPrefUtils interstitialAdPrefUtils3 = this.interstitialAdPrefUtils;
        Context context3 = this.context;
        a.r(context3, "context");
        interstitialAdPrefUtils3.setCountShowInterstitialAds(context3, 0);
        Log.d(LOG_TAG, "Ad is ready to show, resetting count to 0 and returning true.");
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0072 A[PHI: r9
      0x0072: PHI (r9v9 java.lang.Object) = (r9v6 java.lang.Object), (r9v1 java.lang.Object) binds: [B:20:0x006f, B:10:0x0027] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0071 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object loadAd(h0.g r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.cooldev.gba.emulator.gameboy.features.admob.interstitial_ad.logic.InterstitialAdViewModel$loadAd$1
            if (r0 == 0) goto L13
            r0 = r9
            com.cooldev.gba.emulator.gameboy.features.admob.interstitial_ad.logic.InterstitialAdViewModel$loadAd$1 r0 = (com.cooldev.gba.emulator.gameboy.features.admob.interstitial_ad.logic.InterstitialAdViewModel$loadAd$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.cooldev.gba.emulator.gameboy.features.admob.interstitial_ad.logic.InterstitialAdViewModel$loadAd$1 r0 = new com.cooldev.gba.emulator.gameboy.features.admob.interstitial_ad.logic.InterstitialAdViewModel$loadAd$1
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.result
            i0.a r1 = i0.a.f30806a
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3b
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            kotlin.jvm.internal.q.m(r9)
            goto L72
        L2b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L33:
            java.lang.Object r2 = r0.L$0
            b1.r r2 = (b1.r) r2
            kotlin.jvm.internal.q.m(r9)
            goto L54
        L3b:
            kotlin.jvm.internal.q.m(r9)
            b1.s r2 = p0.a.b()
            com.cooldev.gba.emulator.gameboy.features.admob.interstitial_ad.logic.InterstitialAdViewModel$loadAd$result$1 r9 = new com.cooldev.gba.emulator.gameboy.features.admob.interstitial_ad.logic.InterstitialAdViewModel$loadAd$result$1
            r9.<init>(r8, r2, r5)
            r0.L$0 = r2
            r0.label = r4
            r6 = 3000(0xbb8, double:1.482E-320)
            java.lang.Object r9 = p0.a.I0(r6, r9, r0)
            if (r9 != r1) goto L54
            return r1
        L54:
            d0.b0 r9 = (d0.b0) r9
            if (r9 != 0) goto L65
            com.cooldev.gba.emulator.gameboy.network.services.analytic.events.AdInterstitialEvents r9 = com.cooldev.gba.emulator.gameboy.network.services.analytic.events.AdInterstitialEvents.INSTANCE
            r9.logAdInterstitialTimeoutToLoadBottomNav()
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            r4 = r2
            b1.s r4 = (b1.s) r4
            r4.Z(r9)
        L65:
            r0.L$0 = r5
            r0.label = r3
            b1.s r2 = (b1.s) r2
            java.lang.Object r9 = r2.t(r0)
            if (r9 != r1) goto L72
            return r1
        L72:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cooldev.gba.emulator.gameboy.features.admob.interstitial_ad.logic.InterstitialAdViewModel.loadAd(h0.g):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void resetAdState() {
        updateState(InterstitialAdViewModel$resetAdState$1.INSTANCE);
    }

    private final void showInterstitialAd(Activity activity, q0.a aVar, l lVar, q0.a aVar2, q0.a aVar3, q0.a aVar4) {
        e.v(ViewModelKt.a(this), null, 0, new InterstitialAdViewModel$showInterstitialAd$6(this, aVar4, activity, aVar, lVar, aVar2, aVar3, null), 3);
    }

    public static /* synthetic */ void showInterstitialAd$default(InterstitialAdViewModel interstitialAdViewModel, Activity activity, q0.a aVar, l lVar, q0.a aVar2, q0.a aVar3, q0.a aVar4, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            aVar = InterstitialAdViewModel$showInterstitialAd$1.INSTANCE;
        }
        q0.a aVar5 = aVar;
        if ((i2 & 4) != 0) {
            lVar = InterstitialAdViewModel$showInterstitialAd$2.INSTANCE;
        }
        l lVar2 = lVar;
        if ((i2 & 8) != 0) {
            aVar2 = InterstitialAdViewModel$showInterstitialAd$3.INSTANCE;
        }
        q0.a aVar6 = aVar2;
        if ((i2 & 16) != 0) {
            aVar3 = InterstitialAdViewModel$showInterstitialAd$4.INSTANCE;
        }
        q0.a aVar7 = aVar3;
        if ((i2 & 32) != 0) {
            aVar4 = InterstitialAdViewModel$showInterstitialAd$5.INSTANCE;
        }
        interstitialAdViewModel.showInterstitialAd(activity, aVar5, lVar2, aVar6, aVar7, aVar4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateAdShowCount() {
        InterstitialAdPrefUtils interstitialAdPrefUtils = this.interstitialAdPrefUtils;
        Context context = this.context;
        a.r(context, "context");
        int countShowInterstitialAds = interstitialAdPrefUtils.getCountShowInterstitialAds(context);
        InterstitialAdPrefUtils interstitialAdPrefUtils2 = this.interstitialAdPrefUtils;
        Context context2 = this.context;
        a.r(context2, "context");
        interstitialAdPrefUtils2.setCountShowInterstitialAds(context2, countShowInterstitialAds + 1);
        InterstitialAdPrefUtils interstitialAdPrefUtils3 = this.interstitialAdPrefUtils;
        Context context3 = this.context;
        a.r(context3, "context");
        interstitialAdPrefUtils3.setLastTimeShowAds(context3, System.currentTimeMillis());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateState(l lVar) {
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

    @Nullable
    public final Object initializeAd(@NotNull g gVar) {
        Object fetchDataRemoteConfig = fetchDataRemoteConfig(gVar);
        return fetchDataRemoteConfig == i0.a.f30806a ? fetchDataRemoteConfig : b0.f30125a;
    }

    public final void onClickNavigationBar(@NotNull Activity activity, boolean z2, @NotNull q0.a aVar) {
        a.s(activity, "activity");
        a.s(aVar, "onItemClick");
        AdInterstitialEvents adInterstitialEvents = AdInterstitialEvents.INSTANCE;
        adInterstitialEvents.logClickedBottomNav();
        InterstitialAdPrefUtils interstitialAdPrefUtils = this.interstitialAdPrefUtils;
        Context context = this.context;
        a.r(context, "context");
        int clickCount = interstitialAdPrefUtils.getClickCount(context);
        InterstitialAdPrefUtils interstitialAdPrefUtils2 = this.interstitialAdPrefUtils;
        Context context2 = this.context;
        a.r(context2, "context");
        interstitialAdPrefUtils2.setClickCount(context2, clickCount + 1);
        if (!z2) {
            adInterstitialEvents.logAdInterstitialNoInternetBottomNav();
            Log.d(LOG_TAG, "Interstitial ad is not connect internet.");
            aVar.invoke();
            return;
        }
        if (!isAdEnabled()) {
            Log.d(LOG_TAG, "Interstitial ad is not enable.");
            adInterstitialEvents.logAdInterstitialNotEnabledBottomNav();
            aVar.invoke();
        } else if (clickCount % 2 == 1) {
            Log.d(LOG_TAG, "Odd click, skipping ad.");
            adInterstitialEvents.logAdInterstitialOddSkippingBottomNav();
            aVar.invoke();
        } else if (!(true ^ isInterstitialAdReadyToShow())) {
            Log.d(LOG_TAG, "Showing interstitial ad.");
            showInterstitialAd(activity, new InterstitialAdViewModel$onClickNavigationBar$1(aVar), new InterstitialAdViewModel$onClickNavigationBar$2(aVar), new InterstitialAdViewModel$onClickNavigationBar$3(aVar), new InterstitialAdViewModel$onClickNavigationBar$4(this), new InterstitialAdViewModel$onClickNavigationBar$5(aVar));
        } else {
            adInterstitialEvents.logAdInterstitialShowLimitReachedBottomNav();
            Log.d(LOG_TAG, "Interstitial ad not ready, proceeding without showing ad.");
            aVar.invoke();
        }
    }
}
