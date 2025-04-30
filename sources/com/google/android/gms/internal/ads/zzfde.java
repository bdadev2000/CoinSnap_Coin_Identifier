package com.google.android.gms.internal.ads;

import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzfde implements zzgfp {
    final /* synthetic */ zzepr zza;
    final /* synthetic */ zzfmn zzb;
    final /* synthetic */ zzfmc zzc;
    final /* synthetic */ zzctg zzd;
    final /* synthetic */ zzfdf zze;

    public zzfde(zzfdf zzfdfVar, zzepr zzeprVar, zzfmn zzfmnVar, zzfmc zzfmcVar, zzctg zzctgVar) {
        this.zza = zzeprVar;
        this.zzb = zzfmnVar;
        this.zzc = zzfmcVar;
        this.zzd = zzctgVar;
        this.zze = zzfdfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgfp
    public final void zza(Throwable th) {
        zzdca zzdcaVar;
        zzdeh zzdehVar;
        zzfmq zzfmqVar;
        zzfmn zzfmnVar;
        Executor executor;
        final com.google.android.gms.ads.internal.client.zze zza = this.zzd.zzd().zza(th);
        synchronized (this.zze) {
            try {
                this.zze.zzl = null;
                this.zzd.zzf().zzdB(zza);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzik)).booleanValue()) {
                    executor = this.zze.zzb;
                    executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfdc
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzepc zzepcVar;
                            zzepcVar = zzfde.this.zze.zzd;
                            zzepcVar.zzdB(zza);
                        }
                    });
                }
                zzfdf zzfdfVar = this.zze;
                zzdcaVar = zzfdfVar.zzh;
                zzdehVar = zzfdfVar.zzj;
                zzdcaVar.zzd(zzdehVar.zzc());
                zzfil.zzb(zza.zza, th, "BannerAdLoader.onFailure");
                this.zza.zza();
                if (((Boolean) zzbgd.zzc.zze()).booleanValue() && (zzfmnVar = this.zzb) != null) {
                    zzfmnVar.zzc(zza);
                    zzfmc zzfmcVar = this.zzc;
                    zzfmcVar.zzi(th);
                    zzfmcVar.zzh(false);
                    zzfmnVar.zza(zzfmcVar);
                    zzfmnVar.zzi();
                } else {
                    zzfmqVar = this.zze.zzi;
                    zzfmc zzfmcVar2 = this.zzc;
                    zzfmcVar2.zza(zza);
                    zzfmcVar2.zzi(th);
                    zzfmcVar2.zzh(false);
                    zzfmqVar.zzb(zzfmcVar2.zzn());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgfp
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        zzdca zzdcaVar;
        zzfmq zzfmqVar;
        zzfmn zzfmnVar;
        Executor executor;
        final zzepc zzepcVar;
        zzepc zzepcVar2;
        zzepg zzepgVar;
        zzcsf zzcsfVar = (zzcsf) obj;
        synchronized (this.zze) {
            try {
                this.zze.zzl = null;
                viewGroup = this.zze.zzf;
                viewGroup.removeAllViews();
                if (zzcsfVar.zzc() != null) {
                    ViewParent parent = zzcsfVar.zzc().getParent();
                    if (parent instanceof ViewGroup) {
                        String str = "";
                        if (zzcsfVar.zzl() != null) {
                            str = zzcsfVar.zzl().zzg();
                        }
                        com.google.android.gms.ads.internal.util.client.zzm.zzj("Banner view provided from " + str + " already has a parent view. Removing its old parent.");
                        ((ViewGroup) parent).removeView(zzcsfVar.zzc());
                    }
                }
                zzbeg zzbegVar = zzbep.zzik;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbegVar)).booleanValue()) {
                    zzddq zzn = zzcsfVar.zzn();
                    zzepcVar2 = this.zze.zzd;
                    zzn.zza(zzepcVar2);
                    zzepgVar = this.zze.zze;
                    zzn.zzc(zzepgVar);
                }
                viewGroup2 = this.zze.zzf;
                viewGroup2.addView(zzcsfVar.zzc());
                this.zza.zzb(zzcsfVar);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbegVar)).booleanValue()) {
                    zzfdf zzfdfVar = this.zze;
                    executor = zzfdfVar.zzb;
                    zzepcVar = zzfdfVar.zzd;
                    Objects.requireNonNull(zzepcVar);
                    executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfdd
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzepc.this.zzs();
                        }
                    });
                }
                zzdcaVar = this.zze.zzh;
                zzdcaVar.zzd(zzcsfVar.zza());
                if (((Boolean) zzbgd.zzc.zze()).booleanValue() && (zzfmnVar = this.zzb) != null) {
                    zzfmnVar.zzh(zzcsfVar.zzp().zzb);
                    zzfmnVar.zzf(zzcsfVar.zzl().zzg());
                    zzfmc zzfmcVar = this.zzc;
                    zzfmcVar.zzh(true);
                    zzfmnVar.zza(zzfmcVar);
                    zzfmnVar.zzi();
                } else {
                    zzfmqVar = this.zze.zzi;
                    zzfmc zzfmcVar2 = this.zzc;
                    zzfmcVar2.zzb(zzcsfVar.zzp().zzb);
                    zzfmcVar2.zze(zzcsfVar.zzl().zzg());
                    zzfmcVar2.zzh(true);
                    zzfmqVar.zzb(zzfmcVar2.zzn());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
