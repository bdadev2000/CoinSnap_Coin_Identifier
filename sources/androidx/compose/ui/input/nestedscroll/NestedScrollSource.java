package androidx.compose.ui.input.nestedscroll;

/* loaded from: classes.dex */
public final class NestedScrollSource {

    /* loaded from: classes.dex */
    public static final class Companion {
    }

    public static final boolean a(int i2, int i3) {
        return i2 == i3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof NestedScrollSource)) {
            return false;
        }
        ((NestedScrollSource) obj).getClass();
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(0);
    }

    public final String toString() {
        return a(0, 1) ? "UserInput" : a(0, 2) ? "SideEffect" : a(0, 3) ? "Relocate" : "Invalid";
    }
}
