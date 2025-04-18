package com.applovin.impl;

import com.applovin.impl.bf;
import com.applovin.impl.f9;
import com.applovin.impl.lj;
import com.applovin.impl.tf;
import com.applovin.impl.xa;
import java.io.EOFException;
import org.objectweb.asm.Opcodes;

/* loaded from: classes.dex */
public final class of implements k8 {

    /* renamed from: u */
    public static final o8 f25843u = new dt(10);

    /* renamed from: v */
    private static final xa.a f25844v = new rs(27);

    /* renamed from: a */
    private final int f25845a;

    /* renamed from: b */
    private final long f25846b;

    /* renamed from: c */
    private final bh f25847c;
    private final tf.a d;
    private final z9 e;

    /* renamed from: f */
    private final za f25848f;

    /* renamed from: g */
    private final qo f25849g;

    /* renamed from: h */
    private m8 f25850h;

    /* renamed from: i */
    private qo f25851i;

    /* renamed from: j */
    private qo f25852j;

    /* renamed from: k */
    private int f25853k;

    /* renamed from: l */
    private bf f25854l;

    /* renamed from: m */
    private long f25855m;

    /* renamed from: n */
    private long f25856n;

    /* renamed from: o */
    private long f25857o;

    /* renamed from: p */
    private int f25858p;

    /* renamed from: q */
    private lj f25859q;

    /* renamed from: r */
    private boolean f25860r;

    /* renamed from: s */
    private boolean f25861s;

    /* renamed from: t */
    private long f25862t;

    public of() {
        this(0);
    }

    private void b() {
        b1.b(this.f25851i);
        xp.a(this.f25850h);
    }

