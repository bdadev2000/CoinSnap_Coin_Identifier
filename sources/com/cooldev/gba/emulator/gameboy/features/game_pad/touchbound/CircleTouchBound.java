package com.cooldev.gba.emulator.gameboy.features.game_pad.touchbound;

import android.graphics.PointF;
import androidx.compose.runtime.internal.StabilityInferred;
import com.cooldev.gba.emulator.gameboy.features.game_pad.math.MathUtils;
import org.jetbrains.annotations.NotNull;
import p0.a;

@StabilityInferred
/* loaded from: classes.dex */
public final class CircleTouchBound implements TouchBound {
    public static final int $stable = 8;

    @NotNull
    private final PointF center;
    private final float radius;

    public CircleTouchBound(@NotNull PointF pointF, float f2) {
        a.s(pointF, "center");
        this.center = pointF;
        this.radius = f2;
    }

    @Override // com.cooldev.gba.emulator.gameboy.features.game_pad.touchbound.TouchBound
    public boolean contains(float f2, float f3) {
        MathUtils mathUtils = MathUtils.INSTANCE;
        PointF pointF = this.center;
        return mathUtils.distance(f2, pointF.x, f3, pointF.y) < this.radius;
    }
}
