package androidx.compose.ui.focus;

/* loaded from: classes2.dex */
public final class FocusDirection {

    /* renamed from: a, reason: collision with root package name */
    public final int f14833a;

    /* loaded from: classes2.dex */
    public static final class Companion {
    }

    public static final boolean a(int i2, int i3) {
        return i2 == i3;
    }

    public static String b(int i2) {
        return a(i2, 1) ? "Next" : a(i2, 2) ? "Previous" : a(i2, 3) ? "Left" : a(i2, 4) ? "Right" : a(i2, 5) ? "Up" : a(i2, 6) ? "Down" : a(i2, 7) ? "Enter" : a(i2, 8) ? "Exit" : "Invalid FocusDirection";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof FocusDirection) {
            return this.f14833a == ((FocusDirection) obj).f14833a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f14833a);
    }

    public final String toString() {
        return b(this.f14833a);
    }
}
