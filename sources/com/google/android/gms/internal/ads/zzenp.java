package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Pair;
import androidx.annotation.Nullable;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes3.dex */
public final class zzenp implements zzeni {
    private final zzffm zza;
    private final zzchk zzb;
    private final Context zzc;
    private final zzenf zzd;
    private final zzfko zze;

    @Nullable
    private zzcsf zzf;

    public zzenp(zzchk zzchkVar, Context context, zzenf zzenfVar, zzffm zzffmVar) {
        this.zzb = zzchkVar;
        this.zzc = context;
        this.zzd = zzenfVar;
        this.zza = zzffmVar;
        this.zze = zzchkVar.zzz();
        zzffmVar.zzv(zzenfVar.zzd());
    }

    @Override // com.google.android.gms.internal.ads.zzeni
    public final boolean zza() {
        zzcsf zzcsfVar = this.zzf;
        return zzcsfVar != null && zzcsfVar.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzeni
    public final boolean zzb(com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzeng zzengVar, zzenh zzenhVar) throws RemoteException {
        zzfkl zzfklVar;
        com.google.android.gms.ads.internal.zzv.zzq();
        if (com.google.android.gms.ads.internal.util.zzs.zzH(this.zzc) && zzmVar.zzs == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzg("Failed to load the ad because app ID is missing.");
            this.zzb.zzC().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzenk
                @Override // java.lang.Runnable
                public final void run() {
                    zzenp.this.zzf();
                }
            });
            return false;
        }
        if (str == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzg("Ad unit ID should not be null for NativeAdLoader.");
            this.zzb.zzC().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzenl
                @Override // java.lang.Runnable
                public final void run() {
                    zzenp.this.zzg();
                }
            });
            return false;
        }
        zzfgl.zza(this.zzc, zzmVar.zzf);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zziz)).booleanValue() && zzmVar.zzf) {
            this.zzb.zzl().zzo(true);
        }
        int i10 = ((zzenj) zzengVar).zza;
        long currentTimeMillis = com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis();
        String zza = zzdrv.PUBLIC_API_CALL.zza();
        Long valueOf = Long.valueOf(currentTimeMillis);
        Bundle zza2 = zzdrx.zza(new Pair(zza, valueOf), new Pair(zzdrv.DYNAMITE_ENTER.zza(), valueOf));
        zzffm zzffmVar = this.zza;
        zzffmVar.zzH(zzmVar);
        zzffmVar.zzA(zza2);
        zzffmVar.zzC(i10);
        Context context = this.zzc;
        zzffo zzJ = zzffmVar.zzJ();
        zzfka zzb = zzfjz.zzb(context, zzfkk.zzf(zzJ), 8, zzmVar);
        com.google.android.gms.ads.internal.client.zzcm zzcmVar = zzJ.zzn;
        if (zzcmVar != null) {
            this.zzd.zzd().zzm(zzcmVar);
        }
        zzdhi zzh = this.zzb.zzh();
        zzcvu zzcvuVar = new zzcvu();
        zzcvuVar.zze(this.zzc);
        zzcvuVar.zzi(zzJ);
        zzh.zzf(zzcvuVar.zzj());
        zzdcd zzdcdVar = new zzdcd();
        zzdcdVar.zzk(this.zzd.zzd(), this.zzb.zzC());
        zzh.zze(zzdcdVar.zzn());
        zzh.zzd(this.zzd.zzc());
        zzh.zzc(new zzcpa(null));
        zzdhj zzg = zzh.zzg();
        if (((Boolean) zzbeg.zzc.zze()).booleanValue()) {
            zzfkl zzf = zzg.zzf();
            zzf.zzi(8);
            zzf.zzb(zzmVar.zzp);
            zzf.zzf(zzmVar.zzm);
            zzfklVar = zzf;
        } else {
            zzfklVar = null;
        }
        this.zzb.zzy().zzc(1);
        zzchk zzchkVar = this.zzb;
        zzges zzc = zzfin.zzc();
        ScheduledExecutorService zzD = zzchkVar.zzD();
        zzcsy zza3 = zzg.zza();
        zzcsf zzcsfVar = new zzcsf(zzc, zzD, zza3.zzi(zza3.zzj()));
        this.zzf = zzcsfVar;
        zzcsfVar.zze(new zzeno(this, zzenhVar, zzfklVar, zzb, zzg));
        return true;
    }

    public final /* synthetic */ void zzf() {
        this.zzd.zza().zzdB(zzfgq.zzd(4, null, null));
    }

    public final /* synthetic */ void zzg() {
        this.zzd.zza().zzdB(zzfgq.zzd(6, null, null));
    }
}
