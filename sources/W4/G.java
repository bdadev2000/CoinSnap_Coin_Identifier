package w4;

import x0.AbstractC2914a;

/* loaded from: classes2.dex */
public final class G extends s0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f23724a;
    public final String b;

    public G(String str, String str2) {
        this.f23724a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj;
        if (this.f23724a.equals(((G) s0Var).f23724a) && this.b.equals(((G) s0Var).b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f23724a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CustomAttribute{key=");
        sb.append(this.f23724a);
        sb.append(", value=");
        return AbstractC2914a.h(sb, this.b, "}");
    }
}
