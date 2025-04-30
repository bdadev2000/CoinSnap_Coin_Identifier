package androidx.recyclerview.widget;

/* loaded from: classes.dex */
public final class E0 {

    /* renamed from: a, reason: collision with root package name */
    public final x.l f4932a = new x.l();
    public final x.f b = new x.f();

    public final void a(p0 p0Var, P p2) {
        x.l lVar = this.f4932a;
        C0 c02 = (C0) lVar.getOrDefault(p0Var, null);
        if (c02 == null) {
            c02 = C0.a();
            lVar.put(p0Var, c02);
        }
        c02.f4928c = p2;
        c02.f4927a |= 8;
    }

    public final P b(p0 p0Var, int i9) {
        C0 c02;
        P p2;
        x.l lVar = this.f4932a;
        int e4 = lVar.e(p0Var);
        if (e4 >= 0 && (c02 = (C0) lVar.m(e4)) != null) {
            int i10 = c02.f4927a;
            if ((i10 & i9) != 0) {
                int i11 = i10 & (~i9);
                c02.f4927a = i11;
                if (i9 == 4) {
                    p2 = c02.b;
                } else if (i9 == 8) {
                    p2 = c02.f4928c;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((i11 & 12) == 0) {
                    lVar.k(e4);
                    c02.f4927a = 0;
                    c02.b = null;
                    c02.f4928c = null;
                    C0.f4926d.b(c02);
                }
                return p2;
            }
        }
        return null;
    }

    public final void c(p0 p0Var) {
        C0 c02 = (C0) this.f4932a.getOrDefault(p0Var, null);
        if (c02 == null) {
            return;
        }
        c02.f4927a &= -2;
    }

    public final void d(p0 p0Var) {
        x.f fVar = this.b;
        int h6 = fVar.h() - 1;
        while (true) {
            if (h6 < 0) {
                break;
            }
            if (p0Var == fVar.i(h6)) {
                Object[] objArr = fVar.f24071d;
                Object obj = objArr[h6];
                Object obj2 = x.f.f24069g;
                if (obj != obj2) {
                    objArr[h6] = obj2;
                    fVar.b = true;
                }
            } else {
                h6--;
            }
        }
        C0 c02 = (C0) this.f4932a.remove(p0Var);
        if (c02 != null) {
            c02.f4927a = 0;
            c02.b = null;
            c02.f4928c = null;
            C0.f4926d.b(c02);
        }
    }
}
