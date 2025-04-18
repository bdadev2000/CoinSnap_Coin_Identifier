package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* loaded from: classes3.dex */
final class zzaon implements zzaoo {
    private final ByteBuffer zza;

    public zzaon(ByteBuffer byteBuffer) {
        this.zza = byteBuffer.slice();
    }

    @Override // com.google.android.gms.internal.ads.zzaoo
    public final long zza() {
        return this.zza.capacity();
    }

    @Override // com.google.android.gms.internal.ads.zzaoo
    public final void zzb(MessageDigest[] messageDigestArr, long j3, int i10) throws IOException {
        ByteBuffer slice;
        synchronized (this.zza) {
            int i11 = (int) j3;
            this.zza.position(i11);
            this.zza.limit(i11 + i10);
            slice = this.zza.slice();
        }
        for (MessageDigest messageDigest : messageDigestArr) {
            slice.position(0);
            messageDigest.update(slice);
        }
    }
}
