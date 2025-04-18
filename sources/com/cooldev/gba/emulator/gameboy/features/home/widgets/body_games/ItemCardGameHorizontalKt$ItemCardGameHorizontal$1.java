package com.cooldev.gba.emulator.gameboy.features.home.widgets.body_games;

import com.cooldev.gba.emulator.gameboy.features.dashboard.logic.UserGuideViewModel;
import com.cooldev.gba.emulator.gameboy.features.home.logic.HomeViewModel;
import com.cooldev.gba.emulator.gameboy.features.home.models.Game;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.a;

/* loaded from: classes2.dex */
public final class ItemCardGameHorizontalKt$ItemCardGameHorizontal$1 extends r implements a {
    final /* synthetic */ Game $data;
    final /* synthetic */ HomeViewModel $homeViewModel;
    final /* synthetic */ UserGuideViewModel $userGuideViewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ItemCardGameHorizontalKt$ItemCardGameHorizontal$1(HomeViewModel homeViewModel, Game game, UserGuideViewModel userGuideViewModel) {
        super(0);
        this.$homeViewModel = homeViewModel;
        this.$data = game;
        this.$userGuideViewModel = userGuideViewModel;
    }

    @Override // q0.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m237invoke();
        return b0.f30125a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m237invoke() {
        HomeViewModel.onSelectGame$default(this.$homeViewModel, this.$data, false, this.$userGuideViewModel.getDataRemote(), 2, null);
        this.$userGuideViewModel.moveToNextGuide();
    }
}
