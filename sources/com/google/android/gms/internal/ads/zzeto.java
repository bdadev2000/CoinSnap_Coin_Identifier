package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public final class zzeto implements zzhkp {
    private final zzhlg zza;
    private final zzhlg zzb;

    public zzeto(zzhlg zzhlgVar, zzhlg zzhlgVar2) {
        this.zza = zzhlgVar;
        this.zzb = zzhlgVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhlg
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzgbh zzn;
        zzesw zza = zzesy.zza();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.zzb.zzb();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzea)).booleanValue()) {
            zzn = zzgbh.zzo(new zzewe(zza, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzeb)).intValue(), scheduledExecutorService));
        } else {
            zzn = zzgbh.zzn();
        }
        zzhkx.zzb(zzn);
        return zzn;
    }
}
