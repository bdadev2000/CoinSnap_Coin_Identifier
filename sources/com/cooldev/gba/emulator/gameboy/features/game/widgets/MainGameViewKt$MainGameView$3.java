package com.cooldev.gba.emulator.gameboy.features.game.widgets;

import b1.d0;
import com.cooldev.gba.emulator.gameboy.features.dialogs.auto_save_dialog.logic.AutoSaveDialogState;
import com.cooldev.gba.emulator.gameboy.features.game.logic.GameViewModel;
import com.cooldev.gba.emulator.gameboy.features.overlays.load_game.logic.LoadGameState;
import com.cooldev.gba.emulator.gameboy.features.overlays.menu_game.logic.MenuGameState;
import com.cooldev.gba.emulator.gameboy.features.overlays.paywalls.logic.PurchaseOverlayState;
import com.cooldev.gba.emulator.gameboy.features.overlays.save_game.logic.SaveGameState;
import com.swordfish.libretrodroid.GLRetroView;
import d0.b0;
import h0.g;
import i0.a;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q0.p;

@e(c = "com.cooldev.gba.emulator.gameboy.features.game.widgets.MainGameViewKt$MainGameView$3", f = "MainGameView.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class MainGameViewKt$MainGameView$3 extends i implements p {
    final /* synthetic */ AutoSaveDialogState $autoSaveDialogState;
    final /* synthetic */ GameViewModel $gameViewModel;
    final /* synthetic */ LoadGameState $loadGameState;
    final /* synthetic */ MenuGameState $menuGameState;
    final /* synthetic */ PurchaseOverlayState $purchaseOverlayState;
    final /* synthetic */ GLRetroView $retroView;
    final /* synthetic */ SaveGameState $saveGameState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainGameViewKt$MainGameView$3(MenuGameState menuGameState, SaveGameState saveGameState, LoadGameState loadGameState, AutoSaveDialogState autoSaveDialogState, PurchaseOverlayState purchaseOverlayState, GameViewModel gameViewModel, GLRetroView gLRetroView, g gVar) {
        super(2, gVar);
        this.$menuGameState = menuGameState;
        this.$saveGameState = saveGameState;
        this.$loadGameState = loadGameState;
        this.$autoSaveDialogState = autoSaveDialogState;
        this.$purchaseOverlayState = purchaseOverlayState;
        this.$gameViewModel = gameViewModel;
        this.$retroView = gLRetroView;
    }

    @Override // j0.a
    @NotNull
    public final g create(@Nullable Object obj, @NotNull g gVar) {
        return new MainGameViewKt$MainGameView$3(this.$menuGameState, this.$saveGameState, this.$loadGameState, this.$autoSaveDialogState, this.$purchaseOverlayState, this.$gameViewModel, this.$retroView, gVar);
    }

    @Override // q0.p
    @Nullable
    public final Object invoke(@NotNull d0 d0Var, @Nullable g gVar) {
        return ((MainGameViewKt$MainGameView$3) create(d0Var, gVar)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        a aVar = a.f30806a;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        q.m(obj);
        if (this.$menuGameState.getShowingMenu() || this.$saveGameState.getShowingSaveGameView() || this.$loadGameState.getShowingLoadGameView() || this.$autoSaveDialogState.getShowingDialog() || this.$purchaseOverlayState.getOverlayVisible()) {
            this.$gameViewModel.muteGame();
            this.$retroView.onPause();
        } else {
            this.$gameViewModel.getMuteGame();
            this.$retroView.onResume();
        }
        return b0.f30125a;
    }
}
