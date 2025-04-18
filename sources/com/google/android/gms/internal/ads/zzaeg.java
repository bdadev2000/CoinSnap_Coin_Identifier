package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
final class zzaeg implements zzadq {
    final /* synthetic */ zzaej zza;
    private final long zzb;

    public zzaeg(zzaej zzaejVar, long j3) {
        this.zza = zzaejVar;
        this.zzb = j3;
    }

    @Override // com.google.android.gms.internal.ads.zzadq
    public final long zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzadq
    public final zzado zzg(long j3) {
        zzaem[] zzaemVarArr;
        zzaem[] zzaemVarArr2;
        zzaem[] zzaemVarArr3;
        zzaemVarArr = this.zza.zzi;
        zzado zza = zzaemVarArr[0].zza(j3);
        int i10 = 1;
        while (true) {
            zzaej zzaejVar = this.zza;
            zzaemVarArr2 = zzaejVar.zzi;
            if (i10 < zzaemVarArr2.length) {
                zzaemVarArr3 = zzaejVar.zzi;
                zzado zza2 = zzaemVarArr3[i10].zza(j3);
                if (zza2.zza.zzc < zza.zza.zzc) {
                    zza = zza2;
                }
                i10++;
            } else {
                return zza;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzadq
    public final boolean zzh() {
        return true;
    }
}
