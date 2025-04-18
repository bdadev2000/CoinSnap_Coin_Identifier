package com.applovin.impl;

import android.util.Pair;
import android.util.SparseArray;
import com.applovin.exoplayer2.common.base.Function;
import com.applovin.impl.f9;
import com.applovin.impl.ij;
import com.applovin.impl.j1;
import com.applovin.impl.y6;
import com.google.android.gms.common.api.Api;
import com.google.common.primitives.Ints;
import com.google.common.primitives.UnsignedBytes;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* loaded from: classes.dex */
public class j9 implements k8 {
    public static final o8 I = new dt(6);
    private static final byte[] J = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    private static final f9 K = new f9.b().f("application/x-emsg").a();
    private int A;
    private int B;
    private int C;
    private boolean D;
    private m8 E;
    private qo[] F;
    private qo[] G;
    private boolean H;

    /* renamed from: a */
    private final int f24614a;

    /* renamed from: b */
    private final lo f24615b;

    /* renamed from: c */
    private final List f24616c;
    private final SparseArray d;
    private final bh e;

    /* renamed from: f */
    private final bh f24617f;

    /* renamed from: g */
    private final bh f24618g;

    /* renamed from: h */
    private final byte[] f24619h;

    /* renamed from: i */
    private final bh f24620i;

    /* renamed from: j */
    private final ho f24621j;

    /* renamed from: k */
    private final y7 f24622k;

    /* renamed from: l */
    private final bh f24623l;

    /* renamed from: m */
    private final ArrayDeque f24624m;

    /* renamed from: n */
    private final ArrayDeque f24625n;

    /* renamed from: o */
    private final qo f24626o;

    /* renamed from: p */
    private int f24627p;

    /* renamed from: q */
    private int f24628q;

    /* renamed from: r */
    private long f24629r;

    /* renamed from: s */
    private int f24630s;

    /* renamed from: t */
    private bh f24631t;

    /* renamed from: u */
    private long f24632u;

    /* renamed from: v */
    private int f24633v;
    private long w;
    private long x;

    /* renamed from: y */
    private long f24634y;

    /* renamed from: z */
    private b f24635z;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final long f24636a;

        /* renamed from: b */
        public final int f24637b;

