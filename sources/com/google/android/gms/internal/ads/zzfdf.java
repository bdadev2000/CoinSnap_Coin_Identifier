package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzfdf implements zzeps {
    private final Context zza;
    private final Executor zzb;
    private final zzcjd zzc;
    private final zzepc zzd;
    private final zzepg zze;
    private final ViewGroup zzf;

    @Nullable
    private zzbfk zzg;
    private final zzdca zzh;
    private final zzfmq zzi;
    private final zzdeh zzj;
    private final zzfhm zzk;
    private f4.c zzl;

    public zzfdf(Context context, Executor executor, com.google.android.gms.ads.internal.client.zzq zzqVar, zzcjd zzcjdVar, zzepc zzepcVar, zzepg zzepgVar, zzfhm zzfhmVar, zzdeh zzdehVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzcjdVar;
        this.zzd = zzepcVar;
        this.zze = zzepgVar;
        this.zzk = zzfhmVar;
        this.zzh = zzcjdVar.zzf();
        this.zzi = zzcjdVar.zzz();
        this.zzf = new FrameLayout(context);
        this.zzj = zzdehVar;
        zzfhmVar.zzs(zzqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzeps
    public final boolean zza() {
        f4.c cVar = this.zzl;
        if (cVar != null && !cVar.isDone()) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzeps
    public final boolean zzb(com.google.android.gms.ads.internal.client.zzl zzlVar, String str, @Nullable zzepq zzepqVar, zzepr zzeprVar) throws RemoteException {
        zzctg zzh;
        zzfmn zzfmnVar;
        if (str == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzg("Ad unit ID should not be null for banner ad.");
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfdb
                @Override // java.lang.Runnable
                public final void run() {
                    zzfdf.this.zzm();
                }
            });
            return false;
        }
        if (!zza()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zziU)).booleanValue() && zzlVar.zzf) {
                this.zzc.zzl().zzo(true);
            }
            Bundle zza = zzdun.zza(new Pair(zzdul.PUBLIC_API_CALL.zza(), Long.valueOf(zzlVar.zzz)), new Pair(zzdul.DYNAMITE_ENTER.zza(), Long.valueOf(com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis())));
            zzfhm zzfhmVar = this.zzk;
            zzfhmVar.zzt(str);
            zzfhmVar.zzH(zzlVar);
            zzfhmVar.zzA(zza);
            Context context = this.zza;
            zzfho zzJ = zzfhmVar.zzJ();
            zzfmu zza2 = zzfmm.zza(zzJ);
            zzfmw zzfmwVar = zzfmw.FORMAT_BANNER;
            zzfmc zzb = zzfmb.zzb(context, zza2, zzfmwVar, zzlVar);
            if (((Boolean) zzbgq.zze.zze()).booleanValue() && this.zzk.zzh().zzk) {
                zzepc zzepcVar = this.zzd;
                if (zzepcVar != null) {
                    zzepcVar.zzdB(zzfiq.zzd(7, null, null));
                }
            } else {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzik)).booleanValue()) {
                    zzctf zze = this.zzc.zze();
                    zzcyt zzcytVar = new zzcyt();
                    zzcytVar.zze(this.zza);
                    zzcytVar.zzi(zzJ);
                    zze.zzi(zzcytVar.zzj());
                    zzdfa zzdfaVar = new zzdfa();
                    zzdfaVar.zzj(this.zzd, this.zzb);
                    zzdfaVar.zzk(this.zzd, this.zzb);
                    zze.zzf(zzdfaVar.zzn());
                    zze.zze(new zzenl(this.zzg));
                    zze.zzd(new zzdjy(zzdme.zza, null));
                    zze.zzg(new zzcuh(this.zzh, this.zzj));
                    zze.zzc(new zzcsc(this.zzf));
                    zzh = zze.zzh();
                } else {
                    zzctf zze2 = this.zzc.zze();
                    zzcyt zzcytVar2 = new zzcyt();
                    zzcytVar2.zze(this.zza);
                    zzcytVar2.zzi(zzJ);
                    zze2.zzi(zzcytVar2.zzj());
                    zzdfa zzdfaVar2 = new zzdfa();
                    zzdfaVar2.zzj(this.zzd, this.zzb);
                    zzdfaVar2.zza(this.zzd, this.zzb);
                    zzdfaVar2.zza(this.zze, this.zzb);
                    zzdfaVar2.zzl(this.zzd, this.zzb);
                    zzdfaVar2.zzd(this.zzd, this.zzb);
                    zzdfaVar2.zze(this.zzd, this.zzb);
                    zzdfaVar2.zzf(this.zzd, this.zzb);
                    zzdfaVar2.zzb(this.zzd, this.zzb);
                    zzdfaVar2.zzk(this.zzd, this.zzb);
                    zzdfaVar2.zzi(this.zzd, this.zzb);
                    zze2.zzf(zzdfaVar2.zzn());
                    zze2.zze(new zzenl(this.zzg));
                    zze2.zzd(new zzdjy(zzdme.zza, null));
                    zze2.zzg(new zzcuh(this.zzh, this.zzj));
                    zze2.zzc(new zzcsc(this.zzf));
                    zzh = zze2.zzh();
                }
                zzctg zzctgVar = zzh;
                if (((Boolean) zzbgd.zzc.zze()).booleanValue()) {
                    zzfmn zzj = zzctgVar.zzj();
                    zzj.zzd(zzfmwVar);
                    zzj.zzb(zzlVar.zzp);
                    zzj.zzg(zzlVar.zzm);
                    zzfmnVar = zzj;
                } else {
                    zzfmnVar = null;
                }
                zzcvx zzd = zzctgVar.zzd();
                f4.c zzi = zzd.zzi(zzd.zzj());
                this.zzl = zzi;
                zzgft.zzr(zzi, new zzfde(this, zzeprVar, zzfmnVar, zzb, zzctgVar), this.zzb);
                return true;
            }
        }
        return false;
    }

    public final ViewGroup zzd() {
        return this.zzf;
    }

    public final zzfhm zzi() {
        return this.zzk;
    }

    public final /* synthetic */ void zzm() {
        this.zzd.zzdB(zzfiq.zzd(6, null, null));
    }

    public final void zzn() {
        this.zzh.zzd(this.zzj.zzc());
    }

    public final void zzo(com.google.android.gms.ads.internal.client.zzbe zzbeVar) {
        this.zze.zza(zzbeVar);
    }

    public final void zzp(zzdcb zzdcbVar) {
        this.zzh.zzo(zzdcbVar, this.zzb);
    }

    public final void zzq(zzbfk zzbfkVar) {
        this.zzg = zzbfkVar;
    }

    public final boolean zzr() {
        Object parent = this.zzf.getParent();
        if (!(parent instanceof View)) {
            return false;
        }
        View view = (View) parent;
        com.google.android.gms.ads.internal.zzu.zzp();
        return com.google.android.gms.ads.internal.util.zzt.zzW(view, view.getContext());
    }
}
