package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: classes3.dex */
public final class zzejr extends zzejt {
    private final zzcho zza;
    private final zzdit zzb;
    private final zzcxi zzc;
    private final zzddu zzd;
    private final zzeke zze;
    private final zzegp zzf;

    public zzejr(zzcho zzchoVar, zzdit zzditVar, zzcxi zzcxiVar, zzddu zzdduVar, zzeke zzekeVar, zzegp zzegpVar) {
        this.zza = zzchoVar;
        this.zzb = zzditVar;
        this.zzc = zzcxiVar;
        this.zzd = zzdduVar;
        this.zze = zzekeVar;
        this.zzf = zzegpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzejt
    public final ListenableFuture zzc(zzfhc zzfhcVar, Bundle bundle, zzfgh zzfghVar, zzfgt zzfgtVar) {
        zzcxi zzcxiVar = this.zzc;
        zzcxiVar.zzi(zzfhcVar);
        zzcxiVar.zzf(bundle);
        zzcxiVar.zzg(new zzcxc(zzfgtVar, zzfghVar, this.zze));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzdz)).booleanValue()) {
            this.zzc.zzd(this.zzf);
        }
        zzcho zzchoVar = this.zza;
        zzcxi zzcxiVar2 = this.zzc;
        zzdix zzh = zzchoVar.zzh();
        zzh.zzf(zzcxiVar2.zzj());
        zzh.zze(this.zzd);
        zzh.zzd(this.zzb);
        zzh.zzc(new zzcqo(null));
        zzcum zza = zzh.zzg().zza();
        return zza.zzi(zza.zzj());
    }
}
