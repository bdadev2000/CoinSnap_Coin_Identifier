package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzcwi implements zzhkp {
    private final zzhlg zza;

    public zzcwi(zzhlg zzhlgVar) {
        this.zza = zzhlgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhlg
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzgbh zzn;
        zzcwu zzcwuVar = (zzcwu) this.zza.zzb();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzfK)).booleanValue()) {
            zzn = zzgbh.zzo(new zzdha(zzcwuVar, zzcci.zzf));
        } else {
            zzn = zzgbh.zzn();
        }
        zzhkx.zzb(zzn);
        return zzn;
    }
}
