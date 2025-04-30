package t7;

import java.io.Serializable;

/* renamed from: t7.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2720i implements Serializable {
    public final Object b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f23021c;

    public C2720i(Object obj, Object obj2) {
        this.b = obj;
        this.f23021c = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2720i)) {
            return false;
        }
        C2720i c2720i = (C2720i) obj;
        if (G7.j.a(this.b, c2720i.b) && G7.j.a(this.f23021c, c2720i.f23021c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i9 = 0;
        Object obj = this.b;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i10 = hashCode * 31;
        Object obj2 = this.f23021c;
        if (obj2 != null) {
            i9 = obj2.hashCode();
        }
        return i10 + i9;
    }

    public final String toString() {
        return "(" + this.b + ", " + this.f23021c + ')';
    }
}
