package com.bumptech.glide.load.data;

import com.applovin.exoplayer2.common.base.Ascii;
import java.io.FilterInputStream;
import java.io.InputStream;
import kotlin.UByte;

/* loaded from: classes.dex */
public final class j extends FilterInputStream {

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f9699d = {-1, -31, 0, Ascii.FS, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, Ascii.DC2, 0, 2, 0, 0, 0, 1, 0};

    /* renamed from: f, reason: collision with root package name */
    public static final int f9700f = 31;

    /* renamed from: b, reason: collision with root package name */
    public final byte f9701b;

    /* renamed from: c, reason: collision with root package name */
    public int f9702c;

    public j(InputStream inputStream, int i10) {
        super(inputStream);
        if (i10 >= -1 && i10 <= 8) {
            this.f9701b = (byte) i10;
            return;
        }
        throw new IllegalArgumentException(eb.j.i("Cannot add invalid orientation: ", i10));
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void mark(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        int read;
        int i10;
        int i11 = this.f9702c;
        if (i11 < 2 || i11 > (i10 = f9700f)) {
            read = super.read();
        } else if (i11 == i10) {
            read = this.f9701b;
        } else {
            read = f9699d[i11 - 2] & UByte.MAX_VALUE;
        }
        if (read != -1) {
            this.f9702c++;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void reset() {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j3) {
        long skip = super.skip(j3);
        if (skip > 0) {
            this.f9702c = (int) (this.f9702c + skip);
        }
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) {
        int i12;
        int i13 = this.f9702c;
        int i14 = f9700f;
        if (i13 > i14) {
            i12 = super.read(bArr, i10, i11);
        } else if (i13 == i14) {
            bArr[i10] = this.f9701b;
            i12 = 1;
        } else if (i13 < 2) {
            i12 = super.read(bArr, i10, 2 - i13);
        } else {
            int min = Math.min(i14 - i13, i11);
            System.arraycopy(f9699d, this.f9702c - 2, bArr, i10, min);
            i12 = min;
        }
        if (i12 > 0) {
            this.f9702c += i12;
        }
        return i12;
    }
}
