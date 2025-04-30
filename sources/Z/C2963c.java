package z;

import java.util.Arrays;
import l5.k;

/* renamed from: z.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2963c {

    /* renamed from: p, reason: collision with root package name */
    public static boolean f24464p = false;

    /* renamed from: q, reason: collision with root package name */
    public static int f24465q = 1000;

    /* renamed from: c, reason: collision with root package name */
    public final C2964d f24467c;

    /* renamed from: f, reason: collision with root package name */
    public C2962b[] f24470f;
    public final k l;

    /* renamed from: o, reason: collision with root package name */
    public C2962b f24477o;

    /* renamed from: a, reason: collision with root package name */
    public boolean f24466a = false;
    public int b = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f24468d = 32;

    /* renamed from: e, reason: collision with root package name */
    public int f24469e = 32;

    /* renamed from: g, reason: collision with root package name */
    public boolean f24471g = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean[] f24472h = new boolean[32];

    /* renamed from: i, reason: collision with root package name */
    public int f24473i = 1;

    /* renamed from: j, reason: collision with root package name */
    public int f24474j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f24475k = 32;
    public C2966f[] m = new C2966f[f24465q];

    /* renamed from: n, reason: collision with root package name */
    public int f24476n = 0;

    /* JADX WARN: Type inference failed for: r1v2, types: [z.d, z.b] */
    /* JADX WARN: Type inference failed for: r2v6, types: [l5.k, java.lang.Object] */
    public C2963c() {
        this.f24470f = null;
        this.f24470f = new C2962b[32];
        s();
        ?? obj = new Object();
        obj.b = new S.d();
        obj.f21620c = new S.d();
        obj.f21619a = new C2966f[32];
        this.l = obj;
        ?? c2962b = new C2962b(obj);
        c2962b.f24478f = new C2966f[128];
        c2962b.f24479g = new C2966f[128];
        c2962b.f24480h = 0;
        c2962b.f24481i = new r4.c((C2964d) c2962b);
        this.f24467c = c2962b;
        this.f24477o = new C2962b(obj);
    }

    public static int n(Object obj) {
        C2966f c2966f = ((B.c) obj).f110i;
        if (c2966f != null) {
            return (int) (c2966f.f24486g + 0.5f);
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v0 */
    public final C2966f a(int i9) {
        S.d dVar = (S.d) this.l.f21620c;
        int i10 = dVar.f2768c;
        C2966f c2966f = null;
        if (i10 > 0) {
            int i11 = i10 - 1;
            ?? r32 = dVar.b;
            ?? r42 = r32[i11];
            r32[i11] = 0;
            dVar.f2768c = i11;
            c2966f = r42;
        }
        C2966f c2966f2 = c2966f;
        if (c2966f2 == null) {
            c2966f2 = new C2966f(i9);
            c2966f2.f24491n = i9;
        } else {
            c2966f2.c();
            c2966f2.f24491n = i9;
        }
        int i12 = this.f24476n;
        int i13 = f24465q;
        if (i12 >= i13) {
            int i14 = i13 * 2;
            f24465q = i14;
            this.m = (C2966f[]) Arrays.copyOf(this.m, i14);
        }
        C2966f[] c2966fArr = this.m;
        int i15 = this.f24476n;
        this.f24476n = i15 + 1;
        c2966fArr[i15] = c2966f2;
        return c2966f2;
    }

    public final void b(C2966f c2966f, C2966f c2966f2, int i9, float f9, C2966f c2966f3, C2966f c2966f4, int i10, int i11) {
        C2962b l = l();
        if (c2966f2 == c2966f3) {
            l.f24462d.j(c2966f, 1.0f);
            l.f24462d.j(c2966f4, 1.0f);
            l.f24462d.j(c2966f2, -2.0f);
        } else if (f9 == 0.5f) {
            l.f24462d.j(c2966f, 1.0f);
            l.f24462d.j(c2966f2, -1.0f);
            l.f24462d.j(c2966f3, -1.0f);
            l.f24462d.j(c2966f4, 1.0f);
            if (i9 > 0 || i10 > 0) {
                l.b = (-i9) + i10;
            }
        } else if (f9 <= 0.0f) {
            l.f24462d.j(c2966f, -1.0f);
            l.f24462d.j(c2966f2, 1.0f);
            l.b = i9;
        } else if (f9 >= 1.0f) {
            l.f24462d.j(c2966f4, -1.0f);
            l.f24462d.j(c2966f3, 1.0f);
            l.b = -i10;
        } else {
            float f10 = 1.0f - f9;
            l.f24462d.j(c2966f, f10 * 1.0f);
            l.f24462d.j(c2966f2, f10 * (-1.0f));
            l.f24462d.j(c2966f3, (-1.0f) * f9);
            l.f24462d.j(c2966f4, 1.0f * f9);
            if (i9 > 0 || i10 > 0) {
                l.b = (i10 * f9) + ((-i9) * f10);
            }
        }
        if (i11 != 8) {
            l.a(this, i11);
        }
        c(l);
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x00b9, code lost:
    
        if (r4.m <= 1) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00bc, code lost:
    
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00c6, code lost:
    
        if (r4.m <= 1) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00db, code lost:
    
        if (r4.m <= 1) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00de, code lost:
    
        r14 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x00e8, code lost:
    
        if (r4.m <= 1) goto L82;
     */
    /* JADX WARN: Removed duplicated region for block: B:130:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01a5 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(z.C2962b r17) {
        /*
            Method dump skipped, instructions count: 429
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: z.C2963c.c(z.b):void");
    }

    public final void d(C2966f c2966f, int i9) {
        int i10 = c2966f.f24484d;
        if (i10 == -1) {
            c2966f.d(this, i9);
            for (int i11 = 0; i11 < this.b + 1; i11++) {
                C2966f c2966f2 = ((C2966f[]) this.l.f21619a)[i11];
            }
            return;
        }
        if (i10 != -1) {
            C2962b c2962b = this.f24470f[i10];
            if (c2962b.f24463e) {
                c2962b.b = i9;
                return;
            }
            if (c2962b.f24462d.f() == 0) {
                c2962b.f24463e = true;
                c2962b.b = i9;
                return;
            }
            C2962b l = l();
            if (i9 < 0) {
                l.b = i9 * (-1);
                l.f24462d.j(c2966f, 1.0f);
            } else {
                l.b = i9;
                l.f24462d.j(c2966f, -1.0f);
            }
            c(l);
            return;
        }
        C2962b l2 = l();
        l2.f24460a = c2966f;
        float f9 = i9;
        c2966f.f24486g = f9;
        l2.b = f9;
        l2.f24463e = true;
        c(l2);
    }

    public final void e(C2966f c2966f, C2966f c2966f2, int i9, int i10) {
        if (i10 == 8 && c2966f2.f24487h && c2966f.f24484d == -1) {
            c2966f.d(this, c2966f2.f24486g + i9);
            return;
        }
        C2962b l = l();
        boolean z8 = false;
        if (i9 != 0) {
            if (i9 < 0) {
                i9 *= -1;
                z8 = true;
            }
            l.b = i9;
        }
        if (!z8) {
            l.f24462d.j(c2966f, -1.0f);
            l.f24462d.j(c2966f2, 1.0f);
        } else {
            l.f24462d.j(c2966f, 1.0f);
            l.f24462d.j(c2966f2, -1.0f);
        }
        if (i10 != 8) {
            l.a(this, i10);
        }
        c(l);
    }

    public final void f(C2966f c2966f, C2966f c2966f2, int i9, int i10) {
        C2962b l = l();
        C2966f m = m();
        m.f24485f = 0;
        l.b(c2966f, c2966f2, m, i9);
        if (i10 != 8) {
            l.f24462d.j(j(i10), (int) (l.f24462d.e(m) * (-1.0f)));
        }
        c(l);
    }

    public final void g(C2966f c2966f, C2966f c2966f2, int i9, int i10) {
        C2962b l = l();
        C2966f m = m();
        m.f24485f = 0;
        l.c(c2966f, c2966f2, m, i9);
        if (i10 != 8) {
            l.f24462d.j(j(i10), (int) (l.f24462d.e(m) * (-1.0f)));
        }
        c(l);
    }

    public final void h(C2962b c2962b) {
        int i9;
        if (c2962b.f24463e) {
            c2962b.f24460a.d(this, c2962b.b);
        } else {
            C2962b[] c2962bArr = this.f24470f;
            int i10 = this.f24474j;
            c2962bArr[i10] = c2962b;
            C2966f c2966f = c2962b.f24460a;
            c2966f.f24484d = i10;
            this.f24474j = i10 + 1;
            c2966f.e(this, c2962b);
        }
        if (this.f24466a) {
            int i11 = 0;
            while (i11 < this.f24474j) {
                if (this.f24470f[i11] == null) {
                    System.out.println("WTF");
                }
                C2962b c2962b2 = this.f24470f[i11];
                if (c2962b2 != null && c2962b2.f24463e) {
                    c2962b2.f24460a.d(this, c2962b2.b);
                    ((S.d) this.l.b).a(c2962b2);
                    this.f24470f[i11] = null;
                    int i12 = i11 + 1;
                    int i13 = i12;
                    while (true) {
                        i9 = this.f24474j;
                        if (i12 >= i9) {
                            break;
                        }
                        C2962b[] c2962bArr2 = this.f24470f;
                        int i14 = i12 - 1;
                        C2962b c2962b3 = c2962bArr2[i12];
                        c2962bArr2[i14] = c2962b3;
                        C2966f c2966f2 = c2962b3.f24460a;
                        if (c2966f2.f24484d == i12) {
                            c2966f2.f24484d = i14;
                        }
                        i13 = i12;
                        i12++;
                    }
                    if (i13 < i9) {
                        this.f24470f[i13] = null;
                    }
                    this.f24474j = i9 - 1;
                    i11--;
                }
                i11++;
            }
            this.f24466a = false;
        }
    }

    public final void i() {
        for (int i9 = 0; i9 < this.f24474j; i9++) {
            C2962b c2962b = this.f24470f[i9];
            c2962b.f24460a.f24486g = c2962b.b;
        }
    }

    public final C2966f j(int i9) {
        if (this.f24473i + 1 >= this.f24469e) {
            o();
        }
        C2966f a6 = a(4);
        int i10 = this.b + 1;
        this.b = i10;
        this.f24473i++;
        a6.f24483c = i10;
        a6.f24485f = i9;
        ((C2966f[]) this.l.f21619a)[i10] = a6;
        C2964d c2964d = this.f24467c;
        c2964d.f24481i.f22840c = a6;
        float[] fArr = a6.f24489j;
        Arrays.fill(fArr, 0.0f);
        fArr[a6.f24485f] = 1.0f;
        c2964d.j(a6);
        return a6;
    }

    public final C2966f k(Object obj) {
        C2966f c2966f = null;
        if (obj == null) {
            return null;
        }
        if (this.f24473i + 1 >= this.f24469e) {
            o();
        }
        if (obj instanceof B.c) {
            B.c cVar = (B.c) obj;
            c2966f = cVar.f110i;
            if (c2966f == null) {
                cVar.k();
                c2966f = cVar.f110i;
            }
            int i9 = c2966f.f24483c;
            k kVar = this.l;
            if (i9 == -1 || i9 > this.b || ((C2966f[]) kVar.f21619a)[i9] == null) {
                if (i9 != -1) {
                    c2966f.c();
                }
                int i10 = this.b + 1;
                this.b = i10;
                this.f24473i++;
                c2966f.f24483c = i10;
                c2966f.f24491n = 1;
                ((C2966f[]) kVar.f21619a)[i10] = c2966f;
            }
        }
        return c2966f;
    }

    public final C2962b l() {
        Object obj;
        k kVar = this.l;
        S.d dVar = (S.d) kVar.b;
        int i9 = dVar.f2768c;
        if (i9 > 0) {
            int i10 = i9 - 1;
            Object[] objArr = dVar.b;
            obj = objArr[i10];
            objArr[i10] = null;
            dVar.f2768c = i10;
        } else {
            obj = null;
        }
        C2962b c2962b = (C2962b) obj;
        if (c2962b == null) {
            return new C2962b(kVar);
        }
        c2962b.f24460a = null;
        c2962b.f24462d.b();
        c2962b.b = 0.0f;
        c2962b.f24463e = false;
        return c2962b;
    }

    public final C2966f m() {
        if (this.f24473i + 1 >= this.f24469e) {
            o();
        }
        C2966f a6 = a(3);
        int i9 = this.b + 1;
        this.b = i9;
        this.f24473i++;
        a6.f24483c = i9;
        ((C2966f[]) this.l.f21619a)[i9] = a6;
        return a6;
    }

    public final void o() {
        int i9 = this.f24468d * 2;
        this.f24468d = i9;
        this.f24470f = (C2962b[]) Arrays.copyOf(this.f24470f, i9);
        k kVar = this.l;
        kVar.f21619a = (C2966f[]) Arrays.copyOf((C2966f[]) kVar.f21619a, this.f24468d);
        int i10 = this.f24468d;
        this.f24472h = new boolean[i10];
        this.f24469e = i10;
        this.f24475k = i10;
    }

    public final void p() {
        C2964d c2964d = this.f24467c;
        if (c2964d.e()) {
            i();
            return;
        }
        if (this.f24471g) {
            for (int i9 = 0; i9 < this.f24474j; i9++) {
                if (!this.f24470f[i9].f24463e) {
                    q(c2964d);
                    return;
                }
            }
            i();
            return;
        }
        q(c2964d);
    }

    public final void q(C2962b c2962b) {
        int i9 = 0;
        while (true) {
            if (i9 >= this.f24474j) {
                break;
            }
            C2962b c2962b2 = this.f24470f[i9];
            int i10 = 1;
            if (c2962b2.f24460a.f24491n != 1) {
                float f9 = 0.0f;
                if (c2962b2.b < 0.0f) {
                    boolean z8 = false;
                    int i11 = 0;
                    while (!z8) {
                        i11 += i10;
                        float f10 = Float.MAX_VALUE;
                        int i12 = -1;
                        int i13 = -1;
                        int i14 = 0;
                        int i15 = 0;
                        while (i14 < this.f24474j) {
                            C2962b c2962b3 = this.f24470f[i14];
                            if (c2962b3.f24460a.f24491n != i10 && !c2962b3.f24463e && c2962b3.b < f9) {
                                int f11 = c2962b3.f24462d.f();
                                int i16 = 0;
                                while (i16 < f11) {
                                    C2966f g9 = c2962b3.f24462d.g(i16);
                                    float e4 = c2962b3.f24462d.e(g9);
                                    if (e4 > f9) {
                                        for (int i17 = 0; i17 < 9; i17++) {
                                            float f12 = g9.f24488i[i17] / e4;
                                            if ((f12 < f10 && i17 == i15) || i17 > i15) {
                                                i15 = i17;
                                                i13 = g9.f24483c;
                                                i12 = i14;
                                                f10 = f12;
                                            }
                                        }
                                    }
                                    i16++;
                                    f9 = 0.0f;
                                }
                            }
                            i14++;
                            f9 = 0.0f;
                            i10 = 1;
                        }
                        if (i12 != -1) {
                            C2962b c2962b4 = this.f24470f[i12];
                            c2962b4.f24460a.f24484d = -1;
                            c2962b4.g(((C2966f[]) this.l.f21619a)[i13]);
                            C2966f c2966f = c2962b4.f24460a;
                            c2966f.f24484d = i12;
                            c2966f.e(this, c2962b4);
                        } else {
                            z8 = true;
                        }
                        if (i11 > this.f24473i / 2) {
                            z8 = true;
                        }
                        f9 = 0.0f;
                        i10 = 1;
                    }
                }
            }
            i9++;
        }
        r(c2962b);
        i();
    }

    public final void r(C2962b c2962b) {
        for (int i9 = 0; i9 < this.f24473i; i9++) {
            this.f24472h[i9] = false;
        }
        boolean z8 = false;
        int i10 = 0;
        while (!z8) {
            i10++;
            if (i10 >= this.f24473i * 2) {
                return;
            }
            C2966f c2966f = c2962b.f24460a;
            if (c2966f != null) {
                this.f24472h[c2966f.f24483c] = true;
            }
            C2966f d2 = c2962b.d(this.f24472h);
            if (d2 != null) {
                boolean[] zArr = this.f24472h;
                int i11 = d2.f24483c;
                if (zArr[i11]) {
                    return;
                } else {
                    zArr[i11] = true;
                }
            }
            if (d2 != null) {
                float f9 = Float.MAX_VALUE;
                int i12 = -1;
                for (int i13 = 0; i13 < this.f24474j; i13++) {
                    C2962b c2962b2 = this.f24470f[i13];
                    if (c2962b2.f24460a.f24491n != 1 && !c2962b2.f24463e && c2962b2.f24462d.c(d2)) {
                        float e4 = c2962b2.f24462d.e(d2);
                        if (e4 < 0.0f) {
                            float f10 = (-c2962b2.b) / e4;
                            if (f10 < f9) {
                                i12 = i13;
                                f9 = f10;
                            }
                        }
                    }
                }
                if (i12 > -1) {
                    C2962b c2962b3 = this.f24470f[i12];
                    c2962b3.f24460a.f24484d = -1;
                    c2962b3.g(d2);
                    C2966f c2966f2 = c2962b3.f24460a;
                    c2966f2.f24484d = i12;
                    c2966f2.e(this, c2962b3);
                }
            } else {
                z8 = true;
            }
        }
    }

    public final void s() {
        for (int i9 = 0; i9 < this.f24474j; i9++) {
            C2962b c2962b = this.f24470f[i9];
            if (c2962b != null) {
                ((S.d) this.l.b).a(c2962b);
            }
            this.f24470f[i9] = null;
        }
    }

    public final void t() {
        k kVar;
        int i9 = 0;
        while (true) {
            kVar = this.l;
            C2966f[] c2966fArr = (C2966f[]) kVar.f21619a;
            if (i9 >= c2966fArr.length) {
                break;
            }
            C2966f c2966f = c2966fArr[i9];
            if (c2966f != null) {
                c2966f.c();
            }
            i9++;
        }
        S.d dVar = (S.d) kVar.f21620c;
        C2966f[] c2966fArr2 = this.m;
        int i10 = this.f24476n;
        dVar.getClass();
        if (i10 > c2966fArr2.length) {
            i10 = c2966fArr2.length;
        }
        for (int i11 = 0; i11 < i10; i11++) {
            C2966f c2966f2 = c2966fArr2[i11];
            int i12 = dVar.f2768c;
            Object[] objArr = dVar.b;
            if (i12 < objArr.length) {
                objArr[i12] = c2966f2;
                dVar.f2768c = i12 + 1;
            }
        }
        this.f24476n = 0;
        Arrays.fill((C2966f[]) kVar.f21619a, (Object) null);
        this.b = 0;
        C2964d c2964d = this.f24467c;
        c2964d.f24480h = 0;
        c2964d.b = 0.0f;
        this.f24473i = 1;
        for (int i13 = 0; i13 < this.f24474j; i13++) {
            C2962b c2962b = this.f24470f[i13];
        }
        s();
        this.f24474j = 0;
        this.f24477o = new C2962b(kVar);
    }
}
