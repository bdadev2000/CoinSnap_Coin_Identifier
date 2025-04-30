package com.bumptech.glide.load.data;

import com.applovin.exoplayer2.common.base.Ascii;
import com.mbridge.msdk.foundation.entity.o;
import java.io.FilterInputStream;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class i extends FilterInputStream {

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f12857d = {-1, -31, 0, Ascii.FS, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, Ascii.DC2, 0, 2, 0, 0, 0, 1, 0};

    /* renamed from: f, reason: collision with root package name */
    public static final int f12858f = 31;
    public final byte b;

    /* renamed from: c, reason: collision with root package name */
    public int f12859c;

    public i(InputStream inputStream, int i9) {
        super(inputStream);
        if (i9 >= -1 && i9 <= 8) {
            this.b = (byte) i9;
            return;
        }
        throw new IllegalArgumentException(o.h(i9, "Cannot add invalid orientation: "));
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void mark(int i9) {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        int read;
        int i9;
        int i10 = this.f12859c;
        if (i10 < 2 || i10 > (i9 = f12858f)) {
            read = super.read();
        } else if (i10 == i9) {
            read = this.b;
        } else {
            read = f12857d[i10 - 2] & 255;
        }
        if (read != -1) {
            this.f12859c++;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void reset() {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j7) {
        long skip = super.skip(j7);
        if (skip > 0) {
            this.f12859c = (int) (this.f12859c + skip);
        }
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i9, int i10) {
        int i11;
        int i12 = this.f12859c;
        int i13 = f12858f;
        if (i12 > i13) {
            i11 = super.read(bArr, i9, i10);
        } else if (i12 == i13) {
            bArr[i9] = this.b;
            i11 = 1;
        } else if (i12 < 2) {
            i11 = super.read(bArr, i9, 2 - i12);
        } else {
            int min = Math.min(i13 - i12, i10);
            System.arraycopy(f12857d, this.f12859c - 2, bArr, i9, min);
            i11 = min;
        }
        if (i11 > 0) {
            this.f12859c += i11;
        }
        return i11;
    }
}
