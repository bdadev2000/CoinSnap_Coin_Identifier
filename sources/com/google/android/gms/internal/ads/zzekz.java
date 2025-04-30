package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes2.dex */
public final class zzekz extends zzeku {
    private final zzcjd zza;
    private final zzcyt zzb;
    private final zzenl zzc;
    private final zzdfc zzd;
    private final zzelf zze;
    private final zzehq zzf;

    public zzekz(zzcjd zzcjdVar, zzcyt zzcytVar, zzenl zzenlVar, zzdfc zzdfcVar, zzelf zzelfVar, zzehq zzehqVar) {
        this.zza = zzcjdVar;
        this.zzb = zzcytVar;
        this.zzc = zzenlVar;
        this.zzd = zzdfcVar;
        this.zze = zzelfVar;
        this.zzf = zzehqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeku
    public final f4.c zzc(zzfho zzfhoVar, Bundle bundle, zzfgt zzfgtVar, zzfhf zzfhfVar) {
        zzcyt zzcytVar = this.zzb;
        zzcytVar.zzi(zzfhoVar);
        zzcytVar.zzf(bundle);
        zzcytVar.zzg(new zzcyn(zzfhfVar, zzfgtVar, this.zze));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzdA)).booleanValue()) {
            this.zzb.zzd(this.zzf);
        }
        zzcjd zzcjdVar = this.zza;
        zzcyt zzcytVar2 = this.zzb;
        zzdjg zzg = zzcjdVar.zzg();
        zzg.zze(zzcytVar2.zzj());
        zzg.zzd(this.zzd);
        zzg.zzc(this.zzc);
        zzcvx zza = zzg.zzf().zza();
        return zza.zzi(zza.zzj());
    }
}
