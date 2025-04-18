package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class zzeta implements zzhii {
    private final zzhja zza;
    private final zzhja zzb;

    public zzeta(zzhja zzhjaVar, zzhja zzhjaVar2) {
        this.zza = zzhjaVar;
        this.zzb = zzhjaVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhja, com.google.android.gms.internal.ads.zzhiz
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzgbc zzn;
        zzeub zzb = ((zzeud) this.zza).zzb();
        Context zza = ((zzchu) this.zzb).zza();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzkY)).booleanValue()) {
            com.google.android.gms.ads.internal.zzu.zzp();
            if (com.google.android.gms.ads.internal.util.zzt.zzB(zza)) {
                zzn = zzgbc.zzo(zzb);
                zzhiq.zzb(zzn);
                return zzn;
            }
        }
        zzn = zzgbc.zzn();
        zzhiq.zzb(zzn);
        return zzn;
    }
}
