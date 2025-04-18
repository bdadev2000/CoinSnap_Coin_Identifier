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
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* loaded from: classes4.dex */
public final class zzfct implements zzeor {
    private final Context zza;
    private final Executor zzb;
    private final zzcho zzc;
    private final zzeob zzd;
    private final zzeof zze;
    private final ViewGroup zzf;

    @Nullable
    private zzbdq zzg;
    private final zzdat zzh;
    private final zzfmd zzi;
    private final zzdcz zzj;
    private final zzfha zzk;
    private ListenableFuture zzl;
    private boolean zzm;
    private com.google.android.gms.ads.internal.client.zze zzn;
    private zzeoq zzo;

    public zzfct(Context context, Executor executor, com.google.android.gms.ads.internal.client.zzs zzsVar, zzcho zzchoVar, zzeob zzeobVar, zzeof zzeofVar, zzfha zzfhaVar, zzdcz zzdczVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzchoVar;
        this.zzd = zzeobVar;
        this.zze = zzeofVar;
        this.zzk = zzfhaVar;
        this.zzh = zzchoVar.zzf();
        this.zzi = zzchoVar.zzz();
        this.zzf = new FrameLayout(context);
        this.zzj = zzdczVar;
        zzfhaVar.zzs(zzsVar);
        this.zzm = true;
        this.zzn = null;
        this.zzo = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzu() {
        this.zzl = null;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzhM)).booleanValue()) {
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfcp
                @Override // java.lang.Runnable
                public final void run() {
                    zzfct.this.zzk();
                }
            });
        }
        zzeoq zzeoqVar = this.zzo;
        if (zzeoqVar != null) {
            zzeoqVar.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeor
    public final boolean zza() {
        ListenableFuture listenableFuture = this.zzl;
        return (listenableFuture == null || listenableFuture.isDone()) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzeor
    public final boolean zzb(com.google.android.gms.ads.internal.client.zzm zzmVar, String str, @Nullable zzeop zzeopVar, zzeoq zzeoqVar) throws RemoteException {
        zzcrv zzh;
        if (str == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzg("Ad unit ID should not be null for banner ad.");
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfcr
                @Override // java.lang.Runnable
                public final void run() {
                    zzfct.this.zzl();
                }
            });
            return false;
        }
        if (!zza()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzix)).booleanValue() && zzmVar.zzf) {
                this.zzc.zzl().zzo(true);
            }
            Bundle zza = zzdto.zza(new Pair(zzdtm.PUBLIC_API_CALL.zza(), Long.valueOf(zzmVar.zzz)), new Pair(zzdtm.DYNAMITE_ENTER.zza(), Long.valueOf(com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis())));
            zzfha zzfhaVar = this.zzk;
            zzfhaVar.zzt(str);
            zzfhaVar.zzH(zzmVar);
            zzfhaVar.zzA(zza);
            Context context = this.zza;
            zzfhc zzJ = zzfhaVar.zzJ();
            zzflp zzb = zzflo.zzb(context, zzflz.zzf(zzJ), 3, zzmVar);
            zzfma zzfmaVar = null;
            if (!((Boolean) zzbex.zze.zze()).booleanValue() || !this.zzk.zzh().zzk) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzhM)).booleanValue()) {
                    zzcru zze = this.zzc.zze();
                    zzcxi zzcxiVar = new zzcxi();
                    zzcxiVar.zze(this.zza);
                    zzcxiVar.zzi(zzJ);
                    zze.zzi(zzcxiVar.zzj());
                    zzdds zzddsVar = new zzdds();
                    zzddsVar.zzj(this.zzd, this.zzb);
                    zzddsVar.zzk(this.zzd, this.zzb);
                    zze.zzf(zzddsVar.zzn());
                    zze.zze(new zzemk(this.zzg));
                    zze.zzd(new zzdit(zzdla.zza, null));
                    zze.zzg(new zzcsw(this.zzh, this.zzj));
                    zze.zzc(new zzcqo(this.zzf));
                    zzh = zze.zzh();
                } else {
                    zzcru zze2 = this.zzc.zze();
                    zzcxi zzcxiVar2 = new zzcxi();
                    zzcxiVar2.zze(this.zza);
                    zzcxiVar2.zzi(zzJ);
                    zze2.zzi(zzcxiVar2.zzj());
                    zzdds zzddsVar2 = new zzdds();
                    zzddsVar2.zzj(this.zzd, this.zzb);
                    zzddsVar2.zza(this.zzd, this.zzb);
                    zzddsVar2.zza(this.zze, this.zzb);
                    zzddsVar2.zzl(this.zzd, this.zzb);
                    zzddsVar2.zzd(this.zzd, this.zzb);
                    zzddsVar2.zze(this.zzd, this.zzb);
                    zzddsVar2.zzf(this.zzd, this.zzb);
                    zzddsVar2.zzb(this.zzd, this.zzb);
                    zzddsVar2.zzk(this.zzd, this.zzb);
                    zzddsVar2.zzi(this.zzd, this.zzb);
                    zze2.zzf(zzddsVar2.zzn());
                    zze2.zze(new zzemk(this.zzg));
                    zze2.zzd(new zzdit(zzdla.zza, null));
                    zze2.zzg(new zzcsw(this.zzh, this.zzj));
                    zze2.zzc(new zzcqo(this.zzf));
                    zzh = zze2.zzh();
                }
                if (((Boolean) zzbek.zzc.zze()).booleanValue()) {
                    zzfmaVar = zzh.zzj();
                    zzfmaVar.zzi(3);
                    zzfmaVar.zzb(zzmVar.zzp);
                    zzfmaVar.zzf(zzmVar.zzm);
                }
                this.zzo = zzeoqVar;
                zzcum zzd = zzh.zzd();
                ListenableFuture zzi = zzd.zzi(zzd.zzj());
                this.zzl = zzi;
                zzgfo.zzr(zzi, new zzfcs(this, zzfmaVar, zzb, zzh), this.zzb);
                return true;
            }
            zzeob zzeobVar = this.zzd;
            if (zzeobVar != null) {
                zzeobVar.zzdB(zzfie.zzd(7, null, null));
            }
        } else if (!this.zzk.zzS()) {
            this.zzm = true;
        }
        return false;
    }

    public final ViewGroup zzc() {
        return this.zzf;
    }

    public final zzfha zzg() {
        return this.zzk;
    }

    public final /* synthetic */ void zzk() {
        this.zzd.zzdB(this.zzn);
    }

    public final /* synthetic */ void zzl() {
        this.zzd.zzdB(zzfie.zzd(6, null, null));
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

    public final void zzp(zzdam zzdamVar) {
        this.zzh.zzo(zzdamVar, this.zzb);
    }

    public final void zzq(zzbdq zzbdqVar) {
        this.zzg = zzbdqVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzr() {
        synchronized (this) {
            try {
                ListenableFuture listenableFuture = this.zzl;
                if (listenableFuture != null && listenableFuture.isDone()) {
                    try {
                        zzcqr zzcqrVar = (zzcqr) this.zzl.get();
                        this.zzl = null;
                        this.zzf.removeAllViews();
                        if (zzcqrVar.zzd() != null) {
                            ViewParent parent = zzcqrVar.zzd().getParent();
                            if (parent instanceof ViewGroup) {
                                com.google.android.gms.ads.internal.util.client.zzm.zzj("Banner view provided from " + (zzcqrVar.zzm() != null ? zzcqrVar.zzm().zzg() : "") + " already has a parent view. Removing its old parent.");
                                ((ViewGroup) parent).removeView(zzcqrVar.zzd());
                            }
                        }
                        zzbcm zzbcmVar = zzbcv.zzhM;
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcmVar)).booleanValue()) {
                            zzdci zzo = zzcqrVar.zzo();
                            zzo.zza(this.zzd);
                            zzo.zzc(this.zze);
                        }
                        this.zzf.addView(zzcqrVar.zzd());
                        this.zzo.zzb(zzcqrVar);
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcmVar)).booleanValue()) {
                            Executor executor = this.zzb;
                            final zzeob zzeobVar = this.zzd;
                            Objects.requireNonNull(zzeobVar);
                            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfcq
                                @Override // java.lang.Runnable
                                public final void run() {
                                    zzeob.this.zzs();
                                }
                            });
                        }
                        if (zzcqrVar.zza() >= 0) {
                            this.zzm = false;
                            this.zzh.zzd(zzcqrVar.zza());
                            this.zzh.zze(zzcqrVar.zzc());
                        } else {
                            this.zzm = true;
                            this.zzh.zzd(zzcqrVar.zzc());
                        }
                    } catch (InterruptedException e) {
                        e = e;
                        zzu();
                        com.google.android.gms.ads.internal.util.zze.zzb("Error occurred while refreshing the ad. Making a new ad request.", e);
                        this.zzm = true;
                        this.zzh.zza();
                    } catch (ExecutionException e2) {
                        e = e2;
                        zzu();
                        com.google.android.gms.ads.internal.util.zze.zzb("Error occurred while refreshing the ad. Making a new ad request.", e);
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
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean zzt() {
        Object parent = this.zzf.getParent();
        if (!(parent instanceof View)) {
            return false;
        }
        View view = (View) parent;
        com.google.android.gms.ads.internal.zzu.zzp();
        return com.google.android.gms.ads.internal.util.zzt.zzW(view, view.getContext());
    }
}
