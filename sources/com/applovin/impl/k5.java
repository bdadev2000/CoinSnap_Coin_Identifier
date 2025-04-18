package com.applovin.impl;

import com.google.common.primitives.UnsignedBytes;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class k5 extends InputStream {

    /* renamed from: a, reason: collision with root package name */
    private final i5 f24811a;

    /* renamed from: b, reason: collision with root package name */
    private final l5 f24812b;

    /* renamed from: f, reason: collision with root package name */
    private long f24814f;
    private boolean d = false;
    private boolean e = false;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f24813c = new byte[1];

    public k5(i5 i5Var, l5 l5Var) {
        this.f24811a = i5Var;
        this.f24812b = l5Var;
    }

    private void a() {
        if (this.d) {
            return;
        }
        this.f24811a.a(this.f24812b);
        this.d = true;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.e) {
            return;
        }
        this.f24811a.close();
        this.e = true;
    }

    @Override // java.io.InputStream
    public int read() {
        if (read(this.f24813c) == -1) {
            return -1;
        }
        return this.f24813c[0] & UnsignedBytes.MAX_VALUE;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i2, int i3) {
        b1.b(!this.e);
        a();
        int a2 = this.f24811a.a(bArr, i2, i3);
        if (a2 == -1) {
            return -1;
        }
        this.f24814f += a2;
        return a2;
    }
}
