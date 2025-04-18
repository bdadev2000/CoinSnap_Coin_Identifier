package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class zzesv implements zzhii {
    private final zzhja zza;

    public zzesv(zzhja zzhjaVar, zzhja zzhjaVar2) {
        this.zza = zzhjaVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhja, com.google.android.gms.internal.ads.zzhiz
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzgbc zzn;
        zzerz zza = zzesb.zza();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.zza.zzb();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzdY)).booleanValue()) {
            zzn = zzgbc.zzo(new zzevp(zza, ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzdZ)).intValue(), scheduledExecutorService));
        } else {
            zzn = zzgbc.zzn();
        }
        zzhiq.zzb(zzn);
        return zzn;
    }
}
