package db;

/* loaded from: classes3.dex */
public final class j {
    public final s a;

    /* renamed from: b, reason: collision with root package name */
    public final int f16956b;

    /* renamed from: c, reason: collision with root package name */
    public final int f16957c;

    public j(Class cls, int i10, int i11) {
        this(s.a(cls), i10, i11);
    }

    public static j a(s sVar) {
        return new j(sVar, 1, 0);
    }

    public static j b(Class cls) {
        return new j(cls, 1, 0);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (!this.a.equals(jVar.a) || this.f16956b != jVar.f16956b || this.f16957c != jVar.f16957c) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.f16956b) * 1000003) ^ this.f16957c;
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb2 = new StringBuilder("Dependency{anInterface=");
        sb2.append(this.a);
        sb2.append(", type=");
        int i10 = this.f16956b;
        if (i10 == 1) {
            str = "required";
        } else if (i10 == 0) {
            str = "optional";
        } else {
            str = "set";
        }
        sb2.append(str);
        sb2.append(", injection=");
        int i11 = this.f16957c;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    str2 = "deferred";
                } else {
                    throw new AssertionError(eb.j.i("Unsupported injection: ", i11));
                }
            } else {
                str2 = "provider";
            }
        } else {
            str2 = "direct";
        }
        return vd.e.h(sb2, str2, "}");
    }

    public j(s sVar, int i10, int i11) {
        if (sVar != null) {
            this.a = sVar;
            this.f16956b = i10;
            this.f16957c = i11;
            return;
        }
        throw new NullPointerException("Null dependency anInterface.");
    }
}
