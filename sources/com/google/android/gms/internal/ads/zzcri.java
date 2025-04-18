package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public final class zzcri {
    private final zzcze zza;

    @Nullable
    private final zzdbk zzb;

    public zzcri(zzcze zzczeVar, @Nullable zzdbk zzdbkVar) {
        this.zza = zzczeVar;
        this.zzb = zzdbkVar;
    }

    public final zzcze zza() {
        return this.zza;
    }

    @Nullable
    public final zzdbk zzb() {
        return this.zzb;
    }

    public final zzded zzc() {
        zzdbk zzdbkVar = this.zzb;
        if (zzdbkVar != null) {
            return new zzded(zzdbkVar, zzcaj.zzf);
        }
        return new zzded(new zzcrh(this), zzcaj.zzf);
    }
}
