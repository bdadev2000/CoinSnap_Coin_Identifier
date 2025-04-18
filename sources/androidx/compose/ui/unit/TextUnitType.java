package androidx.compose.ui.unit;

/* loaded from: classes2.dex */
public final class TextUnitType {

    /* renamed from: a, reason: collision with root package name */
    public final long f17501a;

    /* loaded from: classes2.dex */
    public static final class Companion {
    }

    public static final boolean a(long j2, long j3) {
        return j2 == j3;
    }

    public static String b(long j2) {
        return a(j2, 0L) ? "Unspecified" : a(j2, 4294967296L) ? "Sp" : a(j2, 8589934592L) ? "Em" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof TextUnitType) {
            return this.f17501a == ((TextUnitType) obj).f17501a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f17501a);
    }

    public final String toString() {
        return b(this.f17501a);
    }
}
