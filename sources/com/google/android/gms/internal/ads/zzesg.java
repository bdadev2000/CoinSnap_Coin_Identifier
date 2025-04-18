package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes3.dex */
public final class zzesg implements zzhfx {
    private final zzhgp zza;
    private final zzhgp zzb;
    private final zzhgp zzc;

    public zzesg(zzhgp zzhgpVar, zzhgp zzhgpVar2, zzhgp zzhgpVar3, zzhgp zzhgpVar4) {
        this.zza = zzhgpVar2;
        this.zzb = zzhgpVar3;
        this.zzc = zzhgpVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzhgp, com.google.android.gms.internal.ads.zzhgo
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzets zza = zzetu.zza();
        zzeqp zzeqpVar = (zzeqp) this.zza.zzb();
        List list = (List) this.zzb.zzb();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.zzc.zzb();
        if (list.contains("24")) {
            return new zzeun(zzeqpVar, ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzlS)).intValue(), scheduledExecutorService);
        }
        return new zzeun(zza, ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzlS)).intValue(), scheduledExecutorService);
    }
}
