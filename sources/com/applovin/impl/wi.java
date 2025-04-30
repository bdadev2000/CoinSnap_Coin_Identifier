package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.impl.ro;
import com.applovin.impl.xi;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class wi {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC0727n0 f11984a;
    private final int b;

    /* renamed from: c, reason: collision with root package name */
    private final yg f11985c;

    /* renamed from: d, reason: collision with root package name */
    private a f11986d;

    /* renamed from: e, reason: collision with root package name */
    private a f11987e;

    /* renamed from: f, reason: collision with root package name */
    private a f11988f;

    /* renamed from: g, reason: collision with root package name */
    private long f11989g;

    public wi(InterfaceC0727n0 interfaceC0727n0) {
        this.f11984a = interfaceC0727n0;
        int c9 = interfaceC0727n0.c();
        this.b = c9;
        this.f11985c = new yg(32);
        a aVar = new a(0L, c9);
        this.f11986d = aVar;
        this.f11987e = aVar;
        this.f11988f = aVar;
    }

    private void a(a aVar) {
        if (aVar.f11991c) {
            a aVar2 = this.f11988f;
            int i9 = (((int) (aVar2.f11990a - aVar.f11990a)) / this.b) + (aVar2.f11991c ? 1 : 0);
            C0723m0[] c0723m0Arr = new C0723m0[i9];
            for (int i10 = 0; i10 < i9; i10++) {
                c0723m0Arr[i10] = aVar.f11992d;
                aVar = aVar.a();
            }
            this.f11984a.a(c0723m0Arr);
        }
    }

    private int b(int i9) {
        a aVar = this.f11988f;
        if (!aVar.f11991c) {
            aVar.a(this.f11984a.b(), new a(this.f11988f.b, this.b));
        }
        return Math.min(i9, (int) (this.f11988f.b - this.f11989g));
    }

    public void c() {
        this.f11987e = this.f11986d;
    }

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final long f11990a;
        public final long b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f11991c;

        /* renamed from: d, reason: collision with root package name */
        public C0723m0 f11992d;

        /* renamed from: e, reason: collision with root package name */
        public a f11993e;

        public a(long j7, int i9) {
            this.f11990a = j7;
            this.b = j7 + i9;
        }

        public a a() {
            this.f11992d = null;
            a aVar = this.f11993e;
            this.f11993e = null;
            return aVar;
        }

        public void a(C0723m0 c0723m0, a aVar) {
            this.f11992d = c0723m0;
            this.f11993e = aVar;
            this.f11991c = true;
        }

        public int a(long j7) {
            return ((int) (j7 - this.f11990a)) + this.f11992d.b;
        }
    }

    private static a b(a aVar, n5 n5Var, xi.b bVar, yg ygVar) {
        if (n5Var.h()) {
            aVar = a(aVar, n5Var, bVar, ygVar);
        }
        if (n5Var.c()) {
            ygVar.d(4);
            a a6 = a(aVar, bVar.b, ygVar.c(), 4);
            int A8 = ygVar.A();
            bVar.b += 4;
            bVar.f12264a -= 4;
            n5Var.g(A8);
            a a9 = a(a6, bVar.b, n5Var.f9273c, A8);
            bVar.b += A8;
            int i9 = bVar.f12264a - A8;
            bVar.f12264a = i9;
            n5Var.h(i9);
            return a(a9, bVar.b, n5Var.f9276g, bVar.f12264a);
        }
        n5Var.g(bVar.f12264a);
        return a(aVar, bVar.b, n5Var.f9273c, bVar.f12264a);
    }

    public void a(long j7) {
        a aVar;
        if (j7 == -1) {
            return;
        }
        while (true) {
            aVar = this.f11986d;
            if (j7 < aVar.b) {
                break;
            }
            this.f11984a.a(aVar.f11992d);
            this.f11986d = this.f11986d.a();
        }
        if (this.f11987e.f11990a < aVar.f11990a) {
            this.f11987e = aVar;
        }
    }

    private static a a(a aVar, long j7) {
        while (j7 >= aVar.b) {
            aVar = aVar.f11993e;
        }
        return aVar;
    }

    public long a() {
        return this.f11989g;
    }

    public void a(n5 n5Var, xi.b bVar) {
        b(this.f11987e, n5Var, bVar, this.f11985c);
    }

    private void a(int i9) {
        long j7 = this.f11989g + i9;
        this.f11989g = j7;
        a aVar = this.f11988f;
        if (j7 == aVar.b) {
            this.f11988f = aVar.f11993e;
        }
    }

    private static a a(a aVar, long j7, ByteBuffer byteBuffer, int i9) {
        a a6 = a(aVar, j7);
        while (i9 > 0) {
            int min = Math.min(i9, (int) (a6.b - j7));
            byteBuffer.put(a6.f11992d.f8887a, a6.a(j7), min);
            i9 -= min;
            j7 += min;
            if (j7 == a6.b) {
                a6 = a6.f11993e;
            }
        }
        return a6;
    }

    public void b(n5 n5Var, xi.b bVar) {
        this.f11987e = b(this.f11987e, n5Var, bVar, this.f11985c);
    }

    private static a a(a aVar, long j7, byte[] bArr, int i9) {
        a a6 = a(aVar, j7);
        int i10 = i9;
        while (i10 > 0) {
            int min = Math.min(i10, (int) (a6.b - j7));
            System.arraycopy(a6.f11992d.f8887a, a6.a(j7), bArr, i9 - i10, min);
            i10 -= min;
            j7 += min;
            if (j7 == a6.b) {
                a6 = a6.f11993e;
            }
        }
        return a6;
    }

    public void b() {
        a(this.f11986d);
        a aVar = new a(0L, this.b);
        this.f11986d = aVar;
        this.f11987e = aVar;
        this.f11988f = aVar;
        this.f11989g = 0L;
        this.f11984a.a();
    }

    private static a a(a aVar, n5 n5Var, xi.b bVar, yg ygVar) {
        long j7 = bVar.b;
        int i9 = 1;
        ygVar.d(1);
        a a6 = a(aVar, j7, ygVar.c(), 1);
        long j9 = j7 + 1;
        byte b = ygVar.c()[0];
        boolean z8 = (b & 128) != 0;
        int i10 = b & Ascii.DEL;
        y4 y4Var = n5Var.b;
        byte[] bArr = y4Var.f12325a;
        if (bArr == null) {
            y4Var.f12325a = new byte[16];
        } else {
            Arrays.fill(bArr, (byte) 0);
        }
        a a9 = a(a6, j9, y4Var.f12325a, i10);
        long j10 = j9 + i10;
        if (z8) {
            ygVar.d(2);
            a9 = a(a9, j10, ygVar.c(), 2);
            j10 += 2;
            i9 = ygVar.C();
        }
        int i11 = i9;
        int[] iArr = y4Var.f12327d;
        if (iArr == null || iArr.length < i11) {
            iArr = new int[i11];
        }
        int[] iArr2 = iArr;
        int[] iArr3 = y4Var.f12328e;
        if (iArr3 == null || iArr3.length < i11) {
            iArr3 = new int[i11];
        }
        int[] iArr4 = iArr3;
        if (z8) {
            int i12 = i11 * 6;
            ygVar.d(i12);
            a9 = a(a9, j10, ygVar.c(), i12);
            j10 += i12;
            ygVar.f(0);
            for (int i13 = 0; i13 < i11; i13++) {
                iArr2[i13] = ygVar.C();
                iArr4[i13] = ygVar.A();
            }
        } else {
            iArr2[0] = 0;
            iArr4[0] = bVar.f12264a - ((int) (j10 - bVar.b));
        }
        ro.a aVar2 = (ro.a) yp.a(bVar.f12265c);
        y4Var.a(i11, iArr2, iArr4, aVar2.b, y4Var.f12325a, aVar2.f10523a, aVar2.f10524c, aVar2.f10525d);
        long j11 = bVar.b;
        int i14 = (int) (j10 - j11);
        bVar.b = j11 + i14;
        bVar.f12264a -= i14;
        return a9;
    }

    public int a(e5 e5Var, int i9, boolean z8) {
        int b = b(i9);
        a aVar = this.f11988f;
        int a6 = e5Var.a(aVar.f11992d.f8887a, aVar.a(this.f11989g), b);
        if (a6 != -1) {
            a(a6);
            return a6;
        }
        if (z8) {
            return -1;
        }
        throw new EOFException();
    }

    public void a(yg ygVar, int i9) {
        while (i9 > 0) {
            int b = b(i9);
            a aVar = this.f11988f;
            ygVar.a(aVar.f11992d.f8887a, aVar.a(this.f11989g), b);
            i9 -= b;
            a(b);
        }
    }
}
