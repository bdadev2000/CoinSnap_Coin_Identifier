package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes3.dex */
public final class zzery implements zzhfx {
    private final zzhgp zza;

    public zzery(zzhgp zzhgpVar, zzhgp zzhgpVar2) {
        this.zza = zzhgpVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhgp, com.google.android.gms.internal.ads.zzhgo
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzfzt zzn;
        zzeqr zza = zzeqt.zza();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.zza.zzb();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzef)).booleanValue()) {
            zzn = zzfzt.zzo(new zzeun(zza, ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzeg)).intValue(), scheduledExecutorService));
        } else {
            zzn = zzfzt.zzn();
        }
        zzhgf.zzb(zzn);
        return zzn;
    }
}
