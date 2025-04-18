package androidx.compose.ui.text;

/* loaded from: classes.dex */
public final class PlaceholderVerticalAlign {

    /* loaded from: classes.dex */
    public static final class Companion {
    }

    public static final boolean a(int i2) {
        return i2 == 0;
    }

    public static String b() {
        return a(1) ? "AboveBaseline" : a(2) ? "Top" : a(3) ? "Bottom" : a(4) ? "Center" : a(5) ? "TextTop" : a(6) ? "TextBottom" : a(7) ? "TextCenter" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PlaceholderVerticalAlign)) {
            return false;
        }
        ((PlaceholderVerticalAlign) obj).getClass();
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(0);
    }

    public final String toString() {
        return b();
    }
}
