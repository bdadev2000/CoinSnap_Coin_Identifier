package com.cooldev.gba.emulator.gameboy.features.setting.widgets;

import com.cooldev.gba.emulator.gameboy.features.app.logic.PaywallNavigationViewModel;
import com.cooldev.gba.emulator.gameboy.network.services.analytic.events.SettingEvents;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.a;

/* loaded from: classes.dex */
public final class BannerSettingKt$BannerSetting$2 extends r implements a {
    final /* synthetic */ PaywallNavigationViewModel $paywallNavigationViewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BannerSettingKt$BannerSetting$2(PaywallNavigationViewModel paywallNavigationViewModel) {
        super(0);
        this.$paywallNavigationViewModel = paywallNavigationViewModel;
    }

    @Override // q0.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m356invoke();
        return b0.f30125a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m356invoke() {
        SettingEvents.INSTANCE.logClickBannerSettingNavigateToPaywall();
        this.$paywallNavigationViewModel.navigateToPaywall();
    }
}
