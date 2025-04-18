package com.cooldev.gba.emulator.gameboy.features.overlays.save_game.widgets;

import com.cooldev.gba.emulator.gameboy.features.overlays.menu_game.logic.MenuGameViewModel;
import com.cooldev.gba.emulator.gameboy.features.overlays.save_game.logic.SaveGameViewModel;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.a;

/* loaded from: classes.dex */
public final class AppbarSaveGameKt$AppbarSaveGame$1$1$1 extends r implements a {
    final /* synthetic */ MenuGameViewModel $menuGameViewModel;
    final /* synthetic */ SaveGameViewModel $saveGameViewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppbarSaveGameKt$AppbarSaveGame$1$1$1(SaveGameViewModel saveGameViewModel, MenuGameViewModel menuGameViewModel) {
        super(0);
        this.$saveGameViewModel = saveGameViewModel;
        this.$menuGameViewModel = menuGameViewModel;
    }

    @Override // q0.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m291invoke();
        return b0.f30125a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m291invoke() {
        this.$saveGameViewModel.hideSaveGameView();
        this.$menuGameViewModel.showMenu();
    }
}
