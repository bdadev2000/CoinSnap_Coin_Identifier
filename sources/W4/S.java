package w4;

import java.util.List;
import x0.AbstractC2914a;

/* loaded from: classes2.dex */
public final class S extends F0 {

    /* renamed from: a, reason: collision with root package name */
    public final D0 f23781a;
    public final List b;

    /* renamed from: c, reason: collision with root package name */
    public final List f23782c;

    /* renamed from: d, reason: collision with root package name */
    public final Boolean f23783d;

    /* renamed from: e, reason: collision with root package name */
    public final E0 f23784e;

    /* renamed from: f, reason: collision with root package name */
    public final List f23785f;

    /* renamed from: g, reason: collision with root package name */
    public final int f23786g;

    public S(T t9, List list, List list2, Boolean bool, E0 e02, List list3, int i9) {
        this.f23781a = t9;
        this.b = list;
        this.f23782c = list2;
        this.f23783d = bool;
        this.f23784e = e02;
        this.f23785f = list3;
        this.f23786g = i9;
    }

    public final boolean equals(Object obj) {
        List list;
        List list2;
        Boolean bool;
        E0 e02;
        List list3;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F0)) {
            return false;
        }
        F0 f0 = (F0) obj;
        if (this.f23781a.equals(((S) f0).f23781a) && ((list = this.b) != null ? list.equals(((S) f0).b) : ((S) f0).b == null) && ((list2 = this.f23782c) != null ? list2.equals(((S) f0).f23782c) : ((S) f0).f23782c == null) && ((bool = this.f23783d) != null ? bool.equals(((S) f0).f23783d) : ((S) f0).f23783d == null) && ((e02 = this.f23784e) != null ? e02.equals(((S) f0).f23784e) : ((S) f0).f23784e == null) && ((list3 = this.f23785f) != null ? list3.equals(((S) f0).f23785f) : ((S) f0).f23785f == null) && this.f23786g == ((S) f0).f23786g) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5 = (this.f23781a.hashCode() ^ 1000003) * 1000003;
        int i9 = 0;
        List list = this.b;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int i10 = (hashCode5 ^ hashCode) * 1000003;
        List list2 = this.f23782c;
        if (list2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = list2.hashCode();
        }
        int i11 = (i10 ^ hashCode2) * 1000003;
        Boolean bool = this.f23783d;
        if (bool == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = bool.hashCode();
        }
        int i12 = (i11 ^ hashCode3) * 1000003;
        E0 e02 = this.f23784e;
        if (e02 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = e02.hashCode();
        }
        int i13 = (i12 ^ hashCode4) * 1000003;
        List list3 = this.f23785f;
        if (list3 != null) {
            i9 = list3.hashCode();
        }
        return ((i13 ^ i9) * 1000003) ^ this.f23786g;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Application{execution=");
        sb.append(this.f23781a);
        sb.append(", customAttributes=");
        sb.append(this.b);
        sb.append(", internalKeys=");
        sb.append(this.f23782c);
        sb.append(", background=");
        sb.append(this.f23783d);
        sb.append(", currentProcessDetails=");
        sb.append(this.f23784e);
        sb.append(", appProcessDetails=");
        sb.append(this.f23785f);
        sb.append(", uiOrientation=");
        return AbstractC2914a.g(sb, this.f23786g, "}");
    }
}
