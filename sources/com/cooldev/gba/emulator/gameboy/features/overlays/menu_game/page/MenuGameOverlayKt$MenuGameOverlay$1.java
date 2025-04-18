package com.cooldev.gba.emulator.gameboy.features.overlays.menu_game.page;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import com.cooldev.gba.emulator.gameboy.features.game.logic.GameState;
import com.cooldev.gba.emulator.gameboy.features.game.logic.GameViewModel;
import com.cooldev.gba.emulator.gameboy.features.overlays.menu_game.logic.MenuGameViewModel;
import com.cooldev.gba.emulator.gameboy.features.paywalls.logic.IAPState;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import p0.a;
import q0.l;

/* loaded from: classes2.dex */
public final class MenuGameOverlayKt$MenuGameOverlay$1 extends r implements l {
    final /* synthetic */ GameState $gameState;
    final /* synthetic */ GameViewModel $gameViewModel;
    final /* synthetic */ IAPState $iapState;
    final /* synthetic */ MenuGameViewModel $menuGameViewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MenuGameOverlayKt$MenuGameOverlay$1(IAPState iAPState, GameState gameState, GameViewModel gameViewModel, MenuGameViewModel menuGameViewModel) {
        super(1);
        this.$iapState = iAPState;
        this.$gameState = gameState;
        this.$gameViewModel = gameViewModel;
        this.$menuGameViewModel = menuGameViewModel;
    }

    @Override // q0.l
    @NotNull
    public final DisposableEffectResult invoke(@NotNull DisposableEffectScope disposableEffectScope) {
        a.s(disposableEffectScope, "$this$DisposableEffect");
        if (this.$iapState.isPremium() && !this.$gameState.getAutoSaveEnable() && this.$gameState.isFirstTimeInPremium()) {
            GameViewModel.onAutoSaveSwitchButton$default(this.$gameViewModel, false, 1, null);
        }
        final MenuGameViewModel menuGameViewModel = this.$menuGameViewModel;
        return new DisposableEffectResult() { // from class: com.cooldev.gba.emulator.gameboy.features.overlays.menu_game.page.MenuGameOverlayKt$MenuGameOverlay$1$invoke$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                MenuGameViewModel.this.hideMenu();
            }
        };
    }
}
