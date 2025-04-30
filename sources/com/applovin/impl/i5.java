package com.applovin.impl;

import java.io.InputStream;

/* loaded from: classes.dex */
public final class i5 extends InputStream {

    /* renamed from: a, reason: collision with root package name */
    private final g5 f8210a;
    private final j5 b;

    /* renamed from: f, reason: collision with root package name */
    private long f8214f;

    /* renamed from: d, reason: collision with root package name */
    private boolean f8212d = false;

    /* renamed from: e, reason: collision with root package name */
    private boolean f8213e = false;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f8211c = new byte[1];

    public i5(g5 g5Var, j5 j5Var) {
        this.f8210a = g5Var;
        this.b = j5Var;
    }

    private void a() {
        if (!this.f8212d) {
            this.f8210a.a(this.b);
            this.f8212d = true;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (!this.f8213e) {
            this.f8210a.close();
            this.f8213e = true;
        }
    }

    @Override // java.io.InputStream
    public int read() {
        if (read(this.f8211c) == -1) {
            return -1;
        }
        return this.f8211c[0] & 255;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i9, int i10) {
        AbstractC0669a1.b(!this.f8213e);
        a();
        int a6 = this.f8210a.a(bArr, i9, i10);
        if (a6 == -1) {
            return -1;
        }
        this.f8214f += a6;
        return a6;
    }
}
