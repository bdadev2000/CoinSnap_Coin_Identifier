package androidx.compose.ui.text.font;

/* loaded from: classes3.dex */
public final class FontSynthesis {

    /* renamed from: a, reason: collision with root package name */
    public final int f17261a;

    /* loaded from: classes3.dex */
    public static final class Companion {
    }

    public static final boolean a(int i2, int i3) {
        return i2 == i3;
    }

    public static String b(int i2) {
        return a(i2, 0) ? "None" : a(i2, 1) ? "All" : a(i2, 2) ? "Weight" : a(i2, 3) ? "Style" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof FontSynthesis) {
            return this.f17261a == ((FontSynthesis) obj).f17261a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f17261a);
    }

    public final String toString() {
        return b(this.f17261a);
    }
}
