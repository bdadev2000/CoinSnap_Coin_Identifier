package com.bykv.vk.openvk.preload.geckox.buffer.stream;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class a extends InputStream {

    /* renamed from: a, reason: collision with root package name */
    private com.bykv.vk.openvk.preload.geckox.buffer.a f13223a;
    private long b;

    public a(com.bykv.vk.openvk.preload.geckox.buffer.a aVar) {
        this.f13223a = aVar;
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        long b = this.f13223a.b() - this.f13223a.c();
        if (b > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) b;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
    }

    @Override // java.io.InputStream
    public final synchronized void mark(int i9) {
        this.b = i9;
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        return this.f13223a.b(bArr);
    }

    @Override // java.io.InputStream
    public final synchronized void reset() throws IOException {
        this.f13223a.b(this.b);
    }

    @Override // java.io.InputStream
    public final long skip(long j7) throws IOException {
        return this.f13223a.a(j7);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i9, int i10) throws IOException {
        return this.f13223a.b(bArr, i9, i10);
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        return this.f13223a.d();
    }
}
