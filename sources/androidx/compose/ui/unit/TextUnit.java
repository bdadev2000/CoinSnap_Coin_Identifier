package androidx.compose.ui.unit;

import androidx.compose.runtime.Immutable;

@Immutable
/* loaded from: classes.dex */
public final class TextUnit {

    /* renamed from: b, reason: collision with root package name */
    public static final TextUnitType[] f17498b = {new TextUnitType(0), new TextUnitType(4294967296L), new TextUnitType(8589934592L)};

    /* renamed from: c, reason: collision with root package name */
    public static final long f17499c = TextUnitKt.d(0, Float.NaN);

    /* renamed from: a, reason: collision with root package name */
    public final long f17500a;

    /* loaded from: classes.dex */
    public static final class Companion {
    }

    public static final boolean a(long j2, long j3) {
        return j2 == j3;
    }

    public static final long b(long j2) {
        return f17498b[(int) ((j2 & 1095216660480L) >>> 32)].f17501a;
    }

    public static final float c(long j2) {
        return Float.intBitsToFloat((int) (j2 & 4294967295L));
    }

    public static String d(long j2) {
        long b2 = b(j2);
        if (TextUnitType.a(b2, 0L)) {
            return "Unspecified";
        }
        if (TextUnitType.a(b2, 4294967296L)) {
            return c(j2) + ".sp";
        }
        if (!TextUnitType.a(b2, 8589934592L)) {
            return "Invalid";
        }
        return c(j2) + ".em";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof TextUnit) {
            return this.f17500a == ((TextUnit) obj).f17500a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f17500a);
    }

    public final String toString() {
        return d(this.f17500a);
    }
}
