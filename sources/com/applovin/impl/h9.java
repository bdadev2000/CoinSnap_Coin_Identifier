package com.applovin.impl;

import android.util.Pair;
import android.util.SparseArray;
import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.exoplayer2.common.base.Function;
import com.applovin.impl.AbstractC0708i1;
import com.applovin.impl.d9;
import com.applovin.impl.ej;
import com.applovin.impl.w6;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* loaded from: classes.dex */
public class h9 implements i8 {

    /* renamed from: I */
    public static final m8 f8075I = new A0(4);

    /* renamed from: J */
    private static final byte[] f8076J = {-94, 57, 79, 82, 90, -101, 79, Ascii.DC4, -94, 68, 108, 66, 124, 100, -115, -12};

    /* renamed from: K */
    private static final d9 f8077K = new d9.b().f(MimeTypes.APPLICATION_EMSG).a();

    /* renamed from: A */
    private int f8078A;

    /* renamed from: B */
    private int f8079B;

    /* renamed from: C */
    private int f8080C;

    /* renamed from: D */
    private boolean f8081D;

    /* renamed from: E */
    private k8 f8082E;

    /* renamed from: F */
    private ro[] f8083F;

    /* renamed from: G */
    private ro[] f8084G;

    /* renamed from: H */
    private boolean f8085H;

    /* renamed from: a */
    private final int f8086a;
    private final mo b;

    /* renamed from: c */
    private final List f8087c;

    /* renamed from: d */
    private final SparseArray f8088d;

    /* renamed from: e */
    private final yg f8089e;

    /* renamed from: f */
    private final yg f8090f;

    /* renamed from: g */
    private final yg f8091g;

    /* renamed from: h */
    private final byte[] f8092h;

    /* renamed from: i */
    private final yg f8093i;

    /* renamed from: j */
    private final io f8094j;

    /* renamed from: k */
    private final w7 f8095k;
    private final yg l;
    private final ArrayDeque m;

    /* renamed from: n */
    private final ArrayDeque f8096n;

    /* renamed from: o */
    private final ro f8097o;

    /* renamed from: p */
    private int f8098p;

    /* renamed from: q */
    private int f8099q;

    /* renamed from: r */
    private long f8100r;

    /* renamed from: s */
    private int f8101s;

    /* renamed from: t */
    private yg f8102t;

    /* renamed from: u */
    private long f8103u;

    /* renamed from: v */
    private int f8104v;

    /* renamed from: w */
    private long f8105w;

    /* renamed from: x */
    private long f8106x;

    /* renamed from: y */
    private long f8107y;

    /* renamed from: z */
    private b f8108z;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final long f8109a;
        public final int b;

