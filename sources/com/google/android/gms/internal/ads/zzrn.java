package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzrn {
    private final zzdz[] zza;
    private final zzsh zzb;
    private final zzec zzc;

    public zzrn(zzdz... zzdzVarArr) {
        zzsh zzshVar = new zzsh();
        zzec zzecVar = new zzec();
        this.zza = r2;
        System.arraycopy(zzdzVarArr, 0, r2, 0, 0);
        this.zzb = zzshVar;
        this.zzc = zzecVar;
        zzdz[] zzdzVarArr2 = {zzshVar, zzecVar};
    }

    public final long zza(long j7) {
        return this.zzc.zzi(j7);
    }

    public final long zzb() {
        return this.zzb.zzo();
    }

    public final zzcl zzc(zzcl zzclVar) {
        this.zzc.zzk(zzclVar.zzc);
        this.zzc.zzj(zzclVar.zzd);
        return zzclVar;
    }

    public final boolean zzd(boolean z8) {
        this.zzb.zzp(z8);
        return z8;
    }

    public final zzdz[] zze() {
        return this.zza;
    }
}
