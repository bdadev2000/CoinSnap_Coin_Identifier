package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
final class zzcda implements zzhfj {
    private final ByteBuffer zza;

    public zzcda(ByteBuffer byteBuffer) {
        this.zza = byteBuffer.duplicate();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
    }

    @Override // com.google.android.gms.internal.ads.zzhfj
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

    @Override // com.google.android.gms.internal.ads.zzhfj
    public final long zzb() throws IOException {
        return this.zza.position();
    }

    @Override // com.google.android.gms.internal.ads.zzhfj
    public final long zzc() throws IOException {
        return this.zza.limit();
    }

    @Override // com.google.android.gms.internal.ads.zzhfj
    public final ByteBuffer zzd(long j3, long j10) throws IOException {
        ByteBuffer byteBuffer = this.zza;
        int position = byteBuffer.position();
        byteBuffer.position((int) j3);
        ByteBuffer slice = this.zza.slice();
        slice.limit((int) j10);
        this.zza.position(position);
        return slice;
    }

    @Override // com.google.android.gms.internal.ads.zzhfj
    public final void zze(long j3) throws IOException {
        this.zza.position((int) j3);
    }
}
