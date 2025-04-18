package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class zzfbf implements zzeni {
    private final Context zza;
    private final Executor zzb;
    private final zzchk zzc;
    private final zzems zzd;
    private final zzemw zze;
    private final ViewGroup zzf;

    @Nullable
    private zzbdi zzg;
    private final zzcze zzh;
    private final zzfko zzi;
    private final zzdbk zzj;
    private final zzffm zzk;
    private ua.b zzl;
    private boolean zzm;
    private com.google.android.gms.ads.internal.client.zze zzn;
    private zzenh zzo;

    public zzfbf(Context context, Executor executor, com.google.android.gms.ads.internal.client.zzs zzsVar, zzchk zzchkVar, zzems zzemsVar, zzemw zzemwVar, zzffm zzffmVar, zzdbk zzdbkVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzchkVar;
        this.zzd = zzemsVar;
        this.zze = zzemwVar;
        this.zzk = zzffmVar;
        this.zzh = zzchkVar.zzf();
        this.zzi = zzchkVar.zzz();
        this.zzf = new FrameLayout(context);
        this.zzj = zzdbkVar;
        zzffmVar.zzs(zzsVar);
        this.zzm = true;
        this.zzn = null;
        this.zzo = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzu() {
        this.zzl = null;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzhO)).booleanValue()) {
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfbb
                @Override // java.lang.Runnable
                public final void run() {
                    zzfbf.this.zzk();
                }
            });
        }
        zzenh zzenhVar = this.zzo;
        if (zzenhVar != null) {
            zzenhVar.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeni
    public final boolean zza() {
        ua.b bVar = this.zzl;
        return (bVar == null || bVar.isDone()) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzeni
    public final boolean zzb(com.google.android.gms.ads.internal.client.zzm zzmVar, String str, @Nullable zzeng zzengVar, zzenh zzenhVar) throws RemoteException {
        zzcqh zzh;
        if (str == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzg("Ad unit ID should not be null for banner ad.");
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfbd
                @Override // java.lang.Runnable
                public final void run() {
                    zzfbf.this.zzl();
                }
            });
            return false;
        }
        if (zza()) {
            if (!this.zzk.zzS()) {
                this.zzm = true;
            }
        } else {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zziz)).booleanValue() && zzmVar.zzf) {
                this.zzc.zzl().zzo(true);
            }
            Bundle zza = zzdrx.zza(new Pair(zzdrv.PUBLIC_API_CALL.zza(), Long.valueOf(zzmVar.zzz)), new Pair(zzdrv.DYNAMITE_ENTER.zza(), Long.valueOf(com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis())));
            zzffm zzffmVar = this.zzk;
            zzffmVar.zzt(str);
            zzffmVar.zzH(zzmVar);
            zzffmVar.zzA(zza);
            Context context = this.zza;
            zzffo zzJ = zzffmVar.zzJ();
            zzfka zzb = zzfjz.zzb(context, zzfkk.zzf(zzJ), 3, zzmVar);
            zzfkl zzfklVar = null;
            if (((Boolean) zzbet.zze.zze()).booleanValue() && this.zzk.zzh().zzk) {
                zzems zzemsVar = this.zzd;
                if (zzemsVar != null) {
                    zzemsVar.zzdB(zzfgq.zzd(7, null, null));
                }
            } else {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzhO)).booleanValue()) {
                    zzcqg zze = this.zzc.zze();
                    zzcvu zzcvuVar = new zzcvu();
                    zzcvuVar.zze(this.zza);
                    zzcvuVar.zzi(zzJ);
                    zze.zzi(zzcvuVar.zzj());
                    zzdcd zzdcdVar = new zzdcd();
                    zzdcdVar.zzj(this.zzd, this.zzb);
                    zzdcdVar.zzk(this.zzd, this.zzb);
                    zze.zzf(zzdcdVar.zzn());
                    zze.zze(new zzelb(this.zzg));
                    zze.zzd(new zzdhe(zzdjj.zza, null));
                    zze.zzg(new zzcri(this.zzh, this.zzj));
                    zze.zzc(new zzcpa(this.zzf));
                    zzh = zze.zzh();
                } else {
                    zzcqg zze2 = this.zzc.zze();
                    zzcvu zzcvuVar2 = new zzcvu();
                    zzcvuVar2.zze(this.zza);
                    zzcvuVar2.zzi(zzJ);
                    zze2.zzi(zzcvuVar2.zzj());
                    zzdcd zzdcdVar2 = new zzdcd();
                    zzdcdVar2.zzj(this.zzd, this.zzb);
                    zzdcdVar2.zza(this.zzd, this.zzb);
                    zzdcdVar2.zza(this.zze, this.zzb);
                    zzdcdVar2.zzl(this.zzd, this.zzb);
                    zzdcdVar2.zzd(this.zzd, this.zzb);
                    zzdcdVar2.zze(this.zzd, this.zzb);
                    zzdcdVar2.zzf(this.zzd, this.zzb);
                    zzdcdVar2.zzb(this.zzd, this.zzb);
                    zzdcdVar2.zzk(this.zzd, this.zzb);
                    zzdcdVar2.zzi(this.zzd, this.zzb);
                    zze2.zzf(zzdcdVar2.zzn());
                    zze2.zze(new zzelb(this.zzg));
                    zze2.zzd(new zzdhe(zzdjj.zza, null));
                    zze2.zzg(new zzcri(this.zzh, this.zzj));
                    zze2.zzc(new zzcpa(this.zzf));
                    zzh = zze2.zzh();
                }
                if (((Boolean) zzbeg.zzc.zze()).booleanValue()) {
                    zzfklVar = zzh.zzj();
                    zzfklVar.zzi(3);
                    zzfklVar.zzb(zzmVar.zzp);
                    zzfklVar.zzf(zzmVar.zzm);
                }
                this.zzo = zzenhVar;
                zzcsy zzd = zzh.zzd();
                ua.b zzi = zzd.zzi(zzd.zzj());
                this.zzl = zzi;
                zzgei.zzr(zzi, new zzfbe(this, zzfklVar, zzb, zzh), this.zzb);
                return true;
            }
        }
        return false;
    }

    public final ViewGroup zzc() {
        return this.zzf;
    }

    public final zzffm zzg() {
        return this.zzk;
    }

    public final /* synthetic */ void zzk() {
        this.zzd.zzdB(this.zzn);
    }

    public final /* synthetic */ void zzl() {
        this.zzd.zzdB(zzfgq.zzd(6, null, null));
    }

    public final void zzm() {
        this.zzh.zzd(this.zzj.zzc());
    }

    public final void zzn() {
        this.zzh.zze(this.zzj.zzd());
    }

    public final void zzo(com.google.android.gms.ads.internal.client.zzbi zzbiVar) {
        this.zze.zza(zzbiVar);
    }

    public final void zzp(zzcyy zzcyyVar) {
        this.zzh.zzo(zzcyyVar, this.zzb);
    }

    public final void zzq(zzbdi zzbdiVar) {
        this.zzg = zzbdiVar;
    }

    public final void zzr() {
        synchronized (this) {
            ua.b bVar = this.zzl;
            if (bVar != null && bVar.isDone()) {
                try {
                    zzcpd zzcpdVar = (zzcpd) this.zzl.get();
                    this.zzl = null;
                    this.zzf.removeAllViews();
                    if (zzcpdVar.zzd() != null) {
                        ViewParent parent = zzcpdVar.zzd().getParent();
                        if (parent instanceof ViewGroup) {
                            String str = "";
                            if (zzcpdVar.zzm() != null) {
                                str = zzcpdVar.zzm().zzg();
                            }
                            com.google.android.gms.ads.internal.util.client.zzm.zzj("Banner view provided from " + str + " already has a parent view. Removing its old parent.");
                            ((ViewGroup) parent).removeView(zzcpdVar.zzd());
                        }
                    }
                    zzbce zzbceVar = zzbcn.zzhO;
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbceVar)).booleanValue()) {
                        zzdas zzo = zzcpdVar.zzo();
                        zzo.zza(this.zzd);
                        zzo.zzc(this.zze);
                    }
                    this.zzf.addView(zzcpdVar.zzd());
                    this.zzo.zzb(zzcpdVar);
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbceVar)).booleanValue()) {
                        Executor executor = this.zzb;
                        final zzems zzemsVar = this.zzd;
                        Objects.requireNonNull(zzemsVar);
                        executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfbc
                            @Override // java.lang.Runnable
                            public final void run() {
                                zzems.this.zzs();
                            }
                        });
                    }
                    if (zzcpdVar.zza() >= 0) {
                        this.zzm = false;
                        this.zzh.zzd(zzcpdVar.zza());
                        this.zzh.zze(zzcpdVar.zzc());
                    } else {
                        this.zzm = true;
                        this.zzh.zzd(zzcpdVar.zzc());
                    }
                } catch (InterruptedException | ExecutionException e2) {
                    zzu();
                    com.google.android.gms.ads.internal.util.zze.zzb("Error occurred while refreshing the ad. Making a new ad request.", e2);
                    this.zzm = true;
                    this.zzh.zza();
                }
            } else if (this.zzl != null) {
                com.google.android.gms.ads.internal.util.zze.zza("Show timer went off but there is an ongoing ad request.");
                this.zzm = true;
            } else {
                com.google.android.gms.ads.internal.util.zze.zza("No ad request was in progress or an ad was cached when show timer went off. Hence requesting a new ad.");
                this.zzm = true;
                this.zzh.zza();
            }
        }
    }

    public final boolean zzt() {
        Object parent = this.zzf.getParent();
        if (!(parent instanceof View)) {
            return false;
        }
        View view = (View) parent;
        com.google.android.gms.ads.internal.zzv.zzq();
        return com.google.android.gms.ads.internal.util.zzs.zzW(view, view.getContext());
    }
}
