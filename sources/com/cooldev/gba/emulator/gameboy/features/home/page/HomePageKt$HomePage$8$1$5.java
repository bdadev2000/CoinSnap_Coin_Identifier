package com.cooldev.gba.emulator.gameboy.features.home.page;

import com.cooldev.gba.emulator.gameboy.features.home.logic.HomeViewModel;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.a;

/* loaded from: classes.dex */
public final class HomePageKt$HomePage$8$1$5 extends r implements a {
    final /* synthetic */ HomeViewModel $homeViewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomePageKt$HomePage$8$1$5(HomeViewModel homeViewModel) {
        super(0);
        this.$homeViewModel = homeViewModel;
    }

    @Override // q0.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m225invoke();
        return b0.f30125a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m225invoke() {
        this.$homeViewModel.hidePopupOffReward1();
    }
}
