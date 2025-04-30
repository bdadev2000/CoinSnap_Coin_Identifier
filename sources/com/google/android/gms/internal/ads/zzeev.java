package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzeev {
    private long zza = 0;
    private int zzb = 0;
    private long zzc = 0;
    private long zzd = 0;
    private long zze = 0;
    private final Object zzf = new Object();
    private final Object zzg = new Object();
    private final Object zzh = new Object();
    private final Object zzi = new Object();
    private final Object zzj = new Object();

    public final int zza() {
        int i9;
        synchronized (this.zzg) {
            i9 = this.zzb;
        }
        return i9;
    }

    public final synchronized long zzb() {
        long j7;
        synchronized (this.zzj) {
            j7 = this.zze;
        }
        return j7;
    }

    public final synchronized long zzc() {
        long j7;
        synchronized (this.zzi) {
            j7 = this.zzd;
        }
        return j7;
    }

    public final synchronized long zzd() {
        long j7;
        synchronized (this.zzf) {
            j7 = this.zza;
        }
        return j7;
    }

    public final long zze() {
        long j7;
        synchronized (this.zzh) {
            j7 = this.zzc;
        }
        return j7;
    }

    public final synchronized void zzf(long j7) {
        synchronized (this.zzj) {
            this.zze = j7;
        }
    }

    public final synchronized void zzg(long j7) {
        synchronized (this.zzi) {
            this.zzd = j7;
        }
    }

    public final synchronized void zzh(long j7) {
        synchronized (this.zzf) {
            this.zza = j7;
        }
    }

    public final void zzi(int i9) {
        synchronized (this.zzg) {
            this.zzb = i9;
        }
    }

    public final void zzj(long j7) {
        synchronized (this.zzh) {
            this.zzc = j7;
        }
    }
}
