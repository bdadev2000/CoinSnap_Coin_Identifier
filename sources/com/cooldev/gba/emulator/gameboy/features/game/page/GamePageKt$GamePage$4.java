package com.cooldev.gba.emulator.gameboy.features.game.page;

import com.cooldev.gba.emulator.gameboy.features.dialogs.auto_save_dialog.logic.AutoSaveDialogViewModel;
import com.cooldev.gba.emulator.gameboy.features.game.logic.GameViewModel;
import com.cooldev.gba.emulator.gameboy.features.overlays.paywalls.logic.PurchaseOverlayViewModel;
import com.cooldev.gba.emulator.gameboy.features.paywalls.logic.IAPState;
import com.cooldev.gba.emulator.gameboy.network.services.analytic.events.AutoSaveDialogEvents;
import com.cooldev.gba.emulator.gameboy.network.services.analytic.events.GameEvents;
import com.cooldev.gba.emulator.gameboy.router.MultiNavigationAppStateKt;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.a;

/* loaded from: classes3.dex */
public final class GamePageKt$GamePage$4 extends r implements a {
    final /* synthetic */ AutoSaveDialogViewModel $autoSaveDialogViewModel;
    final /* synthetic */ GameViewModel $gameViewModel;
    final /* synthetic */ IAPState $iapState;
    final /* synthetic */ PurchaseOverlayViewModel $purchaseOverlayViewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GamePageKt$GamePage$4(AutoSaveDialogViewModel autoSaveDialogViewModel, IAPState iAPState, GameViewModel gameViewModel, PurchaseOverlayViewModel purchaseOverlayViewModel) {
        super(0);
        this.$autoSaveDialogViewModel = autoSaveDialogViewModel;
        this.$iapState = iAPState;
        this.$gameViewModel = gameViewModel;
        this.$purchaseOverlayViewModel = purchaseOverlayViewModel;
    }

    @Override // q0.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m203invoke();
        return b0.f30125a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m203invoke() {
        GameEvents.INSTANCE.logTurnOnAlert();
        this.$autoSaveDialogViewModel.hideDialog();
        if (this.$iapState.isPremium()) {
            GameViewModel.onAutoSaveSwitchButton$default(this.$gameViewModel, false, 1, null);
            MultiNavigationAppStateKt.getLocalNavigationState().getRootNavigation().pop();
        } else {
            AutoSaveDialogEvents.INSTANCE.logClickTurnOnAutoSaveDialog();
            this.$purchaseOverlayViewModel.showOverlay();
        }
    }
}
