package com.applovin.impl;

import com.applovin.impl.d9;
import com.applovin.impl.ep;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Collections;
import kotlin.jvm.internal.ByteCompanionObject;

/* loaded from: classes.dex */
public final class ga implements o7 {
    private final jj a;

    /* renamed from: b, reason: collision with root package name */
    private String f4856b;

    /* renamed from: c, reason: collision with root package name */
    private ro f4857c;

    /* renamed from: d, reason: collision with root package name */
    private a f4858d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f4859e;

    /* renamed from: l, reason: collision with root package name */
    private long f4866l;

    /* renamed from: f, reason: collision with root package name */
    private final boolean[] f4860f = new boolean[3];

    /* renamed from: g, reason: collision with root package name */
    private final tf f4861g = new tf(32, 128);

    /* renamed from: h, reason: collision with root package name */
    private final tf f4862h = new tf(33, 128);

    /* renamed from: i, reason: collision with root package name */
    private final tf f4863i = new tf(34, 128);

    /* renamed from: j, reason: collision with root package name */
    private final tf f4864j = new tf(39, 128);

    /* renamed from: k, reason: collision with root package name */
    private final tf f4865k = new tf(40, 128);

    /* renamed from: m, reason: collision with root package name */
    private long f4867m = C.TIME_UNSET;

    /* renamed from: n, reason: collision with root package name */
    private final yg f4868n = new yg();

    /* loaded from: classes.dex */
    public static final class a {
        private final ro a;

        /* renamed from: b, reason: collision with root package name */
        private long f4869b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f4870c;

        /* renamed from: d, reason: collision with root package name */
        private int f4871d;

        /* renamed from: e, reason: collision with root package name */
        private long f4872e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f4873f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f4874g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f4875h;

        /* renamed from: i, reason: collision with root package name */
        private boolean f4876i;

        /* renamed from: j, reason: collision with root package name */
        private boolean f4877j;

        /* renamed from: k, reason: collision with root package name */
        private long f4878k;

        /* renamed from: l, reason: collision with root package name */
        private long f4879l;

        /* renamed from: m, reason: collision with root package name */
        private boolean f4880m;

        public a(ro roVar) {
            this.a = roVar;
        }

        private static boolean a(int i10) {
            return (32 <= i10 && i10 <= 35) || i10 == 39;
        }

        private static boolean b(int i10) {
            return i10 < 32 || i10 == 40;
        }

        private void c(int i10) {
            long j3 = this.f4879l;
            if (j3 == C.TIME_UNSET) {
                return;
            }
            boolean z10 = this.f4880m;
            this.a.a(j3, z10 ? 1 : 0, (int) (this.f4869b - this.f4878k), i10, null);
        }

        public void a(long j3, int i10, boolean z10) {
            if (this.f4877j && this.f4874g) {
                this.f4880m = this.f4870c;
                this.f4877j = false;
            } else if (this.f4875h || this.f4874g) {
                if (z10 && this.f4876i) {
                    c(i10 + ((int) (j3 - this.f4869b)));
                }
                this.f4878k = this.f4869b;
                this.f4879l = this.f4872e;
                this.f4880m = this.f4870c;
                this.f4876i = true;
            }
        }

        public void a(byte[] bArr, int i10, int i11) {
            if (this.f4873f) {
                int i12 = this.f4871d;
                int i13 = (i10 + 2) - i12;
                if (i13 < i11) {
                    this.f4874g = (bArr[i13] & ByteCompanionObject.MIN_VALUE) != 0;
                    this.f4873f = false;
                } else {
                    this.f4871d = (i11 - i10) + i12;
                }
            }
        }

        public void a() {
            this.f4873f = false;
            this.f4874g = false;
            this.f4875h = false;
            this.f4876i = false;
            this.f4877j = false;
        }

        public void a(long j3, int i10, int i11, long j10, boolean z10) {
            this.f4874g = false;
            this.f4875h = false;
            this.f4872e = j10;
            this.f4871d = 0;
            this.f4869b = j3;
            if (!b(i11)) {
                if (this.f4876i && !this.f4877j) {
                    if (z10) {
                        c(i10);
                    }
                    this.f4876i = false;
                }
                if (a(i11)) {
                    this.f4875h = !this.f4877j;
                    this.f4877j = true;
                }
            }
            boolean z11 = i11 >= 16 && i11 <= 21;
            this.f4870c = z11;
            this.f4873f = z11 || i11 <= 9;
        }
    }

    public ga(jj jjVar) {
        this.a = jjVar;
    }

    private void c() {
        a1.b(this.f4857c);
        yp.a(this.f4858d);
    }

