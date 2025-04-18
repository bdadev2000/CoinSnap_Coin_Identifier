package com.cooldev.gba.emulator.gameboy.features.home.widgets.body_games;

import com.cooldev.gba.emulator.gameboy.features.home.logic.HomeViewModel;
import com.cooldev.gba.emulator.gameboy.features.home.models.Game;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.a;

/* loaded from: classes.dex */
public final class ItemCardGameVerticalKt$ItemCardGameVertical$1 extends r implements a {
    final /* synthetic */ Game $data;
    final /* synthetic */ HomeViewModel $homeViewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ItemCardGameVerticalKt$ItemCardGameVertical$1(HomeViewModel homeViewModel, Game game) {
        super(0);
        this.$homeViewModel = homeViewModel;
        this.$data = game;
    }

    @Override // q0.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m239invoke();
        return b0.f30125a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m239invoke() {
        HomeViewModel.onSelectGame$default(this.$homeViewModel, this.$data, false, false, 6, null);
    }
}
