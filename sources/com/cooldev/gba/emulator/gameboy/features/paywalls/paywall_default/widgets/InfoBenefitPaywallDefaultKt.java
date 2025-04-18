package com.cooldev.gba.emulator.gameboy.features.paywalls.paywall_default.widgets;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.FlowLayoutKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public final class InfoBenefitPaywallDefaultKt {
    @ComposableTarget
    @Composable
    public static final void InfoBenefitPaywallDefault(@Nullable Composer composer, int i2) {
        ComposerImpl g2 = composer.g(-1956202203);
        if (i2 == 0 && g2.i()) {
            g2.A();
        } else {
            float f2 = 12;
            FlowLayoutKt.a(null, Arrangement.g(f2), Arrangement.g(f2), 0, 0, null, ComposableSingletons$InfoBenefitPaywallDefaultKt.INSTANCE.m304getLambda1$gba_v1_0_35_54__09Apr2025_1046_release(), g2, 1573296, 57);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new InfoBenefitPaywallDefaultKt$InfoBenefitPaywallDefault$1(i2);
        }
    }
}
