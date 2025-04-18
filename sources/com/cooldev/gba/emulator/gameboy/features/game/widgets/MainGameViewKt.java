package com.cooldev.gba.emulator.gameboy.features.game.widgets;

import android.content.res.Configuration;
import android.support.v4.media.d;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.DividerKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import com.applovin.impl.adview.t;
import com.cooldev.gba.emulator.gameboy.constants.MyColors;
import com.cooldev.gba.emulator.gameboy.features.admob.banner_ads.logic.BannerAdGameViewModel;
import com.cooldev.gba.emulator.gameboy.features.admob.banner_ads.logic.BannerAdState;
import com.cooldev.gba.emulator.gameboy.features.dialogs.auto_save_dialog.logic.AutoSaveDialogState;
import com.cooldev.gba.emulator.gameboy.features.dialogs.auto_save_dialog.logic.AutoSaveDialogViewModel;
import com.cooldev.gba.emulator.gameboy.features.game.logic.GameState;
import com.cooldev.gba.emulator.gameboy.features.game.logic.GameViewModel;
import com.cooldev.gba.emulator.gameboy.features.overlays.load_game.logic.LoadGameState;
import com.cooldev.gba.emulator.gameboy.features.overlays.load_game.logic.LoadGameViewModel;
import com.cooldev.gba.emulator.gameboy.features.overlays.menu_game.logic.MenuGameState;
import com.cooldev.gba.emulator.gameboy.features.overlays.menu_game.logic.MenuGameViewModel;
import com.cooldev.gba.emulator.gameboy.features.overlays.paywalls.logic.PurchaseOverlayState;
import com.cooldev.gba.emulator.gameboy.features.overlays.paywalls.logic.PurchaseOverlayViewModel;
import com.cooldev.gba.emulator.gameboy.features.overlays.save_game.logic.SaveGameState;
import com.cooldev.gba.emulator.gameboy.features.overlays.save_game.logic.SaveGameViewModel;
import com.cooldev.gba.emulator.gameboy.features.paywalls.logic.IAPState;
import com.cooldev.gba.emulator.gameboy.features.paywalls.logic.IAPViewModel;
import com.cooldev.gba.emulator.gameboy.features.themenew.logic.ThemeViewModel;
import com.swordfish.libretrodroid.GLRetroView;
import d0.b0;
import kotlin.jvm.internal.g0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.androidx.compose.ViewModelInternalsKt;
import org.koin.androidx.viewmodel.GetViewModelKt;
import org.koin.compose.KoinApplicationKt;
import org.koin.core.scope.Scope;
import p0.a;
import q0.p;

