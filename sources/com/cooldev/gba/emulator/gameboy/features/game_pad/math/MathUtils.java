package com.cooldev.gba.emulator.gameboy.features.game_pad.math;

import android.graphics.PointF;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import y0.n;

@StabilityInferred
/* loaded from: classes4.dex */
public final class MathUtils {
    public static final int $stable = 0;

    @NotNull
    public static final MathUtils INSTANCE = new MathUtils();

    private MathUtils() {
    }

    private final PointF mapEllipticalDiskCoordinatesToSquare(float f2, float f3) {
        float f4 = f2 * f2;
        float f5 = f3 * f3;
        float sqrt = ((float) Math.sqrt(2.0f)) * 2.0f;
        float f6 = (f4 + 2.0f) - f5;
        float f7 = (2.0f - f4) + f5;
        float f8 = f2 * sqrt;
        float f9 = f3 * sqrt;
        return new PointF((((float) Math.sqrt(f6 + f8)) * 0.5f) - (((float) Math.sqrt(f6 - f8)) * 0.5f), (((float) Math.sqrt(f7 + f9)) * 0.5f) - (((float) Math.sqrt(f7 - f9)) * 0.5f));
    }

    public static /* synthetic */ PointF polarCoordinatesToPoint$default(MathUtils mathUtils, float f2, float f3, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            f3 = 1.0f;
        }
        return mathUtils.polarCoordinatesToPoint(f2, f3);
    }

    public final float angle(float f2, float f3, float f4, float f5) {
        return ((-((float) Math.atan2(f5 - f4, f3 - f2))) + 6.2831855f) % 6.2831855f;
    }

    public final float clamp(float f2, float f3, float f4) {
        return Math.max(Math.min(f2, f4), f3);
    }

    @NotNull
    public final PointF convertPolarCoordinatesToSquares(float f2, float f3) {
        double d = f2;
        return mapEllipticalDiskCoordinatesToSquare(((float) Math.cos(d)) * f3, f3 * ((float) Math.sin(d)));
    }

    public final float distance(float f2, float f3, float f4, float f5) {
        return (float) Math.sqrt(distanceSquared(f2, f3, f4, f5));
    }

    public final float distanceSquared(float f2, float f3, float f4, float f5) {
        float f6 = f2 - f3;
        float f7 = f4 - f5;
        return (f7 * f7) + (f6 * f6);
    }

    public final float fmod(float f2, float f3) {
        return ((f2 % f3) + f3) % f3;
    }

    public final boolean isAngleInRange(float f2, float f3, float f4) {
        Boolean[] boolArr = new Boolean[3];
        boolArr[0] = Boolean.valueOf(f3 <= f2 && f2 <= f4);
        float f5 = f2 - 6.2831855f;
        boolArr[1] = Boolean.valueOf(f3 <= f5 && f5 <= f4);
        float f6 = f2 + 6.2831855f;
        boolArr[2] = Boolean.valueOf(f3 <= f6 && f6 <= f4);
        Iterator it = n.K(boolArr).iterator();
        while (it.hasNext()) {
            if (((Boolean) it.next()).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final boolean isEven(int i2) {
        return i2 % 2 == 0;
    }

    public final boolean isOdd(int i2) {
        return i2 % 2 == 1;
    }

    public final float lint(float f2, float f3, float f4) {
        return (f4 * f2) + ((1 - f2) * f3);
    }

    @NotNull
    public final PointF polarCoordinatesToPoint(float f2, float f3) {
        double d = f2;
        return new PointF(((float) Math.cos(d)) * f3, f3 * ((float) Math.sin(d)));
    }

    public final float toDegrees(float f2) {
        return (float) Math.toDegrees(f2);
    }

    public final float toRadians(float f2) {
        return (float) Math.toRadians(f2);
    }

    public final int fmod(int i2, int i3) {
        return ((i2 % i3) + i3) % i3;
    }
}
