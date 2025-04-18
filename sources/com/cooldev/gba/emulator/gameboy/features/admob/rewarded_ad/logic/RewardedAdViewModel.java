package com.cooldev.gba.emulator.gameboy.features.admob.rewarded_ad.logic;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.AndroidViewModel;
import b1.s;
import com.cooldev.gba.emulator.gameboy.features.admob.rewarded_ad.manager.RewardedAdManager;
import com.cooldev.gba.emulator.gameboy.features.paywalls.logic.IAPState;
import com.cooldev.gba.emulator.gameboy.features.paywalls.logic.IAPViewModel;
import com.cooldev.gba.emulator.gameboy.network.services.remote_config.RemoteConfigService;
import e1.g1;
import e1.i1;
import e1.m0;
import e1.o0;
import e1.t0;
import h0.g;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import p0.a;
import q0.l;

@StabilityInferred
/* loaded from: classes.dex */
public final class RewardedAdViewModel extends AndroidViewModel {

    @NotNull
    private final m0 _state;

    @NotNull
    private final String adUnitId;

    @SuppressLint({"StaticFieldLeak"})
    private final Context context;

    @NotNull
    private final IAPViewModel iapViewModel;

    @NotNull
    private final RemoteConfigService remoteConfigService;

    @NotNull
    private final RewardedAdManager rewardedAdManager;

