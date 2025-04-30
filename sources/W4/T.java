package w4;

import java.util.List;

/* loaded from: classes2.dex */
public final class T extends D0 {

    /* renamed from: a, reason: collision with root package name */
    public final List f23787a;
    public final z0 b;

    /* renamed from: c, reason: collision with root package name */
    public final r0 f23788c;

    /* renamed from: d, reason: collision with root package name */
    public final A0 f23789d;

    /* renamed from: e, reason: collision with root package name */
    public final List f23790e;

    public T(List list, V v6, r0 r0Var, W w2, List list2) {
        this.f23787a = list;
        this.b = v6;
        this.f23788c = r0Var;
        this.f23789d = w2;
        this.f23790e = list2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof D0)) {
            return false;
        }
        D0 d02 = (D0) obj;
        List list = this.f23787a;
        if (list != null ? list.equals(((T) d02).f23787a) : ((T) d02).f23787a == null) {
            z0 z0Var = this.b;
            if (z0Var != null ? z0Var.equals(((T) d02).b) : ((T) d02).b == null) {
                r0 r0Var = this.f23788c;
                if (r0Var != null ? r0Var.equals(((T) d02).f23788c) : ((T) d02).f23788c == null) {
                    if (this.f23789d.equals(((T) d02).f23789d) && this.f23790e.equals(((T) d02).f23790e)) {
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
        int i9 = 0;
        List list = this.f23787a;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int i10 = (hashCode ^ 1000003) * 1000003;
        z0 z0Var = this.b;
        if (z0Var == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = z0Var.hashCode();
        }
        int i11 = (i10 ^ hashCode2) * 1000003;
        r0 r0Var = this.f23788c;
        if (r0Var != null) {
            i9 = r0Var.hashCode();
        }
        return ((((i9 ^ i11) * 1000003) ^ this.f23789d.hashCode()) * 1000003) ^ this.f23790e.hashCode();
    }

    public final String toString() {
        return "Execution{threads=" + this.f23787a + ", exception=" + this.b + ", appExitInfo=" + this.f23788c + ", signal=" + this.f23789d + ", binaries=" + this.f23790e + "}";
    }
}
