package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes2.dex */
public final class zzelb extends zzeku {
    private final zzcjd zza;
    private final zzcyt zzb;
    private final zzdfc zzc;
    private final zzelf zzd;
    private final zzfhg zze;
    private final zzehq zzf;

    public zzelb(zzcjd zzcjdVar, zzcyt zzcytVar, zzdfc zzdfcVar, zzfhg zzfhgVar, zzelf zzelfVar, zzehq zzehqVar) {
        this.zza = zzcjdVar;
        this.zzb = zzcytVar;
        this.zzc = zzdfcVar;
        this.zze = zzfhgVar;
        this.zzd = zzelfVar;
        this.zzf = zzehqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeku
    public final f4.c zzc(zzfho zzfhoVar, Bundle bundle, zzfgt zzfgtVar, zzfhf zzfhfVar) {
        zzfhg zzfhgVar;
        zzcyt zzcytVar = this.zzb;
        zzcytVar.zzi(zzfhoVar);
        zzcytVar.zzf(bundle);
        zzcytVar.zzg(new zzcyn(zzfhfVar, zzfgtVar, this.zzd));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzdz)).booleanValue() && (zzfhgVar = this.zze) != null) {
            this.zzb.zzh(zzfhgVar);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzdA)).booleanValue()) {
            this.zzb.zzd(this.zzf);
        }
        zzcjd zzcjdVar = this.zza;
        zzcyt zzcytVar2 = this.zzb;
        zzdrl zzi = zzcjdVar.zzi();
        zzi.zzd(zzcytVar2.zzj());
        zzi.zzc(this.zzc);
        zzcvx zzb = zzi.zze().zzb();
        return zzb.zzi(zzb.zzj());
    }
}
