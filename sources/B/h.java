package B;

import java.util.ArrayList;
import z.AbstractC2965e;
import z.C2962b;
import z.C2963c;
import z.C2966f;

/* loaded from: classes.dex */
public final class h extends d {

    /* renamed from: q0, reason: collision with root package name */
    public float f244q0 = -1.0f;

    /* renamed from: r0, reason: collision with root package name */
    public int f245r0 = -1;

    /* renamed from: s0, reason: collision with root package name */
    public int f246s0 = -1;

    /* renamed from: t0, reason: collision with root package name */
    public c f247t0 = this.f120J;

    /* renamed from: u0, reason: collision with root package name */
    public int f248u0 = 0;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f249v0;

    public h() {
        this.f127R.clear();
        this.f127R.add(this.f247t0);
        int length = this.f126Q.length;
        for (int i9 = 0; i9 < length; i9++) {
            this.f126Q[i9] = this.f247t0;
        }
    }

    @Override // B.d
    public final boolean A() {
        return this.f249v0;
    }

    @Override // B.d
    public final boolean B() {
        return this.f249v0;
    }

    @Override // B.d
    public final void Q(C2963c c2963c, boolean z8) {
        if (this.f129T == null) {
            return;
        }
        c cVar = this.f247t0;
        c2963c.getClass();
        int n2 = C2963c.n(cVar);
        if (this.f248u0 == 1) {
            this.f134Y = n2;
            this.f135Z = 0;
            L(this.f129T.k());
            O(0);
            return;
        }
        this.f134Y = 0;
        this.f135Z = n2;
        O(this.f129T.q());
        L(0);
    }

    public final void R(int i9) {
        this.f247t0.l(i9);
        this.f249v0 = true;
    }

    public final void S(int i9) {
        if (this.f248u0 == i9) {
            return;
        }
        this.f248u0 = i9;
        ArrayList arrayList = this.f127R;
        arrayList.clear();
        if (this.f248u0 == 1) {
            this.f247t0 = this.f119I;
        } else {
            this.f247t0 = this.f120J;
        }
        arrayList.add(this.f247t0);
        c[] cVarArr = this.f126Q;
        int length = cVarArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            cVarArr[i10] = this.f247t0;
        }
    }

    @Override // B.d
    public final void b(C2963c c2963c, boolean z8) {
        boolean z9;
        e eVar = (e) this.f129T;
        if (eVar == null) {
            return;
        }
        Object i9 = eVar.i(2);
        Object i10 = eVar.i(4);
        d dVar = this.f129T;
        boolean z10 = true;
        if (dVar != null && dVar.f163p0[0] == 2) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (this.f248u0 == 0) {
            i9 = eVar.i(3);
            i10 = eVar.i(5);
            d dVar2 = this.f129T;
            if (dVar2 == null || dVar2.f163p0[1] != 2) {
                z10 = false;
            }
            z9 = z10;
        }
        if (this.f249v0) {
            c cVar = this.f247t0;
            if (cVar.f104c) {
                C2966f k6 = c2963c.k(cVar);
                c2963c.d(k6, this.f247t0.d());
                if (this.f245r0 != -1) {
                    if (z9) {
                        c2963c.f(c2963c.k(i10), k6, 0, 5);
                    }
                } else if (this.f246s0 != -1 && z9) {
                    C2966f k7 = c2963c.k(i10);
                    c2963c.f(k6, c2963c.k(i9), 0, 5);
                    c2963c.f(k7, k6, 0, 5);
                }
                this.f249v0 = false;
                return;
            }
        }
        if (this.f245r0 != -1) {
            C2966f k9 = c2963c.k(this.f247t0);
            c2963c.e(k9, c2963c.k(i9), this.f245r0, 8);
            if (z9) {
                c2963c.f(c2963c.k(i10), k9, 0, 5);
                return;
            }
            return;
        }
        if (this.f246s0 != -1) {
            C2966f k10 = c2963c.k(this.f247t0);
            C2966f k11 = c2963c.k(i10);
            c2963c.e(k10, k11, -this.f246s0, 8);
            if (z9) {
                c2963c.f(k10, c2963c.k(i9), 0, 5);
                c2963c.f(k11, k10, 0, 5);
                return;
            }
            return;
        }
        if (this.f244q0 != -1.0f) {
            C2966f k12 = c2963c.k(this.f247t0);
            C2966f k13 = c2963c.k(i10);
            float f9 = this.f244q0;
            C2962b l = c2963c.l();
            l.f24462d.j(k12, -1.0f);
            l.f24462d.j(k13, f9);
            c2963c.c(l);
        }
    }

    @Override // B.d
    public final boolean c() {
        return true;
    }

    @Override // B.d
    public final c i(int i9) {
        int d2 = AbstractC2965e.d(i9);
        if (d2 != 1) {
            if (d2 != 2) {
                if (d2 != 3) {
                    if (d2 != 4) {
                        return null;
                    }
                }
            }
            if (this.f248u0 == 0) {
                return this.f247t0;
            }
            return null;
        }
        if (this.f248u0 == 1) {
            return this.f247t0;
        }
        return null;
    }
}
