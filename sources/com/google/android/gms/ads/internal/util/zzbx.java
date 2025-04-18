package com.google.android.gms.ads.internal.util;

/* loaded from: classes3.dex */
public final class zzbx {
    private long zza;
    private long zzb = Long.MIN_VALUE;
    private final Object zzc = new Object();

    public zzbx(long j2) {
        this.zza = j2;
    }

    public final void zza(long j2) {
        synchronized (this.zzc) {
            this.zza = j2;
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
