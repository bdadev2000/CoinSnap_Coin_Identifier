package c7;

/* loaded from: classes3.dex */
public final class i1 {
    public static final h1 Companion = new h1(null);
    private final Y0 amazon;

    /* renamed from: android */
    private final Y0 f5419android;

    public i1() {
        this((Y0) null, (Y0) null, 3, (G7.f) null);
    }

    public static /* synthetic */ i1 copy$default(i1 i1Var, Y0 y02, Y0 y03, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            y02 = i1Var.f5419android;
        }
        if ((i9 & 2) != 0) {
            y03 = i1Var.amazon;
        }
        return i1Var.copy(y02, y03);
    }

    public static final void write$Self(i1 i1Var, d8.b bVar, c8.g gVar) {
        G7.j.e(i1Var, "self");
        if (Q7.n0.u(bVar, "output", gVar, "serialDesc", gVar) || i1Var.f5419android != null) {
            bVar.u(gVar, 0, W0.INSTANCE, i1Var.f5419android);
        }
        if (bVar.o(gVar) || i1Var.amazon != null) {
            bVar.u(gVar, 1, W0.INSTANCE, i1Var.amazon);
        }
    }

    public final Y0 component1() {
        return this.f5419android;
    }

    public final Y0 component2() {
        return this.amazon;
    }

    public final i1 copy(Y0 y02, Y0 y03) {
        return new i1(y02, y03);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj;
        if (G7.j.a(this.f5419android, i1Var.f5419android) && G7.j.a(this.amazon, i1Var.amazon)) {
            return true;
        }
        return false;
    }

    public final Y0 getAmazon() {
        return this.amazon;
    }

    public final Y0 getAndroid() {
        return this.f5419android;
    }

    public int hashCode() {
        int hashCode;
        Y0 y02 = this.f5419android;
        int i9 = 0;
        if (y02 == null) {
            hashCode = 0;
        } else {
            hashCode = y02.hashCode();
        }
        int i10 = hashCode * 31;
        Y0 y03 = this.amazon;
        if (y03 != null) {
            i9 = y03.hashCode();
        }
        return i10 + i9;
    }

    public String toString() {
        return "VungleExt(android=" + this.f5419android + ", amazon=" + this.amazon + ')';
    }

    public /* synthetic */ i1(int i9, Y0 y02, Y0 y03, e8.g0 g0Var) {
        if ((i9 & 1) == 0) {
            this.f5419android = null;
        } else {
            this.f5419android = y02;
        }
        if ((i9 & 2) == 0) {
            this.amazon = null;
        } else {
            this.amazon = y03;
        }
    }

    public i1(Y0 y02, Y0 y03) {
        this.f5419android = y02;
        this.amazon = y03;
    }

    public /* synthetic */ i1(Y0 y02, Y0 y03, int i9, G7.f fVar) {
        this((i9 & 1) != 0 ? null : y02, (i9 & 2) != 0 ? null : y03);
    }
}
