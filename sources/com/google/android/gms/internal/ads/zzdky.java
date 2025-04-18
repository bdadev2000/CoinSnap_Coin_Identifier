package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import androidx.collection.SimpleArrayMap;

/* loaded from: classes4.dex */
public final class zzdky {
    zzbhd zza;
    zzbha zzb;
    zzbhq zzc;
    zzbhn zzd;
    zzbmp zze;
    final SimpleArrayMap zzf = new SimpleArrayMap();
    final SimpleArrayMap zzg = new SimpleArrayMap();

    public final zzdky zza(zzbha zzbhaVar) {
        this.zzb = zzbhaVar;
        return this;
    }

    public final zzdky zzb(zzbhd zzbhdVar) {
        this.zza = zzbhdVar;
        return this;
    }

    public final zzdky zzc(String str, zzbhj zzbhjVar, @Nullable zzbhg zzbhgVar) {
        this.zzf.put(str, zzbhjVar);
        if (zzbhgVar != null) {
            this.zzg.put(str, zzbhgVar);
        }
        return this;
    }

    public final zzdky zzd(zzbmp zzbmpVar) {
        this.zze = zzbmpVar;
        return this;
    }

    public final zzdky zze(zzbhn zzbhnVar) {
        this.zzd = zzbhnVar;
        return this;
    }

    public final zzdky zzf(zzbhq zzbhqVar) {
        this.zzc = zzbhqVar;
        return this;
    }

    public final zzdla zzg() {
        return new zzdla(this);
    }
}
