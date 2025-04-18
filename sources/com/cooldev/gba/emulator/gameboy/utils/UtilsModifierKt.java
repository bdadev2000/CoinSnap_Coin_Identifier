package com.cooldev.gba.emulator.gameboy.utils;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.graphics.Shape;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class UtilsModifierKt {
    @NotNull
    /* renamed from: dropShadow-ymrBvOg, reason: not valid java name */
    public static final Modifier m388dropShadowymrBvOg(@NotNull Modifier modifier, @NotNull Shape shape, long j2, float f2, float f3, float f4, float f5) {
        p0.a.s(modifier, "$this$dropShadow");
        p0.a.s(shape, "shape");
        return modifier.T0(DrawModifierKt.b(Modifier.Companion.f14687a, new UtilsModifierKt$dropShadow$1(f5, shape, j2, f2, f4, f3)));
    }
}
