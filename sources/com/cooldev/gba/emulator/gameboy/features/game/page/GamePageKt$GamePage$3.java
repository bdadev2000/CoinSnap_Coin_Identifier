package com.cooldev.gba.emulator.gameboy.features.game.page;

import com.cooldev.gba.emulator.gameboy.features.dialogs.auto_save_dialog.logic.AutoSaveDialogViewModel;
import com.cooldev.gba.emulator.gameboy.features.game.logic.GameViewModel;
import com.cooldev.gba.emulator.gameboy.router.MultiNavigationAppStateKt;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.a;

/* loaded from: classes3.dex */
public final class GamePageKt$GamePage$3 extends r implements a {
    final /* synthetic */ AutoSaveDialogViewModel $autoSaveDialogViewModel;
    final /* synthetic */ GameViewModel $gameViewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GamePageKt$GamePage$3(GameViewModel gameViewModel, AutoSaveDialogViewModel autoSaveDialogViewModel) {
        super(0);
        this.$gameViewModel = gameViewModel;
        this.$autoSaveDialogViewModel = autoSaveDialogViewModel;
    }

    @Override // q0.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m202invoke();
        return b0.f30125a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m202invoke() {
        this.$gameViewModel.clearRetroView();
        this.$autoSaveDialogViewModel.hideDialog();
        MultiNavigationAppStateKt.getLocalNavigationState().getRootNavigation().pop();
    }
}