        public a(long j7, int i9) {
            this.f8109a = j7;
            this.b = i9;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        public final ro f8110a;

        /* renamed from: d */
        public so f8112d;

        /* renamed from: e */
        public j6 f8113e;

        /* renamed from: f */
        public int f8114f;

        /* renamed from: g */
        public int f8115g;

        /* renamed from: h */
        public int f8116h;

        /* renamed from: i */
        public int f8117i;
        private boolean l;
        public final oo b = new oo();

        /* renamed from: c */
        public final yg f8111c = new yg();

        /* renamed from: j */
        private final yg f8118j = new yg(1);

        /* renamed from: k */
        private final yg f8119k = new yg();

        public b(ro roVar, so soVar, j6 j6Var) {
            this.f8110a = roVar;
            this.f8112d = soVar;
            this.f8113e = j6Var;
            a(soVar, j6Var);
        }

        public long b() {
            if (!this.l) {
                return this.f8112d.f11228c[this.f8114f];
            }
            return this.b.f9936g[this.f8116h];
        }

        public long c() {
            if (!this.l) {
                return this.f8112d.f11231f[this.f8114f];
            }
            return this.b.a(this.f8114f);
        }

        public int d() {
            if (!this.l) {
                return this.f8112d.f11229d[this.f8114f];
            }
            return this.b.f9938i[this.f8114f];
        }

        public no e() {
            if (!this.l) {
                return null;
            }
            int i9 = ((j6) yp.a(this.b.f9931a)).f8414a;
            no noVar = this.b.f9942o;
            if (noVar == null) {
                noVar = this.f8112d.f11227a.a(i9);
            }
            if (noVar == null || !noVar.f9361a) {
                return null;
            }
            return noVar;
        }

        public boolean f() {
            this.f8114f++;
            if (!this.l) {
                return false;
            }
            int i9 = this.f8115g + 1;
            this.f8115g = i9;
            int[] iArr = this.b.f9937h;
            int i10 = this.f8116h;
            if (i9 != iArr[i10]) {
                return true;
            }
            this.f8116h = i10 + 1;
            this.f8115g = 0;
            return false;
        }

        public void g() {
            this.b.a();
            this.f8114f = 0;
            this.f8116h = 0;
            this.f8115g = 0;
            this.f8117i = 0;
            this.l = false;
        }

        public void h() {
            no e4 = e();
            if (e4 == null) {
                return;
            }
            yg ygVar = this.b.f9943p;
            int i9 = e4.f9363d;
            if (i9 != 0) {
                ygVar.g(i9);
            }
            if (this.b.c(this.f8114f)) {
                ygVar.g(ygVar.C() * 6);
            }
        }

        public int a() {
            int i9;
            if (!this.l) {
                i9 = this.f8112d.f11232g[this.f8114f];
            } else {
                i9 = this.b.l[this.f8114f] ? 1 : 0;
            }
            return e() != null ? i9 | 1073741824 : i9;
        }

        public int a(int i9, int i10) {
            yg ygVar;
            no e4 = e();
            if (e4 == null) {
                return 0;
            }
            int i11 = e4.f9363d;
            if (i11 != 0) {
                ygVar = this.b.f9943p;
            } else {
                byte[] bArr = (byte[]) yp.a((Object) e4.f9364e);
                this.f8119k.a(bArr, bArr.length);
                yg ygVar2 = this.f8119k;
                i11 = bArr.length;
                ygVar = ygVar2;
            }
            boolean c9 = this.b.c(this.f8114f);
            boolean z8 = c9 || i10 != 0;
            this.f8118j.c()[0] = (byte) ((z8 ? 128 : 0) | i11);
            this.f8118j.f(0);
            this.f8110a.a(this.f8118j, 1, 1);
            this.f8110a.a(ygVar, i11, 1);
            if (!z8) {
                return i11 + 1;
            }
            if (!c9) {
                this.f8111c.d(8);
                byte[] c10 = this.f8111c.c();
                c10[0] = 0;
                c10[1] = 1;
                c10[2] = (byte) ((i10 >> 8) & 255);
                c10[3] = (byte) (i10 & 255);
                c10[4] = (byte) ((i9 >> 24) & 255);
                c10[5] = (byte) ((i9 >> 16) & 255);
                c10[6] = (byte) ((i9 >> 8) & 255);
                c10[7] = (byte) (i9 & 255);
                this.f8110a.a(this.f8111c, 8, 1);
                return i11 + 9;
            }
            yg ygVar3 = this.b.f9943p;
            int C8 = ygVar3.C();
            ygVar3.g(-2);
            int i12 = (C8 * 6) + 2;
            if (i10 != 0) {
                this.f8111c.d(i12);
                byte[] c11 = this.f8111c.c();
                ygVar3.a(c11, 0, i12);
                int i13 = (((c11[2] & 255) << 8) | (c11[3] & 255)) + i10;
                c11[2] = (byte) ((i13 >> 8) & 255);
                c11[3] = (byte) (i13 & 255);
                ygVar3 = this.f8111c;
            }
            this.f8110a.a(ygVar3, i12, 1);
            return i11 + 1 + i12;
        }

        public void a(so soVar, j6 j6Var) {
            this.f8112d = soVar;
            this.f8113e = j6Var;
            this.f8110a.a(soVar.f11227a.f9216f);
            g();
        }

        public void a(long j7) {
            int i9 = this.f8114f;
            while (true) {
                oo ooVar = this.b;
                if (i9 >= ooVar.f9935f || ooVar.a(i9) >= j7) {
                    return;
                }
                if (this.b.l[i9]) {
                    this.f8117i = i9;
                }
                i9++;
            }
        }

        public void a(w6 w6Var) {
            no a6 = this.f8112d.f11227a.a(((j6) yp.a(this.b.f9931a)).f8414a);
            this.f8110a.a(this.f8112d.f11227a.f9216f.a().a(w6Var.a(a6 != null ? a6.b : null)).a());
        }
    }

    public h9() {
        this(0);
    }

    private static boolean b(int i9) {
        return i9 == 1836019574 || i9 == 1953653099 || i9 == 1835297121 || i9 == 1835626086 || i9 == 1937007212 || i9 == 1836019558 || i9 == 1953653094 || i9 == 1836475768 || i9 == 1701082227;
    }

    private static boolean c(int i9) {
        return i9 == 1751411826 || i9 == 1835296868 || i9 == 1836476516 || i9 == 1936286840 || i9 == 1937011556 || i9 == 1937011827 || i9 == 1668576371 || i9 == 1937011555 || i9 == 1937011578 || i9 == 1937013298 || i9 == 1937007471 || i9 == 1668232756 || i9 == 1937011571 || i9 == 1952867444 || i9 == 1952868452 || i9 == 1953196132 || i9 == 1953654136 || i9 == 1953658222 || i9 == 1886614376 || i9 == 1935763834 || i9 == 1935763823 || i9 == 1936027235 || i9 == 1970628964 || i9 == 1935828848 || i9 == 1936158820 || i9 == 1701606260 || i9 == 1835362404 || i9 == 1701671783;
    }

    private static Pair d(yg ygVar) {
        ygVar.f(12);
        return Pair.create(Integer.valueOf(ygVar.j()), new j6(ygVar.j() - 1, ygVar.j(), ygVar.j(), ygVar.j()));
    }

    public mo a(mo moVar) {
        return moVar;
    }

    public h9(int i9) {
        this(i9, null);
    }

    private void b() {
        this.f8098p = 0;
        this.f8101s = 0;
    }

