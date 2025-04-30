package c7;

/* renamed from: c7.g0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0629g0 {
    public static final C0627f0 Companion = new C0627f0(null);
    private P ccpa;
    private T coppa;
    private X gdpr;

    public C0629g0() {
        this((X) null, (P) null, (T) null, 7, (G7.f) null);
    }

    public static /* synthetic */ C0629g0 copy$default(C0629g0 c0629g0, X x9, P p2, T t9, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            x9 = c0629g0.gdpr;
        }
        if ((i9 & 2) != 0) {
            p2 = c0629g0.ccpa;
        }
        if ((i9 & 4) != 0) {
            t9 = c0629g0.coppa;
        }
        return c0629g0.copy(x9, p2, t9);
    }

    public static final void write$Self(C0629g0 c0629g0, d8.b bVar, c8.g gVar) {
        G7.j.e(c0629g0, "self");
        if (Q7.n0.u(bVar, "output", gVar, "serialDesc", gVar) || c0629g0.gdpr != null) {
            bVar.u(gVar, 0, V.INSTANCE, c0629g0.gdpr);
        }
        if (bVar.o(gVar) || c0629g0.ccpa != null) {
            bVar.u(gVar, 1, N.INSTANCE, c0629g0.ccpa);
        }
        if (bVar.o(gVar) || c0629g0.coppa != null) {
            bVar.u(gVar, 2, Q.INSTANCE, c0629g0.coppa);
        }
    }

    public final X component1() {
        return this.gdpr;
    }

    public final P component2() {
        return this.ccpa;
    }

    public final T component3() {
        return this.coppa;
    }

    public final C0629g0 copy(X x9, P p2, T t9) {
        return new C0629g0(x9, p2, t9);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0629g0)) {
            return false;
        }
        C0629g0 c0629g0 = (C0629g0) obj;
        if (G7.j.a(this.gdpr, c0629g0.gdpr) && G7.j.a(this.ccpa, c0629g0.ccpa) && G7.j.a(this.coppa, c0629g0.coppa)) {
            return true;
        }
        return false;
    }

    public final P getCcpa() {
        return this.ccpa;
    }

    public final T getCoppa() {
        return this.coppa;
    }

    public final X getGdpr() {
        return this.gdpr;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        X x9 = this.gdpr;
        int i9 = 0;
        if (x9 == null) {
            hashCode = 0;
        } else {
            hashCode = x9.hashCode();
        }
        int i10 = hashCode * 31;
        P p2 = this.ccpa;
        if (p2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = p2.hashCode();
        }
        int i11 = (i10 + hashCode2) * 31;
        T t9 = this.coppa;
        if (t9 != null) {
            i9 = t9.hashCode();
        }
        return i11 + i9;
    }

    public final void setCcpa(P p2) {
        this.ccpa = p2;
    }

    public final void setCoppa(T t9) {
        this.coppa = t9;
    }

    public final void setGdpr(X x9) {
        this.gdpr = x9;
    }

    public String toString() {
        return "User(gdpr=" + this.gdpr + ", ccpa=" + this.ccpa + ", coppa=" + this.coppa + ')';
    }

    public /* synthetic */ C0629g0(int i9, X x9, P p2, T t9, e8.g0 g0Var) {
        if ((i9 & 1) == 0) {
            this.gdpr = null;
        } else {
            this.gdpr = x9;
        }
        if ((i9 & 2) == 0) {
            this.ccpa = null;
        } else {
            this.ccpa = p2;
        }
        if ((i9 & 4) == 0) {
            this.coppa = null;
        } else {
            this.coppa = t9;
        }
    }

    public C0629g0(X x9, P p2, T t9) {
        this.gdpr = x9;
        this.ccpa = p2;
        this.coppa = t9;
    }

    public /* synthetic */ C0629g0(X x9, P p2, T t9, int i9, G7.f fVar) {
        this((i9 & 1) != 0 ? null : x9, (i9 & 2) != 0 ? null : p2, (i9 & 4) != 0 ? null : t9);
    }
}
