package com.cooldev.gba.emulator.gameboy.features.admob.app_open_ad.logic;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.AndroidViewModel;
import b1.s;
import com.cooldev.gba.emulator.gameboy.features.admob.app_open_ad.manager.AppOpenAdManager;
import com.cooldev.gba.emulator.gameboy.features.paywalls.logic.IAPState;
import com.cooldev.gba.emulator.gameboy.features.paywalls.logic.IAPViewModel;
import com.cooldev.gba.emulator.gameboy.network.services.remote_config.RemoteConfigService;
import d0.b0;
import e1.g1;
import e1.i1;
import e1.m0;
import e1.o0;
import e1.t0;
import h0.g;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;
import q0.l;

@StabilityInferred
/* loaded from: classes.dex */
public final class AppOpenAdViewModel extends AndroidViewModel {

    @NotNull
    private final m0 _state;

    @NotNull
    private final String adUnitId;

    @NotNull
    private final AppOpenAdManager appOpenAdManager;

    @SuppressLint({"StaticFieldLeak"})
    private final Context context;

    @NotNull
    private final IAPViewModel iapViewModel;
    private boolean isAppOpenAdEnabled;

    @NotNull
    private final RemoteConfigService remoteConfigService;

    @NotNull
    private final g1 state;

    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Nullable
    private static final String LOG_TAG = g0.a(AppOpenAdViewModel.class).c();

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppOpenAdViewModel(@NotNull Application application, @NotNull RemoteConfigService remoteConfigService, @NotNull IAPViewModel iAPViewModel) {
        super(application);
        a.s(application, "application");
        a.s(remoteConfigService, "remoteConfigService");
        a.s(iAPViewModel, "iapViewModel");
        this.remoteConfigService = remoteConfigService;
        this.iapViewModel = iAPViewModel;
        Context applicationContext = application.getApplicationContext();
        this.context = applicationContext;
        this.adUnitId = "ca-app-pub-1843002830475037/3440751906";
        a.r(applicationContext, "context");
        this.appOpenAdManager = new AppOpenAdManager(applicationContext, "ca-app-pub-1843002830475037/3440751906");
        this.isAppOpenAdEnabled = true;
        i1 c2 = t0.c(new AppOpenAdState(false, 1, null));
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
    public final java.lang.Object fetchRemoteConfigData(h0.g r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.cooldev.gba.emulator.gameboy.features.admob.app_open_ad.logic.AppOpenAdViewModel$fetchRemoteConfigData$1
            if (r0 == 0) goto L13
            r0 = r5
            com.cooldev.gba.emulator.gameboy.features.admob.app_open_ad.logic.AppOpenAdViewModel$fetchRemoteConfigData$1 r0 = (com.cooldev.gba.emulator.gameboy.features.admob.app_open_ad.logic.AppOpenAdViewModel$fetchRemoteConfigData$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.cooldev.gba.emulator.gameboy.features.admob.app_open_ad.logic.AppOpenAdViewModel$fetchRemoteConfigData$1 r0 = new com.cooldev.gba.emulator.gameboy.features.admob.app_open_ad.logic.AppOpenAdViewModel$fetchRemoteConfigData$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            i0.a r1 = i0.a.f30806a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r0 = r0.L$0
            com.cooldev.gba.emulator.gameboy.features.admob.app_open_ad.logic.AppOpenAdViewModel r0 = (com.cooldev.gba.emulator.gameboy.features.admob.app_open_ad.logic.AppOpenAdViewModel) r0
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
            java.lang.Object r5 = r5.getValueIsAppOpenAdEnabled(r0)
            if (r5 != r1) goto L47
            return r1
        L47:
            r0 = r4
        L48:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            r0.isAppOpenAdEnabled = r5
            d0.b0 r5 = d0.b0.f30125a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cooldev.gba.emulator.gameboy.features.admob.app_open_ad.logic.AppOpenAdViewModel.fetchRemoteConfigData(h0.g):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isAdEnabled() {
        return this.isAppOpenAdEnabled && !((IAPState) this.iapViewModel.getState().getValue()).isPremium();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object loadAd(g gVar) {
        s b2 = a.b();
        this.appOpenAdManager.loadAd(new AppOpenAdViewModel$loadAd$2(b2), new AppOpenAdViewModel$loadAd$3(b2));
        Object t2 = b2.t(gVar);
        i0.a aVar = i0.a.f30806a;
        return t2;
    }

    public static /* synthetic */ void loadAdWithRetry$default(AppOpenAdViewModel appOpenAdViewModel, q0.a aVar, l lVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            aVar = AppOpenAdViewModel$loadAdWithRetry$1.INSTANCE;
        }
        if ((i2 & 2) != 0) {
            lVar = AppOpenAdViewModel$loadAdWithRetry$2.INSTANCE;
        }
        appOpenAdViewModel.loadAdWithRetry(aVar, lVar);
    }

    public static /* synthetic */ void showAd$default(AppOpenAdViewModel appOpenAdViewModel, Activity activity, q0.a aVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            aVar = AppOpenAdViewModel$showAd$1.INSTANCE;
        }
        appOpenAdViewModel.showAd(activity, aVar);
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
        Object J = a.J(new AppOpenAdViewModel$initializeAd$2(this, null), gVar);
        return J == i0.a.f30806a ? J : b0.f30125a;
    }

    public final void loadAdWithRetry(@NotNull q0.a aVar, @NotNull l lVar) {
        a.s(aVar, "onAdLoaded");
        a.s(lVar, "onAdFailedToLoad");
        if (isAdEnabled()) {
            AppOpenAdManager.loadAdWithRetry$default(this.appOpenAdManager, aVar, lVar, 0, 4, null);
        }
    }

    public final void showAd(@NotNull Activity activity, @NotNull q0.a aVar) {
        a.s(activity, "activity");
        a.s(aVar, "onAdDismissed");
        if (isAdEnabled()) {
            this.appOpenAdManager.showAd(activity, new AppOpenAdViewModel$showAd$2(this, aVar), new AppOpenAdViewModel$showAd$3(this, aVar), new AppOpenAdViewModel$showAd$4(this, aVar), new AppOpenAdViewModel$showAd$5(this), new AppOpenAdViewModel$showAd$6(this, aVar), AppOpenAdViewModel$showAd$7.INSTANCE);
        } else {
            aVar.invoke();
        }
    }
}
