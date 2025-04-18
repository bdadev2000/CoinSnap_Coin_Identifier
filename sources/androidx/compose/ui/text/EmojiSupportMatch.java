package androidx.compose.ui.text;

/* loaded from: classes.dex */
public final class EmojiSupportMatch {

    /* renamed from: a, reason: collision with root package name */
    public final int f16904a;

    /* loaded from: classes.dex */
    public static final class Companion {
    }

    public static String a(int i2) {
        if (i2 == 0) {
            return "EmojiSupportMatch.Default";
        }
        if (i2 == 1) {
            return "EmojiSupportMatch.None";
        }
        if (i2 == 2) {
            return "EmojiSupportMatch.All";
        }
        return "Invalid(value=" + i2 + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof EmojiSupportMatch) {
            return this.f16904a == ((EmojiSupportMatch) obj).f16904a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f16904a);
    }

    public final String toString() {
        return a(this.f16904a);
    }
}
