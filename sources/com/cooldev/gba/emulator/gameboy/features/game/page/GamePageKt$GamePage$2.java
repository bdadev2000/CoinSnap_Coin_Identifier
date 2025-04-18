package com.cooldev.gba.emulator.gameboy.features.game.page;

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
import d0.b0;
import kotlin.jvm.internal.r;
import q0.a;

/* loaded from: classes3.dex */
public final class GamePageKt$GamePage$2 extends r implements a {
    final /* synthetic */ AutoSaveDialogViewModel $autoSaveDialogViewModel;
    final /* synthetic */ GameState $gameState;
    final /* synthetic */ GameViewModel $gameViewModel;
    final /* synthetic */ IAPState $iapState;
    final /* synthetic */ LoadGameState $loadGameState;
    final /* synthetic */ LoadGameViewModel $loadGameViewModel;
    final /* synthetic */ MenuGameState $menuGameState;
    final /* synthetic */ MenuGameViewModel $menuGameViewModel;
    final /* synthetic */ PurchaseOverlayState $purchaseOverlayState;
    final /* synthetic */ PurchaseOverlayViewModel $purchaseOverlayViewModel;
    final /* synthetic */ SaveGameState $saveGameState;
    final /* synthetic */ SaveGameViewModel $saveGameViewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GamePageKt$GamePage$2(PurchaseOverlayState purchaseOverlayState, PurchaseOverlayViewModel purchaseOverlayViewModel, LoadGameState loadGameState, LoadGameViewModel loadGameViewModel, MenuGameViewModel menuGameViewModel, SaveGameState saveGameState, SaveGameViewModel saveGameViewModel, MenuGameState menuGameState, IAPState iAPState, GameViewModel gameViewModel, GameState gameState, AutoSaveDialogViewModel autoSaveDialogViewModel) {
        super(0);
        this.$purchaseOverlayState = purchaseOverlayState;
        this.$purchaseOverlayViewModel = purchaseOverlayViewModel;
        this.$loadGameState = loadGameState;
        this.$loadGameViewModel = loadGameViewModel;
        this.$menuGameViewModel = menuGameViewModel;
        this.$saveGameState = saveGameState;
        this.$saveGameViewModel = saveGameViewModel;
        this.$menuGameState = menuGameState;
        this.$iapState = iAPState;
        this.$gameViewModel = gameViewModel;
        this.$gameState = gameState;
        this.$autoSaveDialogViewModel = autoSaveDialogViewModel;
    }

    @Override // q0.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m201invoke();
        return b0.f30125a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m201invoke() {
        if (this.$purchaseOverlayState.getOverlayVisible()) {
            this.$purchaseOverlayViewModel.hideOverlay();
            return;
        }
        if (this.$loadGameState.getShowingLoadGameView()) {
            this.$loadGameViewModel.hideLoadGameView();
            this.$menuGameViewModel.showMenu();
            return;
        }
        if (this.$saveGameState.getShowingSaveGameView()) {
            this.$saveGameViewModel.hideSaveGameView();
            this.$menuGameViewModel.showMenu();
            return;
        }
        if (this.$menuGameState.getShowingMenu()) {
            this.$menuGameViewModel.hideMenu();
            return;
        }
        if (this.$iapState.isPremium()) {
            this.$gameViewModel.saveAutoSave();
            this.$gameViewModel.onQuit();
        } else if (this.$gameState.getAutoSaveEnable()) {
            this.$gameViewModel.saveAutoSave();
        } else {
            this.$autoSaveDialogViewModel.showDialog();
        }
    }
}
