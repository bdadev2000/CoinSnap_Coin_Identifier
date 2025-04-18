package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
final class zzfia {
    private final long zza;
    private long zzc;
    private final zzfhz zzb = new zzfhz();
    private int zzd = 0;
    private int zze = 0;
    private int zzf = 0;

    public zzfia() {
        long currentTimeMillis = com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis();
        this.zza = currentTimeMillis;
        this.zzc = currentTimeMillis;
    }

    public final int zza() {
        return this.zzd;
    }

    public final long zzb() {
        return this.zza;
    }

    public final long zzc() {
        return this.zzc;
    }

    public final zzfhz zzd() {
        zzfhz zzfhzVar = this.zzb;
        zzfhz clone = zzfhzVar.clone();
        zzfhzVar.zza = false;
        zzfhzVar.zzb = 0;
        return clone;
    }

    public final String zze() {
        return "Created: " + this.zza + " Last accessed: " + this.zzc + " Accesses: " + this.zzd + "\nEntries retrieved: Valid: " + this.zze + " Stale: " + this.zzf;
    }

    public final void zzf() {
        this.zzc = com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis();
        this.zzd++;
    }

    public final void zzg() {
        this.zzf++;
        this.zzb.zzb++;
    }

    public final void zzh() {
        this.zze++;
        this.zzb.zza = true;
    }
}
