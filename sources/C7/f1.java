package c7;

/* loaded from: classes3.dex */
public final class f1 {
    public static final e1 Companion = new e1(null);
    private final i1 vungle;

    public /* synthetic */ f1(int i9, i1 i1Var, e8.g0 g0Var) {
        if (1 == (i9 & 1)) {
            this.vungle = i1Var;
        } else {
            e8.W.h(i9, 1, d1.INSTANCE.getDescriptor());
            throw null;
        }
    }

    public static /* synthetic */ f1 copy$default(f1 f1Var, i1 i1Var, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i1Var = f1Var.vungle;
        }
        return f1Var.copy(i1Var);
    }

    public static final void write$Self(f1 f1Var, d8.b bVar, c8.g gVar) {
        G7.j.e(f1Var, "self");
        G7.j.e(bVar, "output");
        G7.j.e(gVar, "serialDesc");
        bVar.m(gVar, 0, g1.INSTANCE, f1Var.vungle);
    }

    public final i1 component1() {
        return this.vungle;
    }

    public final f1 copy(i1 i1Var) {
        G7.j.e(i1Var, "vungle");
        return new f1(i1Var);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof f1) && G7.j.a(this.vungle, ((f1) obj).vungle)) {
            return true;
        }
        return false;
    }

    public final i1 getVungle() {
        return this.vungle;
    }

    public int hashCode() {
        return this.vungle.hashCode();
    }

    public String toString() {
        return "DeviceExt(vungle=" + this.vungle + ')';
    }

    public f1(i1 i1Var) {
        G7.j.e(i1Var, "vungle");
        this.vungle = i1Var;
    }
}
