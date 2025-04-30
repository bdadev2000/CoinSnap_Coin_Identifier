package L;

import android.graphics.Insets;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: e, reason: collision with root package name */
    public static final e f1668e = new e(0, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f1669a;
    public final int b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1670c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1671d;

    public e(int i9, int i10, int i11, int i12) {
        this.f1669a = i9;
        this.b = i10;
        this.f1670c = i11;
        this.f1671d = i12;
    }

    public static e a(e eVar, e eVar2) {
        return b(Math.max(eVar.f1669a, eVar2.f1669a), Math.max(eVar.b, eVar2.b), Math.max(eVar.f1670c, eVar2.f1670c), Math.max(eVar.f1671d, eVar2.f1671d));
    }

    public static e b(int i9, int i10, int i11, int i12) {
        if (i9 == 0 && i10 == 0 && i11 == 0 && i12 == 0) {
            return f1668e;
        }
        return new e(i9, i10, i11, i12);
    }

    public static e c(Insets insets) {
        int i9;
        int i10;
        int i11;
        int i12;
        i9 = insets.left;
        i10 = insets.top;
        i11 = insets.right;
        i12 = insets.bottom;
        return b(i9, i10, i11, i12);
    }

    public final Insets d() {
        return d.a(this.f1669a, this.b, this.f1670c, this.f1671d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f1671d == eVar.f1671d && this.f1669a == eVar.f1669a && this.f1670c == eVar.f1670c && this.b == eVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.f1669a * 31) + this.b) * 31) + this.f1670c) * 31) + this.f1671d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Insets{left=");
        sb.append(this.f1669a);
        sb.append(", top=");
        sb.append(this.b);
        sb.append(", right=");
        sb.append(this.f1670c);
        sb.append(", bottom=");
        return com.mbridge.msdk.foundation.entity.o.l(sb, this.f1671d, '}');
    }
}
