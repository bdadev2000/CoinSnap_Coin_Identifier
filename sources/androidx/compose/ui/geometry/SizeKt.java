package androidx.compose.ui.geometry;

/* loaded from: classes4.dex */
public final class SizeKt {
    public static final long a(float f2, float f3) {
        return (Float.floatToRawIntBits(f3) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32);
    }

    public static final long b(long j2) {
        if (j2 != 9205357640488583168L) {
            return OffsetKt.a(Float.intBitsToFloat((int) (j2 >> 32)) / 2.0f, Float.intBitsToFloat((int) (j2 & 4294967295L)) / 2.0f);
        }
        throw new IllegalStateException("Size is unspecified");
    }
}
