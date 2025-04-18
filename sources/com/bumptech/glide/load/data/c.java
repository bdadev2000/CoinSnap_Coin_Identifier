package com.bumptech.glide.load.data;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.FileOutputStream;
import java.io.OutputStream;

/* loaded from: classes.dex */
public final class c extends OutputStream {

    /* renamed from: b, reason: collision with root package name */
    public final OutputStream f9694b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f9695c;

    /* renamed from: d, reason: collision with root package name */
    public final h4.h f9696d;

    /* renamed from: f, reason: collision with root package name */
    public int f9697f;

    public c(FileOutputStream fileOutputStream, h4.h hVar) {
        this.f9694b = fileOutputStream;
        this.f9696d = hVar;
        this.f9695c = (byte[]) hVar.c(byte[].class, C.DEFAULT_BUFFER_SEGMENT_SIZE);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        OutputStream outputStream = this.f9694b;
        try {
            flush();
            outputStream.close();
            byte[] bArr = this.f9695c;
            if (bArr != null) {
                this.f9696d.g(bArr);
                this.f9695c = null;
            }
        } catch (Throwable th2) {
            outputStream.close();
            throw th2;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        int i10 = this.f9697f;
        OutputStream outputStream = this.f9694b;
        if (i10 > 0) {
            outputStream.write(this.f9695c, 0, i10);
            this.f9697f = 0;
        }
        outputStream.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int i10) {
        byte[] bArr = this.f9695c;
        int i11 = this.f9697f;
        int i12 = i11 + 1;
        this.f9697f = i12;
        bArr[i11] = (byte) i10;
        if (i12 != bArr.length || i12 <= 0) {
            return;
        }
        this.f9694b.write(bArr, 0, i12);
        this.f9697f = 0;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i10, int i11) {
        int i12 = 0;
        do {
            int i13 = i11 - i12;
            int i14 = i10 + i12;
            int i15 = this.f9697f;
            OutputStream outputStream = this.f9694b;
            if (i15 == 0 && i13 >= this.f9695c.length) {
                outputStream.write(bArr, i14, i13);
                return;
            }
            int min = Math.min(i13, this.f9695c.length - i15);
            System.arraycopy(bArr, i14, this.f9695c, this.f9697f, min);
            int i16 = this.f9697f + min;
            this.f9697f = i16;
            i12 += min;
            byte[] bArr2 = this.f9695c;
            if (i16 == bArr2.length && i16 > 0) {
                outputStream.write(bArr2, 0, i16);
                this.f9697f = 0;
            }
        } while (i12 < i11);
    }
}
