package com.cooldev.gba.emulator.gameboy.features.overlays.load_game.widgets;

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
import com.cooldev.gba.emulator.gameboy.constants.MyColors;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;

/* loaded from: classes2.dex */
public final class LayerBlackLoadGameKt {
    @ComposableTarget
    @Composable
    public static final void LayerBlackLoadGame(@NotNull Modifier modifier, @Nullable Composer composer, int i2) {
        int i3;
        a.s(modifier, "modifier");
        ComposerImpl g2 = composer.g(1398605413);
        if ((i2 & 14) == 0) {
            i3 = (g2.I(modifier) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 11) == 2 && g2.i()) {
            g2.A();
        } else {
            BoxKt.a(BackgroundKt.a(modifier.T0(SizeKt.f4107c), Color.b(MyColors.INSTANCE.m25getText200d7_KjU(), 0.7f), RectangleShapeKt.f15014a), g2, 0);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new LayerBlackLoadGameKt$LayerBlackLoadGame$1(modifier, i2);
        }
    }
}
