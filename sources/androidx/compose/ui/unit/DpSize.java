package androidx.compose.ui.unit;

import androidx.compose.runtime.Immutable;

@Immutable
/* loaded from: classes4.dex */
public final class DpSize {

    /* renamed from: a, reason: collision with root package name */
    public final long f17488a;

    /* loaded from: classes4.dex */
    public static final class Companion {
    }

    public static final float a(long j2) {
        return Float.intBitsToFloat((int) (j2 & 4294967295L));
    }

    public static final float b(long j2) {
        return Float.intBitsToFloat((int) (j2 >> 32));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof DpSize) {
            return this.f17488a == ((DpSize) obj).f17488a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f17488a);
    }

    public final String toString() {
        long j2 = this.f17488a;
        if (j2 == 9205357640488583168L) {
            return "DpSize.Unspecified";
        }
        return ((Object) Dp.b(b(j2))) + " x " + ((Object) Dp.b(a(j2)));
    }
}
