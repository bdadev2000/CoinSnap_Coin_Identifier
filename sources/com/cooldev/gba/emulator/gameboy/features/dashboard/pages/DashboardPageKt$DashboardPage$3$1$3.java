package com.cooldev.gba.emulator.gameboy.features.dashboard.pages;

import com.cooldev.gba.emulator.gameboy.features.app.logic.PaywallNavigationViewModel;
import com.cooldev.gba.emulator.gameboy.features.home.logic.HomeViewModel;
import com.cooldev.gba.emulator.gameboy.network.services.analytic.events.RewardEvents;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.a;

/* loaded from: classes.dex */
public final class DashboardPageKt$DashboardPage$3$1$3 extends r implements a {
    final /* synthetic */ HomeViewModel $homeViewModel;
    final /* synthetic */ PaywallNavigationViewModel $paywallNavigationViewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DashboardPageKt$DashboardPage$3$1$3(HomeViewModel homeViewModel, PaywallNavigationViewModel paywallNavigationViewModel) {
        super(0);
        this.$homeViewModel = homeViewModel;
        this.$paywallNavigationViewModel = paywallNavigationViewModel;
    }

    @Override // q0.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m127invoke();
        return b0.f30125a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m127invoke() {
        this.$homeViewModel.hidePopupFreeTrial();
        RewardEvents.INSTANCE.logClickLimitedFree();
        this.$paywallNavigationViewModel.navigateToPaywall();
    }
}
