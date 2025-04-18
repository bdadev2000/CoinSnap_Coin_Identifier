package mb;

import java.util.List;

/* loaded from: classes3.dex */
public final class w0 extends c2 {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final String f22121b;

    /* renamed from: c, reason: collision with root package name */
    public final List f22122c;

    /* renamed from: d, reason: collision with root package name */
    public final c2 f22123d;

    /* renamed from: e, reason: collision with root package name */
    public final int f22124e;

    public w0(String str, String str2, List list, c2 c2Var, int i10) {
        this.a = str;
        this.f22121b = str2;
        this.f22122c = list;
        this.f22123d = c2Var;
        this.f22124e = i10;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c2)) {
            return false;
        }
        w0 w0Var = (w0) ((c2) obj);
        if (this.a.equals(w0Var.a) && ((str = this.f22121b) != null ? str.equals(w0Var.f22121b) : w0Var.f22121b == null)) {
            if (this.f22122c.equals(w0Var.f22122c)) {
                c2 c2Var = w0Var.f22123d;
                c2 c2Var2 = this.f22123d;
                if (c2Var2 != null ? c2Var2.equals(c2Var) : c2Var == null) {
                    if (this.f22124e == w0Var.f22124e) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.a.hashCode() ^ 1000003) * 1000003;
        int i10 = 0;
        String str = this.f22121b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode3 = (((hashCode2 ^ hashCode) * 1000003) ^ this.f22122c.hashCode()) * 1000003;
        c2 c2Var = this.f22123d;
        if (c2Var != null) {
            i10 = c2Var.hashCode();
        }
        return ((hashCode3 ^ i10) * 1000003) ^ this.f22124e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Exception{type=");
        sb2.append(this.a);
        sb2.append(", reason=");
        sb2.append(this.f22121b);
        sb2.append(", frames=");
        sb2.append(this.f22122c);
        sb2.append(", causedBy=");
        sb2.append(this.f22123d);
        sb2.append(", overflowCount=");
        return vd.e.g(sb2, this.f22124e, "}");
    }
}
