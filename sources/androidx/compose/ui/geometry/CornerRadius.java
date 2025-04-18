package androidx.compose.ui.geometry;

import androidx.compose.runtime.Immutable;

@Immutable
/* loaded from: classes2.dex */
public final class CornerRadius {

    /* renamed from: a, reason: collision with root package name */
    public static final long f14908a = CornerRadiusKt.a(0.0f, 0.0f);

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f14909b = 0;

    /* loaded from: classes2.dex */
    public static final class Companion {
    }

    public static final boolean a(long j2, long j3) {
        return j2 == j3;
    }

    public static final float b(long j2) {
        return Float.intBitsToFloat((int) (j2 >> 32));
    }

    public static final float c(long j2) {
        return Float.intBitsToFloat((int) (j2 & 4294967295L));
    }

    public static String d(long j2) {
        if (b(j2) == c(j2)) {
            return "CornerRadius.circular(" + GeometryUtilsKt.a(b(j2)) + ')';
        }
        return "CornerRadius.elliptical(" + GeometryUtilsKt.a(b(j2)) + ", " + GeometryUtilsKt.a(c(j2)) + ')';
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof CornerRadius)) {
            return false;
        }
        ((CornerRadius) obj).getClass();
        return true;
    }

    public final int hashCode() {
        return Long.hashCode(0L);
    }

    public final String toString() {
        return d(0L);
    }
}
