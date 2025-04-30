package com.google.android.gms.ads.internal.util;

/* loaded from: classes2.dex */
public final class zzcb {
    private long zza;
    private long zzb = Long.MIN_VALUE;
    private final Object zzc = new Object();

    public zzcb(long j7) {
        this.zza = j7;
    }

    public final void zza(long j7) {
        synchronized (this.zzc) {
            this.zza = j7;
        }
    }

    public final boolean zzb() {
        synchronized (this.zzc) {
            try {
                long elapsedRealtime = com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime();
                if (this.zzb + this.zza > elapsedRealtime) {
                    return false;
                }
                this.zzb = elapsedRealtime;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
