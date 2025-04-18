package com.cooldev.gba.emulator.gameboy.features.themenew.widgets;

import com.cooldev.gba.emulator.gameboy.features.app.logic.PaywallNavigationViewModel;
import com.cooldev.gba.emulator.gameboy.features.paywalls.logic.IAPState;
import com.cooldev.gba.emulator.gameboy.features.themenew.enums.GamePadTheme;
import com.cooldev.gba.emulator.gameboy.features.themenew.logic.ThemeViewModel;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.a;

/* loaded from: classes2.dex */
public final class ItemThemeKt$ItemTheme$1 extends r implements a {
    final /* synthetic */ IAPState $iapState;
    final /* synthetic */ GamePadTheme $item;
    final /* synthetic */ PaywallNavigationViewModel $paywallNavigationViewModel;
    final /* synthetic */ ThemeViewModel $themeViewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ItemThemeKt$ItemTheme$1(IAPState iAPState, ThemeViewModel themeViewModel, GamePadTheme gamePadTheme, PaywallNavigationViewModel paywallNavigationViewModel) {
        super(0);
        this.$iapState = iAPState;
        this.$themeViewModel = themeViewModel;
        this.$item = gamePadTheme;
        this.$paywallNavigationViewModel = paywallNavigationViewModel;
    }

    @Override // q0.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m364invoke();
        return b0.f30125a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m364invoke() {
        if (this.$iapState.isPremium()) {
            this.$themeViewModel.onSelect(this.$item);
        } else if (this.$item.getLock()) {
            this.$paywallNavigationViewModel.navigateToPaywall();
        } else {
            this.$themeViewModel.onSelect(this.$item);
        }
    }
}
