package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Pair;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.Preconditions;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* loaded from: classes4.dex */
public abstract class zzfbp implements zzeor {
    protected final zzcho zza;
    private final Context zzb;
    private final Executor zzc;
    private final zzfcf zzd;
    private final zzfdy zze;
    private final VersionInfoParcel zzf;
    private final ViewGroup zzg;
    private final zzfmd zzh;
    private final zzfha zzi;
    private ListenableFuture zzj;

    public zzfbp(Context context, Executor executor, zzcho zzchoVar, zzfdy zzfdyVar, zzfcf zzfcfVar, zzfha zzfhaVar, VersionInfoParcel versionInfoParcel) {
        this.zzb = context;
        this.zzc = executor;
        this.zza = zzchoVar;
        this.zze = zzfdyVar;
        this.zzd = zzfcfVar;
        this.zzi = zzfhaVar;
        this.zzf = versionInfoParcel;
        this.zzg = new FrameLayout(context);
        this.zzh = zzchoVar.zzz();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized zzcxg zzm(zzfdw zzfdwVar) {
        zzfbo zzfboVar = (zzfbo) zzfdwVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzhN)).booleanValue()) {
            zzcqo zzcqoVar = new zzcqo(this.zzg);
            zzcxi zzcxiVar = new zzcxi();
            zzcxiVar.zze(this.zzb);
            zzcxiVar.zzi(zzfboVar.zza);
            zzcxk zzj = zzcxiVar.zzj();
            zzdds zzddsVar = new zzdds();
            zzddsVar.zzc(this.zzd, this.zzc);
            zzddsVar.zzl(this.zzd, this.zzc);
            return zze(zzcqoVar, zzj, zzddsVar.zzn());
        }
        zzfcf zzi = zzfcf.zzi(this.zzd);
        zzdds zzddsVar2 = new zzdds();
        zzddsVar2.zzb(zzi, this.zzc);
        zzddsVar2.zzg(zzi, this.zzc);
        zzddsVar2.zzh(zzi, this.zzc);
        zzddsVar2.zzi(zzi, this.zzc);
        zzddsVar2.zzc(zzi, this.zzc);
        zzddsVar2.zzl(zzi, this.zzc);
        zzddsVar2.zzm(zzi);
        zzcqo zzcqoVar2 = new zzcqo(this.zzg);
        zzcxi zzcxiVar2 = new zzcxi();
        zzcxiVar2.zze(this.zzb);
        zzcxiVar2.zzi(zzfboVar.zza);
        return zze(zzcqoVar2, zzcxiVar2.zzj(), zzddsVar2.zzn());
    }

    @Override // com.google.android.gms.internal.ads.zzeor
    public final boolean zza() {
        ListenableFuture listenableFuture = this.zzj;
        return (listenableFuture == null || listenableFuture.isDone()) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzeor
    public final synchronized boolean zzb(com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzeop zzeopVar, zzeoq zzeoqVar) throws RemoteException {
        zzfma zzfmaVar;
        try {
            if (!zzmVar.zzb()) {
                boolean z2 = ((Boolean) zzbep.zzd.zze()).booleanValue() && ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzkO)).booleanValue();
                if (this.zzf.clientJarVersion < ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzkP)).intValue() || !z2) {
                    Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
                }
            }
            if (str == null) {
                com.google.android.gms.ads.internal.util.client.zzm.zzg("Ad unit ID should not be null for app open ad.");
                this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfbj
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzfbp.this.zzk();
                    }
                });
                return false;
            }
            if (this.zzj != null) {
                return false;
            }
            if (((Boolean) zzbek.zzc.zze()).booleanValue()) {
                zzfdy zzfdyVar = this.zze;
                if (zzfdyVar.zzd() != null) {
                    zzfma zzh = ((zzcqb) zzfdyVar.zzd()).zzh();
                    zzh.zzi(7);
                    zzh.zzb(zzmVar.zzp);
                    zzh.zzf(zzmVar.zzm);
                    zzfmaVar = zzh;
                    zzfhz.zza(this.zzb, zzmVar.zzf);
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzix)).booleanValue() && zzmVar.zzf) {
                        this.zza.zzl().zzo(true);
                    }
                    Bundle zza = zzdto.zza(new Pair(zzdtm.PUBLIC_API_CALL.zza(), Long.valueOf(zzmVar.zzz)), new Pair(zzdtm.DYNAMITE_ENTER.zza(), Long.valueOf(com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis())));
                    zzfha zzfhaVar = this.zzi;
                    zzfhaVar.zzt(str);
                    zzfhaVar.zzs(com.google.android.gms.ads.internal.client.zzs.zzb());
                    zzfhaVar.zzH(zzmVar);
                    zzfhaVar.zzA(zza);
                    Context context = this.zzb;
                    zzfhc zzJ = zzfhaVar.zzJ();
                    zzflp zzb = zzflo.zzb(context, zzflz.zzf(zzJ), 7, zzmVar);
                    zzfbo zzfboVar = new zzfbo(null);
                    zzfboVar.zza = zzJ;
                    ListenableFuture zzc = this.zze.zzc(new zzfdz(zzfboVar, null), new zzfdx() { // from class: com.google.android.gms.internal.ads.zzfbk
                        @Override // com.google.android.gms.internal.ads.zzfdx
                        public final zzcxg zza(zzfdw zzfdwVar) {
                            zzcxg zzm;
                            zzm = zzfbp.this.zzm(zzfdwVar);
                            return zzm;
                        }
                    }, null);
                    this.zzj = zzc;
                    zzgfo.zzr(zzc, new zzfbm(this, zzeoqVar, zzfmaVar, zzb, zzfboVar), this.zzc);
                    return true;
                }
            }
            zzfmaVar = null;
            zzfhz.zza(this.zzb, zzmVar.zzf);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzix)).booleanValue()) {
                this.zza.zzl().zzo(true);
            }
            Bundle zza2 = zzdto.zza(new Pair(zzdtm.PUBLIC_API_CALL.zza(), Long.valueOf(zzmVar.zzz)), new Pair(zzdtm.DYNAMITE_ENTER.zza(), Long.valueOf(com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis())));
            zzfha zzfhaVar2 = this.zzi;
            zzfhaVar2.zzt(str);
            zzfhaVar2.zzs(com.google.android.gms.ads.internal.client.zzs.zzb());
            zzfhaVar2.zzH(zzmVar);
            zzfhaVar2.zzA(zza2);
            Context context2 = this.zzb;
            zzfhc zzJ2 = zzfhaVar2.zzJ();
            zzflp zzb2 = zzflo.zzb(context2, zzflz.zzf(zzJ2), 7, zzmVar);
            zzfbo zzfboVar2 = new zzfbo(null);
            zzfboVar2.zza = zzJ2;
            ListenableFuture zzc2 = this.zze.zzc(new zzfdz(zzfboVar2, null), new zzfdx() { // from class: com.google.android.gms.internal.ads.zzfbk
                @Override // com.google.android.gms.internal.ads.zzfdx
                public final zzcxg zza(zzfdw zzfdwVar) {
                    zzcxg zzm;
                    zzm = zzfbp.this.zzm(zzfdwVar);
                    return zzm;
                }
            }, null);
            this.zzj = zzc2;
            zzgfo.zzr(zzc2, new zzfbm(this, zzeoqVar, zzfmaVar, zzb2, zzfboVar2), this.zzc);
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public abstract zzcxg zze(zzcqo zzcqoVar, zzcxk zzcxkVar, zzddu zzdduVar);

    public final /* synthetic */ void zzk() {
        this.zzd.zzdB(zzfie.zzd(6, null, null));
    }

    public final void zzl(com.google.android.gms.ads.internal.client.zzy zzyVar) {
        this.zzi.zzu(zzyVar);
    }
}
