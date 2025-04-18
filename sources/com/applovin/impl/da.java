package com.applovin.impl;

import com.applovin.impl.ep;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class da implements o7 {

    /* renamed from: q, reason: collision with root package name */
    private static final double[] f4265q = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    private String a;

    /* renamed from: b, reason: collision with root package name */
    private ro f4266b;

    /* renamed from: c, reason: collision with root package name */
    private final wp f4267c;

    /* renamed from: d, reason: collision with root package name */
    private final yg f4268d;

    /* renamed from: e, reason: collision with root package name */
    private final tf f4269e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean[] f4270f;

    /* renamed from: g, reason: collision with root package name */
    private final a f4271g;

    /* renamed from: h, reason: collision with root package name */
    private long f4272h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f4273i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f4274j;

    /* renamed from: k, reason: collision with root package name */
    private long f4275k;

    /* renamed from: l, reason: collision with root package name */
    private long f4276l;

    /* renamed from: m, reason: collision with root package name */
    private long f4277m;

    /* renamed from: n, reason: collision with root package name */
    private long f4278n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f4279o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f4280p;

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
        this.f4267c = wpVar;
        this.f4270f = new boolean[4];
        this.f4271g = new a(128);
        if (wpVar != null) {
            this.f4269e = new tf(178, 128);
            this.f4268d = new yg();
        } else {
            this.f4269e = null;
            this.f4268d = null;
        }
        this.f4276l = C.TIME_UNSET;
        this.f4278n = C.TIME_UNSET;
    }

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: e, reason: collision with root package name */
        private static final byte[] f4281e = {0, 0, 1};
        private boolean a;

        /* renamed from: b, reason: collision with root package name */
        public int f4282b;

        /* renamed from: c, reason: collision with root package name */
        public int f4283c;

        /* renamed from: d, reason: collision with root package name */
        public byte[] f4284d;

        public a(int i10) {
            this.f4284d = new byte[i10];
        }

        public void a(byte[] bArr, int i10, int i11) {
            if (this.a) {
                int i12 = i11 - i10;
                byte[] bArr2 = this.f4284d;
                int length = bArr2.length;
                int i13 = this.f4282b + i12;
                if (length < i13) {
                    this.f4284d = Arrays.copyOf(bArr2, i13 * 2);
                }
                System.arraycopy(bArr, i10, this.f4284d, this.f4282b, i12);
                this.f4282b += i12;
            }
        }

        public boolean a(int i10, int i11) {
            if (this.a) {
                int i12 = this.f4282b - i11;
                this.f4282b = i12;
                if (this.f4283c == 0 && i10 == 181) {
                    this.f4283c = i12;
                } else {
                    this.a = false;
                    return true;
                }
            } else if (i10 == 179) {
                this.a = true;
            }
            byte[] bArr = f4281e;
            a(bArr, 0, bArr.length);
            return false;
        }

        public void a() {
            this.a = false;
            this.f4282b = 0;
            this.f4283c = 0;
        }
    }

    @Override // com.applovin.impl.o7
    public void a(k8 k8Var, ep.d dVar) {
        dVar.a();
        this.a = dVar.b();
        this.f4266b = k8Var.a(dVar.c(), 2);
        wp wpVar = this.f4267c;
        if (wpVar != null) {
            wpVar.a(k8Var, dVar);
        }
    }

    @Override // com.applovin.impl.o7
    public void a(long j3, int i10) {
        this.f4276l = j3;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.util.Pair a(com.applovin.impl.da.a r8, java.lang.String r9) {
        /*
            byte[] r0 = r8.f4284d
            int r1 = r8.f4282b
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
            if (r6 == r7) goto L3c
            r7 = 3
            if (r6 == r7) goto L36
            if (r6 == r1) goto L30
            r1 = 1065353216(0x3f800000, float:1.0)
            goto L43
        L30:
            int r1 = r4 * 121
            float r1 = (float) r1
            int r6 = r2 * 100
            goto L41
        L36:
            int r1 = r4 * 16
            float r1 = (float) r1
            int r6 = r2 * 9
            goto L41
        L3c:
            int r1 = r4 * 4
            float r1 = (float) r1
            int r6 = r2 * 3
        L41:
            float r6 = (float) r6
            float r1 = r1 / r6
        L43:
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
            if (r1 < 0) goto L97
            double[] r2 = com.applovin.impl.da.f4265q
            int r4 = r2.length
            if (r1 >= r4) goto L97
            r1 = r2[r1]
            int r8 = r8.f4283c
            int r8 = r8 + 9
            r8 = r0[r8]
            r0 = r8 & 96
            int r0 = r0 >> r3
            r8 = r8 & 31
            if (r0 == r8) goto L8f
            double r3 = (double) r0
            r5 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r3 = r3 + r5
            int r8 = r8 + 1
            double r5 = (double) r8
            double r3 = r3 / r5
            double r1 = r1 * r3
        L8f:
            r3 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r3 = r3 / r1
            long r0 = (long) r3
            goto L99
        L97:
            r0 = 0
        L99:
            java.lang.Long r8 = java.lang.Long.valueOf(r0)
            android.util.Pair r8 = android.util.Pair.create(r9, r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.da.a(com.applovin.impl.da$a, java.lang.String):android.util.Pair");
    }

    @Override // com.applovin.impl.o7
    public void a() {
        uf.a(this.f4270f);
        this.f4271g.a();
        tf tfVar = this.f4269e;
        if (tfVar != null) {
            tfVar.b();
        }
        this.f4272h = 0L;
        this.f4273i = false;
        this.f4276l = C.TIME_UNSET;
        this.f4278n = C.TIME_UNSET;
    }
}
