package com.applovin.impl;

import com.applovin.impl.ep;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class da implements o7 {

    /* renamed from: q, reason: collision with root package name */
    private static final double[] f7251q = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* renamed from: a, reason: collision with root package name */
    private String f7252a;
    private ro b;

    /* renamed from: c, reason: collision with root package name */
    private final wp f7253c;

    /* renamed from: d, reason: collision with root package name */
    private final yg f7254d;

    /* renamed from: e, reason: collision with root package name */
    private final tf f7255e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean[] f7256f;

    /* renamed from: g, reason: collision with root package name */
    private final a f7257g;

    /* renamed from: h, reason: collision with root package name */
    private long f7258h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f7259i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f7260j;

    /* renamed from: k, reason: collision with root package name */
    private long f7261k;
    private long l;
    private long m;

    /* renamed from: n, reason: collision with root package name */
    private long f7262n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f7263o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f7264p;

    public da() {
        this(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x012c  */
    @Override // com.applovin.impl.o7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(com.applovin.impl.yg r21) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.da.a(com.applovin.impl.yg):void");
    }

    @Override // com.applovin.impl.o7
    public void b() {
    }

    public da(wp wpVar) {
        this.f7253c = wpVar;
        this.f7256f = new boolean[4];
        this.f7257g = new a(128);
        if (wpVar != null) {
            this.f7255e = new tf(178, 128);
            this.f7254d = new yg();
        } else {
            this.f7255e = null;
            this.f7254d = null;
        }
        this.l = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        this.f7262n = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
    }

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: e, reason: collision with root package name */
        private static final byte[] f7265e = {0, 0, 1};

        /* renamed from: a, reason: collision with root package name */
        private boolean f7266a;
        public int b;

        /* renamed from: c, reason: collision with root package name */
        public int f7267c;

        /* renamed from: d, reason: collision with root package name */
        public byte[] f7268d;

        public a(int i9) {
            this.f7268d = new byte[i9];
        }

        public void a(byte[] bArr, int i9, int i10) {
            if (this.f7266a) {
                int i11 = i10 - i9;
                byte[] bArr2 = this.f7268d;
                int length = bArr2.length;
                int i12 = this.b + i11;
                if (length < i12) {
                    this.f7268d = Arrays.copyOf(bArr2, i12 * 2);
                }
                System.arraycopy(bArr, i9, this.f7268d, this.b, i11);
                this.b += i11;
            }
        }

        public boolean a(int i9, int i10) {
            if (this.f7266a) {
                int i11 = this.b - i10;
                this.b = i11;
                if (this.f7267c == 0 && i9 == 181) {
                    this.f7267c = i11;
                } else {
                    this.f7266a = false;
                    return true;
                }
            } else if (i9 == 179) {
                this.f7266a = true;
            }
            byte[] bArr = f7265e;
            a(bArr, 0, bArr.length);
            return false;
        }

        public void a() {
            this.f7266a = false;
            this.b = 0;
            this.f7267c = 0;
        }
    }

    @Override // com.applovin.impl.o7
    public void a(k8 k8Var, ep.d dVar) {
        dVar.a();
        this.f7252a = dVar.b();
        this.b = k8Var.a(dVar.c(), 2);
        wp wpVar = this.f7253c;
        if (wpVar != null) {
            wpVar.a(k8Var, dVar);
        }
    }

    @Override // com.applovin.impl.o7
    public void a(long j7, int i9) {
        this.l = j7;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.util.Pair a(com.applovin.impl.da.a r8, java.lang.String r9) {
        /*
            byte[] r0 = r8.f7268d
            int r1 = r8.b
            byte[] r0 = java.util.Arrays.copyOf(r0, r1)
            r1 = 4
            r2 = r0[r1]
            r2 = r2 & 255(0xff, float:3.57E-43)
            r3 = 5
            r4 = r0[r3]
            r5 = r4 & 255(0xff, float:3.57E-43)
            r6 = 6
            r6 = r0[r6]
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r1
            int r5 = r5 >> r1
            r2 = r2 | r5
            r4 = r4 & 15
            int r4 = r4 << 8
            r4 = r4 | r6
            r5 = 7
            r6 = r0[r5]
            r6 = r6 & 240(0xf0, float:3.36E-43)
            int r6 = r6 >> r1
            r7 = 2
            if (r6 == r7) goto L3e
            r7 = 3
            if (r6 == r7) goto L38
            if (r6 == r1) goto L30
            r1 = 1065353216(0x3f800000, float:1.0)
            goto L44
        L30:
            int r1 = r4 * 121
            float r1 = (float) r1
            int r6 = r2 * 100
        L35:
            float r6 = (float) r6
            float r1 = r1 / r6
            goto L44
        L38:
            int r1 = r4 * 16
            float r1 = (float) r1
            int r6 = r2 * 9
            goto L35
        L3e:
            int r1 = r4 * 4
            float r1 = (float) r1
            int r6 = r2 * 3
            goto L35
        L44:
            com.applovin.impl.d9$b r6 = new com.applovin.impl.d9$b
            r6.<init>()
            com.applovin.impl.d9$b r9 = r6.c(r9)
            java.lang.String r6 = "video/mpeg2"
            com.applovin.impl.d9$b r9 = r9.f(r6)
            com.applovin.impl.d9$b r9 = r9.q(r2)
            com.applovin.impl.d9$b r9 = r9.g(r4)
            com.applovin.impl.d9$b r9 = r9.b(r1)
            java.util.List r1 = java.util.Collections.singletonList(r0)
            com.applovin.impl.d9$b r9 = r9.a(r1)
            com.applovin.impl.d9 r9 = r9.a()
            r1 = r0[r5]
            r1 = r1 & 15
            int r1 = r1 + (-1)
            if (r1 < 0) goto L98
            double[] r2 = com.applovin.impl.da.f7251q
            int r4 = r2.length
            if (r1 >= r4) goto L98
            r1 = r2[r1]
            int r8 = r8.f7267c
            int r8 = r8 + 9
            r8 = r0[r8]
            r0 = r8 & 96
            int r0 = r0 >> r3
            r8 = r8 & 31
            if (r0 == r8) goto L90
            double r3 = (double) r0
            r5 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r3 = r3 + r5
            int r8 = r8 + 1
            double r5 = (double) r8
            double r3 = r3 / r5
            double r1 = r1 * r3
        L90:
            r3 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r3 = r3 / r1
            long r0 = (long) r3
            goto L9a
        L98:
            r0 = 0
        L9a:
            java.lang.Long r8 = java.lang.Long.valueOf(r0)
            android.util.Pair r8 = android.util.Pair.create(r9, r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.da.a(com.applovin.impl.da$a, java.lang.String):android.util.Pair");
    }

    @Override // com.applovin.impl.o7
    public void a() {
        uf.a(this.f7256f);
        this.f7257g.a();
        tf tfVar = this.f7255e;
        if (tfVar != null) {
            tfVar.b();
        }
        this.f7258h = 0L;
        this.f7259i = false;
        this.l = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        this.f7262n = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
    }
}
