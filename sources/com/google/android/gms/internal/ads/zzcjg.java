package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
final class zzcjg extends zzezb {
    private final zzeyp zza;
    private final zzcjk zzb;
    private final zzhir zzc;
    private final zzhir zzd;
    private final zzhir zze;
    private final zzhir zzf;
    private final zzhir zzg;
    private final zzhir zzh;
    private final zzhir zzi;
    private final zzhir zzj;
    private final zzhir zzk;
    private final zzhir zzl;
    private final zzhir zzm;

    public /* synthetic */ zzcjg(zzcjk zzcjkVar, zzeyp zzeypVar, zzcjf zzcjfVar) {
        zzhir zzhirVar;
        zzhir zzhirVar2;
        zzhir zzhirVar3;
        this.zzb = zzcjkVar;
        this.zza = zzeypVar;
        zzhirVar = zzcjkVar.zzz;
        this.zzc = zzhih.zzc(new zzfmb(zzhirVar));
        zzeyx zzeyxVar = new zzeyx(zzeypVar);
        this.zzd = zzeyxVar;
        zzhir zzc = zzhih.zzc(zzdsy.zza());
        this.zze = zzc;
        zzhir zzc2 = zzhih.zzc(zzdsw.zza());
        this.zzf = zzc2;
        zzhir zzc3 = zzhih.zzc(zzdta.zza());
        this.zzg = zzc3;
        zzhir zzc4 = zzhih.zzc(zzdtc.zza());
        this.zzh = zzc4;
        zzhil zzc5 = zzhim.zzc(4);
        zzc5.zzb(zzfla.GMS_SIGNALS, zzc);
        zzc5.zzb(zzfla.BUILD_URL, zzc2);
        zzc5.zzb(zzfla.HTTP, zzc3);
        zzc5.zzb(zzfla.PRE_PROCESS, zzc4);
        zzhim zzc6 = zzc5.zzc();
        this.zzi = zzc6;
        zzhirVar2 = zzcjkVar.zzh;
        zzhir zzc7 = zzhih.zzc(new zzdtd(zzeyxVar, zzhirVar2, zzfkb.zza(), zzc6));
        this.zzj = zzc7;
        zzhiv zza = zzhiw.zza(0, 1);
        zza.zza(zzc7);
        zzhiw zzc8 = zza.zzc();
        this.zzk = zzc8;
        zzflj zzfljVar = new zzflj(zzc8);
        this.zzl = zzfljVar;
        zzfkb zza2 = zzfkb.zza();
        zzhirVar3 = zzcjkVar.zze;
        this.zzm = zzhih.zzc(new zzfli(zza2, zzhirVar3, zzfljVar));
    }

