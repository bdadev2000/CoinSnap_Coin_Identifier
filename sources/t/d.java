package t;

import ic.t;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: p, reason: collision with root package name */
    public static boolean f25102p = false;

    /* renamed from: q, reason: collision with root package name */
    public static int f25103q = 1000;

    /* renamed from: c, reason: collision with root package name */
    public final g f25105c;

    /* renamed from: f, reason: collision with root package name */
    public c[] f25108f;

    /* renamed from: l, reason: collision with root package name */
    public final t f25114l;

    /* renamed from: o, reason: collision with root package name */
    public c f25117o;
    public boolean a = false;

    /* renamed from: b, reason: collision with root package name */
    public int f25104b = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f25106d = 32;

    /* renamed from: e, reason: collision with root package name */
    public int f25107e = 32;

    /* renamed from: g, reason: collision with root package name */
    public boolean f25109g = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean[] f25110h = new boolean[32];

    /* renamed from: i, reason: collision with root package name */
    public int f25111i = 1;

    /* renamed from: j, reason: collision with root package name */
    public int f25112j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f25113k = 32;

    /* renamed from: m, reason: collision with root package name */
    public i[] f25115m = new i[f25103q];

    /* renamed from: n, reason: collision with root package name */
    public int f25116n = 0;

    public d() {
        this.f25108f = null;
        this.f25108f = new c[32];
        s();
        t tVar = new t(2);
        this.f25114l = tVar;
        this.f25105c = new g(tVar);
        this.f25117o = new c(tVar);
    }

    public static int n(w.d dVar) {
        i iVar = dVar.f26579i;
        if (iVar != null) {
            return (int) (iVar.f25131g + 0.5f);
        }
        return 0;
    }

    public final i a(int i10) {
        i iVar = (i) ((e) this.f25114l.f19575c).d();
        if (iVar == null) {
            iVar = new i(i10);
            iVar.f25138n = i10;
        } else {
            iVar.c();
            iVar.f25138n = i10;
        }
        int i11 = this.f25116n;
        int i12 = f25103q;
        if (i11 >= i12) {
            int i13 = i12 * 2;
            f25103q = i13;
            this.f25115m = (i[]) Arrays.copyOf(this.f25115m, i13);
        }
        i[] iVarArr = this.f25115m;
        int i14 = this.f25116n;
        this.f25116n = i14 + 1;
        iVarArr[i14] = iVar;
        return iVar;
    }

    public final void b(i iVar, i iVar2, int i10, float f10, i iVar3, i iVar4, int i11, int i12) {
        c l10 = l();
        if (iVar2 == iVar3) {
            l10.f25100d.c(iVar, 1.0f);
            l10.f25100d.c(iVar4, 1.0f);
            l10.f25100d.c(iVar2, -2.0f);
        } else if (f10 == 0.5f) {
            l10.f25100d.c(iVar, 1.0f);
            l10.f25100d.c(iVar2, -1.0f);
            l10.f25100d.c(iVar3, -1.0f);
            l10.f25100d.c(iVar4, 1.0f);
            if (i10 > 0 || i11 > 0) {
                l10.f25098b = (-i10) + i11;
            }
        } else if (f10 <= 0.0f) {
            l10.f25100d.c(iVar, -1.0f);
            l10.f25100d.c(iVar2, 1.0f);
            l10.f25098b = i10;
        } else if (f10 >= 1.0f) {
            l10.f25100d.c(iVar4, -1.0f);
            l10.f25100d.c(iVar3, 1.0f);
            l10.f25098b = -i11;
        } else {
            float f11 = 1.0f - f10;
            l10.f25100d.c(iVar, f11 * 1.0f);
            l10.f25100d.c(iVar2, f11 * (-1.0f));
            l10.f25100d.c(iVar3, (-1.0f) * f10);
            l10.f25100d.c(iVar4, 1.0f * f10);
            if (i10 > 0 || i11 > 0) {
                l10.f25098b = (i11 * f10) + ((-i10) * f11);
            }
        }
        if (i12 != 8) {
            l10.a(this, i12);
        }
        c(l10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x00b9, code lost:
    
        if (r4.f25137m <= 1) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00c5, code lost:
    
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00c2, code lost:
    
        if (r4.f25137m <= 1) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00e0, code lost:
    
        if (r4.f25137m <= 1) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x00ec, code lost:
    
        r14 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x00e9, code lost:
    
        if (r4.f25137m <= 1) goto L87;
     */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01b1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(t.c r17) {
        /*
            Method dump skipped, instructions count: 443
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t.d.c(t.c):void");
    }

    public final void d(i iVar, int i10) {
        int i11 = iVar.f25129d;
        if (i11 == -1) {
            iVar.d(this, i10);
            for (int i12 = 0; i12 < this.f25104b + 1; i12++) {
                i iVar2 = ((i[]) this.f25114l.f19576d)[i12];
            }
            return;
        }
        if (i11 != -1) {
            c cVar = this.f25108f[i11];
            if (cVar.f25101e) {
                cVar.f25098b = i10;
                return;
            }
            if (cVar.f25100d.g() == 0) {
                cVar.f25101e = true;
                cVar.f25098b = i10;
                return;
            }
            c l10 = l();
            if (i10 < 0) {
                l10.f25098b = i10 * (-1);
                l10.f25100d.c(iVar, 1.0f);
            } else {
                l10.f25098b = i10;
                l10.f25100d.c(iVar, -1.0f);
            }
            c(l10);
            return;
        }
        c l11 = l();
        l11.a = iVar;
        float f10 = i10;
        iVar.f25131g = f10;
        l11.f25098b = f10;
        l11.f25101e = true;
        c(l11);
    }

    public final void e(i iVar, i iVar2, int i10, int i11) {
        if (i11 == 8 && iVar2.f25132h && iVar.f25129d == -1) {
            iVar.d(this, iVar2.f25131g + i10);
            return;
        }
        c l10 = l();
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            l10.f25098b = i10;
        }
        if (!z10) {
            l10.f25100d.c(iVar, -1.0f);
            l10.f25100d.c(iVar2, 1.0f);
        } else {
            l10.f25100d.c(iVar, 1.0f);
            l10.f25100d.c(iVar2, -1.0f);
        }
        if (i11 != 8) {
            l10.a(this, i11);
        }
        c(l10);
    }

    public final void f(i iVar, i iVar2, int i10, int i11) {
        c l10 = l();
        i m10 = m();
        m10.f25130f = 0;
        l10.b(iVar, iVar2, m10, i10);
        if (i11 != 8) {
            l10.f25100d.c(j(i11), (int) (l10.f25100d.d(m10) * (-1.0f)));
        }
        c(l10);
    }

    public final void g(i iVar, i iVar2, int i10, int i11) {
        c l10 = l();
        i m10 = m();
        m10.f25130f = 0;
        l10.c(iVar, iVar2, m10, i10);
        if (i11 != 8) {
            l10.f25100d.c(j(i11), (int) (l10.f25100d.d(m10) * (-1.0f)));
        }
        c(l10);
    }

    public final void h(c cVar) {
        int i10;
        if (cVar.f25101e) {
            cVar.a.d(this, cVar.f25098b);
        } else {
            c[] cVarArr = this.f25108f;
            int i11 = this.f25112j;
            cVarArr[i11] = cVar;
            i iVar = cVar.a;
            iVar.f25129d = i11;
            this.f25112j = i11 + 1;
            iVar.e(this, cVar);
        }
        if (this.a) {
            int i12 = 0;
            while (i12 < this.f25112j) {
                if (this.f25108f[i12] == null) {
                    System.out.println("WTF");
                }
                c cVar2 = this.f25108f[i12];
                if (cVar2 != null && cVar2.f25101e) {
                    cVar2.a.d(this, cVar2.f25098b);
                    ((e) this.f25114l.f19574b).c(cVar2);
                    this.f25108f[i12] = null;
                    int i13 = i12 + 1;
                    int i14 = i13;
                    while (true) {
                        i10 = this.f25112j;
                        if (i13 >= i10) {
                            break;
                        }
                        c[] cVarArr2 = this.f25108f;
                        int i15 = i13 - 1;
                        c cVar3 = cVarArr2[i13];
                        cVarArr2[i15] = cVar3;
                        i iVar2 = cVar3.a;
                        if (iVar2.f25129d == i13) {
                            iVar2.f25129d = i15;
                        }
                        i14 = i13;
                        i13++;
                    }
                    if (i14 < i10) {
                        this.f25108f[i14] = null;
                    }
                    this.f25112j = i10 - 1;
                    i12--;
                }
                i12++;
            }
            this.a = false;
        }
    }

    public final void i() {
        for (int i10 = 0; i10 < this.f25112j; i10++) {
            c cVar = this.f25108f[i10];
            cVar.a.f25131g = cVar.f25098b;
        }
    }

    public final i j(int i10) {
        if (this.f25111i + 1 >= this.f25107e) {
            o();
        }
        i a = a(4);
        int i11 = this.f25104b + 1;
        this.f25104b = i11;
        this.f25111i++;
        a.f25128c = i11;
        a.f25130f = i10;
        ((i[]) this.f25114l.f19576d)[i11] = a;
        g gVar = this.f25105c;
        gVar.f25126i.f18523c = a;
        float[] fArr = a.f25134j;
        Arrays.fill(fArr, 0.0f);
        fArr[a.f25130f] = 1.0f;
        gVar.j(a);
        return a;
    }

    public final i k(Object obj) {
        i iVar = null;
        if (obj == null) {
            return null;
        }
        if (this.f25111i + 1 >= this.f25107e) {
            o();
        }
        if (obj instanceof w.d) {
            w.d dVar = (w.d) obj;
            iVar = dVar.f26579i;
            if (iVar == null) {
                dVar.k();
                iVar = dVar.f26579i;
            }
            int i10 = iVar.f25128c;
            t tVar = this.f25114l;
            if (i10 == -1 || i10 > this.f25104b || ((i[]) tVar.f19576d)[i10] == null) {
                if (i10 != -1) {
                    iVar.c();
                }
                int i11 = this.f25104b + 1;
                this.f25104b = i11;
                this.f25111i++;
                iVar.f25128c = i11;
                iVar.f25138n = 1;
                ((i[]) tVar.f19576d)[i11] = iVar;
            }
        }
        return iVar;
    }

    public final c l() {
        t tVar = this.f25114l;
        c cVar = (c) ((e) tVar.f19574b).d();
        if (cVar == null) {
            return new c(tVar);
        }
        cVar.a = null;
        cVar.f25100d.clear();
        cVar.f25098b = 0.0f;
        cVar.f25101e = false;
        return cVar;
    }

    public final i m() {
        if (this.f25111i + 1 >= this.f25107e) {
            o();
        }
        i a = a(3);
        int i10 = this.f25104b + 1;
        this.f25104b = i10;
        this.f25111i++;
        a.f25128c = i10;
        ((i[]) this.f25114l.f19576d)[i10] = a;
        return a;
    }

    public final void o() {
        int i10 = this.f25106d * 2;
        this.f25106d = i10;
        this.f25108f = (c[]) Arrays.copyOf(this.f25108f, i10);
        t tVar = this.f25114l;
        tVar.f19576d = (i[]) Arrays.copyOf((i[]) tVar.f19576d, this.f25106d);
        int i11 = this.f25106d;
        this.f25110h = new boolean[i11];
        this.f25107e = i11;
        this.f25113k = i11;
    }

    public final void p() {
        g gVar = this.f25105c;
        if (gVar.e()) {
            i();
            return;
        }
        if (this.f25109g) {
            boolean z10 = false;
            int i10 = 0;
            while (true) {
                if (i10 < this.f25112j) {
                    if (!this.f25108f[i10].f25101e) {
                        break;
                    } else {
                        i10++;
                    }
                } else {
                    z10 = true;
                    break;
                }
            }
            if (!z10) {
                q(gVar);
                return;
            } else {
                i();
                return;
            }
        }
        q(gVar);
    }

    public final void q(g gVar) {
        float f10;
        int i10;
        boolean z10;
        int i11 = 0;
        while (true) {
            f10 = 0.0f;
            i10 = 1;
            if (i11 < this.f25112j) {
                c cVar = this.f25108f[i11];
                if (cVar.a.f25138n != 1 && cVar.f25098b < 0.0f) {
                    z10 = true;
                    break;
                }
                i11++;
            } else {
                z10 = false;
                break;
            }
        }
        if (z10) {
            boolean z11 = false;
            int i12 = 0;
            while (!z11) {
                i12 += i10;
                float f11 = Float.MAX_VALUE;
                int i13 = -1;
                int i14 = -1;
                int i15 = 0;
                int i16 = 0;
                while (i15 < this.f25112j) {
                    c cVar2 = this.f25108f[i15];
                    if (cVar2.a.f25138n != i10 && !cVar2.f25101e && cVar2.f25098b < f10) {
                        int g10 = cVar2.f25100d.g();
                        int i17 = 0;
                        while (i17 < g10) {
                            i a = cVar2.f25100d.a(i17);
                            float d10 = cVar2.f25100d.d(a);
                            if (d10 > f10) {
                                for (int i18 = 0; i18 < 9; i18++) {
                                    float f12 = a.f25133i[i18] / d10;
                                    if ((f12 < f11 && i18 == i16) || i18 > i16) {
                                        i14 = a.f25128c;
                                        i16 = i18;
                                        f11 = f12;
                                        i13 = i15;
                                    }
                                }
                            }
                            i17++;
                            f10 = 0.0f;
                        }
                    }
                    i15++;
                    f10 = 0.0f;
                    i10 = 1;
                }
                if (i13 != -1) {
                    c cVar3 = this.f25108f[i13];
                    cVar3.a.f25129d = -1;
                    cVar3.g(((i[]) this.f25114l.f19576d)[i14]);
                    i iVar = cVar3.a;
                    iVar.f25129d = i13;
                    iVar.e(this, cVar3);
                } else {
                    z11 = true;
                }
                if (i12 > this.f25111i / 2) {
                    z11 = true;
                }
                f10 = 0.0f;
                i10 = 1;
            }
        }
        r(gVar);
        i();
    }

    public final void r(c cVar) {
        for (int i10 = 0; i10 < this.f25111i; i10++) {
            this.f25110h[i10] = false;
        }
        boolean z10 = false;
        int i11 = 0;
        while (!z10) {
            i11++;
            if (i11 >= this.f25111i * 2) {
                return;
            }
            i iVar = cVar.a;
            if (iVar != null) {
                this.f25110h[iVar.f25128c] = true;
            }
            i d10 = cVar.d(this.f25110h);
            if (d10 != null) {
                boolean[] zArr = this.f25110h;
                int i12 = d10.f25128c;
                if (zArr[i12]) {
                    return;
                } else {
                    zArr[i12] = true;
                }
            }
            if (d10 != null) {
                float f10 = Float.MAX_VALUE;
                int i13 = -1;
                for (int i14 = 0; i14 < this.f25112j; i14++) {
                    c cVar2 = this.f25108f[i14];
                    if (cVar2.a.f25138n != 1 && !cVar2.f25101e && cVar2.f25100d.e(d10)) {
                        float d11 = cVar2.f25100d.d(d10);
                        if (d11 < 0.0f) {
                            float f11 = (-cVar2.f25098b) / d11;
                            if (f11 < f10) {
                                i13 = i14;
                                f10 = f11;
                            }
                        }
                    }
                }
                if (i13 > -1) {
                    c cVar3 = this.f25108f[i13];
                    cVar3.a.f25129d = -1;
                    cVar3.g(d10);
                    i iVar2 = cVar3.a;
                    iVar2.f25129d = i13;
                    iVar2.e(this, cVar3);
                }
            } else {
                z10 = true;
            }
        }
    }

    public final void s() {
        for (int i10 = 0; i10 < this.f25112j; i10++) {
            c cVar = this.f25108f[i10];
            if (cVar != null) {
                ((e) this.f25114l.f19574b).c(cVar);
            }
            this.f25108f[i10] = null;
        }
    }

    public final void t() {
        t tVar;
        int i10 = 0;
        while (true) {
            tVar = this.f25114l;
            i[] iVarArr = (i[]) tVar.f19576d;
            if (i10 >= iVarArr.length) {
                break;
            }
            i iVar = iVarArr[i10];
            if (iVar != null) {
                iVar.c();
            }
            i10++;
        }
        e eVar = (e) tVar.f19575c;
        i[] iVarArr2 = this.f25115m;
        int i11 = this.f25116n;
        eVar.getClass();
        if (i11 > iVarArr2.length) {
            i11 = iVarArr2.length;
        }
        for (int i12 = 0; i12 < i11; i12++) {
            i iVar2 = iVarArr2[i12];
            int i13 = eVar.f25120d;
            Object[] objArr = eVar.f25119c;
            if (i13 < objArr.length) {
                objArr[i13] = iVar2;
                eVar.f25120d = i13 + 1;
            }
        }
        this.f25116n = 0;
        Arrays.fill((i[]) tVar.f19576d, (Object) null);
        this.f25104b = 0;
        g gVar = this.f25105c;
        gVar.f25125h = 0;
        gVar.f25098b = 0.0f;
        this.f25111i = 1;
        for (int i14 = 0; i14 < this.f25112j; i14++) {
            c cVar = this.f25108f[i14];
        }
        s();
        this.f25112j = 0;
        this.f25117o = new c(tVar);
    }
}
