package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzcss implements zzhkp {
    private final zzcsm zza;
    private final zzhlg zzb;

    public zzcss(zzcsm zzcsmVar, zzhlg zzhlgVar) {
        this.zza = zzcsmVar;
        this.zzb = zzhlgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhlg
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzgbh zzn;
        zzctr zzb = ((zzcts) this.zzb).zzb();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzmA)).booleanValue()) {
            zzn = zzgbh.zzo(new zzdha(zzb, zzcci.zza));
        } else {
            zzn = zzgbh.zzn();
        }
        zzhkx.zzb(zzn);
        return zzn;
    }
}
