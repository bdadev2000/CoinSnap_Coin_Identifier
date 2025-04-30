package t7;

import java.io.Serializable;

/* renamed from: t7.n, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2725n implements Serializable {
    public final Object b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f23026c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f23027d;

    public C2725n(Object obj, Object obj2, Object obj3) {
        this.b = obj;
        this.f23026c = obj2;
        this.f23027d = obj3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2725n)) {
            return false;
        }
        C2725n c2725n = (C2725n) obj;
        if (G7.j.a(this.b, c2725n.b) && G7.j.a(this.f23026c, c2725n.f23026c) && G7.j.a(this.f23027d, c2725n.f23027d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int i9 = 0;
        Object obj = this.b;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i10 = hashCode * 31;
        Object obj2 = this.f23026c;
        if (obj2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = obj2.hashCode();
        }
        int i11 = (i10 + hashCode2) * 31;
        Object obj3 = this.f23027d;
        if (obj3 != null) {
            i9 = obj3.hashCode();
        }
        return i11 + i9;
    }

    public final String toString() {
        return "(" + this.b + ", " + this.f23026c + ", " + this.f23027d + ')';
    }
}
