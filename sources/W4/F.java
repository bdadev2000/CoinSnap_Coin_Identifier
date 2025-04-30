package w4;

import x0.AbstractC2914a;

/* loaded from: classes2.dex */
public final class F extends q0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f23722a;
    public final String b;

    /* renamed from: c, reason: collision with root package name */
    public final String f23723c;

    public F(String str, String str2, String str3) {
        this.f23722a = str;
        this.b = str2;
        this.f23723c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        if (this.f23722a.equals(((F) q0Var).f23722a)) {
            F f9 = (F) q0Var;
            if (this.b.equals(f9.b) && this.f23723c.equals(f9.f23723c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f23722a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.f23723c.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BuildIdMappingForArch{arch=");
        sb.append(this.f23722a);
        sb.append(", libraryName=");
        sb.append(this.b);
        sb.append(", buildId=");
        return AbstractC2914a.h(sb, this.f23723c, "}");
    }
}
