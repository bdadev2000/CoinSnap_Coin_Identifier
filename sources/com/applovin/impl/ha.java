package com.applovin.impl;

import android.util.SparseArray;
import com.applovin.impl.dp;
import com.applovin.impl.f9;
import com.applovin.impl.zf;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class ha implements q7 {

    /* renamed from: a, reason: collision with root package name */
    private final nj f24245a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f24246b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f24247c;

    /* renamed from: g, reason: collision with root package name */
    private long f24249g;

    /* renamed from: i, reason: collision with root package name */
    private String f24251i;

    /* renamed from: j, reason: collision with root package name */
    private qo f24252j;

    /* renamed from: k, reason: collision with root package name */
    private b f24253k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f24254l;

    /* renamed from: n, reason: collision with root package name */
    private boolean f24256n;

    /* renamed from: h, reason: collision with root package name */
    private final boolean[] f24250h = new boolean[3];
    private final yf d = new yf(7, 128);
    private final yf e = new yf(8, 128);

    /* renamed from: f, reason: collision with root package name */
    private final yf f24248f = new yf(6, 128);

    /* renamed from: m, reason: collision with root package name */
    private long f24255m = -9223372036854775807L;

    /* renamed from: o, reason: collision with root package name */
    private final bh f24257o = new bh();

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final qo f24258a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f24259b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f24260c;
        private final SparseArray d = new SparseArray();
        private final SparseArray e = new SparseArray();

        /* renamed from: f, reason: collision with root package name */
        private final ch f24261f;

        /* renamed from: g, reason: collision with root package name */
        private byte[] f24262g;

        /* renamed from: h, reason: collision with root package name */
        private int f24263h;

        /* renamed from: i, reason: collision with root package name */
        private int f24264i;

        /* renamed from: j, reason: collision with root package name */
        private long f24265j;

        /* renamed from: k, reason: collision with root package name */
        private boolean f24266k;

        /* renamed from: l, reason: collision with root package name */
        private long f24267l;

        /* renamed from: m, reason: collision with root package name */
        private a f24268m;

        /* renamed from: n, reason: collision with root package name */
        private a f24269n;

        /* renamed from: o, reason: collision with root package name */
        private boolean f24270o;

        /* renamed from: p, reason: collision with root package name */
        private long f24271p;

        /* renamed from: q, reason: collision with root package name */
        private long f24272q;

        /* renamed from: r, reason: collision with root package name */
        private boolean f24273r;

        /* loaded from: classes.dex */
        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            private boolean f24274a;

            /* renamed from: b, reason: collision with root package name */
            private boolean f24275b;

            /* renamed from: c, reason: collision with root package name */
            private zf.b f24276c;
            private int d;
            private int e;

            /* renamed from: f, reason: collision with root package name */
            private int f24277f;

            /* renamed from: g, reason: collision with root package name */
            private int f24278g;

            /* renamed from: h, reason: collision with root package name */
            private boolean f24279h;

            /* renamed from: i, reason: collision with root package name */
            private boolean f24280i;

            /* renamed from: j, reason: collision with root package name */
            private boolean f24281j;

            /* renamed from: k, reason: collision with root package name */
            private boolean f24282k;

            /* renamed from: l, reason: collision with root package name */
            private int f24283l;

            /* renamed from: m, reason: collision with root package name */
            private int f24284m;

            /* renamed from: n, reason: collision with root package name */
            private int f24285n;

            /* renamed from: o, reason: collision with root package name */
            private int f24286o;

            /* renamed from: p, reason: collision with root package name */
            private int f24287p;

            private a() {
            }

            public void a() {
                this.f24275b = false;
                this.f24274a = false;
            }

            public boolean b() {
                int i2;
                return this.f24275b && ((i2 = this.e) == 7 || i2 == 2);
            }

            public void a(int i2) {
                this.e = i2;
                this.f24275b = true;
            }

            public void a(zf.b bVar, int i2, int i3, int i4, int i5, boolean z2, boolean z3, boolean z4, boolean z5, int i6, int i7, int i8, int i9, int i10) {
                this.f24276c = bVar;
                this.d = i2;
                this.e = i3;
                this.f24277f = i4;
                this.f24278g = i5;
                this.f24279h = z2;
                this.f24280i = z3;
                this.f24281j = z4;
                this.f24282k = z5;
                this.f24283l = i6;
                this.f24284m = i7;
                this.f24285n = i8;
                this.f24286o = i9;
                this.f24287p = i10;
                this.f24274a = true;
                this.f24275b = true;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public boolean a(a aVar) {
                int i2;
                int i3;
                int i4;
                boolean z2;
                if (!this.f24274a) {
                    return false;
                }
                if (!aVar.f24274a) {
                    return true;
                }
                zf.b bVar = (zf.b) b1.b(this.f24276c);
                zf.b bVar2 = (zf.b) b1.b(aVar.f24276c);
                return (this.f24277f == aVar.f24277f && this.f24278g == aVar.f24278g && this.f24279h == aVar.f24279h && (!this.f24280i || !aVar.f24280i || this.f24281j == aVar.f24281j) && (((i2 = this.d) == (i3 = aVar.d) || (i2 != 0 && i3 != 0)) && (((i4 = bVar.f28344k) != 0 || bVar2.f28344k != 0 || (this.f24284m == aVar.f24284m && this.f24285n == aVar.f24285n)) && ((i4 != 1 || bVar2.f28344k != 1 || (this.f24286o == aVar.f24286o && this.f24287p == aVar.f24287p)) && (z2 = this.f24282k) == aVar.f24282k && (!z2 || this.f24283l == aVar.f24283l))))) ? false : true;
            }
        }

        public b(qo qoVar, boolean z2, boolean z3) {
            this.f24258a = qoVar;
            this.f24259b = z2;
            this.f24260c = z3;
            this.f24268m = new a();
            this.f24269n = new a();
            byte[] bArr = new byte[128];
            this.f24262g = bArr;
            this.f24261f = new ch(bArr, 0, 0);
            b();
        }

        public boolean a() {
            return this.f24260c;
        }

        public void b() {
            this.f24266k = false;
            this.f24270o = false;
            this.f24269n.a();
        }

        /* JADX WARN: Removed duplicated region for block: B:50:0x00fc  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x0103  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x011b  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x0153  */
        /* JADX WARN: Removed duplicated region for block: B:88:0x0115  */
        /* JADX WARN: Removed duplicated region for block: B:89:0x00ff  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void a(byte[] r23, int r24, int r25) {
            /*
                Method dump skipped, instructions count: 412
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.ha.b.a(byte[], int, int):void");
        }

        public boolean a(long j2, int i2, boolean z2, boolean z3) {
            boolean z4 = false;
            if (this.f24264i == 9 || (this.f24260c && this.f24269n.a(this.f24268m))) {
                if (z2 && this.f24270o) {
                    a(i2 + ((int) (j2 - this.f24265j)));
                }
                this.f24271p = this.f24265j;
                this.f24272q = this.f24267l;
                this.f24273r = false;
                this.f24270o = true;
            }
            if (this.f24259b) {
                z3 = this.f24269n.b();
            }
            boolean z5 = this.f24273r;
            int i3 = this.f24264i;
            if (i3 == 5 || (z3 && i3 == 1)) {
                z4 = true;
            }
            boolean z6 = z5 | z4;
            this.f24273r = z6;
            return z6;
        }

        private void a(int i2) {
            long j2 = this.f24272q;
            if (j2 == -9223372036854775807L) {
                return;
            }
            boolean z2 = this.f24273r;
            this.f24258a.a(j2, z2 ? 1 : 0, (int) (this.f24265j - this.f24271p), i2, null);
        }

        public void a(zf.a aVar) {
            this.e.append(aVar.f28333a, aVar);
        }

        public void a(zf.b bVar) {
            this.d.append(bVar.d, bVar);
        }

        public void a(long j2, int i2, long j3) {
            this.f24264i = i2;
            this.f24267l = j3;
            this.f24265j = j2;
            if (!this.f24259b || i2 != 1) {
                if (!this.f24260c) {
                    return;
                }
                if (i2 != 5 && i2 != 1 && i2 != 2) {
                    return;
                }
            }
            a aVar = this.f24268m;
            this.f24268m = this.f24269n;
            this.f24269n = aVar;
            aVar.a();
            this.f24263h = 0;
            this.f24266k = true;
        }
    }

    public ha(nj njVar, boolean z2, boolean z3) {
        this.f24245a = njVar;
        this.f24246b = z2;
        this.f24247c = z3;
    }

    private void c() {
        b1.b(this.f24252j);
        xp.a(this.f24253k);
    }

    @Override // com.applovin.impl.q7
    public void a(long j2, int i2) {
        if (j2 != -9223372036854775807L) {
            this.f24255m = j2;
        }
        this.f24256n |= (i2 & 2) != 0;
    }

    @Override // com.applovin.impl.q7
    public void b() {
    }

    @Override // com.applovin.impl.q7
    public void a(bh bhVar) {
        c();
        int d = bhVar.d();
        int e = bhVar.e();
        byte[] c2 = bhVar.c();
        this.f24249g += bhVar.a();
        this.f24252j.a(bhVar, bhVar.a());
        while (true) {
            int a2 = zf.a(c2, d, e, this.f24250h);
            if (a2 == e) {
                a(c2, d, e);
                return;
            }
            int b2 = zf.b(c2, a2);
            int i2 = a2 - d;
            if (i2 > 0) {
                a(c2, d, a2);
            }
            int i3 = e - a2;
            long j2 = this.f24249g - i3;
            a(j2, i3, i2 < 0 ? -i2 : 0, this.f24255m);
            a(j2, b2, this.f24255m);
            d = a2 + 3;
        }
    }

    @Override // com.applovin.impl.q7
    public void a(m8 m8Var, dp.d dVar) {
        dVar.a();
        this.f24251i = dVar.b();
        qo a2 = m8Var.a(dVar.c(), 2);
        this.f24252j = a2;
        this.f24253k = new b(a2, this.f24246b, this.f24247c);
        this.f24245a.a(m8Var, dVar);
    }

    private void a(long j2, int i2, int i3, long j3) {
        if (!this.f24254l || this.f24253k.a()) {
            this.d.a(i3);
            this.e.a(i3);
            if (!this.f24254l) {
                if (this.d.a() && this.e.a()) {
                    ArrayList arrayList = new ArrayList();
                    yf yfVar = this.d;
                    arrayList.add(Arrays.copyOf(yfVar.d, yfVar.e));
                    yf yfVar2 = this.e;
                    arrayList.add(Arrays.copyOf(yfVar2.d, yfVar2.e));
                    yf yfVar3 = this.d;
                    zf.b c2 = zf.c(yfVar3.d, 3, yfVar3.e);
                    yf yfVar4 = this.e;
                    zf.a b2 = zf.b(yfVar4.d, 3, yfVar4.e);
                    this.f24252j.a(new f9.b().c(this.f24251i).f("video/avc").a(o3.a(c2.f28336a, c2.f28337b, c2.f28338c)).q(c2.e).g(c2.f28339f).b(c2.f28340g).a(arrayList).a());
                    this.f24254l = true;
                    this.f24253k.a(c2);
                    this.f24253k.a(b2);
                    this.d.b();
                    this.e.b();
                }
            } else if (this.d.a()) {
                yf yfVar5 = this.d;
                this.f24253k.a(zf.c(yfVar5.d, 3, yfVar5.e));
                this.d.b();
            } else if (this.e.a()) {
                yf yfVar6 = this.e;
                this.f24253k.a(zf.b(yfVar6.d, 3, yfVar6.e));
                this.e.b();
            }
        }
        if (this.f24248f.a(i3)) {
            yf yfVar7 = this.f24248f;
            this.f24257o.a(this.f24248f.d, zf.c(yfVar7.d, yfVar7.e));
            this.f24257o.f(4);
            this.f24245a.a(j3, this.f24257o);
        }
        if (this.f24253k.a(j2, i2, this.f24254l, this.f24256n)) {
            this.f24256n = false;
        }
    }

    private void a(byte[] bArr, int i2, int i3) {
        if (!this.f24254l || this.f24253k.a()) {
            this.d.a(bArr, i2, i3);
            this.e.a(bArr, i2, i3);
        }
        this.f24248f.a(bArr, i2, i3);
        this.f24253k.a(bArr, i2, i3);
    }

    @Override // com.applovin.impl.q7
    public void a() {
        this.f24249g = 0L;
        this.f24256n = false;
        this.f24255m = -9223372036854775807L;
        zf.a(this.f24250h);
        this.d.b();
        this.e.b();
        this.f24248f.b();
        b bVar = this.f24253k;
        if (bVar != null) {
            bVar.b();
        }
    }

    private void a(long j2, int i2, long j3) {
        if (!this.f24254l || this.f24253k.a()) {
            this.d.b(i2);
            this.e.b(i2);
        }
        this.f24248f.b(i2);
        this.f24253k.a(j2, i2, j3);
    }
}
