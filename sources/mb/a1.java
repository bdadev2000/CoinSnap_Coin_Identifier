package mb;

import java.util.List;

/* loaded from: classes3.dex */
public final class a1 extends f2 {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final int f21831b;

    /* renamed from: c, reason: collision with root package name */
    public final List f21832c;

    public a1(String str, int i10, List list) {
        this.a = str;
        this.f21831b = i10;
        this.f21832c = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f2)) {
            return false;
        }
        f2 f2Var = (f2) obj;
        if (this.a.equals(((a1) f2Var).a)) {
            a1 a1Var = (a1) f2Var;
            if (this.f21831b == a1Var.f21831b && this.f21832c.equals(a1Var.f21832c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.f21831b) * 1000003) ^ this.f21832c.hashCode();
    }

    public final String toString() {
        return "Thread{name=" + this.a + ", importance=" + this.f21831b + ", frames=" + this.f21832c + "}";
    }
}
