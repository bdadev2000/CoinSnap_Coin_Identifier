package com.cooldev.gba.emulator.gameboy.features.home.widgets.body_games;

import com.cooldev.gba.emulator.gameboy.features.dashboard.logic.UserGuideViewModel;
import com.cooldev.gba.emulator.gameboy.features.home.logic.HomeViewModel;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.a;

/* loaded from: classes.dex */
public final class ViewTypeIconButtonKt$ViewTypeIconButton$1 extends r implements a {
    final /* synthetic */ HomeViewModel $homeViewModel;
    final /* synthetic */ UserGuideViewModel $userGuideViewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewTypeIconButtonKt$ViewTypeIconButton$1(UserGuideViewModel userGuideViewModel, HomeViewModel homeViewModel) {
        super(0);
        this.$userGuideViewModel = userGuideViewModel;
        this.$homeViewModel = homeViewModel;
    }

    @Override // q0.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m243invoke();
        return b0.f30125a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m243invoke() {
        if (this.$userGuideViewModel.getDataRemote()) {
            return;
        }
        this.$homeViewModel.onChangedViewType();
    }
}
