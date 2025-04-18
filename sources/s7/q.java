package s7;

/* loaded from: classes3.dex */
public final class q implements i {

    /* renamed from: b, reason: collision with root package name */
    public final int f24654b;

    /* renamed from: c, reason: collision with root package name */
    public final int f24655c;

    /* renamed from: d, reason: collision with root package name */
    public final int f24656d;

    /* renamed from: f, reason: collision with root package name */
    public final String f24657f;

    static {
        new androidx.datastore.preferences.protobuf.o(0).b();
        n9.h0.E(0);
        n9.h0.E(1);
        n9.h0.E(2);
        n9.h0.E(3);
    }

    public q(androidx.datastore.preferences.protobuf.o oVar) {
        this.f24654b = oVar.a;
        this.f24655c = oVar.f1445b;
        this.f24656d = oVar.f1446c;
        this.f24657f = (String) oVar.f1447d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        if (this.f24654b == qVar.f24654b && this.f24655c == qVar.f24655c && this.f24656d == qVar.f24656d && n9.h0.a(this.f24657f, qVar.f24657f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i10 = (((((527 + this.f24654b) * 31) + this.f24655c) * 31) + this.f24656d) * 31;
        String str = this.f24657f;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return i10 + hashCode;
    }
}
