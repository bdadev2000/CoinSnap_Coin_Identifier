package androidx.compose.foundation.layout;

import org.objectweb.asm.signature.SignatureVisitor;

/* loaded from: classes3.dex */
public final class WindowInsetsSides {

    /* renamed from: a, reason: collision with root package name */
    public static final int f4221a = 9;

    /* renamed from: b, reason: collision with root package name */
    public static final int f4222b = 6;

    /* renamed from: c, reason: collision with root package name */
    public static final int f4223c = 10;
    public static final int d = 5;
    public static final int e = 15;

    /* renamed from: f, reason: collision with root package name */
    public static final int f4224f = 48;

    /* loaded from: classes3.dex */
    public static final class Companion {
    }

    public static final boolean a(int i2, int i3) {
        return i2 == i3;
    }

    public static String b(int i2) {
        StringBuilder sb = new StringBuilder("WindowInsetsSides(");
        StringBuilder sb2 = new StringBuilder();
        int i3 = f4221a;
        if ((i2 & i3) == i3) {
            c(sb2, "Start");
        }
        int i4 = f4223c;
        if ((i2 & i4) == i4) {
            c(sb2, "Left");
        }
        if ((i2 & 16) == 16) {
            c(sb2, "Top");
        }
        int i5 = f4222b;
        if ((i2 & i5) == i5) {
            c(sb2, "End");
        }
        int i6 = d;
        if ((i2 & i6) == i6) {
            c(sb2, "Right");
        }
        if ((i2 & 32) == 32) {
            c(sb2, "Bottom");
        }
        String sb3 = sb2.toString();
        p0.a.r(sb3, "StringBuilder().apply(builderAction).toString()");
        sb.append(sb3);
        sb.append(')');
        return sb.toString();
    }

    public static final void c(StringBuilder sb, String str) {
        if (sb.length() > 0) {
            sb.append(SignatureVisitor.EXTENDS);
        }
        sb.append(str);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof WindowInsetsSides)) {
            return false;
        }
        ((WindowInsetsSides) obj).getClass();
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(0);
    }

    public final String toString() {
        return b(0);
    }
}
