package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class zzcdy {
    private long zzb;
    private final long zza = TimeUnit.MILLISECONDS.toNanos(((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzD)).longValue());
    private boolean zzc = true;

    public final void zza(SurfaceTexture surfaceTexture, final zzcdj zzcdjVar) {
        if (zzcdjVar != null) {
            long timestamp = surfaceTexture.getTimestamp();
            if (!this.zzc) {
                long j7 = timestamp - this.zzb;
                if (Math.abs(j7) < this.zza) {
                    return;
                }
            }
            this.zzc = false;
            this.zzb = timestamp;
            com.google.android.gms.ads.internal.util.zzt.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcdx
                @Override // java.lang.Runnable
                public final void run() {
                    zzcdj.this.zzk();
                }
            });
        }
    }

    public final void zzb() {
        this.zzc = true;
    }
}
