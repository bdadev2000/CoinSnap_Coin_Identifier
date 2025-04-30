package com.applovin.impl;

import com.google.ar.core.ImageMetadata;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class z5 implements j8 {
    private final e5 b;

    /* renamed from: c, reason: collision with root package name */
    private final long f12534c;

    /* renamed from: d, reason: collision with root package name */
    private long f12535d;

    /* renamed from: f, reason: collision with root package name */
    private int f12537f;

    /* renamed from: g, reason: collision with root package name */
    private int f12538g;

    /* renamed from: e, reason: collision with root package name */
    private byte[] f12536e = new byte[65536];

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f12533a = new byte[4096];

    public z5(e5 e5Var, long j7, long j9) {
        this.b = e5Var;
        this.f12535d = j7;
        this.f12534c = j9;
    }

    private void d(int i9) {
        if (i9 != -1) {
            this.f12535d += i9;
        }
    }

    private void e(int i9) {
        int i10 = this.f12537f + i9;
        byte[] bArr = this.f12536e;
        if (i10 > bArr.length) {
            this.f12536e = Arrays.copyOf(this.f12536e, yp.a(bArr.length * 2, 65536 + i10, i10 + ImageMetadata.LENS_APERTURE));
        }
    }

    private void g(int i9) {
        byte[] bArr;
        int i10 = this.f12538g - i9;
        this.f12538g = i10;
        this.f12537f = 0;
        byte[] bArr2 = this.f12536e;
        if (i10 < bArr2.length - ImageMetadata.LENS_APERTURE) {
            bArr = new byte[65536 + i10];
        } else {
            bArr = bArr2;
        }
        System.arraycopy(bArr2, i9, bArr, 0, i10);
        this.f12536e = bArr;
    }

    @Override // com.applovin.impl.j8
    public boolean a(int i9, boolean z8) {
        e(i9);
        int i10 = this.f12538g - this.f12537f;
        while (i10 < i9) {
            i10 = a(this.f12536e, this.f12537f, i9, i10, z8);
            if (i10 == -1) {
                return false;
            }
            this.f12538g = this.f12537f + i10;
        }
        this.f12537f += i9;
        return true;
    }

    @Override // com.applovin.impl.j8
    public int b(byte[] bArr, int i9, int i10) {
        int min;
        e(i10);
        int i11 = this.f12538g;
        int i12 = this.f12537f;
        int i13 = i11 - i12;
        if (i13 == 0) {
            min = a(this.f12536e, i12, i10, 0, true);
            if (min == -1) {
                return -1;
            }
            this.f12538g += min;
        } else {
            min = Math.min(i10, i13);
        }
        System.arraycopy(this.f12536e, this.f12537f, bArr, i9, min);
        this.f12537f += min;
        return min;
    }

    @Override // com.applovin.impl.j8
    public void c(int i9) {
        a(i9, false);
    }

    @Override // com.applovin.impl.j8
    public long f() {
        return this.f12535d;
    }

    private int f(int i9) {
        int min = Math.min(this.f12538g, i9);
        g(min);
        return min;
    }

    @Override // com.applovin.impl.j8
    public void c(byte[] bArr, int i9, int i10) {
        b(bArr, i9, i10, false);
    }

    @Override // com.applovin.impl.j8
    public long d() {
        return this.f12535d + this.f12537f;
    }

    @Override // com.applovin.impl.j8
    public void d(byte[] bArr, int i9, int i10) {
        a(bArr, i9, i10, false);
    }

    private int e(byte[] bArr, int i9, int i10) {
        int i11 = this.f12538g;
        if (i11 == 0) {
            return 0;
        }
        int min = Math.min(i11, i10);
        System.arraycopy(this.f12536e, 0, bArr, i9, min);
        g(min);
        return min;
    }

    @Override // com.applovin.impl.j8
    public long a() {
        return this.f12534c;
    }

    @Override // com.applovin.impl.j8, com.applovin.impl.e5
    public int a(byte[] bArr, int i9, int i10) {
        int e4 = e(bArr, i9, i10);
        if (e4 == 0) {
            e4 = a(bArr, i9, i10, 0, true);
        }
        d(e4);
        return e4;
    }

    @Override // com.applovin.impl.j8
    public boolean b(byte[] bArr, int i9, int i10, boolean z8) {
        if (!a(i10, z8)) {
            return false;
        }
        System.arraycopy(this.f12536e, this.f12537f - i10, bArr, i9, i10);
        return true;
    }

    @Override // com.applovin.impl.j8
    public boolean a(byte[] bArr, int i9, int i10, boolean z8) {
        int e4 = e(bArr, i9, i10);
        while (e4 < i10 && e4 != -1) {
            e4 = a(bArr, i9, i10, e4, z8);
        }
        d(e4);
        return e4 != -1;
    }

    @Override // com.applovin.impl.j8
    public void b() {
        this.f12537f = 0;
    }

    @Override // com.applovin.impl.j8
    public int b(int i9) {
        int f9 = f(i9);
        if (f9 == 0) {
            byte[] bArr = this.f12533a;
            f9 = a(bArr, 0, Math.min(i9, bArr.length), 0, true);
        }
        d(f9);
        return f9;
    }

    @Override // com.applovin.impl.j8
    public void a(int i9) {
        b(i9, false);
    }

    private int a(byte[] bArr, int i9, int i10, int i11, boolean z8) {
        if (!Thread.interrupted()) {
            int a6 = this.b.a(bArr, i9 + i11, i10 - i11);
            if (a6 != -1) {
                return i11 + a6;
            }
            if (i11 == 0 && z8) {
                return -1;
            }
            throw new EOFException();
        }
        throw new InterruptedIOException();
    }

    public boolean b(int i9, boolean z8) {
        int f9 = f(i9);
        while (f9 < i9 && f9 != -1) {
            f9 = a(this.f12533a, -f9, Math.min(i9, this.f12533a.length + f9), f9, z8);
        }
        d(f9);
        return f9 != -1;
    }
}
