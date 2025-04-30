package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public final class zzcqq implements zzhkp {
    private final zzhlg zza;
    private final zzhlg zzb;
    private final zzhlg zzc;
    private final zzhlg zzd;
    private final zzhlg zze;
    private final zzhlg zzf;
    private final zzhlg zzg;
    private final zzhlg zzh;
    private final zzhlg zzi;
    private final zzhlg zzj;
    private final zzhlg zzk;
    private final zzhlg zzl;
    private final zzhlg zzm;
    private final zzhlg zzn;
    private final zzhlg zzo;

    public zzcqq(zzhlg zzhlgVar, zzhlg zzhlgVar2, zzhlg zzhlgVar3, zzhlg zzhlgVar4, zzhlg zzhlgVar5, zzhlg zzhlgVar6, zzhlg zzhlgVar7, zzhlg zzhlgVar8, zzhlg zzhlgVar9, zzhlg zzhlgVar10, zzhlg zzhlgVar11, zzhlg zzhlgVar12, zzhlg zzhlgVar13, zzhlg zzhlgVar14, zzhlg zzhlgVar15) {
        this.zza = zzhlgVar;
        this.zzb = zzhlgVar2;
        this.zzc = zzhlgVar3;
        this.zzd = zzhlgVar4;
        this.zze = zzhlgVar5;
        this.zzf = zzhlgVar6;
        this.zzg = zzhlgVar7;
        this.zzh = zzhlgVar8;
        this.zzi = zzhlgVar9;
        this.zzj = zzhlgVar10;
        this.zzk = zzhlgVar11;
        this.zzl = zzhlgVar12;
        this.zzm = zzhlgVar13;
        this.zzn = zzhlgVar14;
        this.zzo = zzhlgVar15;
    }

    @Override // com.google.android.gms.internal.ads.zzhlg
    public final /* synthetic */ Object zzb() {
        Context zza = ((zzcjj) this.zza).zza();
        zzgge zzggeVar = zzcci.zza;
        zzhkx.zzb(zzggeVar);
        return new zzcqp(zza, zzggeVar, (Executor) this.zzc.zzb(), (ScheduledExecutorService) this.zzd.zzb(), ((zzcvj) this.zze).zza(), ((zzcvg) this.zzf).zza(), (zzfoa) this.zzg.zzb(), (zzfia) this.zzh.zzb(), (View) this.zzi.zzb(), (zzchd) this.zzj.zzb(), (zzaxd) this.zzk.zzb(), (zzbfs) this.zzl.zzb(), new zzbfu(), (zzfmn) this.zzn.zzb(), ((zzcyz) this.zzo).zza());
    }
}
