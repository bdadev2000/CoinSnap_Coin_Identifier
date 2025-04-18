package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.ViewGroup;
import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public final class zzein extends zzeik {
    private final zzchk zza;
    private final zzcvu zzb;
    private final zzelb zzc;
    private final zzdcf zzd;
    private final zzdhe zze;
    private final zzcze zzf;
    private final ViewGroup zzg;
    private final zzdbk zzh;
    private final zzeiv zzi;
    private final zzefg zzj;

    public zzein(zzchk zzchkVar, zzcvu zzcvuVar, zzelb zzelbVar, zzdcf zzdcfVar, zzdhe zzdheVar, zzcze zzczeVar, @Nullable ViewGroup viewGroup, @Nullable zzdbk zzdbkVar, zzeiv zzeivVar, zzefg zzefgVar) {
        this.zza = zzchkVar;
        this.zzb = zzcvuVar;
        this.zzc = zzelbVar;
        this.zzd = zzdcfVar;
        this.zze = zzdheVar;
        this.zzf = zzczeVar;
        this.zzg = viewGroup;
        this.zzh = zzdbkVar;
        this.zzi = zzeivVar;
        this.zzj = zzefgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeik
    public final ua.b zzc(zzffo zzffoVar, Bundle bundle, zzfet zzfetVar, zzfff zzfffVar) {
        zzcvu zzcvuVar = this.zzb;
        zzcvuVar.zzi(zzffoVar);
        zzcvuVar.zzf(bundle);
        zzcvuVar.zzg(new zzcvo(zzfffVar, zzfetVar, this.zzi));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzdG)).booleanValue()) {
            this.zzb.zzd(this.zzj);
        }
        zzchk zzchkVar = this.zza;
        zzcvu zzcvuVar2 = this.zzb;
        zzcqg zze = zzchkVar.zze();
        zze.zzi(zzcvuVar2.zzj());
        zze.zzf(this.zzd);
        zze.zze(this.zzc);
        zze.zzd(this.zze);
        zze.zzg(new zzcri(this.zzf, this.zzh));
        zze.zzc(new zzcpa(this.zzg));
        zzcsy zzd = zze.zzk().zzd();
        return zzd.zzi(zzd.zzj());
    }
}
