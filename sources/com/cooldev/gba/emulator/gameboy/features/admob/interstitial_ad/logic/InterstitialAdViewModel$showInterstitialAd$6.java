package com.cooldev.gba.emulator.gameboy.features.admob.interstitial_ad.logic;

import android.app.Activity;
import android.content.Context;
import b1.d0;
import com.cooldev.gba.emulator.gameboy.features.admob.interstitial_ad.manager.InterstitialAdManager;
import com.cooldev.gba.emulator.gameboy.local.storage.AppOpenAdPrefUtils;
import com.cooldev.gba.emulator.gameboy.network.services.analytic.events.AdInterstitialEvents;
import d0.b0;
import h0.g;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q0.a;
import q0.l;
import q0.p;

@e(c = "com.cooldev.gba.emulator.gameboy.features.admob.interstitial_ad.logic.InterstitialAdViewModel$showInterstitialAd$6", f = "InterstitialAdViewModel.kt", l = {111}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class InterstitialAdViewModel$showInterstitialAd$6 extends i implements p {
    final /* synthetic */ Activity $activity;
    final /* synthetic */ a $onAdDismissed;
    final /* synthetic */ a $onAdFailedToLoad;
    final /* synthetic */ l $onAdFailedToShow;
    final /* synthetic */ a $onAdNotReady;
    final /* synthetic */ a $onAdShowed;
    int label;
    final /* synthetic */ InterstitialAdViewModel this$0;

    /* renamed from: com.cooldev.gba.emulator.gameboy.features.admob.interstitial_ad.logic.InterstitialAdViewModel$showInterstitialAd$6$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends r implements l {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // q0.l
        @NotNull
        public final InterstitialAdState invoke(@NotNull InterstitialAdState interstitialAdState) {
            p0.a.s(interstitialAdState, "it");
            return InterstitialAdState.copy$default(interstitialAdState, false, true, 1, null);
        }
    }

    /* renamed from: com.cooldev.gba.emulator.gameboy.features.admob.interstitial_ad.logic.InterstitialAdViewModel$showInterstitialAd$6$2, reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass2 extends r implements a {
        final /* synthetic */ a $onAdDismissed;
        final /* synthetic */ InterstitialAdViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(InterstitialAdViewModel interstitialAdViewModel, a aVar) {
            super(0);
            this.this$0 = interstitialAdViewModel;
            this.$onAdDismissed = aVar;
        }

        @Override // q0.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m89invoke();
            return b0.f30125a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m89invoke() {
            AdInterstitialEvents.INSTANCE.logAdInterstitialDismissedBottomNav();
            this.this$0.resetAdState();
            this.$onAdDismissed.invoke();
        }
    }

    /* renamed from: com.cooldev.gba.emulator.gameboy.features.admob.interstitial_ad.logic.InterstitialAdViewModel$showInterstitialAd$6$3, reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass3 extends r implements l {
        final /* synthetic */ l $onAdFailedToShow;
        final /* synthetic */ InterstitialAdViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(InterstitialAdViewModel interstitialAdViewModel, l lVar) {
            super(1);
            this.this$0 = interstitialAdViewModel;
            this.$onAdFailedToShow = lVar;
        }

        @Override // q0.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return b0.f30125a;
        }

        public final void invoke(@NotNull String str) {
            p0.a.s(str, "error");
            AdInterstitialEvents.INSTANCE.logAdInterstitialShowedFailureBottomNav();
            this.this$0.resetAdState();
            this.$onAdFailedToShow.invoke(str);
        }
    }

    /* renamed from: com.cooldev.gba.emulator.gameboy.features.admob.interstitial_ad.logic.InterstitialAdViewModel$showInterstitialAd$6$4, reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass4 extends r implements a {
        final /* synthetic */ a $onAdNotReady;
        final /* synthetic */ InterstitialAdViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(InterstitialAdViewModel interstitialAdViewModel, a aVar) {
            super(0);
            this.this$0 = interstitialAdViewModel;
            this.$onAdNotReady = aVar;
        }

        @Override // q0.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m90invoke();
            return b0.f30125a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m90invoke() {
            AdInterstitialEvents.INSTANCE.logAdInterstitialNotReadyBottomNav();
            this.this$0.resetAdState();
            this.$onAdNotReady.invoke();
        }
    }

    /* renamed from: com.cooldev.gba.emulator.gameboy.features.admob.interstitial_ad.logic.InterstitialAdViewModel$showInterstitialAd$6$5, reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass5 extends r implements a {
        final /* synthetic */ a $onAdShowed;
        final /* synthetic */ InterstitialAdViewModel this$0;

        /* renamed from: com.cooldev.gba.emulator.gameboy.features.admob.interstitial_ad.logic.InterstitialAdViewModel$showInterstitialAd$6$5$1, reason: invalid class name */
        /* loaded from: classes2.dex */
        public static final class AnonymousClass1 extends r implements l {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            public AnonymousClass1() {
                super(1);
            }

            @Override // q0.l
            @NotNull
            public final InterstitialAdState invoke(@NotNull InterstitialAdState interstitialAdState) {
                p0.a.s(interstitialAdState, "it");
                return interstitialAdState.copy(true, false);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(InterstitialAdViewModel interstitialAdViewModel, a aVar) {
            super(0);
            this.this$0 = interstitialAdViewModel;
            this.$onAdShowed = aVar;
        }

        @Override // q0.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m91invoke();
            return b0.f30125a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m91invoke() {
            AdInterstitialEvents.INSTANCE.logAdInterstitialShowedBottomNav();
            this.this$0.updateState(AnonymousClass1.INSTANCE);
            this.$onAdShowed.invoke();
        }
    }

    /* renamed from: com.cooldev.gba.emulator.gameboy.features.admob.interstitial_ad.logic.InterstitialAdViewModel$showInterstitialAd$6$6, reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass6 extends r implements a {
        final /* synthetic */ InterstitialAdViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass6(InterstitialAdViewModel interstitialAdViewModel) {
            super(0);
            this.this$0 = interstitialAdViewModel;
        }

        @Override // q0.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m92invoke();
            return b0.f30125a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m92invoke() {
            Context context;
            AdInterstitialEvents.INSTANCE.logAdInterstitialClickedBottomNav();
            AppOpenAdPrefUtils appOpenAdPrefUtils = AppOpenAdPrefUtils.INSTANCE;
            context = this.this$0.context;
            p0.a.r(context, "access$getContext$p(...)");
            appOpenAdPrefUtils.setShowAppOpenAdOnResume(context, false);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InterstitialAdViewModel$showInterstitialAd$6(InterstitialAdViewModel interstitialAdViewModel, a aVar, Activity activity, a aVar2, l lVar, a aVar3, a aVar4, g gVar) {
        super(2, gVar);
        this.this$0 = interstitialAdViewModel;
        this.$onAdFailedToLoad = aVar;
        this.$activity = activity;
        this.$onAdDismissed = aVar2;
        this.$onAdFailedToShow = lVar;
        this.$onAdNotReady = aVar3;
        this.$onAdShowed = aVar4;
    }

    @Override // j0.a
    @NotNull
    public final g create(@Nullable Object obj, @NotNull g gVar) {
        return new InterstitialAdViewModel$showInterstitialAd$6(this.this$0, this.$onAdFailedToLoad, this.$activity, this.$onAdDismissed, this.$onAdFailedToShow, this.$onAdNotReady, this.$onAdShowed, gVar);
    }

    @Override // q0.p
    @Nullable
    public final Object invoke(@NotNull d0 d0Var, @Nullable g gVar) {
        return ((InterstitialAdViewModel$showInterstitialAd$6) create(d0Var, gVar)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        InterstitialAdManager interstitialAdManager;
        i0.a aVar = i0.a.f30806a;
        int i2 = this.label;
        if (i2 == 0) {
            q.m(obj);
            AdInterstitialEvents.INSTANCE.logAdInterstitialShowingBottomNav();
            this.this$0.updateState(AnonymousClass1.INSTANCE);
            InterstitialAdViewModel interstitialAdViewModel = this.this$0;
            this.label = 1;
            obj = interstitialAdViewModel.loadAd(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q.m(obj);
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        b0 b0Var = b0.f30125a;
        if (booleanValue) {
            interstitialAdManager = this.this$0.interstitialAdManager;
            interstitialAdManager.showAd(this.$activity, new AnonymousClass2(this.this$0, this.$onAdDismissed), new AnonymousClass3(this.this$0, this.$onAdFailedToShow), new AnonymousClass4(this.this$0, this.$onAdNotReady), new AnonymousClass5(this.this$0, this.$onAdShowed), new AnonymousClass6(this.this$0));
            return b0Var;
        }
        this.this$0.resetAdState();
        this.$onAdFailedToLoad.invoke();
        return b0Var;
    }
}
