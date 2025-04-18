package androidx.compose.ui.unit;

import androidx.compose.runtime.Immutable;

@Immutable
/* loaded from: classes2.dex */
public final class IntSize {

    /* renamed from: a, reason: collision with root package name */
    public final long f17493a;

    /* loaded from: classes2.dex */
    public static final class Companion {
    }

    public static boolean a(long j2, Object obj) {
        return (obj instanceof IntSize) && j2 == ((IntSize) obj).f17493a;
    }

    public static final boolean b(long j2, long j3) {
        return j2 == j3;
    }

    public static final int c(long j2) {
        return (int) (j2 & 4294967295L);
    }

    public static final int d(long j2) {
        return (int) (j2 >> 32);
    }

    public static String e(long j2) {
        return ((int) (j2 >> 32)) + " x " + ((int) (j2 & 4294967295L));
    }

    public final boolean equals(Object obj) {
        return a(this.f17493a, obj);
    }

    public final int hashCode() {
        return Long.hashCode(this.f17493a);
    }

    public final String toString() {
        return e(this.f17493a);
    }
}
