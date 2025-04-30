package g8;

import a5.C0398b;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import x0.AbstractC2914a;
import z.AbstractC2965e;

/* loaded from: classes3.dex */
public final class w extends com.bumptech.glide.d implements f8.o {
    public final B3.e l;
    public final f8.b m;

    /* renamed from: n, reason: collision with root package name */
    public final int f20544n;

    /* renamed from: o, reason: collision with root package name */
    public final f8.o[] f20545o;

    /* renamed from: p, reason: collision with root package name */
    public final C0398b f20546p;

    /* renamed from: q, reason: collision with root package name */
    public final f8.h f20547q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f20548r;

    public w(B3.e eVar, f8.b bVar, int i9, f8.o[] oVarArr) {
        G7.j.e(eVar, "composer");
        G7.j.e(bVar, "json");
        AbstractC2914a.i(i9, "mode");
        this.l = eVar;
        this.m = bVar;
        this.f20544n = i9;
        this.f20545o = oVarArr;
        this.f20546p = bVar.b;
        this.f20547q = bVar.f20370a;
        int d2 = AbstractC2965e.d(i9);
        if (oVarArr != null) {
            f8.o oVar = oVarArr[d2];
            if (oVar != null || oVar != this) {
                oVarArr[d2] = this;
            }
        }
    }

    @Override // com.bumptech.glide.d, d8.d
    public final void B(long j7) {
        if (this.f20548r) {
            F(String.valueOf(j7));
        } else {
            this.l.k(j7);
        }
    }

    @Override // com.bumptech.glide.d, d8.d
    public final void D(c8.g gVar, int i9) {
        G7.j.e(gVar, "enumDescriptor");
        F(gVar.g(i9));
    }

    @Override // f8.o
    public final void E(f8.j jVar) {
        G7.j.e(jVar, "element");
        g(f8.m.f20403a, jVar);
    }

