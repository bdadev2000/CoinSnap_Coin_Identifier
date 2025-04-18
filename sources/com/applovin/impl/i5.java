package com.applovin.impl;

import java.io.InputStream;
import kotlin.UByte;

/* loaded from: classes.dex */
public final class i5 extends InputStream {
    private final g5 a;

    /* renamed from: b, reason: collision with root package name */
    private final j5 f5246b;

    /* renamed from: f, reason: collision with root package name */
    private long f5250f;

    /* renamed from: d, reason: collision with root package name */
    private boolean f5248d = false;

    /* renamed from: e, reason: collision with root package name */
    private boolean f5249e = false;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f5247c = new byte[1];

    public i5(g5 g5Var, j5 j5Var) {
        this.a = g5Var;
        this.f5246b = j5Var;
    }

    private void a() {
        if (!this.f5248d) {
            this.a.a(this.f5246b);
            this.f5248d = true;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (!this.f5249e) {
            this.a.close();
            this.f5249e = true;
        }
    }

    @Override // java.io.InputStream
    public int read() {
        if (read(this.f5247c) == -1) {
            return -1;
        }
        return this.f5247c[0] & UByte.MAX_VALUE;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) {
        a1.b(!this.f5249e);
        a();
        int a = this.a.a(bArr, i10, i11);
        if (a == -1) {
            return -1;
        }
        this.f5250f += a;
        return a;
    }
}
