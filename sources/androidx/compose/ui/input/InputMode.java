package androidx.compose.ui.input;

/* loaded from: classes.dex */
public final class InputMode {

    /* renamed from: a, reason: collision with root package name */
    public final int f15498a;

    /* loaded from: classes.dex */
    public static final class Companion {
    }

    public final boolean equals(Object obj) {
        if (obj instanceof InputMode) {
            return this.f15498a == ((InputMode) obj).f15498a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f15498a);
    }

    public final String toString() {
        int i2 = this.f15498a;
        return i2 == 1 ? "Touch" : i2 == 2 ? "Keyboard" : "Error";
    }
}
