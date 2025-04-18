package androidx.compose.ui.unit;

import androidx.compose.runtime.Immutable;

@Immutable
/* loaded from: classes3.dex */
public final class Velocity {

    /* renamed from: a, reason: collision with root package name */
    public final long f17502a;

    /* loaded from: classes3.dex */
    public static final class Companion {
    }

    public static long a(long j2, float f2, float f3, int i2) {
        if ((i2 & 1) != 0) {
            f2 = Float.intBitsToFloat((int) (j2 >> 32));
        }
        if ((i2 & 2) != 0) {
            f3 = Float.intBitsToFloat((int) (j2 & 4294967295L));
        }
        return (Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(f3) & 4294967295L);
    }

    public static final float b(long j2) {
        return Float.intBitsToFloat((int) (j2 >> 32));
    }

    public static final float c(long j2) {
        return Float.intBitsToFloat((int) (j2 & 4294967295L));
    }

    public static final long d(long j2, long j3) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) - Float.intBitsToFloat((int) (j3 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j2 & 4294967295L)) - Float.intBitsToFloat((int) (j3 & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
    }

    public static final long e(long j2, long j3) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat((int) (j2 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j3 & 4294967295L)) + Float.intBitsToFloat((int) (j2 & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }

    public static final long f(long j2, float f2) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) * f2;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j2 & 4294967295L)) * f2;
        return (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
    }

    public static String g(long j2) {
        return "(" + b(j2) + ", " + c(j2) + ") px/sec";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Velocity) {
            return this.f17502a == ((Velocity) obj).f17502a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f17502a);
    }

    public final String toString() {
        return g(this.f17502a);
    }
}
