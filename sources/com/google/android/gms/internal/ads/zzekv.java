package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes2.dex */
public final class zzekv extends zzeku {
    private final zzcjd zza;
    private final zzcyt zzb;
    private final zzdfc zzc;
    private final zzelf zzd;
    private final zzehq zze;

    public zzekv(zzcjd zzcjdVar, zzcyt zzcytVar, zzdfc zzdfcVar, zzelf zzelfVar, zzehq zzehqVar) {
        this.zza = zzcjdVar;
        this.zzb = zzcytVar;
        this.zzc = zzdfcVar;
        this.zzd = zzelfVar;
        this.zze = zzehqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeku
    public final f4.c zzc(zzfho zzfhoVar, Bundle bundle, zzfgt zzfgtVar, zzfhf zzfhfVar) {
        zzcyt zzcytVar = this.zzb;
        zzcytVar.zzi(zzfhoVar);
        zzcytVar.zzf(bundle);
        zzcytVar.zzg(new zzcyn(zzfhfVar, zzfgtVar, this.zzd));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzdA)).booleanValue()) {
            this.zzb.zzd(this.zze);
        }
        zzcjd zzcjdVar = this.zza;
        zzcyt zzcytVar2 = this.zzb;
        zzcrs zzd = zzcjdVar.zzd();
        zzd.zzd(zzcytVar2.zzj());
        zzd.zzc(this.zzc);
        zzcvx zzb = zzd.zze().zzb();
        return zzb.zzi(zzb.zzj());
    }
}
