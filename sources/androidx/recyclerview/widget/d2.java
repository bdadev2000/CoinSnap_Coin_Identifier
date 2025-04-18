package androidx.recyclerview.widget;

/* loaded from: classes.dex */
public final class d2 {
    public final r.k a = new r.k();

    /* renamed from: b, reason: collision with root package name */
    public final r.e f1897b = new r.e();

    public final void a(o1 o1Var, p0 p0Var) {
        r.k kVar = this.a;
        b2 b2Var = (b2) kVar.getOrDefault(o1Var, null);
        if (b2Var == null) {
            b2Var = b2.a();
            kVar.put(o1Var, b2Var);
        }
        b2Var.f1880c = p0Var;
        b2Var.a |= 8;
    }

    public final p0 b(o1 o1Var, int i10) {
        b2 b2Var;
        p0 p0Var;
        r.k kVar = this.a;
        int e2 = kVar.e(o1Var);
        if (e2 >= 0 && (b2Var = (b2) kVar.l(e2)) != null) {
            int i11 = b2Var.a;
            if ((i11 & i10) != 0) {
                int i12 = i11 & (~i10);
                b2Var.a = i12;
                if (i10 == 4) {
                    p0Var = b2Var.f1879b;
                } else if (i10 == 8) {
                    p0Var = b2Var.f1880c;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((i12 & 12) == 0) {
                    kVar.j(e2);
                    b2Var.a = 0;
                    b2Var.f1879b = null;
                    b2Var.f1880c = null;
                    b2.f1878d.c(b2Var);
                }
                return p0Var;
            }
        }
        return null;
    }

    public final void c(o1 o1Var) {
        b2 b2Var = (b2) this.a.getOrDefault(o1Var, null);
        if (b2Var == null) {
            return;
        }
        b2Var.a &= -2;
    }

    public final void d(o1 o1Var) {
        r.e eVar = this.f1897b;
        int h10 = eVar.h() - 1;
        while (true) {
            if (h10 < 0) {
                break;
            }
            if (o1Var == eVar.i(h10)) {
                Object[] objArr = eVar.f23935d;
                Object obj = objArr[h10];
                Object obj2 = r.e.f23932g;
                if (obj != obj2) {
                    objArr[h10] = obj2;
                    eVar.f23933b = true;
                }
            } else {
                h10--;
            }
        }
        b2 b2Var = (b2) this.a.remove(o1Var);
        if (b2Var != null) {
            b2Var.a = 0;
            b2Var.f1879b = null;
            b2Var.f1880c = null;
            b2.f1878d.c(b2Var);
        }
    }
}
