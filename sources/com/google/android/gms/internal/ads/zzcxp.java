package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzcxp implements zzhkp {
    private final zzhlg zza;
    private final zzhlg zzb;

    public zzcxp(zzhlg zzhlgVar, zzhlg zzhlgVar2) {
        this.zza = zzhlgVar;
        this.zzb = zzhlgVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhlg
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzgbh zzn;
        zzcws zzcwsVar = (zzcws) this.zza.zzb();
        zzgge zzggeVar = zzcci.zza;
        zzhkx.zzb(zzggeVar);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzfK)).booleanValue()) {
            zzn = zzgbh.zzo(new zzdha(zzcwsVar, zzggeVar));
        } else {
            zzn = zzgbh.zzn();
        }
        zzhkx.zzb(zzn);
        return zzn;
    }
}
