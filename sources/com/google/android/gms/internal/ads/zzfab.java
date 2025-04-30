package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public final class zzfab implements zzhkp {
    private final zzhlg zza;
    private final zzhlg zzb;
    private final zzhlg zzc;
    private final zzhlg zzd;
    private final zzhlg zze;
    private final zzhlg zzf;
    private final zzhlg zzg;

    public zzfab(zzhlg zzhlgVar, zzhlg zzhlgVar2, zzhlg zzhlgVar3, zzhlg zzhlgVar4, zzhlg zzhlgVar5, zzhlg zzhlgVar6, zzhlg zzhlgVar7) {
        this.zza = zzhlgVar;
        this.zzb = zzhlgVar2;
        this.zzc = zzhlgVar3;
        this.zzd = zzhlgVar4;
        this.zze = zzhlgVar5;
        this.zzf = zzhlgVar6;
        this.zzg = zzhlgVar7;
    }

    @Override // com.google.android.gms.internal.ads.zzhlg
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzcbp zzcbpVar = new zzcbp();
        int intValue = ((zzfba) this.zzb).zzb().intValue();
        Context zza = ((zzcjj) this.zzc).zza();
        zzcby zzcbyVar = (zzcby) this.zzd.zzb();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.zze.zzb();
        zzgge zzggeVar = zzcci.zza;
        zzhkx.zzb(zzggeVar);
        return new zzezz(zzcbpVar, intValue, zza, zzcbyVar, scheduledExecutorService, zzggeVar, ((zzfaz) this.zzg).zza());
    }
}
