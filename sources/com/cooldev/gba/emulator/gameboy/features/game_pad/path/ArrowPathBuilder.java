package com.cooldev.gba.emulator.gameboy.features.game_pad.path;

import android.graphics.Path;
import android.graphics.Rect;
import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import p0.a;

@StabilityInferred
/* loaded from: classes2.dex */
public final class ArrowPathBuilder {
    public static final int $stable = 0;

    @NotNull
    public static final ArrowPathBuilder INSTANCE = new ArrowPathBuilder();
    private static final float X_END = 0.15f;
    private static final float X_MID = 0.33f;
    private static final float X_START = 0.05f;
    private static final float Y_SPACING = 0.2f;

    private ArrowPathBuilder() {
    }

    @NotNull
    public final Path build(@NotNull Rect rect) {
        a.s(rect, "drawingBox");
        float width = (rect.width() * X_START) + rect.left;
        float width2 = (rect.width() * X_MID) + rect.left;
        float width3 = (rect.width() * 0.85f) + rect.left;
        float width4 = rect.left + rect.width();
        float height = (rect.height() * Y_SPACING) + rect.top;
        float height2 = (rect.height() / 2.0f) + rect.top;
        float height3 = (rect.height() * 0.8f) + rect.top;
        Path path = new Path();
        path.moveTo(width, height2);
        path.lineTo(width2, height);
        path.lineTo(width3, height);
        path.quadTo(width4, height2, width3, height3);
        path.lineTo(width3, height3);
        path.lineTo(width2, height3);
        path.close();
        return path;
    }
}
