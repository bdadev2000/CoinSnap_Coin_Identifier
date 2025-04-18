package com.google.android.gms.ads.internal.util;

/* loaded from: classes3.dex */
public final class zzbw {
    private long zza;
    private long zzb = Long.MIN_VALUE;
    private final Object zzc = new Object();

    public zzbw(long j3) {
        this.zza = j3;
    }

    public final void zza(long j3) {
        synchronized (this.zzc) {
            this.zza = j3;
        }
    }

    public final boolean zzb() {
        synchronized (this.zzc) {
            long elapsedRealtime = com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime();
            if (this.zzb + this.zza > elapsedRealtime) {
                return false;
            }
            this.zzb = elapsedRealtime;
            return true;
        }
    }
}
