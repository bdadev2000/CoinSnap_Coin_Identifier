package androidx.compose.ui.unit;

import androidx.compose.runtime.Immutable;

@Immutable
/* loaded from: classes2.dex */
public final class DpOffset {

    /* renamed from: a, reason: collision with root package name */
    public final long f17487a;

    /* loaded from: classes2.dex */
    public static final class Companion {
    }

    public static String a(long j2) {
        if (j2 == 9205357640488583168L) {
            return "DpOffset.Unspecified";
        }
        return "(" + ((Object) Dp.b(Float.intBitsToFloat((int) (j2 >> 32)))) + ", " + ((Object) Dp.b(Float.intBitsToFloat((int) (j2 & 4294967295L)))) + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof DpOffset) {
            return this.f17487a == ((DpOffset) obj).f17487a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f17487a);
    }

    public final String toString() {
        return a(this.f17487a);
    }
}
