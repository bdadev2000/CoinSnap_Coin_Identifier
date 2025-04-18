package com.cooldev.gba.emulator.gameboy.features.overlays.menu_game.widgets;

import com.cooldev.gba.emulator.gameboy.features.overlays.menu_game.logic.MenuGameViewModel;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.a;

/* loaded from: classes2.dex */
public final class AppbarMenuGameKt$AppbarMenuGame$1$1$1 extends r implements a {
    final /* synthetic */ MenuGameViewModel $menuGameViewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppbarMenuGameKt$AppbarMenuGame$1$1$1(MenuGameViewModel menuGameViewModel) {
        super(0);
        this.$menuGameViewModel = menuGameViewModel;
    }

    @Override // q0.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m278invoke();
        return b0.f30125a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m278invoke() {
        this.$menuGameViewModel.hideMenu();
    }
}
