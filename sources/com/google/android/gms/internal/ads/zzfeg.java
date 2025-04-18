package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Pair;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class zzfeg implements zzeni {
    private final Context zza;
    private final Executor zzb;
    private final zzchk zzc;
    private final zzfdw zzd;
    private final zzfck zze;
    private final zzffg zzf;
    private final zzfko zzg;
    private final zzffm zzh;
    private ua.b zzi;

    public zzfeg(Context context, Executor executor, zzchk zzchkVar, zzfck zzfckVar, zzfdw zzfdwVar, zzffm zzffmVar, zzffg zzffgVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzchkVar;
        this.zze = zzfckVar;
        this.zzd = zzfdwVar;
        this.zzh = zzffmVar;
        this.zzf = zzffgVar;
        this.zzg = zzchkVar.zzz();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zzdov zzk(zzfci zzfciVar) {
        zzdov zzi = this.zzc.zzi();
        zzcvu zzcvuVar = new zzcvu();
        zzcvuVar.zze(this.zza);
        zzcvuVar.zzi(((zzfee) zzfciVar).zza);
        zzcvuVar.zzh(this.zzf);
        zzi.zzd(zzcvuVar.zzj());
        zzi.zzc(new zzdcd().zzn());
        return zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzeni
    public final boolean zza() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzeni
    public final boolean zzb(com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzeng zzengVar, zzenh zzenhVar) throws RemoteException {
        zzfkl zzfklVar;
        zzbwq zzbwqVar = new zzbwq(zzmVar, str);
        if (zzbwqVar.zzb == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzg("Ad unit ID should not be null for rewarded video ad.");
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfdz
                @Override // java.lang.Runnable
                public final void run() {
                    zzfeg.this.zzi();
                }
            });
            return false;
        }
        ua.b bVar = this.zzi;
        if (bVar != null && !bVar.isDone()) {
            return false;
        }
        zzfef zzfefVar = null;
        if (((Boolean) zzbeg.zzc.zze()).booleanValue()) {
            zzfck zzfckVar = this.zze;
            if (zzfckVar.zzd() != null) {
                zzfkl zzh = ((zzdow) zzfckVar.zzd()).zzh();
                zzh.zzi(5);
                zzh.zzb(zzbwqVar.zza.zzp);
                zzh.zzf(zzbwqVar.zza.zzm);
                zzfklVar = zzh;
                zzfgl.zza(this.zza, zzbwqVar.zza.zzf);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zziz)).booleanValue() && zzbwqVar.zza.zzf) {
                    this.zzc.zzl().zzo(true);
                }
                Bundle zza = zzdrx.zza(new Pair(zzdrv.PUBLIC_API_CALL.zza(), Long.valueOf(zzbwqVar.zza.zzz)), new Pair(zzdrv.DYNAMITE_ENTER.zza(), Long.valueOf(com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis())));
                zzffm zzffmVar = this.zzh;
                zzffmVar.zzt(zzbwqVar.zzb);
                zzffmVar.zzs(com.google.android.gms.ads.internal.client.zzs.zzd());
                zzffmVar.zzH(zzbwqVar.zza);
                zzffmVar.zzA(zza);
                Context context = this.zza;
                zzffo zzJ = zzffmVar.zzJ();
                zzfka zzb = zzfjz.zzb(context, zzfkk.zzf(zzJ), 5, zzbwqVar.zza);
                zzfee zzfeeVar = new zzfee(zzfefVar);
                zzfeeVar.zza = zzJ;
                ua.b zzc = this.zze.zzc(new zzfcl(zzfeeVar, null), new zzfcj() { // from class: com.google.android.gms.internal.ads.zzfea
                    @Override // com.google.android.gms.internal.ads.zzfcj
                    public final zzcvs zza(zzfci zzfciVar) {
                        zzdov zzk;
                        zzk = zzfeg.this.zzk(zzfciVar);
                        return zzk;
                    }
                }, null);
                this.zzi = zzc;
                zzgei.zzr(zzc, new zzfed(this, zzenhVar, zzfklVar, zzb, zzfeeVar), this.zzb);
                return true;
            }
        }
        zzfklVar = null;
        zzfgl.zza(this.zza, zzbwqVar.zza.zzf);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zziz)).booleanValue()) {
            this.zzc.zzl().zzo(true);
        }
        Bundle zza2 = zzdrx.zza(new Pair(zzdrv.PUBLIC_API_CALL.zza(), Long.valueOf(zzbwqVar.zza.zzz)), new Pair(zzdrv.DYNAMITE_ENTER.zza(), Long.valueOf(com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis())));
        zzffm zzffmVar2 = this.zzh;
        zzffmVar2.zzt(zzbwqVar.zzb);
        zzffmVar2.zzs(com.google.android.gms.ads.internal.client.zzs.zzd());
        zzffmVar2.zzH(zzbwqVar.zza);
        zzffmVar2.zzA(zza2);
        Context context2 = this.zza;
        zzffo zzJ2 = zzffmVar2.zzJ();
        zzfka zzb2 = zzfjz.zzb(context2, zzfkk.zzf(zzJ2), 5, zzbwqVar.zza);
        zzfee zzfeeVar2 = new zzfee(zzfefVar);
        zzfeeVar2.zza = zzJ2;
        ua.b zzc2 = this.zze.zzc(new zzfcl(zzfeeVar2, null), new zzfcj() { // from class: com.google.android.gms.internal.ads.zzfea
            @Override // com.google.android.gms.internal.ads.zzfcj
            public final zzcvs zza(zzfci zzfciVar) {
                zzdov zzk;
                zzk = zzfeg.this.zzk(zzfciVar);
                return zzk;
            }
        }, null);
        this.zzi = zzc2;
        zzgei.zzr(zzc2, new zzfed(this, zzenhVar, zzfklVar, zzb2, zzfeeVar2), this.zzb);
        return true;
    }

    public final /* synthetic */ void zzi() {
        this.zzd.zzdB(zzfgq.zzd(6, null, null));
    }

    public final void zzj(int i10) {
        this.zzh.zzp().zza(i10);
    }
}
