package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzaeq implements zzaea {
    final /* synthetic */ zzaet zza;
    private final long zzb;

    public zzaeq(zzaet zzaetVar, long j2) {
        this.zza = zzaetVar;
        this.zzb = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzaea
    public final long zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzaea
    public final zzady zzg(long j2) {
        zzaew[] zzaewVarArr;
        zzaew[] zzaewVarArr2;
        zzaew[] zzaewVarArr3;
        zzaewVarArr = this.zza.zzi;
        zzady zza = zzaewVarArr[0].zza(j2);
        int i2 = 1;
        while (true) {
            zzaet zzaetVar = this.zza;
            zzaewVarArr2 = zzaetVar.zzi;
            if (i2 >= zzaewVarArr2.length) {
                return zza;
            }
            zzaewVarArr3 = zzaetVar.zzi;
            zzady zza2 = zzaewVarArr3[i2].zza(j2);
            if (zza2.zza.zzc < zza.zza.zzc) {
                zza = zza2;
            }
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaea
    public final boolean zzh() {
        return true;
    }
}
