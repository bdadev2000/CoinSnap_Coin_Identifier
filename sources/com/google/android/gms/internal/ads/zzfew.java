package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import androidx.annotation.Nullable;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzfew implements zzeps {
    private final Context zza;
    private final Executor zzb;
    private final zzcjd zzc;
    private final zzepc zzd;
    private final zzffw zze;

    @Nullable
    private zzbfk zzf;
    private final zzfmq zzg;
    private final zzfhm zzh;
    private f4.c zzi;

    public zzfew(Context context, Executor executor, zzcjd zzcjdVar, zzepc zzepcVar, zzffw zzffwVar, zzfhm zzfhmVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzcjdVar;
        this.zzd = zzepcVar;
        this.zzh = zzfhmVar;
        this.zze = zzffwVar;
        this.zzg = zzcjdVar.zzz();
    }

    @Override // com.google.android.gms.internal.ads.zzeps
    public final boolean zza() {
        f4.c cVar = this.zzi;
        if (cVar != null && !cVar.isDone()) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzeps
    public final boolean zzb(com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzepq zzepqVar, zzepr zzeprVar) {
        zzdjh zzh;
        zzfmn zzfmnVar;
        if (str == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzg("Ad unit ID should not be null for interstitial ad.");
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfeq
                @Override // java.lang.Runnable
                public final void run() {
                    zzfew.this.zzh();
                }
            });
            return false;
        }
        if (zza()) {
            return false;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zziU)).booleanValue() && zzlVar.zzf) {
            this.zzc.zzl().zzo(true);
        }
        com.google.android.gms.ads.internal.client.zzq zzqVar = ((zzfep) zzepqVar).zza;
        Bundle zza = zzdun.zza(new Pair(zzdul.PUBLIC_API_CALL.zza(), Long.valueOf(zzlVar.zzz)), new Pair(zzdul.DYNAMITE_ENTER.zza(), Long.valueOf(com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis())));
        zzfhm zzfhmVar = this.zzh;
        zzfhmVar.zzt(str);
        zzfhmVar.zzs(zzqVar);
        zzfhmVar.zzH(zzlVar);
        zzfhmVar.zzA(zza);
        Context context = this.zza;
        zzfho zzJ = zzfhmVar.zzJ();
        zzfmu zza2 = zzfmm.zza(zzJ);
        zzfmw zzfmwVar = zzfmw.FORMAT_INTERSTITIAL;
        zzfmc zzb = zzfmb.zzb(context, zza2, zzfmwVar, zzlVar);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzim)).booleanValue()) {
            zzdjg zzg = this.zzc.zzg();
            zzcyt zzcytVar = new zzcyt();
            zzcytVar.zze(this.zza);
            zzcytVar.zzi(zzJ);
            zzg.zze(zzcytVar.zzj());
            zzdfa zzdfaVar = new zzdfa();
            zzdfaVar.zzj(this.zzd, this.zzb);
            zzdfaVar.zzk(this.zzd, this.zzb);
            zzg.zzd(zzdfaVar.zzn());
            zzg.zzc(new zzenl(this.zzf));
            zzh = zzg.zzh();
        } else {
            zzdfa zzdfaVar2 = new zzdfa();
            zzffw zzffwVar = this.zze;
            if (zzffwVar != null) {
                zzdfaVar2.zze(zzffwVar, this.zzb);
                zzdfaVar2.zzf(this.zze, this.zzb);
                zzdfaVar2.zzb(this.zze, this.zzb);
            }
            zzdjg zzg2 = this.zzc.zzg();
            zzcyt zzcytVar2 = new zzcyt();
            zzcytVar2.zze(this.zza);
            zzcytVar2.zzi(zzJ);
            zzg2.zze(zzcytVar2.zzj());
            zzdfaVar2.zzj(this.zzd, this.zzb);
            zzdfaVar2.zze(this.zzd, this.zzb);
            zzdfaVar2.zzf(this.zzd, this.zzb);
            zzdfaVar2.zzb(this.zzd, this.zzb);
            zzdfaVar2.zza(this.zzd, this.zzb);
            zzdfaVar2.zzl(this.zzd, this.zzb);
            zzdfaVar2.zzk(this.zzd, this.zzb);
            zzdfaVar2.zzi(this.zzd, this.zzb);
            zzdfaVar2.zzc(this.zzd, this.zzb);
            zzg2.zzd(zzdfaVar2.zzn());
            zzg2.zzc(new zzenl(this.zzf));
            zzh = zzg2.zzh();
        }
        zzdjh zzdjhVar = zzh;
        if (((Boolean) zzbgd.zzc.zze()).booleanValue()) {
            zzfmn zzf = zzdjhVar.zzf();
            zzf.zzd(zzfmwVar);
            zzf.zzb(zzlVar.zzp);
            zzf.zzg(zzlVar.zzm);
            zzfmnVar = zzf;
        } else {
            zzfmnVar = null;
        }
        zzcvx zza3 = zzdjhVar.zza();
        f4.c zzi = zza3.zzi(zza3.zzj());
        this.zzi = zzi;
        zzgft.zzr(zzi, new zzfev(this, zzeprVar, zzfmnVar, zzb, zzdjhVar), this.zzb);
        return true;
    }

    public final /* synthetic */ void zzh() {
        this.zzd.zzdB(zzfiq.zzd(6, null, null));
    }

    public final void zzi(zzbfk zzbfkVar) {
        this.zzf = zzbfkVar;
    }
}
