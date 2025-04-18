package com.cooldev.gba.emulator.gameboy.features.component;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.RectangleShapeKt;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes.dex */
public final class BlackOverlayKt {
    @ComposableTarget
    @Composable
    public static final void BlackOverlay(@Nullable Modifier modifier, @Nullable Composer composer, int i2, int i3) {
        int i4;
        ComposerImpl g2 = composer.g(-555036571);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i4 = (g2.I(modifier) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i4 & 11) == 2 && g2.i()) {
            g2.A();
        } else {
            if (i5 != 0) {
                modifier = Modifier.Companion.f14687a;
            }
            BoxKt.a(BackgroundKt.a(SizeKt.f4107c, Color.b(Color.f14957b, 0.7f), RectangleShapeKt.f15014a).T0(modifier), g2, 0);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new BlackOverlayKt$BlackOverlay$1(modifier, i2, i3);
        }
    }
}
