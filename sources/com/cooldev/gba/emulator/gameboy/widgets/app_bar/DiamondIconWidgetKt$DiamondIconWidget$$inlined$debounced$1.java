package com.cooldev.gba.emulator.gameboy.widgets.app_bar;

import android.os.SystemClock;
import androidx.compose.runtime.MutableLongState;
import com.cooldev.gba.emulator.gameboy.features.app.logic.PaywallNavigationViewModel;
import com.cooldev.gba.emulator.gameboy.network.services.analytic.events.AppEvents;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.a;

/* loaded from: classes2.dex */
public final class DiamondIconWidgetKt$DiamondIconWidget$$inlined$debounced$1 extends r implements a {
    final /* synthetic */ long $debounceTime;
    final /* synthetic */ MutableLongState $lastTimeClicked$delegate;
    final /* synthetic */ PaywallNavigationViewModel $paywallNavigationViewModel$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiamondIconWidgetKt$DiamondIconWidget$$inlined$debounced$1(long j2, MutableLongState mutableLongState, PaywallNavigationViewModel paywallNavigationViewModel) {
        super(0);
        this.$debounceTime = j2;
        this.$lastTimeClicked$delegate = mutableLongState;
        this.$paywallNavigationViewModel$inlined = paywallNavigationViewModel;
    }

    @Override // q0.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m401invoke();
        return b0.f30125a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m401invoke() {
        long d;
        long uptimeMillis = SystemClock.uptimeMillis();
        d = this.$lastTimeClicked$delegate.d();
        if (uptimeMillis - d > this.$debounceTime) {
            AppEvents.INSTANCE.logClickDiamondNavigateToPaywall();
            this.$paywallNavigationViewModel$inlined.navigateToPaywall();
        }
        this.$lastTimeClicked$delegate.o(uptimeMillis);
    }
}
