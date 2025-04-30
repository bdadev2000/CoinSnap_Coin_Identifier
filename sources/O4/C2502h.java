package o4;

import x0.AbstractC2914a;

/* renamed from: o4.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2502h {

    /* renamed from: a, reason: collision with root package name */
    public final q f21960a;
    public final int b;

    /* renamed from: c, reason: collision with root package name */
    public final int f21961c;

    public C2502h(Class cls, int i9, int i10) {
        this(q.a(cls), i9, i10);
    }

    public static C2502h a(Class cls) {
        return new C2502h(cls, 0, 1);
    }

    public static C2502h b(Class cls) {
        return new C2502h(cls, 1, 0);
    }

    public static C2502h c(q qVar) {
        return new C2502h(qVar, 1, 0);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2502h)) {
            return false;
        }
        C2502h c2502h = (C2502h) obj;
        if (!this.f21960a.equals(c2502h.f21960a) || this.b != c2502h.b || this.f21961c != c2502h.f21961c) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((this.f21960a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.f21961c;
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.f21960a);
        sb.append(", type=");
        int i9 = this.b;
        if (i9 == 1) {
            str = "required";
        } else if (i9 == 0) {
            str = "optional";
        } else {
            str = "set";
        }
        sb.append(str);
        sb.append(", injection=");
        int i10 = this.f21961c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    str2 = "deferred";
                } else {
                    throw new AssertionError(com.mbridge.msdk.foundation.entity.o.h(i10, "Unsupported injection: "));
                }
            } else {
                str2 = "provider";
            }
        } else {
            str2 = "direct";
        }
        return AbstractC2914a.h(sb, str2, "}");
    }

    public C2502h(q qVar, int i9, int i10) {
        com.bumptech.glide.d.H(qVar, "Null dependency anInterface.");
        this.f21960a = qVar;
        this.b = i9;
        this.f21961c = i10;
    }
}
