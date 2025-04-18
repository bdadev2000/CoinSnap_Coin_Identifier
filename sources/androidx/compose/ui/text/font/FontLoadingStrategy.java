package androidx.compose.ui.text.font;

/* loaded from: classes2.dex */
public final class FontLoadingStrategy {

    /* loaded from: classes2.dex */
    public static final class Companion {
    }

    public static final boolean a(int i2, int i3) {
        return i2 == i3;
    }

    public static String b(int i2) {
        if (a(i2, 0)) {
            return "Blocking";
        }
        if (a(i2, 1)) {
            return "Optional";
        }
        if (a(i2, 2)) {
            return "Async";
        }
        return "Invalid(value=" + i2 + ')';
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof FontLoadingStrategy)) {
            return false;
        }
        ((FontLoadingStrategy) obj).getClass();
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(0);
    }

    public final String toString() {
        return b(0);
    }
}
