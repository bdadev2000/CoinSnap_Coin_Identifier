package com.bumptech.glide.load.data;

import java.io.FileOutputStream;
import java.io.OutputStream;

/* loaded from: classes.dex */
public final class c extends OutputStream {
    public final OutputStream b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f12852c;

    /* renamed from: d, reason: collision with root package name */
    public final Q1.f f12853d;

    /* renamed from: f, reason: collision with root package name */
    public int f12854f;

    public c(FileOutputStream fileOutputStream, Q1.f fVar) {
        this.b = fileOutputStream;
        this.f12853d = fVar;
        this.f12852c = (byte[]) fVar.c(65536, byte[].class);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        OutputStream outputStream = this.b;
        try {
            flush();
            outputStream.close();
            byte[] bArr = this.f12852c;
            if (bArr != null) {
                this.f12853d.g(bArr);
                this.f12852c = null;
            }
        } catch (Throwable th) {
            outputStream.close();
            throw th;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        int i9 = this.f12854f;
        OutputStream outputStream = this.b;
        if (i9 > 0) {
            outputStream.write(this.f12852c, 0, i9);
            this.f12854f = 0;
        }
        outputStream.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int i9) {
        byte[] bArr = this.f12852c;
        int i10 = this.f12854f;
        int i11 = i10 + 1;
        this.f12854f = i11;
        bArr[i10] = (byte) i9;
        if (i11 != bArr.length || i11 <= 0) {
            return;
        }
        this.b.write(bArr, 0, i11);
        this.f12854f = 0;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i9, int i10) {
        int i11 = 0;
        do {
            int i12 = i10 - i11;
            int i13 = i9 + i11;
            int i14 = this.f12854f;
            OutputStream outputStream = this.b;
            if (i14 == 0 && i12 >= this.f12852c.length) {
                outputStream.write(bArr, i13, i12);
                return;
            }
            int min = Math.min(i12, this.f12852c.length - i14);
            System.arraycopy(bArr, i13, this.f12852c, this.f12854f, min);
            int i15 = this.f12854f + min;
            this.f12854f = i15;
            i11 += min;
            byte[] bArr2 = this.f12852c;
            if (i15 == bArr2.length && i15 > 0) {
                outputStream.write(bArr2, 0, i15);
                this.f12854f = 0;
            }
        } while (i11 < i10);
    }
}
