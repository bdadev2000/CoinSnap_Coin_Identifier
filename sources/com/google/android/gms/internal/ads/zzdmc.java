package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import x.l;

/* loaded from: classes2.dex */
public final class zzdmc {
    zzbiw zza;
    zzbit zzb;
    zzbjj zzc;
    zzbjg zzd;
    zzboi zze;
    final l zzf = new l();
    final l zzg = new l();

    public final zzdmc zza(zzbit zzbitVar) {
        this.zzb = zzbitVar;
        return this;
    }

    public final zzdmc zzb(zzbiw zzbiwVar) {
        this.zza = zzbiwVar;
        return this;
    }

    public final zzdmc zzc(String str, zzbjc zzbjcVar, @Nullable zzbiz zzbizVar) {
        this.zzf.put(str, zzbjcVar);
        if (zzbizVar != null) {
            this.zzg.put(str, zzbizVar);
        }
        return this;
    }

    public final zzdmc zzd(zzboi zzboiVar) {
        this.zze = zzboiVar;
        return this;
    }

    public final zzdmc zze(zzbjg zzbjgVar) {
        this.zzd = zzbjgVar;
        return this;
    }

    public final zzdmc zzf(zzbjj zzbjjVar) {
        this.zzc = zzbjjVar;
        return this;
    }

    public final zzdme zzg() {
        return new zzdme(this);
    }
}
