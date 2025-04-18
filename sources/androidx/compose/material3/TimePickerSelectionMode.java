package androidx.compose.material3;

@ExperimentalMaterial3Api
/* loaded from: classes3.dex */
public final class TimePickerSelectionMode {

    /* renamed from: a, reason: collision with root package name */
    public final int f12500a;

    /* loaded from: classes3.dex */
    public static final class Companion {
    }

    public static final boolean a(int i2, int i3) {
        return i2 == i3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof TimePickerSelectionMode) {
            return this.f12500a == ((TimePickerSelectionMode) obj).f12500a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f12500a);
    }

    public final String toString() {
        int i2 = this.f12500a;
        return a(i2, 0) ? "Hour" : a(i2, 1) ? "Minute" : "";
    }
}
