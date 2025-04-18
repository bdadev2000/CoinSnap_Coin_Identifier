package androidx.compose.ui.geometry;

import androidx.compose.ui.util.MathHelpersKt;

/* loaded from: classes3.dex */
public final class OffsetKt {
    public static final long a(float f2, float f3) {
        return (Float.floatToRawIntBits(f3) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32);
    }

    public static final boolean b(long j2) {
        long j3 = (j2 & 9187343241974906880L) ^ 9187343241974906880L;
        return (((~j3) & (j3 - 4294967297L)) & (-9223372034707292160L)) == 0;
    }

    public static final boolean c(long j2) {
        return (j2 & 9223372034707292159L) != 9205357640488583168L;
    }

    public static final boolean d(long j2) {
        return (j2 & 9223372034707292159L) == 9205357640488583168L;
    }

    public static final long e(long j2, long j3, float f2) {
        float b2 = MathHelpersKt.b(Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j3 >> 32)), f2);
        float b3 = MathHelpersKt.b(Float.intBitsToFloat((int) (j2 & 4294967295L)), Float.intBitsToFloat((int) (j3 & 4294967295L)), f2);
        return (Float.floatToRawIntBits(b2) << 32) | (Float.floatToRawIntBits(b3) & 4294967295L);
    }
}
