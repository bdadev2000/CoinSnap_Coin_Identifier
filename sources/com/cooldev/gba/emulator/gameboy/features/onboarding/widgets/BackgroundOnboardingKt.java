package com.cooldev.gba.emulator.gameboy.features.onboarding.widgets;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.res.PainterResources_androidKt;
import com.applovin.impl.adview.t;
import com.cooldev.gba.emulator.gameboy.features.onboarding.logic.OnboardingState;
import com.cooldev.gba.emulator.gameboy.features.onboarding.logic.OnboardingViewModel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.scope.Scope;
import p0.a;

/* loaded from: classes4.dex */
public final class BackgroundOnboardingKt {
    @ComposableTarget
    @Composable
    public static final void BackgroundOnboarding(@NotNull Modifier modifier, @Nullable Composer composer, int i2) {
        int i3;
        a.s(modifier, "modifier");
        ComposerImpl g2 = composer.g(1396195818);
        if ((i2 & 14) == 0) {
            i3 = (g2.I(modifier) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 11) == 2 && g2.i()) {
            g2.A();
        } else {
            Scope q2 = t.q(g2, 414512006, g2, 0, 1274527078);
            boolean y2 = t.y(g2, false, 511388516, null) | g2.I(q2);
            Object u2 = g2.u();
            if (y2 || u2 == Composer.Companion.f13690a) {
                u2 = t.g(OnboardingViewModel.class, q2, null, null, g2);
            }
            g2.V(false);
            g2.V(false);
            ImageKt.a(PainterResources_androidKt.a(((OnboardingState) SnapshotStateKt.b(((OnboardingViewModel) u2).getState(), g2, 8).getValue()).getOnboardingTab().getResId(), g2, 0), null, SizeKt.d(modifier, 1.0f), null, ContentScale.Companion.d, 0.0f, null, g2, 24632, 104);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new BackgroundOnboardingKt$BackgroundOnboarding$1(modifier, i2);
        }
    }
}
