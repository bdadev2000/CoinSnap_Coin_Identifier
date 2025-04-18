package androidx.compose.ui.text.style;

import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred
/* loaded from: classes.dex */
public final class LineHeightStyle {

    /* renamed from: c, reason: collision with root package name */
    public static final LineHeightStyle f17454c = new LineHeightStyle(Alignment.f17458b, 17);

    /* renamed from: a, reason: collision with root package name */
    public final float f17455a;

    /* renamed from: b, reason: collision with root package name */
    public final int f17456b;

    /* loaded from: classes.dex */
    public static final class Alignment {

        /* renamed from: a, reason: collision with root package name */
        public static final float f17457a;

        /* renamed from: b, reason: collision with root package name */
        public static final float f17458b;

        /* renamed from: c, reason: collision with root package name */
        public static final float f17459c;

        /* loaded from: classes.dex */
        public static final class Companion {
        }

        static {
            a(0.0f);
            a(0.5f);
            f17457a = 0.5f;
            a(-1.0f);
            f17458b = -1.0f;
            a(1.0f);
            f17459c = 1.0f;
        }

        public static void a(float f2) {
            if ((0.0f > f2 || f2 > 1.0f) && f2 != -1.0f) {
                throw new IllegalStateException("topRatio should be in [0..1] range or -1".toString());
            }
        }

        public static String b(float f2) {
            if (f2 == 0.0f) {
                return "LineHeightStyle.Alignment.Top";
            }
            if (f2 == f17457a) {
                return "LineHeightStyle.Alignment.Center";
            }
            if (f2 == f17458b) {
                return "LineHeightStyle.Alignment.Proportional";
            }
            if (f2 == f17459c) {
                return "LineHeightStyle.Alignment.Bottom";
            }
            return "LineHeightStyle.Alignment(topPercentage = " + f2 + ')';
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Alignment)) {
                return false;
            }
            ((Alignment) obj).getClass();
            return Float.compare(0.0f, 0.0f) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(0.0f);
        }

        public final String toString() {
            return b(0.0f);
        }
    }

    /* loaded from: classes.dex */
    public static final class Companion {
    }

    /* loaded from: classes.dex */
    public static final class Trim {

        /* loaded from: classes.dex */
        public static final class Companion {
        }

        public static String a(int i2) {
            return i2 == 1 ? "LineHeightStyle.Trim.FirstLineTop" : i2 == 16 ? "LineHeightStyle.Trim.LastLineBottom" : i2 == 17 ? "LineHeightStyle.Trim.Both" : i2 == 0 ? "LineHeightStyle.Trim.None" : "Invalid";
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Trim)) {
                return false;
            }
            ((Trim) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return Integer.hashCode(0);
        }

        public final String toString() {
            return a(0);
        }
    }

    public LineHeightStyle(float f2, int i2) {
        this.f17455a = f2;
        this.f17456b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LineHeightStyle)) {
            return false;
        }
        LineHeightStyle lineHeightStyle = (LineHeightStyle) obj;
        float f2 = lineHeightStyle.f17455a;
        float f3 = Alignment.f17457a;
        if (Float.compare(this.f17455a, f2) == 0) {
            if (this.f17456b == lineHeightStyle.f17456b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        float f2 = Alignment.f17457a;
        return Integer.hashCode(this.f17456b) + (Float.hashCode(this.f17455a) * 31);
    }

    public final String toString() {
        return "LineHeightStyle(alignment=" + ((Object) Alignment.b(this.f17455a)) + ", trim=" + ((Object) Trim.a(this.f17456b)) + ')';
    }
}
