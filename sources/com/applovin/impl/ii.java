package com.applovin.impl;

import android.util.SparseArray;
import com.applovin.impl.dp;
import com.applovin.impl.ij;
import com.google.common.primitives.UnsignedBytes;

/* loaded from: classes.dex */
public final class ii implements k8 {

    /* renamed from: l */
    public static final o8 f24481l = new dt(4);

    /* renamed from: a */
    private final ho f24482a;

    /* renamed from: b */
    private final SparseArray f24483b;

    /* renamed from: c */
    private final bh f24484c;
    private final hi d;
    private boolean e;

    /* renamed from: f */
    private boolean f24485f;

    /* renamed from: g */
    private boolean f24486g;

    /* renamed from: h */
    private long f24487h;

    /* renamed from: i */
    private gi f24488i;

    /* renamed from: j */
    private m8 f24489j;

    /* renamed from: k */
    private boolean f24490k;

    public ii() {
        this(new ho(0L));
    }

    public static /* synthetic */ k8[] b() {
        return new k8[]{new ii()};
    }

    @Override // com.applovin.impl.k8
    public void a() {
    }

    public ii(ho hoVar) {
        this.f24482a = hoVar;
        this.f24484c = new bh(4096);
        this.f24483b = new SparseArray();
        this.d = new hi();
    }

    @Override // com.applovin.impl.k8
    public void a(m8 m8Var) {
        this.f24489j = m8Var;
    }

    private void a(long j2) {
        if (this.f24490k) {
            return;
        }
        this.f24490k = true;
        if (this.d.a() != -9223372036854775807L) {
            gi giVar = new gi(this.d.b(), this.d.a(), j2);
            this.f24488i = giVar;
            this.f24489j.a(giVar.a());
            return;
        }
        this.f24489j.a(new ij.b(this.d.a()));
    }

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private final q7 f24491a;

        /* renamed from: b */
        private final ho f24492b;

        /* renamed from: c */
        private final ah f24493c = new ah(new byte[64]);
        private boolean d;
        private boolean e;

        /* renamed from: f */
        private boolean f24494f;

        /* renamed from: g */
        private int f24495g;

        /* renamed from: h */
        private long f24496h;

        public a(q7 q7Var, ho hoVar) {
            this.f24491a = q7Var;
            this.f24492b = hoVar;
        }

        private void b() {
            this.f24496h = 0L;
            if (this.d) {
                this.f24493c.d(4);
                this.f24493c.d(1);
                this.f24493c.d(1);
                long a2 = (this.f24493c.a(3) << 30) | (this.f24493c.a(15) << 15) | this.f24493c.a(15);
                this.f24493c.d(1);
                if (!this.f24494f && this.e) {
                    this.f24493c.d(4);
                    this.f24493c.d(1);
                    this.f24493c.d(1);
                    this.f24493c.d(1);
                    this.f24492b.b((this.f24493c.a(3) << 30) | (this.f24493c.a(15) << 15) | this.f24493c.a(15));
                    this.f24494f = true;
                }
                this.f24496h = this.f24492b.b(a2);
            }
        }

        public void a(bh bhVar) {
            bhVar.a(this.f24493c.f22849a, 0, 3);
            this.f24493c.c(0);
            a();
            bhVar.a(this.f24493c.f22849a, 0, this.f24495g);
            this.f24493c.c(0);
            b();
            this.f24491a.a(this.f24496h, 4);
            this.f24491a.a(bhVar);
            this.f24491a.b();
        }

        public void c() {
            this.f24494f = false;
            this.f24491a.a();
        }

