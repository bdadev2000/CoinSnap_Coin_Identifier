package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
public final class zzett implements zzhkp {
    private final zzhlg zza;
    private final zzhlg zzb;

    public zzett(zzhlg zzhlgVar, zzhlg zzhlgVar2) {
        this.zza = zzhlgVar;
        this.zzb = zzhlgVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhlg
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzgbh zzn;
        zzeut zzb = ((zzeuv) this.zza).zzb();
        Context zza = ((zzcjj) this.zzb).zza();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzlr)).booleanValue()) {
            com.google.android.gms.ads.internal.zzu.zzp();
            if (com.google.android.gms.ads.internal.util.zzt.zzB(zza)) {
                zzn = zzgbh.zzo(zzb);
                zzhkx.zzb(zzn);
                return zzn;
            }
        }
        zzn = zzgbh.zzn();
        zzhkx.zzb(zzn);
        return zzn;
    }
}
