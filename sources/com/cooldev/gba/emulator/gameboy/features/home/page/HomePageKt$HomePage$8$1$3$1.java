package com.cooldev.gba.emulator.gameboy.features.home.page;

import com.cooldev.gba.emulator.gameboy.features.view_all.enums.TypeViewAll;
import com.cooldev.gba.emulator.gameboy.router.MultiNavigationAppStateKt;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.a;

/* loaded from: classes.dex */
public final class HomePageKt$HomePage$8$1$3$1 extends r implements a {
    public static final HomePageKt$HomePage$8$1$3$1 INSTANCE = new HomePageKt$HomePage$8$1$3$1();

    public HomePageKt$HomePage$8$1$3$1() {
        super(0);
    }

    @Override // q0.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m223invoke();
        return b0.f30125a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m223invoke() {
        MultiNavigationAppStateKt.getLocalNavigationState().getDashboardNavigation().navigateTo("view-all?id=" + TypeViewAll.YOUR_GAME.getId());
    }
}
