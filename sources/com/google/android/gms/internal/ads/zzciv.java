package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes3.dex */
final class zzciv extends zzext {
    private final zzexh zza;
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

    public /* synthetic */ zzciv(zzciy zzciyVar, zzexh zzexhVar, zzckd zzckdVar) {
        zzhgg zzhggVar;
        zzhgg zzhggVar2;
        zzhgg zzhggVar3;
        this.zzb = zzciyVar;
        this.zza = zzexhVar;
        zzhggVar = zzciyVar.zzz;
        this.zzc = zzhfw.zzc(new zzfkm(zzhggVar));
        zzexp zzexpVar = new zzexp(zzexhVar);
        this.zzd = zzexpVar;
        zzhgg zzc = zzhfw.zzc(zzdrh.zza());
        this.zze = zzc;
        zzhgg zzc2 = zzhfw.zzc(zzdrf.zza());
        this.zzf = zzc2;
        zzhgg zzc3 = zzhfw.zzc(zzdrj.zza());
        this.zzg = zzc3;
        zzhgg zzc4 = zzhfw.zzc(zzdrl.zza());
        this.zzh = zzc4;
        zzhga zzc5 = zzhgb.zzc(4);
        zzc5.zzb(zzfjl.GMS_SIGNALS, zzc);
        zzc5.zzb(zzfjl.BUILD_URL, zzc2);
        zzc5.zzb(zzfjl.HTTP, zzc3);
        zzc5.zzb(zzfjl.PRE_PROCESS, zzc4);
        zzhgb zzc6 = zzc5.zzc();
        this.zzi = zzc6;
        zzhggVar2 = zzciyVar.zzh;
        zzhgg zzc7 = zzhfw.zzc(new zzdrm(zzexpVar, zzhggVar2, zzfin.zza(), zzc6));
        this.zzj = zzc7;
        zzhgk zza = zzhgl.zza(0, 1);
        zza.zza(zzc7);
        zzhgl zzc8 = zza.zzc();
        this.zzk = zzc8;
        zzfju zzfjuVar = new zzfju(zzc8);
        this.zzl = zzfjuVar;
        zzfin zza2 = zzfin.zza();
        zzhggVar3 = zzciyVar.zze;
        this.zzm = zzhfw.zzc(new zzfjt(zza2, zzhggVar3, zzfjuVar));
    }

    @Override // com.google.android.gms.internal.ads.zzext
    public final zzewc zza() {
        zzchn zzchnVar;
        zzhgg zzhggVar;
        zzhgg zzhggVar2;
        zzchn zzchnVar2;
        zzhgg zzhggVar3;
        zzchn zzchnVar3;
        zzhgg zzhggVar4;
        zzhgg zzhggVar5;
        zzhgg zzhggVar6;
        zzchn zzchnVar4;
        zzhgg zzhggVar7;
        zzhgg zzhggVar8;
        zzhgg zzhggVar9;
        zzhgg zzhggVar10;
        zzchnVar = this.zzb.zza;
        Context zzc = zzchq.zzc(zzchnVar);
        zzexh zzexhVar = this.zza;
        zzges zzc2 = zzfin.zzc();
        zzeyi zzeyiVar = new zzeyi(zzclg.zza(), zzfin.zzc(), zzexi.zza(zzexhVar));
        zzciy zzciyVar = this.zzb;
        zzeuf zza = zzeuh.zza();
        zzhggVar = zzciyVar.zze;
        zzevz zza2 = zzezg.zza(zzeyiVar, zza, (ScheduledExecutorService) zzhggVar.zzb(), 0);
        zzciy zzciyVar2 = this.zzb;
        zzbtk zza3 = zzcli.zza();
        zzhggVar2 = zzciyVar2.zze;
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) zzhggVar2.zzb();
        zzchnVar2 = this.zzb.zza;
        zzeys zzeysVar = new zzeys(zza3, scheduledExecutorService, zzchq.zzc(zzchnVar2));
        zzhggVar3 = this.zzb.zze;
        zzevz zza4 = zzezh.zza(zzeysVar, (ScheduledExecutorService) zzhggVar3.zzb());
        zzciy zzciyVar3 = this.zzb;
        zzbzq zza5 = zzclk.zza();
        zzchnVar3 = zzciyVar3.zza;
        Context zzc3 = zzchq.zzc(zzchnVar3);
        zzhggVar4 = this.zzb.zze;
        ScheduledExecutorService scheduledExecutorService2 = (ScheduledExecutorService) zzhggVar4.zzb();
        zzexh zzexhVar2 = this.zza;
        zzewz zza6 = zzexb.zza(zza5, zzc3, scheduledExecutorService2, zzfin.zzc(), zzexj.zza(zzexhVar2), zzexl.zza(zzexhVar2), zzexm.zza(zzexhVar2));
        zzhggVar5 = this.zzb.zze;
        zzevz zza7 = zzeze.zza(zza6, (ScheduledExecutorService) zzhggVar5.zzb());
        zzezq zzezqVar = new zzezq(zzfin.zzc());
        zzhggVar6 = this.zzb.zze;
        zzevz zza8 = zzezi.zza(zzezqVar, (ScheduledExecutorService) zzhggVar6.zzb());
        zzciy zzciyVar4 = this.zzb;
        zzevz zza9 = zzezf.zza();
        zzbba zza10 = zzcle.zza();
        zzges zzc4 = zzfin.zzc();
        zzchnVar4 = zzciyVar4.zza;
        zzeya zzeyaVar = new zzeya(zza10, zzc4, zzchq.zzc(zzchnVar4));
        zzexh zzexhVar3 = this.zza;
        zzexh zzexhVar4 = this.zza;
        zzhggVar7 = this.zzb.zzbh;
        zzciy zzciyVar5 = this.zzb;
        String zza11 = zzexi.zza(this.zza);
        zzbao zza12 = zzclc.zza();
        zzhggVar8 = zzciyVar5.zzaj;
        zzbzz zzbzzVar = (zzbzz) zzhggVar8.zzb();
        zzhggVar9 = this.zzb.zze;
        zzfzt zzs = zzfzt.zzs(zza2, zza4, zza7, zza8, zza9, zzeyaVar, new zzeym(zzckz.zza(), zzfin.zzc(), zzexk.zza(zzexhVar3)), new zzexf(zzclk.zza(), zzfin.zzc(), zzexn.zza(zzexhVar4), zzexo.zza(zzexhVar4), zzexj.zza(zzexhVar4)), (zzevz) zzhggVar7.zzb(), zzexy.zza(zza11, zza12, zzbzzVar, (ScheduledExecutorService) zzhggVar9.zzb(), zzfin.zzc()));
        zzfkl zzfklVar = (zzfkl) this.zzc.zzb();
        zzhggVar10 = this.zzb.zzM;
        return new zzewc(zzc, zzc2, zzs, zzfklVar, (zzdsm) zzhggVar10.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzext
    public final zzfjr zzb() {
        return (zzfjr) this.zzm.zzb();
    }
}