        private void a() {
            this.f24493c.d(8);
            this.d = this.f24493c.f();
            this.e = this.f24493c.f();
            this.f24493c.d(6);
            this.f24495g = this.f24493c.a(8);
        }
    }

    @Override // com.applovin.impl.k8
    public int a(l8 l8Var, th thVar) {
        q7 q7Var;
        b1.b(this.f24489j);
        long a2 = l8Var.a();
        if (a2 != -1 && !this.d.c()) {
            return this.d.a(l8Var, thVar);
        }
        a(a2);
        gi giVar = this.f24488i;
        if (giVar != null && giVar.b()) {
            return this.f24488i.a(l8Var, thVar);
        }
        l8Var.b();
        long d = a2 != -1 ? a2 - l8Var.d() : -1L;
        if ((d != -1 && d < 4) || !l8Var.b(this.f24484c.c(), 0, 4, true)) {
            return -1;
        }
        this.f24484c.f(0);
        int j2 = this.f24484c.j();
        if (j2 == 441) {
            return -1;
        }
        if (j2 == 442) {
            l8Var.c(this.f24484c.c(), 0, 10);
            this.f24484c.f(9);
            l8Var.a((this.f24484c.w() & 7) + 14);
            return 0;
        }
        if (j2 == 443) {
            l8Var.c(this.f24484c.c(), 0, 2);
            this.f24484c.f(0);
            l8Var.a(this.f24484c.C() + 6);
            return 0;
        }
        if (((j2 & (-256)) >> 8) != 1) {
            l8Var.a(1);
            return 0;
        }
        int i2 = j2 & 255;
        a aVar = (a) this.f24483b.get(i2);
        if (!this.e) {
            if (aVar == null) {
                if (i2 == 189) {
                    q7Var = new j();
                    this.f24485f = true;
                    this.f24487h = l8Var.f();
                } else if ((j2 & 224) == 192) {
                    q7Var = new sf();
                    this.f24485f = true;
                    this.f24487h = l8Var.f();
                } else if ((j2 & 240) == 224) {
                    q7Var = new fa();
                    this.f24486g = true;
                    this.f24487h = l8Var.f();
                } else {
                    q7Var = null;
                }
                if (q7Var != null) {
                    q7Var.a(this.f24489j, new dp.d(i2, 256));
                    aVar = new a(q7Var, this.f24482a);
                    this.f24483b.put(i2, aVar);
                }
            }
            if (l8Var.f() > ((this.f24485f && this.f24486g) ? this.f24487h + 8192 : 1048576L)) {
                this.e = true;
                this.f24489j.c();
            }
        }
        l8Var.c(this.f24484c.c(), 0, 2);
        this.f24484c.f(0);
        int C = this.f24484c.C() + 6;
        if (aVar == null) {
            l8Var.a(C);
        } else {
            this.f24484c.d(C);
            l8Var.d(this.f24484c.c(), 0, C);
            this.f24484c.f(6);
            aVar.a(this.f24484c);
            bh bhVar = this.f24484c;
            bhVar.e(bhVar.b());
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0027, code lost:
    
        if (r2 != r7) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002c, code lost:
    
        r4.f24482a.d(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x002a, code lost:
    
        if (r5 != false) goto L40;
     */
    @Override // com.applovin.impl.k8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(long r5, long r7) {
        /*
            r4 = this;
            com.applovin.impl.ho r5 = r4.f24482a
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
            com.applovin.impl.ho r5 = r4.f24482a
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
            com.applovin.impl.ho r5 = r4.f24482a
            r5.d(r7)
        L31:
            com.applovin.impl.gi r5 = r4.f24488i
            if (r5 == 0) goto L38
            r5.b(r7)
        L38:
            android.util.SparseArray r5 = r4.f24483b
            int r5 = r5.size()
            if (r6 >= r5) goto L4e
            android.util.SparseArray r5 = r4.f24483b
            java.lang.Object r5 = r5.valueAt(r6)
            com.applovin.impl.ii$a r5 = (com.applovin.impl.ii.a) r5
            r5.c()
            int r6 = r6 + 1
            goto L38
        L4e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.ii.a(long, long):void");
    }

    @Override // com.applovin.impl.k8
    public boolean a(l8 l8Var) {
        byte[] bArr = new byte[14];
        l8Var.c(bArr, 0, 14);
        if (442 != (((bArr[0] & UnsignedBytes.MAX_VALUE) << 24) | ((bArr[1] & UnsignedBytes.MAX_VALUE) << 16) | ((bArr[2] & UnsignedBytes.MAX_VALUE) << 8) | (bArr[3] & UnsignedBytes.MAX_VALUE)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        l8Var.c(bArr[13] & 7);
        l8Var.c(bArr, 0, 3);
        return 1 == ((((bArr[0] & UnsignedBytes.MAX_VALUE) << 16) | ((bArr[1] & UnsignedBytes.MAX_VALUE) << 8)) | (bArr[2] & UnsignedBytes.MAX_VALUE));
    }
}
