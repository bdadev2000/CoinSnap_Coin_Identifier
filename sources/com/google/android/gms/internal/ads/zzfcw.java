package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import androidx.annotation.Nullable;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class zzfcw implements zzeni {
    private final Context zza;
    private final Executor zzb;
    private final zzchk zzc;
    private final zzems zzd;
    private final zzfdw zze;

    @Nullable
    private zzbdi zzf;
    private final zzfko zzg;
    private final zzffm zzh;
    private ua.b zzi;

    public zzfcw(Context context, Executor executor, zzchk zzchkVar, zzems zzemsVar, zzfdw zzfdwVar, zzffm zzffmVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzchkVar;
        this.zzd = zzemsVar;
        this.zzh = zzffmVar;
        this.zze = zzfdwVar;
        this.zzg = zzchkVar.zzz();
    }

    @Override // com.google.android.gms.internal.ads.zzeni
    public final boolean zza() {
        ua.b bVar = this.zzi;
        return (bVar == null || bVar.isDone()) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzeni
    public final boolean zzb(com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzeng zzengVar, zzenh zzenhVar) {
        zzdgn zzh;
        zzfkl zzfklVar;
        if (str == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzg("Ad unit ID should not be null for interstitial ad.");
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfcq
                @Override // java.lang.Runnable
                public final void run() {
                    zzfcw.this.zzh();
                }
            });
            return false;
        }
        if (zza()) {
            return false;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zziz)).booleanValue() && zzmVar.zzf) {
            this.zzc.zzl().zzo(true);
        }
        com.google.android.gms.ads.internal.client.zzs zzsVar = ((zzfcp) zzengVar).zza;
        Bundle zza = zzdrx.zza(new Pair(zzdrv.PUBLIC_API_CALL.zza(), Long.valueOf(zzmVar.zzz)), new Pair(zzdrv.DYNAMITE_ENTER.zza(), Long.valueOf(com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis())));
        zzffm zzffmVar = this.zzh;
        zzffmVar.zzt(str);
        zzffmVar.zzs(zzsVar);
        zzffmVar.zzH(zzmVar);
        zzffmVar.zzA(zza);
        Context context = this.zza;
        zzffo zzJ = zzffmVar.zzJ();
        zzfka zzb = zzfjz.zzb(context, zzfkk.zzf(zzJ), 4, zzmVar);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzhQ)).booleanValue()) {
            zzdgm zzg = this.zzc.zzg();
            zzcvu zzcvuVar = new zzcvu();
            zzcvuVar.zze(this.zza);
            zzcvuVar.zzi(zzJ);
            zzg.zze(zzcvuVar.zzj());
            zzdcd zzdcdVar = new zzdcd();
            zzdcdVar.zzj(this.zzd, this.zzb);
            zzdcdVar.zzk(this.zzd, this.zzb);
            zzg.zzd(zzdcdVar.zzn());
            zzg.zzc(new zzelb(this.zzf));
            zzh = zzg.zzh();
        } else {
            zzdcd zzdcdVar2 = new zzdcd();
            zzfdw zzfdwVar = this.zze;
            if (zzfdwVar != null) {
                zzdcdVar2.zze(zzfdwVar, this.zzb);
                zzdcdVar2.zzf(this.zze, this.zzb);
                zzdcdVar2.zzb(this.zze, this.zzb);
            }
            zzdgm zzg2 = this.zzc.zzg();
            zzcvu zzcvuVar2 = new zzcvu();
            zzcvuVar2.zze(this.zza);
            zzcvuVar2.zzi(zzJ);
            zzg2.zze(zzcvuVar2.zzj());
            zzdcdVar2.zzj(this.zzd, this.zzb);
            zzdcdVar2.zze(this.zzd, this.zzb);
            zzdcdVar2.zzf(this.zzd, this.zzb);
            zzdcdVar2.zzb(this.zzd, this.zzb);
            zzdcdVar2.zza(this.zzd, this.zzb);
            zzdcdVar2.zzl(this.zzd, this.zzb);
            zzdcdVar2.zzk(this.zzd, this.zzb);
            zzdcdVar2.zzi(this.zzd, this.zzb);
            zzdcdVar2.zzc(this.zzd, this.zzb);
            zzg2.zzd(zzdcdVar2.zzn());
            zzg2.zzc(new zzelb(this.zzf));
            zzh = zzg2.zzh();
        }
        zzdgn zzdgnVar = zzh;
        if (((Boolean) zzbeg.zzc.zze()).booleanValue()) {
            zzfkl zzf = zzdgnVar.zzf();
            zzf.zzi(4);
            zzf.zzb(zzmVar.zzp);
            zzf.zzf(zzmVar.zzm);
            zzfklVar = zzf;
        } else {
            zzfklVar = null;
        }
        zzcsy zza2 = zzdgnVar.zza();
        ua.b zzi = zza2.zzi(zza2.zzj());
        this.zzi = zzi;
        zzgei.zzr(zzi, new zzfcv(this, zzenhVar, zzfklVar, zzb, zzdgnVar), this.zzb);
        return true;
    }

    public final /* synthetic */ void zzh() {
        this.zzd.zzdB(zzfgq.zzd(6, null, null));
    }

    public final void zzi(zzbdi zzbdiVar) {
        this.zzf = zzbdiVar;
    }
}
