package com.cooldev.gba.emulator.gameboy.features.overlays.menu_game.page;

import com.cooldev.gba.emulator.gameboy.features.dialogs.auto_save_dialog.logic.AutoSaveDialogViewModel;
import com.cooldev.gba.emulator.gameboy.features.game.logic.GameState;
import com.cooldev.gba.emulator.gameboy.features.game.logic.GameViewModel;
import com.cooldev.gba.emulator.gameboy.features.overlays.load_game.logic.LoadGameViewModel;
import com.cooldev.gba.emulator.gameboy.features.overlays.menu_game.enums.MenuGame;
import com.cooldev.gba.emulator.gameboy.features.overlays.menu_game.logic.MenuGameViewModel;
import com.cooldev.gba.emulator.gameboy.features.overlays.save_game.logic.SaveGameViewModel;
import com.cooldev.gba.emulator.gameboy.features.paywalls.logic.IAPState;
import com.cooldev.gba.emulator.gameboy.network.services.analytic.events.GameEvents;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.a;

/* loaded from: classes2.dex */
public final class MenuGameOverlayKt$MenuGameOverlay$2$1$1$1$5 extends r implements a {
    final /* synthetic */ AutoSaveDialogViewModel $autoSaveDialogViewModel;
    final /* synthetic */ GameState $gameState;
    final /* synthetic */ GameViewModel $gameViewModel;
    final /* synthetic */ IAPState $iapState;
    final /* synthetic */ MenuGame $item;
    final /* synthetic */ LoadGameViewModel $loadGameViewModel;
    final /* synthetic */ MenuGameViewModel $menuGameViewModel;
    final /* synthetic */ SaveGameViewModel $saveGameViewModel;

    /* renamed from: com.cooldev.gba.emulator.gameboy.features.overlays.menu_game.page.MenuGameOverlayKt$MenuGameOverlay$2$1$1$1$5$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends r implements a {
        final /* synthetic */ MenuGameViewModel $menuGameViewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(MenuGameViewModel menuGameViewModel) {
            super(0);
            this.$menuGameViewModel = menuGameViewModel;
        }

        @Override // q0.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m277invoke();
            return b0.f30125a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m277invoke() {
            this.$menuGameViewModel.hideMenu();
        }
    }

    /* loaded from: classes2.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MenuGame.values().length];
            try {
                iArr[MenuGame.SAVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MenuGame.LOAD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MenuGame.RESTART.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MenuGame.QUIT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MenuGameOverlayKt$MenuGameOverlay$2$1$1$1$5(MenuGame menuGame, MenuGameViewModel menuGameViewModel, SaveGameViewModel saveGameViewModel, LoadGameViewModel loadGameViewModel, GameViewModel gameViewModel, IAPState iAPState, GameState gameState, AutoSaveDialogViewModel autoSaveDialogViewModel) {
        super(0);
        this.$item = menuGame;
        this.$menuGameViewModel = menuGameViewModel;
        this.$saveGameViewModel = saveGameViewModel;
        this.$loadGameViewModel = loadGameViewModel;
        this.$gameViewModel = gameViewModel;
        this.$iapState = iAPState;
        this.$gameState = gameState;
        this.$autoSaveDialogViewModel = autoSaveDialogViewModel;
    }

    @Override // q0.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m276invoke();
        return b0.f30125a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m276invoke() {
        int i2 = WhenMappings.$EnumSwitchMapping$0[this.$item.ordinal()];
        if (i2 == 1) {
            this.$menuGameViewModel.hideMenu();
            this.$saveGameViewModel.showSaveGameView();
            return;
        }
        if (i2 == 2) {
            this.$menuGameViewModel.hideMenu();
            this.$loadGameViewModel.showLoadGameView();
            return;
        }
        if (i2 == 3) {
            this.$gameViewModel.onRestart(new AnonymousClass1(this.$menuGameViewModel));
            return;
        }
        if (i2 != 4) {
            return;
        }
        GameEvents.INSTANCE.logClickQuit();
        if (this.$iapState.isPremium()) {
            this.$gameViewModel.onQuit();
        } else if (this.$gameState.getAutoSaveEnable()) {
            this.$gameViewModel.onQuit();
        } else {
            this.$autoSaveDialogViewModel.showDialog();
        }
    }
}
