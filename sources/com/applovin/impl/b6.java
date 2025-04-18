package com.applovin.impl;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import org.objectweb.asm.Opcodes;

/* loaded from: classes3.dex */
public final class b6 implements l8 {

    /* renamed from: b, reason: collision with root package name */
    private final g5 f23022b;

    /* renamed from: c, reason: collision with root package name */
    private final long f23023c;
    private long d;

    /* renamed from: f, reason: collision with root package name */
    private int f23024f;

    /* renamed from: g, reason: collision with root package name */
    private int f23025g;
    private byte[] e = new byte[65536];

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f23021a = new byte[4096];

    public b6(g5 g5Var, long j2, long j3) {
        this.f23022b = g5Var;
        this.d = j2;
        this.f23023c = j3;
    }

    private void e(int i2) {
        int i3 = this.f23024f + i2;
        byte[] bArr = this.e;
        if (i3 > bArr.length) {
            this.e = Arrays.copyOf(this.e, xp.a(bArr.length * 2, 65536 + i3, i3 + Opcodes.ASM8));
        }
    }

    private void g(int i2) {
        int i3 = this.f23025g - i2;
        this.f23025g = i3;
        this.f23024f = 0;
        byte[] bArr = this.e;
        byte[] bArr2 = i3 < bArr.length - Opcodes.ASM8 ? new byte[65536 + i3] : bArr;
        System.arraycopy(bArr, i2, bArr2, 0, i3);
        this.e = bArr2;
    }

    @Override // com.applovin.impl.l8
    public long a() {
        return this.f23023c;
    }

    @Override // com.applovin.impl.l8
    public void b() {
        this.f23024f = 0;
    }

    @Override // com.applovin.impl.l8
    public void c(int i2) {
        a(i2, false);
    }

    @Override // com.applovin.impl.l8
    public long d() {
        return this.d + this.f23024f;
    }

    @Override // com.applovin.impl.l8
    public long f() {
        return this.d;
    }

    private void d(int i2) {
        if (i2 != -1) {
            this.d += i2;
        }
    }

    private int f(int i2) {
        int min = Math.min(this.f23025g, i2);
        g(min);
        return min;
    }

    @Override // com.applovin.impl.l8
    public boolean a(int i2, boolean z2) {
        e(i2);
        int i3 = this.f23025g - this.f23024f;
        while (i3 < i2) {
            i3 = a(this.e, this.f23024f, i2, i3, z2);
            if (i3 == -1) {
                return false;
            }
            this.f23025g = this.f23024f + i3;
        }
        this.f23024f += i2;
        return true;
    }

    @Override // com.applovin.impl.l8
    public int b(byte[] bArr, int i2, int i3) {
        int min;
        e(i3);
        int i4 = this.f23025g;
        int i5 = this.f23024f;
        int i6 = i4 - i5;
        if (i6 == 0) {
            min = a(this.e, i5, i3, 0, true);
            if (min == -1) {
                return -1;
            }
            this.f23025g += min;
        } else {
            min = Math.min(i3, i6);
        }
        System.arraycopy(this.e, this.f23024f, bArr, i2, min);
        this.f23024f += min;
        return min;
    }

    @Override // com.applovin.impl.l8
    public void c(byte[] bArr, int i2, int i3) {
        b(bArr, i2, i3, false);
    }

    @Override // com.applovin.impl.l8
    public void d(byte[] bArr, int i2, int i3) {
        a(bArr, i2, i3, false);
    }

    @Override // com.applovin.impl.l8, com.applovin.impl.g5
    public int a(byte[] bArr, int i2, int i3) {
        int e = e(bArr, i2, i3);
        if (e == 0) {
            e = a(bArr, i2, i3, 0, true);
        }
        d(e);
        return e;
    }

    private int e(byte[] bArr, int i2, int i3) {
        int i4 = this.f23025g;
        if (i4 == 0) {
            return 0;
        }
        int min = Math.min(i4, i3);
        System.arraycopy(this.e, 0, bArr, i2, min);
        g(min);
        return min;
    }

    @Override // com.applovin.impl.l8
    public boolean b(byte[] bArr, int i2, int i3, boolean z2) {
        if (!a(i3, z2)) {
            return false;
        }
        System.arraycopy(this.e, this.f23024f - i3, bArr, i2, i3);
        return true;
    }

    @Override // com.applovin.impl.l8
    public boolean a(byte[] bArr, int i2, int i3, boolean z2) {
        int e = e(bArr, i2, i3);
        while (e < i3 && e != -1) {
            e = a(bArr, i2, i3, e, z2);
        }
        d(e);
        return e != -1;
    }

    @Override // com.applovin.impl.l8
    public int b(int i2) {
        int f2 = f(i2);
        if (f2 == 0) {
            byte[] bArr = this.f23021a;
            f2 = a(bArr, 0, Math.min(i2, bArr.length), 0, true);
        }
        d(f2);
        return f2;
    }

    @Override // com.applovin.impl.l8
    public void a(int i2) {
        b(i2, false);
    }

    private int a(byte[] bArr, int i2, int i3, int i4, boolean z2) {
        if (!Thread.interrupted()) {
            int a2 = this.f23022b.a(bArr, i2 + i4, i3 - i4);
            if (a2 != -1) {
                return i4 + a2;
            }
            if (i4 == 0 && z2) {
                return -1;
            }
            throw new EOFException();
        }
        throw new InterruptedIOException();
    }

    public boolean b(int i2, boolean z2) {
        int f2 = f(i2);
        while (f2 < i2 && f2 != -1) {
            f2 = a(this.f23021a, -f2, Math.min(i2, this.f23021a.length + f2), f2, z2);
        }
        d(f2);
        return f2 != -1;
    }
}
