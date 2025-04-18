package com.cooldev.gba.emulator.gameboy.features.game.page;

import android.annotation.SuppressLint;
import androidx.activity.compose.BackHandlerKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.graphics.Color;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import com.applovin.impl.adview.t;
import com.cooldev.gba.emulator.gameboy.effects.HideNavigationEffectKt;
import com.cooldev.gba.emulator.gameboy.effects.HideStatusBarKt;
import com.cooldev.gba.emulator.gameboy.effects.SetRequestedOrientationPortraitKt;
import com.cooldev.gba.emulator.gameboy.features.dialogs.auto_save_dialog.AutoSaveDialogKt;
import com.cooldev.gba.emulator.gameboy.features.dialogs.auto_save_dialog.logic.AutoSaveDialogState;
import com.cooldev.gba.emulator.gameboy.features.dialogs.auto_save_dialog.logic.AutoSaveDialogViewModel;
import com.cooldev.gba.emulator.gameboy.features.game.logic.GameState;
import com.cooldev.gba.emulator.gameboy.features.game.logic.GameViewModel;
import com.cooldev.gba.emulator.gameboy.features.home.models.Game;
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
import kotlin.jvm.internal.g0;
import org.jetbrains.annotations.Nullable;
import org.koin.androidx.compose.ViewModelInternalsKt;
import org.koin.androidx.viewmodel.GetViewModelKt;
import org.koin.compose.KoinApplicationKt;
import org.koin.core.scope.Scope;

