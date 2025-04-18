package com.cooldev.gba.emulator.gameboy.features;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import b1.d0;
import com.cooldev.gba.emulator.gameboy.features.admob.app_open_ad.logic.AppOpenAdViewModel;
import com.cooldev.gba.emulator.gameboy.features.admob.banner_ads.logic.BannerAdGameViewModel;
import com.cooldev.gba.emulator.gameboy.features.admob.banner_ads.logic.BannerAdOnboardingViewModel;
import com.cooldev.gba.emulator.gameboy.features.admob.banner_ads.logic.BannerAdViewModel;
import com.cooldev.gba.emulator.gameboy.features.admob.rewarded_ad.logic.RewardedAdViewModel;
import com.cooldev.gba.emulator.gameboy.features.paywalls.logic.IAPViewModel;
import d0.b0;
import h0.g;
import i0.a;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q0.p;

@e(c = "com.cooldev.gba.emulator.gameboy.features.GBAEmulatorAppKt$LoadAdsOnConnectivityChange$1", f = "GBAEmulatorApp.kt", l = {224}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class GBAEmulatorAppKt$LoadAdsOnConnectivityChange$1 extends i implements p {
    final /* synthetic */ AppOpenAdViewModel $appOpenAdViewModel;
    final /* synthetic */ BannerAdGameViewModel $bannerAdGameViewModel;
    final /* synthetic */ BannerAdOnboardingViewModel $bannerAdOnboardingViewModel;
    final /* synthetic */ BannerAdViewModel $bannerAdViewModel;
    final /* synthetic */ IAPViewModel $iapViewModel;
    final /* synthetic */ State<Boolean> $isConnected$delegate;
    final /* synthetic */ boolean $isOnboardingVisible;
    final /* synthetic */ MutableState<Boolean> $reLoadAd$delegate;
    final /* synthetic */ RewardedAdViewModel $rewardedAdViewModel;
    int label;

    @e(c = "com.cooldev.gba.emulator.gameboy.features.GBAEmulatorAppKt$LoadAdsOnConnectivityChange$1$1", f = "GBAEmulatorApp.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.cooldev.gba.emulator.gameboy.features.GBAEmulatorAppKt$LoadAdsOnConnectivityChange$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends i implements p {
        final /* synthetic */ AppOpenAdViewModel $appOpenAdViewModel;
        final /* synthetic */ BannerAdGameViewModel $bannerAdGameViewModel;
        final /* synthetic */ BannerAdOnboardingViewModel $bannerAdOnboardingViewModel;
        final /* synthetic */ BannerAdViewModel $bannerAdViewModel;
        final /* synthetic */ IAPViewModel $iapViewModel;
        final /* synthetic */ boolean $isOnboardingVisible;
        final /* synthetic */ RewardedAdViewModel $rewardedAdViewModel;
        private /* synthetic */ Object L$0;
        int label;

        @e(c = "com.cooldev.gba.emulator.gameboy.features.GBAEmulatorAppKt$LoadAdsOnConnectivityChange$1$1$1", f = "GBAEmulatorApp.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.cooldev.gba.emulator.gameboy.features.GBAEmulatorAppKt$LoadAdsOnConnectivityChange$1$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C01081 extends i implements p {
            final /* synthetic */ AppOpenAdViewModel $appOpenAdViewModel;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C01081(AppOpenAdViewModel appOpenAdViewModel, g gVar) {
                super(2, gVar);
                this.$appOpenAdViewModel = appOpenAdViewModel;
            }

            @Override // j0.a
            @NotNull
            public final g create(@Nullable Object obj, @NotNull g gVar) {
                return new C01081(this.$appOpenAdViewModel, gVar);
            }

            @Override // q0.p
            @Nullable
            public final Object invoke(@NotNull d0 d0Var, @Nullable g gVar) {
                return ((C01081) create(d0Var, gVar)).invokeSuspend(b0.f30125a);
            }

            @Override // j0.a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                a aVar = a.f30806a;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                q.m(obj);
                AppOpenAdViewModel.loadAdWithRetry$default(this.$appOpenAdViewModel, null, null, 3, null);
                return b0.f30125a;
            }
        }

        @e(c = "com.cooldev.gba.emulator.gameboy.features.GBAEmulatorAppKt$LoadAdsOnConnectivityChange$1$1$2", f = "GBAEmulatorApp.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.cooldev.gba.emulator.gameboy.features.GBAEmulatorAppKt$LoadAdsOnConnectivityChange$1$1$2, reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass2 extends i implements p {
            final /* synthetic */ BannerAdViewModel $bannerAdViewModel;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(BannerAdViewModel bannerAdViewModel, g gVar) {
                super(2, gVar);
                this.$bannerAdViewModel = bannerAdViewModel;
            }

            @Override // j0.a
            @NotNull
            public final g create(@Nullable Object obj, @NotNull g gVar) {
                return new AnonymousClass2(this.$bannerAdViewModel, gVar);
            }

            @Override // q0.p
            @Nullable
            public final Object invoke(@NotNull d0 d0Var, @Nullable g gVar) {
                return ((AnonymousClass2) create(d0Var, gVar)).invokeSuspend(b0.f30125a);
            }

            @Override // j0.a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                a aVar = a.f30806a;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                q.m(obj);
                this.$bannerAdViewModel.retryGetBannerAdView();
                return b0.f30125a;
            }
        }

        @e(c = "com.cooldev.gba.emulator.gameboy.features.GBAEmulatorAppKt$LoadAdsOnConnectivityChange$1$1$3", f = "GBAEmulatorApp.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.cooldev.gba.emulator.gameboy.features.GBAEmulatorAppKt$LoadAdsOnConnectivityChange$1$1$3, reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass3 extends i implements p {
            final /* synthetic */ BannerAdGameViewModel $bannerAdGameViewModel;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(BannerAdGameViewModel bannerAdGameViewModel, g gVar) {
                super(2, gVar);
                this.$bannerAdGameViewModel = bannerAdGameViewModel;
            }

            @Override // j0.a
            @NotNull
            public final g create(@Nullable Object obj, @NotNull g gVar) {
                return new AnonymousClass3(this.$bannerAdGameViewModel, gVar);
            }

            @Override // q0.p
            @Nullable
            public final Object invoke(@NotNull d0 d0Var, @Nullable g gVar) {
                return ((AnonymousClass3) create(d0Var, gVar)).invokeSuspend(b0.f30125a);
            }

            @Override // j0.a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                a aVar = a.f30806a;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                q.m(obj);
                this.$bannerAdGameViewModel.retryGetBannerAdView();
                return b0.f30125a;
            }
        }

        @e(c = "com.cooldev.gba.emulator.gameboy.features.GBAEmulatorAppKt$LoadAdsOnConnectivityChange$1$1$4", f = "GBAEmulatorApp.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.cooldev.gba.emulator.gameboy.features.GBAEmulatorAppKt$LoadAdsOnConnectivityChange$1$1$4, reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass4 extends i implements p {
            final /* synthetic */ RewardedAdViewModel $rewardedAdViewModel;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass4(RewardedAdViewModel rewardedAdViewModel, g gVar) {
                super(2, gVar);
                this.$rewardedAdViewModel = rewardedAdViewModel;
            }

            @Override // j0.a
            @NotNull
            public final g create(@Nullable Object obj, @NotNull g gVar) {
                return new AnonymousClass4(this.$rewardedAdViewModel, gVar);
            }

            @Override // q0.p
            @Nullable
            public final Object invoke(@NotNull d0 d0Var, @Nullable g gVar) {
                return ((AnonymousClass4) create(d0Var, gVar)).invokeSuspend(b0.f30125a);
            }

            @Override // j0.a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                a aVar = a.f30806a;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                q.m(obj);
                RewardedAdViewModel.loadAdWithRetry$default(this.$rewardedAdViewModel, null, null, 3, null);
                return b0.f30125a;
            }
        }

        @e(c = "com.cooldev.gba.emulator.gameboy.features.GBAEmulatorAppKt$LoadAdsOnConnectivityChange$1$1$5", f = "GBAEmulatorApp.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.cooldev.gba.emulator.gameboy.features.GBAEmulatorAppKt$LoadAdsOnConnectivityChange$1$1$5, reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass5 extends i implements p {
            final /* synthetic */ BannerAdOnboardingViewModel $bannerAdOnboardingViewModel;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass5(BannerAdOnboardingViewModel bannerAdOnboardingViewModel, g gVar) {
                super(2, gVar);
                this.$bannerAdOnboardingViewModel = bannerAdOnboardingViewModel;
            }

            @Override // j0.a
            @NotNull
            public final g create(@Nullable Object obj, @NotNull g gVar) {
                return new AnonymousClass5(this.$bannerAdOnboardingViewModel, gVar);
            }

            @Override // q0.p
            @Nullable
            public final Object invoke(@NotNull d0 d0Var, @Nullable g gVar) {
                return ((AnonymousClass5) create(d0Var, gVar)).invokeSuspend(b0.f30125a);
            }

            @Override // j0.a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                a aVar = a.f30806a;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                q.m(obj);
                this.$bannerAdOnboardingViewModel.retryGetBannerAdView();
                return b0.f30125a;
            }
        }

        @e(c = "com.cooldev.gba.emulator.gameboy.features.GBAEmulatorAppKt$LoadAdsOnConnectivityChange$1$1$6", f = "GBAEmulatorApp.kt", l = {232}, m = "invokeSuspend")
        /* renamed from: com.cooldev.gba.emulator.gameboy.features.GBAEmulatorAppKt$LoadAdsOnConnectivityChange$1$1$6, reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass6 extends i implements p {
            final /* synthetic */ IAPViewModel $iapViewModel;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass6(IAPViewModel iAPViewModel, g gVar) {
                super(2, gVar);
                this.$iapViewModel = iAPViewModel;
            }

            @Override // j0.a
            @NotNull
            public final g create(@Nullable Object obj, @NotNull g gVar) {
                return new AnonymousClass6(this.$iapViewModel, gVar);
            }

            @Override // q0.p
            @Nullable
            public final Object invoke(@NotNull d0 d0Var, @Nullable g gVar) {
                return ((AnonymousClass6) create(d0Var, gVar)).invokeSuspend(b0.f30125a);
            }

            @Override // j0.a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                a aVar = a.f30806a;
                int i2 = this.label;
                if (i2 == 0) {
                    q.m(obj);
                    IAPViewModel iAPViewModel = this.$iapViewModel;
                    this.label = 1;
                    if (IAPViewModel.retryConnectBillingClient$default(iAPViewModel, null, null, this, 3, null) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    q.m(obj);
                }
                return b0.f30125a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(boolean z2, AppOpenAdViewModel appOpenAdViewModel, BannerAdViewModel bannerAdViewModel, BannerAdGameViewModel bannerAdGameViewModel, RewardedAdViewModel rewardedAdViewModel, BannerAdOnboardingViewModel bannerAdOnboardingViewModel, IAPViewModel iAPViewModel, g gVar) {
            super(2, gVar);
            this.$isOnboardingVisible = z2;
            this.$appOpenAdViewModel = appOpenAdViewModel;
            this.$bannerAdViewModel = bannerAdViewModel;
            this.$bannerAdGameViewModel = bannerAdGameViewModel;
            this.$rewardedAdViewModel = rewardedAdViewModel;
            this.$bannerAdOnboardingViewModel = bannerAdOnboardingViewModel;
            this.$iapViewModel = iAPViewModel;
        }

        @Override // j0.a
        @NotNull
        public final g create(@Nullable Object obj, @NotNull g gVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$isOnboardingVisible, this.$appOpenAdViewModel, this.$bannerAdViewModel, this.$bannerAdGameViewModel, this.$rewardedAdViewModel, this.$bannerAdOnboardingViewModel, this.$iapViewModel, gVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // q0.p
        @Nullable
        public final Object invoke(@NotNull d0 d0Var, @Nullable g gVar) {
            return ((AnonymousClass1) create(d0Var, gVar)).invokeSuspend(b0.f30125a);
        }

        @Override // j0.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            a aVar = a.f30806a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q.m(obj);
            d0 d0Var = (d0) this.L$0;
            kotlin.jvm.internal.e.v(d0Var, null, 0, new C01081(this.$appOpenAdViewModel, null), 3);
            kotlin.jvm.internal.e.v(d0Var, null, 0, new AnonymousClass2(this.$bannerAdViewModel, null), 3);
            kotlin.jvm.internal.e.v(d0Var, null, 0, new AnonymousClass3(this.$bannerAdGameViewModel, null), 3);
            kotlin.jvm.internal.e.v(d0Var, null, 0, new AnonymousClass4(this.$rewardedAdViewModel, null), 3);
            if (this.$isOnboardingVisible) {
                kotlin.jvm.internal.e.v(d0Var, null, 0, new AnonymousClass5(this.$bannerAdOnboardingViewModel, null), 3);
            }
            return kotlin.jvm.internal.e.v(d0Var, null, 0, new AnonymousClass6(this.$iapViewModel, null), 3);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GBAEmulatorAppKt$LoadAdsOnConnectivityChange$1(State<Boolean> state, MutableState<Boolean> mutableState, boolean z2, AppOpenAdViewModel appOpenAdViewModel, BannerAdViewModel bannerAdViewModel, BannerAdGameViewModel bannerAdGameViewModel, RewardedAdViewModel rewardedAdViewModel, BannerAdOnboardingViewModel bannerAdOnboardingViewModel, IAPViewModel iAPViewModel, g gVar) {
        super(2, gVar);
        this.$isConnected$delegate = state;
        this.$reLoadAd$delegate = mutableState;
        this.$isOnboardingVisible = z2;
        this.$appOpenAdViewModel = appOpenAdViewModel;
        this.$bannerAdViewModel = bannerAdViewModel;
        this.$bannerAdGameViewModel = bannerAdGameViewModel;
        this.$rewardedAdViewModel = rewardedAdViewModel;
        this.$bannerAdOnboardingViewModel = bannerAdOnboardingViewModel;
        this.$iapViewModel = iAPViewModel;
    }

    @Override // j0.a
    @NotNull
    public final g create(@Nullable Object obj, @NotNull g gVar) {
        return new GBAEmulatorAppKt$LoadAdsOnConnectivityChange$1(this.$isConnected$delegate, this.$reLoadAd$delegate, this.$isOnboardingVisible, this.$appOpenAdViewModel, this.$bannerAdViewModel, this.$bannerAdGameViewModel, this.$rewardedAdViewModel, this.$bannerAdOnboardingViewModel, this.$iapViewModel, gVar);
    }

    @Override // q0.p
    @Nullable
    public final Object invoke(@NotNull d0 d0Var, @Nullable g gVar) {
        return ((GBAEmulatorAppKt$LoadAdsOnConnectivityChange$1) create(d0Var, gVar)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        boolean LoadAdsOnConnectivityChange$lambda$6;
        boolean LoadAdsOnConnectivityChange$lambda$8;
        a aVar = a.f30806a;
        int i2 = this.label;
        if (i2 == 0) {
            q.m(obj);
            LoadAdsOnConnectivityChange$lambda$6 = GBAEmulatorAppKt.LoadAdsOnConnectivityChange$lambda$6(this.$isConnected$delegate);
            if (LoadAdsOnConnectivityChange$lambda$6) {
                LoadAdsOnConnectivityChange$lambda$8 = GBAEmulatorAppKt.LoadAdsOnConnectivityChange$lambda$8(this.$reLoadAd$delegate);
                if (LoadAdsOnConnectivityChange$lambda$8) {
                    GBAEmulatorAppKt.LoadAdsOnConnectivityChange$lambda$9(this.$reLoadAd$delegate, false);
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$isOnboardingVisible, this.$appOpenAdViewModel, this.$bannerAdViewModel, this.$bannerAdGameViewModel, this.$rewardedAdViewModel, this.$bannerAdOnboardingViewModel, this.$iapViewModel, null);
                    this.label = 1;
                    if (p0.a.J(anonymousClass1, this) == aVar) {
                        return aVar;
                    }
                }
            }
            GBAEmulatorAppKt.LoadAdsOnConnectivityChange$lambda$9(this.$reLoadAd$delegate, true);
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q.m(obj);
        }
        return b0.f30125a;
    }
}
