package com.cooldev.gba.emulator.gameboy.features.paywalls.paywall_yearly_non_trial.page;

import com.cooldev.gba.emulator.gameboy.network.services.analytic.events.PaywallEvents;
import com.cooldev.gba.emulator.gameboy.router.MultiNavigationAppStateKt;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.a;

/* loaded from: classes.dex */
public final class PaywallYearlyNonTrialPageKt$PaywallYearlyNonTrialPage$3$1$2 extends r implements a {
    public static final PaywallYearlyNonTrialPageKt$PaywallYearlyNonTrialPage$3$1$2 INSTANCE = new PaywallYearlyNonTrialPageKt$PaywallYearlyNonTrialPage$3$1$2();

    public PaywallYearlyNonTrialPageKt$PaywallYearlyNonTrialPage$3$1$2() {
        super(0);
    }

    @Override // q0.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m328invoke();
        return b0.f30125a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m328invoke() {
        PaywallEvents.INSTANCE.logClickClosePaywall();
        MultiNavigationAppStateKt.getLocalNavigationState().getRootNavigation().pop();
    }
}
