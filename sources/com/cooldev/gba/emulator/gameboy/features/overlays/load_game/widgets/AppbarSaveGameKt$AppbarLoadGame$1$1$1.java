package com.cooldev.gba.emulator.gameboy.features.overlays.load_game.widgets;

import com.cooldev.gba.emulator.gameboy.features.overlays.load_game.logic.LoadGameViewModel;
import com.cooldev.gba.emulator.gameboy.features.overlays.menu_game.logic.MenuGameViewModel;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.a;

/* loaded from: classes.dex */
public final class AppbarSaveGameKt$AppbarLoadGame$1$1$1 extends r implements a {
    final /* synthetic */ LoadGameViewModel $loadGameViewModel;
    final /* synthetic */ MenuGameViewModel $menuGameViewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppbarSaveGameKt$AppbarLoadGame$1$1$1(LoadGameViewModel loadGameViewModel, MenuGameViewModel menuGameViewModel) {
        super(0);
        this.$loadGameViewModel = loadGameViewModel;
        this.$menuGameViewModel = menuGameViewModel;
    }

    @Override // q0.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m270invoke();
        return b0.f30125a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m270invoke() {
        this.$loadGameViewModel.hideLoadGameView();
        this.$menuGameViewModel.showMenu();
    }
}
