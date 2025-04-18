package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import r.k;

/* loaded from: classes3.dex */
public final class zzdjh {
    zzbgz zza;
    zzbgw zzb;
    zzbhm zzc;
    zzbhj zzd;
    zzbmk zze;
    final k zzf = new k();
    final k zzg = new k();

    public final zzdjh zza(zzbgw zzbgwVar) {
        this.zzb = zzbgwVar;
        return this;
    }

    public final zzdjh zzb(zzbgz zzbgzVar) {
        this.zza = zzbgzVar;
        return this;
    }

    public final zzdjh zzc(String str, zzbhf zzbhfVar, @Nullable zzbhc zzbhcVar) {
        this.zzf.put(str, zzbhfVar);
        if (zzbhcVar != null) {
            this.zzg.put(str, zzbhcVar);
        }
        return this;
    }

    public final zzdjh zzd(zzbmk zzbmkVar) {
        this.zze = zzbmkVar;
        return this;
    }

    public final zzdjh zze(zzbhj zzbhjVar) {
        this.zzd = zzbhjVar;
        return this;
    }

    public final zzdjh zzf(zzbhm zzbhmVar) {
        this.zzc = zzbhmVar;
        return this;
    }

    public final zzdjj zzg() {
        return new zzdjj(this);
    }
}
