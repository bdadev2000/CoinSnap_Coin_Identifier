package n9;

import v8.u0;

/* loaded from: classes3.dex */
public final class y {

    /* renamed from: c, reason: collision with root package name */
    public static final y f22601c = new y(-1, -1);
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final int f22602b;

    static {
        new y(0, 0);
    }

    public y(int i10, int i11) {
        boolean z10;
        if ((i10 != -1 && i10 < 0) || (i11 != -1 && i11 < 0)) {
            z10 = false;
        } else {
            z10 = true;
        }
        u0.d(z10);
        this.a = i10;
        this.f22602b = i11;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        if (this.a != yVar.a || this.f22602b != yVar.f22602b) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i10 = this.a;
        return ((i10 >>> 16) | (i10 << 16)) ^ this.f22602b;
    }

    public final String toString() {
        return this.a + "x" + this.f22602b;
    }
}
