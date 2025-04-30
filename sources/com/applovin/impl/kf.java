package com.applovin.impl;

import android.util.Pair;
import com.applovin.exoplayer2.common.base.Function;
import com.applovin.impl.AbstractC0708i1;
import com.applovin.impl.d9;
import com.applovin.impl.ej;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class kf implements i8, ej {

    /* renamed from: y */
    public static final m8 f8664y = new A0(8);

    /* renamed from: a */
    private final int f8665a;
    private final yg b;

    /* renamed from: c */
    private final yg f8666c;

    /* renamed from: d */
    private final yg f8667d;

    /* renamed from: e */
    private final yg f8668e;

    /* renamed from: f */
    private final ArrayDeque f8669f;

    /* renamed from: g */
    private final ij f8670g;

    /* renamed from: h */
    private final List f8671h;

    /* renamed from: i */
    private int f8672i;

    /* renamed from: j */
    private int f8673j;

    /* renamed from: k */
    private long f8674k;
    private int l;
    private yg m;

    /* renamed from: n */
    private int f8675n;

    /* renamed from: o */
    private int f8676o;

    /* renamed from: p */
    private int f8677p;

    /* renamed from: q */
    private int f8678q;

    /* renamed from: r */
    private k8 f8679r;

    /* renamed from: s */
    private a[] f8680s;

    /* renamed from: t */
    private long[][] f8681t;

    /* renamed from: u */
    private int f8682u;

    /* renamed from: v */
    private long f8683v;

    /* renamed from: w */
    private int f8684w;

    /* renamed from: x */
    private Cif f8685x;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final mo f8686a;
        public final so b;

        /* renamed from: c */
        public final ro f8687c;

        /* renamed from: d */
        public int f8688d;

        public a(mo moVar, so soVar, ro roVar) {
            this.f8686a = moVar;
            this.b = soVar;
            this.f8687c = roVar;
        }
    }

    public kf() {
        this(0);
    }

    private static int a(int i9) {
        if (i9 != 1751476579) {
            return i9 != 1903435808 ? 0 : 1;
        }
        return 2;
    }

    private static boolean c(int i9) {
        return i9 == 1835296868 || i9 == 1836476516 || i9 == 1751411826 || i9 == 1937011556 || i9 == 1937011827 || i9 == 1937011571 || i9 == 1668576371 || i9 == 1701606260 || i9 == 1937011555 || i9 == 1937011578 || i9 == 1937013298 || i9 == 1937007471 || i9 == 1668232756 || i9 == 1953196132 || i9 == 1718909296 || i9 == 1969517665 || i9 == 1801812339 || i9 == 1768715124;
    }

    private void e() {
        this.f8672i = 0;
        this.l = 0;
    }

    private void f(long j7) {
        for (a aVar : this.f8680s) {
            so soVar = aVar.b;
            int a6 = soVar.a(j7);
            if (a6 == -1) {
                a6 = soVar.b(j7);
            }
            aVar.f8688d = a6;
        }
    }

    private void g() {
        we weVar;
        if (this.f8684w == 2 && (this.f8665a & 2) != 0) {
            k8 k8Var = (k8) AbstractC0669a1.a(this.f8679r);
            ro a6 = k8Var.a(0, 4);
            if (this.f8685x == null) {
                weVar = null;
            } else {
                weVar = new we(this.f8685x);
            }
            a6.a(new d9.b().a(weVar).a());
            k8Var.c();
            k8Var.a(new ej.b(com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET));
        }
    }

    @Override // com.applovin.impl.ej
    public long d() {
        return this.f8683v;
    }

    public kf(int i9) {
        this.f8665a = i9;
        this.f8672i = (i9 & 4) != 0 ? 3 : 0;
        this.f8670g = new ij();
        this.f8671h = new ArrayList();
        this.f8668e = new yg(16);
        this.f8669f = new ArrayDeque();
        this.b = new yg(uf.f11591a);
        this.f8666c = new yg(4);
        this.f8667d = new yg();
        this.f8675n = -1;
    }

    public static /* synthetic */ mo a(mo moVar) {
        return moVar;
    }

    private int c(long j7) {
        int i9 = -1;
        int i10 = -1;
        long j9 = Long.MAX_VALUE;
        boolean z8 = true;
        long j10 = Long.MAX_VALUE;
        boolean z9 = true;
        long j11 = Long.MAX_VALUE;
        for (int i11 = 0; i11 < ((a[]) yp.a((Object) this.f8680s)).length; i11++) {
            a aVar = this.f8680s[i11];
            int i12 = aVar.f8688d;
            so soVar = aVar.b;
            if (i12 != soVar.b) {
                long j12 = soVar.f11228c[i12];
                long j13 = ((long[][]) yp.a((Object) this.f8681t))[i11][i12];
                long j14 = j12 - j7;
                boolean z10 = j14 < 0 || j14 >= 262144;
                if ((!z10 && z9) || (z10 == z9 && j14 < j11)) {
                    z9 = z10;
                    j11 = j14;
                    i10 = i11;
                    j10 = j13;
                }
                if (j13 < j9) {
                    z8 = z10;
                    i9 = i11;
                    j9 = j13;
                }
            }
        }
        return (j9 == Long.MAX_VALUE || !z8 || j10 < j9 + 10485760) ? i10 : i9;
    }

    private void d(long j7) {
        while (!this.f8669f.isEmpty() && ((AbstractC0708i1.a) this.f8669f.peek()).b == j7) {
            AbstractC0708i1.a aVar = (AbstractC0708i1.a) this.f8669f.pop();
            if (aVar.f8200a == 1836019574) {
                a(aVar);
                this.f8669f.clear();
                this.f8672i = 2;
            } else if (!this.f8669f.isEmpty()) {
                ((AbstractC0708i1.a) this.f8669f.peek()).a(aVar);
            }
        }
        if (this.f8672i != 2) {
            e();
        }
    }

    @Override // com.applovin.impl.ej
    public boolean b() {
        return true;
    }

    private static boolean b(int i9) {
        return i9 == 1836019574 || i9 == 1953653099 || i9 == 1835297121 || i9 == 1835626086 || i9 == 1937007212 || i9 == 1701082227 || i9 == 1835365473;
    }

    private void e(long j7) {
        if (this.f8673j == 1836086884) {
            long j9 = this.l;
            this.f8685x = new Cif(0L, j7, com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET, j7 + j9, this.f8674k - j9);
        }
    }

    @Override // com.applovin.impl.i8
    public void a() {
    }

    private static long[][] a(a[] aVarArr) {
        long[][] jArr = new long[aVarArr.length];
        int[] iArr = new int[aVarArr.length];
        long[] jArr2 = new long[aVarArr.length];
        boolean[] zArr = new boolean[aVarArr.length];
        for (int i9 = 0; i9 < aVarArr.length; i9++) {
            jArr[i9] = new long[aVarArr[i9].b.b];
            jArr2[i9] = aVarArr[i9].b.f11231f[0];
        }
        long j7 = 0;
        int i10 = 0;
        while (i10 < aVarArr.length) {
            long j9 = Long.MAX_VALUE;
            int i11 = -1;
            for (int i12 = 0; i12 < aVarArr.length; i12++) {
                if (!zArr[i12]) {
                    long j10 = jArr2[i12];
                    if (j10 <= j9) {
                        i11 = i12;
                        j9 = j10;
                    }
                }
            }
            int i13 = iArr[i11];
            long[] jArr3 = jArr[i11];
            jArr3[i13] = j7;
            so soVar = aVarArr[i11].b;
            j7 += soVar.f11229d[i13];
            int i14 = i13 + 1;
            iArr[i11] = i14;
            if (i14 < jArr3.length) {
                jArr2[i11] = soVar.f11231f[i14];
            } else {
                zArr[i11] = true;
                i10++;
            }
        }
        return jArr;
    }

    @Override // com.applovin.impl.ej
    public ej.a b(long j7) {
        long j9;
        long j10;
        long j11;
        long j12;
        int b;
        if (((a[]) AbstractC0669a1.a(this.f8680s)).length == 0) {
            return new ej.a(gj.f7917c);
        }
        int i9 = this.f8682u;
        if (i9 != -1) {
            so soVar = this.f8680s[i9].b;
            int a6 = a(soVar, j7);
            if (a6 == -1) {
                return new ej.a(gj.f7917c);
            }
            long j13 = soVar.f11231f[a6];
            j9 = soVar.f11228c[a6];
            if (j13 >= j7 || a6 >= soVar.b - 1 || (b = soVar.b(j7)) == -1 || b == a6) {
                j12 = -1;
                j11 = -9223372036854775807L;
            } else {
                j11 = soVar.f11231f[b];
                j12 = soVar.f11228c[b];
            }
            j10 = j12;
            j7 = j13;
        } else {
            j9 = Long.MAX_VALUE;
            j10 = -1;
            j11 = -9223372036854775807L;
        }
        int i10 = 0;
        while (true) {
            a[] aVarArr = this.f8680s;
            if (i10 >= aVarArr.length) {
                break;
            }
            if (i10 != this.f8682u) {
                so soVar2 = aVarArr[i10].b;
                long a9 = a(soVar2, j7, j9);
                if (j11 != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                    j10 = a(soVar2, j11, j10);
                }
                j9 = a9;
            }
            i10++;
        }
        gj gjVar = new gj(j7, j9);
        if (j11 == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
            return new ej.a(gjVar);
        }
        return new ej.a(gjVar, new gj(j11, j10));
    }

    public static /* synthetic */ i8[] f() {
        return new i8[]{new kf()};
    }

    private boolean c(j8 j8Var) {
        AbstractC0708i1.a aVar;
        if (this.l == 0) {
            if (!j8Var.a(this.f8668e.c(), 0, 8, true)) {
                g();
                return false;
            }
            this.l = 8;
            this.f8668e.f(0);
            this.f8674k = this.f8668e.y();
            this.f8673j = this.f8668e.j();
        }
        long j7 = this.f8674k;
        if (j7 == 1) {
            j8Var.d(this.f8668e.c(), 8, 8);
            this.l += 8;
            this.f8674k = this.f8668e.B();
        } else if (j7 == 0) {
            long a6 = j8Var.a();
            if (a6 == -1 && (aVar = (AbstractC0708i1.a) this.f8669f.peek()) != null) {
                a6 = aVar.b;
            }
            if (a6 != -1) {
                this.f8674k = (a6 - j8Var.f()) + this.l;
            }
        }
        if (this.f8674k >= this.l) {
            if (b(this.f8673j)) {
                long f9 = j8Var.f();
                long j9 = this.f8674k;
                long j10 = this.l;
                long j11 = (f9 + j9) - j10;
                if (j9 != j10 && this.f8673j == 1835365473) {
                    b(j8Var);
                }
                this.f8669f.push(new AbstractC0708i1.a(this.f8673j, j11));
                if (this.f8674k == this.l) {
                    d(j11);
                } else {
                    e();
                }
            } else if (c(this.f8673j)) {
                AbstractC0669a1.b(this.l == 8);
                AbstractC0669a1.b(this.f8674k <= 2147483647L);
                yg ygVar = new yg((int) this.f8674k);
                System.arraycopy(this.f8668e.c(), 0, ygVar.c(), 0, 8);
                this.m = ygVar;
                this.f8672i = 1;
            } else {
                e(j8Var.f() - this.l);
                this.m = null;
                this.f8672i = 1;
            }
            return true;
        }
        throw ah.a("Atom size less than header length (unsupported).");
    }

    private int d(j8 j8Var, qh qhVar) {
        int a6 = this.f8670g.a(j8Var, qhVar, this.f8671h);
        if (a6 == 1 && qhVar.f10346a == 0) {
            e();
        }
        return a6;
    }

    private static int a(so soVar, long j7) {
        int a6 = soVar.a(j7);
        return a6 == -1 ? soVar.b(j7) : a6;
    }

    @Override // com.applovin.impl.i8
    public void a(k8 k8Var) {
        this.f8679r = k8Var;
    }

    private static long a(so soVar, long j7, long j9) {
        int a6 = a(soVar, j7);
        return a6 == -1 ? j9 : Math.min(soVar.f11228c[a6], j9);
    }

    private void b(j8 j8Var) {
        this.f8667d.d(8);
        j8Var.c(this.f8667d.c(), 0, 8);
        AbstractC0712j1.a(this.f8667d);
        j8Var.a(this.f8667d.d());
        j8Var.b();
    }

    private static int a(yg ygVar) {
        ygVar.f(8);
        int a6 = a(ygVar.j());
        if (a6 != 0) {
            return a6;
        }
        ygVar.g(4);
        while (ygVar.a() > 0) {
            int a9 = a(ygVar.j());
            if (a9 != 0) {
                return a9;
            }
        }
        return 0;
    }

    private boolean b(j8 j8Var, qh qhVar) {
        boolean z8;
        long j7 = this.f8674k - this.l;
        long f9 = j8Var.f() + j7;
        yg ygVar = this.m;
        if (ygVar != null) {
            j8Var.d(ygVar.c(), this.l, (int) j7);
            if (this.f8673j == 1718909296) {
                this.f8684w = a(ygVar);
            } else if (!this.f8669f.isEmpty()) {
                ((AbstractC0708i1.a) this.f8669f.peek()).a(new AbstractC0708i1.b(this.f8673j, ygVar));
            }
        } else if (j7 < 262144) {
            j8Var.a((int) j7);
        } else {
            qhVar.f10346a = j8Var.f() + j7;
            z8 = true;
            d(f9);
            return (z8 || this.f8672i == 2) ? false : true;
        }
        z8 = false;
        d(f9);
        if (z8) {
        }
    }

    /* JADX WARN: Type inference failed for: r16v0, types: [com.applovin.exoplayer2.common.base.Function, java.lang.Object] */
    private void a(AbstractC0708i1.a aVar) {
        we weVar;
        we weVar2;
        ArrayList arrayList;
        List list;
        int i9;
        ArrayList arrayList2 = new ArrayList();
        boolean z8 = this.f8684w == 1;
        x9 x9Var = new x9();
        AbstractC0708i1.b e4 = aVar.e(1969517665);
        if (e4 != null) {
            Pair a6 = AbstractC0712j1.a(e4);
            we weVar3 = (we) a6.first;
            we weVar4 = (we) a6.second;
            if (weVar3 != null) {
                x9Var.a(weVar3);
            }
            weVar = weVar4;
            weVar2 = weVar3;
        } else {
            weVar = null;
            weVar2 = null;
        }
        AbstractC0708i1.a d2 = aVar.d(1835365473);
        we b = d2 != null ? AbstractC0712j1.b(d2) : null;
        List a9 = AbstractC0712j1.a(aVar, x9Var, com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET, (w6) null, (this.f8665a & 1) != 0, z8, (Function) new Object());
        k8 k8Var = (k8) AbstractC0669a1.a(this.f8679r);
        int size = a9.size();
        int i10 = 0;
        int i11 = -1;
        long j7 = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        while (i10 < size) {
            so soVar = (so) a9.get(i10);
            if (soVar.b == 0) {
                list = a9;
                i9 = size;
                arrayList = arrayList2;
            } else {
                mo moVar = soVar.f11227a;
                int i12 = i11;
                arrayList = arrayList2;
                long j9 = moVar.f9215e;
                if (j9 == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                    j9 = soVar.f11233h;
                }
                long max = Math.max(j7, j9);
                list = a9;
                i9 = size;
                a aVar2 = new a(moVar, soVar, k8Var.a(i10, moVar.b));
                int i13 = soVar.f11230e + 30;
                d9.b a10 = moVar.f9216f.a();
                a10.i(i13);
                if (moVar.b == 2 && j9 > 0) {
                    int i14 = soVar.b;
                    if (i14 > 1) {
                        a10.a(i14 / (((float) j9) / 1000000.0f));
                    }
                }
                cf.a(moVar.b, x9Var, a10);
                cf.a(moVar.b, weVar2, b, a10, weVar, this.f8671h.isEmpty() ? null : new we(this.f8671h));
                aVar2.f8687c.a(a10.a());
                if (moVar.b == 2 && i12 == -1) {
                    i11 = arrayList.size();
                    arrayList.add(aVar2);
                    j7 = max;
                }
                i11 = i12;
                arrayList.add(aVar2);
                j7 = max;
            }
            i10++;
            arrayList2 = arrayList;
            a9 = list;
            size = i9;
        }
        this.f8682u = i11;
        this.f8683v = j7;
        a[] aVarArr = (a[]) arrayList2.toArray(new a[0]);
        this.f8680s = aVarArr;
        this.f8681t = a(aVarArr);
        k8Var.c();
        k8Var.a(this);
    }

    private int c(j8 j8Var, qh qhVar) {
        long f9 = j8Var.f();
        if (this.f8675n == -1) {
            int c9 = c(f9);
            this.f8675n = c9;
            if (c9 == -1) {
                return -1;
            }
        }
        a aVar = ((a[]) yp.a((Object) this.f8680s))[this.f8675n];
        ro roVar = aVar.f8687c;
        int i9 = aVar.f8688d;
        so soVar = aVar.b;
        long j7 = soVar.f11228c[i9];
        int i10 = soVar.f11229d[i9];
        long j9 = (j7 - f9) + this.f8676o;
        if (j9 >= 0 && j9 < 262144) {
            if (aVar.f8686a.f9217g == 1) {
                j9 += 8;
                i10 -= 8;
            }
            j8Var.a((int) j9);
            mo moVar = aVar.f8686a;
            if (moVar.f9220j != 0) {
                byte[] c10 = this.f8666c.c();
                c10[0] = 0;
                c10[1] = 0;
                c10[2] = 0;
                int i11 = aVar.f8686a.f9220j;
                int i12 = 4 - i11;
                while (this.f8677p < i10) {
                    int i13 = this.f8678q;
                    if (i13 == 0) {
                        j8Var.d(c10, i12, i11);
                        this.f8676o += i11;
                        this.f8666c.f(0);
                        int j10 = this.f8666c.j();
                        if (j10 >= 0) {
                            this.f8678q = j10;
                            this.b.f(0);
                            roVar.a(this.b, 4);
                            this.f8677p += 4;
                            i10 += i12;
                        } else {
                            throw ah.a("Invalid NAL length", null);
                        }
                    } else {
                        int a6 = roVar.a((e5) j8Var, i13, false);
                        this.f8676o += a6;
                        this.f8677p += a6;
                        this.f8678q -= a6;
                    }
                }
            } else {
                if ("audio/ac4".equals(moVar.f9216f.m)) {
                    if (this.f8677p == 0) {
                        AbstractC0726n.a(i10, this.f8667d);
                        roVar.a(this.f8667d, 7);
                        this.f8677p += 7;
                    }
                    i10 += 7;
                }
                while (true) {
                    int i14 = this.f8677p;
                    if (i14 >= i10) {
                        break;
                    }
                    int a9 = roVar.a((e5) j8Var, i10 - i14, false);
                    this.f8676o += a9;
                    this.f8677p += a9;
                    this.f8678q -= a9;
                }
            }
            int i15 = i10;
            so soVar2 = aVar.b;
            roVar.a(soVar2.f11231f[i9], soVar2.f11232g[i9], i15, 0, null);
            aVar.f8688d++;
            this.f8675n = -1;
            this.f8676o = 0;
            this.f8677p = 0;
            this.f8678q = 0;
            return 0;
        }
        qhVar.f10346a = j7;
        return 1;
    }

    @Override // com.applovin.impl.i8
    public int a(j8 j8Var, qh qhVar) {
        while (true) {
            int i9 = this.f8672i;
            if (i9 != 0) {
                if (i9 != 1) {
                    if (i9 == 2) {
                        return c(j8Var, qhVar);
                    }
                    if (i9 == 3) {
                        return d(j8Var, qhVar);
                    }
                    throw new IllegalStateException();
                }
                if (b(j8Var, qhVar)) {
                    return 1;
                }
            } else if (!c(j8Var)) {
                return -1;
            }
        }
    }

    @Override // com.applovin.impl.i8
    public void a(long j7, long j9) {
        this.f8669f.clear();
        this.l = 0;
        this.f8675n = -1;
        this.f8676o = 0;
        this.f8677p = 0;
        this.f8678q = 0;
        if (j7 == 0) {
            if (this.f8672i != 3) {
                e();
                return;
            } else {
                this.f8670g.a();
                this.f8671h.clear();
                return;
            }
        }
        if (this.f8680s != null) {
            f(j9);
        }
    }

    @Override // com.applovin.impl.i8
    public boolean a(j8 j8Var) {
        return ik.a(j8Var, (this.f8665a & 2) != 0);
    }
}
