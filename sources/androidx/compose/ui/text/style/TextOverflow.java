package androidx.compose.ui.text.style;

/* loaded from: classes2.dex */
public final class TextOverflow {

    /* loaded from: classes2.dex */
    public static final class Companion {
    }

    public static final boolean a(int i2, int i3) {
        return i2 == i3;
    }

    public static String b(int i2) {
        return a(i2, 1) ? "Clip" : a(i2, 2) ? "Ellipsis" : a(i2, 3) ? "Visible" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof TextOverflow)) {
            return false;
        }
        ((TextOverflow) obj).getClass();
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(0);
    }

    public final String toString() {
        return b(0);
    }
}
