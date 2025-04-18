package com.cooldev.gba.emulator.gameboy.features.game_pad.touch;

import android.graphics.PointF;
import androidx.compose.runtime.internal.StabilityInferred;
import com.cooldev.gba.emulator.gameboy.features.game_pad.math.MathUtils;
import java.util.Set;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import p0.a;

@StabilityInferred
/* loaded from: classes.dex */
public final class TouchAnchor {

    @NotNull
    private final Set<Integer> ids;

    @NotNull
    private final PointF normalizedPoint;

    @NotNull
    private final PointF point;
    private final float strength;

    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }

        @NotNull
        public final TouchAnchor fromPolar(float f2, float f3, float f4, @NotNull Set<Integer> set) {
            a.s(set, "ids");
            MathUtils mathUtils = MathUtils.INSTANCE;
            return new TouchAnchor(mathUtils.polarCoordinatesToPoint(f2, f3), mathUtils.polarCoordinatesToPoint(f2, 1.0f), f4, set);
        }
    }

    public TouchAnchor(@NotNull PointF pointF, @NotNull PointF pointF2, float f2, @NotNull Set<Integer> set) {
        a.s(pointF, "point");
        a.s(pointF2, "normalizedPoint");
        a.s(set, "ids");
        this.point = pointF;
        this.normalizedPoint = pointF2;
        this.strength = f2;
        this.ids = set;
    }

    @NotNull
    public final Set<Integer> getIds() {
        return this.ids;
    }

    public final float getNormalizedDistance(float f2, float f3) {
        MathUtils mathUtils = MathUtils.INSTANCE;
        PointF pointF = this.point;
        float distanceSquared = mathUtils.distanceSquared(f2, pointF.x, f3, pointF.y);
        float f4 = this.strength;
        return distanceSquared / (f4 * f4);
    }

    public final float getNormalizedX() {
        return this.normalizedPoint.x;
    }

    public final float getNormalizedY() {
        return this.normalizedPoint.y;
    }

    public final float getX() {
        return this.point.x;
    }

    public final float getY() {
        return this.point.y;
    }
}
