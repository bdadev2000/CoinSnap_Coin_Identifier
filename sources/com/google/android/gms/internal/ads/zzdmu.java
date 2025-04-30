package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzdmu implements zzhkp {
    private final zzhlg zza;
    private final zzhlg zzb;
    private final zzhlg zzc;
    private final zzhlg zzd;
    private final zzhlg zze;
    private final zzhlg zzf;
    private final zzhlg zzg;
    private final zzhlg zzh;
    private final zzhlg zzi;

    public zzdmu(zzhlg zzhlgVar, zzhlg zzhlgVar2, zzhlg zzhlgVar3, zzhlg zzhlgVar4, zzhlg zzhlgVar5, zzhlg zzhlgVar6, zzhlg zzhlgVar7, zzhlg zzhlgVar8, zzhlg zzhlgVar9) {
        this.zza = zzhlgVar;
        this.zzb = zzhlgVar2;
        this.zzc = zzhlgVar3;
        this.zzd = zzhlgVar4;
        this.zze = zzhlgVar5;
        this.zzf = zzhlgVar6;
        this.zzg = zzhlgVar7;
        this.zzh = zzhlgVar8;
        this.zzi = zzhlgVar9;
    }

    @Override // com.google.android.gms.internal.ads.zzhlg
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzdmt zzb() {
        com.google.android.gms.ads.internal.util.zzg zzb = ((zzcjh) this.zza).zzb();
        zzfho zza = ((zzczc) this.zzb).zza();
        zzdly zzdlyVar = (zzdly) this.zzc.zzb();
        zzdlt zza2 = ((zzdmm) this.zzd).zza();
        zzdnf zzdnfVar = (zzdnf) this.zze.zzb();
        zzdnn zzdnnVar = (zzdnn) this.zzf.zzb();
        Executor executor = (Executor) this.zzg.zzb();
        zzgge zzggeVar = zzcci.zza;
        zzhkx.zzb(zzggeVar);
        return new zzdmt(zzb, zza, zzdlyVar, zza2, zzdnfVar, zzdnnVar, executor, zzggeVar, (zzdlq) this.zzi.zzb());
    }
}