/* loaded from: classes3.dex */
public final class GamePageKt {
    @ComposableTarget
    @Composable
    @SuppressLint({"UnusedMaterial3ScaffoldPaddingParameter"})
    public static final void GamePage(@Nullable Game game, @Nullable Boolean bool, @Nullable Composer composer, int i2) {
        ComposerImpl g2 = composer.g(1868291246);
        HideStatusBarKt.HideStatusBar(g2, 0);
        HideNavigationEffectKt.HideNavigationEffect(g2, 0);
        SetRequestedOrientationPortraitKt.SetRequestedOrientationPortrait(false, g2, 6, 0);
        GamePageKt$GamePage$gameViewModel$1 gamePageKt$GamePage$gameViewModel$1 = new GamePageKt$GamePage$gameViewModel$1(game, bool);
        g2.t(-1614864554);
        ViewModelStoreOwner a2 = LocalViewModelStoreOwner.a(g2);
        if (a2 == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        ViewModel resolveViewModel = GetViewModelKt.resolveViewModel(g0.a(GameViewModel.class), a2.getViewModelStore(), null, ViewModelInternalsKt.defaultExtras(a2, g2, 8), null, KoinApplicationKt.currentKoinScope(g2, 0), gamePageKt$GamePage$gameViewModel$1);
        g2.V(false);
        GameViewModel gameViewModel = (GameViewModel) resolveViewModel;
        GameState gameState = (GameState) SnapshotStateKt.b(gameViewModel.getState(), g2, 8).getValue();
        g2.J(-108602744);
        if (gameState.getRetroView() == null) {
            ScaffoldKt.a(null, null, null, null, null, 0, Color.f14957b, 0L, null, ComposableSingletons$GamePageKt.INSTANCE.m200getLambda1$gba_v1_0_35_54__09Apr2025_1046_release(), g2, 806879232, 447);
            g2.V(false);
            RecomposeScopeImpl Z = g2.Z();
            if (Z != null) {
                Z.d = new GamePageKt$GamePage$1(game, bool, i2);
                return;
            }
            return;
        }
        g2.V(false);
        g2.t(414512006);
        Scope currentKoinScope = KoinApplicationKt.currentKoinScope(g2, 0);
        g2.t(1274527078);
        g2.V(false);
        g2.t(511388516);
        boolean I = g2.I(null) | g2.I(currentKoinScope);
        Object u2 = g2.u();
        Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f13690a;
        if (I || u2 == composer$Companion$Empty$1) {
            u2 = t.g(IAPViewModel.class, currentKoinScope, null, null, g2);
        }
        g2.V(false);
        g2.V(false);
        IAPState iAPState = (IAPState) t.f((IAPViewModel) u2, g2, 8);
        g2.t(-1614864554);
        ViewModelStoreOwner a3 = LocalViewModelStoreOwner.a(g2);
        if (a3 == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        ViewModel resolveViewModel2 = GetViewModelKt.resolveViewModel(g0.a(AutoSaveDialogViewModel.class), a3.getViewModelStore(), null, ViewModelInternalsKt.defaultExtras(a3, g2, 8), null, KoinApplicationKt.currentKoinScope(g2, 0), null);
        g2.V(false);
        AutoSaveDialogViewModel autoSaveDialogViewModel = (AutoSaveDialogViewModel) resolveViewModel2;
        AutoSaveDialogState autoSaveDialogState = (AutoSaveDialogState) SnapshotStateKt.b(autoSaveDialogViewModel.getState(), g2, 8).getValue();
        g2.t(-1614864554);
        ViewModelStoreOwner a4 = LocalViewModelStoreOwner.a(g2);
        if (a4 == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        ViewModel resolveViewModel3 = GetViewModelKt.resolveViewModel(g0.a(MenuGameViewModel.class), a4.getViewModelStore(), null, ViewModelInternalsKt.defaultExtras(a4, g2, 8), null, KoinApplicationKt.currentKoinScope(g2, 0), null);
        g2.V(false);
        MenuGameViewModel menuGameViewModel = (MenuGameViewModel) resolveViewModel3;
        MenuGameState menuGameState = (MenuGameState) SnapshotStateKt.b(menuGameViewModel.getState(), g2, 8).getValue();
        g2.t(-1614864554);
        ViewModelStoreOwner a5 = LocalViewModelStoreOwner.a(g2);
        if (a5 == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        ViewModel resolveViewModel4 = GetViewModelKt.resolveViewModel(g0.a(SaveGameViewModel.class), a5.getViewModelStore(), null, ViewModelInternalsKt.defaultExtras(a5, g2, 8), null, KoinApplicationKt.currentKoinScope(g2, 0), null);
        g2.V(false);
        SaveGameViewModel saveGameViewModel = (SaveGameViewModel) resolveViewModel4;
        SaveGameState saveGameState = (SaveGameState) SnapshotStateKt.b(saveGameViewModel.getState(), g2, 8).getValue();
        g2.t(-1614864554);
        ViewModelStoreOwner a6 = LocalViewModelStoreOwner.a(g2);
        if (a6 == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        ViewModel resolveViewModel5 = GetViewModelKt.resolveViewModel(g0.a(LoadGameViewModel.class), a6.getViewModelStore(), null, ViewModelInternalsKt.defaultExtras(a6, g2, 8), null, KoinApplicationKt.currentKoinScope(g2, 0), null);
        g2.V(false);
        LoadGameViewModel loadGameViewModel = (LoadGameViewModel) resolveViewModel5;
        LoadGameState loadGameState = (LoadGameState) SnapshotStateKt.b(loadGameViewModel.getState(), g2, 8).getValue();
        Scope q2 = t.q(g2, 414512006, g2, 0, 1274527078);
        boolean y2 = t.y(g2, false, 511388516, null) | g2.I(q2);
        Object u3 = g2.u();
        if (y2 || u3 == composer$Companion$Empty$1) {
            u3 = t.g(PurchaseOverlayViewModel.class, q2, null, null, g2);
        }
        g2.V(false);
        g2.V(false);
        PurchaseOverlayViewModel purchaseOverlayViewModel = (PurchaseOverlayViewModel) u3;
        PurchaseOverlayState purchaseOverlayState = (PurchaseOverlayState) SnapshotStateKt.b(purchaseOverlayViewModel.getState(), g2, 8).getValue();
        BackHandlerKt.a(false, new GamePageKt$GamePage$2(purchaseOverlayState, purchaseOverlayViewModel, loadGameState, loadGameViewModel, menuGameViewModel, saveGameState, saveGameViewModel, menuGameState, iAPState, gameViewModel, gameState, autoSaveDialogViewModel), g2, 0, 1);
        AutoSaveDialogKt.AutoSaveDialog(autoSaveDialogState.getShowingDialog(), new GamePageKt$GamePage$3(gameViewModel, autoSaveDialogViewModel), new GamePageKt$GamePage$4(autoSaveDialogViewModel, iAPState, gameViewModel, purchaseOverlayViewModel), g2, 0);
        ScaffoldKt.a(null, null, null, null, null, 0, Color.f14957b, 0L, null, ComposableLambdaKt.c(1514595581, new GamePageKt$GamePage$5(gameViewModel, menuGameState, saveGameState, loadGameState, purchaseOverlayState), g2), g2, 806879232, 447);
        RecomposeScopeImpl Z2 = g2.Z();
        if (Z2 != null) {
            Z2.d = new GamePageKt$GamePage$6(game, bool, i2);
        }
    }
}
