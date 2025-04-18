package com.cooldev.gba.emulator.gameboy.features.view_all.widgets;

import com.cooldev.gba.emulator.gameboy.features.home.models.Game;
import com.cooldev.gba.emulator.gameboy.features.view_all.logic.ViewAllViewModel;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.a;

/* loaded from: classes.dex */
public final class ItemCardGameGridViewKt$ItemCardGameGridView$1 extends r implements a {
    final /* synthetic */ Game $data;
    final /* synthetic */ ViewAllViewModel $viewAllViewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ItemCardGameGridViewKt$ItemCardGameGridView$1(ViewAllViewModel viewAllViewModel, Game game) {
        super(0);
        this.$viewAllViewModel = viewAllViewModel;
        this.$data = game;
    }

    @Override // q0.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m375invoke();
        return b0.f30125a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m375invoke() {
        ViewAllViewModel.onSelectGame$default(this.$viewAllViewModel, this.$data, false, 2, null);
    }
}
