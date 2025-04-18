package com.cooldev.gba.emulator.gameboy.features.game.page;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import com.cooldev.gba.emulator.gameboy.features.game.logic.GameViewModel;
import com.cooldev.gba.emulator.gameboy.features.game.widgets.MainGameViewKt;
import com.cooldev.gba.emulator.gameboy.features.overlays.load_game.logic.LoadGameState;
import com.cooldev.gba.emulator.gameboy.features.overlays.load_game.page.LoadGameOverlayKt;
import com.cooldev.gba.emulator.gameboy.features.overlays.menu_game.logic.MenuGameState;
import com.cooldev.gba.emulator.gameboy.features.overlays.menu_game.page.MenuGameOverlayKt;
import com.cooldev.gba.emulator.gameboy.features.overlays.paywalls.logic.PurchaseOverlayState;
import com.cooldev.gba.emulator.gameboy.features.overlays.paywalls.view.PaywallsOverlayKt;
import com.cooldev.gba.emulator.gameboy.features.overlays.save_game.logic.SaveGameState;
import com.cooldev.gba.emulator.gameboy.features.overlays.save_game.page.SaveGameOverlayKt;
import d0.b0;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;
import q0.q;

/* loaded from: classes3.dex */
public final class GamePageKt$GamePage$5 extends r implements q {
    final /* synthetic */ GameViewModel $gameViewModel;
    final /* synthetic */ LoadGameState $loadGameState;
    final /* synthetic */ MenuGameState $menuGameState;
    final /* synthetic */ PurchaseOverlayState $purchaseOverlayState;
    final /* synthetic */ SaveGameState $saveGameState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GamePageKt$GamePage$5(GameViewModel gameViewModel, MenuGameState menuGameState, SaveGameState saveGameState, LoadGameState loadGameState, PurchaseOverlayState purchaseOverlayState) {
        super(3);
        this.$gameViewModel = gameViewModel;
        this.$menuGameState = menuGameState;
        this.$saveGameState = saveGameState;
        this.$loadGameState = loadGameState;
        this.$purchaseOverlayState = purchaseOverlayState;
    }

    @Override // q0.q
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((PaddingValues) obj, (Composer) obj2, ((Number) obj3).intValue());
        return b0.f30125a;
    }

    @ComposableTarget
    @Composable
    public final void invoke(@NotNull PaddingValues paddingValues, @Nullable Composer composer, int i2) {
        a.s(paddingValues, "it");
        if ((i2 & 81) == 16 && composer.i()) {
            composer.A();
            return;
        }
        MainGameViewKt.MainGameView(this.$gameViewModel, composer, 8);
        composer.J(1824889843);
        if (this.$menuGameState.getShowingMenu()) {
            MenuGameOverlayKt.MenuGameOverlay(this.$gameViewModel, composer, 8);
        }
        composer.D();
        composer.J(1824892878);
        if (this.$saveGameState.getShowingSaveGameView()) {
            SaveGameOverlayKt.SaveGameOverlay(composer, 0);
        }
        composer.D();
        composer.J(1824895758);
        if (this.$loadGameState.getShowingLoadGameView()) {
            LoadGameOverlayKt.LoadGameOverlay(composer, 0);
        }
        composer.D();
        if (this.$purchaseOverlayState.getOverlayVisible()) {
            PaywallsOverlayKt.PaywallsOverlay(composer, 0);
        }
    }
}
