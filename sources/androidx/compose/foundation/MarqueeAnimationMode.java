package androidx.compose.foundation;

/* loaded from: classes3.dex */
public final class MarqueeAnimationMode {

    /* renamed from: a, reason: collision with root package name */
    public final int f2786a = 0;

    /* loaded from: classes3.dex */
    public static final class Companion {
    }

    public static String a(int i2) {
        if (i2 == 0) {
            return "Immediately";
        }
        if (i2 == 1) {
            return "WhileFocused";
        }
        throw new IllegalStateException(("invalid value: " + i2).toString());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof MarqueeAnimationMode) {
            return this.f2786a == ((MarqueeAnimationMode) obj).f2786a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f2786a);
    }

    public final String toString() {
        return a(this.f2786a);
    }
}
