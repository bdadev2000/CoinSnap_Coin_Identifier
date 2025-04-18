package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
final class zzhbp extends zzhbn {
    @Override // com.google.android.gms.internal.ads.zzhbn
    public final /* bridge */ /* synthetic */ Object zza(Object obj) {
        zzgyx zzgyxVar = (zzgyx) obj;
        zzhbo zzhboVar = zzgyxVar.zzt;
        if (zzhboVar == zzhbo.zzc()) {
            zzhbo zzf = zzhbo.zzf();
            zzgyxVar.zzt = zzf;
            return zzf;
        }
        return zzhboVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbn
    public final /* synthetic */ Object zzb() {
        return zzhbo.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzhbn
    public final /* synthetic */ Object zzc(Object obj) {
        zzhbo zzhboVar = (zzhbo) obj;
        zzhboVar.zzh();
        return zzhboVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbn
    public final /* bridge */ /* synthetic */ void zzd(Object obj, int i10, int i11) {
        ((zzhbo) obj).zzj((i10 << 3) | 5, Integer.valueOf(i11));
    }

    @Override // com.google.android.gms.internal.ads.zzhbn
    public final /* bridge */ /* synthetic */ void zze(Object obj, int i10, long j3) {
        ((zzhbo) obj).zzj((i10 << 3) | 1, Long.valueOf(j3));
    }

    @Override // com.google.android.gms.internal.ads.zzhbn
    public final /* bridge */ /* synthetic */ void zzf(Object obj, int i10, Object obj2) {
        ((zzhbo) obj).zzj((i10 << 3) | 3, (zzhbo) obj2);
    }

    @Override // com.google.android.gms.internal.ads.zzhbn
    public final /* bridge */ /* synthetic */ void zzg(Object obj, int i10, zzgxp zzgxpVar) {
        ((zzhbo) obj).zzj((i10 << 3) | 2, zzgxpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhbn
    public final /* bridge */ /* synthetic */ void zzh(Object obj, int i10, long j3) {
        ((zzhbo) obj).zzj(i10 << 3, Long.valueOf(j3));
    }

    @Override // com.google.android.gms.internal.ads.zzhbn
    public final void zzi(Object obj) {
        ((zzgyx) obj).zzt.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzhbn
    public final /* synthetic */ void zzj(Object obj, Object obj2) {
        ((zzgyx) obj).zzt = (zzhbo) obj2;
    }
}
