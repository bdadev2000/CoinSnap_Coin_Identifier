package w4;

import java.util.List;
import x0.AbstractC2914a;

/* loaded from: classes2.dex */
public final class H extends u0 {

    /* renamed from: a, reason: collision with root package name */
    public final List f23725a;
    public final String b;

    public H(List list, String str) {
        this.f23725a = list;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj;
        if (this.f23725a.equals(((H) u0Var).f23725a)) {
            String str = this.b;
            if (str == null) {
                if (((H) u0Var).b == null) {
                    return true;
                }
            } else if (str.equals(((H) u0Var).b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f23725a.hashCode() ^ 1000003) * 1000003;
        String str = this.b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 ^ hashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FilesPayload{files=");
        sb.append(this.f23725a);
        sb.append(", orgId=");
        return AbstractC2914a.h(sb, this.b, "}");
    }
}
