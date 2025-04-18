package androidx.compose.ui.text.style;

import androidx.compose.runtime.Immutable;

@Immutable
/* loaded from: classes.dex */
public final class LineBreak {

    /* renamed from: b, reason: collision with root package name */
    public static final int f17452b = 66305;

    /* renamed from: a, reason: collision with root package name */
    public final int f17453a;

    /* loaded from: classes.dex */
    public static final class Companion {
    }

    /* loaded from: classes.dex */
    public static final class Strategy {

        /* loaded from: classes.dex */
        public static final class Companion {
        }

        public static final boolean a(int i2, int i3) {
            return i2 == i3;
        }

        public static String b(int i2) {
            return a(i2, 1) ? "Strategy.Simple" : a(i2, 2) ? "Strategy.HighQuality" : a(i2, 3) ? "Strategy.Balanced" : a(i2, 0) ? "Strategy.Unspecified" : "Invalid";
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Strategy)) {
                return false;
            }
            ((Strategy) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return Integer.hashCode(0);
        }

        public final String toString() {
            return b(0);
        }
    }

    /* loaded from: classes.dex */
    public static final class Strictness {

        /* loaded from: classes.dex */
        public static final class Companion {
        }

        public static final boolean a(int i2, int i3) {
            return i2 == i3;
        }

        public static String b(int i2) {
            return a(i2, 1) ? "Strictness.None" : a(i2, 2) ? "Strictness.Loose" : a(i2, 3) ? "Strictness.Normal" : a(i2, 4) ? "Strictness.Strict" : a(i2, 0) ? "Strictness.Unspecified" : "Invalid";
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Strictness)) {
                return false;
            }
            ((Strictness) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return Integer.hashCode(0);
        }

        public final String toString() {
            return b(0);
        }
    }

    /* loaded from: classes.dex */
    public static final class WordBreak {

        /* loaded from: classes.dex */
        public static final class Companion {
        }

        public static String a(int i2) {
            return i2 == 1 ? "WordBreak.None" : i2 == 2 ? "WordBreak.Phrase" : i2 == 0 ? "WordBreak.Unspecified" : "Invalid";
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof WordBreak)) {
                return false;
            }
            ((WordBreak) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return Integer.hashCode(0);
        }

        public final String toString() {
            return a(0);
        }
    }

    public static String a(int i2) {
        return "LineBreak(strategy=" + ((Object) Strategy.b(i2 & 255)) + ", strictness=" + ((Object) Strictness.b((i2 >> 8) & 255)) + ", wordBreak=" + ((Object) WordBreak.a((i2 >> 16) & 255)) + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof LineBreak) {
            return this.f17453a == ((LineBreak) obj).f17453a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f17453a);
    }

    public final String toString() {
        return a(this.f17453a);
    }
}
