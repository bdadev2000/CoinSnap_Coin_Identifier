package androidx.compose.ui.text.style;

import androidx.compose.runtime.Immutable;
import p0.a;

@Immutable
/* loaded from: classes.dex */
public final class TextMotion {

    /* renamed from: c, reason: collision with root package name */
    public static final TextMotion f17477c = new TextMotion(false, 2);
    public static final TextMotion d = new TextMotion(true, 1);

    /* renamed from: a, reason: collision with root package name */
    public final int f17478a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f17479b;

    /* loaded from: classes.dex */
    public static final class Companion {
    }

    /* loaded from: classes.dex */
    public static final class Linearity {

        /* loaded from: classes.dex */
        public static final class Companion {
        }

        public static final boolean a(int i2, int i3) {
            return i2 == i3;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Linearity)) {
                return false;
            }
            ((Linearity) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return Integer.hashCode(0);
        }

        public final String toString() {
            return a(0, 1) ? "Linearity.Linear" : a(0, 2) ? "Linearity.FontHinting" : a(0, 3) ? "Linearity.None" : "Invalid";
        }
    }

    public TextMotion(boolean z2, int i2) {
        this.f17478a = i2;
        this.f17479b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextMotion)) {
            return false;
        }
        TextMotion textMotion = (TextMotion) obj;
        return Linearity.a(this.f17478a, textMotion.f17478a) && this.f17479b == textMotion.f17479b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f17479b) + (Integer.hashCode(this.f17478a) * 31);
    }

    public final String toString() {
        return a.g(this, f17477c) ? "TextMotion.Static" : a.g(this, d) ? "TextMotion.Animated" : "Invalid";
    }
}
