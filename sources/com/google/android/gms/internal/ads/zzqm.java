package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzqm {
    private final zzcm[] zza;
    private final zzre zzb;
    private final zzcp zzc;

    public zzqm(zzcm... zzcmVarArr) {
        zzre zzreVar = new zzre();
        zzcp zzcpVar = new zzcp();
        zzcm[] zzcmVarArr2 = new zzcm[2];
        this.zza = zzcmVarArr2;
        System.arraycopy(zzcmVarArr, 0, zzcmVarArr2, 0, 0);
        this.zzb = zzreVar;
        this.zzc = zzcpVar;
        zzcmVarArr2[0] = zzreVar;
    }

    public final long zza(long j3) {
        if (this.zzc.zzg()) {
            return this.zzc.zzi(j3);
        }
        return j3;
    }

    public final long zzb() {
        return this.zzb.zzo();
    }

    public final zzbj zzc(zzbj zzbjVar) {
        this.zzc.zzk(zzbjVar.zzb);
        this.zzc.zzj(zzbjVar.zzc);
        return zzbjVar;
    }

    public final boolean zzd(boolean z10) {
        this.zzb.zzp(z10);
        return z10;
    }

    public final zzcm[] zze() {
        return this.zza;
    }
}
