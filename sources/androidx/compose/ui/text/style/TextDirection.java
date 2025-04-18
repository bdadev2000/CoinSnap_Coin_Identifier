package androidx.compose.ui.text.style;

/* loaded from: classes4.dex */
public final class TextDirection {

    /* renamed from: a, reason: collision with root package name */
    public final int f17467a;

    /* loaded from: classes4.dex */
    public static final class Companion {
    }

    public static final boolean a(int i2, int i3) {
        return i2 == i3;
    }

    public static String b(int i2) {
        return a(i2, 1) ? "Ltr" : a(i2, 2) ? "Rtl" : a(i2, 3) ? "Content" : a(i2, 4) ? "ContentOrLtr" : a(i2, 5) ? "ContentOrRtl" : a(i2, Integer.MIN_VALUE) ? "Unspecified" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof TextDirection) {
            return this.f17467a == ((TextDirection) obj).f17467a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f17467a);
    }

    public final String toString() {
        return b(this.f17467a);
    }
}
