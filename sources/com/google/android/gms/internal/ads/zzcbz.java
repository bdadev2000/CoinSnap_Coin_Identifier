package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class zzcbz {
    private long zzb;
    private final long zza = TimeUnit.MILLISECONDS.toNanos(((Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzN)).longValue());
    private boolean zzc = true;

    public final void zza(SurfaceTexture surfaceTexture, final zzcbk zzcbkVar) {
        if (zzcbkVar != null) {
            long timestamp = surfaceTexture.getTimestamp();
            if (!this.zzc) {
                long j3 = timestamp - this.zzb;
                if (Math.abs(j3) < this.zza) {
                    return;
                }
            }
            this.zzc = false;
            this.zzb = timestamp;
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcby
                @Override // java.lang.Runnable
                public final void run() {
                    zzcbk.this.zzk();
                }
            });
        }
    }

    public final void zzb() {
        this.zzc = true;
    }
}
