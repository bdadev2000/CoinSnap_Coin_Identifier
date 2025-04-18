package com.applovin.impl;

import android.graphics.Bitmap;
import com.applovin.impl.b5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.zip.Inflater;

/* loaded from: classes.dex */
public final class jh extends ek {

    /* renamed from: o, reason: collision with root package name */
    private final bh f24682o;

    /* renamed from: p, reason: collision with root package name */
    private final bh f24683p;

    /* renamed from: q, reason: collision with root package name */
    private final a f24684q;

    /* renamed from: r, reason: collision with root package name */
    private Inflater f24685r;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final bh f24686a = new bh();

        /* renamed from: b, reason: collision with root package name */
        private final int[] f24687b = new int[256];

        /* renamed from: c, reason: collision with root package name */
        private boolean f24688c;
        private int d;
        private int e;

        /* renamed from: f, reason: collision with root package name */
        private int f24689f;

        /* renamed from: g, reason: collision with root package name */
        private int f24690g;

        /* renamed from: h, reason: collision with root package name */
        private int f24691h;

        /* renamed from: i, reason: collision with root package name */
        private int f24692i;

        /* JADX INFO: Access modifiers changed from: private */
        public void b(bh bhVar, int i2) {
            if (i2 < 19) {
                return;
            }
            this.d = bhVar.C();
            this.e = bhVar.C();
            bhVar.g(11);
            this.f24689f = bhVar.C();
            this.f24690g = bhVar.C();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c(bh bhVar, int i2) {
            if (i2 % 5 != 2) {
                return;
            }
            bhVar.g(2);
            Arrays.fill(this.f24687b, 0);
            int i3 = i2 / 5;
            for (int i4 = 0; i4 < i3; i4++) {
                int w = bhVar.w();
                int w2 = bhVar.w();
                int w3 = bhVar.w();
                int w4 = bhVar.w();
                double d = w2;
                double d2 = w3 - 128;
                double d3 = w4 - 128;
                this.f24687b[w] = (xp.a((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 0, 255) << 8) | (bhVar.w() << 24) | (xp.a((int) ((1.402d * d2) + d), 0, 255) << 16) | xp.a((int) ((d3 * 1.772d) + d), 0, 255);
            }
            this.f24688c = true;
        }

        public b5 a() {
            int i2;
            if (this.d == 0 || this.e == 0 || this.f24691h == 0 || this.f24692i == 0 || this.f24686a.e() == 0 || this.f24686a.d() != this.f24686a.e() || !this.f24688c) {
                return null;
            }
            this.f24686a.f(0);
            int i3 = this.f24691h * this.f24692i;
            int[] iArr = new int[i3];
            int i4 = 0;
            while (i4 < i3) {
                int w = this.f24686a.w();
                if (w != 0) {
                    i2 = i4 + 1;
                    iArr[i4] = this.f24687b[w];
                } else {
                    int w2 = this.f24686a.w();
                    if (w2 != 0) {
                        i2 = ((w2 & 64) == 0 ? w2 & 63 : ((w2 & 63) << 8) | this.f24686a.w()) + i4;
                        Arrays.fill(iArr, i4, i2, (w2 & 128) == 0 ? 0 : this.f24687b[this.f24686a.w()]);
                    }
                }
                i4 = i2;
            }
            return new b5.b().a(Bitmap.createBitmap(iArr, this.f24691h, this.f24692i, Bitmap.Config.ARGB_8888)).b(this.f24689f / this.d).b(0).a(this.f24690g / this.e, 0).a(0).d(this.f24691h / this.d).a(this.f24692i / this.e).a();
        }

        public void b() {
            this.d = 0;
            this.e = 0;
            this.f24689f = 0;
            this.f24690g = 0;
            this.f24691h = 0;
            this.f24692i = 0;
            this.f24686a.d(0);
            this.f24688c = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(bh bhVar, int i2) {
            int z2;
            if (i2 < 4) {
                return;
            }
            bhVar.g(3);
            int i3 = i2 - 4;
            if ((bhVar.w() & 128) != 0) {
                if (i3 < 7 || (z2 = bhVar.z()) < 4) {
                    return;
                }
                this.f24691h = bhVar.C();
                this.f24692i = bhVar.C();
                this.f24686a.d(z2 - 4);
                i3 = i2 - 11;
            }
            int d = this.f24686a.d();
            int e = this.f24686a.e();
            if (d >= e || i3 <= 0) {
                return;
            }
            int min = Math.min(i3, e - d);
            bhVar.a(this.f24686a.c(), d, min);
            this.f24686a.f(d + min);
        }
    }

    public jh() {
        super("PgsDecoder");
        this.f24682o = new bh();
        this.f24683p = new bh();
        this.f24684q = new a();
    }

    @Override // com.applovin.impl.ek
    public nl a(byte[] bArr, int i2, boolean z2) {
        this.f24682o.a(bArr, i2);
        a(this.f24682o);
        this.f24684q.b();
        ArrayList arrayList = new ArrayList();
        while (this.f24682o.a() >= 3) {
            b5 a2 = a(this.f24682o, this.f24684q);
            if (a2 != null) {
                arrayList.add(a2);
            }
        }
        return new kh(Collections.unmodifiableList(arrayList));
    }

    private void a(bh bhVar) {
        if (bhVar.a() <= 0 || bhVar.g() != 120) {
            return;
        }
        if (this.f24685r == null) {
            this.f24685r = new Inflater();
        }
        if (xp.a(bhVar, this.f24683p, this.f24685r)) {
            bhVar.a(this.f24683p.c(), this.f24683p.e());
        }
    }

    private static b5 a(bh bhVar, a aVar) {
        int e = bhVar.e();
        int w = bhVar.w();
        int C = bhVar.C();
        int d = bhVar.d() + C;
        b5 b5Var = null;
        if (d > e) {
            bhVar.f(e);
            return null;
        }
        if (w != 128) {
            switch (w) {
                case 20:
                    aVar.c(bhVar, C);
                    break;
                case 21:
                    aVar.a(bhVar, C);
                    break;
                case 22:
                    aVar.b(bhVar, C);
                    break;
            }
        } else {
            b5Var = aVar.a();
            aVar.b();
        }
        bhVar.f(d);
        return b5Var;
    }
}
