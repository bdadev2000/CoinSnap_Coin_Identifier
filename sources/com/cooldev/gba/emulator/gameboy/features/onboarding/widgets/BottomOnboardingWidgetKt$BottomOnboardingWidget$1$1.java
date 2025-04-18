package com.cooldev.gba.emulator.gameboy.features.onboarding.widgets;

import com.cooldev.gba.emulator.gameboy.features.app.logic.AppState;
import com.cooldev.gba.emulator.gameboy.features.onboarding.logic.OnboardingViewModel;
import com.cooldev.gba.emulator.gameboy.features.paywalls.logic.IAPState;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.a;

/* loaded from: classes2.dex */
public final class BottomOnboardingWidgetKt$BottomOnboardingWidget$1$1 extends r implements a {
    final /* synthetic */ AppState $appState;
    final /* synthetic */ IAPState $iapState;
    final /* synthetic */ OnboardingViewModel $onboardingViewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomOnboardingWidgetKt$BottomOnboardingWidget$1$1(OnboardingViewModel onboardingViewModel, AppState appState, IAPState iAPState) {
        super(0);
        this.$onboardingViewModel = onboardingViewModel;
        this.$appState = appState;
        this.$iapState = iAPState;
    }

    @Override // q0.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m265invoke();
        return b0.f30125a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m265invoke() {
        this.$onboardingViewModel.onNextPage(this.$appState.getShouldShowPurchase(), !this.$iapState.isPremium());
    }
}
