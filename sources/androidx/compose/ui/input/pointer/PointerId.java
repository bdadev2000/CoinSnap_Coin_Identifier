package androidx.compose.ui.input.pointer;

/* loaded from: classes2.dex */
public final class PointerId {

    /* renamed from: a, reason: collision with root package name */
    public final long f15588a;

    public static final boolean a(long j2, long j3) {
        return j2 == j3;
    }

    public static String b(long j2) {
        return "PointerId(value=" + j2 + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof PointerId) {
            return this.f15588a == ((PointerId) obj).f15588a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f15588a);
    }

    public final String toString() {
        return b(this.f15588a);
    }
}
