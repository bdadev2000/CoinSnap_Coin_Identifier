package com.applovin.impl;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class z5 implements j8 {

    /* renamed from: b, reason: collision with root package name */
    private final e5 f9353b;

    /* renamed from: c, reason: collision with root package name */
    private final long f9354c;

    /* renamed from: d, reason: collision with root package name */
    private long f9355d;

    /* renamed from: f, reason: collision with root package name */
    private int f9357f;

    /* renamed from: g, reason: collision with root package name */
    private int f9358g;

    /* renamed from: e, reason: collision with root package name */
    private byte[] f9356e = new byte[C.DEFAULT_BUFFER_SEGMENT_SIZE];
    private final byte[] a = new byte[4096];

    public z5(e5 e5Var, long j3, long j10) {
        this.f9353b = e5Var;
        this.f9355d = j3;
        this.f9354c = j10;
    }

    private void d(int i10) {
        if (i10 != -1) {
            this.f9355d += i10;
        }
    }

    private void e(int i10) {
        int i11 = this.f9357f + i10;
        byte[] bArr = this.f9356e;
        if (i11 > bArr.length) {
            this.f9356e = Arrays.copyOf(this.f9356e, yp.a(bArr.length * 2, C.DEFAULT_BUFFER_SEGMENT_SIZE + i11, i11 + 524288));
        }
    }

    private void g(int i10) {
        byte[] bArr;
        int i11 = this.f9358g - i10;
        this.f9358g = i11;
        this.f9357f = 0;
        byte[] bArr2 = this.f9356e;
        if (i11 < bArr2.length - 524288) {
            bArr = new byte[C.DEFAULT_BUFFER_SEGMENT_SIZE + i11];
        } else {
            bArr = bArr2;
        }
        System.arraycopy(bArr2, i10, bArr, 0, i11);
        this.f9356e = bArr;
    }

    @Override // com.applovin.impl.j8
    public boolean a(int i10, boolean z10) {
        e(i10);
        int i11 = this.f9358g - this.f9357f;
        while (i11 < i10) {
            i11 = a(this.f9356e, this.f9357f, i10, i11, z10);
            if (i11 == -1) {
                return false;
            }
            this.f9358g = this.f9357f + i11;
        }
        this.f9357f += i10;
        return true;
    }

    @Override // com.applovin.impl.j8
    public int b(byte[] bArr, int i10, int i11) {
        int min;
        e(i11);
        int i12 = this.f9358g;
        int i13 = this.f9357f;
        int i14 = i12 - i13;
        if (i14 == 0) {
            min = a(this.f9356e, i13, i11, 0, true);
            if (min == -1) {
                return -1;
            }
            this.f9358g += min;
        } else {
            min = Math.min(i11, i14);
        }
        System.arraycopy(this.f9356e, this.f9357f, bArr, i10, min);
        this.f9357f += min;
        return min;
    }

    @Override // com.applovin.impl.j8
    public void c(int i10) {
        a(i10, false);
    }

    @Override // com.applovin.impl.j8
    public long f() {
        return this.f9355d;
    }

    private int f(int i10) {
        int min = Math.min(this.f9358g, i10);
        g(min);
        return min;
    }

    @Override // com.applovin.impl.j8
    public void c(byte[] bArr, int i10, int i11) {
        b(bArr, i10, i11, false);
    }

    @Override // com.applovin.impl.j8
    public long d() {
        return this.f9355d + this.f9357f;
    }

    @Override // com.applovin.impl.j8
    public void d(byte[] bArr, int i10, int i11) {
        a(bArr, i10, i11, false);
    }

    private int e(byte[] bArr, int i10, int i11) {
        int i12 = this.f9358g;
        if (i12 == 0) {
            return 0;
        }
        int min = Math.min(i12, i11);
        System.arraycopy(this.f9356e, 0, bArr, i10, min);
        g(min);
        return min;
    }

    @Override // com.applovin.impl.j8
    public long a() {
        return this.f9354c;
    }

    @Override // com.applovin.impl.j8, com.applovin.impl.e5
    public int a(byte[] bArr, int i10, int i11) {
        int e2 = e(bArr, i10, i11);
        if (e2 == 0) {
            e2 = a(bArr, i10, i11, 0, true);
        }
        d(e2);
        return e2;
    }

    @Override // com.applovin.impl.j8
    public boolean b(byte[] bArr, int i10, int i11, boolean z10) {
        if (!a(i11, z10)) {
            return false;
        }
        System.arraycopy(this.f9356e, this.f9357f - i11, bArr, i10, i11);
        return true;
    }

    @Override // com.applovin.impl.j8
    public boolean a(byte[] bArr, int i10, int i11, boolean z10) {
        int e2 = e(bArr, i10, i11);
        while (e2 < i11 && e2 != -1) {
            e2 = a(bArr, i10, i11, e2, z10);
        }
        d(e2);
        return e2 != -1;
    }

    @Override // com.applovin.impl.j8
    public void b() {
        this.f9357f = 0;
    }

    @Override // com.applovin.impl.j8
    public int b(int i10) {
        int f10 = f(i10);
        if (f10 == 0) {
            byte[] bArr = this.a;
            f10 = a(bArr, 0, Math.min(i10, bArr.length), 0, true);
        }
        d(f10);
        return f10;
    }

    @Override // com.applovin.impl.j8
    public void a(int i10) {
        b(i10, false);
    }

    private int a(byte[] bArr, int i10, int i11, int i12, boolean z10) {
        if (!Thread.interrupted()) {
            int a = this.f9353b.a(bArr, i10 + i12, i11 - i12);
            if (a != -1) {
                return i12 + a;
            }
            if (i12 == 0 && z10) {
                return -1;
            }
            throw new EOFException();
        }
        throw new InterruptedIOException();
    }

    public boolean b(int i10, boolean z10) {
        int f10 = f(i10);
        while (f10 < i10 && f10 != -1) {
            f10 = a(this.a, -f10, Math.min(i10, this.a.length + f10), f10, z10);
        }
        d(f10);
        return f10 != -1;
    }
}
