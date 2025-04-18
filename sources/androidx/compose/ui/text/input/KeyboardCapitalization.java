package androidx.compose.ui.text.input;

/* loaded from: classes2.dex */
public final class KeyboardCapitalization {

    /* renamed from: a, reason: collision with root package name */
    public final int f17341a;

    /* loaded from: classes2.dex */
    public static final class Companion {
    }

    public static final boolean a(int i2, int i3) {
        return i2 == i3;
    }

    public static String b(int i2) {
        return a(i2, -1) ? "Unspecified" : a(i2, 0) ? "None" : a(i2, 1) ? "Characters" : a(i2, 2) ? "Words" : a(i2, 3) ? "Sentences" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof KeyboardCapitalization) {
            return this.f17341a == ((KeyboardCapitalization) obj).f17341a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f17341a);
    }

    public final String toString() {
        return b(this.f17341a);
    }
}
