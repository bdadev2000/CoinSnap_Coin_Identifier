package androidx.compose.ui.unit;

import androidx.compose.runtime.Immutable;

@Immutable
/* loaded from: classes3.dex */
public final class Dp implements Comparable<Dp> {

    /* renamed from: a, reason: collision with root package name */
    public final float f17486a;

    /* loaded from: classes3.dex */
    public static final class Companion {
    }

    public static final boolean a(float f2, float f3) {
        return Float.compare(f2, f3) == 0;
    }

    public static String b(float f2) {
        if (Float.isNaN(f2)) {
            return "Dp.Unspecified";
        }
        return f2 + ".dp";
    }

    @Override // java.lang.Comparable
    public final int compareTo(Dp dp) {
        return Float.compare(this.f17486a, dp.f17486a);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Dp) {
            return Float.compare(this.f17486a, ((Dp) obj).f17486a) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f17486a);
    }

    public final String toString() {
        return b(this.f17486a);
    }
}
