package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: classes3.dex */
public final class zzeju extends zzejt {
    private final zzcho zza;
    private final zzcxi zzb;
    private final zzddu zzc;
    private final zzeke zzd;
    private final zzegp zze;

    public zzeju(zzcho zzchoVar, zzcxi zzcxiVar, zzddu zzdduVar, zzeke zzekeVar, zzegp zzegpVar) {
        this.zza = zzchoVar;
        this.zzb = zzcxiVar;
        this.zzc = zzdduVar;
        this.zzd = zzekeVar;
        this.zze = zzegpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzejt
    public final ListenableFuture zzc(zzfhc zzfhcVar, Bundle bundle, zzfgh zzfghVar, zzfgt zzfgtVar) {
        zzcxi zzcxiVar = this.zzb;
        zzcxiVar.zzi(zzfhcVar);
        zzcxiVar.zzf(bundle);
        zzcxiVar.zzg(new zzcxc(zzfgtVar, zzfghVar, this.zzd));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzdz)).booleanValue()) {
            this.zzb.zzd(this.zze);
        }
        zzcho zzchoVar = this.zza;
        zzcxi zzcxiVar2 = this.zzb;
        zzcqe zzd = zzchoVar.zzd();
        zzd.zzd(zzcxiVar2.zzj());
        zzd.zzc(this.zzc);
        zzcum zzb = zzd.zze().zzb();
        return zzb.zzi(zzb.zzj());
    }
}
