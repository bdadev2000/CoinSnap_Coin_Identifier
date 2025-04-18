package com.applovin.impl;

import com.applovin.impl.dp;
import com.applovin.impl.f9;
import com.google.common.primitives.UnsignedBytes;
import java.util.Collections;

/* loaded from: classes.dex */
public final class ia implements q7 {

    /* renamed from: a, reason: collision with root package name */
    private final nj f24436a;

    /* renamed from: b, reason: collision with root package name */
    private String f24437b;

    /* renamed from: c, reason: collision with root package name */
    private qo f24438c;
    private a d;
    private boolean e;

    /* renamed from: l, reason: collision with root package name */
    private long f24445l;

    /* renamed from: f, reason: collision with root package name */
    private final boolean[] f24439f = new boolean[3];

    /* renamed from: g, reason: collision with root package name */
    private final yf f24440g = new yf(32, 128);

    /* renamed from: h, reason: collision with root package name */
    private final yf f24441h = new yf(33, 128);

    /* renamed from: i, reason: collision with root package name */
    private final yf f24442i = new yf(34, 128);

    /* renamed from: j, reason: collision with root package name */
    private final yf f24443j = new yf(39, 128);

    /* renamed from: k, reason: collision with root package name */
    private final yf f24444k = new yf(40, 128);

    /* renamed from: m, reason: collision with root package name */
    private long f24446m = -9223372036854775807L;

    /* renamed from: n, reason: collision with root package name */
    private final bh f24447n = new bh();

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final qo f24448a;

        /* renamed from: b, reason: collision with root package name */
        private long f24449b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f24450c;
        private int d;
        private long e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f24451f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f24452g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f24453h;

        /* renamed from: i, reason: collision with root package name */
        private boolean f24454i;

        /* renamed from: j, reason: collision with root package name */
        private boolean f24455j;

        /* renamed from: k, reason: collision with root package name */
        private long f24456k;

        /* renamed from: l, reason: collision with root package name */
        private long f24457l;

        /* renamed from: m, reason: collision with root package name */
        private boolean f24458m;

        public a(qo qoVar) {
            this.f24448a = qoVar;
        }

        private static boolean b(int i2) {
            return i2 < 32 || i2 == 40;
        }

        private void c(int i2) {
            long j2 = this.f24457l;
            if (j2 == -9223372036854775807L) {
                return;
            }
            boolean z2 = this.f24458m;
            this.f24448a.a(j2, z2 ? 1 : 0, (int) (this.f24449b - this.f24456k), i2, null);
        }

        public void a() {
            this.f24451f = false;
            this.f24452g = false;
            this.f24453h = false;
            this.f24454i = false;
            this.f24455j = false;
        }

        private static boolean a(int i2) {
            return (32 <= i2 && i2 <= 35) || i2 == 39;
        }

        public void a(long j2, int i2, boolean z2) {
            if (this.f24455j && this.f24452g) {
                this.f24458m = this.f24450c;
                this.f24455j = false;
            } else if (this.f24453h || this.f24452g) {
                if (z2 && this.f24454i) {
                    c(i2 + ((int) (j2 - this.f24449b)));
                }
                this.f24456k = this.f24449b;
                this.f24457l = this.e;
                this.f24458m = this.f24450c;
                this.f24454i = true;
            }
        }

        public void a(byte[] bArr, int i2, int i3) {
            if (this.f24451f) {
                int i4 = this.d;
                int i5 = (i2 + 2) - i4;
                if (i5 >= i3) {
                    this.d = (i3 - i2) + i4;
                } else {
                    this.f24452g = (bArr[i5] & UnsignedBytes.MAX_POWER_OF_TWO) != 0;
                    this.f24451f = false;
                }
            }
        }

