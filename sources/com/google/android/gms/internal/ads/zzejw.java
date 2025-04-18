package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: classes3.dex */
public final class zzejw extends zzejt {
    private final zzcho zza;
    private final zzcxi zzb;
    private final zzemk zzc;
    private final zzddu zzd;
    private final zzdit zze;
    private final zzdat zzf;
    private final ViewGroup zzg;
    private final zzdcz zzh;
    private final zzeke zzi;
    private final zzegp zzj;

    public zzejw(zzcho zzchoVar, zzcxi zzcxiVar, zzemk zzemkVar, zzddu zzdduVar, zzdit zzditVar, zzdat zzdatVar, @Nullable ViewGroup viewGroup, @Nullable zzdcz zzdczVar, zzeke zzekeVar, zzegp zzegpVar) {
        this.zza = zzchoVar;
        this.zzb = zzcxiVar;
        this.zzc = zzemkVar;
        this.zzd = zzdduVar;
        this.zze = zzditVar;
        this.zzf = zzdatVar;
        this.zzg = viewGroup;
        this.zzh = zzdczVar;
        this.zzi = zzekeVar;
        this.zzj = zzegpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzejt
    public final ListenableFuture zzc(zzfhc zzfhcVar, Bundle bundle, zzfgh zzfghVar, zzfgt zzfgtVar) {
        zzcxi zzcxiVar = this.zzb;
        zzcxiVar.zzi(zzfhcVar);
        zzcxiVar.zzf(bundle);
        zzcxiVar.zzg(new zzcxc(zzfgtVar, zzfghVar, this.zzi));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzdz)).booleanValue()) {
            this.zzb.zzd(this.zzj);
        }
        zzcho zzchoVar = this.zza;
        zzcxi zzcxiVar2 = this.zzb;
        zzcru zze = zzchoVar.zze();
        zze.zzi(zzcxiVar2.zzj());
        zze.zzf(this.zzd);
        zze.zze(this.zzc);
        zze.zzd(this.zze);
        zze.zzg(new zzcsw(this.zzf, this.zzh));
        zze.zzc(new zzcqo(this.zzg));
        zzcum zzd = zze.zzk().zzd();
        return zzd.zzi(zzd.zzj());
    }
}
