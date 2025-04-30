package com.applovin.impl;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import androidx.fragment.app.FragmentTransaction;
import com.applovin.impl.ej;
import com.applovin.impl.ep;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class dp implements i8 {

    /* renamed from: t */
    public static final m8 f7339t = new A0(2);

    /* renamed from: a */
    private final int f7340a;
    private final int b;

    /* renamed from: c */
    private final List f7341c;

    /* renamed from: d */
    private final yg f7342d;

    /* renamed from: e */
    private final SparseIntArray f7343e;

    /* renamed from: f */
    private final ep.c f7344f;

    /* renamed from: g */
    private final SparseArray f7345g;

    /* renamed from: h */
    private final SparseBooleanArray f7346h;

    /* renamed from: i */
    private final SparseBooleanArray f7347i;

    /* renamed from: j */
    private final cp f7348j;

    /* renamed from: k */
    private bp f7349k;
    private k8 l;
    private int m;

    /* renamed from: n */
    private boolean f7350n;

    /* renamed from: o */
    private boolean f7351o;

    /* renamed from: p */
    private boolean f7352p;

    /* renamed from: q */
    private ep f7353q;

    /* renamed from: r */
    private int f7354r;

    /* renamed from: s */
    private int f7355s;

    /* loaded from: classes.dex */
    public class a implements cj {

        /* renamed from: a */
        private final xg f7356a = new xg(new byte[4]);

        public a() {
        }

        @Override // com.applovin.impl.cj
        public void a(io ioVar, k8 k8Var, ep.d dVar) {
        }

        @Override // com.applovin.impl.cj
        public void a(yg ygVar) {
            if (ygVar.w() == 0 && (ygVar.w() & 128) != 0) {
                ygVar.g(6);
                int a6 = ygVar.a() / 4;
                for (int i9 = 0; i9 < a6; i9++) {
                    ygVar.a(this.f7356a, 4);
                    int a9 = this.f7356a.a(16);
                    this.f7356a.d(3);
                    if (a9 == 0) {
                        this.f7356a.d(13);
                    } else {
                        int a10 = this.f7356a.a(13);
                        if (dp.this.f7345g.get(a10) == null) {
                            dp.this.f7345g.put(a10, new dj(new b(a10)));
                            dp.d(dp.this);
                        }
                    }
                }
                if (dp.this.f7340a != 2) {
                    dp.this.f7345g.remove(0);
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements cj {

        /* renamed from: a */
        private final xg f7357a = new xg(new byte[5]);
        private final SparseArray b = new SparseArray();

        /* renamed from: c */
        private final SparseIntArray f7358c = new SparseIntArray();

        /* renamed from: d */
        private final int f7359d;

        public b(int i9) {
            this.f7359d = i9;
        }

        @Override // com.applovin.impl.cj
        public void a(io ioVar, k8 k8Var, ep.d dVar) {
        }

        @Override // com.applovin.impl.cj
        public void a(yg ygVar) {
            io ioVar;
            if (ygVar.w() != 2) {
                return;
            }
            if (dp.this.f7340a == 1 || dp.this.f7340a == 2 || dp.this.m == 1) {
                ioVar = (io) dp.this.f7341c.get(0);
            } else {
                ioVar = new io(((io) dp.this.f7341c.get(0)).a());
                dp.this.f7341c.add(ioVar);
            }
            if ((ygVar.w() & 128) == 0) {
                return;
            }
            ygVar.g(1);
            int C8 = ygVar.C();
            int i9 = 3;
            ygVar.g(3);
            ygVar.a(this.f7357a, 2);
            this.f7357a.d(3);
            int i10 = 13;
            dp.this.f7355s = this.f7357a.a(13);
            ygVar.a(this.f7357a, 2);
            int i11 = 4;
            this.f7357a.d(4);
            ygVar.g(this.f7357a.a(12));
            if (dp.this.f7340a == 2 && dp.this.f7353q == null) {
                ep.b bVar = new ep.b(21, null, null, yp.f12455f);
                dp dpVar = dp.this;
                dpVar.f7353q = dpVar.f7344f.a(21, bVar);
                if (dp.this.f7353q != null) {
                    dp.this.f7353q.a(ioVar, dp.this.l, new ep.d(C8, 21, FragmentTransaction.TRANSIT_EXIT_MASK));
                }
            }
            this.b.clear();
            this.f7358c.clear();
            int a6 = ygVar.a();
            while (a6 > 0) {
                ygVar.a(this.f7357a, 5);
                int a9 = this.f7357a.a(8);
                this.f7357a.d(i9);
                int a10 = this.f7357a.a(i10);
                this.f7357a.d(i11);
                int a11 = this.f7357a.a(12);
                ep.b a12 = a(ygVar, a11);
                if (a9 == 6 || a9 == 5) {
                    a9 = a12.f7473a;
                }
                a6 -= a11 + 5;
                int i12 = dp.this.f7340a == 2 ? a9 : a10;
                if (!dp.this.f7346h.get(i12)) {
                    ep a13 = (dp.this.f7340a == 2 && a9 == 21) ? dp.this.f7353q : dp.this.f7344f.a(a9, a12);
                    if (dp.this.f7340a != 2 || a10 < this.f7358c.get(i12, FragmentTransaction.TRANSIT_EXIT_MASK)) {
                        this.f7358c.put(i12, a10);
                        this.b.put(i12, a13);
                    }
                }
                i9 = 3;
                i11 = 4;
                i10 = 13;
            }
            int size = this.f7358c.size();
            for (int i13 = 0; i13 < size; i13++) {
                int keyAt = this.f7358c.keyAt(i13);
                int valueAt = this.f7358c.valueAt(i13);
                dp.this.f7346h.put(keyAt, true);
                dp.this.f7347i.put(valueAt, true);
                ep epVar = (ep) this.b.valueAt(i13);
                if (epVar != null) {
                    if (epVar != dp.this.f7353q) {
                        epVar.a(ioVar, dp.this.l, new ep.d(C8, keyAt, FragmentTransaction.TRANSIT_EXIT_MASK));
                    }
                    dp.this.f7345g.put(valueAt, epVar);
                }
            }
            if (dp.this.f7340a == 2) {
                if (dp.this.f7350n) {
                    return;
                }
                dp.this.l.c();
                dp.this.m = 0;
                dp.this.f7350n = true;
                return;
            }
            dp.this.f7345g.remove(this.f7359d);
            dp dpVar2 = dp.this;
            dpVar2.m = dpVar2.f7340a == 1 ? 0 : dp.this.m - 1;
            if (dp.this.m == 0) {
                dp.this.l.c();
                dp.this.f7350n = true;
            }
        }

        private ep.b a(yg ygVar, int i9) {
            int d2 = ygVar.d();
            int i10 = i9 + d2;
            int i11 = -1;
            String str = null;
            ArrayList arrayList = null;
            while (ygVar.d() < i10) {
                int w2 = ygVar.w();
                int d9 = ygVar.d() + ygVar.w();
                if (d9 > i10) {
                    break;
                }
                if (w2 == 5) {
                    long y4 = ygVar.y();
                    if (y4 != 1094921523) {
                        if (y4 != 1161904947) {
                            if (y4 != 1094921524) {
                                if (y4 == 1212503619) {
                                    i11 = 36;
                                }
                            }
                            i11 = 172;
                        }
                        i11 = 135;
                    }
                    i11 = 129;
                } else {
                    if (w2 != 106) {
                        if (w2 != 122) {
                            if (w2 == 127) {
                                if (ygVar.w() != 21) {
                                }
                                i11 = 172;
                            } else if (w2 == 123) {
                                i11 = 138;
                            } else if (w2 == 10) {
                                str = ygVar.c(3).trim();
                            } else if (w2 == 89) {
                                ArrayList arrayList2 = new ArrayList();
                                while (ygVar.d() < d9) {
                                    String trim = ygVar.c(3).trim();
                                    int w9 = ygVar.w();
                                    byte[] bArr = new byte[4];
                                    ygVar.a(bArr, 0, 4);
                                    arrayList2.add(new ep.a(trim, w9, bArr));
                                }
                                arrayList = arrayList2;
                                i11 = 89;
                            } else if (w2 == 111) {
                                i11 = 257;
                            }
                        }
                        i11 = 135;
                    }
                    i11 = 129;
                }
                ygVar.g(d9 - ygVar.d());
            }
            ygVar.f(i10);
            return new ep.b(i11, str, arrayList, Arrays.copyOfRange(ygVar.c(), d2, i10));
        }
    }

    public dp() {
        this(0);
    }

    public static /* synthetic */ int d(dp dpVar) {
        int i9 = dpVar.m;
        dpVar.m = i9 + 1;
        return i9;
    }

    @Override // com.applovin.impl.i8
    public void a() {
    }

    public dp(int i9) {
        this(1, i9, 112800);
    }

    public static /* synthetic */ i8[] c() {
        return new i8[]{new dp()};
    }

    private void d() {
        this.f7346h.clear();
        this.f7345g.clear();
        SparseArray a6 = this.f7344f.a();
        int size = a6.size();
        for (int i9 = 0; i9 < size; i9++) {
            this.f7345g.put(a6.keyAt(i9), (ep) a6.valueAt(i9));
        }
        this.f7345g.put(0, new dj(new a()));
        this.f7353q = null;
    }

    public dp(int i9, int i10, int i11) {
        this(i9, new io(0L), new l6(i10), i11);
    }

    private boolean b(j8 j8Var) {
        byte[] c9 = this.f7342d.c();
        if (9400 - this.f7342d.d() < 188) {
            int a6 = this.f7342d.a();
            if (a6 > 0) {
                System.arraycopy(c9, this.f7342d.d(), c9, 0, a6);
            }
            this.f7342d.a(c9, a6);
        }
        while (this.f7342d.a() < 188) {
            int e4 = this.f7342d.e();
            int a9 = j8Var.a(c9, e4, 9400 - e4);
            if (a9 == -1) {
                return false;
            }
            this.f7342d.e(e4 + a9);
        }
        return true;
    }

    public dp(int i9, io ioVar, ep.c cVar, int i10) {
        this.f7344f = (ep.c) AbstractC0669a1.a(cVar);
        this.b = i10;
        this.f7340a = i9;
        if (i9 != 1 && i9 != 2) {
            ArrayList arrayList = new ArrayList();
            this.f7341c = arrayList;
            arrayList.add(ioVar);
        } else {
            this.f7341c = Collections.singletonList(ioVar);
        }
        this.f7342d = new yg(new byte[9400], 0);
        this.f7346h = new SparseBooleanArray();
        this.f7347i = new SparseBooleanArray();
        this.f7345g = new SparseArray();
        this.f7343e = new SparseIntArray();
        this.f7348j = new cp(i10);
        this.l = k8.f8609e;
        this.f7355s = -1;
        d();
    }

    @Override // com.applovin.impl.i8
    public void a(k8 k8Var) {
        this.l = k8Var;
    }

    private void a(long j7) {
        if (this.f7351o) {
            return;
        }
        this.f7351o = true;
        if (this.f7348j.a() != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
            bp bpVar = new bp(this.f7348j.b(), this.f7348j.a(), j7, this.f7355s, this.b);
            this.f7349k = bpVar;
            this.l.a(bpVar.a());
            return;
        }
        this.l.a(new ej.b(this.f7348j.a()));
    }

    private int b() {
        int d2 = this.f7342d.d();
        int e4 = this.f7342d.e();
        int a6 = fp.a(this.f7342d.c(), d2, e4);
        this.f7342d.f(a6);
        int i9 = a6 + 188;
        if (i9 > e4) {
            int i10 = (a6 - d2) + this.f7354r;
            this.f7354r = i10;
            if (this.f7340a == 2 && i10 > 376) {
                throw ah.a("Cannot find sync byte. Most likely not a Transport Stream.", null);
            }
        } else {
            this.f7354r = 0;
        }
        return i9;
    }

    @Override // com.applovin.impl.i8
    public int a(j8 j8Var, qh qhVar) {
        long a6 = j8Var.a();
        if (this.f7350n) {
            if (a6 != -1 && this.f7340a != 2 && !this.f7348j.c()) {
                return this.f7348j.a(j8Var, qhVar, this.f7355s);
            }
            a(a6);
            if (this.f7352p) {
                this.f7352p = false;
                a(0L, 0L);
                if (j8Var.f() != 0) {
                    qhVar.f10346a = 0L;
                    return 1;
                }
            }
            bp bpVar = this.f7349k;
            if (bpVar != null && bpVar.b()) {
                return this.f7349k.a(j8Var, qhVar);
            }
        }
        if (!b(j8Var)) {
            return -1;
        }
        int b8 = b();
        int e4 = this.f7342d.e();
        if (b8 > e4) {
            return 0;
        }
        int j7 = this.f7342d.j();
        if ((8388608 & j7) != 0) {
            this.f7342d.f(b8);
            return 0;
        }
        int i9 = (4194304 & j7) != 0 ? 1 : 0;
        int i10 = (2096896 & j7) >> 8;
        boolean z8 = (j7 & 32) != 0;
        ep epVar = (j7 & 16) != 0 ? (ep) this.f7345g.get(i10) : null;
        if (epVar == null) {
            this.f7342d.f(b8);
            return 0;
        }
        if (this.f7340a != 2) {
            int i11 = j7 & 15;
            int i12 = this.f7343e.get(i10, i11 - 1);
            this.f7343e.put(i10, i11);
            if (i12 == i11) {
                this.f7342d.f(b8);
                return 0;
            }
            if (i11 != ((i12 + 1) & 15)) {
                epVar.a();
            }
        }
        if (z8) {
            int w2 = this.f7342d.w();
            i9 |= (this.f7342d.w() & 64) != 0 ? 2 : 0;
            this.f7342d.g(w2 - 1);
        }
        boolean z9 = this.f7350n;
        if (a(i10)) {
            this.f7342d.e(b8);
            epVar.a(this.f7342d, i9);
            this.f7342d.e(e4);
        }
        if (this.f7340a != 2 && !z9 && this.f7350n && a6 != -1) {
            this.f7352p = true;
        }
        this.f7342d.f(b8);
        return 0;
    }

    @Override // com.applovin.impl.i8
    public void a(long j7, long j9) {
        int i9;
        bp bpVar;
        AbstractC0669a1.b(this.f7340a != 2);
        int size = this.f7341c.size();
        for (0; i9 < size; i9 + 1) {
            io ioVar = (io) this.f7341c.get(i9);
            boolean z8 = ioVar.c() == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
            if (!z8) {
                long a6 = ioVar.a();
                if (a6 != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                    if (a6 != 0) {
                        if (a6 == j9) {
                        }
                        ioVar.d(j9);
                    }
                }
            } else {
                i9 = z8 ? 0 : i9 + 1;
                ioVar.d(j9);
            }
        }
        if (j9 != 0 && (bpVar = this.f7349k) != null) {
            bpVar.b(j9);
        }
        this.f7342d.d(0);
        this.f7343e.clear();
        for (int i10 = 0; i10 < this.f7345g.size(); i10++) {
            ((ep) this.f7345g.valueAt(i10)).a();
        }
        this.f7354r = 0;
    }

    private boolean a(int i9) {
        return this.f7340a == 2 || this.f7350n || !this.f7347i.get(i9, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
    
        r1 = r1 + 1;
     */
    @Override // com.applovin.impl.i8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean a(com.applovin.impl.j8 r7) {
        /*
            r6 = this;
            com.applovin.impl.yg r0 = r6.f7342d
            byte[] r0 = r0.c()
            r1 = 940(0x3ac, float:1.317E-42)
            r2 = 0
            r7.c(r0, r2, r1)
            r1 = r2
        Ld:
            r3 = 188(0xbc, float:2.63E-43)
            if (r1 >= r3) goto L29
            r3 = r2
        L12:
            r4 = 5
            if (r3 >= r4) goto L24
            int r4 = r3 * 188
            int r4 = r4 + r1
            r4 = r0[r4]
            r5 = 71
            if (r4 == r5) goto L21
            int r1 = r1 + 1
            goto Ld
        L21:
            int r3 = r3 + 1
            goto L12
        L24:
            r7.a(r1)
            r7 = 1
            return r7
        L29:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.dp.a(com.applovin.impl.j8):boolean");
    }
}
