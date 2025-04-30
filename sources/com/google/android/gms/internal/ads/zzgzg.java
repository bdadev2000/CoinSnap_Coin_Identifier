package com.google.android.gms.internal.ads;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes2.dex */
final class zzgzg extends FilterInputStream {
    private int zza;

    public zzgzg(InputStream inputStream, int i9) {
        super(inputStream);
        this.zza = i9;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() throws IOException {
        return Math.min(super.available(), this.zza);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        if (this.zza <= 0) {
            return -1;
        }
        int read = super.read();
        if (read >= 0) {
            this.zza--;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j7) throws IOException {
        int skip = (int) super.skip(Math.min(j7, this.zza));
        if (skip >= 0) {
            this.zza -= skip;
        }
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i9, int i10) throws IOException {
        int i11 = this.zza;
        if (i11 <= 0) {
            return -1;
        }
        int read = super.read(bArr, i9, Math.min(i10, i11));
        if (read >= 0) {
            this.zza -= read;
        }
        return read;
    }
}
