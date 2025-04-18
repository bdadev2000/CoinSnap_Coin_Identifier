package androidx.compose.ui.util;

/* loaded from: classes4.dex */
public final class MathHelpersKt {
    public static final float a(float f2) {
        float intBitsToFloat = Float.intBitsToFloat(((int) ((Float.floatToRawIntBits(f2) & 8589934591L) / 3)) + 709952852);
        float f3 = intBitsToFloat - ((intBitsToFloat - (f2 / (intBitsToFloat * intBitsToFloat))) * 0.33333334f);
        return f3 - ((f3 - (f2 / (f3 * f3))) * 0.33333334f);
    }

    public static final float b(float f2, float f3, float f4) {
        return (f4 * f3) + ((1 - f4) * f2);
    }

    public static final int c(int i2, int i3, float f2) {
        return i2 + ((int) Math.round((i3 - i2) * f2));
    }
}