/* loaded from: classes2.dex */
public final class MainGameViewKt {
    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget
    @Composable
    public static final void BannerAd(Composer composer, int i2) {
        ComposerImpl g2 = composer.g(-431993463);
        if (i2 == 0 && g2.i()) {
            g2.A();
        } else {
            Scope q2 = t.q(g2, 414512006, g2, 0, 1274527078);
            boolean y2 = t.y(g2, false, 511388516, null) | g2.I(q2);
            Object u2 = g2.u();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f13690a;
            if (y2 || u2 == composer$Companion$Empty$1) {
                u2 = t.g(BannerAdGameViewModel.class, q2, null, null, g2);
            }
            g2.V(false);
            g2.V(false);
            BannerAdGameViewModel bannerAdGameViewModel = (BannerAdGameViewModel) u2;
            BannerAdState bannerAdState = (BannerAdState) SnapshotStateKt.b(bannerAdGameViewModel.getState(), g2, 8).getValue();
            Scope q3 = t.q(g2, 414512006, g2, 0, 1274527078);
            boolean y3 = t.y(g2, false, 511388516, null) | g2.I(q3);
            Object u3 = g2.u();
            if (y3 || u3 == composer$Companion$Empty$1) {
                u3 = t.g(IAPViewModel.class, q3, null, null, g2);
            }
            g2.V(false);
            g2.V(false);
            IAPState iAPState = (IAPState) t.f((IAPViewModel) u3, g2, 8);
            EffectsKt.c(b0.f30125a, new MainGameViewKt$BannerAd$1(bannerAdGameViewModel), g2);
            AnimatedVisibilityKt.d(bannerAdState.getShouldShowBannerAd(), null, EnterExitTransitionKt.n(MainGameViewKt$BannerAd$2.INSTANCE), EnterExitTransitionKt.o(MainGameViewKt$BannerAd$3.INSTANCE), null, ComposableLambdaKt.c(495608753, new MainGameViewKt$BannerAd$4(bannerAdState, iAPState), g2), g2, 200064, 18);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new MainGameViewKt$BannerAd$5(i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget
    @Composable
    public static final void LineHorizontal(Composer composer, int i2) {
        ComposerImpl g2 = composer.g(172345618);
        if (i2 == 0 && g2.i()) {
            g2.A();
        } else {
            DividerKt.a(0.0f, 390, 2, MyColors.INSTANCE.m17getText130d7_KjU(), g2, SizeKt.e(SizeKt.d(Modifier.Companion.f14687a, 1.0f), (float) 0.5d));
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new MainGameViewKt$LineHorizontal$1(i2);
        }
    }

    @ComposableTarget
    @Composable
    public static final void MainGameView(@NotNull GameViewModel gameViewModel, @Nullable Composer composer, int i2) {
        a.s(gameViewModel, "gameViewModel");
        ComposerImpl g2 = composer.g(1666084908);
        GameState gameState = (GameState) SnapshotStateKt.b(gameViewModel.getState(), g2, 8).getValue();
        LifecycleOwner lifecycleOwner = (LifecycleOwner) g2.K(LocalLifecycleOwnerKt.f20226a);
        g2.t(-1614864554);
        ViewModelStoreOwner a2 = LocalViewModelStoreOwner.a(g2);
        if (a2 == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        ViewModel resolveViewModel = GetViewModelKt.resolveViewModel(g0.a(MenuGameViewModel.class), a2.getViewModelStore(), null, ViewModelInternalsKt.defaultExtras(a2, g2, 8), null, KoinApplicationKt.currentKoinScope(g2, 0), null);
        g2.V(false);
        MenuGameViewModel menuGameViewModel = (MenuGameViewModel) resolveViewModel;
        MenuGameState menuGameState = (MenuGameState) SnapshotStateKt.b(menuGameViewModel.getState(), g2, 8).getValue();
        g2.t(-1614864554);
        ViewModelStoreOwner a3 = LocalViewModelStoreOwner.a(g2);
        if (a3 == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        ViewModel resolveViewModel2 = GetViewModelKt.resolveViewModel(g0.a(SaveGameViewModel.class), a3.getViewModelStore(), null, ViewModelInternalsKt.defaultExtras(a3, g2, 8), null, KoinApplicationKt.currentKoinScope(g2, 0), null);
        g2.V(false);
        SaveGameState saveGameState = (SaveGameState) SnapshotStateKt.b(((SaveGameViewModel) resolveViewModel2).getState(), g2, 8).getValue();
        g2.t(-1614864554);
        ViewModelStoreOwner a4 = LocalViewModelStoreOwner.a(g2);
        if (a4 == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        ViewModel resolveViewModel3 = GetViewModelKt.resolveViewModel(g0.a(LoadGameViewModel.class), a4.getViewModelStore(), null, ViewModelInternalsKt.defaultExtras(a4, g2, 8), null, KoinApplicationKt.currentKoinScope(g2, 0), null);
        g2.V(false);
        LoadGameState loadGameState = (LoadGameState) SnapshotStateKt.b(((LoadGameViewModel) resolveViewModel3).getState(), g2, 8).getValue();
        g2.t(-1614864554);
        ViewModelStoreOwner a5 = LocalViewModelStoreOwner.a(g2);
        if (a5 == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        ViewModel resolveViewModel4 = GetViewModelKt.resolveViewModel(g0.a(AutoSaveDialogViewModel.class), a5.getViewModelStore(), null, ViewModelInternalsKt.defaultExtras(a5, g2, 8), null, KoinApplicationKt.currentKoinScope(g2, 0), null);
        g2.V(false);
        AutoSaveDialogState autoSaveDialogState = (AutoSaveDialogState) SnapshotStateKt.b(((AutoSaveDialogViewModel) resolveViewModel4).getState(), g2, 8).getValue();
        Scope q2 = t.q(g2, 414512006, g2, 0, 1274527078);
        boolean y2 = t.y(g2, false, 511388516, null) | g2.I(q2);
        Object u2 = g2.u();
        Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f13690a;
        if (y2 || u2 == composer$Companion$Empty$1) {
            u2 = t.g(PurchaseOverlayViewModel.class, q2, null, null, g2);
        }
        g2.V(false);
        g2.V(false);
        PurchaseOverlayState purchaseOverlayState = (PurchaseOverlayState) SnapshotStateKt.b(((PurchaseOverlayViewModel) u2).getState(), g2, 8).getValue();
        Scope q3 = t.q(g2, 414512006, g2, 0, 1274527078);
        boolean y3 = t.y(g2, false, 511388516, null) | g2.I(q3);
        Object u3 = g2.u();
        if (y3 || u3 == composer$Companion$Empty$1) {
            u3 = t.g(ThemeViewModel.class, q3, null, null, g2);
        }
        g2.V(false);
        g2.V(false);
        ThemeViewModel themeViewModel = (ThemeViewModel) u3;
        Configuration configuration = (Configuration) g2.K(AndroidCompositionLocals_androidKt.f16324a);
        g2.J(1828522386);
        Object u4 = g2.u();
        if (u4 == composer$Companion$Empty$1) {
            u4 = gameState.getRetroView();
            a.p(u4);
            g2.o(u4);
        }
        GLRetroView gLRetroView = (GLRetroView) u4;
        g2.V(false);
        EffectsKt.c(lifecycleOwner, new MainGameViewKt$MainGameView$1(lifecycleOwner, gLRetroView), g2);
        g2.J(1828531723);
        Object u5 = g2.u();
        if (u5 == composer$Companion$Empty$1) {
            u5 = PrimitiveSnapshotStateKt.a(configuration.orientation == 1 ? 0.65f : 1.0f);
            g2.o(u5);
        }
        MutableFloatState mutableFloatState = (MutableFloatState) u5;
        g2.V(false);
        g2.J(1828539668);
        Object u6 = g2.u();
        if (u6 == composer$Companion$Empty$1) {
            u6 = SnapshotStateKt.e(new MainGameViewKt$MainGameView$gamePadWeight$1$1(mutableFloatState));
            g2.o(u6);
        }
        State state = (State) u6;
        g2.V(false);
        g2.J(1828543563);
        Object u7 = g2.u();
        if (u7 == composer$Companion$Empty$1) {
            u7 = SnapshotStateKt.e(new MainGameViewKt$MainGameView$isLandscape$1$1(mutableFloatState));
            g2.o(u7);
        }
        State state2 = (State) u7;
        g2.V(false);
        EffectsKt.f(Integer.valueOf(configuration.orientation), new MainGameViewKt$MainGameView$2(gameViewModel, configuration, mutableFloatState, null), g2);
        EffectsKt.f(Boolean.valueOf(menuGameState.getShowingMenu() || saveGameState.getShowingSaveGameView() || loadGameState.getShowingLoadGameView() || autoSaveDialogState.getShowingDialog() || purchaseOverlayState.getOverlayVisible()), new MainGameViewKt$MainGameView$3(menuGameState, saveGameState, loadGameState, autoSaveDialogState, purchaseOverlayState, gameViewModel, gLRetroView, null), g2);
        Modifier.Companion companion = Modifier.Companion.f14687a;
        Modifier c2 = SizeKt.c(companion, 1.0f);
        BiasAlignment biasAlignment = Alignment.Companion.f14659a;
        MeasurePolicy e = BoxKt.e(biasAlignment, false);
        int i3 = g2.P;
        PersistentCompositionLocalMap Q = g2.Q();
        Modifier c3 = ComposedModifierKt.c(g2, c2);
        ComposeUiNode.h8.getClass();
        q0.a aVar = ComposeUiNode.Companion.f15895b;
        Applier applier = g2.f13691a;
        if (!(applier instanceof Applier)) {
            ComposablesKt.a();
            throw null;
        }
        g2.z();
        if (g2.O) {
            g2.B(aVar);
        } else {
            g2.n();
        }
        p pVar = ComposeUiNode.Companion.f15898g;
        Updater.b(g2, e, pVar);
        p pVar2 = ComposeUiNode.Companion.f15897f;
        Updater.b(g2, Q, pVar2);
        p pVar3 = ComposeUiNode.Companion.f15900i;
        if (g2.O || !a.g(g2.u(), Integer.valueOf(i3))) {
            d.x(i3, g2, i3, pVar3);
        }
        p pVar4 = ComposeUiNode.Companion.d;
        Updater.b(g2, c3, pVar4);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.f3816a;
        AndroidView_androidKt.a(new MainGameViewKt$MainGameView$4$1(gLRetroView), boxScopeInstance.a(SizeKt.c(companion, mutableFloatState.c()), Alignment.Companion.f14660b), null, g2, 0, 4);
        LineHorizontal(g2, 0);
        Modifier a6 = boxScopeInstance.a(SizeKt.c(companion, ((Number) state.getValue()).floatValue()), Alignment.Companion.f14664h);
        MeasurePolicy e2 = BoxKt.e(biasAlignment, false);
        int i4 = g2.P;
        PersistentCompositionLocalMap Q2 = g2.Q();
        Modifier c4 = ComposedModifierKt.c(g2, a6);
        if (!(applier instanceof Applier)) {
            ComposablesKt.a();
            throw null;
        }
        g2.z();
        if (g2.O) {
            g2.B(aVar);
        } else {
            g2.n();
        }
        Updater.b(g2, e2, pVar);
        Updater.b(g2, Q2, pVar2);
        if (g2.O || !a.g(g2.u(), Integer.valueOf(i4))) {
            d.x(i4, g2, i4, pVar3);
        }
        Updater.b(g2, c4, pVar4);
        g2.y(-592473951, state2.getValue());
        AndroidView_androidKt.a(new MainGameViewKt$MainGameView$4$2$1(state2, gameViewModel, menuGameViewModel, themeViewModel), SizeKt.f4107c, null, g2, 48, 4);
        g2.V(false);
        g2.V(true);
        BannerAd(g2, 0);
        g2.V(true);
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new MainGameViewKt$MainGameView$5(gameViewModel, i2);
        }
    }
}
