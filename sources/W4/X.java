package w4;

import java.util.List;

/* loaded from: classes2.dex */
public final class X extends C0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f23800a;
    public final int b;

    /* renamed from: c, reason: collision with root package name */
    public final List f23801c;

    public X(String str, int i9, List list) {
        this.f23800a = str;
        this.b = i9;
        this.f23801c = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0)) {
            return false;
        }
        C0 c02 = (C0) obj;
        if (this.f23800a.equals(((X) c02).f23800a)) {
            X x9 = (X) c02;
            if (this.b == x9.b && this.f23801c.equals(x9.f23801c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f23800a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.f23801c.hashCode();
    }

    public final String toString() {
        return "Thread{name=" + this.f23800a + ", importance=" + this.b + ", frames=" + this.f23801c + "}";
    }
}
