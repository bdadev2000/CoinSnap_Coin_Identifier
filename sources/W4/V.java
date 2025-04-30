package w4;

import java.util.List;
import x0.AbstractC2914a;

/* loaded from: classes2.dex */
public final class V extends z0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f23794a;
    public final String b;

    /* renamed from: c, reason: collision with root package name */
    public final List f23795c;

    /* renamed from: d, reason: collision with root package name */
    public final z0 f23796d;

    /* renamed from: e, reason: collision with root package name */
    public final int f23797e;

    public V(String str, String str2, List list, z0 z0Var, int i9) {
        this.f23794a = str;
        this.b = str2;
        this.f23795c = list;
        this.f23796d = z0Var;
        this.f23797e = i9;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof z0)) {
            return false;
        }
        z0 z0Var = (z0) obj;
        if (this.f23794a.equals(((V) z0Var).f23794a) && ((str = this.b) != null ? str.equals(((V) z0Var).b) : ((V) z0Var).b == null)) {
            V v6 = (V) z0Var;
            if (this.f23795c.equals(v6.f23795c)) {
                z0 z0Var2 = v6.f23796d;
                z0 z0Var3 = this.f23796d;
                if (z0Var3 != null ? z0Var3.equals(z0Var2) : z0Var2 == null) {
                    if (this.f23797e == v6.f23797e) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f23794a.hashCode() ^ 1000003) * 1000003;
        int i9 = 0;
        String str = this.b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode3 = (((hashCode2 ^ hashCode) * 1000003) ^ this.f23795c.hashCode()) * 1000003;
        z0 z0Var = this.f23796d;
        if (z0Var != null) {
            i9 = z0Var.hashCode();
        }
        return ((hashCode3 ^ i9) * 1000003) ^ this.f23797e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Exception{type=");
        sb.append(this.f23794a);
        sb.append(", reason=");
        sb.append(this.b);
        sb.append(", frames=");
        sb.append(this.f23795c);
        sb.append(", causedBy=");
        sb.append(this.f23796d);
        sb.append(", overflowCount=");
        return AbstractC2914a.g(sb, this.f23797e, "}");
    }
}
