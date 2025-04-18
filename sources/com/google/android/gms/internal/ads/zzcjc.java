package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashSet;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
final class zzcjc extends zzeyz {
    private final zzfac zza;
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

    public /* synthetic */ zzcjc(zzcjk zzcjkVar, zzfac zzfacVar, zzcjb zzcjbVar) {
        zzhir zzhirVar;
        zzhir zzhirVar2;
        zzhir zzhirVar3;
        this.zzb = zzcjkVar;
        this.zza = zzfacVar;
        zzfae zzfaeVar = new zzfae(zzfacVar);
        this.zzc = zzfaeVar;
        zzhir zzc = zzhih.zzc(zzdsy.zza());
        this.zzd = zzc;
        zzhir zzc2 = zzhih.zzc(zzdsw.zza());
        this.zze = zzc2;
        zzhir zzc3 = zzhih.zzc(zzdta.zza());
        this.zzf = zzc3;
        zzhir zzc4 = zzhih.zzc(zzdtc.zza());
        this.zzg = zzc4;
        zzhil zzc5 = zzhim.zzc(4);
        zzc5.zzb(zzfla.GMS_SIGNALS, zzc);
        zzc5.zzb(zzfla.BUILD_URL, zzc2);
        zzc5.zzb(zzfla.HTTP, zzc3);
        zzc5.zzb(zzfla.PRE_PROCESS, zzc4);
        zzhim zzc6 = zzc5.zzc();
        this.zzh = zzc6;
        zzhirVar = zzcjkVar.zzh;
        zzhir zzc7 = zzhih.zzc(new zzdtd(zzfaeVar, zzhirVar, zzfkb.zza(), zzc6));
        this.zzi = zzc7;
        zzhiv zza = zzhiw.zza(0, 1);
        zza.zza(zzc7);
        zzhiw zzc8 = zza.zzc();
        this.zzj = zzc8;
        zzflj zzfljVar = new zzflj(zzc8);
        this.zzk = zzfljVar;
        zzfkb zza2 = zzfkb.zza();
        zzhirVar2 = zzcjkVar.zze;
        this.zzl = zzhih.zzc(new zzfli(zza2, zzhirVar2, zzfljVar));
        zzhirVar3 = zzcjkVar.zzz;
        this.zzm = zzhih.zzc(new zzfmb(zzhirVar3));
    }

    @Override // com.google.android.gms.internal.ads.zzeyz
    public final zzexk zza() {
        zzchr zzchrVar;
        zzhir zzhirVar;
        zzhir zzhirVar2;
        zzchrVar = this.zzb.zza;
        Context zzc = zzchu.zzc(zzchrVar);
        zzezw zzezwVar = new zzezw(zzcmu.zza(), zzfkb.zzc(), zzfad.zza(this.zza));
        zzcjk zzcjkVar = this.zzb;
        zzgfz zzc2 = zzfkb.zzc();
        zzhirVar = zzcjkVar.zze;
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) zzhirVar.zzb();
        zzfma zzfmaVar = (zzfma) this.zzm.zzb();
        zzhirVar2 = this.zzb.zzM;
        zzdud zzdudVar = (zzdud) zzhirVar2.zzb();
        HashSet hashSet = new HashSet();
        hashSet.add(new zzevp(zzezwVar, 0L, scheduledExecutorService));
        return new zzexk(zzc, zzc2, hashSet, zzfmaVar, zzdudVar);
    }

    @Override // com.google.android.gms.internal.ads.zzeyz
    public final zzflg zzb() {
        return (zzflg) this.zzl.zzb();
    }
}
