package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzqq {
    private final zzct[] zza;
    private final zzrk zzb;
    private final zzcw zzc;

    public zzqq(zzct... zzctVarArr) {
        zzrk zzrkVar = new zzrk();
        zzcw zzcwVar = new zzcw();
        this.zza = r2;
        System.arraycopy(zzctVarArr, 0, r2, 0, 0);
        this.zzb = zzrkVar;
        this.zzc = zzcwVar;
        zzct[] zzctVarArr2 = {zzrkVar, zzcwVar};
    }

    public final long zza(long j2) {
        return this.zzc.zzg() ? this.zzc.zzi(j2) : j2;
    }

    public final long zzb() {
        return this.zzb.zzo();
    }

    public final zzbq zzc(zzbq zzbqVar) {
        this.zzc.zzk(zzbqVar.zzb);
        this.zzc.zzj(zzbqVar.zzc);
        return zzbqVar;
    }

    public final boolean zzd(boolean z2) {
        this.zzb.zzp(z2);
        return z2;
    }

    public final zzct[] zze() {
        return this.zza;
    }
}
