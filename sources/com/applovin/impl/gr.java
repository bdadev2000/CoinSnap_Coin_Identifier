package com.applovin.impl;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class gr {

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f7990a;
        public final int b;

        /* renamed from: c, reason: collision with root package name */
        public final long[] f7991c;

        /* renamed from: d, reason: collision with root package name */
        public final int f7992d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f7993e;

        public a(int i9, int i10, long[] jArr, int i11, boolean z8) {
            this.f7990a = i9;
            this.b = i10;
            this.f7991c = jArr;
            this.f7992d = i11;
            this.f7993e = z8;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final String f7994a;
        public final String[] b;

        /* renamed from: c, reason: collision with root package name */
        public final int f7995c;

        public b(String str, String[] strArr, int i9) {
            this.f7994a = str;
            this.b = strArr;
            this.f7995c = i9;
        }
    }

    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f7996a;
        public final int b;

        /* renamed from: c, reason: collision with root package name */
        public final int f7997c;

        /* renamed from: d, reason: collision with root package name */
        public final int f7998d;

        public c(boolean z8, int i9, int i10, int i11) {
            this.f7996a = z8;
            this.b = i9;
            this.f7997c = i10;
            this.f7998d = i11;
        }
    }

    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final int f7999a;
        public final int b;

        /* renamed from: c, reason: collision with root package name */
        public final int f8000c;

        /* renamed from: d, reason: collision with root package name */
        public final int f8001d;

        /* renamed from: e, reason: collision with root package name */
        public final int f8002e;

        /* renamed from: f, reason: collision with root package name */
        public final int f8003f;

        /* renamed from: g, reason: collision with root package name */
        public final int f8004g;

        /* renamed from: h, reason: collision with root package name */
        public final int f8005h;

        /* renamed from: i, reason: collision with root package name */
        public final boolean f8006i;

        /* renamed from: j, reason: collision with root package name */
        public final byte[] f8007j;

        public d(int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, boolean z8, byte[] bArr) {
            this.f7999a = i9;
            this.b = i10;
            this.f8000c = i11;
            this.f8001d = i12;
            this.f8002e = i13;
            this.f8003f = i14;
            this.f8004g = i15;
            this.f8005h = i16;
            this.f8006i = z8;
            this.f8007j = bArr;
        }
    }

    public static int a(int i9) {
        int i10 = 0;
        while (i9 > 0) {
            i10++;
            i9 >>>= 1;
        }
        return i10;
    }

    private static void b(dr drVar) {
        int a6 = drVar.a(6) + 1;
        for (int i9 = 0; i9 < a6; i9++) {
            int a9 = drVar.a(16);
            if (a9 == 0) {
                drVar.b(8);
                drVar.b(16);
                drVar.b(16);
                drVar.b(6);
                drVar.b(8);
                int a10 = drVar.a(4) + 1;
                for (int i10 = 0; i10 < a10; i10++) {
                    drVar.b(8);
                }
            } else {
                if (a9 != 1) {
                    throw ah.a("floor type greater than 1 not decodable: " + a9, null);
                }
                int a11 = drVar.a(5);
                int[] iArr = new int[a11];
                int i11 = -1;
                for (int i12 = 0; i12 < a11; i12++) {
                    int a12 = drVar.a(4);
                    iArr[i12] = a12;
                    if (a12 > i11) {
                        i11 = a12;
                    }
                }
                int i13 = i11 + 1;
                int[] iArr2 = new int[i13];
                for (int i14 = 0; i14 < i13; i14++) {
                    iArr2[i14] = drVar.a(3) + 1;
                    int a13 = drVar.a(2);
                    if (a13 > 0) {
                        drVar.b(8);
                    }
                    for (int i15 = 0; i15 < (1 << a13); i15++) {
                        drVar.b(8);
                    }
                }
                drVar.b(2);
                int a14 = drVar.a(4);
                int i16 = 0;
                int i17 = 0;
                for (int i18 = 0; i18 < a11; i18++) {
                    i16 += iArr2[iArr[i18]];
                    while (i17 < i16) {
                        drVar.b(a14);
                        i17++;
                    }
                }
            }
        }
    }

    private static c[] c(dr drVar) {
        int a6 = drVar.a(6) + 1;
        c[] cVarArr = new c[a6];
        for (int i9 = 0; i9 < a6; i9++) {
            cVarArr[i9] = new c(drVar.c(), drVar.a(16), drVar.a(16), drVar.a(8));
        }
        return cVarArr;
    }

    private static void d(dr drVar) {
        int i9;
        int a6 = drVar.a(6) + 1;
        for (int i10 = 0; i10 < a6; i10++) {
            if (drVar.a(16) <= 2) {
                drVar.b(24);
                drVar.b(24);
                drVar.b(24);
                int a9 = drVar.a(6) + 1;
                drVar.b(8);
                int[] iArr = new int[a9];
                for (int i11 = 0; i11 < a9; i11++) {
                    int a10 = drVar.a(3);
                    if (drVar.c()) {
                        i9 = drVar.a(5);
                    } else {
                        i9 = 0;
                    }
                    iArr[i11] = (i9 * 8) + a10;
                }
                for (int i12 = 0; i12 < a9; i12++) {
                    for (int i13 = 0; i13 < 8; i13++) {
                        if ((iArr[i12] & (1 << i13)) != 0) {
                            drVar.b(8);
                        }
                    }
                }
            } else {
                throw ah.a("residueType greater than 2 is not decodable", null);
            }
        }
    }

    private static long a(long j7, long j9) {
        return (long) Math.floor(Math.pow(j7, 1.0d / j9));
    }

    private static a a(dr drVar) {
        if (drVar.a(24) == 5653314) {
            int a6 = drVar.a(16);
            int a9 = drVar.a(24);
            long[] jArr = new long[a9];
            boolean c9 = drVar.c();
            long j7 = 0;
            if (!c9) {
                boolean c10 = drVar.c();
                for (int i9 = 0; i9 < a9; i9++) {
                    if (c10) {
                        if (drVar.c()) {
                            jArr[i9] = drVar.a(5) + 1;
                        } else {
                            jArr[i9] = 0;
                        }
                    } else {
                        jArr[i9] = drVar.a(5) + 1;
                    }
                }
            } else {
                int a10 = drVar.a(5) + 1;
                int i10 = 0;
                while (i10 < a9) {
                    int a11 = drVar.a(a(a9 - i10));
                    for (int i11 = 0; i11 < a11 && i10 < a9; i11++) {
                        jArr[i10] = a10;
                        i10++;
                    }
                    a10++;
                }
            }
            int a12 = drVar.a(4);
            if (a12 <= 2) {
                if (a12 == 1 || a12 == 2) {
                    drVar.b(32);
                    drVar.b(32);
                    int a13 = drVar.a(4) + 1;
                    drVar.b(1);
                    if (a12 != 1) {
                        j7 = a9 * a6;
                    } else if (a6 != 0) {
                        j7 = a(a9, a6);
                    }
                    drVar.b((int) (j7 * a13));
                }
                return new a(a6, a9, jArr, a12, c9);
            }
            throw ah.a("lookup type greater than 2 not decodable: " + a12, null);
        }
        throw ah.a("expected code book to start with [0x56, 0x43, 0x42] at " + drVar.b(), null);
    }

    public static d b(yg ygVar) {
        a(1, ygVar, false);
        int q9 = ygVar.q();
        int w2 = ygVar.w();
        int q10 = ygVar.q();
        int m = ygVar.m();
        if (m <= 0) {
            m = -1;
        }
        int m2 = ygVar.m();
        if (m2 <= 0) {
            m2 = -1;
        }
        int m6 = ygVar.m();
        if (m6 <= 0) {
            m6 = -1;
        }
        int w9 = ygVar.w();
        return new d(q9, w2, q10, m, m2, m6, (int) Math.pow(2.0d, w9 & 15), (int) Math.pow(2.0d, (w9 & PsExtractor.VIDEO_STREAM_MASK) >> 4), (ygVar.w() & 1) > 0, Arrays.copyOf(ygVar.c(), ygVar.e()));
    }

    private static void a(int i9, dr drVar) {
        int a6 = drVar.a(6) + 1;
        for (int i10 = 0; i10 < a6; i10++) {
            int a9 = drVar.a(16);
            if (a9 != 0) {
                kc.b("VorbisUtil", "mapping type other than 0 not supported: " + a9);
            } else {
                int a10 = drVar.c() ? drVar.a(4) + 1 : 1;
                if (drVar.c()) {
                    int a11 = drVar.a(8) + 1;
                    for (int i11 = 0; i11 < a11; i11++) {
                        int i12 = i9 - 1;
                        drVar.b(a(i12));
                        drVar.b(a(i12));
                    }
                }
                if (drVar.a(2) != 0) {
                    throw ah.a("to reserved bits must be zero after mapping coupling steps", null);
                }
                if (a10 > 1) {
                    for (int i13 = 0; i13 < i9; i13++) {
                        drVar.b(4);
                    }
                }
                for (int i14 = 0; i14 < a10; i14++) {
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

    public static b a(yg ygVar, boolean z8, boolean z9) {
        if (z8) {
            a(3, ygVar, false);
        }
        String c9 = ygVar.c((int) ygVar.p());
        int length = c9.length();
        long p2 = ygVar.p();
        String[] strArr = new String[(int) p2];
        int i9 = length + 15;
        for (int i10 = 0; i10 < p2; i10++) {
            String c10 = ygVar.c((int) ygVar.p());
            strArr[i10] = c10;
            i9 = i9 + 4 + c10.length();
        }
        if (z9 && (ygVar.w() & 1) == 0) {
            throw ah.a("framing bit expected to be set", null);
        }
        return new b(c9, strArr, i9 + 1);
    }

    public static c[] a(yg ygVar, int i9) {
        a(5, ygVar, false);
        int w2 = ygVar.w() + 1;
        dr drVar = new dr(ygVar.c());
        drVar.b(ygVar.d() * 8);
        for (int i10 = 0; i10 < w2; i10++) {
            a(drVar);
        }
        int a6 = drVar.a(6) + 1;
        for (int i11 = 0; i11 < a6; i11++) {
            if (drVar.a(16) != 0) {
                throw ah.a("placeholder of time domain transforms not zeroed out", null);
            }
        }
        b(drVar);
        d(drVar);
        a(i9, drVar);
        c[] c9 = c(drVar);
        if (drVar.c()) {
            return c9;
        }
        throw ah.a("framing bit after modes not set as expected", null);
    }

    public static boolean a(int i9, yg ygVar, boolean z8) {
        if (ygVar.a() < 7) {
            if (z8) {
                return false;
            }
            throw ah.a("too short header: " + ygVar.a(), null);
        }
        if (ygVar.w() != i9) {
            if (z8) {
                return false;
            }
            throw ah.a("expected header type " + Integer.toHexString(i9), null);
        }
        if (ygVar.w() == 118 && ygVar.w() == 111 && ygVar.w() == 114 && ygVar.w() == 98 && ygVar.w() == 105 && ygVar.w() == 115) {
            return true;
        }
        if (z8) {
            return false;
        }
        throw ah.a("expected characters 'vorbis'", null);
    }
}
