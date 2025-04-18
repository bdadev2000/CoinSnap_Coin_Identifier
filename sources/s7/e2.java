package s7;

/* loaded from: classes3.dex */
public final class e2 {
    public final n9.g a;

    public e2(n9.g gVar) {
        this.a = gVar;
    }

    public final boolean a(int... iArr) {
        n9.g gVar = this.a;
        gVar.getClass();
        for (int i10 : iArr) {
            if (gVar.a.get(i10)) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e2)) {
            return false;
        }
        return this.a.equals(((e2) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
