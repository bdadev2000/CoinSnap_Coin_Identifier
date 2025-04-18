package androidx.compose.foundation.text.modifiers;

/* loaded from: classes3.dex */
public final class InlineDensity {

    /* renamed from: a, reason: collision with root package name */
    public static final long f6886a = a(Float.NaN, Float.NaN);

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f6887b = 0;

    /* loaded from: classes3.dex */
    public static final class Companion {
    }

    public static long a(float f2, float f3) {
        return (Float.floatToRawIntBits(f3) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32);
    }

    public static String b(long j2) {
        return "InlineDensity(density=" + Float.intBitsToFloat((int) (j2 >> 32)) + ", fontScale=" + Float.intBitsToFloat((int) (j2 & 4294967295L)) + ')';
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof InlineDensity)) {
            return false;
        }
        ((InlineDensity) obj).getClass();
        return true;
    }

    public final int hashCode() {
        return Long.hashCode(0L);
    }

    public final String toString() {
        return b(0L);
    }
}
