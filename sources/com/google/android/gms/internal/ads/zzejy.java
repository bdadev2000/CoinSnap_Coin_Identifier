package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: classes3.dex */
public final class zzejy extends zzejt {
    private final zzcho zza;
    private final zzcxi zzb;
    private final zzemk zzc;
    private final zzddu zzd;
    private final zzeke zze;
    private final zzegp zzf;

    public zzejy(zzcho zzchoVar, zzcxi zzcxiVar, zzemk zzemkVar, zzddu zzdduVar, zzeke zzekeVar, zzegp zzegpVar) {
        this.zza = zzchoVar;
        this.zzb = zzcxiVar;
        this.zzc = zzemkVar;
        this.zzd = zzdduVar;
        this.zze = zzekeVar;
        this.zzf = zzegpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzejt
    public final ListenableFuture zzc(zzfhc zzfhcVar, Bundle bundle, zzfgh zzfghVar, zzfgt zzfgtVar) {
        zzcxi zzcxiVar = this.zzb;
        zzcxiVar.zzi(zzfhcVar);
        zzcxiVar.zzf(bundle);
        zzcxiVar.zzg(new zzcxc(zzfgtVar, zzfghVar, this.zze));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzdz)).booleanValue()) {
            this.zzb.zzd(this.zzf);
        }
        zzcho zzchoVar = this.zza;
        zzcxi zzcxiVar2 = this.zzb;
        zzdib zzg = zzchoVar.zzg();
        zzg.zze(zzcxiVar2.zzj());
        zzg.zzd(this.zzd);
        zzg.zzc(this.zzc);
        zzcum zza = zzg.zzf().zza();
        return zza.zzi(zza.zzj());
    }
}
