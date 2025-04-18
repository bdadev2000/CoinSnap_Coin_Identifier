package com.bykv.vk.openvk.preload.geckox.buffer.stream;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class a extends InputStream {
    private com.bykv.vk.openvk.preload.geckox.buffer.a a;

    /* renamed from: b, reason: collision with root package name */
    private long f10052b;

    public a(com.bykv.vk.openvk.preload.geckox.buffer.a aVar) {
        this.a = aVar;
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        long b3 = this.a.b() - this.a.c();
        if (b3 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) b3;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
    }

    @Override // java.io.InputStream
    public final synchronized void mark(int i10) {
        this.f10052b = i10;
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        return this.a.b(bArr);
    }

    @Override // java.io.InputStream
    public final synchronized void reset() throws IOException {
        this.a.b(this.f10052b);
    }

    @Override // java.io.InputStream
    public final long skip(long j3) throws IOException {
        return this.a.a(j3);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        return this.a.b(bArr, i10, i11);
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        return this.a.d();
    }
}
