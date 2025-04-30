package q5;

import G7.j;
import u4.C2764i;

/* renamed from: q5.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2646a {

    /* renamed from: a, reason: collision with root package name */
    public final Y7.a f22788a;
    public C2764i b = null;

    public C2646a(Y7.d dVar) {
        this.f22788a = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2646a)) {
            return false;
        }
        C2646a c2646a = (C2646a) obj;
        if (j.a(this.f22788a, c2646a.f22788a) && j.a(this.b, c2646a.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.f22788a.hashCode() * 31;
        C2764i c2764i = this.b;
        if (c2764i == null) {
            hashCode = 0;
        } else {
            hashCode = c2764i.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "Dependency(mutex=" + this.f22788a + ", subscriber=" + this.b + ')';
    }
}
