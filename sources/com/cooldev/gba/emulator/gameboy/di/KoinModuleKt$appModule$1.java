package com.cooldev.gba.emulator.gameboy.di;

import android.app.Application;
import com.applovin.impl.adview.t;
import com.cooldev.gba.emulator.gameboy.features.admob.app_open_ad.logic.AppOpenAdViewModel;
import com.cooldev.gba.emulator.gameboy.features.admob.banner_ads.logic.BannerAdGameViewModel;
import com.cooldev.gba.emulator.gameboy.features.admob.banner_ads.logic.BannerAdOnboardingViewModel;
import com.cooldev.gba.emulator.gameboy.features.admob.banner_ads.logic.BannerAdViewModel;
import com.cooldev.gba.emulator.gameboy.features.admob.interstitial_ad.logic.InterstitialAdViewModel;
import com.cooldev.gba.emulator.gameboy.features.admob.rewarded_ad.logic.RewardedAdViewModel;
import com.cooldev.gba.emulator.gameboy.features.app.logic.AppViewModel;
import com.cooldev.gba.emulator.gameboy.features.app.logic.PaywallNavigationViewModel;
import com.cooldev.gba.emulator.gameboy.features.dashboard.logic.UserGuideViewModel;
import com.cooldev.gba.emulator.gameboy.features.dialogs.auto_save_dialog.logic.AutoSaveDialogViewModel;
import com.cooldev.gba.emulator.gameboy.features.dialogs.cancel_sub_dialog.logic.CancelSubDialogViewModel;
import com.cooldev.gba.emulator.gameboy.features.dialogs.loading_dialog.logic.LoadingDialogViewModel;
import com.cooldev.gba.emulator.gameboy.features.dialogs.rating_dialog.logic.RatingDialogViewModel;
import com.cooldev.gba.emulator.gameboy.features.game.logic.GameViewModel;
import com.cooldev.gba.emulator.gameboy.features.guide.logic.GuideViewModel;
import com.cooldev.gba.emulator.gameboy.features.home.logic.HomeViewModel;
import com.cooldev.gba.emulator.gameboy.features.home.models.Game;
import com.cooldev.gba.emulator.gameboy.features.onboarding.logic.OnboardingViewModel;
import com.cooldev.gba.emulator.gameboy.features.overlays.load_game.logic.LoadGameViewModel;
import com.cooldev.gba.emulator.gameboy.features.overlays.menu_game.logic.MenuGameViewModel;
import com.cooldev.gba.emulator.gameboy.features.overlays.paywalls.logic.PurchaseOverlayViewModel;
import com.cooldev.gba.emulator.gameboy.features.overlays.save_game.logic.SaveGameViewModel;
import com.cooldev.gba.emulator.gameboy.features.paywalls.logic.IAPViewModel;
import com.cooldev.gba.emulator.gameboy.features.paywalls.logic.PurchasePageViewModel;
import com.cooldev.gba.emulator.gameboy.features.popups.popup_file_and_download.logic.AddGameViewModel;
import com.cooldev.gba.emulator.gameboy.features.setting.logic.SettingViewModel;
import com.cooldev.gba.emulator.gameboy.features.themenew.logic.ThemeViewModel;
import com.cooldev.gba.emulator.gameboy.features.view_all.logic.ViewAllViewModel;
import com.cooldev.gba.emulator.gameboy.network.repo.SlackApiRepositoryImpl;
import com.cooldev.gba.emulator.gameboy.network.services.remote_config.RemoteConfigService;
import d0.b0;
import e0.w;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.Kind;
import org.koin.core.definition.KoinDefinition;
import org.koin.core.instance.FactoryInstanceFactory;
import org.koin.core.instance.InstanceFactory;
import org.koin.core.instance.SingleInstanceFactory;
import org.koin.core.module.Module;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.StringQualifier;
import org.koin.core.registry.ScopeRegistry;
import org.koin.core.scope.Scope;
import p0.a;
import q0.l;
import q0.p;

/* loaded from: classes3.dex */
public final class KoinModuleKt$appModule$1 extends r implements l {
    public static final KoinModuleKt$appModule$1 INSTANCE = new KoinModuleKt$appModule$1();

