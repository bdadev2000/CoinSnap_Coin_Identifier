package com.google.android.gms.internal.ads;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes2.dex */
final class zzary extends FilterInputStream {
    private final long zza;
    private long zzb;

    public zzary(InputStream inputStream, long j7) {
        super(inputStream);
        this.zza = j7;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int read = super.read();
        if (read != -1) {
            this.zzb++;
        }
        return read;
    }

    public final long zza() {
        return this.zza - this.zzb;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i9, int i10) throws IOException {
        int read = super.read(bArr, i9, i10);
        if (read != -1) {
            this.zzb += read;
        }
        return read;
    }
}
