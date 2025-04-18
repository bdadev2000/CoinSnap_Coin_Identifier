package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Pair;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* loaded from: classes4.dex */
public final class zzffu implements zzeor {
    private final Context zza;
    private final Executor zzb;
    private final zzcho zzc;
    private final zzffk zzd;
    private final zzfdy zze;
    private final zzfgu zzf;
    private final zzfmd zzg;
    private final zzfha zzh;
    private ListenableFuture zzi;

    public zzffu(Context context, Executor executor, zzcho zzchoVar, zzfdy zzfdyVar, zzffk zzffkVar, zzfha zzfhaVar, zzfgu zzfguVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzchoVar;
        this.zze = zzfdyVar;
        this.zzd = zzffkVar;
        this.zzh = zzfhaVar;
        this.zzf = zzfguVar;
        this.zzg = zzchoVar.zzz();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zzdqm zzk(zzfdw zzfdwVar) {
        zzdqm zzi = this.zzc.zzi();
        zzcxi zzcxiVar = new zzcxi();
        zzcxiVar.zze(this.zza);
        zzcxiVar.zzi(((zzfft) zzfdwVar).zza);
        zzcxiVar.zzh(this.zzf);
        zzi.zzd(zzcxiVar.zzj());
        zzi.zzc(new zzdds().zzn());
        return zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzeor
    public final boolean zza() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzeor
    public final boolean zzb(com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzeop zzeopVar, zzeoq zzeoqVar) throws RemoteException {
        zzfma zzfmaVar;
        zzbwt zzbwtVar = new zzbwt(zzmVar, str);
        if (zzbwtVar.zzb == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzg("Ad unit ID should not be null for rewarded video ad.");
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzffn
                @Override // java.lang.Runnable
                public final void run() {
                    zzffu.this.zzi();
                }
            });
            return false;
        }
        ListenableFuture listenableFuture = this.zzi;
        if (listenableFuture != null && !listenableFuture.isDone()) {
            return false;
        }
        if (((Boolean) zzbek.zzc.zze()).booleanValue()) {
            zzfdy zzfdyVar = this.zze;
            if (zzfdyVar.zzd() != null) {
                zzfma zzh = ((zzdqn) zzfdyVar.zzd()).zzh();
                zzh.zzi(5);
                zzh.zzb(zzbwtVar.zza.zzp);
                zzh.zzf(zzbwtVar.zza.zzm);
                zzfmaVar = zzh;
                zzfhz.zza(this.zza, zzbwtVar.zza.zzf);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzix)).booleanValue() && zzbwtVar.zza.zzf) {
                    this.zzc.zzl().zzo(true);
                }
                Bundle zza = zzdto.zza(new Pair(zzdtm.PUBLIC_API_CALL.zza(), Long.valueOf(zzbwtVar.zza.zzz)), new Pair(zzdtm.DYNAMITE_ENTER.zza(), Long.valueOf(com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis())));
                zzfha zzfhaVar = this.zzh;
                zzfhaVar.zzt(zzbwtVar.zzb);
                zzfhaVar.zzs(com.google.android.gms.ads.internal.client.zzs.zzd());
                zzfhaVar.zzH(zzbwtVar.zza);
                zzfhaVar.zzA(zza);
                Context context = this.zza;
                zzfhc zzJ = zzfhaVar.zzJ();
                zzflp zzb = zzflo.zzb(context, zzflz.zzf(zzJ), 5, zzbwtVar.zza);
                zzfft zzfftVar = new zzfft(null);
                zzfftVar.zza = zzJ;
                ListenableFuture zzc = this.zze.zzc(new zzfdz(zzfftVar, null), new zzfdx() { // from class: com.google.android.gms.internal.ads.zzffo
                    @Override // com.google.android.gms.internal.ads.zzfdx
                    public final zzcxg zza(zzfdw zzfdwVar) {
                        zzdqm zzk;
                        zzk = zzffu.this.zzk(zzfdwVar);
                        return zzk;
                    }
                }, null);
                this.zzi = zzc;
                zzgfo.zzr(zzc, new zzffr(this, zzeoqVar, zzfmaVar, zzb, zzfftVar), this.zzb);
                return true;
            }
        }
        zzfmaVar = null;
        zzfhz.zza(this.zza, zzbwtVar.zza.zzf);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzix)).booleanValue()) {
            this.zzc.zzl().zzo(true);
        }
        Bundle zza2 = zzdto.zza(new Pair(zzdtm.PUBLIC_API_CALL.zza(), Long.valueOf(zzbwtVar.zza.zzz)), new Pair(zzdtm.DYNAMITE_ENTER.zza(), Long.valueOf(com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis())));
        zzfha zzfhaVar2 = this.zzh;
        zzfhaVar2.zzt(zzbwtVar.zzb);
        zzfhaVar2.zzs(com.google.android.gms.ads.internal.client.zzs.zzd());
        zzfhaVar2.zzH(zzbwtVar.zza);
        zzfhaVar2.zzA(zza2);
        Context context2 = this.zza;
        zzfhc zzJ2 = zzfhaVar2.zzJ();
        zzflp zzb2 = zzflo.zzb(context2, zzflz.zzf(zzJ2), 5, zzbwtVar.zza);
        zzfft zzfftVar2 = new zzfft(null);
        zzfftVar2.zza = zzJ2;
        ListenableFuture zzc2 = this.zze.zzc(new zzfdz(zzfftVar2, null), new zzfdx() { // from class: com.google.android.gms.internal.ads.zzffo
            @Override // com.google.android.gms.internal.ads.zzfdx
            public final zzcxg zza(zzfdw zzfdwVar) {
                zzdqm zzk;
                zzk = zzffu.this.zzk(zzfdwVar);
                return zzk;
            }
        }, null);
        this.zzi = zzc2;
        zzgfo.zzr(zzc2, new zzffr(this, zzeoqVar, zzfmaVar, zzb2, zzfftVar2), this.zzb);
        return true;
    }

    public final /* synthetic */ void zzi() {
        this.zzd.zzdB(zzfie.zzd(6, null, null));
    }

    public final void zzj(int i2) {
        this.zzh.zzp().zza(i2);
    }
}
