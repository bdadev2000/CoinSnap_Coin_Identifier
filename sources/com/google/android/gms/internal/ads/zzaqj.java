package com.google.android.gms.internal.ads;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes3.dex */
final class zzaqj extends FilterInputStream {
    private final long zza;
    private long zzb;

    public zzaqj(InputStream inputStream, long j3) {
        super(inputStream);
        this.zza = j3;
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
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        int read = super.read(bArr, i10, i11);
        if (read != -1) {
            this.zzb += read;
        }
        return read;
    }
}
