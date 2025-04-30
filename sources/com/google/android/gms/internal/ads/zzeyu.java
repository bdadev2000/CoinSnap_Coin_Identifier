package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public final class zzeyu implements zzhkp {
    private final zzhlg zza;
    private final zzhlg zzb;
    private final zzhlg zzc;
    private final zzhlg zzd;
    private final zzhlg zze;
    private final zzhlg zzf;
    private final zzhlg zzg;

    public zzeyu(zzhlg zzhlgVar, zzhlg zzhlgVar2, zzhlg zzhlgVar3, zzhlg zzhlgVar4, zzhlg zzhlgVar5, zzhlg zzhlgVar6, zzhlg zzhlgVar7) {
        this.zza = zzhlgVar;
        this.zzb = zzhlgVar2;
        this.zzc = zzhlgVar3;
        this.zzd = zzhlgVar4;
        this.zze = zzhlgVar5;
        this.zzf = zzhlgVar6;
        this.zzg = zzhlgVar7;
    }

    public static zzeys zza(zzcbp zzcbpVar, Context context, ScheduledExecutorService scheduledExecutorService, Executor executor, int i9, boolean z8, boolean z9) {
        return new zzeys(zzcbpVar, context, scheduledExecutorService, executor, i9, z8, z9);
    }

    @Override // com.google.android.gms.internal.ads.zzhlg
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzcbp zzcbpVar = new zzcbp();
        Context zza = ((zzcjj) this.zzb).zza();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.zzc.zzb();
        zzgge zzggeVar = zzcci.zza;
        zzhkx.zzb(zzggeVar);
        return new zzeys(zzcbpVar, zza, scheduledExecutorService, zzggeVar, ((zzfba) this.zze).zzb().intValue(), ((zzfbb) this.zzf).zzb().booleanValue(), ((zzfbd) this.zzg).zzb().booleanValue());
    }
}
