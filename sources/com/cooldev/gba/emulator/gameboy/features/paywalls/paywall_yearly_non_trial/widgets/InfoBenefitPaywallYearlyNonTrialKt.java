package com.cooldev.gba.emulator.gameboy.features.paywalls.paywall_yearly_non_trial.widgets;

import androidx.compose.foundation.ImageKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.res.PainterResources_androidKt;
import com.cooldev.gba.emulator.gameboy.constants.MyImages;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class InfoBenefitPaywallYearlyNonTrialKt {
    @ComposableTarget
    @Composable
    public static final void InfoBenefitPaywallYearlyNonTrial(@Nullable Composer composer, int i2) {
        ComposerImpl g2 = composer.g(-1018445429);
        if (i2 == 0 && g2.i()) {
            g2.A();
        } else {
            ImageKt.a(PainterResources_androidKt.a(MyImages.INSTANCE.getPaywall1(), g2, 6), null, null, null, ContentScale.Companion.f15722c, 0.0f, null, g2, 24632, 108);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new InfoBenefitPaywallYearlyNonTrialKt$InfoBenefitPaywallYearlyNonTrial$1(i2);
        }
    }
}
