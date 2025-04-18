package com.cooldev.gba.emulator.gameboy.features.loading_ads;

import android.app.Activity;
import b1.d0;
import com.cooldev.gba.emulator.gameboy.features.admob.app_open_ad.logic.AppOpenAdViewModel;
import com.cooldev.gba.emulator.gameboy.features.paywalls.logic.IAPViewModel;
import com.cooldev.gba.emulator.gameboy.network.services.remote_config.RemoteConfigService;
import d0.b0;
import h0.g;
import j0.e;
import j0.i;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.objectweb.asm.Opcodes;
import q0.a;
import q0.p;

@e(c = "com.cooldev.gba.emulator.gameboy.features.loading_ads.LoadingAdsPageKt$LoadingAdsPage$2$result$1", f = "LoadingAdsPage.kt", l = {Opcodes.SASTORE, Opcodes.POP, Opcodes.POP2}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class LoadingAdsPageKt$LoadingAdsPage$2$result$1 extends i implements p {
    final /* synthetic */ Activity $activity;
    final /* synthetic */ AppOpenAdViewModel $appOpenAdViewModel;
    final /* synthetic */ IAPViewModel $iapViewModel;
    final /* synthetic */ RemoteConfigService $remoteConfigService;
    int label;

    /* renamed from: com.cooldev.gba.emulator.gameboy.features.loading_ads.LoadingAdsPageKt$LoadingAdsPage$2$result$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends r implements a {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        @Override // q0.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m252invoke();
            return b0.f30125a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m252invoke() {
            LoadingAdsPageKt.navigateToIntroPage();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoadingAdsPageKt$LoadingAdsPage$2$result$1(RemoteConfigService remoteConfigService, IAPViewModel iAPViewModel, AppOpenAdViewModel appOpenAdViewModel, Activity activity, g gVar) {
        super(2, gVar);
        this.$remoteConfigService = remoteConfigService;
        this.$iapViewModel = iAPViewModel;
        this.$appOpenAdViewModel = appOpenAdViewModel;
        this.$activity = activity;
    }

    @Override // j0.a
    @NotNull
    public final g create(@Nullable Object obj, @NotNull g gVar) {
        return new LoadingAdsPageKt$LoadingAdsPage$2$result$1(this.$remoteConfigService, this.$iapViewModel, this.$appOpenAdViewModel, this.$activity, gVar);
    }

    @Override // q0.p
    @Nullable
    public final Object invoke(@NotNull d0 d0Var, @Nullable g gVar) {
        return ((LoadingAdsPageKt$LoadingAdsPage$2$result$1) create(d0Var, gVar)).invokeSuspend(b0.f30125a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0046 A[RETURN] */
    @Override // j0.a
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r6) {
        /*
            r5 = this;
            i0.a r0 = i0.a.f30806a
            int r1 = r5.label
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L23
            if (r1 == r4) goto L1f
            if (r1 == r3) goto L1b
            if (r1 != r2) goto L13
            kotlin.jvm.internal.q.m(r6)
            goto L47
        L13:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1b:
            kotlin.jvm.internal.q.m(r6)
            goto L3c
        L1f:
            kotlin.jvm.internal.q.m(r6)
            goto L31
        L23:
            kotlin.jvm.internal.q.m(r6)
            com.cooldev.gba.emulator.gameboy.network.services.remote_config.RemoteConfigService r6 = r5.$remoteConfigService
            r5.label = r4
            java.lang.Object r6 = r6.fetchAndActivate(r5)
            if (r6 != r0) goto L31
            return r0
        L31:
            com.cooldev.gba.emulator.gameboy.features.paywalls.logic.IAPViewModel r6 = r5.$iapViewModel
            r5.label = r3
            java.lang.Object r6 = r6.waitForPurchaseLoading(r5)
            if (r6 != r0) goto L3c
            return r0
        L3c:
            com.cooldev.gba.emulator.gameboy.features.admob.app_open_ad.logic.AppOpenAdViewModel r6 = r5.$appOpenAdViewModel
            r5.label = r2
            java.lang.Object r6 = r6.initializeAd(r5)
            if (r6 != r0) goto L47
            return r0
        L47:
            com.cooldev.gba.emulator.gameboy.features.admob.app_open_ad.logic.AppOpenAdViewModel r6 = r5.$appOpenAdViewModel
            android.app.Activity r0 = r5.$activity
            com.cooldev.gba.emulator.gameboy.features.loading_ads.LoadingAdsPageKt$LoadingAdsPage$2$result$1$1 r1 = com.cooldev.gba.emulator.gameboy.features.loading_ads.LoadingAdsPageKt$LoadingAdsPage$2$result$1.AnonymousClass1.INSTANCE
            r6.showAd(r0, r1)
            d0.b0 r6 = d0.b0.f30125a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cooldev.gba.emulator.gameboy.features.loading_ads.LoadingAdsPageKt$LoadingAdsPage$2$result$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
