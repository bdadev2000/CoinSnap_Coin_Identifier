package androidx.compose.ui.text.font;

/* loaded from: classes4.dex */
public final class FontStyle {

    /* renamed from: a, reason: collision with root package name */
    public final int f17260a;

    /* loaded from: classes4.dex */
    public static final class Companion {
    }

    public static final boolean a(int i2, int i3) {
        return i2 == i3;
    }

    public static String b(int i2) {
        return a(i2, 0) ? "Normal" : a(i2, 1) ? "Italic" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof FontStyle) {
            return this.f17260a == ((FontStyle) obj).f17260a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f17260a);
    }

    public final String toString() {
        return b(this.f17260a);
    }
}
