package com.cooldev.gba.emulator.gameboy.effects;

import android.annotation.SuppressLint;
import android.app.Activity;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import d0.b0;
import org.jetbrains.annotations.Nullable;
import p0.a;

/* loaded from: classes3.dex */
public final class SetRequestedOrientationPortraitKt {
    @Composable
    @SuppressLint({"SourceLockedOrientationActivity"})
    public static final void SetRequestedOrientationPortrait(boolean z2, @Nullable Composer composer, int i2, int i3) {
        int i4;
        ComposerImpl g2 = composer.g(747754490);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i4 = (g2.a(z2) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i4 & 11) == 2 && g2.i()) {
            g2.A();
        } else {
            if (i5 != 0) {
                z2 = true;
            }
            Object K = g2.K(AndroidCompositionLocals_androidKt.f16325b);
            a.q(K, "null cannot be cast to non-null type android.app.Activity");
            EffectsKt.f(b0.f30125a, new SetRequestedOrientationPortraitKt$SetRequestedOrientationPortrait$1(z2, (Activity) K, null), g2);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new SetRequestedOrientationPortraitKt$SetRequestedOrientationPortrait$2(z2, i2, i3);
        }
    }
}
