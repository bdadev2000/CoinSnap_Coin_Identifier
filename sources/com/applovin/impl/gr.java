package com.applovin.impl;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class gr {

    /* loaded from: classes.dex */
    public static final class a {
        public final int a;

        /* renamed from: b, reason: collision with root package name */
        public final int f5016b;

        /* renamed from: c, reason: collision with root package name */
        public final long[] f5017c;

        /* renamed from: d, reason: collision with root package name */
        public final int f5018d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f5019e;

        public a(int i10, int i11, long[] jArr, int i12, boolean z10) {
            this.a = i10;
            this.f5016b = i11;
            this.f5017c = jArr;
            this.f5018d = i12;
            this.f5019e = z10;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        public final String a;

        /* renamed from: b, reason: collision with root package name */
        public final String[] f5020b;

        /* renamed from: c, reason: collision with root package name */
        public final int f5021c;

        public b(String str, String[] strArr, int i10) {
            this.a = str;
            this.f5020b = strArr;
            this.f5021c = i10;
        }
    }

    /* loaded from: classes.dex */
    public static final class c {
        public final boolean a;

        /* renamed from: b, reason: collision with root package name */
        public final int f5022b;

        /* renamed from: c, reason: collision with root package name */
        public final int f5023c;

        /* renamed from: d, reason: collision with root package name */
        public final int f5024d;

        public c(boolean z10, int i10, int i11, int i12) {
            this.a = z10;
            this.f5022b = i10;
            this.f5023c = i11;
            this.f5024d = i12;
        }
    }

    /* loaded from: classes.dex */
    public static final class d {
        public final int a;

        /* renamed from: b, reason: collision with root package name */
        public final int f5025b;

        /* renamed from: c, reason: collision with root package name */
        public final int f5026c;

        /* renamed from: d, reason: collision with root package name */
        public final int f5027d;

        /* renamed from: e, reason: collision with root package name */
        public final int f5028e;

        /* renamed from: f, reason: collision with root package name */
        public final int f5029f;

        /* renamed from: g, reason: collision with root package name */
        public final int f5030g;

        /* renamed from: h, reason: collision with root package name */
        public final int f5031h;

        /* renamed from: i, reason: collision with root package name */
        public final boolean f5032i;

        /* renamed from: j, reason: collision with root package name */
        public final byte[] f5033j;

        public d(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, boolean z10, byte[] bArr) {
            this.a = i10;
            this.f5025b = i11;
            this.f5026c = i12;
            this.f5027d = i13;
            this.f5028e = i14;
            this.f5029f = i15;
            this.f5030g = i16;
            this.f5031h = i17;
            this.f5032i = z10;
            this.f5033j = bArr;
        }
    }

    public static int a(int i10) {
        int i11 = 0;
        while (i10 > 0) {
            i11++;
            i10 >>>= 1;
        }
        return i11;
    }

    private static void b(dr drVar) {
        int a10 = drVar.a(6) + 1;
        for (int i10 = 0; i10 < a10; i10++) {
            int a11 = drVar.a(16);
            if (a11 == 0) {
                drVar.b(8);
                drVar.b(16);
                drVar.b(16);
                drVar.b(6);
                drVar.b(8);
                int a12 = drVar.a(4) + 1;
                for (int i11 = 0; i11 < a12; i11++) {
                    drVar.b(8);
                }
            } else {
                if (a11 != 1) {
                    throw ah.a("floor type greater than 1 not decodable: " + a11, null);
                }
                int a13 = drVar.a(5);
                int[] iArr = new int[a13];
                int i12 = -1;
                for (int i13 = 0; i13 < a13; i13++) {
                    int a14 = drVar.a(4);
                    iArr[i13] = a14;
                    if (a14 > i12) {
                        i12 = a14;
                    }
                }
                int i14 = i12 + 1;
                int[] iArr2 = new int[i14];
                for (int i15 = 0; i15 < i14; i15++) {
                    iArr2[i15] = drVar.a(3) + 1;
                    int a15 = drVar.a(2);
                    if (a15 > 0) {
                        drVar.b(8);
                    }
                    for (int i16 = 0; i16 < (1 << a15); i16++) {
                        drVar.b(8);
                    }
                }
                drVar.b(2);
                int a16 = drVar.a(4);
                int i17 = 0;
                int i18 = 0;
                for (int i19 = 0; i19 < a13; i19++) {
                    i17 += iArr2[iArr[i19]];
                    while (i18 < i17) {
                        drVar.b(a16);
                        i18++;
                    }
                }
            }
        }
    }

    private static c[] c(dr drVar) {
        int a10 = drVar.a(6) + 1;
        c[] cVarArr = new c[a10];
        for (int i10 = 0; i10 < a10; i10++) {
            cVarArr[i10] = new c(drVar.c(), drVar.a(16), drVar.a(16), drVar.a(8));
        }
        return cVarArr;
    }

    private static void d(dr drVar) {
        int i10;
        int a10 = drVar.a(6) + 1;
        for (int i11 = 0; i11 < a10; i11++) {
            if (drVar.a(16) <= 2) {
                drVar.b(24);
                drVar.b(24);
                drVar.b(24);
                int a11 = drVar.a(6) + 1;
                drVar.b(8);
                int[] iArr = new int[a11];
                for (int i12 = 0; i12 < a11; i12++) {
                    int a12 = drVar.a(3);
                    if (drVar.c()) {
                        i10 = drVar.a(5);
                    } else {
                        i10 = 0;
                    }
                    iArr[i12] = (i10 * 8) + a12;
                }
                for (int i13 = 0; i13 < a11; i13++) {
                    for (int i14 = 0; i14 < 8; i14++) {
                        if ((iArr[i13] & (1 << i14)) != 0) {
                            drVar.b(8);
                        }
                    }
                }
            } else {
                throw ah.a("residueType greater than 2 is not decodable", null);
            }
        }
    }

    private static long a(long j3, long j10) {
        return (long) Math.floor(Math.pow(j3, 1.0d / j10));
    }

    private static a a(dr drVar) {
        if (drVar.a(24) == 5653314) {
            int a10 = drVar.a(16);
            int a11 = drVar.a(24);
            long[] jArr = new long[a11];
            boolean c10 = drVar.c();
            long j3 = 0;
            if (!c10) {
                boolean c11 = drVar.c();
                for (int i10 = 0; i10 < a11; i10++) {
                    if (c11) {
                        if (drVar.c()) {
                            jArr[i10] = drVar.a(5) + 1;
                        } else {
                            jArr[i10] = 0;
                        }
                    } else {
                        jArr[i10] = drVar.a(5) + 1;
                    }
                }
            } else {
                int a12 = drVar.a(5) + 1;
                int i11 = 0;
                while (i11 < a11) {
                    int a13 = drVar.a(a(a11 - i11));
                    for (int i12 = 0; i12 < a13 && i11 < a11; i12++) {
                        jArr[i11] = a12;
                        i11++;
                    }
                    a12++;
                }
            }
            int a14 = drVar.a(4);
            if (a14 <= 2) {
                if (a14 == 1 || a14 == 2) {
                    drVar.b(32);
                    drVar.b(32);
                    int a15 = drVar.a(4) + 1;
                    drVar.b(1);
                    if (a14 != 1) {
                        j3 = a11 * a10;
                    } else if (a10 != 0) {
                        j3 = a(a11, a10);
                    }
                    drVar.b((int) (j3 * a15));
                }
                return new a(a10, a11, jArr, a14, c10);
            }
            throw ah.a("lookup type greater than 2 not decodable: " + a14, null);
        }
        throw ah.a("expected code book to start with [0x56, 0x43, 0x42] at " + drVar.b(), null);
    }

    public static d b(yg ygVar) {
        a(1, ygVar, false);
        int q10 = ygVar.q();
        int w10 = ygVar.w();
        int q11 = ygVar.q();
        int m10 = ygVar.m();
        if (m10 <= 0) {
            m10 = -1;
        }
        int m11 = ygVar.m();
        if (m11 <= 0) {
            m11 = -1;
        }
        int m12 = ygVar.m();
        if (m12 <= 0) {
            m12 = -1;
        }
        int w11 = ygVar.w();
        return new d(q10, w10, q11, m10, m11, m12, (int) Math.pow(2.0d, w11 & 15), (int) Math.pow(2.0d, (w11 & PsExtractor.VIDEO_STREAM_MASK) >> 4), (ygVar.w() & 1) > 0, Arrays.copyOf(ygVar.c(), ygVar.e()));
    }

    private static void a(int i10, dr drVar) {
        int a10 = drVar.a(6) + 1;
        for (int i11 = 0; i11 < a10; i11++) {
            int a11 = drVar.a(16);
            if (a11 != 0) {
                kc.b("VorbisUtil", "mapping type other than 0 not supported: " + a11);
            } else {
                int a12 = drVar.c() ? drVar.a(4) + 1 : 1;
                if (drVar.c()) {
                    int a13 = drVar.a(8) + 1;
                    for (int i12 = 0; i12 < a13; i12++) {
                        int i13 = i10 - 1;
                        drVar.b(a(i13));
                        drVar.b(a(i13));
                    }
                }
                if (drVar.a(2) != 0) {
                    throw ah.a("to reserved bits must be zero after mapping coupling steps", null);
                }
                if (a12 > 1) {
                    for (int i14 = 0; i14 < i10; i14++) {
                        drVar.b(4);
                    }
                }
                for (int i15 = 0; i15 < a12; i15++) {
                    drVar.b(8);
                    drVar.b(8);
                    drVar.b(8);
                }
            }
        }
    }

    public static b a(yg ygVar) {
        return a(ygVar, true, true);
    }

    public static b a(yg ygVar, boolean z10, boolean z11) {
        if (z10) {
            a(3, ygVar, false);
        }
        String c10 = ygVar.c((int) ygVar.p());
        int length = c10.length();
        long p10 = ygVar.p();
        String[] strArr = new String[(int) p10];
        int i10 = length + 15;
        for (int i11 = 0; i11 < p10; i11++) {
            String c11 = ygVar.c((int) ygVar.p());
            strArr[i11] = c11;
            i10 = i10 + 4 + c11.length();
        }
        if (z11 && (ygVar.w() & 1) == 0) {
            throw ah.a("framing bit expected to be set", null);
        }
        return new b(c10, strArr, i10 + 1);
    }

    public static c[] a(yg ygVar, int i10) {
        a(5, ygVar, false);
        int w10 = ygVar.w() + 1;
        dr drVar = new dr(ygVar.c());
        drVar.b(ygVar.d() * 8);
        for (int i11 = 0; i11 < w10; i11++) {
            a(drVar);
        }
        int a10 = drVar.a(6) + 1;
        for (int i12 = 0; i12 < a10; i12++) {
            if (drVar.a(16) != 0) {
                throw ah.a("placeholder of time domain transforms not zeroed out", null);
            }
        }
        b(drVar);
        d(drVar);
        a(i10, drVar);
        c[] c10 = c(drVar);
        if (drVar.c()) {
            return c10;
        }
        throw ah.a("framing bit after modes not set as expected", null);
    }

    public static boolean a(int i10, yg ygVar, boolean z10) {
        if (ygVar.a() < 7) {
            if (z10) {
                return false;
            }
            throw ah.a("too short header: " + ygVar.a(), null);
        }
        if (ygVar.w() != i10) {
            if (z10) {
                return false;
            }
            throw ah.a("expected header type " + Integer.toHexString(i10), null);
        }
        if (ygVar.w() == 118 && ygVar.w() == 111 && ygVar.w() == 114 && ygVar.w() == 98 && ygVar.w() == 105 && ygVar.w() == 115) {
            return true;
        }
        if (z10) {
            return false;
        }
        throw ah.a("expected characters 'vorbis'", null);
    }
}