    @Override // com.applovin.impl.o7
    public void a(yg ygVar) {
        c();
        while (ygVar.a() > 0) {
            int d10 = ygVar.d();
            int e2 = ygVar.e();
            byte[] c10 = ygVar.c();
            this.f4866l += ygVar.a();
            this.f4857c.a(ygVar, ygVar.a());
            while (d10 < e2) {
                int a10 = uf.a(c10, d10, e2, this.f4860f);
                if (a10 == e2) {
                    a(c10, d10, e2);
                    return;
                }
                int a11 = uf.a(c10, a10);
                int i10 = a10 - d10;
                if (i10 > 0) {
                    a(c10, d10, a10);
                }
                int i11 = e2 - a10;
                long j3 = this.f4866l - i11;
                a(j3, i11, i10 < 0 ? -i10 : 0, this.f4867m);
                b(j3, i11, a11, this.f4867m);
                d10 = a10 + 3;
            }
        }
    }

    @Override // com.applovin.impl.o7
    public void b() {
    }

    private static void b(zg zgVar) {
        int f10 = zgVar.f();
        boolean z10 = false;
        int i10 = 0;
        for (int i11 = 0; i11 < f10; i11++) {
            if (i11 != 0) {
                z10 = zgVar.c();
            }
            if (z10) {
                zgVar.g();
                zgVar.f();
                for (int i12 = 0; i12 <= i10; i12++) {
                    if (zgVar.c()) {
                        zgVar.g();
                    }
                }
            } else {
                int f11 = zgVar.f();
                int f12 = zgVar.f();
                int i13 = f11 + f12;
                for (int i14 = 0; i14 < f11; i14++) {
                    zgVar.f();
                    zgVar.g();
                }
                for (int i15 = 0; i15 < f12; i15++) {
                    zgVar.f();
                    zgVar.g();
                }
                i10 = i13;
            }
        }
    }

    private void b(long j3, int i10, int i11, long j10) {
        this.f4858d.a(j3, i10, i11, j10, this.f4859e);
        if (!this.f4859e) {
            this.f4861g.b(i11);
            this.f4862h.b(i11);
            this.f4863i.b(i11);
        }
        this.f4864j.b(i11);
        this.f4865k.b(i11);
    }

    @Override // com.applovin.impl.o7
    public void a(k8 k8Var, ep.d dVar) {
        dVar.a();
        this.f4856b = dVar.b();
        ro a10 = k8Var.a(dVar.c(), 2);
        this.f4857c = a10;
        this.f4858d = new a(a10);
        this.a.a(k8Var, dVar);
    }

    private void a(long j3, int i10, int i11, long j10) {
        this.f4858d.a(j3, i10, this.f4859e);
        if (!this.f4859e) {
            this.f4861g.a(i11);
            this.f4862h.a(i11);
            this.f4863i.a(i11);
            if (this.f4861g.a() && this.f4862h.a() && this.f4863i.a()) {
                this.f4857c.a(a(this.f4856b, this.f4861g, this.f4862h, this.f4863i));
                this.f4859e = true;
            }
        }
        if (this.f4864j.a(i11)) {
            tf tfVar = this.f4864j;
            this.f4868n.a(this.f4864j.f8269d, uf.c(tfVar.f8269d, tfVar.f8270e));
            this.f4868n.g(5);
            this.a.a(j10, this.f4868n);
        }
        if (this.f4865k.a(i11)) {
            tf tfVar2 = this.f4865k;
            this.f4868n.a(this.f4865k.f8269d, uf.c(tfVar2.f8269d, tfVar2.f8270e));
            this.f4868n.g(5);
            this.a.a(j10, this.f4868n);
        }
    }

    private void a(byte[] bArr, int i10, int i11) {
        this.f4858d.a(bArr, i10, i11);
        if (!this.f4859e) {
            this.f4861g.a(bArr, i10, i11);
            this.f4862h.a(bArr, i10, i11);
            this.f4863i.a(bArr, i10, i11);
        }
        this.f4864j.a(bArr, i10, i11);
        this.f4865k.a(bArr, i10, i11);
    }

    @Override // com.applovin.impl.o7
    public void a(long j3, int i10) {
        if (j3 != C.TIME_UNSET) {
            this.f4867m = j3;
        }
    }

