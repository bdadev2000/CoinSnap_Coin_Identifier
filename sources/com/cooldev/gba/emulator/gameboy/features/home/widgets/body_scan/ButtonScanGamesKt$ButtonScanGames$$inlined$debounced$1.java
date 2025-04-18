package com.cooldev.gba.emulator.gameboy.features.home.widgets.body_scan;

import android.content.Context;
import android.os.SystemClock;
import androidx.compose.runtime.MutableLongState;
import com.cooldev.gba.emulator.gameboy.features.GBAEmulatorAppKt;
import com.cooldev.gba.emulator.gameboy.features.app.logic.PaywallNavigationViewModel;
import com.cooldev.gba.emulator.gameboy.features.home.logic.HomeState;
import com.cooldev.gba.emulator.gameboy.features.paywalls.logic.IAPState;
import com.cooldev.gba.emulator.gameboy.local.storage.AppOpenAdPrefUtils;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.a;

/* loaded from: classes2.dex */
public final class ButtonScanGamesKt$ButtonScanGames$$inlined$debounced$1 extends r implements a {
    final /* synthetic */ Context $context$inlined;
    final /* synthetic */ long $debounceTime;
    final /* synthetic */ HomeState $homeState$inlined;
    final /* synthetic */ IAPState $iapState$inlined;
    final /* synthetic */ MutableLongState $lastTimeClicked$delegate;
    final /* synthetic */ PaywallNavigationViewModel $paywallNavigationViewModel$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ButtonScanGamesKt$ButtonScanGames$$inlined$debounced$1(long j2, MutableLongState mutableLongState, IAPState iAPState, Context context, HomeState homeState, PaywallNavigationViewModel paywallNavigationViewModel) {
        super(0);
        this.$debounceTime = j2;
        this.$lastTimeClicked$delegate = mutableLongState;
        this.$iapState$inlined = iAPState;
        this.$context$inlined = context;
        this.$homeState$inlined = homeState;
        this.$paywallNavigationViewModel$inlined = paywallNavigationViewModel;
    }

    @Override // q0.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m244invoke();
        return b0.f30125a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m244invoke() {
        long d;
        long uptimeMillis = SystemClock.uptimeMillis();
        d = this.$lastTimeClicked$delegate.d();
        if (uptimeMillis - d > this.$debounceTime) {
            try {
                if (this.$iapState$inlined.isPremium()) {
                    AppOpenAdPrefUtils.INSTANCE.setShowAppOpenAdOnResume(this.$context$inlined, false);
                    GBAEmulatorAppKt.getLauncher().b(null);
                } else if (this.$homeState$inlined.isGameLimitReached()) {
                    this.$paywallNavigationViewModel$inlined.navigateToPaywall();
                } else {
                    AppOpenAdPrefUtils.INSTANCE.setShowAppOpenAdOnResume(this.$context$inlined, false);
                    GBAEmulatorAppKt.getLauncher().b(null);
                }
            } catch (Exception e) {
                e.printStackTrace();
                b0.a.b(this.$context$inlined, "Failed to select folder. Please try again.").show();
            }
        }
        this.$lastTimeClicked$delegate.o(uptimeMillis);
    }
}
