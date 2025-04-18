package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes3.dex */
public final class zzert implements zzhfx {
    private final zzhgp zza;
    private final zzhgp zzb;
    private final zzhgp zzc;
    private final zzhgp zzd;

    public zzert(zzhgp zzhgpVar, zzhgp zzhgpVar2, zzhgp zzhgpVar3, zzhgp zzhgpVar4) {
        this.zza = zzhgpVar;
        this.zzb = zzhgpVar2;
        this.zzc = zzhgpVar3;
        this.zzd = zzhgpVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzhgp, com.google.android.gms.internal.ads.zzhgo
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzepi zzb = ((zzepk) this.zza).zzb();
        zzeqp zzeqpVar = (zzeqp) this.zzb.zzb();
        List list = (List) this.zzc.zzb();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.zzd.zzb();
        if (list.contains("10")) {
            return new zzeun(zzeqpVar, ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzlQ)).intValue(), scheduledExecutorService);
        }
        return new zzeun(zzb, ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzlQ)).intValue(), scheduledExecutorService);
    }
}
