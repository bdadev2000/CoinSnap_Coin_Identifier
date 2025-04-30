package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.impl.dl;
import com.applovin.impl.y8;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class w8 extends dl {

    /* renamed from: n, reason: collision with root package name */
    private y8 f11950n;

    /* renamed from: o, reason: collision with root package name */
    private a f11951o;

    private static boolean a(byte[] bArr) {
        return bArr[0] == -1;
    }

    private int b(yg ygVar) {
        int i9 = (ygVar.c()[2] & 255) >> 4;
        if (i9 == 6 || i9 == 7) {
            ygVar.g(4);
            ygVar.D();
        }
        int b = u8.b(ygVar, i9);
        ygVar.f(0);
        return b;
    }

    public static boolean c(yg ygVar) {
        if (ygVar.a() >= 5 && ygVar.w() == 127 && ygVar.y() == 1179402563) {
            return true;
        }
        return false;
    }

    /* loaded from: classes.dex */
    public static final class a implements gg {

        /* renamed from: a, reason: collision with root package name */
        private y8 f11952a;
        private y8.a b;

        /* renamed from: c, reason: collision with root package name */
        private long f11953c = -1;

        /* renamed from: d, reason: collision with root package name */
        private long f11954d = -1;

        public a(y8 y8Var, y8.a aVar) {
            this.f11952a = y8Var;
            this.b = aVar;
        }

        @Override // com.applovin.impl.gg
        public ej a() {
            AbstractC0669a1.b(this.f11953c != -1);
            return new x8(this.f11952a, this.f11953c);
        }

        public void b(long j7) {
            this.f11953c = j7;
        }

        @Override // com.applovin.impl.gg
        public long a(j8 j8Var) {
            long j7 = this.f11954d;
            if (j7 < 0) {
                return -1L;
            }
            long j9 = -(j7 + 2);
            this.f11954d = -1L;
            return j9;
        }

        @Override // com.applovin.impl.gg
        public void a(long j7) {
            long[] jArr = this.b.f12362a;
            this.f11954d = jArr[yp.b(jArr, j7, true, true)];
        }
    }

    @Override // com.applovin.impl.dl
    public long a(yg ygVar) {
        if (a(ygVar.c())) {
            return b(ygVar);
        }
        return -1L;
    }

    @Override // com.applovin.impl.dl
    public boolean a(yg ygVar, long j7, dl.b bVar) {
        byte[] c9 = ygVar.c();
        y8 y8Var = this.f11950n;
        if (y8Var == null) {
            y8 y8Var2 = new y8(c9, 17);
            this.f11950n = y8Var2;
            bVar.f7333a = y8Var2.a(Arrays.copyOfRange(c9, 9, ygVar.e()), (we) null);
            return true;
        }
        if ((c9[0] & Ascii.DEL) == 3) {
            y8.a a6 = v8.a(ygVar);
            y8 a9 = y8Var.a(a6);
            this.f11950n = a9;
            this.f11951o = new a(a9, a6);
            return true;
        }
        if (!a(c9)) {
            return true;
        }
        a aVar = this.f11951o;
        if (aVar != null) {
            aVar.b(j7);
            bVar.b = this.f11951o;
        }
        AbstractC0669a1.a(bVar.f7333a);
        return false;
    }

    @Override // com.applovin.impl.dl
    public void a(boolean z8) {
        super.a(z8);
        if (z8) {
            this.f11950n = null;
            this.f11951o = null;
        }
    }
}
