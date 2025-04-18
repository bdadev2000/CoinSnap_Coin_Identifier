package mb;

import java.util.List;

/* loaded from: classes3.dex */
public final class s0 extends g2 {
    public final List a;

    /* renamed from: b, reason: collision with root package name */
    public final c2 f22090b;

    /* renamed from: c, reason: collision with root package name */
    public final u1 f22091c;

    /* renamed from: d, reason: collision with root package name */
    public final d2 f22092d;

    /* renamed from: e, reason: collision with root package name */
    public final List f22093e;

    public s0(List list, c2 c2Var, u1 u1Var, d2 d2Var, List list2) {
        this.a = list;
        this.f22090b = c2Var;
        this.f22091c = u1Var;
        this.f22092d = d2Var;
        this.f22093e = list2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g2)) {
            return false;
        }
        g2 g2Var = (g2) obj;
        List list = this.a;
        if (list != null ? list.equals(((s0) g2Var).a) : ((s0) g2Var).a == null) {
            c2 c2Var = this.f22090b;
            if (c2Var != null ? c2Var.equals(((s0) g2Var).f22090b) : ((s0) g2Var).f22090b == null) {
                u1 u1Var = this.f22091c;
                if (u1Var != null ? u1Var.equals(((s0) g2Var).f22091c) : ((s0) g2Var).f22091c == null) {
                    s0 s0Var = (s0) g2Var;
                    if (this.f22092d.equals(s0Var.f22092d) && this.f22093e.equals(s0Var.f22093e)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int i10 = 0;
        List list = this.a;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int i11 = (hashCode ^ 1000003) * 1000003;
        c2 c2Var = this.f22090b;
        if (c2Var == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = c2Var.hashCode();
        }
        int i12 = (i11 ^ hashCode2) * 1000003;
        u1 u1Var = this.f22091c;
        if (u1Var != null) {
            i10 = u1Var.hashCode();
        }
        return ((((i10 ^ i12) * 1000003) ^ this.f22092d.hashCode()) * 1000003) ^ this.f22093e.hashCode();
    }

    public final String toString() {
        return "Execution{threads=" + this.a + ", exception=" + this.f22090b + ", appExitInfo=" + this.f22091c + ", signal=" + this.f22092d + ", binaries=" + this.f22093e + "}";
    }
}
