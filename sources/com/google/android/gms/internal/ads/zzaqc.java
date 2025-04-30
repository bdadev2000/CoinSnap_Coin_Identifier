package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* loaded from: classes2.dex */
final class zzaqc implements zzaqd {
    private final ByteBuffer zza;

    public zzaqc(ByteBuffer byteBuffer) {
        this.zza = byteBuffer.slice();
    }

    @Override // com.google.android.gms.internal.ads.zzaqd
    public final long zza() {
        return this.zza.capacity();
    }

    @Override // com.google.android.gms.internal.ads.zzaqd
    public final void zzb(MessageDigest[] messageDigestArr, long j7, int i9) throws IOException {
        ByteBuffer slice;
        synchronized (this.zza) {
            int i10 = (int) j7;
            this.zza.position(i10);
            this.zza.limit(i10 + i9);
            slice = this.zza.slice();
        }
        for (MessageDigest messageDigest : messageDigestArr) {
            slice.position(0);
            messageDigest.update(slice);
        }
    }
}
