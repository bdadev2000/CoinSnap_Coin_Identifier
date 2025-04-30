package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
public final class zzcuh {
    private final zzdca zza;

    @Nullable
    private final zzdeh zzb;

    public zzcuh(zzdca zzdcaVar, @Nullable zzdeh zzdehVar) {
        this.zza = zzdcaVar;
        this.zzb = zzdehVar;
    }

    public final zzdca zza() {
        return this.zza;
    }

    @Nullable
    public final zzdeh zzb() {
        return this.zzb;
    }

    public final zzdha zzc() {
        zzdeh zzdehVar = this.zzb;
        if (zzdehVar != null) {
            return new zzdha(zzdehVar, zzcci.zzf);
        }
        return new zzdha(new zzcug(this), zzcci.zzf);
    }
}
