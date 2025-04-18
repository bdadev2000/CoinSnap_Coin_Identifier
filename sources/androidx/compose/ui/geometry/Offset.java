package androidx.compose.ui.geometry;

import androidx.compose.runtime.Immutable;

@Immutable
/* loaded from: classes2.dex */
public final class Offset {

    /* renamed from: a, reason: collision with root package name */
    public final long f14913a;

    /* loaded from: classes2.dex */
    public static final class Companion {
    }

    public static final long a(float f2, float f3) {
        return (Float.floatToRawIntBits(f3) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32);
    }

    public static /* synthetic */ long b(long j2, float f2, int i2) {
        float intBitsToFloat = (i2 & 1) != 0 ? Float.intBitsToFloat((int) (j2 >> 32)) : 0.0f;
        if ((i2 & 2) != 0) {
            f2 = Float.intBitsToFloat((int) (j2 & 4294967295L));
        }
        return a(intBitsToFloat, f2);
    }

    public static final long c(long j2, float f2) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) / f2;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j2 & 4294967295L)) / f2;
        return (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
    }

    public static final boolean d(long j2, long j3) {
        return j2 == j3;
    }

    public static final float e(long j2) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j2 & 4294967295L));
        return (float) Math.sqrt((intBitsToFloat2 * intBitsToFloat2) + (intBitsToFloat * intBitsToFloat));
    }

    public static final float f(long j2) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j2 & 4294967295L));
        return (intBitsToFloat2 * intBitsToFloat2) + (intBitsToFloat * intBitsToFloat);
    }

    public static final float g(long j2) {
        return Float.intBitsToFloat((int) (j2 >> 32));
    }

    public static final float h(long j2) {
        return Float.intBitsToFloat((int) (j2 & 4294967295L));
    }

    public static final boolean i(long j2) {
        long j3 = j2 & 9223372034707292159L;
        return (((~j3) & (j3 - 9187343246269874177L)) & (-9223372034707292160L)) == -9223372034707292160L;
    }

    public static final long j(long j2, long j3) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) - Float.intBitsToFloat((int) (j3 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j2 & 4294967295L)) - Float.intBitsToFloat((int) (j3 & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
    }

    public static final long k(long j2, long j3) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat((int) (j2 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j3 & 4294967295L)) + Float.intBitsToFloat((int) (j2 & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }

    public static final long l(long j2, float f2) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) * f2;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j2 & 4294967295L)) * f2;
        return (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
    }

    public static String m(long j2) {
        if (!OffsetKt.c(j2)) {
            return "Offset.Unspecified";
        }
        return "Offset(" + GeometryUtilsKt.a(g(j2)) + ", " + GeometryUtilsKt.a(h(j2)) + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Offset) {
            return this.f14913a == ((Offset) obj).f14913a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f14913a);
    }

    public final String toString() {
        return m(this.f14913a);
    }
}
