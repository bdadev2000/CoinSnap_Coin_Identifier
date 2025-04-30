package com.bykv.vk.openvk.preload.geckox.buffer.stream;

import java.io.IOException;

/* loaded from: classes.dex */
public class BufferOutputStream extends b {
    private com.bykv.vk.openvk.preload.geckox.buffer.a mBuffer;

    public BufferOutputStream(com.bykv.vk.openvk.preload.geckox.buffer.a aVar) {
        this.mBuffer = aVar;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        flush();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
    }

    @Override // java.io.OutputStream
    public void write(int i9) throws IOException {
        this.mBuffer.a(i9);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        this.mBuffer.a(bArr);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i9, int i10) throws IOException {
        this.mBuffer.a(bArr, i9, i10);
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.stream.b
    public void write(long j7, int i9) throws IOException {
        synchronized (this) {
            this.mBuffer.b(j7);
            this.mBuffer.a(i9);
        }
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.stream.b
    public void write(long j7, byte[] bArr) throws IOException {
        synchronized (this) {
            this.mBuffer.b(j7);
            this.mBuffer.a(bArr);
        }
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.stream.b
    public void write(long j7, byte[] bArr, int i9, int i10) throws IOException {
        synchronized (this) {
            this.mBuffer.b(j7);
            this.mBuffer.a(bArr, i9, i10);
        }
    }
}
