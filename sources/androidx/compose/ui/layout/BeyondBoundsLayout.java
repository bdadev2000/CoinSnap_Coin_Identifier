package androidx.compose.ui.layout;

import q0.l;

/* loaded from: classes.dex */
public interface BeyondBoundsLayout {

    /* loaded from: classes.dex */
    public interface BeyondBoundsScope {
        boolean a();
    }

    /* loaded from: classes.dex */
    public static final class LayoutDirection {

        /* loaded from: classes.dex */
        public static final class Companion {
        }

        public static final boolean a(int i2, int i3) {
            return i2 == i3;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof LayoutDirection)) {
                return false;
            }
            ((LayoutDirection) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return Integer.hashCode(0);
        }

        public final String toString() {
            return a(0, 1) ? "Before" : a(0, 2) ? "After" : a(0, 3) ? "Left" : a(0, 4) ? "Right" : a(0, 5) ? "Above" : a(0, 6) ? "Below" : "invalid LayoutDirection";
        }
    }

    Object a(int i2, l lVar);
}
