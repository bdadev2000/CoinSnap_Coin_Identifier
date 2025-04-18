package com.applovin.impl;

import com.applovin.impl.a9;
import com.applovin.impl.gl;
import com.google.common.primitives.UnsignedBytes;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class y8 extends gl {

    /* renamed from: n, reason: collision with root package name */
    private a9 f28120n;

    /* renamed from: o, reason: collision with root package name */
    private a f28121o;

    /* loaded from: classes2.dex */
    public static final class a implements kg {

        /* renamed from: a, reason: collision with root package name */
        private a9 f28122a;

        /* renamed from: b, reason: collision with root package name */
        private a9.a f28123b;

        /* renamed from: c, reason: collision with root package name */
        private long f28124c = -1;
        private long d = -1;

        public a(a9 a9Var, a9.a aVar) {
            this.f28122a = a9Var;
            this.f28123b = aVar;
        }

        @Override // com.applovin.impl.kg
        public long a(l8 l8Var) {
            long j2 = this.d;
            if (j2 < 0) {
                return -1L;
            }
            long j3 = -(j2 + 2);
            this.d = -1L;
            return j3;
        }

        public void b(long j2) {
            this.f28124c = j2;
        }

        @Override // com.applovin.impl.kg
        public ij a() {
            b1.b(this.f28124c != -1);
            return new z8(this.f28122a, this.f28124c);
        }

        @Override // com.applovin.impl.kg
        public void a(long j2) {
            long[] jArr = this.f28123b.f22721a;
            this.d = jArr[xp.b(jArr, j2, true, true)];
        }
    }

    private static boolean a(byte[] bArr) {
        return bArr[0] == -1;
    }

    private int b(bh bhVar) {
        int i2 = (bhVar.c()[2] & UnsignedBytes.MAX_VALUE) >> 4;
        if (i2 == 6 || i2 == 7) {
            bhVar.g(4);
            bhVar.D();
        }
        int b2 = w8.b(bhVar, i2);
        bhVar.f(0);
        return b2;
    }

    public static boolean c(bh bhVar) {
        return bhVar.a() >= 5 && bhVar.w() == 127 && bhVar.y() == 1179402563;
    }

    @Override // com.applovin.impl.gl
    public long a(bh bhVar) {
        if (a(bhVar.c())) {
            return b(bhVar);
        }
        return -1L;
    }

    @Override // com.applovin.impl.gl
    public boolean a(bh bhVar, long j2, gl.b bVar) {
        byte[] c2 = bhVar.c();
        a9 a9Var = this.f28120n;
        if (a9Var == null) {
            a9 a9Var2 = new a9(c2, 17);
            this.f28120n = a9Var2;
            bVar.f24135a = a9Var2.a(Arrays.copyOfRange(c2, 9, bhVar.e()), (bf) null);
            return true;
        }
        if ((c2[0] & Byte.MAX_VALUE) == 3) {
            a9.a a2 = x8.a(bhVar);
            a9 a3 = a9Var.a(a2);
            this.f28120n = a3;
            this.f28121o = new a(a3, a2);
            return true;
        }
        if (!a(c2)) {
            return true;
        }
        a aVar = this.f28121o;
        if (aVar != null) {
            aVar.b(j2);
            bVar.f24136b = this.f28121o;
        }
        b1.a(bVar.f24135a);
        return false;
    }

    @Override // com.applovin.impl.gl
    public void a(boolean z2) {
        super.a(z2);
        if (z2) {
            this.f28120n = null;
            this.f28121o = null;
        }
    }
}
