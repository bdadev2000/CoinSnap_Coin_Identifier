package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;

/* loaded from: classes2.dex */
final class zzapc implements zzapb {
    private final FileChannel zza;
    private final long zzb;
    private final long zzc;

    public zzapc(FileChannel fileChannel, long j2, long j3) {
        this.zza = fileChannel;
        this.zzb = j2;
        this.zzc = j3;
    }

    @Override // com.google.android.gms.internal.ads.zzapb
    public final long zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzapb
    public final void zzb(MessageDigest[] messageDigestArr, long j2, int i2) throws IOException {
        MappedByteBuffer map = this.zza.map(FileChannel.MapMode.READ_ONLY, this.zzb + j2, i2);
        map.load();
        for (MessageDigest messageDigest : messageDigestArr) {
            map.position(0);
            messageDigest.update(map);
        }
    }
}
