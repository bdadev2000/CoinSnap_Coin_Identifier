package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzecl {
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
        int i10;
        synchronized (this.zzg) {
            i10 = this.zzb;
        }
        return i10;
    }

    public final synchronized long zzb() {
        long j3;
        synchronized (this.zzj) {
            j3 = this.zze;
        }
        return j3;
    }

    public final synchronized long zzc() {
        long j3;
        synchronized (this.zzi) {
            j3 = this.zzd;
        }
        return j3;
    }

    public final synchronized long zzd() {
        long j3;
        synchronized (this.zzf) {
            j3 = this.zza;
        }
        return j3;
    }

    public final long zze() {
        long j3;
        synchronized (this.zzh) {
            j3 = this.zzc;
        }
        return j3;
    }

    public final synchronized void zzf(long j3) {
        synchronized (this.zzj) {
            this.zze = j3;
        }
    }

    public final synchronized void zzg(long j3) {
        synchronized (this.zzi) {
            this.zzd = j3;
        }
    }

    public final synchronized void zzh(long j3) {
        synchronized (this.zzf) {
            this.zza = j3;
        }
    }

    public final void zzi(int i10) {
        synchronized (this.zzg) {
            this.zzb = i10;
        }
    }

    public final void zzj(long j3) {
        synchronized (this.zzh) {
            this.zzc = j3;
        }
    }
}
