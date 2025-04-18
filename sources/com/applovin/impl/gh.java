package com.applovin.impl;

import android.graphics.Bitmap;
import androidx.core.app.NotificationCompat;
import com.applovin.impl.z4;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.zip.Inflater;

/* loaded from: classes.dex */
public final class gh extends bk {

    /* renamed from: o, reason: collision with root package name */
    private final yg f4930o;

    /* renamed from: p, reason: collision with root package name */
    private final yg f4931p;

    /* renamed from: q, reason: collision with root package name */
    private final a f4932q;

    /* renamed from: r, reason: collision with root package name */
    private Inflater f4933r;

    /* loaded from: classes.dex */
    public static final class a {
        private final yg a = new yg();

        /* renamed from: b, reason: collision with root package name */
        private final int[] f4934b = new int[NotificationCompat.FLAG_LOCAL_ONLY];

        /* renamed from: c, reason: collision with root package name */
        private boolean f4935c;

        /* renamed from: d, reason: collision with root package name */
        private int f4936d;

        /* renamed from: e, reason: collision with root package name */
        private int f4937e;

        /* renamed from: f, reason: collision with root package name */
        private int f4938f;

        /* renamed from: g, reason: collision with root package name */
        private int f4939g;

        /* renamed from: h, reason: collision with root package name */
        private int f4940h;

        /* renamed from: i, reason: collision with root package name */
        private int f4941i;

        /* JADX INFO: Access modifiers changed from: private */
        public void b(yg ygVar, int i10) {
            if (i10 < 19) {
                return;
            }
            this.f4936d = ygVar.C();
            this.f4937e = ygVar.C();
            ygVar.g(11);
            this.f4938f = ygVar.C();
            this.f4939g = ygVar.C();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c(yg ygVar, int i10) {
            if (i10 % 5 != 2) {
                return;
            }
            ygVar.g(2);
            Arrays.fill(this.f4934b, 0);
            int i11 = i10 / 5;
            for (int i12 = 0; i12 < i11; i12++) {
                int w10 = ygVar.w();
                int w11 = ygVar.w();
                int w12 = ygVar.w();
                int w13 = ygVar.w();
                double d10 = w11;
                double d11 = w12 - 128;
                double d12 = w13 - 128;
                this.f4934b[w10] = (yp.a((int) ((d10 - (0.34414d * d12)) - (d11 * 0.71414d)), 0, 255) << 8) | (ygVar.w() << 24) | (yp.a((int) ((1.402d * d11) + d10), 0, 255) << 16) | yp.a((int) ((d12 * 1.772d) + d10), 0, 255);
            }
            this.f4935c = true;
        }

        public z4 a() {
            int i10;
            if (this.f4936d == 0 || this.f4937e == 0 || this.f4940h == 0 || this.f4941i == 0 || this.a.e() == 0 || this.a.d() != this.a.e() || !this.f4935c) {
                return null;
            }
            this.a.f(0);
            int i11 = this.f4940h * this.f4941i;
            int[] iArr = new int[i11];
            int i12 = 0;
            while (i12 < i11) {
                int w10 = this.a.w();
                if (w10 != 0) {
                    i10 = i12 + 1;
                    iArr[i12] = this.f4934b[w10];
                } else {
                    int w11 = this.a.w();
                    if (w11 != 0) {
                        i10 = ((w11 & 64) == 0 ? w11 & 63 : ((w11 & 63) << 8) | this.a.w()) + i12;
                        Arrays.fill(iArr, i12, i10, (w11 & 128) == 0 ? 0 : this.f4934b[this.a.w()]);
                    }
                }
                i12 = i10;
            }
            return new z4.b().a(Bitmap.createBitmap(iArr, this.f4940h, this.f4941i, Bitmap.Config.ARGB_8888)).b(this.f4938f / this.f4936d).b(0).a(this.f4939g / this.f4937e, 0).a(0).d(this.f4940h / this.f4936d).a(this.f4941i / this.f4937e).a();
        }

        public void b() {
            this.f4936d = 0;
            this.f4937e = 0;
            this.f4938f = 0;
            this.f4939g = 0;
            this.f4940h = 0;
            this.f4941i = 0;
            this.a.d(0);
            this.f4935c = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(yg ygVar, int i10) {
            int z10;
            if (i10 < 4) {
                return;
            }
            ygVar.g(3);
            int i11 = i10 - 4;
            if ((ygVar.w() & 128) != 0) {
                if (i11 < 7 || (z10 = ygVar.z()) < 4) {
                    return;
                }
                this.f4940h = ygVar.C();
                this.f4941i = ygVar.C();
                this.a.d(z10 - 4);
                i11 = i10 - 11;
            }
            int d10 = this.a.d();
            int e2 = this.a.e();
            if (d10 >= e2 || i11 <= 0) {
                return;
            }
            int min = Math.min(i11, e2 - d10);
            ygVar.a(this.a.c(), d10, min);
            this.a.f(d10 + min);
        }
    }

    public gh() {
        super("PgsDecoder");
        this.f4930o = new yg();
        this.f4931p = new yg();
        this.f4932q = new a();
    }

    @Override // com.applovin.impl.bk
    public kl a(byte[] bArr, int i10, boolean z10) {
        this.f4930o.a(bArr, i10);
        a(this.f4930o);
        this.f4932q.b();
        ArrayList arrayList = new ArrayList();
        while (this.f4930o.a() >= 3) {
            z4 a10 = a(this.f4930o, this.f4932q);
            if (a10 != null) {
                arrayList.add(a10);
            }
        }
        return new hh(Collections.unmodifiableList(arrayList));
    }

    private void a(yg ygVar) {
        if (ygVar.a() <= 0 || ygVar.g() != 120) {
            return;
        }
        if (this.f4933r == null) {
            this.f4933r = new Inflater();
        }
        if (yp.a(ygVar, this.f4931p, this.f4933r)) {
            ygVar.a(this.f4931p.c(), this.f4931p.e());
        }
    }

    private static z4 a(yg ygVar, a aVar) {
        int e2 = ygVar.e();
        int w10 = ygVar.w();
        int C = ygVar.C();
        int d10 = ygVar.d() + C;
        z4 z4Var = null;
        if (d10 > e2) {
            ygVar.f(e2);
            return null;
        }
        if (w10 != 128) {
            switch (w10) {
                case 20:
                    aVar.c(ygVar, C);
                    break;
                case 21:
                    aVar.a(ygVar, C);
                    break;
                case 22:
                    aVar.b(ygVar, C);
                    break;
            }
        } else {
            z4Var = aVar.a();
            aVar.b();
        }
        ygVar.f(d10);
        return z4Var;
    }
}
