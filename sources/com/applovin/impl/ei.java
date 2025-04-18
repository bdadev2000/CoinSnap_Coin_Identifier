package com.applovin.impl;

import android.util.SparseArray;
import androidx.core.app.NotificationCompat;
import com.applovin.impl.ej;
import com.applovin.impl.ep;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import kotlin.UByte;

/* loaded from: classes.dex */
public final class ei implements i8 {

    /* renamed from: l */
    public static final m8 f4455l = new ht(3);
    private final io a;

    /* renamed from: b */
    private final SparseArray f4456b;

    /* renamed from: c */
    private final yg f4457c;

    /* renamed from: d */
    private final di f4458d;

    /* renamed from: e */
    private boolean f4459e;

    /* renamed from: f */
    private boolean f4460f;

    /* renamed from: g */
    private boolean f4461g;

    /* renamed from: h */
    private long f4462h;

    /* renamed from: i */
    private ci f4463i;

    /* renamed from: j */
    private k8 f4464j;

    /* renamed from: k */
    private boolean f4465k;

    public ei() {
        this(new io(0L));
    }

    public static /* synthetic */ i8[] b() {
        return new i8[]{new ei()};
    }

    public static /* synthetic */ i8[] c() {
        return b();
    }

    @Override // com.applovin.impl.i8
    public void a() {
    }

    public ei(io ioVar) {
        this.a = ioVar;
        this.f4457c = new yg(4096);
        this.f4456b = new SparseArray();
        this.f4458d = new di();
    }

    @Override // com.applovin.impl.i8
    public void a(k8 k8Var) {
        this.f4464j = k8Var;
    }

    private void a(long j3) {
        if (this.f4465k) {
            return;
        }
        this.f4465k = true;
        if (this.f4458d.a() != C.TIME_UNSET) {
            ci ciVar = new ci(this.f4458d.b(), this.f4458d.a(), j3);
            this.f4463i = ciVar;
            this.f4464j.a(ciVar.a());
            return;
        }
        this.f4464j.a(new ej.b(this.f4458d.a()));
    }

    /* loaded from: classes.dex */
    public static final class a {
        private final o7 a;

        /* renamed from: b */
        private final io f4466b;

        /* renamed from: c */
        private final xg f4467c = new xg(new byte[64]);

        /* renamed from: d */
        private boolean f4468d;

        /* renamed from: e */
        private boolean f4469e;

        /* renamed from: f */
        private boolean f4470f;

        /* renamed from: g */
        private int f4471g;

        /* renamed from: h */
        private long f4472h;

        public a(o7 o7Var, io ioVar) {
            this.a = o7Var;
            this.f4466b = ioVar;
        }

        private void b() {
            this.f4472h = 0L;
            if (this.f4468d) {
                this.f4467c.d(4);
                this.f4467c.d(1);
                this.f4467c.d(1);
                long a = (this.f4467c.a(3) << 30) | (this.f4467c.a(15) << 15) | this.f4467c.a(15);
                this.f4467c.d(1);
                if (!this.f4470f && this.f4469e) {
                    this.f4467c.d(4);
                    this.f4467c.d(1);
                    this.f4467c.d(1);
                    this.f4467c.d(1);
                    this.f4466b.b((this.f4467c.a(3) << 30) | (this.f4467c.a(15) << 15) | this.f4467c.a(15));
                    this.f4470f = true;
                }
                this.f4472h = this.f4466b.b(a);
            }
        }

        public void a(yg ygVar) {
            ygVar.a(this.f4467c.a, 0, 3);
            this.f4467c.c(0);
            a();
            ygVar.a(this.f4467c.a, 0, this.f4471g);
            this.f4467c.c(0);
            b();
            this.a.a(this.f4472h, 4);
            this.a.a(ygVar);
            this.a.b();
        }

        public void c() {
            this.f4470f = false;
            this.a.a();
        }

        private void a() {
            this.f4467c.d(8);
            this.f4468d = this.f4467c.f();
            this.f4469e = this.f4467c.f();
            this.f4467c.d(6);
            this.f4471g = this.f4467c.a(8);
        }
    }