    private boolean d(l8 l8Var) {
        lj ljVar = this.f25859q;
        if (ljVar != null) {
            long c2 = ljVar.c();
            if (c2 != -1 && l8Var.d() > c2 - 4) {
                return true;
            }
        }
        try {
            return !l8Var.b(this.f25847c.c(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    @Override // com.applovin.impl.k8
    public void a() {
    }

    public void c() {
        this.f25860r = true;
    }

    public of(int i2) {
        this(i2, -9223372036854775807L);
    }

    public static /* synthetic */ boolean a(int i2, int i3, int i4, int i5, int i6) {
        return (i3 == 67 && i4 == 79 && i5 == 77 && (i6 == 77 || i2 == 2)) || (i3 == 77 && i4 == 76 && i5 == 76 && (i6 == 84 || i2 == 2));
    }

    private lj c(l8 l8Var) {
        int i2;
        bh bhVar = new bh(this.d.f27160c);
        l8Var.c(bhVar.c(), 0, this.d.f27160c);
        tf.a aVar = this.d;
        if ((aVar.f27158a & 1) != 0) {
            if (aVar.e != 1) {
                i2 = 36;
            }
            i2 = 21;
        } else {
            if (aVar.e == 1) {
                i2 = 13;
            }
            i2 = 21;
        }
        int i3 = i2;
        int a2 = a(bhVar, i3);
        if (a2 != 1483304551 && a2 != 1231971951) {
            if (a2 == 1447187017) {
                pq a3 = pq.a(l8Var.a(), l8Var.f(), this.d, bhVar);
                l8Var.a(this.d.f27160c);
                return a3;
            }
            l8Var.b();
            return null;
        }
        ds a4 = ds.a(l8Var.a(), l8Var.f(), this.d, bhVar);
        if (a4 != null && !this.e.a()) {
            l8Var.b();
            l8Var.c(i3 + Opcodes.F2D);
            l8Var.c(this.f25847c.c(), 0, 3);
            this.f25847c.f(0);
            this.e.a(this.f25847c.z());
        }
        l8Var.a(this.d.f27160c);
        return (a4 == null || a4.b() || a2 != 1231971951) ? a4 : a(l8Var, false);
    }

    private int e(l8 l8Var) {
        if (this.f25853k == 0) {
            try {
                b(l8Var, false);
            } catch (EOFException unused) {
                return -1;
            }
        }
        if (this.f25859q == null) {
            lj b2 = b(l8Var);
            this.f25859q = b2;
            this.f25850h.a(b2);
            this.f25852j.a(new f9.b().f(this.d.f27159b).i(4096).c(this.d.e).n(this.d.d).e(this.e.f28316a).f(this.e.f28317b).a((this.f25845a & 8) != 0 ? null : this.f25854l).a());
            this.f25857o = l8Var.f();
        } else if (this.f25857o != 0) {
            long f2 = l8Var.f();
            long j2 = this.f25857o;
            if (f2 < j2) {
                l8Var.a((int) (j2 - f2));
            }
        }
        return f(l8Var);
    }

    private int f(l8 l8Var) {
        if (this.f25858p == 0) {
            l8Var.b();
            if (d(l8Var)) {
                return -1;
            }
            this.f25847c.f(0);
            int j2 = this.f25847c.j();
            if (a(j2, this.f25853k) && tf.b(j2) != -1) {
                this.d.a(j2);
                if (this.f25855m == -9223372036854775807L) {
                    this.f25855m = this.f25859q.a(l8Var.f());
                    if (this.f25846b != -9223372036854775807L) {
                        this.f25855m = (this.f25846b - this.f25859q.a(0L)) + this.f25855m;
                    }
                }
                this.f25858p = this.d.f27160c;
                lj ljVar = this.f25859q;
                if (ljVar instanceof nb) {
                    nb nbVar = (nb) ljVar;
                    nbVar.a(a(this.f25856n + r0.f27162g), l8Var.f() + this.d.f27160c);
                    if (this.f25861s && nbVar.c(this.f25862t)) {
                        this.f25861s = false;
                        this.f25852j = this.f25851i;
                    }
                }
            } else {
                l8Var.a(1);
                this.f25853k = 0;
                return 0;
            }
        }
        int a2 = this.f25852j.a((g5) l8Var, this.f25858p, true);
        if (a2 == -1) {
            return -1;
        }
        int i2 = this.f25858p - a2;
        this.f25858p = i2;
        if (i2 > 0) {
            return 0;
        }
        this.f25852j.a(a(this.f25856n), 1, this.d.f27160c, 0, null);
        this.f25856n += this.d.f27162g;
        this.f25858p = 0;
        return 0;
    }

    public of(int i2, long j2) {
        this.f25845a = (i2 & 2) != 0 ? i2 | 1 : i2;
        this.f25846b = j2;
        this.f25847c = new bh(10);
        this.d = new tf.a();
        this.e = new z9();
        this.f25855m = -9223372036854775807L;
        this.f25848f = new za();
        i7 i7Var = new i7();
        this.f25849g = i7Var;
        this.f25852j = i7Var;
    }

    private static boolean a(int i2, long j2) {
        return ((long) (i2 & (-128000))) == (j2 & (-128000));
    }

    private lj b(l8 l8Var) {
        long a2;
        long j2;
        lj c2 = c(l8Var);
        kf a3 = a(this.f25854l, l8Var.f());
        if (this.f25860r) {
            return new lj.a();
        }
        if ((this.f25845a & 4) != 0) {
            if (a3 != null) {
                a2 = a3.d();
                j2 = a3.c();
            } else if (c2 != null) {
                a2 = c2.d();
                j2 = c2.c();
            } else {
                a2 = a(this.f25854l);
                j2 = -1;
            }
            c2 = new nb(a2, l8Var.f(), j2);
        } else if (a3 != null) {
            c2 = a3;
        } else if (c2 == null) {
            c2 = null;
        }
        if (c2 == null || !(c2.b() || (this.f25845a & 1) == 0)) {
            return a(l8Var, (this.f25845a & 2) != 0);
        }
        return c2;
    }

    private long a(long j2) {
        return ((j2 * 1000000) / this.d.d) + this.f25855m;
    }

    private lj a(l8 l8Var, boolean z2) {
        l8Var.c(this.f25847c.c(), 0, 4);
        this.f25847c.f(0);
        this.d.a(this.f25847c.j());
        return new q4(l8Var.a(), l8Var.f(), this.d, z2);
    }

    public static /* synthetic */ k8[] d() {
        return new k8[]{new of()};
    }

    private static long a(bf bfVar) {
        if (bfVar == null) {
            return -9223372036854775807L;
        }
        int c2 = bfVar.c();
        for (int i2 = 0; i2 < c2; i2++) {
            bf.b a2 = bfVar.a(i2);
            if (a2 instanceof zn) {
                zn znVar = (zn) a2;
                if (znVar.f28125a.equals("TLEN")) {
                    return t2.a(Long.parseLong(znVar.f28375c));
                }
            }
        }
        return -9223372036854775807L;
    }

    private static int a(bh bhVar, int i2) {
        if (bhVar.e() >= i2 + 4) {
            bhVar.f(i2);
            int j2 = bhVar.j();
            if (j2 == 1483304551 || j2 == 1231971951) {
                return j2;
            }
        }
        if (bhVar.e() < 40) {
            return 0;
        }
        bhVar.f(36);
        return bhVar.j() == 1447187017 ? 1447187017 : 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x009a, code lost:
    
        if (r13 == false) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x009c, code lost:
    
        r12.a(r1 + r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a4, code lost:
    
        r11.f25853k = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a6, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00a1, code lost:
    
        r12.b();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean b(com.applovin.impl.l8 r12, boolean r13) {
        /*
            r11 = this;
            if (r13 == 0) goto L6
            r0 = 32768(0x8000, float:4.5918E-41)
            goto L8
        L6:
            r0 = 131072(0x20000, float:1.83671E-40)
        L8:
            r12.b()
            long r1 = r12.f()
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r2 = 0
            r3 = 0
            if (r1 != 0) goto L3e
            int r1 = r11.f25845a
            r1 = r1 & 8
            if (r1 != 0) goto L1f
            r1 = r2
            goto L21
        L1f:
            com.applovin.impl.xa$a r1 = com.applovin.impl.of.f25844v
        L21:
            com.applovin.impl.za r4 = r11.f25848f
            com.applovin.impl.bf r1 = r4.a(r12, r1)
            r11.f25854l = r1
            if (r1 == 0) goto L30
            com.applovin.impl.z9 r4 = r11.e
            r4.a(r1)
        L30:
            long r4 = r12.d()
            int r1 = (int) r4
            if (r13 != 0) goto L3a
            r12.a(r1)
        L3a:
            r4 = r3
        L3b:
            r5 = r4
            r6 = r5
            goto L41
        L3e:
            r1 = r3
            r4 = r1
            goto L3b
        L41:
            boolean r7 = r11.d(r12)
            r8 = 1
            if (r7 == 0) goto L51
            if (r5 <= 0) goto L4b
            goto L9a
        L4b:
            java.io.EOFException r12 = new java.io.EOFException
            r12.<init>()
            throw r12
        L51:
            com.applovin.impl.bh r7 = r11.f25847c
            r7.f(r3)
            com.applovin.impl.bh r7 = r11.f25847c
            int r7 = r7.j()
            if (r4 == 0) goto L65
            long r9 = (long) r4
            boolean r9 = a(r7, r9)
            if (r9 == 0) goto L6c
        L65:
            int r9 = com.applovin.impl.tf.b(r7)
            r10 = -1
            if (r9 != r10) goto L8c
        L6c:
            int r4 = r6 + 1
            if (r6 != r0) goto L7a
            if (r13 == 0) goto L73
            return r3
        L73:
            java.lang.String r12 = "Searched too many bytes."
            com.applovin.impl.dh r12 = com.applovin.impl.dh.a(r12, r2)
            throw r12
        L7a:
            if (r13 == 0) goto L85
            r12.b()
            int r5 = r1 + r4
            r12.c(r5)
            goto L88
        L85:
            r12.a(r8)
        L88:
            r5 = r3
            r6 = r4
            r4 = r5
            goto L41
        L8c:
            int r5 = r5 + 1
            if (r5 != r8) goto L97
            com.applovin.impl.tf$a r4 = r11.d
            r4.a(r7)
            r4 = r7
            goto La7
        L97:
            r7 = 4
            if (r5 != r7) goto La7
        L9a:
            if (r13 == 0) goto La1
            int r1 = r1 + r6
            r12.a(r1)
            goto La4
        La1:
            r12.b()
        La4:
            r11.f25853k = r4
            return r8
        La7:
            int r9 = r9 + (-4)
            r12.c(r9)
            goto L41
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.of.b(com.applovin.impl.l8, boolean):boolean");
    }

    @Override // com.applovin.impl.k8
    public void a(m8 m8Var) {
        this.f25850h = m8Var;
        qo a2 = m8Var.a(0, 1);
        this.f25851i = a2;
        this.f25852j = a2;
        this.f25850h.c();
    }

    private static kf a(bf bfVar, long j2) {
        if (bfVar == null) {
            return null;
        }
        int c2 = bfVar.c();
        for (int i2 = 0; i2 < c2; i2++) {
            bf.b a2 = bfVar.a(i2);
            if (a2 instanceof jf) {
                return kf.a(j2, (jf) a2, a(bfVar));
            }
        }
        return null;
    }

    @Override // com.applovin.impl.k8
    public int a(l8 l8Var, th thVar) {
        b();
        int e = e(l8Var);
        if (e == -1 && (this.f25859q instanceof nb)) {
            long a2 = a(this.f25856n);
            if (this.f25859q.d() != a2) {
                ((nb) this.f25859q).d(a2);
                this.f25850h.a(this.f25859q);
            }
        }
        return e;
    }

    @Override // com.applovin.impl.k8
    public void a(long j2, long j3) {
        this.f25853k = 0;
        this.f25855m = -9223372036854775807L;
        this.f25856n = 0L;
        this.f25858p = 0;
        this.f25862t = j3;
        lj ljVar = this.f25859q;
        if (!(ljVar instanceof nb) || ((nb) ljVar).c(j3)) {
            return;
        }
        this.f25861s = true;
        this.f25852j = this.f25849g;
    }

    @Override // com.applovin.impl.k8
    public boolean a(l8 l8Var) {
        return b(l8Var, true);
    }
}
