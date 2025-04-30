package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzafk implements zzaet {
    final /* synthetic */ zzafn zza;
    private final long zzb;

    public zzafk(zzafn zzafnVar, long j7) {
        this.zza = zzafnVar;
        this.zzb = j7;
    }

    @Override // com.google.android.gms.internal.ads.zzaet
    public final long zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzaet
    public final zzaer zzg(long j7) {
        zzafq[] zzafqVarArr;
        zzafq[] zzafqVarArr2;
        zzafq[] zzafqVarArr3;
        zzafqVarArr = this.zza.zzh;
        zzaer zza = zzafqVarArr[0].zza(j7);
        int i9 = 1;
        while (true) {
            zzafn zzafnVar = this.zza;
            zzafqVarArr2 = zzafnVar.zzh;
            if (i9 < zzafqVarArr2.length) {
                zzafqVarArr3 = zzafnVar.zzh;
                zzaer zza2 = zzafqVarArr3[i9].zza(j7);
                if (zza2.zza.zzc < zza.zza.zzc) {
                    zza = zza2;
                }
                i9++;
            } else {
                return zza;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaet
    public final boolean zzh() {
        return true;
    }
}
