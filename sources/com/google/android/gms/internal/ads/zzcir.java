package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes3.dex */
final class zzcir extends zzexc {
    private final zzeyv zza;
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
    private final zzhgg zzn;
    private final zzhgg zzo;
    private final zzhgg zzp;
    private final zzhgg zzq;
    private final zzhgg zzr;
    private final zzhgg zzs;
    private final zzhgg zzt;
    private final zzhgg zzu;
    private final zzhgg zzv;
    private final zzhgg zzw;
    private final zzhgg zzx;
    private final zzhgg zzy;

    public /* synthetic */ zzcir(zzciy zzciyVar, zzeyv zzeyvVar, zzckd zzckdVar) {
        zzhgg zzhggVar;
        zzhgg zzhggVar2;
        zzhgg zzhggVar3;
        zzhgg zzhggVar4;
        zzhgg zzhggVar5;
        zzhgg zzhggVar6;
        zzhgg zzhggVar7;
        zzhgg zzhggVar8;
        zzhgg zzhggVar9;
        zzhgg zzhggVar10;
        zzhgg zzhggVar11;
        zzhgg zzhggVar12;
        this.zzb = zzciyVar;
        this.zza = zzeyvVar;
        zzhggVar = zzciyVar.zzz;
        this.zzc = zzhfw.zzc(new zzfkm(zzhggVar));
        zzeyx zzeyxVar = new zzeyx(zzeyvVar);
        this.zzd = zzeyxVar;
        zzeyy zzeyyVar = new zzeyy(zzeyvVar);
        this.zze = zzeyyVar;
        zzeza zzezaVar = new zzeza(zzeyvVar);
        this.zzf = zzezaVar;
        zzclk zza = zzclj.zza();
        zzhggVar2 = zzciyVar.zzh;
        zzhggVar3 = zzciyVar.zze;
        this.zzg = new zzexb(zza, zzhggVar2, zzhggVar3, zzfin.zza(), zzeyxVar, zzeyyVar, zzezaVar);
        zzcle zza2 = zzcld.zza();
        zzfin zza3 = zzfin.zza();
        zzhggVar4 = zzciyVar.zzh;
        this.zzh = new zzeyc(zza2, zza3, zzhggVar4);
        zzeyw zzeywVar = new zzeyw(zzeyvVar);
        this.zzi = zzeywVar;
        this.zzj = new zzeyk(zzclf.zza(), zzfin.zza(), zzeywVar);
        zzcli zza4 = zzclh.zza();
        zzhggVar5 = zzciyVar.zze;
        zzhggVar6 = zzciyVar.zzh;
        this.zzk = new zzeyu(zza4, zzhggVar5, zzhggVar6);
        this.zzl = new zzezs(zzfin.zza());
        zzeyz zzeyzVar = new zzeyz(zzeyvVar);
        this.zzm = zzeyzVar;
        zzhggVar7 = zzciyVar.zzaj;
        zzclm zza5 = zzcll.zza();
        zzfin zza6 = zzfin.zza();
        zzhggVar8 = zzciyVar.zze;
        this.zzn = new zzezo(zzhggVar7, zzeyzVar, zzezaVar, zza5, zza6, zzeywVar, zzhggVar8);
        zzclc zza7 = zzclb.zza();
        zzhggVar9 = zzciyVar.zzaj;
        zzhggVar10 = zzciyVar.zze;
        this.zzo = new zzexy(zzeywVar, zza7, zzhggVar9, zzhggVar10, zzfin.zza());
        zzezb zzezbVar = new zzezb(zzeyvVar);
        this.zzp = zzezbVar;
        zzhgg zzc = zzhfw.zzc(zzdrh.zza());
        this.zzq = zzc;
        zzhgg zzc2 = zzhfw.zzc(zzdrf.zza());
        this.zzr = zzc2;
        zzhgg zzc3 = zzhfw.zzc(zzdrj.zza());
        this.zzs = zzc3;
        zzhgg zzc4 = zzhfw.zzc(zzdrl.zza());
        this.zzt = zzc4;
        zzhga zzc5 = zzhgb.zzc(4);
        zzc5.zzb(zzfjl.GMS_SIGNALS, zzc);
        zzc5.zzb(zzfjl.BUILD_URL, zzc2);
        zzc5.zzb(zzfjl.HTTP, zzc3);
        zzc5.zzb(zzfjl.PRE_PROCESS, zzc4);
        zzhgb zzc6 = zzc5.zzc();
        this.zzu = zzc6;
        zzhggVar11 = zzciyVar.zzh;
        zzhgg zzc7 = zzhfw.zzc(new zzdrm(zzezbVar, zzhggVar11, zzfin.zza(), zzc6));
        this.zzv = zzc7;
        zzhgk zza8 = zzhgl.zza(0, 1);
        zza8.zza(zzc7);
        zzhgl zzc8 = zza8.zzc();
        this.zzw = zzc8;
        zzfju zzfjuVar = new zzfju(zzc8);
        this.zzx = zzfjuVar;
        zzfin zza9 = zzfin.zza();
        zzhggVar12 = zzciyVar.zze;
        this.zzy = zzhfw.zzc(new zzfjt(zza9, zzhggVar12, zzfjuVar));
    }

