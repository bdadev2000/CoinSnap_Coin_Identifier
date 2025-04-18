package com.cooldev.gba.emulator.gameboy.features.game.utils;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.objectweb.asm.Opcodes;
import p0.a;

@StabilityInferred
/* loaded from: classes4.dex */
public final class GraphicsUtils {
    public static final int $stable = 0;

    @NotNull
    public static final GraphicsUtils INSTANCE = new GraphicsUtils();

    private GraphicsUtils() {
    }

    public final float convertDpToPixel(float f2, @NotNull Context context) {
        a.s(context, "context");
        return (context.getResources().getDisplayMetrics().densityDpi / Opcodes.IF_ICMPNE) * f2;
    }
}
