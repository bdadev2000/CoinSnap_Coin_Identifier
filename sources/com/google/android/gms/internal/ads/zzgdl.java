package com.google.android.gms.internal.ads;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes2.dex */
final class zzgdl extends FilterInputStream {
    private long zza;
    private long zzb;

    public zzgdl(InputStream inputStream, long j7) {
        super(inputStream);
        boolean z8;
        this.zzb = -1L;
        inputStream.getClass();
        if (j7 >= 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        zzfyg.zzf(z8, "limit must be non-negative");
        this.zza = j7;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() throws IOException {
        return (int) Math.min(((FilterInputStream) this).in.available(), this.zza);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i9) {
        ((FilterInputStream) this).in.mark(i9);
        this.zzb = this.zza;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        if (this.zza == 0) {
            return -1;
        }
        int read = ((FilterInputStream) this).in.read();
        if (read != -1) {
            this.zza--;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() throws IOException {
        if (((FilterInputStream) this).in.markSupported()) {
            if (this.zzb != -1) {
                ((FilterInputStream) this).in.reset();
                this.zza = this.zzb;
            } else {
                throw new IOException("Mark not set");
            }
        } else {
            throw new IOException("Mark not supported");
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j7) throws IOException {
        long skip = ((FilterInputStream) this).in.skip(Math.min(j7, this.zza));
        this.zza -= skip;
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i9, int i10) throws IOException {
        long j7 = this.zza;
        if (j7 == 0) {
            return -1;
        }
        int read = ((FilterInputStream) this).in.read(bArr, i9, (int) Math.min(i10, j7));
        if (read != -1) {
            this.zza -= read;
        }
        return read;
    }
}
