package com.applovin.impl;

import com.applovin.impl.dl;
import com.applovin.impl.y8;
import java.util.Arrays;
import kotlin.UByte;

/* loaded from: classes.dex */
final class w8 extends dl {

    /* renamed from: n, reason: collision with root package name */
    private y8 f8737n;

    /* renamed from: o, reason: collision with root package name */
    private a f8738o;

    private static boolean a(byte[] bArr) {
        return bArr[0] == -1;
    }

    private int b(yg ygVar) {
        int i10 = (ygVar.c()[2] & UByte.MAX_VALUE) >> 4;
        if (i10 == 6 || i10 == 7) {
            ygVar.g(4);
            ygVar.D();
        }
        int b3 = u8.b(ygVar, i10);
        ygVar.f(0);
        return b3;
    }

    public static boolean c(yg ygVar) {
        if (ygVar.a() >= 5 && ygVar.w() == 127 && ygVar.y() == 1179402563) {
            return true;
        }
        return false;
    }

    /* loaded from: classes.dex */
    public static final class a implements gg {
        private y8 a;

        /* renamed from: b, reason: collision with root package name */
        private y8.a f8739b;

        /* renamed from: c, reason: collision with root package name */
        private long f8740c = -1;

        /* renamed from: d, reason: collision with root package name */
        private long f8741d = -1;

        public a(y8 y8Var, y8.a aVar) {
            this.a = y8Var;
            this.f8739b = aVar;
        }

        @Override // com.applovin.impl.gg
        public ej a() {
            a1.b(this.f8740c != -1);
            return new x8(this.a, this.f8740c);
        }

        public void b(long j3) {
            this.f8740c = j3;
        }

        @Override // com.applovin.impl.gg
        public long a(j8 j8Var) {
            long j3 = this.f8741d;
            if (j3 < 0) {
                return -1L;
            }
            long j10 = -(j3 + 2);
            this.f8741d = -1L;
            return j10;
        }

        @Override // com.applovin.impl.gg
        public void a(long j3) {
            long[] jArr = this.f8739b.a;
            this.f8741d = jArr[yp.b(jArr, j3, true, true)];
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
    public boolean a(yg ygVar, long j3, dl.b bVar) {
        byte[] c10 = ygVar.c();
        y8 y8Var = this.f8737n;
        if (y8Var == null) {
            y8 y8Var2 = new y8(c10, 17);
            this.f8737n = y8Var2;
            bVar.a = y8Var2.a(Arrays.copyOfRange(c10, 9, ygVar.e()), (we) null);
            return true;
        }
        if ((c10[0] & Byte.MAX_VALUE) == 3) {
            y8.a a10 = v8.a(ygVar);
            y8 a11 = y8Var.a(a10);
            this.f8737n = a11;
            this.f8738o = new a(a11, a10);
            return true;
        }
        if (!a(c10)) {
            return true;
        }
        a aVar = this.f8738o;
        if (aVar != null) {
            aVar.b(j3);
            bVar.f4343b = this.f8738o;
        }
        a1.a(bVar.a);
        return false;
    }

    @Override // com.applovin.impl.dl
    public void a(boolean z10) {
        super.a(z10);
        if (z10) {
            this.f8737n = null;
            this.f8738o = null;
        }
    }
}
