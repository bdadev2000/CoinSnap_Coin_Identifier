package com.cooldev.gba.emulator.gameboy.features.game_pad.path;

import android.graphics.Path;
import android.graphics.Rect;
import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import p0.a;

@StabilityInferred
/* loaded from: classes2.dex */
public final class CirclePathBuilder {
    public static final int $stable = 0;

    @NotNull
    public static final CirclePathBuilder INSTANCE = new CirclePathBuilder();
    private static final float OFFSET = 0.15f;
    private static final float SCALE = 0.8f;

    private CirclePathBuilder() {
    }

    @NotNull
    public final Path build(@NotNull Rect rect) {
        a.s(rect, "rect");
        float min = Math.min(rect.width(), rect.height()) / 2.0f;
        Path path = new Path();
        path.addCircle(rect.centerX() + (0.15f * min), rect.centerY(), min * SCALE, Path.Direction.CCW);
        return path;
    }
}
