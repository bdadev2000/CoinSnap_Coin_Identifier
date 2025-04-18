package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
public final class zzcsw {
    private final zzdat zza;

    @Nullable
    private final zzdcz zzb;

    public zzcsw(zzdat zzdatVar, @Nullable zzdcz zzdczVar) {
        this.zza = zzdatVar;
        this.zzb = zzdczVar;
    }

    public final zzdat zza() {
        return this.zza;
    }

    @Nullable
    public final zzdcz zzb() {
        return this.zzb;
    }

    public final zzdfs zzc() {
        zzdcz zzdczVar = this.zzb;
        return zzdczVar != null ? new zzdfs(zzdczVar, zzcan.zzf) : new zzdfs(new zzcsv(this), zzcan.zzf);
    }
}