    @Override // com.bumptech.glide.d, d8.d
    public final void F(String str) {
        G7.j.e(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        this.l.n(str);
    }

    @Override // com.bumptech.glide.d
    public final void K(c8.g gVar, int i9) {
        G7.j.e(gVar, "descriptor");
        int d2 = AbstractC2965e.d(this.f20544n);
        boolean z8 = true;
        B3.e eVar = this.l;
        if (d2 != 1) {
            if (d2 != 2) {
                if (d2 != 3) {
                    if (!eVar.f283a) {
                        eVar.i(',');
                    }
                    eVar.g();
                    F(gVar.g(i9));
                    eVar.i(':');
                    eVar.p();
                    return;
                }
                if (i9 == 0) {
                    this.f20548r = true;
                }
                if (i9 == 1) {
                    eVar.i(',');
                    eVar.p();
                    this.f20548r = false;
                    return;
                }
                return;
            }
            if (!eVar.f283a) {
                if (i9 % 2 == 0) {
                    eVar.i(',');
                    eVar.g();
                } else {
                    eVar.i(':');
                    eVar.p();
                    z8 = false;
                }
                this.f20548r = z8;
                return;
            }
            this.f20548r = true;
            eVar.g();
            return;
        }
        if (!eVar.f283a) {
            eVar.i(',');
        }
        eVar.g();
    }

    @Override // d8.d
    public final C0398b a() {
        return this.f20546p;
    }

    @Override // com.bumptech.glide.d, d8.d
    public final d8.b b(c8.g gVar) {
        f8.o oVar;
        G7.j.e(gVar, "descriptor");
        f8.b bVar = this.m;
        int m = k.m(gVar, bVar);
        char a6 = com.mbridge.msdk.foundation.entity.o.a(m);
        B3.e eVar = this.l;
        eVar.i(a6);
        eVar.e();
        if (this.f20544n == m) {
            return this;
        }
        f8.o[] oVarArr = this.f20545o;
        if (oVarArr == null || (oVar = oVarArr[AbstractC2965e.d(m)]) == null) {
            return new w(eVar, bVar, m, oVarArr);
        }
        return oVar;
    }

    @Override // com.bumptech.glide.d, d8.b
    public final void c(c8.g gVar) {
        G7.j.e(gVar, "descriptor");
        int i9 = this.f20544n;
        com.mbridge.msdk.foundation.entity.o.b(i9);
        B3.e eVar = this.l;
        eVar.q();
        eVar.g();
        eVar.i(com.mbridge.msdk.foundation.entity.o.b(i9));
    }

    @Override // f8.o
    public final f8.b d() {
        return this.m;
    }

    @Override // com.bumptech.glide.d, d8.d
    public final void f() {
        this.l.l("null");
    }

    @Override // com.bumptech.glide.d, d8.d
    public final void g(a8.b bVar, Object obj) {
        G7.j.e(bVar, "serializer");
        if (bVar instanceof a8.f) {
            f8.b bVar2 = this.m;
            if (!bVar2.f20370a.f20392i) {
                k.h(bVar.getDescriptor(), bVar2);
                G7.j.c(obj, "null cannot be cast to non-null type kotlin.Any");
                R2.b.m((a8.f) bVar, this, obj);
                throw null;
            }
        }
        bVar.serialize(this, obj);
    }

    @Override // com.bumptech.glide.d, d8.d
    public final void h(double d2) {
        boolean z8 = this.f20548r;
        B3.e eVar = this.l;
        if (z8) {
            F(String.valueOf(d2));
        } else {
            ((B3.g) eVar.b).i(String.valueOf(d2));
        }
        if (!this.f20547q.f20394k) {
            if (Double.isInfinite(d2) || Double.isNaN(d2)) {
                throw k.a(Double.valueOf(d2), ((B3.g) eVar.b).toString());
            }
        }
    }

    @Override // com.bumptech.glide.d, d8.d
    public final void i(short s5) {
        if (this.f20548r) {
            F(String.valueOf((int) s5));
        } else {
            this.l.m(s5);
        }
    }

    @Override // com.bumptech.glide.d, d8.d
    public final void j(byte b) {
        if (this.f20548r) {
            F(String.valueOf((int) b));
        } else {
            this.l.h(b);
        }
    }

    @Override // com.bumptech.glide.d, d8.d
    public final void l(boolean z8) {
        if (this.f20548r) {
            F(String.valueOf(z8));
        } else {
            ((B3.g) this.l.b).i(String.valueOf(z8));
        }
    }

    @Override // com.bumptech.glide.d, d8.b
    public final boolean o(c8.g gVar) {
        G7.j.e(gVar, "descriptor");
        return this.f20547q.f20385a;
    }

    @Override // com.bumptech.glide.d, d8.d
    public final void p(float f9) {
        boolean z8 = this.f20548r;
        B3.e eVar = this.l;
        if (z8) {
            F(String.valueOf(f9));
        } else {
            ((B3.g) eVar.b).i(String.valueOf(f9));
        }
        if (!this.f20547q.f20394k) {
            if (Float.isInfinite(f9) || Float.isNaN(f9)) {
                throw k.a(Float.valueOf(f9), ((B3.g) eVar.b).toString());
            }
        }
    }

    @Override // com.bumptech.glide.d, d8.d
    public final d8.d q(c8.g gVar) {
        G7.j.e(gVar, "descriptor");
        if (x.a(gVar)) {
            B3.e eVar = this.l;
            if (!(eVar instanceof e)) {
                eVar = new e((B3.g) eVar.b, this.f20548r);
            }
            return new w(eVar, this.m, this.f20544n, null);
        }
        return this;
    }

    @Override // com.bumptech.glide.d, d8.d
    public final void r(char c9) {
        F(String.valueOf(c9));
    }

    @Override // com.bumptech.glide.d, d8.b
    public final void u(c8.g gVar, int i9, a8.b bVar, Object obj) {
        G7.j.e(gVar, "descriptor");
        G7.j.e(bVar, "serializer");
        if (obj != null || this.f20547q.f20389f) {
            super.u(gVar, i9, bVar, obj);
        }
    }

    @Override // com.bumptech.glide.d, d8.d
    public final void y(int i9) {
        if (this.f20548r) {
            F(String.valueOf(i9));
        } else {
            this.l.j(i9);
        }
    }
}
