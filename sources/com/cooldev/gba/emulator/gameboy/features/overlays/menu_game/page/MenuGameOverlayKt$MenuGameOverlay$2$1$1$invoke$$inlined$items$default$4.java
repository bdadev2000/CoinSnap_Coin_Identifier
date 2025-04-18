package com.cooldev.gba.emulator.gameboy.features.overlays.menu_game.page;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import com.cooldev.gba.emulator.gameboy.features.dialogs.auto_save_dialog.logic.AutoSaveDialogViewModel;
import com.cooldev.gba.emulator.gameboy.features.game.logic.GameState;
import com.cooldev.gba.emulator.gameboy.features.game.logic.GameViewModel;
import com.cooldev.gba.emulator.gameboy.features.overlays.load_game.logic.LoadGameViewModel;
import com.cooldev.gba.emulator.gameboy.features.overlays.menu_game.enums.MenuGame;
import com.cooldev.gba.emulator.gameboy.features.overlays.menu_game.logic.MenuGameViewModel;
import com.cooldev.gba.emulator.gameboy.features.overlays.menu_game.page.MenuGameOverlayKt$MenuGameOverlay$2$1$1;
import com.cooldev.gba.emulator.gameboy.features.overlays.menu_game.widgets.ItemAutoSavePremiumKt;
import com.cooldev.gba.emulator.gameboy.features.overlays.menu_game.widgets.ItemMenuGameKt;
import com.cooldev.gba.emulator.gameboy.features.overlays.paywalls.logic.PurchaseOverlayViewModel;
import com.cooldev.gba.emulator.gameboy.features.overlays.save_game.logic.SaveGameViewModel;
import com.cooldev.gba.emulator.gameboy.features.paywalls.logic.IAPState;
import com.cooldev.gba.emulator.gameboy.network.services.analytic.events.GameEvents;
import d0.b0;
import java.util.List;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.objectweb.asm.Opcodes;

/* loaded from: classes2.dex */
public final class MenuGameOverlayKt$MenuGameOverlay$2$1$1$invoke$$inlined$items$default$4 extends r implements q0.r {
    final /* synthetic */ AutoSaveDialogViewModel $autoSaveDialogViewModel$inlined;
    final /* synthetic */ GameState $gameState$inlined;
    final /* synthetic */ GameViewModel $gameViewModel$inlined;
    final /* synthetic */ IAPState $iapState$inlined;
    final /* synthetic */ List $items;
    final /* synthetic */ LoadGameViewModel $loadGameViewModel$inlined;
    final /* synthetic */ MenuGameViewModel $menuGameViewModel$inlined;
    final /* synthetic */ PurchaseOverlayViewModel $purchaseOverlayViewModel$inlined;
    final /* synthetic */ SaveGameViewModel $saveGameViewModel$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MenuGameOverlayKt$MenuGameOverlay$2$1$1$invoke$$inlined$items$default$4(List list, GameState gameState, IAPState iAPState, GameViewModel gameViewModel, PurchaseOverlayViewModel purchaseOverlayViewModel, MenuGameViewModel menuGameViewModel, SaveGameViewModel saveGameViewModel, LoadGameViewModel loadGameViewModel, AutoSaveDialogViewModel autoSaveDialogViewModel) {
        super(4);
        this.$items = list;
        this.$gameState$inlined = gameState;
        this.$iapState$inlined = iAPState;
        this.$gameViewModel$inlined = gameViewModel;
        this.$purchaseOverlayViewModel$inlined = purchaseOverlayViewModel;
        this.$menuGameViewModel$inlined = menuGameViewModel;
        this.$saveGameViewModel$inlined = saveGameViewModel;
        this.$loadGameViewModel$inlined = loadGameViewModel;
        this.$autoSaveDialogViewModel$inlined = autoSaveDialogViewModel;
    }

    @Override // q0.r
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        invoke((LazyItemScope) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
        return b0.f30125a;
    }

    @Composable
    public final void invoke(@NotNull LazyItemScope lazyItemScope, int i2, @Nullable Composer composer, int i3) {
        int i4;
        if ((i3 & 6) == 0) {
            i4 = i3 | (composer.I(lazyItemScope) ? 4 : 2);
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= composer.c(i2) ? 32 : 16;
        }
        if ((i4 & Opcodes.I2S) == 146 && composer.i()) {
            composer.A();
            return;
        }
        int i5 = i4 & 14;
        MenuGame menuGame = (MenuGame) this.$items.get(i2);
        composer.J(-5217031);
        int i6 = MenuGameOverlayKt$MenuGameOverlay$2$1$1.WhenMappings.$EnumSwitchMapping$0[menuGame.ordinal()];
        if (i6 == 1) {
            composer.J(-5259564);
            ItemMenuGameKt.ItemMenuGame(menuGame, !this.$gameState$inlined.getAudioEnabled(), new MenuGameOverlayKt$MenuGameOverlay$2$1$1$1$1(this.$gameViewModel$inlined), composer, (i5 >> 3) & 14, 0);
            composer.D();
        } else if (i6 == 2) {
            composer.J(-5019562);
            GameEvents.INSTANCE.logLickForward();
            ItemMenuGameKt.ItemMenuGame(menuGame, this.$gameState$inlined.getFastForwardEnabled(), new MenuGameOverlayKt$MenuGameOverlay$2$1$1$1$2(this.$gameViewModel$inlined), composer, (i5 >> 3) & 14, 0);
            composer.D();
        } else if (i6 != 3) {
            composer.J(-3920364);
            ItemMenuGameKt.ItemMenuGame(menuGame, false, new MenuGameOverlayKt$MenuGameOverlay$2$1$1$1$5(menuGame, this.$menuGameViewModel$inlined, this.$saveGameViewModel$inlined, this.$loadGameViewModel$inlined, this.$gameViewModel$inlined, this.$iapState$inlined, this.$gameState$inlined, this.$autoSaveDialogViewModel$inlined), composer, (i5 >> 3) & 14, 2);
            composer.D();
        } else {
            composer.J(-4708353);
            GameEvents.INSTANCE.logClickSave();
            if (this.$iapState$inlined.isPremium()) {
                composer.J(-4613989);
                ItemMenuGameKt.ItemMenuGame(menuGame, this.$gameState$inlined.getAutoSaveEnable(), new MenuGameOverlayKt$MenuGameOverlay$2$1$1$1$3(this.$gameViewModel$inlined), composer, (i5 >> 3) & 14, 0);
                composer.D();
            } else {
                composer.J(-4293046);
                ItemAutoSavePremiumKt.ItemAutoSavePremium(new MenuGameOverlayKt$MenuGameOverlay$2$1$1$1$4(this.$purchaseOverlayViewModel$inlined), composer, 0);
                composer.D();
            }
            composer.D();
        }
        composer.D();
    }
}
