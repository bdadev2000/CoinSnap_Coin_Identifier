package androidx.recyclerview.widget;

/* renamed from: androidx.recyclerview.widget.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0516a {

    /* renamed from: a, reason: collision with root package name */
    public int f4950a;
    public int b;

    /* renamed from: c, reason: collision with root package name */
    public Object f4951c;

    /* renamed from: d, reason: collision with root package name */
    public int f4952d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0516a)) {
            return false;
        }
        C0516a c0516a = (C0516a) obj;
        int i9 = this.f4950a;
        if (i9 != c0516a.f4950a) {
            return false;
        }
        if (i9 == 8 && Math.abs(this.f4952d - this.b) == 1 && this.f4952d == c0516a.b && this.b == c0516a.f4952d) {
            return true;
        }
        if (this.f4952d != c0516a.f4952d || this.b != c0516a.b) {
            return false;
        }
        Object obj2 = this.f4951c;
        if (obj2 != null) {
            if (!obj2.equals(c0516a.f4951c)) {
                return false;
            }
        } else if (c0516a.f4951c != null) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((this.f4950a * 31) + this.b) * 31) + this.f4952d;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[");
        int i9 = this.f4950a;
        if (i9 != 1) {
            if (i9 != 2) {
                if (i9 != 4) {
                    if (i9 != 8) {
                        str = "??";
                    } else {
                        str = "mv";
                    }
                } else {
                    str = "up";
                }
            } else {
                str = "rm";
            }
        } else {
            str = "add";
        }
        sb.append(str);
        sb.append(",s:");
        sb.append(this.b);
        sb.append("c:");
        sb.append(this.f4952d);
        sb.append(",p:");
        sb.append(this.f4951c);
        sb.append("]");
        return sb.toString();
    }
}