    private final zzexf zze() {
        zzeyv zzeyvVar = this.zza;
        zzbzq zza = zzclk.zza();
        zzges zzc = zzfin.zzc();
        String zzd = zzeyvVar.zzd();
        zzeyv zzeyvVar2 = this.zza;
        return new zzexf(zza, zzc, zzd, zzeyvVar2.zzb(), zzeyvVar2.zza());
    }

    private final zzeym zzf() {
        zzeyv zzeyvVar = this.zza;
        zzbbw zza = zzckz.zza();
        zzges zzc = zzfin.zzc();
        List zzf = zzeyvVar.zzf();
        zzhgf.zzb(zzf);
        return new zzeym(zza, zzc, zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzexc
    public final zzewc zza() {
        zzchn zzchnVar;
        zzhgg zzhggVar;
        zzhgg zzhggVar2;
        zzchnVar = this.zzb.zza;
        Context zzc = zzchq.zzc(zzchnVar);
        zzciy zzciyVar = this.zzb;
        zzbzn zza = zzclg.zza();
        zzbzo zza2 = zzclm.zza();
        zzhggVar = zzciyVar.zzbh;
        Object zzb = zzhggVar.zzb();
        zzhgg zzhggVar3 = this.zzc;
        zzhgg zzhggVar4 = this.zzo;
        zzhgg zzhggVar5 = this.zzn;
        zzhgg zzhggVar6 = this.zzl;
        zzhgg zzhggVar7 = this.zzk;
        zzhgg zzhggVar8 = this.zzj;
        zzhgg zzhggVar9 = this.zzh;
        zzhgg zzhggVar10 = this.zzg;
        zzexf zze = zze();
        zzeym zzf = zzf();
        zzhfr zza3 = zzhfw.zza(zzhggVar10);
        zzhfr zza4 = zzhfw.zza(zzhggVar9);
        zzhfr zza5 = zzhfw.zza(zzhggVar8);
        zzhfr zza6 = zzhfw.zza(zzhggVar7);
        zzhfr zza7 = zzhfw.zza(zzhggVar6);
        zzhfr zza8 = zzhfw.zza(zzhggVar5);
        zzhfr zza9 = zzhfw.zza(zzhggVar4);
        zzges zzc2 = zzfin.zzc();
        zzfkl zzfklVar = (zzfkl) zzhggVar3.zzb();
        zzhggVar2 = this.zzb.zzM;
        return zzezj.zza(zzc, zza, zza2, zzb, zze, zzf, zza3, zza4, zza5, zza6, zza7, zza8, zza9, zzc2, zzfklVar, (zzdsm) zzhggVar2.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzexc
    public final zzewc zzb() {
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
        zzeyv zzeyvVar = this.zza;
        zzges zzc2 = zzfin.zzc();
        zzeyi zzeyiVar = new zzeyi(zzclg.zza(), zzfin.zzc(), zzeyw.zzc(zzeyvVar));
        zzciy zzciyVar = this.zzb;
        zzeuf zza = zzeuh.zza();
        zzhggVar = zzciyVar.zze;
        zzevz zza2 = zzezg.zza(zzeyiVar, zza, (ScheduledExecutorService) zzhggVar.zzb(), -1);
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
        zzeyv zzeyvVar2 = this.zza;
        zzewz zza6 = zzexb.zza(zza5, zzc3, scheduledExecutorService2, zzfin.zzc(), zzeyvVar2.zza(), zzeyy.zzc(zzeyvVar2), zzeza.zzc(zzeyvVar2));
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
        zzhggVar7 = this.zzb.zzbh;
        zzciy zzciyVar5 = this.zzb;
        String zzc5 = zzeyw.zzc(this.zza);
        zzbao zza11 = zzclc.zza();
        zzhggVar8 = zzciyVar5.zzaj;
        zzbzz zzbzzVar = (zzbzz) zzhggVar8.zzb();
        zzhggVar9 = this.zzb.zze;
        zzfzt zzs = zzfzt.zzs(zza2, zza4, zza7, zza8, zza9, zzeyaVar, zzf(), zze(), (zzevz) zzhggVar7.zzb(), zzexy.zza(zzc5, zza11, zzbzzVar, (ScheduledExecutorService) zzhggVar9.zzb(), zzfin.zzc()));
        zzfkl zzfklVar = (zzfkl) this.zzc.zzb();
        zzhggVar10 = this.zzb.zzM;
        return new zzewc(zzc, zzc2, zzs, zzfklVar, (zzdsm) zzhggVar10.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzexc
    public final zzfjr zzc() {
        return (zzfjr) this.zzy.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzexc
    public final zzfkl zzd() {
        return (zzfkl) this.zzc.zzb();
    }
}