    private void c() {
        int i9;
        ro[] roVarArr = new ro[2];
        this.f8083F = roVarArr;
        ro roVar = this.f8097o;
        int i10 = 0;
        if (roVar != null) {
            roVarArr[0] = roVar;
            i9 = 1;
        } else {
            i9 = 0;
        }
        int i11 = 100;
        if ((this.f8086a & 4) != 0) {
            roVarArr[i9] = this.f8082E.a(100, 5);
            i11 = 101;
            i9++;
        }
        ro[] roVarArr2 = (ro[]) yp.a(this.f8083F, i9);
        this.f8083F = roVarArr2;
        for (ro roVar2 : roVarArr2) {
            roVar2.a(f8077K);
        }
        this.f8084G = new ro[this.f8087c.size()];
        while (i10 < this.f8084G.length) {
            ro a6 = this.f8082E.a(i11, 3);
            a6.a((d9) this.f8087c.get(i10));
            this.f8084G[i10] = a6;
            i10++;
            i11++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private boolean e(j8 j8Var) {
        int a6;
        b bVar = this.f8108z;
        Throwable th = null;
        if (bVar == null) {
            bVar = a(this.f8088d);
            if (bVar == null) {
                int f9 = (int) (this.f8103u - j8Var.f());
                if (f9 >= 0) {
                    j8Var.a(f9);
                    b();
                    return false;
                }
                throw ah.a("Offset to end of mdat was negative.", null);
            }
            int b8 = (int) (bVar.b() - j8Var.f());
            if (b8 < 0) {
                kc.d("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                b8 = 0;
            }
            j8Var.a(b8);
            this.f8108z = bVar;
        }
        int i9 = 4;
        int i10 = 1;
        if (this.f8098p == 3) {
            int d2 = bVar.d();
            this.f8078A = d2;
            if (bVar.f8114f < bVar.f8117i) {
                j8Var.a(d2);
                bVar.h();
                if (!bVar.f()) {
                    this.f8108z = null;
                }
                this.f8098p = 3;
                return true;
            }
            if (bVar.f8112d.f11227a.f9217g == 1) {
                this.f8078A = d2 - 8;
                j8Var.a(8);
            }
            if ("audio/ac4".equals(bVar.f8112d.f11227a.f9216f.m)) {
                this.f8079B = bVar.a(this.f8078A, 7);
                AbstractC0726n.a(this.f8078A, this.f8093i);
                bVar.f8110a.a(this.f8093i, 7);
                this.f8079B += 7;
            } else {
                this.f8079B = bVar.a(this.f8078A, 0);
            }
            this.f8078A += this.f8079B;
            this.f8098p = 4;
            this.f8080C = 0;
        }
        mo moVar = bVar.f8112d.f11227a;
        ro roVar = bVar.f8110a;
        long c9 = bVar.c();
        io ioVar = this.f8094j;
        if (ioVar != null) {
            c9 = ioVar.a(c9);
        }
        long j7 = c9;
        if (moVar.f9220j == 0) {
            while (true) {
                int i11 = this.f8079B;
                int i12 = this.f8078A;
                if (i11 >= i12) {
                    break;
                }
                this.f8079B += roVar.a((e5) j8Var, i12 - i11, false);
            }
        } else {
            byte[] c10 = this.f8090f.c();
            c10[0] = 0;
            c10[1] = 0;
            c10[2] = 0;
            int i13 = moVar.f9220j;
            int i14 = i13 + 1;
            int i15 = 4 - i13;
            while (this.f8079B < this.f8078A) {
                int i16 = this.f8080C;
                if (i16 == 0) {
                    j8Var.d(c10, i15, i14);
                    this.f8090f.f(0);
                    int j9 = this.f8090f.j();
                    if (j9 >= i10) {
                        this.f8080C = j9 - 1;
                        this.f8089e.f(0);
                        roVar.a(this.f8089e, i9);
                        roVar.a(this.f8090f, i10);
                        this.f8081D = (this.f8084G.length <= 0 || !uf.a(moVar.f9216f.m, c10[i9])) ? 0 : i10;
                        this.f8079B += 5;
                        this.f8078A += i15;
                    } else {
                        throw ah.a("Invalid NAL length", th);
                    }
                } else {
                    if (this.f8081D) {
                        this.f8091g.d(i16);
                        j8Var.d(this.f8091g.c(), 0, this.f8080C);
                        roVar.a(this.f8091g, this.f8080C);
                        a6 = this.f8080C;
                        int c11 = uf.c(this.f8091g.c(), this.f8091g.e());
                        this.f8091g.f(MimeTypes.VIDEO_H265.equals(moVar.f9216f.m) ? 1 : 0);
                        this.f8091g.e(c11);
                        AbstractC0671a3.a(j7, this.f8091g, this.f8084G);
                    } else {
                        a6 = roVar.a((e5) j8Var, i16, false);
                    }
                    this.f8079B += a6;
                    this.f8080C -= a6;
                    th = null;
                    i9 = 4;
                    i10 = 1;
                }
            }
        }
        int a9 = bVar.a();
        no e4 = bVar.e();
        roVar.a(j7, a9, this.f8078A, 0, e4 != null ? e4.f9362c : null);
        a(j7);
        if (!bVar.f()) {
            this.f8108z = null;
        }
        this.f8098p = 3;
        return true;
    }

    @Override // com.applovin.impl.i8
    public void a() {
    }

    public h9(int i9, io ioVar) {
        this(i9, ioVar, null, Collections.emptyList());
    }

    private static int a(int i9) {
        if (i9 >= 0) {
            return i9;
        }
        throw ah.a("Unexpected negative value: " + i9, null);
    }

    public h9(int i9, io ioVar, mo moVar, List list) {
        this(i9, ioVar, moVar, list, null);
    }

    private j6 a(SparseArray sparseArray, int i9) {
        if (sparseArray.size() == 1) {
            return (j6) sparseArray.valueAt(0);
        }
        return (j6) AbstractC0669a1.a((j6) sparseArray.get(i9));
    }

    private void b(AbstractC0708i1.a aVar) {
        a(aVar, this.f8088d, this.b != null, this.f8086a, this.f8092h);
        w6 a6 = a(aVar.f8201c);
        if (a6 != null) {
            int size = this.f8088d.size();
            for (int i9 = 0; i9 < size; i9++) {
                ((b) this.f8088d.valueAt(i9)).a(a6);
            }
        }
        if (this.f8105w != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
            int size2 = this.f8088d.size();
            for (int i10 = 0; i10 < size2; i10++) {
                ((b) this.f8088d.valueAt(i10)).a(this.f8105w);
            }
            this.f8105w = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        }
    }

    public h9(int i9, io ioVar, mo moVar, List list, ro roVar) {
        this.f8086a = i9;
        this.f8094j = ioVar;
        this.b = moVar;
        this.f8087c = Collections.unmodifiableList(list);
        this.f8097o = roVar;
        this.f8095k = new w7();
        this.l = new yg(16);
        this.f8089e = new yg(uf.f11591a);
        this.f8090f = new yg(5);
        this.f8091g = new yg();
        byte[] bArr = new byte[16];
        this.f8092h = bArr;
        this.f8093i = new yg(bArr);
        this.m = new ArrayDeque();
        this.f8096n = new ArrayDeque();
        this.f8088d = new SparseArray();
        this.f8106x = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        this.f8105w = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        this.f8107y = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        this.f8082E = k8.f8609e;
        this.f8083F = new ro[0];
        this.f8084G = new ro[0];
    }

    private static w6 a(List list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i9 = 0; i9 < size; i9++) {
            AbstractC0708i1.b bVar = (AbstractC0708i1.b) list.get(i9);
            if (bVar.f8200a == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] c9 = bVar.b.c();
                UUID c10 = fi.c(c9);
                if (c10 == null) {
                    kc.d("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new w6.b(c10, MimeTypes.VIDEO_MP4, c9));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new w6(arrayList);
    }

    private void d(j8 j8Var) {
        int size = this.f8088d.size();
        long j7 = Long.MAX_VALUE;
        b bVar = null;
        for (int i9 = 0; i9 < size; i9++) {
            oo ooVar = ((b) this.f8088d.valueAt(i9)).b;
            if (ooVar.f9944q) {
                long j9 = ooVar.f9933d;
                if (j9 < j7) {
                    bVar = (b) this.f8088d.valueAt(i9);
                    j7 = j9;
                }
            }
        }
        if (bVar == null) {
            this.f8098p = 3;
            return;
        }
        int f9 = (int) (j7 - j8Var.f());
        if (f9 >= 0) {
            j8Var.a(f9);
            bVar.b.a(j8Var);
            return;
        }
        throw ah.a("Offset to encryption data was negative.", null);
    }

    private static long b(yg ygVar) {
        ygVar.f(8);
        return AbstractC0708i1.c(ygVar.j()) == 0 ? ygVar.y() : ygVar.B();
    }

    private static b a(SparseArray sparseArray) {
        int size = sparseArray.size();
        b bVar = null;
        long j7 = Long.MAX_VALUE;
        for (int i9 = 0; i9 < size; i9++) {
            b bVar2 = (b) sparseArray.valueAt(i9);
            if ((bVar2.l || bVar2.f8114f != bVar2.f8112d.b) && (!bVar2.l || bVar2.f8116h != bVar2.b.f9934e)) {
                long b8 = bVar2.b();
                if (b8 < j7) {
                    bVar = bVar2;
                    j7 = b8;
                }
            }
        }
        return bVar;
    }

    private static void b(yg ygVar, oo ooVar) {
        a(ygVar, 0, ooVar);
    }

    private void c(AbstractC0708i1.a aVar) {
        int i9 = 0;
        AbstractC0669a1.b(this.b == null, "Unexpected moov box.");
        w6 a6 = a(aVar.f8201c);
        AbstractC0708i1.a aVar2 = (AbstractC0708i1.a) AbstractC0669a1.a(aVar.d(1836475768));
        SparseArray sparseArray = new SparseArray();
        int size = aVar2.f8201c.size();
        long j7 = -9223372036854775807L;
        for (int i10 = 0; i10 < size; i10++) {
            AbstractC0708i1.b bVar = (AbstractC0708i1.b) aVar2.f8201c.get(i10);
            int i11 = bVar.f8200a;
            if (i11 == 1953654136) {
                Pair d2 = d(bVar.b);
                sparseArray.put(((Integer) d2.first).intValue(), (j6) d2.second);
            } else if (i11 == 1835362404) {
                j7 = b(bVar.b);
            }
        }
        List a9 = AbstractC0712j1.a(aVar, new x9(), j7, a6, (this.f8086a & 16) != 0, false, new Function() { // from class: com.applovin.impl.N0
            @Override // com.applovin.exoplayer2.common.base.Function
            public final Object apply(Object obj) {
                return h9.this.a((mo) obj);
            }
        });
        int size2 = a9.size();
        if (this.f8088d.size() == 0) {
            while (i9 < size2) {
                so soVar = (so) a9.get(i9);
                mo moVar = soVar.f11227a;
                this.f8088d.put(moVar.f9212a, new b(this.f8082E.a(i9, moVar.b), soVar, a(sparseArray, moVar.f9212a)));
                this.f8106x = Math.max(this.f8106x, moVar.f9215e);
                i9++;
            }
            this.f8082E.c();
            return;
        }
        AbstractC0669a1.b(this.f8088d.size() == size2);
        while (i9 < size2) {
            so soVar2 = (so) a9.get(i9);
            mo moVar2 = soVar2.f11227a;
            ((b) this.f8088d.get(moVar2.f9212a)).a(soVar2, a(sparseArray, moVar2.f9212a));
            i9++;
        }
    }

    private static void b(AbstractC0708i1.a aVar, SparseArray sparseArray, boolean z8, int i9, byte[] bArr) {
        b a6 = a(((AbstractC0708i1.b) AbstractC0669a1.a(aVar.e(1952868452))).b, sparseArray, z8);
        if (a6 == null) {
            return;
        }
        oo ooVar = a6.b;
        long j7 = ooVar.f9945r;
        boolean z9 = ooVar.f9946s;
        a6.g();
        a6.l = true;
        AbstractC0708i1.b e4 = aVar.e(1952867444);
        if (e4 != null && (i9 & 2) == 0) {
            ooVar.f9945r = c(e4.b);
            ooVar.f9946s = true;
        } else {
            ooVar.f9945r = j7;
            ooVar.f9946s = z9;
        }
        a(aVar, a6, i9);
        no a9 = a6.f8112d.f11227a.a(((j6) AbstractC0669a1.a(ooVar.f9931a)).f8414a);
        AbstractC0708i1.b e9 = aVar.e(1935763834);
        if (e9 != null) {
            a((no) AbstractC0669a1.a(a9), e9.b, ooVar);
        }
        AbstractC0708i1.b e10 = aVar.e(1935763823);
        if (e10 != null) {
            a(e10.b, ooVar);
        }
        AbstractC0708i1.b e11 = aVar.e(1936027235);
        if (e11 != null) {
            b(e11.b, ooVar);
        }
        a(aVar, a9 != null ? a9.b : null, ooVar);
        int size = aVar.f8201c.size();
        for (int i10 = 0; i10 < size; i10++) {
            AbstractC0708i1.b bVar = (AbstractC0708i1.b) aVar.f8201c.get(i10);
            if (bVar.f8200a == 1970628964) {
                a(bVar.b, ooVar, bArr);
            }
        }
    }

    public static /* synthetic */ i8[] d() {
        return new i8[]{new h9()};
    }

    @Override // com.applovin.impl.i8
    public void a(k8 k8Var) {
        this.f8082E = k8Var;
        b();
        c();
        mo moVar = this.b;
        if (moVar != null) {
            this.f8088d.put(0, new b(k8Var.a(0, moVar.b), new so(this.b, new long[0], new int[0], 0, new long[0], new int[0], 0L), new j6(0, 0, 0, 0)));
            this.f8082E.c();
        }
    }

    private void a(AbstractC0708i1.a aVar) {
        int i9 = aVar.f8200a;
        if (i9 == 1836019574) {
            c(aVar);
        } else if (i9 == 1836019558) {
            b(aVar);
        } else {
            if (this.m.isEmpty()) {
                return;
            }
            ((AbstractC0708i1.a) this.m.peek()).a(aVar);
        }
    }

    private void a(yg ygVar) {
        long c9;
        String str;
        long c10;
        String str2;
        long y4;
        long j7;
        if (this.f8083F.length == 0) {
            return;
        }
        ygVar.f(8);
        int c11 = AbstractC0708i1.c(ygVar.j());
        if (c11 != 0) {
            if (c11 != 1) {
                L.p(c11, "Skipping unsupported emsg version: ", "FragmentedMp4Extractor");
                return;
            }
            long y6 = ygVar.y();
            j7 = yp.c(ygVar.B(), 1000000L, y6);
            long c12 = yp.c(ygVar.y(), 1000L, y6);
            long y9 = ygVar.y();
            str = (String) AbstractC0669a1.a((Object) ygVar.t());
            c10 = c12;
            y4 = y9;
            str2 = (String) AbstractC0669a1.a((Object) ygVar.t());
            c9 = -9223372036854775807L;
        } else {
            String str3 = (String) AbstractC0669a1.a((Object) ygVar.t());
            String str4 = (String) AbstractC0669a1.a((Object) ygVar.t());
            long y10 = ygVar.y();
            c9 = yp.c(ygVar.y(), 1000000L, y10);
            long j9 = this.f8107y;
            long j10 = j9 != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET ? j9 + c9 : -9223372036854775807L;
            str = str3;
            c10 = yp.c(ygVar.y(), 1000L, y10);
            str2 = str4;
            y4 = ygVar.y();
            j7 = j10;
        }
        byte[] bArr = new byte[ygVar.a()];
        ygVar.a(bArr, 0, ygVar.a());
        yg ygVar2 = new yg(this.f8095k.a(new u7(str, str2, c10, y4, bArr)));
        int a6 = ygVar2.a();
        for (ro roVar : this.f8083F) {
            ygVar2.f(0);
            roVar.a(ygVar2, a6);
        }
        if (j7 == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
            this.f8096n.addLast(new a(c9, a6));
            this.f8104v += a6;
            return;
        }
        io ioVar = this.f8094j;
        if (ioVar != null) {
            j7 = ioVar.a(j7);
        }
        for (ro roVar2 : this.f8083F) {
            roVar2.a(j7, 1, a6, 0, null);
        }
    }

    private void b(long j7) {
        while (!this.m.isEmpty() && ((AbstractC0708i1.a) this.m.peek()).b == j7) {
            a((AbstractC0708i1.a) this.m.pop());
        }
        b();
    }

    private static long c(yg ygVar) {
        ygVar.f(8);
        return AbstractC0708i1.c(ygVar.j()) == 1 ? ygVar.B() : ygVar.y();
    }

    private boolean b(j8 j8Var) {
        if (this.f8101s == 0) {
            if (!j8Var.a(this.l.c(), 0, 8, true)) {
                return false;
            }
            this.f8101s = 8;
            this.l.f(0);
            this.f8100r = this.l.y();
            this.f8099q = this.l.j();
        }
        long j7 = this.f8100r;
        if (j7 == 1) {
            j8Var.d(this.l.c(), 8, 8);
            this.f8101s += 8;
            this.f8100r = this.l.B();
        } else if (j7 == 0) {
            long a6 = j8Var.a();
            if (a6 == -1 && !this.m.isEmpty()) {
                a6 = ((AbstractC0708i1.a) this.m.peek()).b;
            }
            if (a6 != -1) {
                this.f8100r = (a6 - j8Var.f()) + this.f8101s;
            }
        }
        if (this.f8100r >= this.f8101s) {
            long f9 = j8Var.f() - this.f8101s;
            int i9 = this.f8099q;
            if ((i9 == 1836019558 || i9 == 1835295092) && !this.f8085H) {
                this.f8082E.a(new ej.b(this.f8106x, f9));
                this.f8085H = true;
            }
            if (this.f8099q == 1836019558) {
                int size = this.f8088d.size();
                for (int i10 = 0; i10 < size; i10++) {
                    oo ooVar = ((b) this.f8088d.valueAt(i10)).b;
                    ooVar.b = f9;
                    ooVar.f9933d = f9;
                    ooVar.f9932c = f9;
                }
            }
            int i11 = this.f8099q;
            if (i11 == 1835295092) {
                this.f8108z = null;
                this.f8103u = f9 + this.f8100r;
                this.f8098p = 2;
                return true;
            }
            if (b(i11)) {
                long f10 = (j8Var.f() + this.f8100r) - 8;
                this.m.push(new AbstractC0708i1.a(this.f8099q, f10));
                if (this.f8100r == this.f8101s) {
                    b(f10);
                } else {
                    b();
                }
            } else if (c(this.f8099q)) {
                if (this.f8101s == 8) {
                    long j9 = this.f8100r;
                    if (j9 <= 2147483647L) {
                        yg ygVar = new yg((int) j9);
                        System.arraycopy(this.l.c(), 0, ygVar.c(), 0, 8);
                        this.f8102t = ygVar;
                        this.f8098p = 1;
                    } else {
                        throw ah.a("Leaf atom with length > 2147483647 (unsupported).");
                    }
                } else {
                    throw ah.a("Leaf atom defines extended atom size (unsupported).");
                }
            } else if (this.f8100r <= 2147483647L) {
                this.f8102t = null;
                this.f8098p = 1;
            } else {
                throw ah.a("Skipping atom with length > 2147483647 (unsupported).");
            }
            return true;
        }
        throw ah.a("Atom size less than header length (unsupported).");
    }

    private void c(j8 j8Var) {
        int i9 = ((int) this.f8100r) - this.f8101s;
        yg ygVar = this.f8102t;
        if (ygVar != null) {
            j8Var.d(ygVar.c(), 8, i9);
            a(new AbstractC0708i1.b(this.f8099q, ygVar), j8Var.f());
        } else {
            j8Var.a(i9);
        }
        b(j8Var.f());
    }

    private void a(AbstractC0708i1.b bVar, long j7) {
        if (!this.m.isEmpty()) {
            ((AbstractC0708i1.a) this.m.peek()).a(bVar);
            return;
        }
        int i9 = bVar.f8200a;
        if (i9 != 1936286840) {
            if (i9 == 1701671783) {
                a(bVar.b);
            }
        } else {
            Pair a6 = a(bVar.b, j7);
            this.f8107y = ((Long) a6.first).longValue();
            this.f8082E.a((ej) a6.second);
            this.f8085H = true;
        }
    }

    private void a(long j7) {
        while (!this.f8096n.isEmpty()) {
            a aVar = (a) this.f8096n.removeFirst();
            this.f8104v -= aVar.b;
            long j9 = aVar.f8109a + j7;
            io ioVar = this.f8094j;
            if (ioVar != null) {
                j9 = ioVar.a(j9);
            }
            for (ro roVar : this.f8083F) {
                roVar.a(j9, 1, aVar.b, this.f8104v, null);
            }
        }
    }

    private static void a(AbstractC0708i1.a aVar, SparseArray sparseArray, boolean z8, int i9, byte[] bArr) {
        int size = aVar.f8202d.size();
        for (int i10 = 0; i10 < size; i10++) {
            AbstractC0708i1.a aVar2 = (AbstractC0708i1.a) aVar.f8202d.get(i10);
            if (aVar2.f8200a == 1953653094) {
                b(aVar2, sparseArray, z8, i9, bArr);
            }
        }
    }

    private static void a(yg ygVar, oo ooVar) {
        ygVar.f(8);
        int j7 = ygVar.j();
        if ((AbstractC0708i1.b(j7) & 1) == 1) {
            ygVar.g(8);
        }
        int A8 = ygVar.A();
        if (A8 == 1) {
            ooVar.f9933d += AbstractC0708i1.c(j7) == 0 ? ygVar.y() : ygVar.B();
        } else {
            throw ah.a("Unexpected saio entry count: " + A8, null);
        }
    }

    private static void a(no noVar, yg ygVar, oo ooVar) {
        int i9;
        int i10 = noVar.f9363d;
        ygVar.f(8);
        if ((AbstractC0708i1.b(ygVar.j()) & 1) == 1) {
            ygVar.g(8);
        }
        int w2 = ygVar.w();
        int A8 = ygVar.A();
        if (A8 <= ooVar.f9935f) {
            if (w2 == 0) {
                boolean[] zArr = ooVar.f9941n;
                i9 = 0;
                for (int i11 = 0; i11 < A8; i11++) {
                    int w9 = ygVar.w();
                    i9 += w9;
                    zArr[i11] = w9 > i10;
                }
            } else {
                i9 = w2 * A8;
                Arrays.fill(ooVar.f9941n, 0, A8, w2 > i10);
            }
            Arrays.fill(ooVar.f9941n, A8, ooVar.f9935f, false);
            if (i9 > 0) {
                ooVar.b(i9);
                return;
            }
            return;
        }
        StringBuilder p2 = Q7.n0.p(A8, "Saiz sample count ", " is greater than fragment sample count");
        p2.append(ooVar.f9935f);
        throw ah.a(p2.toString(), null);
    }

    private static void a(AbstractC0708i1.a aVar, String str, oo ooVar) {
        byte[] bArr = null;
        yg ygVar = null;
        yg ygVar2 = null;
        for (int i9 = 0; i9 < aVar.f8201c.size(); i9++) {
            AbstractC0708i1.b bVar = (AbstractC0708i1.b) aVar.f8201c.get(i9);
            yg ygVar3 = bVar.b;
            int i10 = bVar.f8200a;
            if (i10 == 1935828848) {
                ygVar3.f(12);
                if (ygVar3.j() == 1936025959) {
                    ygVar = ygVar3;
                }
            } else if (i10 == 1936158820) {
                ygVar3.f(12);
                if (ygVar3.j() == 1936025959) {
                    ygVar2 = ygVar3;
                }
            }
        }
        if (ygVar == null || ygVar2 == null) {
            return;
        }
        ygVar.f(8);
        int c9 = AbstractC0708i1.c(ygVar.j());
        ygVar.g(4);
        if (c9 == 1) {
            ygVar.g(4);
        }
        if (ygVar.j() == 1) {
            ygVar2.f(8);
            int c10 = AbstractC0708i1.c(ygVar2.j());
            ygVar2.g(4);
            if (c10 == 1) {
                if (ygVar2.y() == 0) {
                    throw ah.a("Variable length description in sgpd found (unsupported)");
                }
            } else if (c10 >= 2) {
                ygVar2.g(4);
            }
            if (ygVar2.y() == 1) {
                ygVar2.g(1);
                int w2 = ygVar2.w();
                int i11 = (w2 & PsExtractor.VIDEO_STREAM_MASK) >> 4;
                int i12 = w2 & 15;
                boolean z8 = ygVar2.w() == 1;
                if (z8) {
                    int w9 = ygVar2.w();
                    byte[] bArr2 = new byte[16];
                    ygVar2.a(bArr2, 0, 16);
                    if (w9 == 0) {
                        int w10 = ygVar2.w();
                        bArr = new byte[w10];
                        ygVar2.a(bArr, 0, w10);
                    }
                    ooVar.m = true;
                    ooVar.f9942o = new no(z8, str, w9, bArr2, i11, i12, bArr);
                    return;
                }
                return;
            }
            throw ah.a("Entry count in sgpd != 1 (unsupported).");
        }
        throw ah.a("Entry count in sbgp != 1 (unsupported).");
    }

    private static void a(yg ygVar, int i9, oo ooVar) {
        ygVar.f(i9 + 8);
        int b8 = AbstractC0708i1.b(ygVar.j());
        if ((b8 & 1) == 0) {
            boolean z8 = (b8 & 2) != 0;
            int A8 = ygVar.A();
            if (A8 == 0) {
                Arrays.fill(ooVar.f9941n, 0, ooVar.f9935f, false);
                return;
            }
            if (A8 == ooVar.f9935f) {
                Arrays.fill(ooVar.f9941n, 0, A8, z8);
                ooVar.b(ygVar.a());
                ooVar.a(ygVar);
                return;
            } else {
                StringBuilder p2 = Q7.n0.p(A8, "Senc sample count ", " is different from fragment sample count");
                p2.append(ooVar.f9935f);
                throw ah.a(p2.toString(), null);
            }
        }
        throw ah.a("Overriding TrackEncryptionBox parameters is unsupported.");
    }

    private static Pair a(yg ygVar, long j7) {
        long B5;
        long B8;
        ygVar.f(8);
        int c9 = AbstractC0708i1.c(ygVar.j());
        ygVar.g(4);
        long y4 = ygVar.y();
        if (c9 == 0) {
            B5 = ygVar.y();
            B8 = ygVar.y();
        } else {
            B5 = ygVar.B();
            B8 = ygVar.B();
        }
        long j9 = B5;
        long j10 = B8 + j7;
        long c10 = yp.c(j9, 1000000L, y4);
        ygVar.g(2);
        int C8 = ygVar.C();
        int[] iArr = new int[C8];
        long[] jArr = new long[C8];
        long[] jArr2 = new long[C8];
        long[] jArr3 = new long[C8];
        long j11 = c10;
        int i9 = 0;
        long j12 = j9;
        while (i9 < C8) {
            int j13 = ygVar.j();
            if ((j13 & Integer.MIN_VALUE) == 0) {
                long y6 = ygVar.y();
                iArr[i9] = j13 & Integer.MAX_VALUE;
                jArr[i9] = j10;
                jArr3[i9] = j11;
                long j14 = j12 + y6;
                long[] jArr4 = jArr2;
                long[] jArr5 = jArr3;
                int i10 = C8;
                long c11 = yp.c(j14, 1000000L, y4);
                jArr4[i9] = c11 - jArr5[i9];
                ygVar.g(4);
                j10 += r1[i9];
                i9++;
                iArr = iArr;
                jArr3 = jArr5;
                jArr2 = jArr4;
                jArr = jArr;
                C8 = i10;
                j12 = j14;
                j11 = c11;
            } else {
                throw ah.a("Unhandled indirect reference", null);
            }
        }
        return Pair.create(Long.valueOf(c10), new C0691e3(iArr, jArr, jArr2, jArr3));
    }

    private static b a(yg ygVar, SparseArray sparseArray, boolean z8) {
        int i9;
        int i10;
        int i11;
        int i12;
        ygVar.f(8);
        int b8 = AbstractC0708i1.b(ygVar.j());
        b bVar = (b) (z8 ? sparseArray.valueAt(0) : sparseArray.get(ygVar.j()));
        if (bVar == null) {
            return null;
        }
        if ((b8 & 1) != 0) {
            long B5 = ygVar.B();
            oo ooVar = bVar.b;
            ooVar.f9932c = B5;
            ooVar.f9933d = B5;
        }
        j6 j6Var = bVar.f8113e;
        if ((b8 & 2) != 0) {
            i9 = ygVar.j() - 1;
        } else {
            i9 = j6Var.f8414a;
        }
        if ((b8 & 8) != 0) {
            i10 = ygVar.j();
        } else {
            i10 = j6Var.b;
        }
        if ((b8 & 16) != 0) {
            i11 = ygVar.j();
        } else {
            i11 = j6Var.f8415c;
        }
        if ((b8 & 32) != 0) {
            i12 = ygVar.j();
        } else {
            i12 = j6Var.f8416d;
        }
        bVar.b.f9931a = new j6(i9, i10, i11, i12);
        return bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int a(com.applovin.impl.h9.b r36, int r37, int r38, com.applovin.impl.yg r39, int r40) {
        /*
            Method dump skipped, instructions count: 356
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.h9.a(com.applovin.impl.h9$b, int, int, com.applovin.impl.yg, int):int");
    }

    private static void a(AbstractC0708i1.a aVar, b bVar, int i9) {
        List list = aVar.f8201c;
        int size = list.size();
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            AbstractC0708i1.b bVar2 = (AbstractC0708i1.b) list.get(i12);
            if (bVar2.f8200a == 1953658222) {
                yg ygVar = bVar2.b;
                ygVar.f(12);
                int A8 = ygVar.A();
                if (A8 > 0) {
                    i11 += A8;
                    i10++;
                }
            }
        }
        bVar.f8116h = 0;
        bVar.f8115g = 0;
        bVar.f8114f = 0;
        bVar.b.a(i10, i11);
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < size; i15++) {
            AbstractC0708i1.b bVar3 = (AbstractC0708i1.b) list.get(i15);
            if (bVar3.f8200a == 1953658222) {
                i14 = a(bVar, i13, i9, bVar3.b, i14);
                i13++;
            }
        }
    }

    private static void a(yg ygVar, oo ooVar, byte[] bArr) {
        ygVar.f(8);
        ygVar.a(bArr, 0, 16);
        if (Arrays.equals(bArr, f8076J)) {
            a(ygVar, 16, ooVar);
        }
    }

    @Override // com.applovin.impl.i8
    public int a(j8 j8Var, qh qhVar) {
        while (true) {
            int i9 = this.f8098p;
            if (i9 != 0) {
                if (i9 == 1) {
                    c(j8Var);
                } else if (i9 != 2) {
                    if (e(j8Var)) {
                        return 0;
                    }
                } else {
                    d(j8Var);
                }
            } else if (!b(j8Var)) {
                return -1;
            }
        }
    }

    @Override // com.applovin.impl.i8
    public void a(long j7, long j9) {
        int size = this.f8088d.size();
        for (int i9 = 0; i9 < size; i9++) {
            ((b) this.f8088d.valueAt(i9)).g();
        }
        this.f8096n.clear();
        this.f8104v = 0;
        this.f8105w = j9;
        this.m.clear();
        b();
    }

    @Override // com.applovin.impl.i8
    public boolean a(j8 j8Var) {
        return ik.a(j8Var);
    }
}
