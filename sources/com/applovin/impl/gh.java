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
    private final yg f7904o;

    /* renamed from: p, reason: collision with root package name */
    private final yg f7905p;

    /* renamed from: q, reason: collision with root package name */
    private final a f7906q;

    /* renamed from: r, reason: collision with root package name */
    private Inflater f7907r;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final yg f7908a = new yg();
        private final int[] b = new int[NotificationCompat.FLAG_LOCAL_ONLY];

        /* renamed from: c, reason: collision with root package name */
        private boolean f7909c;

        /* renamed from: d, reason: collision with root package name */
        private int f7910d;

        /* renamed from: e, reason: collision with root package name */
        private int f7911e;

        /* renamed from: f, reason: collision with root package name */
        private int f7912f;

        /* renamed from: g, reason: collision with root package name */
        private int f7913g;

        /* renamed from: h, reason: collision with root package name */
        private int f7914h;

        /* renamed from: i, reason: collision with root package name */
        private int f7915i;

        /* JADX INFO: Access modifiers changed from: private */
        public void b(yg ygVar, int i9) {
            if (i9 < 19) {
                return;
            }
            this.f7910d = ygVar.C();
            this.f7911e = ygVar.C();
            ygVar.g(11);
            this.f7912f = ygVar.C();
            this.f7913g = ygVar.C();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c(yg ygVar, int i9) {
            if (i9 % 5 != 2) {
                return;
            }
            ygVar.g(2);
            Arrays.fill(this.b, 0);
            int i10 = i9 / 5;
            for (int i11 = 0; i11 < i10; i11++) {
                int w2 = ygVar.w();
                int w9 = ygVar.w();
                int w10 = ygVar.w();
                int w11 = ygVar.w();
                double d2 = w9;
                double d9 = w10 - 128;
                double d10 = w11 - 128;
                this.b[w2] = (yp.a((int) ((d2 - (0.34414d * d10)) - (d9 * 0.71414d)), 0, 255) << 8) | (ygVar.w() << 24) | (yp.a((int) ((1.402d * d9) + d2), 0, 255) << 16) | yp.a((int) ((d10 * 1.772d) + d2), 0, 255);
            }
            this.f7909c = true;
        }

        public z4 a() {
            int i9;
            if (this.f7910d == 0 || this.f7911e == 0 || this.f7914h == 0 || this.f7915i == 0 || this.f7908a.e() == 0 || this.f7908a.d() != this.f7908a.e() || !this.f7909c) {
                return null;
            }
            this.f7908a.f(0);
            int i10 = this.f7914h * this.f7915i;
            int[] iArr = new int[i10];
            int i11 = 0;
            while (i11 < i10) {
                int w2 = this.f7908a.w();
                if (w2 != 0) {
                    i9 = i11 + 1;
                    iArr[i11] = this.b[w2];
                } else {
                    int w9 = this.f7908a.w();
                    if (w9 != 0) {
                        i9 = ((w9 & 64) == 0 ? w9 & 63 : ((w9 & 63) << 8) | this.f7908a.w()) + i11;
                        Arrays.fill(iArr, i11, i9, (w9 & 128) == 0 ? 0 : this.b[this.f7908a.w()]);
                    }
                }
                i11 = i9;
            }
            return new z4.b().a(Bitmap.createBitmap(iArr, this.f7914h, this.f7915i, Bitmap.Config.ARGB_8888)).b(this.f7912f / this.f7910d).b(0).a(this.f7913g / this.f7911e, 0).a(0).d(this.f7914h / this.f7910d).a(this.f7915i / this.f7911e).a();
        }

        public void b() {
            this.f7910d = 0;
            this.f7911e = 0;
            this.f7912f = 0;
            this.f7913g = 0;
            this.f7914h = 0;
            this.f7915i = 0;
            this.f7908a.d(0);
            this.f7909c = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(yg ygVar, int i9) {
            int z8;
            if (i9 < 4) {
                return;
            }
            ygVar.g(3);
            int i10 = i9 - 4;
            if ((ygVar.w() & 128) != 0) {
                if (i10 < 7 || (z8 = ygVar.z()) < 4) {
                    return;
                }
                this.f7914h = ygVar.C();
                this.f7915i = ygVar.C();
                this.f7908a.d(z8 - 4);
                i10 = i9 - 11;
            }
            int d2 = this.f7908a.d();
            int e4 = this.f7908a.e();
            if (d2 >= e4 || i10 <= 0) {
                return;
            }
            int min = Math.min(i10, e4 - d2);
            ygVar.a(this.f7908a.c(), d2, min);
            this.f7908a.f(d2 + min);
        }
    }

    public gh() {
        super("PgsDecoder");
        this.f7904o = new yg();
        this.f7905p = new yg();
        this.f7906q = new a();
    }

    @Override // com.applovin.impl.bk
    public kl a(byte[] bArr, int i9, boolean z8) {
        this.f7904o.a(bArr, i9);
        a(this.f7904o);
        this.f7906q.b();
        ArrayList arrayList = new ArrayList();
        while (this.f7904o.a() >= 3) {
            z4 a6 = a(this.f7904o, this.f7906q);
            if (a6 != null) {
                arrayList.add(a6);
            }
        }
        return new hh(Collections.unmodifiableList(arrayList));
    }

    private void a(yg ygVar) {
        if (ygVar.a() <= 0 || ygVar.g() != 120) {
            return;
        }
        if (this.f7907r == null) {
            this.f7907r = new Inflater();
        }
        if (yp.a(ygVar, this.f7905p, this.f7907r)) {
            ygVar.a(this.f7905p.c(), this.f7905p.e());
        }
    }

    private static z4 a(yg ygVar, a aVar) {
        int e4 = ygVar.e();
        int w2 = ygVar.w();
        int C8 = ygVar.C();
        int d2 = ygVar.d() + C8;
        z4 z4Var = null;
        if (d2 > e4) {
            ygVar.f(e4);
            return null;
        }
        if (w2 != 128) {
            switch (w2) {
                case 20:
                    aVar.c(ygVar, C8);
                    break;
                case 21:
                    aVar.a(ygVar, C8);
                    break;
                case 22:
                    aVar.b(ygVar, C8);
                    break;
            }
        } else {
            z4Var = aVar.a();
            aVar.b();
        }
        ygVar.f(d2);
        return z4Var;
    }
}
