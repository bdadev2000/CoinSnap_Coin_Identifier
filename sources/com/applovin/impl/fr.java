package com.applovin.impl;

import java.util.Arrays;

/* loaded from: classes3.dex */
public abstract class fr {

    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f24009a;

        /* renamed from: b, reason: collision with root package name */
        public final int f24010b;

        /* renamed from: c, reason: collision with root package name */
        public final long[] f24011c;
        public final int d;
        public final boolean e;

        public a(int i2, int i3, long[] jArr, int i4, boolean z2) {
            this.f24009a = i2;
            this.f24010b = i3;
            this.f24011c = jArr;
            this.d = i4;
            this.e = z2;
        }
    }

    /* loaded from: classes3.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final String f24012a;

        /* renamed from: b, reason: collision with root package name */
        public final String[] f24013b;

        /* renamed from: c, reason: collision with root package name */
        public final int f24014c;

        public b(String str, String[] strArr, int i2) {
            this.f24012a = str;
            this.f24013b = strArr;
            this.f24014c = i2;
        }
    }

    /* loaded from: classes3.dex */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f24015a;

        /* renamed from: b, reason: collision with root package name */
        public final int f24016b;

        /* renamed from: c, reason: collision with root package name */
        public final int f24017c;
        public final int d;

        public c(boolean z2, int i2, int i3, int i4) {
            this.f24015a = z2;
            this.f24016b = i2;
            this.f24017c = i3;
            this.d = i4;
        }
    }

    /* loaded from: classes3.dex */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final int f24018a;

        /* renamed from: b, reason: collision with root package name */
        public final int f24019b;

        /* renamed from: c, reason: collision with root package name */
        public final int f24020c;
        public final int d;
        public final int e;

        /* renamed from: f, reason: collision with root package name */
        public final int f24021f;

        /* renamed from: g, reason: collision with root package name */
        public final int f24022g;

        /* renamed from: h, reason: collision with root package name */
        public final int f24023h;

        /* renamed from: i, reason: collision with root package name */
        public final boolean f24024i;

        /* renamed from: j, reason: collision with root package name */
        public final byte[] f24025j;

        public d(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, boolean z2, byte[] bArr) {
            this.f24018a = i2;
            this.f24019b = i3;
            this.f24020c = i4;
            this.d = i5;
            this.e = i6;
            this.f24021f = i7;
            this.f24022g = i8;
            this.f24023h = i9;
            this.f24024i = z2;
            this.f24025j = bArr;
        }
    }

    public static int a(int i2) {
        int i3 = 0;
        while (i2 > 0) {
            i3++;
            i2 >>>= 1;
        }
        return i3;
    }

    private static void b(cr crVar) {
        int a2 = crVar.a(6) + 1;
        for (int i2 = 0; i2 < a2; i2++) {
            int a3 = crVar.a(16);
            if (a3 == 0) {
                crVar.b(8);
                crVar.b(16);
                crVar.b(16);
                crVar.b(6);
                crVar.b(8);
                int a4 = crVar.a(4) + 1;
                for (int i3 = 0; i3 < a4; i3++) {
                    crVar.b(8);
                }
            } else {
                if (a3 != 1) {
                    throw dh.a("floor type greater than 1 not decodable: " + a3, null);
                }
                int a5 = crVar.a(5);
                int[] iArr = new int[a5];
                int i4 = -1;
                for (int i5 = 0; i5 < a5; i5++) {
                    int a6 = crVar.a(4);
                    iArr[i5] = a6;
                    if (a6 > i4) {
                        i4 = a6;
                    }
                }
                int i6 = i4 + 1;
                int[] iArr2 = new int[i6];
                for (int i7 = 0; i7 < i6; i7++) {
                    iArr2[i7] = crVar.a(3) + 1;
                    int a7 = crVar.a(2);
                    if (a7 > 0) {
                        crVar.b(8);
                    }
                    for (int i8 = 0; i8 < (1 << a7); i8++) {
                        crVar.b(8);
                    }
                }
                crVar.b(2);
                int a8 = crVar.a(4);
                int i9 = 0;
                int i10 = 0;
                for (int i11 = 0; i11 < a5; i11++) {
                    i9 += iArr2[iArr[i11]];
                    while (i10 < i9) {
                        crVar.b(a8);
                        i10++;
                    }
                }
            }
        }
    }

    private static c[] c(cr crVar) {
        int a2 = crVar.a(6) + 1;
        c[] cVarArr = new c[a2];
        for (int i2 = 0; i2 < a2; i2++) {
            cVarArr[i2] = new c(crVar.c(), crVar.a(16), crVar.a(16), crVar.a(8));
        }
        return cVarArr;
    }

    private static void d(cr crVar) {
        int a2 = crVar.a(6) + 1;
        for (int i2 = 0; i2 < a2; i2++) {
            if (crVar.a(16) > 2) {
                throw dh.a("residueType greater than 2 is not decodable", null);
            }
            crVar.b(24);
            crVar.b(24);
            crVar.b(24);
            int a3 = crVar.a(6) + 1;
            crVar.b(8);
            int[] iArr = new int[a3];
            for (int i3 = 0; i3 < a3; i3++) {
                iArr[i3] = ((crVar.c() ? crVar.a(5) : 0) * 8) + crVar.a(3);
            }
            for (int i4 = 0; i4 < a3; i4++) {
                for (int i5 = 0; i5 < 8; i5++) {
                    if ((iArr[i4] & (1 << i5)) != 0) {
                        crVar.b(8);
                    }
                }
            }
        }
    }

    private static long a(long j2, long j3) {
        return (long) Math.floor(Math.pow(j2, 1.0d / j3));
    }

    private static a a(cr crVar) {
        if (crVar.a(24) == 5653314) {
            int a2 = crVar.a(16);
            int a3 = crVar.a(24);
            long[] jArr = new long[a3];
            boolean c2 = crVar.c();
            long j2 = 0;
            if (!c2) {
                boolean c3 = crVar.c();
                for (int i2 = 0; i2 < a3; i2++) {
                    if (c3) {
                        if (crVar.c()) {
                            jArr[i2] = crVar.a(5) + 1;
                        } else {
                            jArr[i2] = 0;
                        }
                    } else {
                        jArr[i2] = crVar.a(5) + 1;
                    }
                }
            } else {
                int a4 = crVar.a(5) + 1;
                int i3 = 0;
                while (i3 < a3) {
                    int a5 = crVar.a(a(a3 - i3));
                    for (int i4 = 0; i4 < a5 && i3 < a3; i4++) {
                        jArr[i3] = a4;
                        i3++;
                    }
                    a4++;
                }
            }
            int a6 = crVar.a(4);
            if (a6 <= 2) {
                if (a6 == 1 || a6 == 2) {
                    crVar.b(32);
                    crVar.b(32);
                    int a7 = crVar.a(4) + 1;
                    crVar.b(1);
                    if (a6 != 1) {
                        j2 = a3 * a2;
                    } else if (a2 != 0) {
                        j2 = a(a3, a2);
                    }
                    crVar.b((int) (j2 * a7));
                }
                return new a(a2, a3, jArr, a6, c2);
            }
            throw dh.a("lookup type greater than 2 not decodable: " + a6, null);
        }
        throw dh.a("expected code book to start with [0x56, 0x43, 0x42] at " + crVar.b(), null);
    }

    public static d b(bh bhVar) {
        a(1, bhVar, false);
        int q2 = bhVar.q();
        int w = bhVar.w();
        int q3 = bhVar.q();
        int m2 = bhVar.m();
        if (m2 <= 0) {
            m2 = -1;
        }
        int m3 = bhVar.m();
        if (m3 <= 0) {
            m3 = -1;
        }
        int m4 = bhVar.m();
        if (m4 <= 0) {
            m4 = -1;
        }
        int w2 = bhVar.w();
        return new d(q2, w, q3, m2, m3, m4, (int) Math.pow(2.0d, w2 & 15), (int) Math.pow(2.0d, (w2 & 240) >> 4), (bhVar.w() & 1) > 0, Arrays.copyOf(bhVar.c(), bhVar.e()));
    }

    private static void a(int i2, cr crVar) {
        int a2 = crVar.a(6) + 1;
        for (int i3 = 0; i3 < a2; i3++) {
            int a3 = crVar.a(16);
            if (a3 != 0) {
                pc.b("VorbisUtil", "mapping type other than 0 not supported: " + a3);
            } else {
                int a4 = crVar.c() ? crVar.a(4) + 1 : 1;
                if (crVar.c()) {
                    int a5 = crVar.a(8) + 1;
                    for (int i4 = 0; i4 < a5; i4++) {
                        int i5 = i2 - 1;
                        crVar.b(a(i5));
                        crVar.b(a(i5));
                    }
                }
                if (crVar.a(2) != 0) {
                    throw dh.a("to reserved bits must be zero after mapping coupling steps", null);
                }
                if (a4 > 1) {
                    for (int i6 = 0; i6 < i2; i6++) {
                        crVar.b(4);
                    }
                }
                for (int i7 = 0; i7 < a4; i7++) {
                    crVar.b(8);
                    crVar.b(8);
                    crVar.b(8);
                }
            }
        }
    }

    public static b a(bh bhVar) {
        return a(bhVar, true, true);
    }

    public static b a(bh bhVar, boolean z2, boolean z3) {
        if (z2) {
            a(3, bhVar, false);
        }
        String c2 = bhVar.c((int) bhVar.p());
        int length = c2.length();
        long p2 = bhVar.p();
        String[] strArr = new String[(int) p2];
        int i2 = length + 15;
        for (int i3 = 0; i3 < p2; i3++) {
            String c3 = bhVar.c((int) bhVar.p());
            strArr[i3] = c3;
            i2 = i2 + 4 + c3.length();
        }
        if (z3 && (bhVar.w() & 1) == 0) {
            throw dh.a("framing bit expected to be set", null);
        }
        return new b(c2, strArr, i2 + 1);
    }

    public static c[] a(bh bhVar, int i2) {
        a(5, bhVar, false);
        int w = bhVar.w() + 1;
        cr crVar = new cr(bhVar.c());
        crVar.b(bhVar.d() * 8);
        for (int i3 = 0; i3 < w; i3++) {
            a(crVar);
        }
        int a2 = crVar.a(6) + 1;
        for (int i4 = 0; i4 < a2; i4++) {
            if (crVar.a(16) != 0) {
                throw dh.a("placeholder of time domain transforms not zeroed out", null);
            }
        }
        b(crVar);
        d(crVar);
        a(i2, crVar);
        c[] c2 = c(crVar);
        if (crVar.c()) {
            return c2;
        }
        throw dh.a("framing bit after modes not set as expected", null);
    }

    public static boolean a(int i2, bh bhVar, boolean z2) {
        if (bhVar.a() < 7) {
            if (z2) {
                return false;
            }
            throw dh.a("too short header: " + bhVar.a(), null);
        }
        if (bhVar.w() != i2) {
            if (z2) {
                return false;
            }
            throw dh.a("expected header type " + Integer.toHexString(i2), null);
        }
        if (bhVar.w() == 118 && bhVar.w() == 111 && bhVar.w() == 114 && bhVar.w() == 98 && bhVar.w() == 105 && bhVar.w() == 115) {
            return true;
        }
        if (z2) {
            return false;
        }
        throw dh.a("expected characters 'vorbis'", null);
    }
}
