package androidx.compose.ui.text.style;

/* loaded from: classes2.dex */
public final class Hyphens {

    /* renamed from: a, reason: collision with root package name */
    public final int f17451a;

    /* loaded from: classes2.dex */
    public static final class Companion {
    }

    public static final boolean a(int i2, int i3) {
        return i2 == i3;
    }

    public static String b(int i2) {
        return a(i2, 1) ? "Hyphens.None" : a(i2, 2) ? "Hyphens.Auto" : a(i2, Integer.MIN_VALUE) ? "Hyphens.Unspecified" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Hyphens) {
            return this.f17451a == ((Hyphens) obj).f17451a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f17451a);
    }

    public final String toString() {
        return b(this.f17451a);
    }
}