        public void a(long j2, int i2, int i3, long j3, boolean z2) {
            this.f24452g = false;
            this.f24453h = false;
            this.e = j3;
            this.d = 0;
            this.f24449b = j2;
            if (!b(i3)) {
                if (this.f24454i && !this.f24455j) {
                    if (z2) {
                        c(i2);
                    }
                    this.f24454i = false;
                }
                if (a(i3)) {
                    this.f24453h = !this.f24455j;
                    this.f24455j = true;
                }
            }
            boolean z3 = i3 >= 16 && i3 <= 21;
            this.f24450c = z3;
            this.f24451f = z3 || i3 <= 9;
        }
    }

    public ia(nj njVar) {
        this.f24436a = njVar;
    }

    private void c() {
        b1.b(this.f24438c);
        xp.a(this.d);
    }

    @Override // com.applovin.impl.q7
    public void a(long j2, int i2) {
        if (j2 != -9223372036854775807L) {
            this.f24446m = j2;
        }
    }

    @Override // com.applovin.impl.q7
    public void b() {
    }

    private static void b(ch chVar) {
        int f2 = chVar.f();
        boolean z2 = false;
        int i2 = 0;
        for (int i3 = 0; i3 < f2; i3++) {
            if (i3 != 0) {
                z2 = chVar.c();
            }
            if (z2) {
                chVar.g();
                chVar.f();
                for (int i4 = 0; i4 <= i2; i4++) {
                    if (chVar.c()) {
                        chVar.g();
                    }
                }
            } else {
                int f3 = chVar.f();
                int f4 = chVar.f();
                int i5 = f3 + f4;
                for (int i6 = 0; i6 < f3; i6++) {
                    chVar.f();
                    chVar.g();
                }
                for (int i7 = 0; i7 < f4; i7++) {
                    chVar.f();
                    chVar.g();
                }
                i2 = i5;
            }
        }
    }

    @Override // com.applovin.impl.q7
    public void a(bh bhVar) {
        c();
        while (bhVar.a() > 0) {
            int d = bhVar.d();
            int e = bhVar.e();
            byte[] c2 = bhVar.c();
            this.f24445l += bhVar.a();
            this.f24438c.a(bhVar, bhVar.a());
            while (d < e) {
                int a2 = zf.a(c2, d, e, this.f24439f);
                if (a2 == e) {
                    a(c2, d, e);
                    return;
                }
                int a3 = zf.a(c2, a2);
                int i2 = a2 - d;
                if (i2 > 0) {
                    a(c2, d, a2);
                }
                int i3 = e - a2;
                long j2 = this.f24445l - i3;
                a(j2, i3, i2 < 0 ? -i2 : 0, this.f24446m);
                b(j2, i3, a3, this.f24446m);
                d = a2 + 3;
            }
        }
    }

    private void b(long j2, int i2, int i3, long j3) {
        this.d.a(j2, i2, i3, j3, this.e);
        if (!this.e) {
            this.f24440g.b(i3);
            this.f24441h.b(i3);
            this.f24442i.b(i3);
        }
        this.f24443j.b(i3);
        this.f24444k.b(i3);
    }

    @Override // com.applovin.impl.q7
    public void a(m8 m8Var, dp.d dVar) {
        dVar.a();
        this.f24437b = dVar.b();
        qo a2 = m8Var.a(dVar.c(), 2);
        this.f24438c = a2;
        this.d = new a(a2);
        this.f24436a.a(m8Var, dVar);
    }

    private void a(long j2, int i2, int i3, long j3) {
        this.d.a(j2, i2, this.e);
        if (!this.e) {
            this.f24440g.a(i3);
            this.f24441h.a(i3);
            this.f24442i.a(i3);
            if (this.f24440g.a() && this.f24441h.a() && this.f24442i.a()) {
                this.f24438c.a(a(this.f24437b, this.f24440g, this.f24441h, this.f24442i));
                this.e = true;
            }
        }
        if (this.f24443j.a(i3)) {
            yf yfVar = this.f24443j;
            this.f24447n.a(this.f24443j.d, zf.c(yfVar.d, yfVar.e));
            this.f24447n.g(5);
            this.f24436a.a(j3, this.f24447n);
        }
        if (this.f24444k.a(i3)) {
            yf yfVar2 = this.f24444k;
            this.f24447n.a(this.f24444k.d, zf.c(yfVar2.d, yfVar2.e));
            this.f24447n.g(5);
            this.f24436a.a(j3, this.f24447n);
        }
    }

    private void a(byte[] bArr, int i2, int i3) {
        this.d.a(bArr, i2, i3);
        if (!this.e) {
            this.f24440g.a(bArr, i2, i3);
            this.f24441h.a(bArr, i2, i3);
            this.f24442i.a(bArr, i2, i3);
        }
        this.f24443j.a(bArr, i2, i3);
        this.f24444k.a(bArr, i2, i3);
    }

    private static f9 a(String str, yf yfVar, yf yfVar2, yf yfVar3) {
        int i2 = yfVar.e;
        byte[] bArr = new byte[yfVar2.e + i2 + yfVar3.e];
        System.arraycopy(yfVar.d, 0, bArr, 0, i2);
        System.arraycopy(yfVar2.d, 0, bArr, yfVar.e, yfVar2.e);
        System.arraycopy(yfVar3.d, 0, bArr, yfVar.e + yfVar2.e, yfVar3.e);
        ch chVar = new ch(yfVar2.d, 0, yfVar2.e);
        chVar.d(44);
        int b2 = chVar.b(3);
        chVar.g();
        chVar.d(88);
        chVar.d(8);
        int i3 = 0;
        for (int i4 = 0; i4 < b2; i4++) {
            if (chVar.c()) {
                i3 += 89;
            }
            if (chVar.c()) {
                i3 += 8;
            }
        }
        chVar.d(i3);
        if (b2 > 0) {
            chVar.d((8 - b2) * 2);
        }
        chVar.f();
        int f2 = chVar.f();
        if (f2 == 3) {
            chVar.g();
        }
        int f3 = chVar.f();
        int f4 = chVar.f();
        if (chVar.c()) {
            int f5 = chVar.f();
            int f6 = chVar.f();
            int f7 = chVar.f();
            int f8 = chVar.f();
            f3 -= (f5 + f6) * ((f2 == 1 || f2 == 2) ? 2 : 1);
            f4 -= (f7 + f8) * (f2 == 1 ? 2 : 1);
        }
        chVar.f();
        chVar.f();
        int f9 = chVar.f();
        for (int i5 = chVar.c() ? 0 : b2; i5 <= b2; i5++) {
            chVar.f();
            chVar.f();
            chVar.f();
        }
        chVar.f();
        chVar.f();
        chVar.f();
        chVar.f();
        chVar.f();
        chVar.f();
        if (chVar.c() && chVar.c()) {
            a(chVar);
        }
        chVar.d(2);
        if (chVar.c()) {
            chVar.d(8);
            chVar.f();
            chVar.f();
            chVar.g();
        }
        b(chVar);
        if (chVar.c()) {
            for (int i6 = 0; i6 < chVar.f(); i6++) {
                chVar.d(f9 + 5);
            }
        }
        chVar.d(2);
        float f10 = 1.0f;
        if (chVar.c()) {
            if (chVar.c()) {
                int b3 = chVar.b(8);
                if (b3 == 255) {
                    int b4 = chVar.b(16);
                    int b5 = chVar.b(16);
                    if (b4 != 0 && b5 != 0) {
                        f10 = b4 / b5;
                    }
                } else {
                    float[] fArr = zf.f28331b;
                    if (b3 < fArr.length) {
                        f10 = fArr[b3];
                    } else {
                        com.applovin.impl.adview.t.u("Unexpected aspect_ratio_idc value: ", b3, "H265Reader");
                    }
                }
            }
            if (chVar.c()) {
                chVar.g();
            }
            if (chVar.c()) {
                chVar.d(4);
                if (chVar.c()) {
                    chVar.d(24);
                }
            }
            if (chVar.c()) {
                chVar.f();
                chVar.f();
            }
            chVar.g();
            if (chVar.c()) {
                f4 *= 2;
            }
        }
        chVar.a(yfVar2.d, 0, yfVar2.e);
        chVar.d(24);
        return new f9.b().c(str).f("video/hevc").a(o3.a(chVar)).q(f3).g(f4).b(f10).a(Collections.singletonList(bArr)).a();
    }

    @Override // com.applovin.impl.q7
    public void a() {
        this.f24445l = 0L;
        this.f24446m = -9223372036854775807L;
        zf.a(this.f24439f);
        this.f24440g.b();
        this.f24441h.b();
        this.f24442i.b();
        this.f24443j.b();
        this.f24444k.b();
        a aVar = this.d;
        if (aVar != null) {
            aVar.a();
        }
    }

    private static void a(ch chVar) {
        for (int i2 = 0; i2 < 4; i2++) {
            int i3 = 0;
            while (i3 < 6) {
                int i4 = 1;
                if (!chVar.c()) {
                    chVar.f();
                } else {
                    int min = Math.min(64, 1 << ((i2 << 1) + 4));
                    if (i2 > 1) {
                        chVar.e();
                    }
                    for (int i5 = 0; i5 < min; i5++) {
                        chVar.e();
                    }
                }
                if (i2 == 3) {
                    i4 = 3;
                }
                i3 += i4;
            }
        }
    }
}
