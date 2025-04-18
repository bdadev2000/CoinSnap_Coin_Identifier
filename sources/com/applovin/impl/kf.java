package com.applovin.impl;

import android.util.Pair;
import com.applovin.exoplayer2.common.base.Function;
import com.applovin.impl.d9;
import com.applovin.impl.ej;
import com.applovin.impl.i1;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class kf implements i8, ej {

    /* renamed from: y */
    public static final m8 f5681y = new ht(8);
    private final int a;

    /* renamed from: b */
    private final yg f5682b;

    /* renamed from: c */
    private final yg f5683c;

    /* renamed from: d */
    private final yg f5684d;

    /* renamed from: e */
    private final yg f5685e;

    /* renamed from: f */
    private final ArrayDeque f5686f;

    /* renamed from: g */
    private final ij f5687g;

    /* renamed from: h */
    private final List f5688h;

    /* renamed from: i */
    private int f5689i;

    /* renamed from: j */
    private int f5690j;

    /* renamed from: k */
    private long f5691k;

    /* renamed from: l */
    private int f5692l;

    /* renamed from: m */
    private yg f5693m;

    /* renamed from: n */
    private int f5694n;

    /* renamed from: o */
    private int f5695o;

    /* renamed from: p */
    private int f5696p;

    /* renamed from: q */
    private int f5697q;

    /* renamed from: r */
    private k8 f5698r;

    /* renamed from: s */
    private a[] f5699s;

    /* renamed from: t */
    private long[][] f5700t;
    private int u;

    /* renamed from: v */
    private long f5701v;

    /* renamed from: w */
    private int f5702w;

    /* renamed from: x */
    private Cif f5703x;

    /* loaded from: classes.dex */
    public static final class a {
        public final mo a;

        /* renamed from: b */
        public final so f5704b;

        /* renamed from: c */
        public final ro f5705c;

        /* renamed from: d */
        public int f5706d;

        public a(mo moVar, so soVar, ro roVar) {
            this.a = moVar;
            this.f5704b = soVar;
            this.f5705c = roVar;
        }
    }

    public kf() {
        this(0);
    }

    private static int a(int i10) {
        if (i10 != 1751476579) {
            return i10 != 1903435808 ? 0 : 1;
        }
        return 2;
    }

    private static boolean c(int i10) {
        return i10 == 1835296868 || i10 == 1836476516 || i10 == 1751411826 || i10 == 1937011556 || i10 == 1937011827 || i10 == 1937011571 || i10 == 1668576371 || i10 == 1701606260 || i10 == 1937011555 || i10 == 1937011578 || i10 == 1937013298 || i10 == 1937007471 || i10 == 1668232756 || i10 == 1953196132 || i10 == 1718909296 || i10 == 1969517665 || i10 == 1801812339 || i10 == 1768715124;
    }

    private void e() {
        this.f5689i = 0;
        this.f5692l = 0;
    }

    private void f(long j3) {
        for (a aVar : this.f5699s) {
            so soVar = aVar.f5704b;
            int a10 = soVar.a(j3);
            if (a10 == -1) {
                a10 = soVar.b(j3);
            }
            aVar.f5706d = a10;
        }
    }

    private void g() {
        we weVar;
        if (this.f5702w == 2 && (this.a & 2) != 0) {
            k8 k8Var = (k8) a1.a(this.f5698r);
            ro a10 = k8Var.a(0, 4);
            if (this.f5703x == null) {
                weVar = null;
            } else {
                weVar = new we(this.f5703x);
            }
            a10.a(new d9.b().a(weVar).a());
            k8Var.c();
            k8Var.a(new ej.b(C.TIME_UNSET));
        }
    }

    public static /* synthetic */ i8[] h() {
        return f();
    }

    @Override // com.applovin.impl.ej
    public boolean b() {
        return true;
    }

    @Override // com.applovin.impl.ej
    public long d() {
        return this.f5701v;
    }

    public kf(int i10) {
        this.a = i10;
        this.f5689i = (i10 & 4) != 0 ? 3 : 0;
        this.f5687g = new ij();
        this.f5688h = new ArrayList();
        this.f5685e = new yg(16);
        this.f5686f = new ArrayDeque();
        this.f5682b = new yg(uf.a);
        this.f5683c = new yg(4);
        this.f5684d = new yg();
        this.f5694n = -1;
    }

    public static /* synthetic */ mo a(mo moVar) {
        return moVar;
    }

    private static boolean b(int i10) {
        return i10 == 1836019574 || i10 == 1953653099 || i10 == 1835297121 || i10 == 1835626086 || i10 == 1937007212 || i10 == 1701082227 || i10 == 1835365473;
    }

    private int c(long j3) {
        int i10 = -1;
        int i11 = -1;
        long j10 = Long.MAX_VALUE;
        boolean z10 = true;
        long j11 = Long.MAX_VALUE;
        boolean z11 = true;
        long j12 = Long.MAX_VALUE;
        for (int i12 = 0; i12 < ((a[]) yp.a((Object) this.f5699s)).length; i12++) {
            a aVar = this.f5699s[i12];
            int i13 = aVar.f5706d;
            so soVar = aVar.f5704b;
            if (i13 != soVar.f8063b) {
                long j13 = soVar.f8064c[i13];
                long j14 = ((long[][]) yp.a((Object) this.f5700t))[i12][i13];
                long j15 = j13 - j3;
                boolean z12 = j15 < 0 || j15 >= 262144;
                if ((!z12 && z11) || (z12 == z11 && j15 < j12)) {
                    z11 = z12;
                    j12 = j15;
                    i11 = i12;
                    j11 = j14;
                }
                if (j14 < j10) {
                    z10 = z12;
                    i10 = i12;
                    j10 = j14;
                }
            }
        }
        return (j10 == Long.MAX_VALUE || !z10 || j11 < j10 + 10485760) ? i11 : i10;
    }

    private void d(long j3) {
        while (!this.f5686f.isEmpty() && ((i1.a) this.f5686f.peek()).f5235b == j3) {
            i1.a aVar = (i1.a) this.f5686f.pop();
            if (aVar.a == 1836019574) {
                a(aVar);
                this.f5686f.clear();
                this.f5689i = 2;
            } else if (!this.f5686f.isEmpty()) {
                ((i1.a) this.f5686f.peek()).a(aVar);
            }
        }
        if (this.f5689i != 2) {
            e();
        }
    }

    private void e(long j3) {
        if (this.f5690j == 1836086884) {
            long j10 = this.f5692l;
            this.f5703x = new Cif(0L, j3, C.TIME_UNSET, j3 + j10, this.f5691k - j10);
        }
    }

    @Override // com.applovin.impl.i8
    public void a() {
    }

    @Override // com.applovin.impl.ej
    public ej.a b(long j3) {
        long j10;
        long j11;
        long j12;
        long j13;
        int b3;
        if (((a[]) a1.a(this.f5699s)).length == 0) {
            return new ej.a(gj.f4942c);
        }
        int i10 = this.u;
        if (i10 != -1) {
            so soVar = this.f5699s[i10].f5704b;
            int a10 = a(soVar, j3);
            if (a10 == -1) {
                return new ej.a(gj.f4942c);
            }
            long j14 = soVar.f8067f[a10];
            j10 = soVar.f8064c[a10];
            if (j14 >= j3 || a10 >= soVar.f8063b - 1 || (b3 = soVar.b(j3)) == -1 || b3 == a10) {
                j13 = -1;
                j12 = -9223372036854775807L;
            } else {
                j12 = soVar.f8067f[b3];
                j13 = soVar.f8064c[b3];
            }
            j11 = j13;
            j3 = j14;
        } else {
            j10 = Long.MAX_VALUE;
            j11 = -1;
            j12 = -9223372036854775807L;
        }
        int i11 = 0;
        while (true) {
            a[] aVarArr = this.f5699s;
            if (i11 >= aVarArr.length) {
                break;
            }
            if (i11 != this.u) {
                so soVar2 = aVarArr[i11].f5704b;
                long a11 = a(soVar2, j3, j10);
                if (j12 != C.TIME_UNSET) {
                    j11 = a(soVar2, j12, j11);
                }
                j10 = a11;
            }
            i11++;
        }
        gj gjVar = new gj(j3, j10);
        if (j12 == C.TIME_UNSET) {
            return new ej.a(gjVar);
        }
        return new ej.a(gjVar, new gj(j12, j11));
    }

    private static long[][] a(a[] aVarArr) {
        long[][] jArr = new long[aVarArr.length];
        int[] iArr = new int[aVarArr.length];
        long[] jArr2 = new long[aVarArr.length];
        boolean[] zArr = new boolean[aVarArr.length];
        for (int i10 = 0; i10 < aVarArr.length; i10++) {
            jArr[i10] = new long[aVarArr[i10].f5704b.f8063b];
            jArr2[i10] = aVarArr[i10].f5704b.f8067f[0];
        }
        long j3 = 0;
        int i11 = 0;
        while (i11 < aVarArr.length) {
            long j10 = Long.MAX_VALUE;
            int i12 = -1;
            for (int i13 = 0; i13 < aVarArr.length; i13++) {
                if (!zArr[i13]) {
                    long j11 = jArr2[i13];
                    if (j11 <= j10) {
                        i12 = i13;
                        j10 = j11;
                    }
                }
            }
            int i14 = iArr[i12];
            long[] jArr3 = jArr[i12];
            jArr3[i14] = j3;
            so soVar = aVarArr[i12].f5704b;
            j3 += soVar.f8065d[i14];
            int i15 = i14 + 1;
            iArr[i12] = i15;
            if (i15 < jArr3.length) {
                jArr2[i12] = soVar.f8067f[i15];
            } else {
                zArr[i12] = true;
                i11++;
            }
        }
        return jArr;
    }

    public static /* synthetic */ i8[] f() {
        return new i8[]{new kf()};
    }

    private boolean c(j8 j8Var) {
        i1.a aVar;
        if (this.f5692l == 0) {
            if (!j8Var.a(this.f5685e.c(), 0, 8, true)) {
                g();
                return false;
            }
            this.f5692l = 8;
            this.f5685e.f(0);
            this.f5691k = this.f5685e.y();
            this.f5690j = this.f5685e.j();
        }
        long j3 = this.f5691k;
        if (j3 == 1) {
            j8Var.d(this.f5685e.c(), 8, 8);
            this.f5692l += 8;
            this.f5691k = this.f5685e.B();
        } else if (j3 == 0) {
            long a10 = j8Var.a();
            if (a10 == -1 && (aVar = (i1.a) this.f5686f.peek()) != null) {
                a10 = aVar.f5235b;
            }
            if (a10 != -1) {
                this.f5691k = (a10 - j8Var.f()) + this.f5692l;
            }
        }
        if (this.f5691k >= this.f5692l) {
            if (b(this.f5690j)) {
                long f10 = j8Var.f();
                long j10 = this.f5691k;
                long j11 = this.f5692l;
                long j12 = (f10 + j10) - j11;
                if (j10 != j11 && this.f5690j == 1835365473) {
                    b(j8Var);
                }
                this.f5686f.push(new i1.a(this.f5690j, j12));
                if (this.f5691k == this.f5692l) {
                    d(j12);
                } else {
                    e();
                }
            } else if (c(this.f5690j)) {
                a1.b(this.f5692l == 8);
                a1.b(this.f5691k <= 2147483647L);
                yg ygVar = new yg((int) this.f5691k);
                System.arraycopy(this.f5685e.c(), 0, ygVar.c(), 0, 8);
                this.f5693m = ygVar;
                this.f5689i = 1;
            } else {
                e(j8Var.f() - this.f5692l);
                this.f5693m = null;
                this.f5689i = 1;
            }
            return true;
        }
        throw ah.a("Atom size less than header length (unsupported).");
    }

    private int d(j8 j8Var, qh qhVar) {
        int a10 = this.f5687g.a(j8Var, qhVar, this.f5688h);
        if (a10 == 1 && qhVar.a == 0) {
            e();
        }
        return a10;
    }

    private static int a(so soVar, long j3) {
        int a10 = soVar.a(j3);
        return a10 == -1 ? soVar.b(j3) : a10;
    }

    @Override // com.applovin.impl.i8
    public void a(k8 k8Var) {
        this.f5698r = k8Var;
    }

    private static long a(so soVar, long j3, long j10) {
        int a10 = a(soVar, j3);
        return a10 == -1 ? j10 : Math.min(soVar.f8064c[a10], j10);
    }

    private void b(j8 j8Var) {
        this.f5684d.d(8);
        j8Var.c(this.f5684d.c(), 0, 8);
        j1.a(this.f5684d);
        j8Var.a(this.f5684d.d());
        j8Var.b();
    }

    private static int a(yg ygVar) {
        ygVar.f(8);
        int a10 = a(ygVar.j());
        if (a10 != 0) {
            return a10;
        }
        ygVar.g(4);
        while (ygVar.a() > 0) {
            int a11 = a(ygVar.j());
            if (a11 != 0) {
                return a11;
            }
        }
        return 0;
    }

    private boolean b(j8 j8Var, qh qhVar) {
        boolean z10;
        long j3 = this.f5691k - this.f5692l;
        long f10 = j8Var.f() + j3;
        yg ygVar = this.f5693m;
        if (ygVar != null) {
            j8Var.d(ygVar.c(), this.f5692l, (int) j3);
            if (this.f5690j == 1718909296) {
                this.f5702w = a(ygVar);
            } else if (!this.f5686f.isEmpty()) {
                ((i1.a) this.f5686f.peek()).a(new i1.b(this.f5690j, ygVar));
            }
        } else if (j3 < 262144) {
            j8Var.a((int) j3);
        } else {
            qhVar.a = j8Var.f() + j3;
            z10 = true;
            d(f10);
            return (z10 || this.f5689i == 2) ? false : true;
        }
        z10 = false;
        d(f10);
        if (z10) {
        }
    }

    private void a(i1.a aVar) {
        we weVar;
        we weVar2;
        ArrayList arrayList;
        List list;
        int i10;
        we weVar3;
        char c10;
        int i11;
        int i12;
        ArrayList arrayList2 = new ArrayList();
        boolean z10 = this.f5702w == 1;
        x9 x9Var = new x9();
        i1.b e2 = aVar.e(1969517665);
        if (e2 != null) {
            Pair a10 = j1.a(e2);
            we weVar4 = (we) a10.first;
            we weVar5 = (we) a10.second;
            if (weVar4 != null) {
                x9Var.a(weVar4);
            }
            weVar = weVar5;
            weVar2 = weVar4;
        } else {
            weVar = null;
            weVar2 = null;
        }
        i1.a d10 = aVar.d(1835365473);
        we b3 = d10 != null ? j1.b(d10) : null;
        List a11 = j1.a(aVar, x9Var, C.TIME_UNSET, (w6) null, (this.a & 1) != 0, z10, new Function() { // from class: com.applovin.impl.bu
            @Override // com.applovin.exoplayer2.common.base.Function
            public final Object apply(Object obj) {
                mo a12;
                a12 = kf.a((mo) obj);
                return a12;
            }
        });
        k8 k8Var = (k8) a1.a(this.f5698r);
        int size = a11.size();
        int i13 = 0;
        int i14 = -1;
        long j3 = C.TIME_UNSET;
        while (i13 < size) {
            so soVar = (so) a11.get(i13);
            if (soVar.f8063b == 0) {
                list = a11;
                i10 = size;
                i11 = i14;
                arrayList = arrayList2;
            } else {
                mo moVar = soVar.a;
                int i15 = i14;
                arrayList = arrayList2;
                long j10 = moVar.f6280e;
                if (j10 == C.TIME_UNSET) {
                    j10 = soVar.f8069h;
                }
                long max = Math.max(j3, j10);
                list = a11;
                i10 = size;
                a aVar2 = new a(moVar, soVar, k8Var.a(i13, moVar.f6277b));
                int i16 = soVar.f8066e + 30;
                d9.b a12 = moVar.f6281f.a();
                a12.i(i16);
                if (moVar.f6277b == 2 && j10 > 0 && (i12 = soVar.f8063b) > 1) {
                    a12.a(i12 / (((float) j10) / 1000000.0f));
                }
                cf.a(moVar.f6277b, x9Var, a12);
                int i17 = moVar.f6277b;
                we[] weVarArr = new we[2];
                weVarArr[0] = weVar;
                if (this.f5688h.isEmpty()) {
                    c10 = 1;
                    weVar3 = null;
                } else {
                    weVar3 = new we(this.f5688h);
                    c10 = 1;
                }
                weVarArr[c10] = weVar3;
                cf.a(i17, weVar2, b3, a12, weVarArr);
                aVar2.f5705c.a(a12.a());
                i11 = i15;
                if (moVar.f6277b == 2 && i11 == -1) {
                    i11 = arrayList.size();
                }
                arrayList.add(aVar2);
                j3 = max;
            }
            i13++;
            i14 = i11;
            arrayList2 = arrayList;
            a11 = list;
            size = i10;
        }
        this.u = i14;
        this.f5701v = j3;
        a[] aVarArr = (a[]) arrayList2.toArray(new a[0]);
        this.f5699s = aVarArr;
        this.f5700t = a(aVarArr);
        k8Var.c();
        k8Var.a(this);
    }

    private int c(j8 j8Var, qh qhVar) {
        long f10 = j8Var.f();
        if (this.f5694n == -1) {
            int c10 = c(f10);
            this.f5694n = c10;
            if (c10 == -1) {
                return -1;
            }
        }
        a aVar = ((a[]) yp.a((Object) this.f5699s))[this.f5694n];
        ro roVar = aVar.f5705c;
        int i10 = aVar.f5706d;
        so soVar = aVar.f5704b;
        long j3 = soVar.f8064c[i10];
        int i11 = soVar.f8065d[i10];
        long j10 = (j3 - f10) + this.f5695o;
        if (j10 >= 0 && j10 < 262144) {
            if (aVar.a.f6282g == 1) {
                j10 += 8;
                i11 -= 8;
            }
            j8Var.a((int) j10);
            mo moVar = aVar.a;
            if (moVar.f6285j != 0) {
                byte[] c11 = this.f5683c.c();
                c11[0] = 0;
                c11[1] = 0;
                c11[2] = 0;
                int i12 = aVar.a.f6285j;
                int i13 = 4 - i12;
                while (this.f5696p < i11) {
                    int i14 = this.f5697q;
                    if (i14 == 0) {
                        j8Var.d(c11, i13, i12);
                        this.f5695o += i12;
                        this.f5683c.f(0);
                        int j11 = this.f5683c.j();
                        if (j11 >= 0) {
                            this.f5697q = j11;
                            this.f5682b.f(0);
                            roVar.a(this.f5682b, 4);
                            this.f5696p += 4;
                            i11 += i13;
                        } else {
                            throw ah.a("Invalid NAL length", null);
                        }
                    } else {
                        int a10 = roVar.a((e5) j8Var, i14, false);
                        this.f5695o += a10;
                        this.f5696p += a10;
                        this.f5697q -= a10;
                    }
                }
            } else {
                if ("audio/ac4".equals(moVar.f6281f.f4228m)) {
                    if (this.f5696p == 0) {
                        n.a(i11, this.f5684d);
                        roVar.a(this.f5684d, 7);
                        this.f5696p += 7;
                    }
                    i11 += 7;
                }
                while (true) {
                    int i15 = this.f5696p;
                    if (i15 >= i11) {
                        break;
                    }
                    int a11 = roVar.a((e5) j8Var, i11 - i15, false);
                    this.f5695o += a11;
                    this.f5696p += a11;
                    this.f5697q -= a11;
                }
            }
            so soVar2 = aVar.f5704b;
            roVar.a(soVar2.f8067f[i10], soVar2.f8068g[i10], i11, 0, null);
            aVar.f5706d++;
            this.f5694n = -1;
            this.f5695o = 0;
            this.f5696p = 0;
            this.f5697q = 0;
            return 0;
        }
        qhVar.a = j3;
        return 1;
    }

    @Override // com.applovin.impl.i8
    public int a(j8 j8Var, qh qhVar) {
        while (true) {
            int i10 = this.f5689i;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        return c(j8Var, qhVar);
                    }
                    if (i10 == 3) {
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
    public void a(long j3, long j10) {
        this.f5686f.clear();
        this.f5692l = 0;
        this.f5694n = -1;
        this.f5695o = 0;
        this.f5696p = 0;
        this.f5697q = 0;
        if (j3 == 0) {
            if (this.f5689i != 3) {
                e();
                return;
            } else {
                this.f5687g.a();
                this.f5688h.clear();
                return;
            }
        }
        if (this.f5699s != null) {
            f(j10);
        }
    }

    @Override // com.applovin.impl.i8
    public boolean a(j8 j8Var) {
        return ik.a(j8Var, (this.a & 2) != 0);
    }
}
