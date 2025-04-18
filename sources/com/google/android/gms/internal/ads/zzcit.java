package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashSet;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes3.dex */
final class zzcit extends zzexr {
    private final zzeyo zza;
    private final zzciy zzb;
    private final zzhgg zzc;
    private final zzhgg zzd;
    private final zzhgg zze;
    private final zzhgg zzf;
    private final zzhgg zzg;
    private final zzhgg zzh;
    private final zzhgg zzi;
    private final zzhgg zzj;
    private final zzhgg zzk;
    private final zzhgg zzl;
    private final zzhgg zzm;

    public /* synthetic */ zzcit(zzciy zzciyVar, zzeyo zzeyoVar, zzckd zzckdVar) {
        zzhgg zzhggVar;
        zzhgg zzhggVar2;
        zzhgg zzhggVar3;
        this.zzb = zzciyVar;
        this.zza = zzeyoVar;
        zzeyq zzeyqVar = new zzeyq(zzeyoVar);
        this.zzc = zzeyqVar;
        zzhgg zzc = zzhfw.zzc(zzdrh.zza());
        this.zzd = zzc;
        zzhgg zzc2 = zzhfw.zzc(zzdrf.zza());
        this.zze = zzc2;
        zzhgg zzc3 = zzhfw.zzc(zzdrj.zza());
        this.zzf = zzc3;
        zzhgg zzc4 = zzhfw.zzc(zzdrl.zza());
        this.zzg = zzc4;
        zzhga zzc5 = zzhgb.zzc(4);
        zzc5.zzb(zzfjl.GMS_SIGNALS, zzc);
        zzc5.zzb(zzfjl.BUILD_URL, zzc2);
        zzc5.zzb(zzfjl.HTTP, zzc3);
        zzc5.zzb(zzfjl.PRE_PROCESS, zzc4);
        zzhgb zzc6 = zzc5.zzc();
        this.zzh = zzc6;
        zzhggVar = zzciyVar.zzh;
        zzhgg zzc7 = zzhfw.zzc(new zzdrm(zzeyqVar, zzhggVar, zzfin.zza(), zzc6));
        this.zzi = zzc7;
        zzhgk zza = zzhgl.zza(0, 1);
        zza.zza(zzc7);
        zzhgl zzc8 = zza.zzc();
        this.zzj = zzc8;
        zzfju zzfjuVar = new zzfju(zzc8);
        this.zzk = zzfjuVar;
        zzfin zza2 = zzfin.zza();
        zzhggVar2 = zzciyVar.zze;
        this.zzl = zzhfw.zzc(new zzfjt(zza2, zzhggVar2, zzfjuVar));
        zzhggVar3 = zzciyVar.zzz;
        this.zzm = zzhfw.zzc(new zzfkm(zzhggVar3));
    }

    @Override // com.google.android.gms.internal.ads.zzexr
    public final zzewc zza() {
        zzchn zzchnVar;
        zzhgg zzhggVar;
        zzhgg zzhggVar2;
        zzchnVar = this.zzb.zza;
        Context zzc = zzchq.zzc(zzchnVar);
        zzeyi zzeyiVar = new zzeyi(zzclg.zza(), zzfin.zzc(), zzeyp.zza(this.zza));
        zzciy zzciyVar = this.zzb;
        zzges zzc2 = zzfin.zzc();
        zzhggVar = zzciyVar.zze;
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) zzhggVar.zzb();
        zzfkl zzfklVar = (zzfkl) this.zzm.zzb();
        zzhggVar2 = this.zzb.zzM;
        zzdsm zzdsmVar = (zzdsm) zzhggVar2.zzb();
        HashSet hashSet = new HashSet();
        hashSet.add(new zzeun(zzeyiVar, 0L, scheduledExecutorService));
        return new zzewc(zzc, zzc2, hashSet, zzfklVar, zzdsmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzexr
    public final zzfjr zzb() {
        return (zzfjr) this.zzl.zzb();
    }
}
