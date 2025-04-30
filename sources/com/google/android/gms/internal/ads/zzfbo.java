package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public final class zzfbo implements zzhkp {
    private final zzhlg zza;
    private final zzhlg zzb;
    private final zzhlg zzc;
    private final zzhlg zzd;
    private final zzhlg zze;
    private final zzhlg zzf;
    private final zzhlg zzg;

    public zzfbo(zzhlg zzhlgVar, zzhlg zzhlgVar2, zzhlg zzhlgVar3, zzhlg zzhlgVar4, zzhlg zzhlgVar5, zzhlg zzhlgVar6, zzhlg zzhlgVar7) {
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
        zzcby zzcbyVar = (zzcby) this.zza.zzb();
        boolean booleanValue = ((zzfbc) this.zzb).zzb().booleanValue();
        boolean booleanValue2 = ((zzfbd) this.zzc).zzb().booleanValue();
        zzcbn zzcbnVar = new zzcbn();
        zzgge zzggeVar = zzcci.zza;
        zzhkx.zzb(zzggeVar);
        return new zzfbm(zzcbyVar, booleanValue, booleanValue2, zzcbnVar, zzggeVar, ((zzfaz) this.zzf).zza(), (ScheduledExecutorService) this.zzg.zzb());
    }
}
