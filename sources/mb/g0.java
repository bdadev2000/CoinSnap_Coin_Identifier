package mb;

import java.util.List;

/* loaded from: classes3.dex */
public final class g0 extends x1 {
    public final List a;

    /* renamed from: b, reason: collision with root package name */
    public final String f21921b;

    public g0(List list, String str) {
        this.a = list;
        this.f21921b = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof x1)) {
            return false;
        }
        x1 x1Var = (x1) obj;
        if (this.a.equals(((g0) x1Var).a)) {
            String str = this.f21921b;
            if (str == null) {
                if (((g0) x1Var).f21921b == null) {
                    return true;
                }
            } else if (str.equals(((g0) x1Var).f21921b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.a.hashCode() ^ 1000003) * 1000003;
        String str = this.f21921b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 ^ hashCode;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FilesPayload{files=");
        sb2.append(this.a);
        sb2.append(", orgId=");
        return vd.e.h(sb2, this.f21921b, "}");
    }
}