    private static d9 a(String str, tf tfVar, tf tfVar2, tf tfVar3) {
        int i10 = tfVar.f8270e;
        byte[] bArr = new byte[tfVar2.f8270e + i10 + tfVar3.f8270e];
        System.arraycopy(tfVar.f8269d, 0, bArr, 0, i10);
        System.arraycopy(tfVar2.f8269d, 0, bArr, tfVar.f8270e, tfVar2.f8270e);
        System.arraycopy(tfVar3.f8269d, 0, bArr, tfVar.f8270e + tfVar2.f8270e, tfVar3.f8270e);
        zg zgVar = new zg(tfVar2.f8269d, 0, tfVar2.f8270e);
        zgVar.d(44);
        int b3 = zgVar.b(3);
        zgVar.g();
        zgVar.d(88);
        zgVar.d(8);
        int i11 = 0;
        for (int i12 = 0; i12 < b3; i12++) {
            if (zgVar.c()) {
                i11 += 89;
            }
            if (zgVar.c()) {
                i11 += 8;
            }
        }
        zgVar.d(i11);
        if (b3 > 0) {
            zgVar.d((8 - b3) * 2);
        }
        zgVar.f();
        int f10 = zgVar.f();
        if (f10 == 3) {
            zgVar.g();
        }
        int f11 = zgVar.f();
        int f12 = zgVar.f();
        if (zgVar.c()) {
            int f13 = zgVar.f();
            int f14 = zgVar.f();
            int f15 = zgVar.f();
            int f16 = zgVar.f();
            f11 -= (f13 + f14) * ((f10 == 1 || f10 == 2) ? 2 : 1);
            f12 -= (f15 + f16) * (f10 == 1 ? 2 : 1);
        }
        zgVar.f();
        zgVar.f();
        int f17 = zgVar.f();
        for (int i13 = zgVar.c() ? 0 : b3; i13 <= b3; i13++) {
            zgVar.f();
            zgVar.f();
            zgVar.f();
        }
        zgVar.f();
        zgVar.f();
        zgVar.f();
        zgVar.f();
        zgVar.f();
        zgVar.f();
        if (zgVar.c() && zgVar.c()) {
            a(zgVar);
        }
        zgVar.d(2);
        if (zgVar.c()) {
            zgVar.d(8);
            zgVar.f();
            zgVar.f();
            zgVar.g();
        }
        b(zgVar);
        if (zgVar.c()) {
            for (int i14 = 0; i14 < zgVar.f(); i14++) {
                zgVar.d(f17 + 5);
            }
        }
        zgVar.d(2);
        float f18 = 1.0f;
        if (zgVar.c()) {
            if (zgVar.c()) {
                int b10 = zgVar.b(8);
                if (b10 == 255) {
                    int b11 = zgVar.b(16);
                    int b12 = zgVar.b(16);
                    if (b11 != 0 && b12 != 0) {
                        f18 = b11 / b12;
                    }
                } else {
                    float[] fArr = uf.f8375b;
                    if (b10 < fArr.length) {
                        f18 = fArr[b10];
                    } else {
                        a4.j.u("Unexpected aspect_ratio_idc value: ", b10, "H265Reader");
                    }
                }
            }
            if (zgVar.c()) {
                zgVar.g();
            }
            if (zgVar.c()) {
                zgVar.d(4);
                if (zgVar.c()) {
                    zgVar.d(24);
                }
            }
            if (zgVar.c()) {
                zgVar.f();
                zgVar.f();
            }
            zgVar.g();
            if (zgVar.c()) {
                f12 *= 2;
            }
        }
        zgVar.a(tfVar2.f8269d, 0, tfVar2.f8270e);
        zgVar.d(24);
        return new d9.b().c(str).f(MimeTypes.VIDEO_H265).a(m3.a(zgVar)).q(f11).g(f12).b(f18).a(Collections.singletonList(bArr)).a();
    }

    @Override // com.applovin.impl.o7
    public void a() {
        this.f4866l = 0L;
        this.f4867m = C.TIME_UNSET;
        uf.a(this.f4860f);
        this.f4861g.b();
        this.f4862h.b();
        this.f4863i.b();
        this.f4864j.b();
        this.f4865k.b();
        a aVar = this.f4858d;
        if (aVar != null) {
            aVar.a();
        }
    }

    private static void a(zg zgVar) {
        for (int i10 = 0; i10 < 4; i10++) {
            int i11 = 0;
            while (i11 < 6) {
                int i12 = 1;
                if (!zgVar.c()) {
                    zgVar.f();
                } else {
                    int min = Math.min(64, 1 << ((i10 << 1) + 4));
                    if (i10 > 1) {
                        zgVar.e();
                    }
                    for (int i13 = 0; i13 < min; i13++) {
                        zgVar.e();
                    }
                }
                if (i10 == 3) {
                    i12 = 3;
                }
                i11 += i12;
            }
        }
    }
}