    /* renamed from: com.cooldev.gba.emulator.gameboy.di.KoinModuleKt$appModule$1$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends r implements p {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(2);
        }

        @Override // q0.p
        @NotNull
        public final SlackApiRepositoryImpl invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
            a.s(scope, "$this$single");
            a.s(parametersHolder, "it");
            return new SlackApiRepositoryImpl();
        }
    }

    /* renamed from: com.cooldev.gba.emulator.gameboy.di.KoinModuleKt$appModule$1$10, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass10 extends r implements p {
        public static final AnonymousClass10 INSTANCE = new AnonymousClass10();

        public AnonymousClass10() {
            super(2);
        }

        @Override // q0.p
        @NotNull
        public final BannerAdGameViewModel invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
            a.s(scope, "$this$single");
            a.s(parametersHolder, "it");
            return new BannerAdGameViewModel((Application) scope.get(g0.a(Application.class), null, null), (RemoteConfigService) scope.get(g0.a(RemoteConfigService.class), null, null), (IAPViewModel) scope.get(g0.a(IAPViewModel.class), null, null));
        }
    }

    /* renamed from: com.cooldev.gba.emulator.gameboy.di.KoinModuleKt$appModule$1$11, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass11 extends r implements p {
        public static final AnonymousClass11 INSTANCE = new AnonymousClass11();

        public AnonymousClass11() {
            super(2);
        }

        @Override // q0.p
        @NotNull
        public final RewardedAdViewModel invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
            a.s(scope, "$this$single");
            a.s(parametersHolder, "it");
            return new RewardedAdViewModel((Application) scope.get(g0.a(Application.class), null, null), (RemoteConfigService) scope.get(g0.a(RemoteConfigService.class), null, null), (IAPViewModel) scope.get(g0.a(IAPViewModel.class), null, null));
        }
    }

    /* renamed from: com.cooldev.gba.emulator.gameboy.di.KoinModuleKt$appModule$1$12, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass12 extends r implements p {
        public static final AnonymousClass12 INSTANCE = new AnonymousClass12();

        public AnonymousClass12() {
            super(2);
        }

        @Override // q0.p
        @NotNull
        public final LoadingDialogViewModel invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
            a.s(scope, "$this$single");
            a.s(parametersHolder, "it");
            return new LoadingDialogViewModel();
        }
    }

    /* renamed from: com.cooldev.gba.emulator.gameboy.di.KoinModuleKt$appModule$1$13, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass13 extends r implements p {
        public static final AnonymousClass13 INSTANCE = new AnonymousClass13();

        public AnonymousClass13() {
            super(2);
        }

        @Override // q0.p
        @NotNull
        public final PurchasePageViewModel invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
            a.s(scope, "$this$single");
            a.s(parametersHolder, "it");
            return new PurchasePageViewModel((Application) scope.get(g0.a(Application.class), null, null), (RemoteConfigService) scope.get(g0.a(RemoteConfigService.class), null, null));
        }
    }

    /* renamed from: com.cooldev.gba.emulator.gameboy.di.KoinModuleKt$appModule$1$14, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass14 extends r implements p {
        public static final AnonymousClass14 INSTANCE = new AnonymousClass14();

        public AnonymousClass14() {
            super(2);
        }

        @Override // q0.p
        @NotNull
        public final OnboardingViewModel invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
            a.s(scope, "$this$single");
            a.s(parametersHolder, "it");
            return new OnboardingViewModel((Application) scope.get(g0.a(Application.class), null, null), (RemoteConfigService) scope.get(g0.a(RemoteConfigService.class), null, null), (PaywallNavigationViewModel) scope.get(g0.a(PaywallNavigationViewModel.class), null, null));
        }
    }

    /* renamed from: com.cooldev.gba.emulator.gameboy.di.KoinModuleKt$appModule$1$15, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass15 extends r implements p {
        public static final AnonymousClass15 INSTANCE = new AnonymousClass15();

        public AnonymousClass15() {
            super(2);
        }

        @Override // q0.p
        @NotNull
        public final AddGameViewModel invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
            a.s(scope, "$this$single");
            a.s(parametersHolder, "it");
            return new AddGameViewModel((Application) scope.get(g0.a(Application.class), null, null));
        }
    }

    /* renamed from: com.cooldev.gba.emulator.gameboy.di.KoinModuleKt$appModule$1$16, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass16 extends r implements p {
        public static final AnonymousClass16 INSTANCE = new AnonymousClass16();

        public AnonymousClass16() {
            super(2);
        }

        @Override // q0.p
        @NotNull
        public final HomeViewModel invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
            a.s(scope, "$this$single");
            a.s(parametersHolder, "it");
            return new HomeViewModel((Application) scope.get(g0.a(Application.class), null, null), (LoadingDialogViewModel) scope.get(g0.a(LoadingDialogViewModel.class), null, null), (RemoteConfigService) scope.get(g0.a(RemoteConfigService.class), null, null), (PaywallNavigationViewModel) scope.get(g0.a(PaywallNavigationViewModel.class), null, null), (IAPViewModel) scope.get(g0.a(IAPViewModel.class), null, null));
        }
    }

    /* renamed from: com.cooldev.gba.emulator.gameboy.di.KoinModuleKt$appModule$1$17, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass17 extends r implements p {
        public static final AnonymousClass17 INSTANCE = new AnonymousClass17();

        public AnonymousClass17() {
            super(2);
        }

        @Override // q0.p
        @NotNull
        public final MenuGameViewModel invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
            a.s(scope, "$this$single");
            a.s(parametersHolder, "it");
            return new MenuGameViewModel();
        }
    }

    /* renamed from: com.cooldev.gba.emulator.gameboy.di.KoinModuleKt$appModule$1$18, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass18 extends r implements p {
        public static final AnonymousClass18 INSTANCE = new AnonymousClass18();

        public AnonymousClass18() {
            super(2);
        }

        @Override // q0.p
        @NotNull
        public final SaveGameViewModel invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
            a.s(scope, "$this$single");
            a.s(parametersHolder, "it");
            return new SaveGameViewModel();
        }
    }

    /* renamed from: com.cooldev.gba.emulator.gameboy.di.KoinModuleKt$appModule$1$19, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass19 extends r implements p {
        public static final AnonymousClass19 INSTANCE = new AnonymousClass19();

        public AnonymousClass19() {
            super(2);
        }

        @Override // q0.p
        @NotNull
        public final LoadGameViewModel invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
            a.s(scope, "$this$single");
            a.s(parametersHolder, "it");
            return new LoadGameViewModel();
        }
    }

    /* renamed from: com.cooldev.gba.emulator.gameboy.di.KoinModuleKt$appModule$1$2, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass2 extends r implements p {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(2);
        }

        @Override // q0.p
        @NotNull
        public final RemoteConfigService invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
            a.s(scope, "$this$single");
            a.s(parametersHolder, "it");
            return new RemoteConfigService();
        }
    }

    /* renamed from: com.cooldev.gba.emulator.gameboy.di.KoinModuleKt$appModule$1$20, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass20 extends r implements p {
        public static final AnonymousClass20 INSTANCE = new AnonymousClass20();

        public AnonymousClass20() {
            super(2);
        }

        @Override // q0.p
        @NotNull
        public final AutoSaveDialogViewModel invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
            a.s(scope, "$this$single");
            a.s(parametersHolder, "it");
            return new AutoSaveDialogViewModel();
        }
    }

    /* renamed from: com.cooldev.gba.emulator.gameboy.di.KoinModuleKt$appModule$1$21, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass21 extends r implements p {
        public static final AnonymousClass21 INSTANCE = new AnonymousClass21();

        public AnonymousClass21() {
            super(2);
        }

        @Override // q0.p
        @NotNull
        public final CancelSubDialogViewModel invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
            a.s(scope, "$this$single");
            a.s(parametersHolder, "it");
            return new CancelSubDialogViewModel();
        }
    }

    /* renamed from: com.cooldev.gba.emulator.gameboy.di.KoinModuleKt$appModule$1$22, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass22 extends r implements p {
        public static final AnonymousClass22 INSTANCE = new AnonymousClass22();

        public AnonymousClass22() {
            super(2);
        }

        @Override // q0.p
        @NotNull
        public final PurchaseOverlayViewModel invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
            a.s(scope, "$this$single");
            a.s(parametersHolder, "it");
            return new PurchaseOverlayViewModel((Application) scope.get(g0.a(Application.class), null, null), (AppViewModel) scope.get(g0.a(AppViewModel.class), null, null));
        }
    }

    /* renamed from: com.cooldev.gba.emulator.gameboy.di.KoinModuleKt$appModule$1$23, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass23 extends r implements p {
        public static final AnonymousClass23 INSTANCE = new AnonymousClass23();

        public AnonymousClass23() {
            super(2);
        }

        @Override // q0.p
        @NotNull
        public final ThemeViewModel invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
            a.s(scope, "$this$single");
            a.s(parametersHolder, "it");
            return new ThemeViewModel((Application) scope.get(g0.a(Application.class), null, null), (IAPViewModel) scope.get(g0.a(IAPViewModel.class), null, null));
        }
    }

    /* renamed from: com.cooldev.gba.emulator.gameboy.di.KoinModuleKt$appModule$1$24, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass24 extends r implements p {
        public static final AnonymousClass24 INSTANCE = new AnonymousClass24();

        public AnonymousClass24() {
            super(2);
        }

        @Override // q0.p
        @NotNull
        public final UserGuideViewModel invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
            a.s(scope, "$this$single");
            a.s(parametersHolder, "it");
            return new UserGuideViewModel((Application) scope.get(g0.a(Application.class), null, null), (RemoteConfigService) scope.get(g0.a(RemoteConfigService.class), null, null));
        }
    }

    /* renamed from: com.cooldev.gba.emulator.gameboy.di.KoinModuleKt$appModule$1$25, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass25 extends r implements p {
        public static final AnonymousClass25 INSTANCE = new AnonymousClass25();

        public AnonymousClass25() {
            super(2);
        }

        @Override // q0.p
        @NotNull
        public final GameViewModel invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
            a.s(scope, "$this$viewModel");
            a.s(parametersHolder, "<name for destructuring parameter 0>");
            return new GameViewModel((Application) scope.get(g0.a(Application.class), null, null), (LoadingDialogViewModel) scope.get(g0.a(LoadingDialogViewModel.class), null, null), (Game) parametersHolder.elementAt(0, g0.a(Game.class)), ((Boolean) parametersHolder.elementAt(1, g0.a(Boolean.class))).booleanValue());
        }
    }

    /* renamed from: com.cooldev.gba.emulator.gameboy.di.KoinModuleKt$appModule$1$26, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass26 extends r implements p {
        public static final AnonymousClass26 INSTANCE = new AnonymousClass26();

        public AnonymousClass26() {
            super(2);
        }

        @Override // q0.p
        @NotNull
        public final ViewAllViewModel invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
            a.s(scope, "$this$viewModel");
            a.s(parametersHolder, "<name for destructuring parameter 0>");
            return new ViewAllViewModel((Application) scope.get(g0.a(Application.class), null, null), (LoadingDialogViewModel) scope.get(g0.a(LoadingDialogViewModel.class), null, null), (String) parametersHolder.elementAt(0, g0.a(String.class)), (RemoteConfigService) scope.get(g0.a(RemoteConfigService.class), null, null), (PaywallNavigationViewModel) scope.get(g0.a(PaywallNavigationViewModel.class), null, null), (IAPViewModel) scope.get(g0.a(IAPViewModel.class), null, null));
        }
    }

    /* renamed from: com.cooldev.gba.emulator.gameboy.di.KoinModuleKt$appModule$1$27, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass27 extends r implements p {
        public static final AnonymousClass27 INSTANCE = new AnonymousClass27();

        public AnonymousClass27() {
            super(2);
        }

        @Override // q0.p
        @NotNull
        public final RatingDialogViewModel invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
            a.s(scope, "$this$viewModel");
            a.s(parametersHolder, "it");
            return new RatingDialogViewModel((Application) scope.get(g0.a(Application.class), null, null));
        }
    }

    /* renamed from: com.cooldev.gba.emulator.gameboy.di.KoinModuleKt$appModule$1$28, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass28 extends r implements p {
        public static final AnonymousClass28 INSTANCE = new AnonymousClass28();

        public AnonymousClass28() {
            super(2);
        }

        @Override // q0.p
        @NotNull
        public final SettingViewModel invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
            a.s(scope, "$this$viewModel");
            a.s(parametersHolder, "it");
            return new SettingViewModel();
        }
    }

    /* renamed from: com.cooldev.gba.emulator.gameboy.di.KoinModuleKt$appModule$1$29, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass29 extends r implements p {
        public static final AnonymousClass29 INSTANCE = new AnonymousClass29();

        public AnonymousClass29() {
            super(2);
        }

        @Override // q0.p
        @NotNull
        public final GuideViewModel invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
            a.s(scope, "$this$viewModel");
            a.s(parametersHolder, "it");
            return new GuideViewModel();
        }
    }

    /* renamed from: com.cooldev.gba.emulator.gameboy.di.KoinModuleKt$appModule$1$3, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass3 extends r implements p {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        public AnonymousClass3() {
            super(2);
        }

        @Override // q0.p
        @NotNull
        public final AppViewModel invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
            a.s(scope, "$this$single");
            a.s(parametersHolder, "it");
            return new AppViewModel((Application) scope.get(g0.a(Application.class), null, null), (RemoteConfigService) scope.get(g0.a(RemoteConfigService.class), null, null));
        }
    }

    /* renamed from: com.cooldev.gba.emulator.gameboy.di.KoinModuleKt$appModule$1$4, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass4 extends r implements p {
        public static final AnonymousClass4 INSTANCE = new AnonymousClass4();

        public AnonymousClass4() {
            super(2);
        }

        @Override // q0.p
        @NotNull
        public final IAPViewModel invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
            a.s(scope, "$this$single");
            a.s(parametersHolder, "it");
            return new IAPViewModel((Application) scope.get(g0.a(Application.class), null, null), (RemoteConfigService) scope.get(g0.a(RemoteConfigService.class), null, null));
        }
    }

    /* renamed from: com.cooldev.gba.emulator.gameboy.di.KoinModuleKt$appModule$1$5, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass5 extends r implements p {
        public static final AnonymousClass5 INSTANCE = new AnonymousClass5();

        public AnonymousClass5() {
            super(2);
        }

        @Override // q0.p
        @NotNull
        public final PaywallNavigationViewModel invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
            a.s(scope, "$this$single");
            a.s(parametersHolder, "it");
            return new PaywallNavigationViewModel((Application) scope.get(g0.a(Application.class), null, null), (AppViewModel) scope.get(g0.a(AppViewModel.class), null, null));
        }
    }

    /* renamed from: com.cooldev.gba.emulator.gameboy.di.KoinModuleKt$appModule$1$6, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass6 extends r implements p {
        public static final AnonymousClass6 INSTANCE = new AnonymousClass6();

        public AnonymousClass6() {
            super(2);
        }

        @Override // q0.p
        @NotNull
        public final AppOpenAdViewModel invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
            a.s(scope, "$this$single");
            a.s(parametersHolder, "it");
            return new AppOpenAdViewModel((Application) scope.get(g0.a(Application.class), null, null), (RemoteConfigService) scope.get(g0.a(RemoteConfigService.class), null, null), (IAPViewModel) scope.get(g0.a(IAPViewModel.class), null, null));
        }
    }

    /* renamed from: com.cooldev.gba.emulator.gameboy.di.KoinModuleKt$appModule$1$7, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass7 extends r implements p {
        public static final AnonymousClass7 INSTANCE = new AnonymousClass7();

        public AnonymousClass7() {
            super(2);
        }

        @Override // q0.p
        @NotNull
        public final InterstitialAdViewModel invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
            a.s(scope, "$this$single");
            a.s(parametersHolder, "it");
            return new InterstitialAdViewModel((Application) scope.get(g0.a(Application.class), null, null), (RemoteConfigService) scope.get(g0.a(RemoteConfigService.class), null, null), (IAPViewModel) scope.get(g0.a(IAPViewModel.class), null, null));
        }
    }

    /* renamed from: com.cooldev.gba.emulator.gameboy.di.KoinModuleKt$appModule$1$8, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass8 extends r implements p {
        public static final AnonymousClass8 INSTANCE = new AnonymousClass8();

        public AnonymousClass8() {
            super(2);
        }

        @Override // q0.p
        @NotNull
        public final BannerAdViewModel invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
            a.s(scope, "$this$single");
            a.s(parametersHolder, "it");
            return new BannerAdViewModel((Application) scope.get(g0.a(Application.class), null, null), (RemoteConfigService) scope.get(g0.a(RemoteConfigService.class), null, null), (IAPViewModel) scope.get(g0.a(IAPViewModel.class), null, null));
        }
    }

    /* renamed from: com.cooldev.gba.emulator.gameboy.di.KoinModuleKt$appModule$1$9, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass9 extends r implements p {
        public static final AnonymousClass9 INSTANCE = new AnonymousClass9();

        public AnonymousClass9() {
            super(2);
        }

        @Override // q0.p
        @NotNull
        public final BannerAdOnboardingViewModel invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
            a.s(scope, "$this$single");
            a.s(parametersHolder, "it");
            return new BannerAdOnboardingViewModel((Application) scope.get(g0.a(Application.class), null, null), (RemoteConfigService) scope.get(g0.a(RemoteConfigService.class), null, null), (IAPViewModel) scope.get(g0.a(IAPViewModel.class), null, null));
        }
    }

    public KoinModuleKt$appModule$1() {
        super(1);
    }

    @Override // q0.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Module) obj);
        return b0.f30125a;
    }

    public final void invoke(@NotNull Module module) {
        a.s(module, "$this$module");
        AnonymousClass1 anonymousClass1 = AnonymousClass1.INSTANCE;
        ScopeRegistry.Companion companion = ScopeRegistry.Companion;
        StringQualifier rootScopeQualifier = companion.getRootScopeQualifier();
        Kind kind = Kind.Singleton;
        w wVar = w.f30218a;
        SingleInstanceFactory<?> p2 = t.p(new BeanDefinition(rootScopeQualifier, g0.a(SlackApiRepositoryImpl.class), null, anonymousClass1, kind, wVar), module);
        if (module.get_createdAtStart()) {
            module.prepareForCreationAtStart(p2);
        }
        new KoinDefinition(module, p2);
        SingleInstanceFactory<?> p3 = t.p(new BeanDefinition(companion.getRootScopeQualifier(), g0.a(RemoteConfigService.class), null, AnonymousClass2.INSTANCE, kind, wVar), module);
        if (module.get_createdAtStart()) {
            module.prepareForCreationAtStart(p3);
        }
        new KoinDefinition(module, p3);
        SingleInstanceFactory<?> p4 = t.p(new BeanDefinition(companion.getRootScopeQualifier(), g0.a(AppViewModel.class), null, AnonymousClass3.INSTANCE, kind, wVar), module);
        if (module.get_createdAtStart()) {
            module.prepareForCreationAtStart(p4);
        }
        new KoinDefinition(module, p4);
        SingleInstanceFactory<?> singleInstanceFactory = new SingleInstanceFactory<>(new BeanDefinition(companion.getRootScopeQualifier(), g0.a(IAPViewModel.class), null, AnonymousClass4.INSTANCE, kind, wVar));
        module.indexPrimaryType(singleInstanceFactory);
        module.prepareForCreationAtStart(singleInstanceFactory);
        new KoinDefinition(module, singleInstanceFactory);
        SingleInstanceFactory<?> singleInstanceFactory2 = new SingleInstanceFactory<>(new BeanDefinition(companion.getRootScopeQualifier(), g0.a(PaywallNavigationViewModel.class), null, AnonymousClass5.INSTANCE, kind, wVar));
        module.indexPrimaryType(singleInstanceFactory2);
        module.prepareForCreationAtStart(singleInstanceFactory2);
        new KoinDefinition(module, singleInstanceFactory2);
        SingleInstanceFactory<?> p5 = t.p(new BeanDefinition(companion.getRootScopeQualifier(), g0.a(AppOpenAdViewModel.class), null, AnonymousClass6.INSTANCE, kind, wVar), module);
        if (module.get_createdAtStart()) {
            module.prepareForCreationAtStart(p5);
        }
        new KoinDefinition(module, p5);
        SingleInstanceFactory<?> p6 = t.p(new BeanDefinition(companion.getRootScopeQualifier(), g0.a(InterstitialAdViewModel.class), null, AnonymousClass7.INSTANCE, kind, wVar), module);
        if (module.get_createdAtStart()) {
            module.prepareForCreationAtStart(p6);
        }
        new KoinDefinition(module, p6);
        SingleInstanceFactory<?> p7 = t.p(new BeanDefinition(companion.getRootScopeQualifier(), g0.a(BannerAdViewModel.class), null, AnonymousClass8.INSTANCE, kind, wVar), module);
        if (module.get_createdAtStart()) {
            module.prepareForCreationAtStart(p7);
        }
        new KoinDefinition(module, p7);
        SingleInstanceFactory<?> p8 = t.p(new BeanDefinition(companion.getRootScopeQualifier(), g0.a(BannerAdOnboardingViewModel.class), null, AnonymousClass9.INSTANCE, kind, wVar), module);
        if (module.get_createdAtStart()) {
            module.prepareForCreationAtStart(p8);
        }
        new KoinDefinition(module, p8);
        SingleInstanceFactory<?> p9 = t.p(new BeanDefinition(companion.getRootScopeQualifier(), g0.a(BannerAdGameViewModel.class), null, AnonymousClass10.INSTANCE, kind, wVar), module);
        if (module.get_createdAtStart()) {
            module.prepareForCreationAtStart(p9);
        }
        new KoinDefinition(module, p9);
        SingleInstanceFactory<?> p10 = t.p(new BeanDefinition(companion.getRootScopeQualifier(), g0.a(RewardedAdViewModel.class), null, AnonymousClass11.INSTANCE, kind, wVar), module);
        if (module.get_createdAtStart()) {
            module.prepareForCreationAtStart(p10);
        }
        new KoinDefinition(module, p10);
        SingleInstanceFactory<?> p11 = t.p(new BeanDefinition(companion.getRootScopeQualifier(), g0.a(LoadingDialogViewModel.class), null, AnonymousClass12.INSTANCE, kind, wVar), module);
        if (module.get_createdAtStart()) {
            module.prepareForCreationAtStart(p11);
        }
        new KoinDefinition(module, p11);
        SingleInstanceFactory<?> p12 = t.p(new BeanDefinition(companion.getRootScopeQualifier(), g0.a(PurchasePageViewModel.class), null, AnonymousClass13.INSTANCE, kind, wVar), module);
        if (module.get_createdAtStart()) {
            module.prepareForCreationAtStart(p12);
        }
        new KoinDefinition(module, p12);
        SingleInstanceFactory<?> p13 = t.p(new BeanDefinition(companion.getRootScopeQualifier(), g0.a(OnboardingViewModel.class), null, AnonymousClass14.INSTANCE, kind, wVar), module);
        if (module.get_createdAtStart()) {
            module.prepareForCreationAtStart(p13);
        }
        new KoinDefinition(module, p13);
        SingleInstanceFactory<?> p14 = t.p(new BeanDefinition(companion.getRootScopeQualifier(), g0.a(AddGameViewModel.class), null, AnonymousClass15.INSTANCE, kind, wVar), module);
        if (module.get_createdAtStart()) {
            module.prepareForCreationAtStart(p14);
        }
        new KoinDefinition(module, p14);
        SingleInstanceFactory<?> p15 = t.p(new BeanDefinition(companion.getRootScopeQualifier(), g0.a(HomeViewModel.class), null, AnonymousClass16.INSTANCE, kind, wVar), module);
        if (module.get_createdAtStart()) {
            module.prepareForCreationAtStart(p15);
        }
        new KoinDefinition(module, p15);
        SingleInstanceFactory<?> p16 = t.p(new BeanDefinition(companion.getRootScopeQualifier(), g0.a(MenuGameViewModel.class), null, AnonymousClass17.INSTANCE, kind, wVar), module);
        if (module.get_createdAtStart()) {
            module.prepareForCreationAtStart(p16);
        }
        new KoinDefinition(module, p16);
        SingleInstanceFactory<?> p17 = t.p(new BeanDefinition(companion.getRootScopeQualifier(), g0.a(SaveGameViewModel.class), null, AnonymousClass18.INSTANCE, kind, wVar), module);
        if (module.get_createdAtStart()) {
            module.prepareForCreationAtStart(p17);
        }
        new KoinDefinition(module, p17);
        SingleInstanceFactory<?> p18 = t.p(new BeanDefinition(companion.getRootScopeQualifier(), g0.a(LoadGameViewModel.class), null, AnonymousClass19.INSTANCE, kind, wVar), module);
        if (module.get_createdAtStart()) {
            module.prepareForCreationAtStart(p18);
        }
        new KoinDefinition(module, p18);
        SingleInstanceFactory<?> p19 = t.p(new BeanDefinition(companion.getRootScopeQualifier(), g0.a(AutoSaveDialogViewModel.class), null, AnonymousClass20.INSTANCE, kind, wVar), module);
        if (module.get_createdAtStart()) {
            module.prepareForCreationAtStart(p19);
        }
        new KoinDefinition(module, p19);
        SingleInstanceFactory<?> p20 = t.p(new BeanDefinition(companion.getRootScopeQualifier(), g0.a(CancelSubDialogViewModel.class), null, AnonymousClass21.INSTANCE, kind, wVar), module);
        if (module.get_createdAtStart()) {
            module.prepareForCreationAtStart(p20);
        }
        new KoinDefinition(module, p20);
        SingleInstanceFactory<?> p21 = t.p(new BeanDefinition(companion.getRootScopeQualifier(), g0.a(PurchaseOverlayViewModel.class), null, AnonymousClass22.INSTANCE, kind, wVar), module);
        if (module.get_createdAtStart()) {
            module.prepareForCreationAtStart(p21);
        }
        new KoinDefinition(module, p21);
        SingleInstanceFactory<?> p22 = t.p(new BeanDefinition(companion.getRootScopeQualifier(), g0.a(ThemeViewModel.class), null, AnonymousClass23.INSTANCE, kind, wVar), module);
        if (module.get_createdAtStart()) {
            module.prepareForCreationAtStart(p22);
        }
        new KoinDefinition(module, p22);
        SingleInstanceFactory<?> p23 = t.p(new BeanDefinition(companion.getRootScopeQualifier(), g0.a(UserGuideViewModel.class), null, AnonymousClass24.INSTANCE, kind, wVar), module);
        if (module.get_createdAtStart()) {
            module.prepareForCreationAtStart(p23);
        }
        new KoinDefinition(module, p23);
        AnonymousClass25 anonymousClass25 = AnonymousClass25.INSTANCE;
        StringQualifier rootScopeQualifier2 = companion.getRootScopeQualifier();
        Kind kind2 = Kind.Factory;
        InstanceFactory<?> factoryInstanceFactory = new FactoryInstanceFactory<>(new BeanDefinition(rootScopeQualifier2, g0.a(GameViewModel.class), null, anonymousClass25, kind2, wVar));
        module.indexPrimaryType(factoryInstanceFactory);
        new KoinDefinition(module, factoryInstanceFactory);
        InstanceFactory<?> factoryInstanceFactory2 = new FactoryInstanceFactory<>(new BeanDefinition(companion.getRootScopeQualifier(), g0.a(ViewAllViewModel.class), null, AnonymousClass26.INSTANCE, kind2, wVar));
        module.indexPrimaryType(factoryInstanceFactory2);
        new KoinDefinition(module, factoryInstanceFactory2);
        InstanceFactory<?> factoryInstanceFactory3 = new FactoryInstanceFactory<>(new BeanDefinition(companion.getRootScopeQualifier(), g0.a(RatingDialogViewModel.class), null, AnonymousClass27.INSTANCE, kind2, wVar));
        module.indexPrimaryType(factoryInstanceFactory3);
        new KoinDefinition(module, factoryInstanceFactory3);
        InstanceFactory<?> factoryInstanceFactory4 = new FactoryInstanceFactory<>(new BeanDefinition(companion.getRootScopeQualifier(), g0.a(SettingViewModel.class), null, AnonymousClass28.INSTANCE, kind2, wVar));
        module.indexPrimaryType(factoryInstanceFactory4);
        new KoinDefinition(module, factoryInstanceFactory4);
        InstanceFactory<?> factoryInstanceFactory5 = new FactoryInstanceFactory<>(new BeanDefinition(companion.getRootScopeQualifier(), g0.a(GuideViewModel.class), null, AnonymousClass29.INSTANCE, kind2, wVar));
        module.indexPrimaryType(factoryInstanceFactory5);
        new KoinDefinition(module, factoryInstanceFactory5);
    }
}