    @Override // com.google.android.gms.internal.ads.zzezb
    public final zzexk zza() {
        zzchr zzchrVar;
        zzhir zzhirVar;
        zzhir zzhirVar2;
        zzchr zzchrVar2;
        zzhir zzhirVar3;
        zzchr zzchrVar3;
        zzhir zzhirVar4;
        zzhir zzhirVar5;
        zzhir zzhirVar6;
        zzchr zzchrVar4;
        zzchr zzchrVar5;
        zzhir zzhirVar7;
        zzhir zzhirVar8;
        zzhir zzhirVar9;
        zzhir zzhirVar10;
        zzhir zzhirVar11;
        zzhir zzhirVar12;
        zzchrVar = this.zzb.zza;
        Context zzc = zzchu.zzc(zzchrVar);
        zzeyp zzeypVar = this.zza;
        zzgfz zzc2 = zzfkb.zzc();
        zzezw zzezwVar = new zzezw(zzcmu.zza(), zzfkb.zzc(), zzeyq.zza(zzeypVar));
        zzcjk zzcjkVar = this.zzb;
        zzevh zza = zzevj.zza();
        zzhirVar = zzcjkVar.zze;
        zzexh zza2 = zzfau.zza(zzezwVar, zza, (ScheduledExecutorService) zzhirVar.zzb(), 0);
        zzcjk zzcjkVar2 = this.zzb;
        zzbtq zza3 = zzcmw.zza();
        zzhirVar2 = zzcjkVar2.zze;
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) zzhirVar2.zzb();
        zzchrVar2 = this.zzb.zza;
        zzfag zzfagVar = new zzfag(zza3, scheduledExecutorService, zzchu.zzc(zzchrVar2));
        zzhirVar3 = this.zzb.zze;
        zzexh zza4 = zzfav.zza(zzfagVar, (ScheduledExecutorService) zzhirVar3.zzb());
        zzcjk zzcjkVar3 = this.zzb;
        zzbzu zza5 = zzcmy.zza();
        zzchrVar3 = zzcjkVar3.zza;
        Context zzc3 = zzchu.zzc(zzchrVar3);
        zzhirVar4 = this.zzb.zze;
        ScheduledExecutorService scheduledExecutorService2 = (ScheduledExecutorService) zzhirVar4.zzb();
        zzeyp zzeypVar2 = this.zza;
        zzeyh zza6 = zzeyj.zza(zza5, zzc3, scheduledExecutorService2, zzfkb.zzc(), zzeyr.zza(zzeypVar2), zzeyt.zza(zzeypVar2), zzeyu.zza(zzeypVar2));
        zzhirVar5 = this.zzb.zze;
        zzexh zza7 = zzfas.zza(zza6, (ScheduledExecutorService) zzhirVar5.zzb());
        zzfbe zzfbeVar = new zzfbe(zzfkb.zzc());
        zzhirVar6 = this.zzb.zze;
        zzexh zza8 = zzfaw.zza(zzfbeVar, (ScheduledExecutorService) zzhirVar6.zzb());
        zzcjk zzcjkVar4 = this.zzb;
        zzexh zza9 = zzfat.zza();
        zzbbj zza10 = zzcms.zza();
        zzgfz zzc4 = zzfkb.zzc();
        zzchrVar4 = zzcjkVar4.zza;
        zzezo zzezoVar = new zzezo(zza10, zzc4, zzchu.zzc(zzchrVar4));
        zzeyp zzeypVar3 = this.zza;
        zzeyp zzeypVar4 = this.zza;
        zzcjk zzcjkVar5 = this.zzb;
        zzeyp zzeypVar5 = this.zza;
        zzbzu zza11 = zzcmy.zza();
        int zza12 = zzeyr.zza(zzeypVar5);
        zzchrVar5 = zzcjkVar5.zza;
        Context zzc5 = zzchu.zzc(zzchrVar5);
        zzhirVar7 = this.zzb.zzai;
        zzcad zzcadVar = (zzcad) zzhirVar7.zzb();
        zzhirVar8 = this.zzb.zze;
        ScheduledExecutorService scheduledExecutorService3 = (ScheduledExecutorService) zzhirVar8.zzb();
        zzeyp zzeypVar6 = this.zza;
        zzhirVar9 = this.zzb.zzaP;
        zzeyp zzeypVar7 = this.zza;
        zzcjk zzcjkVar6 = this.zzb;
        String zza13 = zzeyq.zza(zzeypVar7);
        zzbax zza14 = zzcmq.zza();
        zzhirVar10 = zzcjkVar6.zzai;
        zzcad zzcadVar2 = (zzcad) zzhirVar10.zzb();
        zzhirVar11 = this.zzb.zze;
        zzgbc zzs = zzgbc.zzs(zza2, zza4, zza7, zza8, zza9, zzezoVar, new zzfaa(zzcmn.zza(), zzfkb.zzc(), zzeys.zza(zzeypVar3)), new zzeyn(zzcmy.zza(), zzfkb.zzc(), zzeyv.zza(zzeypVar4), zzeyw.zza(zzeypVar4), zzeyr.zza(zzeypVar4)), new zzezk(zza11, zza12, zzc5, zzcadVar, scheduledExecutorService3, zzfkb.zzc(), zzeyq.zza(zzeypVar6)), (zzexh) zzhirVar9.zzb(), zzezg.zza(zza13, zza14, zzcadVar2, (ScheduledExecutorService) zzhirVar11.zzb(), zzfkb.zzc()));
        zzfma zzfmaVar = (zzfma) this.zzc.zzb();
        zzhirVar12 = this.zzb.zzM;
        return new zzexk(zzc, zzc2, zzs, zzfmaVar, (zzdud) zzhirVar12.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzezb
    public final zzflg zzb() {
        return (zzflg) this.zzm.zzb();
    }
}
