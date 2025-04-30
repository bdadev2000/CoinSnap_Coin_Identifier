package com.google.protobuf;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.google.protobuf.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1866a extends FilterInputStream {
    private int limit;

    public C1866a(InputStream inputStream, int i9) {
        super(inputStream);
        this.limit = i9;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() throws IOException {
        return Math.min(super.available(), this.limit);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        if (this.limit <= 0) {
            return -1;
        }
        int read = super.read();
        if (read >= 0) {
            this.limit--;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j7) throws IOException {
        int skip = (int) super.skip(Math.min(j7, this.limit));
        if (skip >= 0) {
            this.limit -= skip;
        }
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i9, int i10) throws IOException {
        int i11 = this.limit;
        if (i11 <= 0) {
            return -1;
        }
        int read = super.read(bArr, i9, Math.min(i10, i11));
        if (read >= 0) {
            this.limit -= read;
        }
        return read;
    }
}