    @Override // com.applovin.impl.i8
    public int a(j8 j8Var, qh qhVar) {
        o7 o7Var;
        a1.b(this.f4464j);
        long a10 = j8Var.a();
        if (a10 != -1 && !this.f4458d.c()) {
            return this.f4458d.a(j8Var, qhVar);
        }
        a(a10);
        ci ciVar = this.f4463i;
        if (ciVar != null && ciVar.b()) {
            return this.f4463i.a(j8Var, qhVar);
        }
        j8Var.b();
        long d10 = a10 != -1 ? a10 - j8Var.d() : -1L;
        if ((d10 != -1 && d10 < 4) || !j8Var.b(this.f4457c.c(), 0, 4, true)) {
            return -1;
        }
        this.f4457c.f(0);
        int j3 = this.f4457c.j();
        if (j3 == 441) {
            return -1;
        }
        if (j3 == 442) {
            j8Var.c(this.f4457c.c(), 0, 10);
            this.f4457c.f(9);
            j8Var.a((this.f4457c.w() & 7) + 14);
            return 0;
        }
        if (j3 == 443) {
            j8Var.c(this.f4457c.c(), 0, 2);
            this.f4457c.f(0);
            j8Var.a(this.f4457c.C() + 6);
            return 0;
        }
        if (((j3 & (-256)) >> 8) != 1) {
            j8Var.a(1);
            return 0;
        }
        int i10 = j3 & 255;
        a aVar = (a) this.f4456b.get(i10);
        if (!this.f4459e) {
            if (aVar == null) {
                if (i10 == 189) {
                    o7Var = new j();
                    this.f4460f = true;
                    this.f4462h = j8Var.f();
                } else if ((j3 & 224) == 192) {
                    o7Var = new nf();
                    this.f4460f = true;
                    this.f4462h = j8Var.f();
                } else if ((j3 & PsExtractor.VIDEO_STREAM_MASK) == 224) {
                    o7Var = new da();
                    this.f4461g = true;
                    this.f4462h = j8Var.f();
                } else {
                    o7Var = null;
                }
                if (o7Var != null) {
                    o7Var.a(this.f4464j, new ep.d(i10, NotificationCompat.FLAG_LOCAL_ONLY));
                    aVar = new a(o7Var, this.a);
                    this.f4456b.put(i10, aVar);
                }
            }
            if (j8Var.f() > ((this.f4460f && this.f4461g) ? this.f4462h + 8192 : 1048576L)) {
                this.f4459e = true;
                this.f4464j.c();
            }
        }
        j8Var.c(this.f4457c.c(), 0, 2);
        this.f4457c.f(0);
        int C = this.f4457c.C() + 6;
        if (aVar == null) {
            j8Var.a(C);
        } else {
            this.f4457c.d(C);
            j8Var.d(this.f4457c.c(), 0, C);
            this.f4457c.f(6);
            aVar.a(this.f4457c);
            yg ygVar = this.f4457c;
            ygVar.e(ygVar.b());
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0027, code lost:
    
        if (r2 != r7) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002c, code lost:
    
        r4.a.d(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x002a, code lost:
    
        if (r5 != false) goto L40;
     */
    @Override // com.applovin.impl.i8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(long r5, long r7) {
        /*
            r4 = this;
            com.applovin.impl.io r5 = r4.a
            long r5 = r5.c()
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            r6 = 0
            if (r5 != 0) goto L12
            r5 = 1
            goto L13
        L12:
            r5 = r6
        L13:
            if (r5 != 0) goto L2a
            com.applovin.impl.io r5 = r4.a
            long r2 = r5.a()
            int r5 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r5 == 0) goto L31
            r0 = 0
            int r5 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r5 == 0) goto L31
            int r5 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r5 == 0) goto L31
            goto L2c
        L2a:
            if (r5 == 0) goto L31
        L2c:
            com.applovin.impl.io r5 = r4.a
            r5.d(r7)
        L31:
            com.applovin.impl.ci r5 = r4.f4463i
            if (r5 == 0) goto L38
            r5.b(r7)
        L38:
            android.util.SparseArray r5 = r4.f4456b
            int r5 = r5.size()
            if (r6 >= r5) goto L4e
            android.util.SparseArray r5 = r4.f4456b
            java.lang.Object r5 = r5.valueAt(r6)
            com.applovin.impl.ei$a r5 = (com.applovin.impl.ei.a) r5
            r5.c()
            int r6 = r6 + 1
            goto L38
        L4e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.ei.a(long, long):void");
    }

    @Override // com.applovin.impl.i8
    public boolean a(j8 j8Var) {
        byte[] bArr = new byte[14];
        j8Var.c(bArr, 0, 14);
        if (442 != (((bArr[0] & UByte.MAX_VALUE) << 24) | ((bArr[1] & UByte.MAX_VALUE) << 16) | ((bArr[2] & UByte.MAX_VALUE) << 8) | (bArr[3] & UByte.MAX_VALUE)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        j8Var.c(bArr[13] & 7);
        j8Var.c(bArr, 0, 3);
        return 1 == ((((bArr[0] & UByte.MAX_VALUE) << 16) | ((bArr[1] & UByte.MAX_VALUE) << 8)) | (bArr[2] & UByte.MAX_VALUE));
    }
}
