package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzhea extends zzhdy {
    @Override // com.google.android.gms.internal.ads.zzhdy
    public final /* bridge */ /* synthetic */ Object zza(Object obj) {
        zzhbe zzhbeVar = (zzhbe) obj;
        zzhdz zzhdzVar = zzhbeVar.zzt;
        if (zzhdzVar != zzhdz.zzc()) {
            return zzhdzVar;
        }
        zzhdz zzf = zzhdz.zzf();
        zzhbeVar.zzt = zzf;
        return zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzhdy
    public final /* synthetic */ Object zzb() {
        return zzhdz.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzhdy
    public final /* synthetic */ Object zzc(Object obj) {
        zzhdz zzhdzVar = (zzhdz) obj;
        zzhdzVar.zzh();
        return zzhdzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhdy
    public final /* bridge */ /* synthetic */ void zzd(Object obj, int i2, int i3) {
        ((zzhdz) obj).zzj((i2 << 3) | 5, Integer.valueOf(i3));
    }

    @Override // com.google.android.gms.internal.ads.zzhdy
    public final /* bridge */ /* synthetic */ void zze(Object obj, int i2, long j2) {
        ((zzhdz) obj).zzj((i2 << 3) | 1, Long.valueOf(j2));
    }

    @Override // com.google.android.gms.internal.ads.zzhdy
    public final /* bridge */ /* synthetic */ void zzf(Object obj, int i2, Object obj2) {
        ((zzhdz) obj).zzj((i2 << 3) | 3, (zzhdz) obj2);
    }

    @Override // com.google.android.gms.internal.ads.zzhdy
    public final /* bridge */ /* synthetic */ void zzg(Object obj, int i2, zzgzs zzgzsVar) {
        ((zzhdz) obj).zzj((i2 << 3) | 2, zzgzsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhdy
    public final /* bridge */ /* synthetic */ void zzh(Object obj, int i2, long j2) {
        ((zzhdz) obj).zzj(i2 << 3, Long.valueOf(j2));
    }

    @Override // com.google.android.gms.internal.ads.zzhdy
    public final void zzi(Object obj) {
        ((zzhbe) obj).zzt.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzhdy
    public final /* synthetic */ void zzj(Object obj, Object obj2) {
        ((zzhbe) obj).zzt = (zzhdz) obj2;
    }
}
