package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.ViewGroup;
import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
public final class zzekx extends zzeku {
    private final zzcjd zza;
    private final zzcyt zzb;
    private final zzenl zzc;
    private final zzdfc zzd;
    private final zzdjy zze;
    private final zzdca zzf;
    private final ViewGroup zzg;
    private final zzdeh zzh;
    private final zzelf zzi;
    private final zzehq zzj;

    public zzekx(zzcjd zzcjdVar, zzcyt zzcytVar, zzenl zzenlVar, zzdfc zzdfcVar, zzdjy zzdjyVar, zzdca zzdcaVar, @Nullable ViewGroup viewGroup, @Nullable zzdeh zzdehVar, zzelf zzelfVar, zzehq zzehqVar) {
        this.zza = zzcjdVar;
        this.zzb = zzcytVar;
        this.zzc = zzenlVar;
        this.zzd = zzdfcVar;
        this.zze = zzdjyVar;
        this.zzf = zzdcaVar;
        this.zzg = viewGroup;
        this.zzh = zzdehVar;
        this.zzi = zzelfVar;
        this.zzj = zzehqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeku
    public final f4.c zzc(zzfho zzfhoVar, Bundle bundle, zzfgt zzfgtVar, zzfhf zzfhfVar) {
        zzcyt zzcytVar = this.zzb;
        zzcytVar.zzi(zzfhoVar);
        zzcytVar.zzf(bundle);
        zzcytVar.zzg(new zzcyn(zzfhfVar, zzfgtVar, this.zzi));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzdA)).booleanValue()) {
            this.zzb.zzd(this.zzj);
        }
        zzcjd zzcjdVar = this.zza;
        zzcyt zzcytVar2 = this.zzb;
        zzctf zze = zzcjdVar.zze();
        zze.zzi(zzcytVar2.zzj());
        zze.zzf(this.zzd);
        zze.zze(this.zzc);
        zze.zzd(this.zze);
        zze.zzg(new zzcuh(this.zzf, this.zzh));
        zze.zzc(new zzcsc(this.zzg));
        zzcvx zzd = zze.zzk().zzd();
        return zzd.zzi(zzd.zzj());
    }
}
