package androidx.compose.ui.text.style;

/* loaded from: classes3.dex */
public final class TextAlign {

    /* renamed from: a, reason: collision with root package name */
    public final int f17463a;

    /* loaded from: classes3.dex */
    public static final class Companion {
    }

    public static final boolean a(int i2, int i3) {
        return i2 == i3;
    }

    public static String b(int i2) {
        return a(i2, 1) ? "Left" : a(i2, 2) ? "Right" : a(i2, 3) ? "Center" : a(i2, 4) ? "Justify" : a(i2, 5) ? "Start" : a(i2, 6) ? "End" : a(i2, Integer.MIN_VALUE) ? "Unspecified" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof TextAlign) {
            return this.f17463a == ((TextAlign) obj).f17463a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f17463a);
    }

    public final String toString() {
        return b(this.f17463a);
    }
}
