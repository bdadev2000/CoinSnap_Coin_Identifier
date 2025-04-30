package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
final class zzcez implements zzhkb {
    private final ByteBuffer zza;

    public zzcez(ByteBuffer byteBuffer) {
        this.zza = byteBuffer.duplicate();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
    }

    @Override // com.google.android.gms.internal.ads.zzhkb
    public final int zza(ByteBuffer byteBuffer) throws IOException {
        if (this.zza.remaining() == 0 && byteBuffer.remaining() > 0) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), this.zza.remaining());
        byte[] bArr = new byte[min];
        this.zza.get(bArr);
        byteBuffer.put(bArr);
        return min;
    }

    @Override // com.google.android.gms.internal.ads.zzhkb
    public final long zzb() throws IOException {
        return this.zza.position();
    }

    @Override // com.google.android.gms.internal.ads.zzhkb
    public final long zzc() throws IOException {
        return this.zza.limit();
    }

    @Override // com.google.android.gms.internal.ads.zzhkb
    public final ByteBuffer zzd(long j7, long j9) throws IOException {
        ByteBuffer byteBuffer = this.zza;
        int position = byteBuffer.position();
        byteBuffer.position((int) j7);
        ByteBuffer slice = this.zza.slice();
        slice.limit((int) j9);
        this.zza.position(position);
        return slice;
    }

    @Override // com.google.android.gms.internal.ads.zzhkb
    public final void zze(long j7) throws IOException {
        this.zza.position((int) j7);
    }
}
