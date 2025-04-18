package com.google.protobuf;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes4.dex */
public final class a extends FilterInputStream {
    private int limit;

    public a(InputStream inputStream, int i10) {
        super(inputStream);
        this.limit = i10;
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
    public long skip(long j3) throws IOException {
        int skip = (int) super.skip(Math.min(j3, this.limit));
        if (skip >= 0) {
            this.limit -= skip;
        }
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = this.limit;
        if (i12 <= 0) {
            return -1;
        }
        int read = super.read(bArr, i10, Math.min(i11, i12));
        if (read >= 0) {
            this.limit -= read;
        }
        return read;
    }
}
