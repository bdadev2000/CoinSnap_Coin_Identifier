package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public final class zzezv implements zzhkp {
    private final zzhlg zza;
    private final zzhlg zzb;
    private final zzhlg zzc;
    private final zzhlg zzd;
    private final zzhlg zze;

    public zzezv(zzhlg zzhlgVar, zzhlg zzhlgVar2, zzhlg zzhlgVar3, zzhlg zzhlgVar4, zzhlg zzhlgVar5) {
        this.zza = zzhlgVar;
        this.zzb = zzhlgVar2;
        this.zzc = zzhlgVar3;
        this.zzd = zzhlgVar4;
        this.zze = zzhlgVar5;
    }

    public static zzezt zza(String str, zzbcp zzbcpVar, zzcby zzcbyVar, ScheduledExecutorService scheduledExecutorService, zzgge zzggeVar) {
        return new zzezt(str, zzbcpVar, zzcbyVar, scheduledExecutorService, zzggeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhlg
    public final /* bridge */ /* synthetic */ Object zzb() {
        String zza = ((zzfaz) this.zza).zza();
        zzbcp zzbcpVar = new zzbcp();
        zzcby zzcbyVar = (zzcby) this.zzc.zzb();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.zzd.zzb();
        zzgge zzggeVar = zzcci.zza;
        zzhkx.zzb(zzggeVar);
        return new zzezt(zza, zzbcpVar, zzcbyVar, scheduledExecutorService, zzggeVar);
    }
}
