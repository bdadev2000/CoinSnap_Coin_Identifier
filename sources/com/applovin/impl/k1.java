package com.applovin.impl;

import android.util.Pair;
import com.applovin.exoplayer2.common.base.Function;
import com.applovin.impl.bf;
import com.applovin.impl.f9;
import com.applovin.impl.j1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.objectweb.asm.Opcodes;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class k1 {

    /* renamed from: a, reason: collision with root package name */
    private static final byte[] f24783a = xp.c("OpusHead");

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f24784a;

        /* renamed from: b, reason: collision with root package name */
        public int f24785b;

        /* renamed from: c, reason: collision with root package name */
        public int f24786c;
        public long d;
        private final boolean e;

        /* renamed from: f, reason: collision with root package name */
        private final bh f24787f;

        /* renamed from: g, reason: collision with root package name */
        private final bh f24788g;

        /* renamed from: h, reason: collision with root package name */
        private int f24789h;

        /* renamed from: i, reason: collision with root package name */
        private int f24790i;

        public a(bh bhVar, bh bhVar2, boolean z2) {
            this.f24788g = bhVar;
            this.f24787f = bhVar2;
            this.e = z2;
            bhVar2.f(12);
            this.f24784a = bhVar2.A();
            bhVar.f(12);
            this.f24790i = bhVar.A();
            n8.a(bhVar.j() == 1, "first_chunk must be 1");
            this.f24785b = -1;
        }

        public boolean a() {
            int i2 = this.f24785b + 1;
            this.f24785b = i2;
            if (i2 == this.f24784a) {
                return false;
            }
            this.d = this.e ? this.f24787f.B() : this.f24787f.y();
            if (this.f24785b == this.f24789h) {
                this.f24786c = this.f24788g.A();
                this.f24788g.g(4);
                int i3 = this.f24790i - 1;
                this.f24790i = i3;
                this.f24789h = i3 > 0 ? this.f24788g.A() - 1 : -1;
            }
            return true;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        int a();

        int b();

        int c();
    }

    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final mo[] f24791a;

        /* renamed from: b, reason: collision with root package name */
        public f9 f24792b;

        /* renamed from: c, reason: collision with root package name */
        public int f24793c;
        public int d = 0;

        public c(int i2) {
            this.f24791a = new mo[i2];
        }
    }

    /* loaded from: classes.dex */
    public static final class d implements b {

        /* renamed from: a, reason: collision with root package name */
        private final int f24794a;

        /* renamed from: b, reason: collision with root package name */
        private final int f24795b;

        /* renamed from: c, reason: collision with root package name */
        private final bh f24796c;

        public d(j1.b bVar, f9 f9Var) {
            bh bhVar = bVar.f24569b;
            this.f24796c = bhVar;
            bhVar.f(12);
            int A = bhVar.A();
            if ("audio/raw".equals(f9Var.f23840m)) {
                int b2 = xp.b(f9Var.B, f9Var.f23851z);
                if (A == 0 || A % b2 != 0) {
                    pc.d("AtomParsers", "Audio sample size mismatch. stsd sample size: " + b2 + ", stsz sample size: " + A);
                    A = b2;
                }
            }
            this.f24794a = A == 0 ? -1 : A;
            this.f24795b = bhVar.A();
        }

        @Override // com.applovin.impl.k1.b
        public int a() {
            return this.f24794a;
        }

        @Override // com.applovin.impl.k1.b
        public int b() {
            return this.f24795b;
        }

        @Override // com.applovin.impl.k1.b
        public int c() {
            int i2 = this.f24794a;
            return i2 == -1 ? this.f24796c.A() : i2;
        }
    }

    /* loaded from: classes.dex */
    public static final class e implements b {

        /* renamed from: a, reason: collision with root package name */
        private final bh f24797a;

        /* renamed from: b, reason: collision with root package name */
        private final int f24798b;

        /* renamed from: c, reason: collision with root package name */
        private final int f24799c;
        private int d;
        private int e;

        public e(j1.b bVar) {
            bh bhVar = bVar.f24569b;
            this.f24797a = bhVar;
            bhVar.f(12);
            this.f24799c = bhVar.A() & 255;
            this.f24798b = bhVar.A();
        }

        @Override // com.applovin.impl.k1.b
        public int a() {
            return -1;
        }

        @Override // com.applovin.impl.k1.b
        public int b() {
            return this.f24798b;
        }

        @Override // com.applovin.impl.k1.b
        public int c() {
            int i2 = this.f24799c;
            if (i2 == 8) {
                return this.f24797a.w();
            }
            if (i2 == 16) {
                return this.f24797a.C();
            }
            int i3 = this.d;
            this.d = i3 + 1;
            if (i3 % 2 != 0) {
                return this.e & 15;
            }
            int w = this.f24797a.w();
            this.e = w;
            return (w & 240) >> 4;
        }
    }

    /* loaded from: classes.dex */
    public static final class f {

        /* renamed from: a, reason: collision with root package name */
        private final int f24800a;

        /* renamed from: b, reason: collision with root package name */
        private final long f24801b;

        /* renamed from: c, reason: collision with root package name */
        private final int f24802c;

        public f(int i2, long j2, int i3) {
            this.f24800a = i2;
            this.f24801b = j2;
            this.f24802c = i3;
        }
    }

    private static int a(int i2) {
        if (i2 == 1936684398) {
            return 1;
        }
        if (i2 == 1986618469) {
            return 2;
        }
        if (i2 == 1952807028 || i2 == 1935832172 || i2 == 1937072756 || i2 == 1668047728) {
            return 3;
        }
        return i2 == 1835365473 ? 5 : -1;
    }

    public static Pair b(bh bhVar, int i2, int i3) {
        int i4 = i2 + 8;
        int i5 = -1;
        int i6 = 0;
        String str = null;
        Integer num = null;
        while (i4 - i2 < i3) {
            bhVar.f(i4);
            int j2 = bhVar.j();
            int j3 = bhVar.j();
            if (j3 == 1718775137) {
                num = Integer.valueOf(bhVar.j());
            } else if (j3 == 1935894637) {
                bhVar.g(4);
                str = bhVar.c(4);
            } else if (j3 == 1935894633) {
                i5 = i4;
                i6 = j2;
            }
            i4 += j2;
        }
        if (!"cenc".equals(str) && !"cbc1".equals(str) && !"cens".equals(str) && !"cbcs".equals(str)) {
            return null;
        }
        n8.a(num != null, "frma atom is mandatory");
        n8.a(i5 != -1, "schi atom is mandatory");
        mo a2 = a(bhVar, i5, i6, str);
        n8.a(a2 != null, "tenc atom is mandatory");
        return Pair.create(num, (mo) xp.a(a2));
    }

    private static int c(bh bhVar) {
        bhVar.f(16);
        return bhVar.j();
    }

    private static Pair d(bh bhVar) {
        bhVar.f(8);
        int c2 = j1.c(bhVar.j());
        bhVar.g(c2 == 0 ? 8 : 16);
        long y2 = bhVar.y();
        bhVar.g(c2 == 0 ? 4 : 8);
        int C = bhVar.C();
        return Pair.create(Long.valueOf(y2), "" + ((char) (((C >> 10) & 31) + 96)) + ((char) (((C >> 5) & 31) + 96)) + ((char) ((C & 31) + 96)));
    }

    private static long e(bh bhVar) {
        bhVar.f(8);
        bhVar.g(j1.c(bhVar.j()) != 0 ? 16 : 8);
        return bhVar.y();
    }

    private static f f(bh bhVar) {
        long j2;
        bhVar.f(8);
        int c2 = j1.c(bhVar.j());
        bhVar.g(c2 == 0 ? 8 : 16);
        int j3 = bhVar.j();
        bhVar.g(4);
        int d2 = bhVar.d();
        int i2 = c2 == 0 ? 4 : 8;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            j2 = -9223372036854775807L;
            if (i4 >= i2) {
                bhVar.g(i2);
                break;
            }
            if (bhVar.c()[d2 + i4] != -1) {
                long y2 = c2 == 0 ? bhVar.y() : bhVar.B();
                if (y2 != 0) {
                    j2 = y2;
                }
            } else {
                i4++;
            }
        }
        bhVar.g(16);
        int j4 = bhVar.j();
        int j5 = bhVar.j();
        bhVar.g(4);
        int j6 = bhVar.j();
        int j7 = bhVar.j();
        if (j4 == 0 && j5 == 65536 && j6 == -65536 && j7 == 0) {
            i3 = 90;
        } else if (j4 == 0 && j5 == -65536 && j6 == 65536 && j7 == 0) {
            i3 = 270;
        } else if (j4 == -65536 && j5 == 0 && j6 == 0 && j7 == -65536) {
            i3 = Opcodes.GETFIELD;
        }
        return new f(j3, j2, i3);
    }

    private static boolean a(long[] jArr, long j2, long j3, long j4) {
        int length = jArr.length - 1;
        return jArr[0] <= j3 && j3 < jArr[xp.a(4, 0, length)] && jArr[xp.a(jArr.length - 4, 0, length)] < j4 && j4 <= j2;
    }

    private static float c(bh bhVar, int i2) {
        bhVar.f(i2 + 8);
        return bhVar.A() / bhVar.A();
    }

    private static byte[] c(bh bhVar, int i2, int i3) {
        int i4 = i2 + 8;
        while (i4 - i2 < i3) {
            bhVar.f(i4);
            int j2 = bhVar.j();
            if (bhVar.j() == 1886547818) {
                return Arrays.copyOfRange(bhVar.c(), i4, j2 + i4);
            }
            i4 += j2;
        }
        return null;
    }

    private static bf e(bh bhVar, int i2) {
        bhVar.g(8);
        a(bhVar);
        while (bhVar.d() < i2) {
            int d2 = bhVar.d();
            int j2 = bhVar.j();
            if (bhVar.j() == 1768715124) {
                bhVar.f(d2);
                return b(bhVar, d2 + j2);
            }
            bhVar.f(d2 + j2);
        }
        return null;
    }

    private static int a(bh bhVar, int i2, int i3) {
        int d2 = bhVar.d();
        while (d2 - i2 < i3) {
            bhVar.f(d2);
            int j2 = bhVar.j();
            n8.a(j2 > 0, "childAtomSize must be positive");
            if (bhVar.j() == 1702061171) {
                return d2;
            }
            d2 += j2;
        }
        return -1;
    }

    private static Pair d(bh bhVar, int i2, int i3) {
        Pair b2;
        int d2 = bhVar.d();
        while (d2 - i2 < i3) {
            bhVar.f(d2);
            int j2 = bhVar.j();
            n8.a(j2 > 0, "childAtomSize must be positive");
            if (bhVar.j() == 1936289382 && (b2 = b(bhVar, d2, j2)) != null) {
                return b2;
            }
            d2 += j2;
        }
        return null;
    }

    public static void a(bh bhVar) {
        int d2 = bhVar.d();
        bhVar.g(4);
        if (bhVar.j() != 1751411826) {
            d2 += 4;
        }
        bhVar.f(d2);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0151  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(com.applovin.impl.bh r20, int r21, int r22, int r23, int r24, java.lang.String r25, boolean r26, com.applovin.impl.y6 r27, com.applovin.impl.k1.c r28, int r29) {
        /*
            Method dump skipped, instructions count: 762
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.k1.a(com.applovin.impl.bh, int, int, int, int, java.lang.String, boolean, com.applovin.impl.y6, com.applovin.impl.k1$c, int):void");
    }

    private static int b(bh bhVar) {
        int w = bhVar.w();
        int i2 = w & 127;
        while ((w & 128) == 128) {
            w = bhVar.w();
            i2 = (i2 << 7) | (w & 127);
        }
        return i2;
    }

    private static bf d(bh bhVar, int i2) {
        bhVar.g(12);
        while (bhVar.d() < i2) {
            int d2 = bhVar.d();
            int j2 = bhVar.j();
            if (bhVar.j() == 1935766900) {
                if (j2 < 14) {
                    return null;
                }
                bhVar.g(5);
                int w = bhVar.w();
                if (w != 12 && w != 13) {
                    return null;
                }
                float f2 = w == 12 ? 240.0f : 120.0f;
                bhVar.g(1);
                return new bf(new kk(f2, bhVar.w()));
            }
            bhVar.f(d2 + j2);
        }
        return null;
    }

    private static bf b(bh bhVar, int i2) {
        bhVar.g(8);
        ArrayList arrayList = new ArrayList();
        while (bhVar.d() < i2) {
            bf.b b2 = hf.b(bhVar);
            if (b2 != null) {
                arrayList.add(b2);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new bf(arrayList);
    }

    public static bf b(j1.a aVar) {
        j1.b e2 = aVar.e(1751411826);
        j1.b e3 = aVar.e(1801812339);
        j1.b e4 = aVar.e(1768715124);
        if (e2 == null || e3 == null || e4 == null || c(e2.f24569b) != 1835299937) {
            return null;
        }
        bh bhVar = e3.f24569b;
        bhVar.f(12);
        int j2 = bhVar.j();
        String[] strArr = new String[j2];
        for (int i2 = 0; i2 < j2; i2++) {
            int j3 = bhVar.j();
            bhVar.g(4);
            strArr[i2] = bhVar.c(j3 - 8);
        }
        bh bhVar2 = e4.f24569b;
        bhVar2.f(8);
        ArrayList arrayList = new ArrayList();
        while (bhVar2.a() > 8) {
            int d2 = bhVar2.d();
            int j4 = bhVar2.j();
            int j5 = bhVar2.j() - 1;
            if (j5 >= 0 && j5 < j2) {
                fd a2 = hf.a(bhVar2, d2 + j4, strArr[j5]);
                if (a2 != null) {
                    arrayList.add(a2);
                }
            } else {
                com.applovin.impl.adview.t.u("Skipped metadata with unknown key index: ", j5, "AtomParsers");
            }
            bhVar2.f(d2 + j4);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new bf(arrayList);
    }

    private static Pair a(j1.a aVar) {
        j1.b e2 = aVar.e(1701606260);
        if (e2 == null) {
            return null;
        }
        bh bhVar = e2.f24569b;
        bhVar.f(8);
        int c2 = j1.c(bhVar.j());
        int A = bhVar.A();
        long[] jArr = new long[A];
        long[] jArr2 = new long[A];
        for (int i2 = 0; i2 < A; i2++) {
            jArr[i2] = c2 == 1 ? bhVar.B() : bhVar.y();
            jArr2[i2] = c2 == 1 ? bhVar.s() : bhVar.j();
            if (bhVar.u() == 1) {
                bhVar.g(2);
            } else {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
        }
        return Pair.create(jArr, jArr2);
    }

    private static Pair a(bh bhVar, int i2) {
        bhVar.f(i2 + 12);
        bhVar.g(1);
        b(bhVar);
        bhVar.g(2);
        int w = bhVar.w();
        if ((w & 128) != 0) {
            bhVar.g(2);
        }
        if ((w & 64) != 0) {
            bhVar.g(bhVar.C());
        }
        if ((w & 32) != 0) {
            bhVar.g(2);
        }
        bhVar.g(1);
        b(bhVar);
        String a2 = Cif.a(bhVar.w());
        if (!"audio/mpeg".equals(a2) && !"audio/vnd.dts".equals(a2) && !"audio/vnd.dts.hd".equals(a2)) {
            bhVar.g(12);
            bhVar.g(1);
            int b2 = b(bhVar);
            byte[] bArr = new byte[b2];
            bhVar.a(bArr, 0, b2);
            return Pair.create(a2, bArr);
        }
        return Pair.create(a2, null);
    }

    private static void a(bh bhVar, int i2, int i3, int i4, c cVar) {
        bhVar.f(i3 + 16);
        if (i2 == 1835365492) {
            bhVar.t();
            String t2 = bhVar.t();
            if (t2 != null) {
                cVar.f24792b = new f9.b().h(i4).f(t2).a();
            }
        }
    }

    private static mo a(bh bhVar, int i2, int i3, String str) {
        int i4;
        int i5;
        int i6 = i2 + 8;
        while (true) {
            byte[] bArr = null;
            if (i6 - i2 >= i3) {
                return null;
            }
            bhVar.f(i6);
            int j2 = bhVar.j();
            if (bhVar.j() == 1952804451) {
                int c2 = j1.c(bhVar.j());
                bhVar.g(1);
                if (c2 == 0) {
                    bhVar.g(1);
                    i5 = 0;
                    i4 = 0;
                } else {
                    int w = bhVar.w();
                    i4 = w & 15;
                    i5 = (w & 240) >> 4;
                }
                boolean z2 = bhVar.w() == 1;
                int w2 = bhVar.w();
                byte[] bArr2 = new byte[16];
                bhVar.a(bArr2, 0, 16);
                if (z2 && w2 == 0) {
                    int w3 = bhVar.w();
                    bArr = new byte[w3];
                    bhVar.a(bArr, 0, w3);
                }
                return new mo(z2, str, w2, bArr2, i5, i4, bArr);
            }
            i6 += j2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x043d  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0461  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0440  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x042c A[EDGE_INSN: B:97:0x042c->B:98:0x042c BREAK  A[LOOP:2: B:76:0x03c5->B:92:0x0423], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.applovin.impl.ro a(com.applovin.impl.lo r38, com.applovin.impl.j1.a r39, com.applovin.impl.z9 r40) {
        /*
            Method dump skipped, instructions count: 1304
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.k1.a(com.applovin.impl.lo, com.applovin.impl.j1$a, com.applovin.impl.z9):com.applovin.impl.ro");
    }

    private static c a(bh bhVar, int i2, int i3, String str, y6 y6Var, boolean z2) {
        int i4;
        bhVar.f(12);
        int j2 = bhVar.j();
        c cVar = new c(j2);
        for (int i5 = 0; i5 < j2; i5++) {
            int d2 = bhVar.d();
            int j3 = bhVar.j();
            n8.a(j3 > 0, "childAtomSize must be positive");
            int j4 = bhVar.j();
            if (j4 == 1635148593 || j4 == 1635148595 || j4 == 1701733238 || j4 == 1831958048 || j4 == 1836070006 || j4 == 1752589105 || j4 == 1751479857 || j4 == 1932670515 || j4 == 1211250227 || j4 == 1987063864 || j4 == 1987063865 || j4 == 1635135537 || j4 == 1685479798 || j4 == 1685479729 || j4 == 1685481573 || j4 == 1685481521) {
                i4 = d2;
                a(bhVar, j4, i4, j3, i2, i3, y6Var, cVar, i5);
            } else if (j4 == 1836069985 || j4 == 1701733217 || j4 == 1633889587 || j4 == 1700998451 || j4 == 1633889588 || j4 == 1685353315 || j4 == 1685353317 || j4 == 1685353320 || j4 == 1685353324 || j4 == 1685353336 || j4 == 1935764850 || j4 == 1935767394 || j4 == 1819304813 || j4 == 1936684916 || j4 == 1953984371 || j4 == 778924082 || j4 == 778924083 || j4 == 1835557169 || j4 == 1835560241 || j4 == 1634492771 || j4 == 1634492791 || j4 == 1970037111 || j4 == 1332770163 || j4 == 1716281667) {
                i4 = d2;
                a(bhVar, j4, d2, j3, i2, str, z2, y6Var, cVar, i5);
            } else {
                if (j4 == 1414810956 || j4 == 1954034535 || j4 == 2004251764 || j4 == 1937010800 || j4 == 1664495672) {
                    a(bhVar, j4, d2, j3, i2, str, cVar);
                } else if (j4 == 1835365492) {
                    a(bhVar, j4, d2, i2, cVar);
                } else if (j4 == 1667329389) {
                    cVar.f24792b = new f9.b().h(i2).f("application/x-camera-motion").a();
                }
                i4 = d2;
            }
            bhVar.f(i4 + j3);
        }
        return cVar;
    }

    private static void a(bh bhVar, int i2, int i3, int i4, int i5, String str, c cVar) {
        bhVar.f(i3 + 16);
        String str2 = "application/ttml+xml";
        eb ebVar = null;
        long j2 = Long.MAX_VALUE;
        if (i2 != 1414810956) {
            if (i2 == 1954034535) {
                int i6 = i4 - 16;
                byte[] bArr = new byte[i6];
                bhVar.a(bArr, 0, i6);
                ebVar = eb.a(bArr);
                str2 = "application/x-quicktime-tx3g";
            } else if (i2 == 2004251764) {
                str2 = "application/x-mp4-vtt";
            } else if (i2 == 1937010800) {
                j2 = 0;
            } else if (i2 == 1664495672) {
                cVar.d = 1;
                str2 = "application/x-mp4-cea-608";
            } else {
                throw new IllegalStateException();
            }
        }
        cVar.f24792b = new f9.b().h(i5).f(str2).e(str).a(j2).a(ebVar).a();
    }

    private static lo a(j1.a aVar, j1.b bVar, long j2, y6 y6Var, boolean z2, boolean z3) {
        j1.b bVar2;
        long j3;
        long[] jArr;
        long[] jArr2;
        j1.a d2;
        Pair a2;
        j1.a aVar2 = (j1.a) b1.a(aVar.d(1835297121));
        int a3 = a(c(((j1.b) b1.a(aVar2.e(1751411826))).f24569b));
        if (a3 == -1) {
            return null;
        }
        f f2 = f(((j1.b) b1.a(aVar.e(1953196132))).f24569b);
        if (j2 == -9223372036854775807L) {
            bVar2 = bVar;
            j3 = f2.f24801b;
        } else {
            bVar2 = bVar;
            j3 = j2;
        }
        long e2 = e(bVar2.f24569b);
        long c2 = j3 != -9223372036854775807L ? xp.c(j3, 1000000L, e2) : -9223372036854775807L;
        j1.a aVar3 = (j1.a) b1.a(((j1.a) b1.a(aVar2.d(1835626086))).d(1937007212));
        Pair d3 = d(((j1.b) b1.a(aVar2.e(1835296868))).f24569b);
        c a4 = a(((j1.b) b1.a(aVar3.e(1937011556))).f24569b, f2.f24800a, f2.f24802c, (String) d3.second, y6Var, z3);
        if (z2 || (d2 = aVar.d(1701082227)) == null || (a2 = a(d2)) == null) {
            jArr = null;
            jArr2 = null;
        } else {
            long[] jArr3 = (long[]) a2.first;
            jArr2 = (long[]) a2.second;
            jArr = jArr3;
        }
        if (a4.f24792b == null) {
            return null;
        }
        return new lo(f2.f24800a, a3, ((Long) d3.first).longValue(), e2, c2, a4.f24792b, a4.d, a4.f24791a, a4.f24793c, jArr, jArr2);
    }

    public static Pair a(j1.b bVar) {
        bh bhVar = bVar.f24569b;
        bhVar.f(8);
        bf bfVar = null;
        bf bfVar2 = null;
        while (bhVar.a() >= 8) {
            int d2 = bhVar.d();
            int j2 = bhVar.j();
            int j3 = bhVar.j();
            if (j3 == 1835365473) {
                bhVar.f(d2);
                bfVar = e(bhVar, d2 + j2);
            } else if (j3 == 1936553057) {
                bhVar.f(d2);
                bfVar2 = d(bhVar, d2 + j2);
            }
            bhVar.f(d2 + j2);
        }
        return Pair.create(bfVar, bfVar2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0190, code lost:
    
        if (r1 != 3) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(com.applovin.impl.bh r20, int r21, int r22, int r23, int r24, int r25, com.applovin.impl.y6 r26, com.applovin.impl.k1.c r27, int r28) {
        /*
            Method dump skipped, instructions count: 610
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.k1.a(com.applovin.impl.bh, int, int, int, int, int, com.applovin.impl.y6, com.applovin.impl.k1$c, int):void");
    }

    public static List a(j1.a aVar, z9 z9Var, long j2, y6 y6Var, boolean z2, boolean z3, Function function) {
        lo loVar;
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < aVar.d.size(); i2++) {
            j1.a aVar2 = (j1.a) aVar.d.get(i2);
            if (aVar2.f24566a == 1953653099 && (loVar = (lo) function.apply(a(aVar2, (j1.b) b1.a(aVar.e(1836476516)), j2, y6Var, z2, z3))) != null) {
                arrayList.add(a(loVar, (j1.a) b1.a(((j1.a) b1.a(((j1.a) b1.a(aVar2.d(1835297121))).d(1835626086))).d(1937007212)), z9Var));
            }
        }
        return arrayList;
    }
}