        public a(long j2, int i2) {
            this.f24636a = j2;
            this.f24637b = i2;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        public final qo f24638a;
        public ro d;
        public l6 e;

        /* renamed from: f */
        public int f24641f;

        /* renamed from: g */
        public int f24642g;

        /* renamed from: h */
        public int f24643h;

        /* renamed from: i */
        public int f24644i;

        /* renamed from: l */
        private boolean f24647l;

        /* renamed from: b */
        public final no f24639b = new no();

        /* renamed from: c */
        public final bh f24640c = new bh();

        /* renamed from: j */
        private final bh f24645j = new bh(1);

        /* renamed from: k */
        private final bh f24646k = new bh();

        public b(qo qoVar, ro roVar, l6 l6Var) {
            this.f24638a = qoVar;
            this.d = roVar;
            this.e = l6Var;
            a(roVar, l6Var);
        }

        public long b() {
            return !this.f24647l ? this.d.f26360c[this.f24641f] : this.f24639b.f25759g[this.f24643h];
        }

        public long c() {
            return !this.f24647l ? this.d.f26361f[this.f24641f] : this.f24639b.a(this.f24641f);
        }

        public int d() {
            return !this.f24647l ? this.d.d[this.f24641f] : this.f24639b.f25761i[this.f24641f];
        }

        public mo e() {
            if (!this.f24647l) {
                return null;
            }
            int i2 = ((l6) xp.a(this.f24639b.f25755a)).f25000a;
            mo moVar = this.f24639b.f25767o;
            if (moVar == null) {
                moVar = this.d.f26358a.a(i2);
            }
            if (moVar == null || !moVar.f25598a) {
                return null;
            }
            return moVar;
        }

        public boolean f() {
            this.f24641f++;
            if (!this.f24647l) {
                return false;
            }
            int i2 = this.f24642g + 1;
            this.f24642g = i2;
            int[] iArr = this.f24639b.f25760h;
            int i3 = this.f24643h;
            if (i2 != iArr[i3]) {
                return true;
            }
            this.f24643h = i3 + 1;
            this.f24642g = 0;
            return false;
        }

        public void g() {
            this.f24639b.a();
            this.f24641f = 0;
            this.f24643h = 0;
            this.f24642g = 0;
            this.f24644i = 0;
            this.f24647l = false;
        }

        public void h() {
            mo e = e();
            if (e == null) {
                return;
            }
            bh bhVar = this.f24639b.f25768p;
            int i2 = e.d;
            if (i2 != 0) {
                bhVar.g(i2);
            }
            if (this.f24639b.c(this.f24641f)) {
                bhVar.g(bhVar.C() * 6);
            }
        }

        public int a() {
            int i2;
            if (!this.f24647l) {
                i2 = this.d.f26362g[this.f24641f];
            } else {
                i2 = this.f24639b.f25764l[this.f24641f] ? 1 : 0;
            }
            return e() != null ? i2 | Ints.MAX_POWER_OF_TWO : i2;
        }

        public int a(int i2, int i3) {
            bh bhVar;
            mo e = e();
            if (e == null) {
                return 0;
            }
            int i4 = e.d;
            if (i4 != 0) {
                bhVar = this.f24639b.f25768p;
            } else {
                byte[] bArr = (byte[]) xp.a((Object) e.e);
                this.f24646k.a(bArr, bArr.length);
                bh bhVar2 = this.f24646k;
                i4 = bArr.length;
                bhVar = bhVar2;
            }
            boolean c2 = this.f24639b.c(this.f24641f);
            boolean z2 = c2 || i3 != 0;
            this.f24645j.c()[0] = (byte) ((z2 ? 128 : 0) | i4);
            this.f24645j.f(0);
            this.f24638a.a(this.f24645j, 1, 1);
            this.f24638a.a(bhVar, i4, 1);
            if (!z2) {
                return i4 + 1;
            }
            if (!c2) {
                this.f24640c.d(8);
                byte[] c3 = this.f24640c.c();
                c3[0] = 0;
                c3[1] = 1;
                c3[2] = (byte) ((i3 >> 8) & 255);
                c3[3] = (byte) (i3 & 255);
                c3[4] = (byte) ((i2 >> 24) & 255);
                c3[5] = (byte) ((i2 >> 16) & 255);
                c3[6] = (byte) ((i2 >> 8) & 255);
                c3[7] = (byte) (i2 & 255);
                this.f24638a.a(this.f24640c, 8, 1);
                return i4 + 9;
            }
            bh bhVar3 = this.f24639b.f25768p;
            int C = bhVar3.C();
            bhVar3.g(-2);
            int i5 = (C * 6) + 2;
            if (i3 != 0) {
                this.f24640c.d(i5);
                byte[] c4 = this.f24640c.c();
                bhVar3.a(c4, 0, i5);
                int i6 = (((c4[2] & UnsignedBytes.MAX_VALUE) << 8) | (c4[3] & UnsignedBytes.MAX_VALUE)) + i3;
                c4[2] = (byte) ((i6 >> 8) & 255);
                c4[3] = (byte) (i6 & 255);
                bhVar3 = this.f24640c;
            }
            this.f24638a.a(bhVar3, i5, 1);
            return i4 + 1 + i5;
        }

        public void a(ro roVar, l6 l6Var) {
            this.d = roVar;
            this.e = l6Var;
            this.f24638a.a(roVar.f26358a.f25113f);
            g();
        }

        public void a(long j2) {
            int i2 = this.f24641f;
            while (true) {
                no noVar = this.f24639b;
                if (i2 >= noVar.f25758f || noVar.a(i2) >= j2) {
                    return;
                }
                if (this.f24639b.f25764l[i2]) {
                    this.f24644i = i2;
                }
                i2++;
            }
        }

        public void a(y6 y6Var) {
            mo a2 = this.d.f26358a.a(((l6) xp.a(this.f24639b.f25755a)).f25000a);
            this.f24638a.a(this.d.f26358a.f25113f.a().a(y6Var.a(a2 != null ? a2.f25599b : null)).a());
        }
    }

    public j9() {
        this(0);
    }

    private void b() {
        this.f24627p = 0;
        this.f24630s = 0;
    }

    private static boolean c(int i2) {
        return i2 == 1751411826 || i2 == 1835296868 || i2 == 1836476516 || i2 == 1936286840 || i2 == 1937011556 || i2 == 1937011827 || i2 == 1668576371 || i2 == 1937011555 || i2 == 1937011578 || i2 == 1937013298 || i2 == 1937007471 || i2 == 1668232756 || i2 == 1937011571 || i2 == 1952867444 || i2 == 1952868452 || i2 == 1953196132 || i2 == 1953654136 || i2 == 1953658222 || i2 == 1886614376 || i2 == 1935763834 || i2 == 1935763823 || i2 == 1936027235 || i2 == 1970628964 || i2 == 1935828848 || i2 == 1936158820 || i2 == 1701606260 || i2 == 1835362404 || i2 == 1701671783;
    }

    private static Pair d(bh bhVar) {
        bhVar.f(12);
        return Pair.create(Integer.valueOf(bhVar.j()), new l6(bhVar.j() - 1, bhVar.j(), bhVar.j(), bhVar.j()));
    }

    public lo a(lo loVar) {
        return loVar;
    }

    public j9(int i2) {
        this(i2, null);
    }

    private static boolean b(int i2) {
        return i2 == 1836019574 || i2 == 1953653099 || i2 == 1835297121 || i2 == 1835626086 || i2 == 1937007212 || i2 == 1836019558 || i2 == 1953653094 || i2 == 1836475768 || i2 == 1701082227;
    }

