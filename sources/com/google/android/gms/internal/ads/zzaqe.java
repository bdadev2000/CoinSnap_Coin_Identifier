package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;

/* loaded from: classes2.dex */
final class zzaqe implements zzaqd {
    private final FileChannel zza;
    private final long zzb;
    private final long zzc;

    public zzaqe(FileChannel fileChannel, long j7, long j9) {
        this.zza = fileChannel;
        this.zzb = j7;
        this.zzc = j9;
    }

    @Override // com.google.android.gms.internal.ads.zzaqd
    public final long zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzaqd
    public final void zzb(MessageDigest[] messageDigestArr, long j7, int i9) throws IOException {
        MappedByteBuffer map = this.zza.map(FileChannel.MapMode.READ_ONLY, this.zzb + j7, i9);
        map.load();
        for (MessageDigest messageDigest : messageDigestArr) {
            map.position(0);
            messageDigest.update(map);
        }
    }
}
