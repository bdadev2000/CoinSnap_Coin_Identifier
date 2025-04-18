package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;

/* loaded from: classes3.dex */
final class zzaop implements zzaoo {
    private final FileChannel zza;
    private final long zzb;
    private final long zzc;

    public zzaop(FileChannel fileChannel, long j3, long j10) {
        this.zza = fileChannel;
        this.zzb = j3;
        this.zzc = j10;
    }

    @Override // com.google.android.gms.internal.ads.zzaoo
    public final long zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzaoo
    public final void zzb(MessageDigest[] messageDigestArr, long j3, int i10) throws IOException {
        MappedByteBuffer map = this.zza.map(FileChannel.MapMode.READ_ONLY, this.zzb + j3, i10);
        map.load();
        for (MessageDigest messageDigest : messageDigestArr) {
            map.position(0);
            messageDigest.update(map);
        }
    }
}
