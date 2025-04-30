package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashSet;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
final class zzcks extends zzezk {
    private final zzfar zza;
    private final zzcla zzb;
    private final zzcks zzc = this;
    private final zzhky zzd;
    private final zzhky zze;
    private final zzhky zzf;
    private final zzhky zzg;
    private final zzhky zzh;
    private final zzhky zzi;
    private final zzhky zzj;
    private final zzhky zzk;
    private final zzhky zzl;
    private final zzhky zzm;
    private final zzhky zzn;

    public /* synthetic */ zzcks(zzcla zzclaVar, zzfar zzfarVar, zzckr zzckrVar) {
        zzhky zzhkyVar;
        zzhky zzhkyVar2;
        zzhky zzhkyVar3;
        this.zzb = zzclaVar;
        this.zza = zzfarVar;
        zzfat zzfatVar = new zzfat(zzfarVar);
        this.zzd = zzfatVar;
        zzhky zzc = zzhko.zzc(zzdtx.zza());
        this.zze = zzc;
        zzhky zzc2 = zzhko.zzc(zzdtv.zza());
        this.zzf = zzc2;
        zzhky zzc3 = zzhko.zzc(zzdtz.zza());
        this.zzg = zzc3;
        zzhky zzc4 = zzhko.zzc(zzdub.zza());
        this.zzh = zzc4;
        zzhks zzc5 = zzhkt.zzc(4);
        zzc5.zzb(zzfln.GMS_SIGNALS, zzc);
        zzc5.zzb(zzfln.BUILD_URL, zzc2);
        zzc5.zzb(zzfln.HTTP, zzc3);
        zzc5.zzb(zzfln.PRE_PROCESS, zzc4);
        zzhkt zzc6 = zzc5.zzc();
        this.zzi = zzc6;
        zzhkyVar = zzclaVar.zzh;
        zzhky zzc7 = zzhko.zzc(new zzduc(zzfatVar, zzhkyVar, zzfko.zza(), zzc6));
        this.zzj = zzc7;
        zzhlc zza = zzhld.zza(0, 1);
        zza.zza(zzc7);
        zzhld zzc8 = zza.zzc();
        this.zzk = zzc8;
        zzflw zzflwVar = new zzflw(zzc8);
        this.zzl = zzflwVar;
        zzfko zza2 = zzfko.zza();
        zzhkyVar2 = zzclaVar.zze;
        this.zzm = zzhko.zzc(new zzflv(zza2, zzhkyVar2, zzflwVar));
        zzhkyVar3 = zzclaVar.zzz;
        this.zzn = zzhko.zzc(new zzfmo(zzhkyVar3));
    }

    @Override // com.google.android.gms.internal.ads.zzezk
    public final zzexz zza() {
        zzcjg zzcjgVar;
        zzhky zzhkyVar;
        zzhky zzhkyVar2;
        zzcjgVar = this.zzb.zza;
        Context zzb = zzcjgVar.zzb();
        zzhkx.zzb(zzb);
        zzcbm zzcbmVar = new zzcbm();
        zzgge zzggeVar = zzcci.zza;
        zzhkx.zzb(zzggeVar);
        zzfal zzfalVar = new zzfal(zzcbmVar, zzggeVar, zzfas.zza(this.zza));
        zzhkx.zzb(zzggeVar);
        zzhkyVar = this.zzb.zze;
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) zzhkyVar.zzb();
        zzfmn zzfmnVar = (zzfmn) this.zzn.zzb();
        zzhkyVar2 = this.zzb.zzM;
        zzdvc zzdvcVar = (zzdvc) zzhkyVar2.zzb();
        HashSet hashSet = new HashSet();
        hashSet.add(new zzewe(zzfalVar, 0L, scheduledExecutorService));
        return new zzexz(zzb, zzggeVar, hashSet, zzfmnVar, zzdvcVar);
    }

    @Override // com.google.android.gms.internal.ads.zzezk
    public final zzflt zzb() {
        return (zzflt) this.zzm.zzb();
    }
}
