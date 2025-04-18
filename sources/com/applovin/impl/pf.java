package com.applovin.impl;

import android.util.Pair;
import com.applovin.exoplayer2.common.base.Function;
import com.applovin.impl.f9;
import com.applovin.impl.ij;
import com.applovin.impl.j1;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class pf implements k8, ij {

    /* renamed from: y */
    public static final o8 f26034y = new dt(11);

    /* renamed from: a */
    private final int f26035a;

    /* renamed from: b */
    private final bh f26036b;

    /* renamed from: c */
    private final bh f26037c;
    private final bh d;
    private final bh e;

    /* renamed from: f */
    private final ArrayDeque f26038f;

    /* renamed from: g */
    private final mj f26039g;

    /* renamed from: h */
    private final List f26040h;

    /* renamed from: i */
    private int f26041i;

    /* renamed from: j */
    private int f26042j;

    /* renamed from: k */
    private long f26043k;

    /* renamed from: l */
    private int f26044l;

    /* renamed from: m */
    private bh f26045m;

    /* renamed from: n */
    private int f26046n;

    /* renamed from: o */
    private int f26047o;

    /* renamed from: p */
    private int f26048p;

    /* renamed from: q */
    private int f26049q;

    /* renamed from: r */
    private m8 f26050r;

    /* renamed from: s */
    private a[] f26051s;

    /* renamed from: t */
    private long[][] f26052t;

    /* renamed from: u */
    private int f26053u;

    /* renamed from: v */
    private long f26054v;
    private int w;
    private nf x;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final lo f26055a;

        /* renamed from: b */
        public final ro f26056b;

        /* renamed from: c */
        public final qo f26057c;
        public int d;

        public a(lo loVar, ro roVar, qo qoVar) {
            this.f26055a = loVar;
            this.f26056b = roVar;
            this.f26057c = qoVar;
        }
    }

    public pf() {
        this(0);
    }

    private static int a(int i2) {
        if (i2 != 1751476579) {
            return i2 != 1903435808 ? 0 : 1;
        }
        return 2;
    }

    private static boolean c(int i2) {
        return i2 == 1835296868 || i2 == 1836476516 || i2 == 1751411826 || i2 == 1937011556 || i2 == 1937011827 || i2 == 1937011571 || i2 == 1668576371 || i2 == 1701606260 || i2 == 1937011555 || i2 == 1937011578 || i2 == 1937013298 || i2 == 1937007471 || i2 == 1668232756 || i2 == 1953196132 || i2 == 1718909296 || i2 == 1969517665 || i2 == 1801812339 || i2 == 1768715124;
    }

    private void e() {
        this.f26041i = 0;
        this.f26044l = 0;
    }

    private void f(long j2) {
        for (a aVar : this.f26051s) {
            ro roVar = aVar.f26056b;
            int a2 = roVar.a(j2);
            if (a2 == -1) {
                a2 = roVar.b(j2);
            }
            aVar.d = a2;
        }
    }

    private void g() {
        if (this.w != 2 || (this.f26035a & 2) == 0) {
            return;
        }
        m8 m8Var = (m8) b1.a(this.f26050r);
        m8Var.a(0, 4).a(new f9.b().a(this.x == null ? null : new bf(this.x)).a());
        m8Var.c();
        m8Var.a(new ij.b(-9223372036854775807L));
    }

    @Override // com.applovin.impl.ij
    public long d() {
        return this.f26054v;
    }

    public pf(int i2) {
        this.f26035a = i2;
        this.f26041i = (i2 & 4) != 0 ? 3 : 0;
        this.f26039g = new mj();
        this.f26040h = new ArrayList();
        this.e = new bh(16);
        this.f26038f = new ArrayDeque();
        this.f26036b = new bh(zf.f28330a);
        this.f26037c = new bh(4);
        this.d = new bh();
        this.f26046n = -1;
    }

    public static /* synthetic */ lo a(lo loVar) {
        return loVar;
    }

    private int c(long j2) {
        int i2 = -1;
        int i3 = -1;
        long j3 = Long.MAX_VALUE;
        boolean z2 = true;
        long j4 = Long.MAX_VALUE;
        boolean z3 = true;
        long j5 = Long.MAX_VALUE;
        for (int i4 = 0; i4 < ((a[]) xp.a((Object) this.f26051s)).length; i4++) {
            a aVar = this.f26051s[i4];
            int i5 = aVar.d;
            ro roVar = aVar.f26056b;
            if (i5 != roVar.f26359b) {
                long j6 = roVar.f26360c[i5];
                long j7 = ((long[][]) xp.a((Object) this.f26052t))[i4][i5];
                long j8 = j6 - j2;
                boolean z4 = j8 < 0 || j8 >= 262144;
                if ((!z4 && z3) || (z4 == z3 && j8 < j5)) {
                    z3 = z4;
                    j5 = j8;
                    i3 = i4;
                    j4 = j7;
                }
                if (j7 < j3) {
                    z2 = z4;
                    i2 = i4;
                    j3 = j7;
                }
            }
        }
        return (j3 == Long.MAX_VALUE || !z2 || j4 < j3 + 10485760) ? i3 : i2;
    }

    private void d(long j2) {
        while (!this.f26038f.isEmpty() && ((j1.a) this.f26038f.peek()).f24567b == j2) {
            j1.a aVar = (j1.a) this.f26038f.pop();
            if (aVar.f24566a == 1836019574) {
                a(aVar);
                this.f26038f.clear();
                this.f26041i = 2;
            } else if (!this.f26038f.isEmpty()) {
                ((j1.a) this.f26038f.peek()).a(aVar);
            }
        }
        if (this.f26041i != 2) {
            e();
        }
    }

    private void e(long j2) {
        if (this.f26042j == 1836086884) {
            long j3 = this.f26044l;
            this.x = new nf(0L, j2, -9223372036854775807L, j2 + j3, this.f26043k - j3);
        }
    }

    @Override // com.applovin.impl.ij
    public boolean b() {
        return true;
    }

    private static boolean b(int i2) {
        return i2 == 1836019574 || i2 == 1953653099 || i2 == 1835297121 || i2 == 1835626086 || i2 == 1937007212 || i2 == 1701082227 || i2 == 1835365473;
    }

    @Override // com.applovin.impl.k8
    public void a() {
    }

    @Override // com.applovin.impl.k8
    public void a(m8 m8Var) {
        this.f26050r = m8Var;
    }

    @Override // com.applovin.impl.ij
    public ij.a b(long j2) {
        long j3;
        long j4;
        long j5;
        long j6;
        int b2;
        if (((a[]) b1.a(this.f26051s)).length == 0) {
            return new ij.a(kj.f24922c);
        }
        int i2 = this.f26053u;
        if (i2 != -1) {
            ro roVar = this.f26051s[i2].f26056b;
            int a2 = a(roVar, j2);
            if (a2 == -1) {
                return new ij.a(kj.f24922c);
            }
            long j7 = roVar.f26361f[a2];
            j3 = roVar.f26360c[a2];
            if (j7 >= j2 || a2 >= roVar.f26359b - 1 || (b2 = roVar.b(j2)) == -1 || b2 == a2) {
                j6 = -1;
                j5 = -9223372036854775807L;
            } else {
                j5 = roVar.f26361f[b2];
                j6 = roVar.f26360c[b2];
            }
            j4 = j6;
            j2 = j7;
        } else {
            j3 = Long.MAX_VALUE;
            j4 = -1;
            j5 = -9223372036854775807L;
        }
        int i3 = 0;
        while (true) {
            a[] aVarArr = this.f26051s;
            if (i3 >= aVarArr.length) {
                break;
            }
            if (i3 != this.f26053u) {
                ro roVar2 = aVarArr[i3].f26056b;
                long a3 = a(roVar2, j2, j3);
                if (j5 != -9223372036854775807L) {
                    j4 = a(roVar2, j5, j4);
                }
                j3 = a3;
            }
            i3++;
        }
        kj kjVar = new kj(j2, j3);
        if (j5 == -9223372036854775807L) {
            return new ij.a(kjVar);
        }
        return new ij.a(kjVar, new kj(j5, j4));
    }

    private static long[][] a(a[] aVarArr) {
        long[][] jArr = new long[aVarArr.length];
        int[] iArr = new int[aVarArr.length];
        long[] jArr2 = new long[aVarArr.length];
        boolean[] zArr = new boolean[aVarArr.length];
        for (int i2 = 0; i2 < aVarArr.length; i2++) {
            jArr[i2] = new long[aVarArr[i2].f26056b.f26359b];
            jArr2[i2] = aVarArr[i2].f26056b.f26361f[0];
        }
        long j2 = 0;
        int i3 = 0;
        while (i3 < aVarArr.length) {
            long j3 = Long.MAX_VALUE;
            int i4 = -1;
            for (int i5 = 0; i5 < aVarArr.length; i5++) {
                if (!zArr[i5]) {
                    long j4 = jArr2[i5];
                    if (j4 <= j3) {
                        i4 = i5;
                        j3 = j4;
                    }
                }
            }
            int i6 = iArr[i4];
            long[] jArr3 = jArr[i4];
            jArr3[i6] = j2;
            ro roVar = aVarArr[i4].f26056b;
            j2 += roVar.d[i6];
            int i7 = i6 + 1;
            iArr[i4] = i7;
            if (i7 < jArr3.length) {
                jArr2[i4] = roVar.f26361f[i7];
            } else {
                zArr[i4] = true;
                i3++;
            }
        }
        return jArr;
    }

    public static /* synthetic */ k8[] f() {
        return new k8[]{new pf()};
    }

    private boolean c(l8 l8Var) {
        j1.a aVar;
        if (this.f26044l == 0) {
            if (!l8Var.a(this.e.c(), 0, 8, true)) {
                g();
                return false;
            }
            this.f26044l = 8;
            this.e.f(0);
            this.f26043k = this.e.y();
            this.f26042j = this.e.j();
        }
        long j2 = this.f26043k;
        if (j2 == 1) {
            l8Var.d(this.e.c(), 8, 8);
            this.f26044l += 8;
            this.f26043k = this.e.B();
        } else if (j2 == 0) {
            long a2 = l8Var.a();
            if (a2 == -1 && (aVar = (j1.a) this.f26038f.peek()) != null) {
                a2 = aVar.f24567b;
            }
            if (a2 != -1) {
                this.f26043k = (a2 - l8Var.f()) + this.f26044l;
            }
        }
        if (this.f26043k >= this.f26044l) {
            if (b(this.f26042j)) {
                long f2 = l8Var.f();
                long j3 = this.f26043k;
                long j4 = this.f26044l;
                long j5 = (f2 + j3) - j4;
                if (j3 != j4 && this.f26042j == 1835365473) {
                    b(l8Var);
                }
                this.f26038f.push(new j1.a(this.f26042j, j5));
                if (this.f26043k == this.f26044l) {
                    d(j5);
                } else {
                    e();
                }
            } else if (c(this.f26042j)) {
                b1.b(this.f26044l == 8);
                b1.b(this.f26043k <= 2147483647L);
                bh bhVar = new bh((int) this.f26043k);
                System.arraycopy(this.e.c(), 0, bhVar.c(), 0, 8);
                this.f26045m = bhVar;
                this.f26041i = 1;
            } else {
                e(l8Var.f() - this.f26044l);
                this.f26045m = null;
                this.f26041i = 1;
            }
            return true;
        }
        throw dh.a("Atom size less than header length (unsupported).");
    }

    private int d(l8 l8Var, th thVar) {
        int a2 = this.f26039g.a(l8Var, thVar, this.f26040h);
        if (a2 == 1 && thVar.f27165a == 0) {
            e();
        }
        return a2;
    }

    private static int a(ro roVar, long j2) {
        int a2 = roVar.a(j2);
        return a2 == -1 ? roVar.b(j2) : a2;
    }

    private void b(l8 l8Var) {
        this.d.d(8);
        l8Var.c(this.d.c(), 0, 8);
        k1.a(this.d);
        l8Var.a(this.d.d());
        l8Var.b();
    }

    private static long a(ro roVar, long j2, long j3) {
        int a2 = a(roVar, j2);
        return a2 == -1 ? j3 : Math.min(roVar.f26360c[a2], j3);
    }

    private static int a(bh bhVar) {
        bhVar.f(8);
        int a2 = a(bhVar.j());
        if (a2 != 0) {
            return a2;
        }
        bhVar.g(4);
        while (bhVar.a() > 0) {
            int a3 = a(bhVar.j());
            if (a3 != 0) {
                return a3;
            }
        }
        return 0;
    }

    private boolean b(l8 l8Var, th thVar) {
        boolean z2;
        long j2 = this.f26043k - this.f26044l;
        long f2 = l8Var.f() + j2;
        bh bhVar = this.f26045m;
        if (bhVar != null) {
            l8Var.d(bhVar.c(), this.f26044l, (int) j2);
            if (this.f26042j == 1718909296) {
                this.w = a(bhVar);
            } else if (!this.f26038f.isEmpty()) {
                ((j1.a) this.f26038f.peek()).a(new j1.b(this.f26042j, bhVar));
            }
        } else if (j2 < 262144) {
            l8Var.a((int) j2);
        } else {
            thVar.f27165a = l8Var.f() + j2;
            z2 = true;
            d(f2);
            return (z2 || this.f26041i == 2) ? false : true;
        }
        z2 = false;
        d(f2);
        if (z2) {
        }
    }

    private int c(l8 l8Var, th thVar) {
        long f2 = l8Var.f();
        if (this.f26046n == -1) {
            int c2 = c(f2);
            this.f26046n = c2;
            if (c2 == -1) {
                return -1;
            }
        }
        a aVar = ((a[]) xp.a((Object) this.f26051s))[this.f26046n];
        qo qoVar = aVar.f26057c;
        int i2 = aVar.d;
        ro roVar = aVar.f26056b;
        long j2 = roVar.f26360c[i2];
        int i3 = roVar.d[i2];
        long j3 = (j2 - f2) + this.f26047o;
        if (j3 >= 0 && j3 < 262144) {
            if (aVar.f26055a.f25114g == 1) {
                j3 += 8;
                i3 -= 8;
            }
            l8Var.a((int) j3);
            lo loVar = aVar.f26055a;
            if (loVar.f25117j != 0) {
                byte[] c3 = this.f26037c.c();
                c3[0] = 0;
                c3[1] = 0;
                c3[2] = 0;
                int i4 = aVar.f26055a.f25117j;
                int i5 = 4 - i4;
                while (this.f26048p < i3) {
                    int i6 = this.f26049q;
                    if (i6 == 0) {
                        l8Var.d(c3, i5, i4);
                        this.f26047o += i4;
                        this.f26037c.f(0);
                        int j4 = this.f26037c.j();
                        if (j4 >= 0) {
                            this.f26049q = j4;
                            this.f26036b.f(0);
                            qoVar.a(this.f26036b, 4);
                            this.f26048p += 4;
                            i3 += i5;
                        } else {
                            throw dh.a("Invalid NAL length", null);
                        }
                    } else {
                        int a2 = qoVar.a((g5) l8Var, i6, false);
                        this.f26047o += a2;
                        this.f26048p += a2;
                        this.f26049q -= a2;
                    }
                }
            } else {
                if ("audio/ac4".equals(loVar.f25113f.f23840m)) {
                    if (this.f26048p == 0) {
                        n.a(i3, this.d);
                        qoVar.a(this.d, 7);
                        this.f26048p += 7;
                    }
                    i3 += 7;
                }
                while (true) {
                    int i7 = this.f26048p;
                    if (i7 >= i3) {
                        break;
                    }
                    int a3 = qoVar.a((g5) l8Var, i3 - i7, false);
                    this.f26047o += a3;
                    this.f26048p += a3;
                    this.f26049q -= a3;
                }
            }
            int i8 = i3;
            ro roVar2 = aVar.f26056b;
            qoVar.a(roVar2.f26361f[i2], roVar2.f26362g[i2], i8, 0, null);
            aVar.d++;
            this.f26046n = -1;
            this.f26047o = 0;
            this.f26048p = 0;
            this.f26049q = 0;
            return 0;
        }
        thVar.f27165a = j2;
        return 1;
    }

    /* JADX WARN: Type inference failed for: r16v0, types: [com.applovin.exoplayer2.common.base.Function, java.lang.Object] */
    private void a(j1.a aVar) {
        bf bfVar;
        bf bfVar2;
        ArrayList arrayList;
        List list;
        int i2;
        bf bfVar3;
        char c2;
        int i3;
        int i4;
        ArrayList arrayList2 = new ArrayList();
        boolean z2 = this.w == 1;
        z9 z9Var = new z9();
        j1.b e = aVar.e(1969517665);
        if (e != null) {
            Pair a2 = k1.a(e);
            bf bfVar4 = (bf) a2.first;
            bf bfVar5 = (bf) a2.second;
            if (bfVar4 != null) {
                z9Var.a(bfVar4);
            }
            bfVar = bfVar5;
            bfVar2 = bfVar4;
        } else {
            bfVar = null;
            bfVar2 = null;
        }
        j1.a d = aVar.d(1835365473);
        bf b2 = d != null ? k1.b(d) : null;
        List a3 = k1.a(aVar, z9Var, -9223372036854775807L, (y6) null, (this.f26035a & 1) != 0, z2, (Function) new Object());
        m8 m8Var = (m8) b1.a(this.f26050r);
        int size = a3.size();
        int i5 = 0;
        int i6 = -1;
        long j2 = -9223372036854775807L;
        while (i5 < size) {
            ro roVar = (ro) a3.get(i5);
            if (roVar.f26359b == 0) {
                list = a3;
                i2 = size;
                i3 = i6;
                arrayList = arrayList2;
            } else {
                lo loVar = roVar.f26358a;
                int i7 = i6;
                arrayList = arrayList2;
                long j3 = loVar.e;
                if (j3 == -9223372036854775807L) {
                    j3 = roVar.f26363h;
                }
                long max = Math.max(j2, j3);
                list = a3;
                i2 = size;
                a aVar2 = new a(loVar, roVar, m8Var.a(i5, loVar.f25111b));
                int i8 = roVar.e + 30;
                f9.b a4 = loVar.f25113f.a();
                a4.i(i8);
                if (loVar.f25111b == 2 && j3 > 0 && (i4 = roVar.f26359b) > 1) {
                    a4.a(i4 / (((float) j3) / 1000000.0f));
                }
                hf.a(loVar.f25111b, z9Var, a4);
                int i9 = loVar.f25111b;
                bf[] bfVarArr = new bf[2];
                bfVarArr[0] = bfVar;
                if (this.f26040h.isEmpty()) {
                    c2 = 1;
                    bfVar3 = null;
                } else {
                    bfVar3 = new bf(this.f26040h);
                    c2 = 1;
                }
                bfVarArr[c2] = bfVar3;
                hf.a(i9, bfVar2, b2, a4, bfVarArr);
                aVar2.f26057c.a(a4.a());
                i3 = i7;
                if (loVar.f25111b == 2 && i3 == -1) {
                    i3 = arrayList.size();
                }
                arrayList.add(aVar2);
                j2 = max;
            }
            i5++;
            i6 = i3;
            arrayList2 = arrayList;
            a3 = list;
            size = i2;
        }
        this.f26053u = i6;
        this.f26054v = j2;
        a[] aVarArr = (a[]) arrayList2.toArray(new a[0]);
        this.f26051s = aVarArr;
        this.f26052t = a(aVarArr);
        m8Var.c();
        m8Var.a(this);
    }

    @Override // com.applovin.impl.k8
    public int a(l8 l8Var, th thVar) {
        while (true) {
            int i2 = this.f26041i;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        return c(l8Var, thVar);
                    }
                    if (i2 == 3) {
                        return d(l8Var, thVar);
                    }
                    throw new IllegalStateException();
                }
                if (b(l8Var, thVar)) {
                    return 1;
                }
            } else if (!c(l8Var)) {
                return -1;
            }
        }
    }

    @Override // com.applovin.impl.k8
    public void a(long j2, long j3) {
        this.f26038f.clear();
        this.f26044l = 0;
        this.f26046n = -1;
        this.f26047o = 0;
        this.f26048p = 0;
        this.f26049q = 0;
        if (j2 != 0) {
            if (this.f26051s != null) {
                f(j3);
            }
        } else if (this.f26041i != 3) {
            e();
        } else {
            this.f26039g.a();
            this.f26040h.clear();
        }
    }

    @Override // com.applovin.impl.k8
    public boolean a(l8 l8Var) {
        return lk.a(l8Var, (this.f26035a & 2) != 0);
    }
}
