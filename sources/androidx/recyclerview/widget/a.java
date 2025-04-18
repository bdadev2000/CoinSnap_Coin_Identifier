package androidx.recyclerview.widget;

/* loaded from: classes.dex */
public final class a {
    public int a;

    /* renamed from: b, reason: collision with root package name */
    public int f1855b;

    /* renamed from: c, reason: collision with root package name */
    public Object f1856c;

    /* renamed from: d, reason: collision with root package name */
    public int f1857d;

    public a(int i10, int i11, int i12, Object obj) {
        this.a = i10;
        this.f1855b = i11;
        this.f1857d = i12;
        this.f1856c = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        int i10 = this.a;
        if (i10 != aVar.a) {
            return false;
        }
        if (i10 == 8 && Math.abs(this.f1857d - this.f1855b) == 1 && this.f1857d == aVar.f1855b && this.f1855b == aVar.f1857d) {
            return true;
        }
        if (this.f1857d != aVar.f1857d || this.f1855b != aVar.f1855b) {
            return false;
        }
        Object obj2 = this.f1856c;
        if (obj2 != null) {
            if (!obj2.equals(aVar.f1856c)) {
                return false;
            }
        } else if (aVar.f1856c != null) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((this.a * 31) + this.f1855b) * 31) + this.f1857d;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("[");
        int i10 = this.a;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 4) {
                    if (i10 != 8) {
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
        sb2.append(str);
        sb2.append(",s:");
        sb2.append(this.f1855b);
        sb2.append("c:");
        sb2.append(this.f1857d);
        sb2.append(",p:");
        sb2.append(this.f1856c);
        sb2.append("]");
        return sb2.toString();
    }
}