    @NotNull
    private final g1 state;

    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final String LOG_TAG = "RewardedAdViewModel";

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RewardedAdViewModel(@NotNull Application application, @NotNull RemoteConfigService remoteConfigService, @NotNull IAPViewModel iAPViewModel) {
        super(application);
        a.s(application, "application");
        a.s(remoteConfigService, "remoteConfigService");
        a.s(iAPViewModel, "iapViewModel");
        this.remoteConfigService = remoteConfigService;
        this.iapViewModel = iAPViewModel;
        this.context = application.getApplicationContext();
        this.adUnitId = "ca-app-pub-1843002830475037/3802018408";
        this.rewardedAdManager = new RewardedAdManager(application, "ca-app-pub-1843002830475037/3802018408");
        i1 c2 = t0.c(new RewardedAdState(false, false, 3, null));
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
    public final java.lang.Object fetchDataRemoteConfig(h0.g r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.cooldev.gba.emulator.gameboy.features.admob.rewarded_ad.logic.RewardedAdViewModel$fetchDataRemoteConfig$1
            if (r0 == 0) goto L13
            r0 = r5
            com.cooldev.gba.emulator.gameboy.features.admob.rewarded_ad.logic.RewardedAdViewModel$fetchDataRemoteConfig$1 r0 = (com.cooldev.gba.emulator.gameboy.features.admob.rewarded_ad.logic.RewardedAdViewModel$fetchDataRemoteConfig$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.cooldev.gba.emulator.gameboy.features.admob.rewarded_ad.logic.RewardedAdViewModel$fetchDataRemoteConfig$1 r0 = new com.cooldev.gba.emulator.gameboy.features.admob.rewarded_ad.logic.RewardedAdViewModel$fetchDataRemoteConfig$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            i0.a r1 = i0.a.f30806a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r0 = r0.L$0
            com.cooldev.gba.emulator.gameboy.features.admob.rewarded_ad.logic.RewardedAdViewModel r0 = (com.cooldev.gba.emulator.gameboy.features.admob.rewarded_ad.logic.RewardedAdViewModel) r0
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
            java.lang.Object r5 = r5.getValueIsShowRewardFree(r0)
            if (r5 != r1) goto L47
            return r1
        L47:
            r0 = r4
        L48:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            com.cooldev.gba.emulator.gameboy.features.admob.rewarded_ad.logic.RewardedAdViewModel$fetchDataRemoteConfig$2 r1 = new com.cooldev.gba.emulator.gameboy.features.admob.rewarded_ad.logic.RewardedAdViewModel$fetchDataRemoteConfig$2
            r1.<init>(r5)
            r0.updateState(r1)
            d0.b0 r5 = d0.b0.f30125a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cooldev.gba.emulator.gameboy.features.admob.rewarded_ad.logic.RewardedAdViewModel.fetchDataRemoteConfig(h0.g):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object loadAd(g gVar) {
        s b2 = a.b();
        this.rewardedAdManager.loadAd(new RewardedAdViewModel$loadAd$2(b2), new RewardedAdViewModel$loadAd$3(b2));
        Object t2 = b2.t(gVar);
        i0.a aVar = i0.a.f30806a;
        return t2;
    }

    public static /* synthetic */ void loadAdWithRetry$default(RewardedAdViewModel rewardedAdViewModel, q0.a aVar, l lVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            aVar = RewardedAdViewModel$loadAdWithRetry$1.INSTANCE;
        }
        if ((i2 & 2) != 0) {
            lVar = RewardedAdViewModel$loadAdWithRetry$2.INSTANCE;
        }
        rewardedAdViewModel.loadAdWithRetry(aVar, lVar);
    }

    public static /* synthetic */ void showRewardedAd$default(RewardedAdViewModel rewardedAdViewModel, Activity activity, q0.a aVar, l lVar, q0.a aVar2, q0.a aVar3, l lVar2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            aVar = RewardedAdViewModel$showRewardedAd$1.INSTANCE;
        }
        q0.a aVar4 = aVar;
        if ((i2 & 4) != 0) {
            lVar = RewardedAdViewModel$showRewardedAd$2.INSTANCE;
        }
        l lVar3 = lVar;
        if ((i2 & 8) != 0) {
            aVar2 = RewardedAdViewModel$showRewardedAd$3.INSTANCE;
        }
        q0.a aVar5 = aVar2;
        if ((i2 & 16) != 0) {
            aVar3 = RewardedAdViewModel$showRewardedAd$4.INSTANCE;
        }
        q0.a aVar6 = aVar3;
        if ((i2 & 32) != 0) {
            lVar2 = RewardedAdViewModel$showRewardedAd$5.INSTANCE;
        }
        rewardedAdViewModel.showRewardedAd(activity, aVar4, lVar3, aVar5, aVar6, lVar2);
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

    /* JADX WARN: Removed duplicated region for block: B:18:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object initializeAd(@org.jetbrains.annotations.NotNull h0.g r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.cooldev.gba.emulator.gameboy.features.admob.rewarded_ad.logic.RewardedAdViewModel$initializeAd$1
            if (r0 == 0) goto L13
            r0 = r7
            com.cooldev.gba.emulator.gameboy.features.admob.rewarded_ad.logic.RewardedAdViewModel$initializeAd$1 r0 = (com.cooldev.gba.emulator.gameboy.features.admob.rewarded_ad.logic.RewardedAdViewModel$initializeAd$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.cooldev.gba.emulator.gameboy.features.admob.rewarded_ad.logic.RewardedAdViewModel$initializeAd$1 r0 = new com.cooldev.gba.emulator.gameboy.features.admob.rewarded_ad.logic.RewardedAdViewModel$initializeAd$1
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.result
            i0.a r1 = i0.a.f30806a
            int r2 = r0.label
            d0.b0 r3 = d0.b0.f30125a
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3c
            if (r2 == r5) goto L34
            if (r2 != r4) goto L2c
            kotlin.jvm.internal.q.m(r7)
            goto L5d
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L34:
            java.lang.Object r2 = r0.L$0
            com.cooldev.gba.emulator.gameboy.features.admob.rewarded_ad.logic.RewardedAdViewModel r2 = (com.cooldev.gba.emulator.gameboy.features.admob.rewarded_ad.logic.RewardedAdViewModel) r2
            kotlin.jvm.internal.q.m(r7)
            goto L4b
        L3c:
            kotlin.jvm.internal.q.m(r7)
            r0.L$0 = r6
            r0.label = r5
            java.lang.Object r7 = r6.fetchDataRemoteConfig(r0)
            if (r7 != r1) goto L4a
            return r1
        L4a:
            r2 = r6
        L4b:
            boolean r7 = r2.isAdEnabled()
            if (r7 == 0) goto L5d
            r7 = 0
            r0.L$0 = r7
            r0.label = r4
            java.lang.Object r7 = r2.loadAd(r0)
            if (r7 != r1) goto L5d
            return r1
        L5d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cooldev.gba.emulator.gameboy.features.admob.rewarded_ad.logic.RewardedAdViewModel.initializeAd(h0.g):java.lang.Object");
    }

    public final boolean isAdEnabled() {
        return ((RewardedAdState) ((i1) this._state).getValue()).isShowAdsRewardedRemoteConfig() && !((IAPState) this.iapViewModel.getState().getValue()).isPremium();
    }

    public final void loadAdWithRetry(@NotNull q0.a aVar, @NotNull l lVar) {
        a.s(aVar, "onAdLoaded");
        a.s(lVar, "onAdFailedToLoad");
        if (isAdEnabled()) {
            RewardedAdManager.loadAdWithRetry$default(this.rewardedAdManager, aVar, lVar, 0, 4, null);
        }
    }

    public final void showRewardedAd(@NotNull Activity activity, @NotNull q0.a aVar, @NotNull l lVar, @NotNull q0.a aVar2, @NotNull q0.a aVar3, @NotNull l lVar2) {
        a.s(activity, "activity");
        a.s(aVar, "onAdDismissed");
        a.s(lVar, "onAdFailedToShow");
        a.s(aVar2, "onAdNotReady");
        a.s(aVar3, "onAdShowed");
        a.s(lVar2, "onUserEarnedReward");
        this.rewardedAdManager.showAd(activity, new RewardedAdViewModel$showRewardedAd$6(this, aVar), new RewardedAdViewModel$showRewardedAd$7(this, lVar), new RewardedAdViewModel$showRewardedAd$8(this, aVar2), new RewardedAdViewModel$showRewardedAd$9(this, aVar3), lVar2, new RewardedAdViewModel$showRewardedAd$10(this));
    }
}