    private void c() {
        int i2;
        qo[] qoVarArr = new qo[2];
        this.F = qoVarArr;
        qo qoVar = this.f24626o;
        int i3 = 0;
        if (qoVar != null) {
            qoVarArr[0] = qoVar;
            i2 = 1;
        } else {
            i2 = 0;
        }
        int i4 = 100;
        if ((this.f24614a & 4) != 0) {
            qoVarArr[i2] = this.E.a(100, 5);
            i4 = 101;
            i2++;
        }
        qo[] qoVarArr2 = (qo[]) xp.a(this.F, i2);
        this.F = qoVarArr2;
        for (qo qoVar2 : qoVarArr2) {
            qoVar2.a(K);
        }
        this.G = new qo[this.f24616c.size()];
        while (i3 < this.G.length) {
            qo a2 = this.E.a(i4, 3);
            a2.a((f9) this.f24616c.get(i3));
            this.G[i3] = a2;
            i3++;
            i4++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private boolean e(l8 l8Var) {
        int a2;
        b bVar = this.f24635z;
        Throwable th = null;
        if (bVar == null) {
            bVar = a(this.d);
            if (bVar == null) {
                int f2 = (int) (this.f24632u - l8Var.f());
                if (f2 >= 0) {
                    l8Var.a(f2);
                    b();
                    return false;
                }
                throw dh.a("Offset to end of mdat was negative.", null);
            }
            int b2 = (int) (bVar.b() - l8Var.f());
            if (b2 < 0) {
                pc.d("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                b2 = 0;
            }
            l8Var.a(b2);
            this.f24635z = bVar;
        }
        int i2 = 4;
        int i3 = 1;
        if (this.f24627p == 3) {
            int d = bVar.d();
            this.A = d;
            if (bVar.f24641f < bVar.f24644i) {
                l8Var.a(d);
                bVar.h();
                if (!bVar.f()) {
                    this.f24635z = null;
                }
                this.f24627p = 3;
                return true;
            }
            if (bVar.d.f26358a.f25114g == 1) {
                this.A = d - 8;
                l8Var.a(8);
            }
            if ("audio/ac4".equals(bVar.d.f26358a.f25113f.f23840m)) {
                this.B = bVar.a(this.A, 7);
                n.a(this.A, this.f24620i);
                bVar.f24638a.a(this.f24620i, 7);
                this.B += 7;
            } else {
                this.B = bVar.a(this.A, 0);
            }
            this.A += this.B;
            this.f24627p = 4;
            this.C = 0;
        }
        lo loVar = bVar.d.f26358a;
        qo qoVar = bVar.f24638a;
        long c2 = bVar.c();
        ho hoVar = this.f24621j;
        if (hoVar != null) {
            c2 = hoVar.a(c2);
        }
        long j2 = c2;
        if (loVar.f25117j == 0) {
            while (true) {
                int i4 = this.B;
                int i5 = this.A;
                if (i4 >= i5) {
                    break;
                }
                this.B += qoVar.a((g5) l8Var, i5 - i4, false);
            }
        } else {
            byte[] c3 = this.f24617f.c();
            c3[0] = 0;
            c3[1] = 0;
            c3[2] = 0;
            int i6 = loVar.f25117j;
            int i7 = i6 + 1;
            int i8 = 4 - i6;
            while (this.B < this.A) {
                int i9 = this.C;
                if (i9 == 0) {
                    l8Var.d(c3, i8, i7);
                    this.f24617f.f(0);
                    int j3 = this.f24617f.j();
                    if (j3 >= i3) {
                        this.C = j3 - 1;
                        this.e.f(0);
                        qoVar.a(this.e, i2);
                        qoVar.a(this.f24617f, i3);
                        this.D = (this.G.length <= 0 || !zf.a(loVar.f25113f.f23840m, c3[i2])) ? 0 : i3;
                        this.B += 5;
                        this.A += i8;
                    } else {
                        throw dh.a("Invalid NAL length", th);
                    }
                } else {
                    if (this.D) {
                        this.f24618g.d(i9);
                        l8Var.d(this.f24618g.c(), 0, this.C);
                        qoVar.a(this.f24618g, this.C);
                        a2 = this.C;
                        int c4 = zf.c(this.f24618g.c(), this.f24618g.e());
                        this.f24618g.f("video/hevc".equals(loVar.f25113f.f23840m) ? 1 : 0);
                        this.f24618g.e(c4);
                        c3.a(j2, this.f24618g, this.G);
                    } else {
                        a2 = qoVar.a((g5) l8Var, i9, false);
                    }
                    this.B += a2;
                    this.C -= a2;
                    th = null;
                    i2 = 4;
                    i3 = 1;
                }
            }
        }
        int a3 = bVar.a();
        mo e = bVar.e();
        qoVar.a(j2, a3, this.A, 0, e != null ? e.f25600c : null);
        a(j2);
        if (!bVar.f()) {
            this.f24635z = null;
        }
        this.f24627p = 3;
        return true;
    }

    @Override // com.applovin.impl.k8
    public void a() {
    }

    public j9(int i2, ho hoVar) {
        this(i2, hoVar, null, Collections.emptyList());
    }

    private static int a(int i2) {
        if (i2 >= 0) {
            return i2;
        }
        throw dh.a("Unexpected negative value: " + i2, null);
    }

    private void b(j1.a aVar) {
        a(aVar, this.d, this.f24615b != null, this.f24614a, this.f24619h);
        y6 a2 = a(aVar.f24568c);
        if (a2 != null) {
            int size = this.d.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((b) this.d.valueAt(i2)).a(a2);
            }
        }
        if (this.w != -9223372036854775807L) {
            int size2 = this.d.size();
            for (int i3 = 0; i3 < size2; i3++) {
                ((b) this.d.valueAt(i3)).a(this.w);
            }
            this.w = -9223372036854775807L;
        }
    }

    public j9(int i2, ho hoVar, lo loVar, List list) {
        this(i2, hoVar, loVar, list, null);
    }

    private l6 a(SparseArray sparseArray, int i2) {
        if (sparseArray.size() == 1) {
            return (l6) sparseArray.valueAt(0);
        }
        return (l6) b1.a((l6) sparseArray.get(i2));
    }

    public j9(int i2, ho hoVar, lo loVar, List list, qo qoVar) {
        this.f24614a = i2;
        this.f24621j = hoVar;
        this.f24615b = loVar;
        this.f24616c = Collections.unmodifiableList(list);
        this.f24626o = qoVar;
        this.f24622k = new y7();
        this.f24623l = new bh(16);
        this.e = new bh(zf.f28330a);
        this.f24617f = new bh(5);
        this.f24618g = new bh();
        byte[] bArr = new byte[16];
        this.f24619h = bArr;
        this.f24620i = new bh(bArr);
        this.f24624m = new ArrayDeque();
        this.f24625n = new ArrayDeque();
        this.d = new SparseArray();
        this.x = -9223372036854775807L;
        this.w = -9223372036854775807L;
        this.f24634y = -9223372036854775807L;
        this.E = m8.e;
        this.F = new qo[0];
        this.G = new qo[0];
    }

    private static y6 a(List list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < size; i2++) {
            j1.b bVar = (j1.b) list.get(i2);
            if (bVar.f24566a == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] c2 = bVar.f24569b.c();
                UUID c3 = ji.c(c2);
                if (c3 == null) {
                    pc.d("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new y6.b(c3, "video/mp4", c2));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new y6(arrayList);
    }

    private static long b(bh bhVar) {
        bhVar.f(8);
        return j1.c(bhVar.j()) == 0 ? bhVar.y() : bhVar.B();
    }

    private void d(l8 l8Var) {
        int size = this.d.size();
        long j2 = Long.MAX_VALUE;
        b bVar = null;
        for (int i2 = 0; i2 < size; i2++) {
            no noVar = ((b) this.d.valueAt(i2)).f24639b;
            if (noVar.f25769q) {
                long j3 = noVar.d;
                if (j3 < j2) {
                    bVar = (b) this.d.valueAt(i2);
                    j2 = j3;
                }
            }
        }
        if (bVar == null) {
            this.f24627p = 3;
            return;
        }
        int f2 = (int) (j2 - l8Var.f());
        if (f2 >= 0) {
            l8Var.a(f2);
            bVar.f24639b.a(l8Var);
            return;
        }
        throw dh.a("Offset to encryption data was negative.", null);
    }

    private void c(j1.a aVar) {
        int i2 = 0;
        b1.b(this.f24615b == null, "Unexpected moov box.");
        y6 a2 = a(aVar.f24568c);
        j1.a aVar2 = (j1.a) b1.a(aVar.d(1836475768));
        SparseArray sparseArray = new SparseArray();
        int size = aVar2.f24568c.size();
        long j2 = -9223372036854775807L;
        for (int i3 = 0; i3 < size; i3++) {
            j1.b bVar = (j1.b) aVar2.f24568c.get(i3);
            int i4 = bVar.f24566a;
            if (i4 == 1953654136) {
                Pair d = d(bVar.f24569b);
                sparseArray.put(((Integer) d.first).intValue(), (l6) d.second);
            } else if (i4 == 1835362404) {
                j2 = b(bVar.f24569b);
            }
        }
        List a3 = k1.a(aVar, new z9(), j2, a2, (this.f24614a & 16) != 0, false, new Function() { // from class: com.applovin.impl.cu
            @Override // com.applovin.exoplayer2.common.base.Function
            public final Object apply(Object obj) {
                return j9.this.a((lo) obj);
            }
        });
        int size2 = a3.size();
        if (this.d.size() == 0) {
            while (i2 < size2) {
                ro roVar = (ro) a3.get(i2);
                lo loVar = roVar.f26358a;
                this.d.put(loVar.f25110a, new b(this.E.a(i2, loVar.f25111b), roVar, a(sparseArray, loVar.f25110a)));
                this.x = Math.max(this.x, loVar.e);
                i2++;
            }
            this.E.c();
            return;
        }
        b1.b(this.d.size() == size2);
        while (i2 < size2) {
            ro roVar2 = (ro) a3.get(i2);
            lo loVar2 = roVar2.f26358a;
            ((b) this.d.get(loVar2.f25110a)).a(roVar2, a(sparseArray, loVar2.f25110a));
            i2++;
        }
    }

    private static void b(bh bhVar, no noVar) {
        a(bhVar, 0, noVar);
    }

    private static void b(j1.a aVar, SparseArray sparseArray, boolean z2, int i2, byte[] bArr) {
        b a2 = a(((j1.b) b1.a(aVar.e(1952868452))).f24569b, sparseArray, z2);
        if (a2 == null) {
            return;
        }
        no noVar = a2.f24639b;
        long j2 = noVar.f25770r;
        boolean z3 = noVar.f25771s;
        a2.g();
        a2.f24647l = true;
        j1.b e = aVar.e(1952867444);
        if (e != null && (i2 & 2) == 0) {
            noVar.f25770r = c(e.f24569b);
            noVar.f25771s = true;
        } else {
            noVar.f25770r = j2;
            noVar.f25771s = z3;
        }
        a(aVar, a2, i2);
        mo a3 = a2.d.f26358a.a(((l6) b1.a(noVar.f25755a)).f25000a);
        j1.b e2 = aVar.e(1935763834);
        if (e2 != null) {
            a((mo) b1.a(a3), e2.f24569b, noVar);
        }
        j1.b e3 = aVar.e(1935763823);
        if (e3 != null) {
            a(e3.f24569b, noVar);
        }
        j1.b e4 = aVar.e(1936027235);
        if (e4 != null) {
            b(e4.f24569b, noVar);
        }
        a(aVar, a3 != null ? a3.f25599b : null, noVar);
        int size = aVar.f24568c.size();
        for (int i3 = 0; i3 < size; i3++) {
            j1.b bVar = (j1.b) aVar.f24568c.get(i3);
            if (bVar.f24566a == 1970628964) {
                a(bVar.f24569b, noVar, bArr);
            }
        }
    }

    private static b a(SparseArray sparseArray) {
        int size = sparseArray.size();
        b bVar = null;
        long j2 = Long.MAX_VALUE;
        for (int i2 = 0; i2 < size; i2++) {
            b bVar2 = (b) sparseArray.valueAt(i2);
            if ((bVar2.f24647l || bVar2.f24641f != bVar2.d.f26359b) && (!bVar2.f24647l || bVar2.f24643h != bVar2.f24639b.e)) {
                long b2 = bVar2.b();
                if (b2 < j2) {
                    bVar = bVar2;
                    j2 = b2;
                }
            }
        }
        return bVar;
    }

    public static /* synthetic */ k8[] d() {
        return new k8[]{new j9()};
    }

    @Override // com.applovin.impl.k8
    public void a(m8 m8Var) {
        this.E = m8Var;
        b();
        c();
        lo loVar = this.f24615b;
        if (loVar != null) {
            this.d.put(0, new b(m8Var.a(0, loVar.f25111b), new ro(this.f24615b, new long[0], new int[0], 0, new long[0], new int[0], 0L), new l6(0, 0, 0, 0)));
            this.E.c();
        }
    }

    private void a(j1.a aVar) {
        int i2 = aVar.f24566a;
        if (i2 == 1836019574) {
            c(aVar);
        } else if (i2 == 1836019558) {
            b(aVar);
        } else {
            if (this.f24624m.isEmpty()) {
                return;
            }
            ((j1.a) this.f24624m.peek()).a(aVar);
        }
    }

    private void a(bh bhVar) {
        long c2;
        String str;
        long c3;
        String str2;
        long y2;
        long j2;
        if (this.F.length == 0) {
            return;
        }
        bhVar.f(8);
        int c4 = j1.c(bhVar.j());
        if (c4 != 0) {
            if (c4 != 1) {
                com.applovin.impl.adview.t.u("Skipping unsupported emsg version: ", c4, "FragmentedMp4Extractor");
                return;
            }
            long y3 = bhVar.y();
            j2 = xp.c(bhVar.B(), 1000000L, y3);
            long c5 = xp.c(bhVar.y(), 1000L, y3);
            long y4 = bhVar.y();
            str = (String) b1.a((Object) bhVar.t());
            c3 = c5;
            y2 = y4;
            str2 = (String) b1.a((Object) bhVar.t());
            c2 = -9223372036854775807L;
        } else {
            String str3 = (String) b1.a((Object) bhVar.t());
            String str4 = (String) b1.a((Object) bhVar.t());
            long y5 = bhVar.y();
            c2 = xp.c(bhVar.y(), 1000000L, y5);
            long j3 = this.f24634y;
            long j4 = j3 != -9223372036854775807L ? j3 + c2 : -9223372036854775807L;
            str = str3;
            c3 = xp.c(bhVar.y(), 1000L, y5);
            str2 = str4;
            y2 = bhVar.y();
            j2 = j4;
        }
        byte[] bArr = new byte[bhVar.a()];
        bhVar.a(bArr, 0, bhVar.a());
        bh bhVar2 = new bh(this.f24622k.a(new w7(str, str2, c3, y2, bArr)));
        int a2 = bhVar2.a();
        for (qo qoVar : this.F) {
            bhVar2.f(0);
            qoVar.a(bhVar2, a2);
        }
        if (j2 == -9223372036854775807L) {
            this.f24625n.addLast(new a(c2, a2));
            this.f24633v += a2;
            return;
        }
        ho hoVar = this.f24621j;
        if (hoVar != null) {
            j2 = hoVar.a(j2);
        }
        for (qo qoVar2 : this.F) {
            qoVar2.a(j2, 1, a2, 0, null);
        }
    }

    private static long c(bh bhVar) {
        bhVar.f(8);
        return j1.c(bhVar.j()) == 1 ? bhVar.B() : bhVar.y();
    }

    private void b(long j2) {
        while (!this.f24624m.isEmpty() && ((j1.a) this.f24624m.peek()).f24567b == j2) {
            a((j1.a) this.f24624m.pop());
        }
        b();
    }

    private void c(l8 l8Var) {
        int i2 = ((int) this.f24629r) - this.f24630s;
        bh bhVar = this.f24631t;
        if (bhVar != null) {
            l8Var.d(bhVar.c(), 8, i2);
            a(new j1.b(this.f24628q, bhVar), l8Var.f());
        } else {
            l8Var.a(i2);
        }
        b(l8Var.f());
    }

    private boolean b(l8 l8Var) {
        if (this.f24630s == 0) {
            if (!l8Var.a(this.f24623l.c(), 0, 8, true)) {
                return false;
            }
            this.f24630s = 8;
            this.f24623l.f(0);
            this.f24629r = this.f24623l.y();
            this.f24628q = this.f24623l.j();
        }
        long j2 = this.f24629r;
        if (j2 == 1) {
            l8Var.d(this.f24623l.c(), 8, 8);
            this.f24630s += 8;
            this.f24629r = this.f24623l.B();
        } else if (j2 == 0) {
            long a2 = l8Var.a();
            if (a2 == -1 && !this.f24624m.isEmpty()) {
                a2 = ((j1.a) this.f24624m.peek()).f24567b;
            }
            if (a2 != -1) {
                this.f24629r = (a2 - l8Var.f()) + this.f24630s;
            }
        }
        if (this.f24629r >= this.f24630s) {
            long f2 = l8Var.f() - this.f24630s;
            int i2 = this.f24628q;
            if ((i2 == 1836019558 || i2 == 1835295092) && !this.H) {
                this.E.a(new ij.b(this.x, f2));
                this.H = true;
            }
            if (this.f24628q == 1836019558) {
                int size = this.d.size();
                for (int i3 = 0; i3 < size; i3++) {
                    no noVar = ((b) this.d.valueAt(i3)).f24639b;
                    noVar.f25756b = f2;
                    noVar.d = f2;
                    noVar.f25757c = f2;
                }
            }
            int i4 = this.f24628q;
            if (i4 == 1835295092) {
                this.f24635z = null;
                this.f24632u = f2 + this.f24629r;
                this.f24627p = 2;
                return true;
            }
            if (b(i4)) {
                long f3 = (l8Var.f() + this.f24629r) - 8;
                this.f24624m.push(new j1.a(this.f24628q, f3));
                if (this.f24629r == this.f24630s) {
                    b(f3);
                } else {
                    b();
                }
            } else if (c(this.f24628q)) {
                if (this.f24630s != 8) {
                    throw dh.a("Leaf atom defines extended atom size (unsupported).");
                }
                long j3 = this.f24629r;
                if (j3 <= 2147483647L) {
                    bh bhVar = new bh((int) j3);
                    System.arraycopy(this.f24623l.c(), 0, bhVar.c(), 0, 8);
                    this.f24631t = bhVar;
                    this.f24627p = 1;
                } else {
                    throw dh.a("Leaf atom with length > 2147483647 (unsupported).");
                }
            } else {
                if (this.f24629r > 2147483647L) {
                    throw dh.a("Skipping atom with length > 2147483647 (unsupported).");
                }
                this.f24631t = null;
                this.f24627p = 1;
            }
            return true;
        }
        throw dh.a("Atom size less than header length (unsupported).");
    }

    private void a(j1.b bVar, long j2) {
        if (!this.f24624m.isEmpty()) {
            ((j1.a) this.f24624m.peek()).a(bVar);
            return;
        }
        int i2 = bVar.f24566a;
        if (i2 != 1936286840) {
            if (i2 == 1701671783) {
                a(bVar.f24569b);
            }
        } else {
            Pair a2 = a(bVar.f24569b, j2);
            this.f24634y = ((Long) a2.first).longValue();
            this.E.a((ij) a2.second);
            this.H = true;
        }
    }

    private void a(long j2) {
        while (!this.f24625n.isEmpty()) {
            a aVar = (a) this.f24625n.removeFirst();
            this.f24633v -= aVar.f24637b;
            long j3 = aVar.f24636a + j2;
            ho hoVar = this.f24621j;
            if (hoVar != null) {
                j3 = hoVar.a(j3);
            }
            for (qo qoVar : this.F) {
                qoVar.a(j3, 1, aVar.f24637b, this.f24633v, null);
            }
        }
    }

    private static void a(j1.a aVar, SparseArray sparseArray, boolean z2, int i2, byte[] bArr) {
        int size = aVar.d.size();
        for (int i3 = 0; i3 < size; i3++) {
            j1.a aVar2 = (j1.a) aVar.d.get(i3);
            if (aVar2.f24566a == 1953653094) {
                b(aVar2, sparseArray, z2, i2, bArr);
            }
        }
    }

    private static void a(bh bhVar, no noVar) {
        bhVar.f(8);
        int j2 = bhVar.j();
        if ((j1.b(j2) & 1) == 1) {
            bhVar.g(8);
        }
        int A = bhVar.A();
        if (A == 1) {
            noVar.d += j1.c(j2) == 0 ? bhVar.y() : bhVar.B();
        } else {
            throw dh.a("Unexpected saio entry count: " + A, null);
        }
    }

    private static void a(mo moVar, bh bhVar, no noVar) {
        int i2;
        int i3 = moVar.d;
        bhVar.f(8);
        if ((j1.b(bhVar.j()) & 1) == 1) {
            bhVar.g(8);
        }
        int w = bhVar.w();
        int A = bhVar.A();
        if (A <= noVar.f25758f) {
            if (w == 0) {
                boolean[] zArr = noVar.f25766n;
                i2 = 0;
                for (int i4 = 0; i4 < A; i4++) {
                    int w2 = bhVar.w();
                    i2 += w2;
                    zArr[i4] = w2 > i3;
                }
            } else {
                i2 = w * A;
                Arrays.fill(noVar.f25766n, 0, A, w > i3);
            }
            Arrays.fill(noVar.f25766n, A, noVar.f25758f, false);
            if (i2 > 0) {
                noVar.b(i2);
                return;
            }
            return;
        }
        StringBuilder t2 = android.support.v4.media.d.t("Saiz sample count ", A, " is greater than fragment sample count");
        t2.append(noVar.f25758f);
        throw dh.a(t2.toString(), null);
    }

    private static void a(j1.a aVar, String str, no noVar) {
        byte[] bArr = null;
        bh bhVar = null;
        bh bhVar2 = null;
        for (int i2 = 0; i2 < aVar.f24568c.size(); i2++) {
            j1.b bVar = (j1.b) aVar.f24568c.get(i2);
            bh bhVar3 = bVar.f24569b;
            int i3 = bVar.f24566a;
            if (i3 == 1935828848) {
                bhVar3.f(12);
                if (bhVar3.j() == 1936025959) {
                    bhVar = bhVar3;
                }
            } else if (i3 == 1936158820) {
                bhVar3.f(12);
                if (bhVar3.j() == 1936025959) {
                    bhVar2 = bhVar3;
                }
            }
        }
        if (bhVar == null || bhVar2 == null) {
            return;
        }
        bhVar.f(8);
        int c2 = j1.c(bhVar.j());
        bhVar.g(4);
        if (c2 == 1) {
            bhVar.g(4);
        }
        if (bhVar.j() == 1) {
            bhVar2.f(8);
            int c3 = j1.c(bhVar2.j());
            bhVar2.g(4);
            if (c3 == 1) {
                if (bhVar2.y() == 0) {
                    throw dh.a("Variable length description in sgpd found (unsupported)");
                }
            } else if (c3 >= 2) {
                bhVar2.g(4);
            }
            if (bhVar2.y() == 1) {
                bhVar2.g(1);
                int w = bhVar2.w();
                int i4 = (w & 240) >> 4;
                int i5 = w & 15;
                boolean z2 = bhVar2.w() == 1;
                if (z2) {
                    int w2 = bhVar2.w();
                    byte[] bArr2 = new byte[16];
                    bhVar2.a(bArr2, 0, 16);
                    if (w2 == 0) {
                        int w3 = bhVar2.w();
                        bArr = new byte[w3];
                        bhVar2.a(bArr, 0, w3);
                    }
                    noVar.f25765m = true;
                    noVar.f25767o = new mo(z2, str, w2, bArr2, i4, i5, bArr);
                    return;
                }
                return;
            }
            throw dh.a("Entry count in sgpd != 1 (unsupported).");
        }
        throw dh.a("Entry count in sbgp != 1 (unsupported).");
    }

    private static void a(bh bhVar, int i2, no noVar) {
        bhVar.f(i2 + 8);
        int b2 = j1.b(bhVar.j());
        if ((b2 & 1) == 0) {
            boolean z2 = (b2 & 2) != 0;
            int A = bhVar.A();
            if (A == 0) {
                Arrays.fill(noVar.f25766n, 0, noVar.f25758f, false);
                return;
            }
            if (A == noVar.f25758f) {
                Arrays.fill(noVar.f25766n, 0, A, z2);
                noVar.b(bhVar.a());
                noVar.a(bhVar);
                return;
            } else {
                StringBuilder t2 = android.support.v4.media.d.t("Senc sample count ", A, " is different from fragment sample count");
                t2.append(noVar.f25758f);
                throw dh.a(t2.toString(), null);
            }
        }
        throw dh.a("Overriding TrackEncryptionBox parameters is unsupported.");
    }

    private static Pair a(bh bhVar, long j2) {
        long B;
        long B2;
        bhVar.f(8);
        int c2 = j1.c(bhVar.j());
        bhVar.g(4);
        long y2 = bhVar.y();
        if (c2 == 0) {
            B = bhVar.y();
            B2 = bhVar.y();
        } else {
            B = bhVar.B();
            B2 = bhVar.B();
        }
        long j3 = B;
        long j4 = B2 + j2;
        long c3 = xp.c(j3, 1000000L, y2);
        bhVar.g(2);
        int C = bhVar.C();
        int[] iArr = new int[C];
        long[] jArr = new long[C];
        long[] jArr2 = new long[C];
        long[] jArr3 = new long[C];
        long j5 = c3;
        int i2 = 0;
        long j6 = j3;
        while (i2 < C) {
            int j7 = bhVar.j();
            if ((j7 & Integer.MIN_VALUE) == 0) {
                long y3 = bhVar.y();
                iArr[i2] = j7 & Api.BaseClientBuilder.API_PRIORITY_OTHER;
                jArr[i2] = j4;
                jArr3[i2] = j5;
                long j8 = j6 + y3;
                long[] jArr4 = jArr2;
                long[] jArr5 = jArr3;
                int i3 = C;
                long c4 = xp.c(j8, 1000000L, y2);
                jArr4[i2] = c4 - jArr5[i2];
                bhVar.g(4);
                j4 += r1[i2];
                i2++;
                iArr = iArr;
                jArr3 = jArr5;
                jArr2 = jArr4;
                jArr = jArr;
                C = i3;
                j6 = j8;
                j5 = c4;
            } else {
                throw dh.a("Unhandled indirect reference", null);
            }
        }
        return Pair.create(Long.valueOf(c3), new g3(iArr, jArr, jArr2, jArr3));
    }

    private static b a(bh bhVar, SparseArray sparseArray, boolean z2) {
        int i2;
        int i3;
        int i4;
        int i5;
        bhVar.f(8);
        int b2 = j1.b(bhVar.j());
        b bVar = (b) (z2 ? sparseArray.valueAt(0) : sparseArray.get(bhVar.j()));
        if (bVar == null) {
            return null;
        }
        if ((b2 & 1) != 0) {
            long B = bhVar.B();
            no noVar = bVar.f24639b;
            noVar.f25757c = B;
            noVar.d = B;
        }
        l6 l6Var = bVar.e;
        if ((b2 & 2) != 0) {
            i2 = bhVar.j() - 1;
        } else {
            i2 = l6Var.f25000a;
        }
        if ((b2 & 8) != 0) {
            i3 = bhVar.j();
        } else {
            i3 = l6Var.f25001b;
        }
        if ((b2 & 16) != 0) {
            i4 = bhVar.j();
        } else {
            i4 = l6Var.f25002c;
        }
        if ((b2 & 32) != 0) {
            i5 = bhVar.j();
        } else {
            i5 = l6Var.d;
        }
        bVar.f24639b.f25755a = new l6(i2, i3, i4, i5);
        return bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int a(com.applovin.impl.j9.b r36, int r37, int r38, com.applovin.impl.bh r39, int r40) {
        /*
            Method dump skipped, instructions count: 356
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.j9.a(com.applovin.impl.j9$b, int, int, com.applovin.impl.bh, int):int");
    }

    private static void a(j1.a aVar, b bVar, int i2) {
        List list = aVar.f24568c;
        int size = list.size();
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            j1.b bVar2 = (j1.b) list.get(i5);
            if (bVar2.f24566a == 1953658222) {
                bh bhVar = bVar2.f24569b;
                bhVar.f(12);
                int A = bhVar.A();
                if (A > 0) {
                    i4 += A;
                    i3++;
                }
            }
        }
        bVar.f24643h = 0;
        bVar.f24642g = 0;
        bVar.f24641f = 0;
        bVar.f24639b.a(i3, i4);
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            j1.b bVar3 = (j1.b) list.get(i8);
            if (bVar3.f24566a == 1953658222) {
                i7 = a(bVar, i6, i2, bVar3.f24569b, i7);
                i6++;
            }
        }
    }

    private static void a(bh bhVar, no noVar, byte[] bArr) {
        bhVar.f(8);
        bhVar.a(bArr, 0, 16);
        if (Arrays.equals(bArr, J)) {
            a(bhVar, 16, noVar);
        }
    }

    @Override // com.applovin.impl.k8
    public int a(l8 l8Var, th thVar) {
        while (true) {
            int i2 = this.f24627p;
            if (i2 != 0) {
                if (i2 == 1) {
                    c(l8Var);
                } else if (i2 != 2) {
                    if (e(l8Var)) {
                        return 0;
                    }
                } else {
                    d(l8Var);
                }
            } else if (!b(l8Var)) {
                return -1;
            }
        }
    }

    @Override // com.applovin.impl.k8
    public void a(long j2, long j3) {
        int size = this.d.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((b) this.d.valueAt(i2)).g();
        }
        this.f24625n.clear();
        this.f24633v = 0;
        this.w = j3;
        this.f24624m.clear();
        b();
    }

    @Override // com.applovin.impl.k8
    public boolean a(l8 l8Var) {
        return lk.a(l8Var);
    }
}
