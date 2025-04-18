package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;

@RestrictTo
/* loaded from: classes3.dex */
public class Blend {
    private Blend() {
    }

    public static int cam16Ucs(int i2, int i3, double d) {
        Cam16 fromInt = Cam16.fromInt(i2);
        Cam16 fromInt2 = Cam16.fromInt(i3);
        double jstar = fromInt.getJstar();
        double astar = fromInt.getAstar();
        double bstar = fromInt.getBstar();
        return Cam16.fromUcs(((fromInt2.getJstar() - jstar) * d) + jstar, ((fromInt2.getAstar() - astar) * d) + astar, ((fromInt2.getBstar() - bstar) * d) + bstar).toInt();
    }

    public static int harmonize(int i2, int i3) {
        Hct fromInt = Hct.fromInt(i2);
        Hct fromInt2 = Hct.fromInt(i3);
        double min = Math.min(MathUtils.differenceDegrees(fromInt.getHue(), fromInt2.getHue()) * 0.5d, 15.0d);
        return Hct.from(MathUtils.sanitizeDegreesDouble((MathUtils.rotationDirection(fromInt.getHue(), fromInt2.getHue()) * min) + fromInt.getHue()), fromInt.getChroma(), fromInt.getTone()).toInt();
    }

    public static int hctHue(int i2, int i3, double d) {
        return Hct.from(Cam16.fromInt(cam16Ucs(i2, i3, d)).getHue(), Cam16.fromInt(i2).getChroma(), ColorUtils.lstarFromArgb(i2)).toInt();
    }
}
