package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Pair;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public abstract class zzfab implements zzeni {
    protected final zzchk zza;
    private final Context zzb;
    private final Executor zzc;
    private final zzfar zzd;
    private final zzfck zze;
    private final VersionInfoParcel zzf;
    private final ViewGroup zzg;
    private final zzfko zzh;
    private final zzffm zzi;
    private ua.b zzj;

    public zzfab(Context context, Executor executor, zzchk zzchkVar, zzfck zzfckVar, zzfar zzfarVar, zzffm zzffmVar, VersionInfoParcel versionInfoParcel) {
        this.zzb = context;
        this.zzc = executor;
        this.zza = zzchkVar;
        this.zze = zzfckVar;
        this.zzd = zzfarVar;
        this.zzi = zzffmVar;
        this.zzf = versionInfoParcel;
        this.zzg = new FrameLayout(context);
        this.zzh = zzchkVar.zzz();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized zzcvs zzm(zzfci zzfciVar) {
        zzezz zzezzVar = (zzezz) zzfciVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzhP)).booleanValue()) {
            zzcpa zzcpaVar = new zzcpa(this.zzg);
            zzcvu zzcvuVar = new zzcvu();
            zzcvuVar.zze(this.zzb);
            zzcvuVar.zzi(zzezzVar.zza);
            zzcvw zzj = zzcvuVar.zzj();
            zzdcd zzdcdVar = new zzdcd();
            zzdcdVar.zzc(this.zzd, this.zzc);
            zzdcdVar.zzl(this.zzd, this.zzc);
            return zze(zzcpaVar, zzj, zzdcdVar.zzn());
        }
        zzfar zzi = zzfar.zzi(this.zzd);
        zzdcd zzdcdVar2 = new zzdcd();
        zzdcdVar2.zzb(zzi, this.zzc);
        zzdcdVar2.zzg(zzi, this.zzc);
        zzdcdVar2.zzh(zzi, this.zzc);
        zzdcdVar2.zzi(zzi, this.zzc);
        zzdcdVar2.zzc(zzi, this.zzc);
        zzdcdVar2.zzl(zzi, this.zzc);
        zzdcdVar2.zzm(zzi);
        zzcpa zzcpaVar2 = new zzcpa(this.zzg);
        zzcvu zzcvuVar2 = new zzcvu();
        zzcvuVar2.zze(this.zzb);
        zzcvuVar2.zzi(zzezzVar.zza);
        return zze(zzcpaVar2, zzcvuVar2.zzj(), zzdcdVar2.zzn());
    }

    @Override // com.google.android.gms.internal.ads.zzeni
    public final boolean zza() {
        ua.b bVar = this.zzj;
        return (bVar == null || bVar.isDone()) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzeni
    public final synchronized boolean zzb(com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzeng zzengVar, zzenh zzenhVar) throws RemoteException {
        boolean z10;
        zzfkl zzfklVar;
        if (!zzmVar.zzb()) {
            if (((Boolean) zzbel.zzd.zze()).booleanValue() && ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzkP)).booleanValue()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (this.zzf.clientJarVersion < ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzkQ)).intValue() || !z10) {
                Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
            }
        }
        if (str == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzg("Ad unit ID should not be null for app open ad.");
            this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzezv
                @Override // java.lang.Runnable
                public final void run() {
                    zzfab.this.zzk();
                }
            });
            return false;
        }
        if (this.zzj != null) {
            return false;
        }
        zzfaa zzfaaVar = null;
        if (((Boolean) zzbeg.zzc.zze()).booleanValue()) {
            zzfck zzfckVar = this.zze;
            if (zzfckVar.zzd() != null) {
                zzfkl zzh = ((zzcon) zzfckVar.zzd()).zzh();
                zzh.zzi(7);
                zzh.zzb(zzmVar.zzp);
                zzh.zzf(zzmVar.zzm);
                zzfklVar = zzh;
                zzfgl.zza(this.zzb, zzmVar.zzf);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zziz)).booleanValue() && zzmVar.zzf) {
                    this.zza.zzl().zzo(true);
                }
                Bundle zza = zzdrx.zza(new Pair(zzdrv.PUBLIC_API_CALL.zza(), Long.valueOf(zzmVar.zzz)), new Pair(zzdrv.DYNAMITE_ENTER.zza(), Long.valueOf(com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis())));
                zzffm zzffmVar = this.zzi;
                zzffmVar.zzt(str);
                zzffmVar.zzs(com.google.android.gms.ads.internal.client.zzs.zzb());
                zzffmVar.zzH(zzmVar);
                zzffmVar.zzA(zza);
                Context context = this.zzb;
                zzffo zzJ = zzffmVar.zzJ();
                zzfka zzb = zzfjz.zzb(context, zzfkk.zzf(zzJ), 7, zzmVar);
                zzezz zzezzVar = new zzezz(zzfaaVar);
                zzezzVar.zza = zzJ;
                ua.b zzc = this.zze.zzc(new zzfcl(zzezzVar, null), new zzfcj() { // from class: com.google.android.gms.internal.ads.zzezw
                    @Override // com.google.android.gms.internal.ads.zzfcj
                    public final zzcvs zza(zzfci zzfciVar) {
                        zzcvs zzm;
                        zzm = zzfab.this.zzm(zzfciVar);
                        return zzm;
                    }
                }, null);
                this.zzj = zzc;
                zzgei.zzr(zzc, new zzezy(this, zzenhVar, zzfklVar, zzb, zzezzVar), this.zzc);
                return true;
            }
        }
        zzfklVar = null;
        zzfgl.zza(this.zzb, zzmVar.zzf);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zziz)).booleanValue()) {
            this.zza.zzl().zzo(true);
        }
        Bundle zza2 = zzdrx.zza(new Pair(zzdrv.PUBLIC_API_CALL.zza(), Long.valueOf(zzmVar.zzz)), new Pair(zzdrv.DYNAMITE_ENTER.zza(), Long.valueOf(com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis())));
        zzffm zzffmVar2 = this.zzi;
        zzffmVar2.zzt(str);
        zzffmVar2.zzs(com.google.android.gms.ads.internal.client.zzs.zzb());
        zzffmVar2.zzH(zzmVar);
        zzffmVar2.zzA(zza2);
        Context context2 = this.zzb;
        zzffo zzJ2 = zzffmVar2.zzJ();
        zzfka zzb2 = zzfjz.zzb(context2, zzfkk.zzf(zzJ2), 7, zzmVar);
        zzezz zzezzVar2 = new zzezz(zzfaaVar);
        zzezzVar2.zza = zzJ2;
        ua.b zzc2 = this.zze.zzc(new zzfcl(zzezzVar2, null), new zzfcj() { // from class: com.google.android.gms.internal.ads.zzezw
            @Override // com.google.android.gms.internal.ads.zzfcj
            public final zzcvs zza(zzfci zzfciVar) {
                zzcvs zzm;
                zzm = zzfab.this.zzm(zzfciVar);
                return zzm;
            }
        }, null);
        this.zzj = zzc2;
        zzgei.zzr(zzc2, new zzezy(this, zzenhVar, zzfklVar, zzb2, zzezzVar2), this.zzc);
        return true;
    }

    public abstract zzcvs zze(zzcpa zzcpaVar, zzcvw zzcvwVar, zzdcf zzdcfVar);

    public final /* synthetic */ void zzk() {
        this.zzd.zzdB(zzfgq.zzd(6, null, null));
    }

    public final void zzl(com.google.android.gms.ads.internal.client.zzy zzyVar) {
        this.zzi.zzu(zzyVar);
    }
}
