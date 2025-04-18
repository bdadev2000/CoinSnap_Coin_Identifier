package androidx.compose.ui.text.input;

/* loaded from: classes.dex */
public final class KeyboardType {

    /* renamed from: a, reason: collision with root package name */
    public final int f17342a;

    /* loaded from: classes.dex */
    public static final class Companion {
    }

    public static final boolean a(int i2, int i3) {
        return i2 == i3;
    }

    public static String b(int i2) {
        return a(i2, 0) ? "Unspecified" : a(i2, 1) ? "Text" : a(i2, 2) ? "Ascii" : a(i2, 3) ? "Number" : a(i2, 4) ? "Phone" : a(i2, 5) ? "Uri" : a(i2, 6) ? "Email" : a(i2, 7) ? "Password" : a(i2, 8) ? "NumberPassword" : a(i2, 9) ? "Decimal" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof KeyboardType) {
            return this.f17342a == ((KeyboardType) obj).f17342a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f17342a);
    }

    public final String toString() {
        return b(this.f17342a);
    }
}
