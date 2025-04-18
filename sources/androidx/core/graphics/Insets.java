package androidx.core.graphics;

import android.support.v4.media.d;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

/* loaded from: classes3.dex */
public final class Insets {
    public static final Insets e = new Insets(0, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f18533a;

    /* renamed from: b, reason: collision with root package name */
    public final int f18534b;

    /* renamed from: c, reason: collision with root package name */
    public final int f18535c;
    public final int d;

    @RequiresApi
    /* loaded from: classes3.dex */
    public static class Api29Impl {
        @DoNotInline
        public static android.graphics.Insets a(int i2, int i3, int i4, int i5) {
            return android.graphics.Insets.of(i2, i3, i4, i5);
        }
    }

    public Insets(int i2, int i3, int i4, int i5) {
        this.f18533a = i2;
        this.f18534b = i3;
        this.f18535c = i4;
        this.d = i5;
    }

    public static Insets a(Insets insets, Insets insets2) {
        return b(Math.max(insets.f18533a, insets2.f18533a), Math.max(insets.f18534b, insets2.f18534b), Math.max(insets.f18535c, insets2.f18535c), Math.max(insets.d, insets2.d));
    }

    public static Insets b(int i2, int i3, int i4, int i5) {
        return (i2 == 0 && i3 == 0 && i4 == 0 && i5 == 0) ? e : new Insets(i2, i3, i4, i5);
    }

    public static Insets c(android.graphics.Insets insets) {
        int i2;
        int i3;
        int i4;
        int i5;
        i2 = insets.left;
        i3 = insets.top;
        i4 = insets.right;
        i5 = insets.bottom;
        return b(i2, i3, i4, i5);
    }

    public final android.graphics.Insets d() {
        return Api29Impl.a(this.f18533a, this.f18534b, this.f18535c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Insets.class != obj.getClass()) {
            return false;
        }
        Insets insets = (Insets) obj;
        return this.d == insets.d && this.f18533a == insets.f18533a && this.f18535c == insets.f18535c && this.f18534b == insets.f18534b;
    }

    public final int hashCode() {
        return (((((this.f18533a * 31) + this.f18534b) * 31) + this.f18535c) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Insets{left=");
        sb.append(this.f18533a);
        sb.append(", top=");
        sb.append(this.f18534b);
        sb.append(", right=");
        sb.append(this.f18535c);
        sb.append(", bottom=");
        return d.o(sb, this.d, '}');
    }
}
