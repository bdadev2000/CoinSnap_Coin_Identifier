package com.cooldev.gba.emulator.gameboy.features.overlays.menu_game.page;

import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.cooldev.gba.emulator.gameboy.features.dialogs.auto_save_dialog.logic.AutoSaveDialogViewModel;
import com.cooldev.gba.emulator.gameboy.features.game.logic.GameState;
import com.cooldev.gba.emulator.gameboy.features.game.logic.GameViewModel;
import com.cooldev.gba.emulator.gameboy.features.overlays.load_game.logic.LoadGameViewModel;
import com.cooldev.gba.emulator.gameboy.features.overlays.menu_game.enums.MenuGame;
import com.cooldev.gba.emulator.gameboy.features.overlays.menu_game.logic.MenuGameViewModel;
import com.cooldev.gba.emulator.gameboy.features.overlays.paywalls.logic.PurchaseOverlayViewModel;
import com.cooldev.gba.emulator.gameboy.features.overlays.save_game.logic.SaveGameViewModel;
import com.cooldev.gba.emulator.gameboy.features.paywalls.logic.IAPState;
import d0.b0;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import p0.a;
import q0.l;

/* loaded from: classes2.dex */
public final class MenuGameOverlayKt$MenuGameOverlay$2$1$1 extends r implements l {
    final /* synthetic */ AutoSaveDialogViewModel $autoSaveDialogViewModel;
    final /* synthetic */ GameState $gameState;
    final /* synthetic */ GameViewModel $gameViewModel;
    final /* synthetic */ IAPState $iapState;
    final /* synthetic */ LoadGameViewModel $loadGameViewModel;
    final /* synthetic */ MenuGameViewModel $menuGameViewModel;
    final /* synthetic */ PurchaseOverlayViewModel $purchaseOverlayViewModel;
    final /* synthetic */ SaveGameViewModel $saveGameViewModel;

    /* loaded from: classes2.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MenuGame.values().length];
            try {
                iArr[MenuGame.MUTE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MenuGame.FAST_FORWARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MenuGame.AUTO_SAVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MenuGameOverlayKt$MenuGameOverlay$2$1$1(GameState gameState, IAPState iAPState, GameViewModel gameViewModel, PurchaseOverlayViewModel purchaseOverlayViewModel, MenuGameViewModel menuGameViewModel, SaveGameViewModel saveGameViewModel, LoadGameViewModel loadGameViewModel, AutoSaveDialogViewModel autoSaveDialogViewModel) {
        super(1);
        this.$gameState = gameState;
        this.$iapState = iAPState;
        this.$gameViewModel = gameViewModel;
        this.$purchaseOverlayViewModel = purchaseOverlayViewModel;
        this.$menuGameViewModel = menuGameViewModel;
        this.$saveGameViewModel = saveGameViewModel;
        this.$loadGameViewModel = loadGameViewModel;
        this.$autoSaveDialogViewModel = autoSaveDialogViewModel;
    }

    @Override // q0.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((LazyListScope) obj);
        return b0.f30125a;
    }

    public final void invoke(@NotNull LazyListScope lazyListScope) {
        a.s(lazyListScope, "$this$LazyColumn");
        k0.a entries = MenuGame.getEntries();
        GameState gameState = this.$gameState;
        IAPState iAPState = this.$iapState;
        GameViewModel gameViewModel = this.$gameViewModel;
        PurchaseOverlayViewModel purchaseOverlayViewModel = this.$purchaseOverlayViewModel;
        MenuGameViewModel menuGameViewModel = this.$menuGameViewModel;
        SaveGameViewModel saveGameViewModel = this.$saveGameViewModel;
        LoadGameViewModel loadGameViewModel = this.$loadGameViewModel;
        AutoSaveDialogViewModel autoSaveDialogViewModel = this.$autoSaveDialogViewModel;
        MenuGameOverlayKt$MenuGameOverlay$2$1$1$invoke$$inlined$items$default$1 menuGameOverlayKt$MenuGameOverlay$2$1$1$invoke$$inlined$items$default$1 = MenuGameOverlayKt$MenuGameOverlay$2$1$1$invoke$$inlined$items$default$1.INSTANCE;
        int size = entries.size();
        MenuGameOverlayKt$MenuGameOverlay$2$1$1$invoke$$inlined$items$default$3 menuGameOverlayKt$MenuGameOverlay$2$1$1$invoke$$inlined$items$default$3 = new MenuGameOverlayKt$MenuGameOverlay$2$1$1$invoke$$inlined$items$default$3(menuGameOverlayKt$MenuGameOverlay$2$1$1$invoke$$inlined$items$default$1, entries);
        MenuGameOverlayKt$MenuGameOverlay$2$1$1$invoke$$inlined$items$default$4 menuGameOverlayKt$MenuGameOverlay$2$1$1$invoke$$inlined$items$default$4 = new MenuGameOverlayKt$MenuGameOverlay$2$1$1$invoke$$inlined$items$default$4(entries, gameState, iAPState, gameViewModel, purchaseOverlayViewModel, menuGameViewModel, saveGameViewModel, loadGameViewModel, autoSaveDialogViewModel);
        Object obj = ComposableLambdaKt.f14482a;
        lazyListScope.d(size, null, menuGameOverlayKt$MenuGameOverlay$2$1$1$invoke$$inlined$items$default$3, new ComposableLambdaImpl(-632812321, menuGameOverlayKt$MenuGameOverlay$2$1$1$invoke$$inlined$items$default$4, true));
    }
}
